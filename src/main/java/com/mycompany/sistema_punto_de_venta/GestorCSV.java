package com.mycompany.sistema_punto_de_venta;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

/**
 * Guarda y carga en archivos CSV los cuatro ArrayList de Sistema_Punto_de_Venta:
 * usuarios, productos, pedidos y carritos.
 *
 * Los archivos se crean en la carpeta "datos" (relativa a la carpeta del proyecto):
 *   datos/usuarios.csv
 *   datos/productos.csv
 *   datos/pedidos.csv
 *   datos/carritos.csv
 *
 * Orden de carga importante: productos -> usuarios -> pedidos -> carritos
 * (pedidos y carritos hacen referencia a productos y clientes por su ID).
 */
public class GestorCSV {

    private static final Path CARPETA = Paths.get("datos");
    private static final Path F_USUARIOS = CARPETA.resolve("usuarios.csv");
    private static final Path F_PRODUCTOS = CARPETA.resolve("productos.csv");
    private static final Path F_PEDIDOS = CARPETA.resolve("pedidos.csv");
    private static final Path F_CARRITOS = CARPETA.resolve("carritos.csv");

    // Separador para listas dentro de un mismo campo (direcciones, productos...)
    private static final String SEP_LISTA = "|";

    // =====================================================================
    //  MÉTODOS PÚBLICOS GENERALES
    // =====================================================================
    public static void guardarTodo() {
        guardarProductos();
        guardarUsuarios();
        guardarPedidos();
        guardarCarritos();
    }

    public static void cargarTodo() {
        cargarProductos();
        cargarUsuarios();
        cargarPedidos();
        cargarCarritos();
    }

    // =====================================================================
    //  USUARIOS  (clientes y admins)
    //  tipo,id,correo,nombre,telefono,contraseña,imagenPerfil,direcciones
    // =====================================================================
    public static void guardarUsuarios() {
        List<String> lineas = new ArrayList<>();
        for (Usuario u : Sistema_Punto_de_Venta.usuarios) {
            String tipo = (u instanceof Admin) ? "ADMIN" : "CLIENTE";
            String direcciones = "";
            if (u instanceof Cliente c) {
                StringJoiner sj = new StringJoiner(SEP_LISTA);
                for (String d : c.getDirecciones()) {
                    sj.add(d.replace(SEP_LISTA, "/"));
                }
                direcciones = sj.toString();
            }
            lineas.add(fila(tipo, u.getId(), u.getCorreo(), u.getNombre(), u.getTelefono(),
                    u.getContraseña(), u.getImagenPerfil(), direcciones));
        }
        escribir(F_USUARIOS, "tipo,id,correo,nombre,telefono,contraseña,imagenPerfil,direcciones", lineas);
    }

    public static void cargarUsuarios() {
        if (!Files.exists(F_USUARIOS)) {
            return; // Primera ejecución: se conservan los datos de prueba
        }
        Sistema_Punto_de_Venta.usuarios.clear();
        for (List<String> f : leer(F_USUARIOS)) {
            if (f.size() < 7) {
                continue; // Fila incompleta
            }
            String id = f.get(1), correo = f.get(2), nombre = f.get(3);
            String telefono = f.get(4), contra = f.get(5), imagen = f.get(6);

            if (f.get(0).equals("ADMIN")) {
                Sistema_Punto_de_Venta.usuarios.add(new Admin(id, correo, nombre, telefono, contra, imagen));
            } else {
                Cliente c = new Cliente(id, correo, nombre, telefono, contra, imagen);
                if (f.size() > 7 && !f.get(7).isEmpty()) {
                    for (String d : f.get(7).split("\\|")) {
                        c.agregarDireccion(d);
                    }
                }
                Sistema_Punto_de_Venta.usuarios.add(c);
            }
        }
    }

    // =====================================================================
    //  PRODUCTOS
    //  id,nombre,descripcion,precio,stock,imagen,especificaciones
    // =====================================================================
    public static void guardarProductos() {
        List<String> lineas = new ArrayList<>();
        for (Producto p : Sistema_Punto_de_Venta.productos) {
            StringJoiner specs = new StringJoiner(SEP_LISTA);
            for (String e : p.getEspecificaciones()) {
                specs.add(e.replace(SEP_LISTA, "/"));
            }
            lineas.add(fila(p.getIdProducto(), p.getNombre(), p.getDescripcion(),
                    String.valueOf(p.getPrecio()), String.valueOf(p.getStock()),
                    p.getImagen(), specs.toString()));
        }
        escribir(F_PRODUCTOS, "id,nombre,descripcion,precio,stock,imagen,especificaciones", lineas);
    }

    public static void cargarProductos() {
        if (!Files.exists(F_PRODUCTOS)) {
            return;
        }
        Sistema_Punto_de_Venta.productos.clear();
        for (List<String> f : leer(F_PRODUCTOS)) {
            if (f.size() < 6) {
                continue;
            }
            try {
                Producto p = new Producto(f.get(0), f.get(1), f.get(2),
                        Double.parseDouble(f.get(3)), Integer.parseInt(f.get(4)), f.get(5));
                if (f.size() > 6 && !f.get(6).isEmpty()) {
                    ArrayList<String> specs = new ArrayList<>();
                    for (String e : f.get(6).split("\\|")) {
                        specs.add(e);
                    }
                    p.setEspecificaciones(specs);
                }
                Sistema_Punto_de_Venta.productos.add(p);
            } catch (NumberFormatException ex) {
                System.err.println("Producto ignorado (precio o stock inválido): " + f.get(0));
            }
        }
    }

    // =====================================================================
    //  PEDIDOS
    //  idPedido,idCliente,fecha,metodoPago,total,estado,productos
    //  "productos" tiene el formato  idProducto:cantidad|idProducto:cantidad
    //  Requiere que Pedido tenga getEstadoActual()/setEstadoActual(int)
    // =====================================================================
    public static void guardarPedidos() {
        List<String> lineas = new ArrayList<>();
        for (Pedido p : Sistema_Punto_de_Venta.pedidos) {
            lineas.add(fila(p.getIdPedido(), p.getIdCliente(), p.getFecha(),
                    p.getMetodo_de_pago(), String.valueOf(p.getTotal_de_pago()),
                    String.valueOf(p.getEstadoActual()),
                    serializarProductos(p.getProductosComprados())));
        }
        escribir(F_PEDIDOS, "idPedido,idCliente,fecha,metodoPago,total,estado,productos", lineas);
    }

    public static void cargarPedidos() {
        if (!Files.exists(F_PEDIDOS)) {
            return;
        }
        Sistema_Punto_de_Venta.pedidos.clear();
        for (List<String> f : leer(F_PEDIDOS)) {
            if (f.size() < 6) {
                continue;
            }
            try {
                Pedido p = new Pedido(f.get(0), f.get(1), f.get(2), f.get(3), Double.parseDouble(f.get(4)));
                p.setEstadoActual(Integer.parseInt(f.get(5)));
                if (f.size() > 6) {
                    p.setProductosComprados(deserializarProductos(f.get(6)));
                }
                Sistema_Punto_de_Venta.pedidos.add(p);
            } catch (NumberFormatException ex) {
                System.err.println("Pedido ignorado (datos numéricos inválidos): " + f.get(0));
            }
        }
    }

    // =====================================================================
    //  CARRITOS
    //  idCliente,productos      (productos con formato idProducto:cantidad|...)
    //  El carrito vive dentro de cada Cliente; aquí se guarda uno por cliente
    //  y al cargar se asigna al cliente y también se agrega a la lista "carritos".
    // =====================================================================
    public static void guardarCarritos() {
        List<String> lineas = new ArrayList<>();
        for (Usuario u : Sistema_Punto_de_Venta.usuarios) {
            if (u instanceof Cliente c && !c.getCarrito().getProductosCarrito().isEmpty()) {
                lineas.add(fila(c.getId(), serializarProductos(c.getCarrito().getProductosCarrito())));
            }
        }
        escribir(F_CARRITOS, "idCliente,productos", lineas);
    }

    public static void cargarCarritos() {
        if (!Files.exists(F_CARRITOS)) {
            return;
        }
        Sistema_Punto_de_Venta.carritos.clear();
        for (List<String> f : leer(F_CARRITOS)) {
            if (f.size() < 2) {
                continue;
            }
            Usuario u = buscarUsuarioPorId(f.get(0));
            if (u instanceof Cliente c) {
                Carrito carrito = new Carrito();
                carrito.setProductosCarrito(deserializarProductos(f.get(1)));
                carrito.calcularTotal();
                c.setCarrito(carrito);
                Sistema_Punto_de_Venta.carritos.add(carrito);
            }
        }
    }

    // =====================================================================
    //  AUXILIARES: búsqueda y (de)serialización de listas de productos
    // =====================================================================
    private static Usuario buscarUsuarioPorId(String id) {
        for (Usuario u : Sistema_Punto_de_Venta.usuarios) {
            if (u.getId().equals(id)) {
                return u;
            }
        }
        return null;
    }

    private static Producto buscarProductoPorId(String id) {
        for (Producto p : Sistema_Punto_de_Venta.productos) {
            if (p.getIdProducto().equals(id)) {
                return p;
            }
        }
        return null;
    }

    // [P0, P0, P1] -> "P0:2|P1:1"
    private static String serializarProductos(List<Producto> lista) {
        Map<String, Integer> cantidades = new LinkedHashMap<>();
        for (Producto p : lista) {
            cantidades.merge(p.getIdProducto(), 1, Integer::sum);
        }
        StringJoiner sj = new StringJoiner(SEP_LISTA);
        cantidades.forEach((id, n) -> sj.add(id + ":" + n));
        return sj.toString();
    }

    // "P0:2|P1:1" -> [P0, P0, P1]  (usa los objetos Producto de la lista general)
    private static ArrayList<Producto> deserializarProductos(String texto) {
        ArrayList<Producto> lista = new ArrayList<>();
        if (texto == null || texto.isEmpty()) {
            return lista;
        }
        for (String item : texto.split("\\|")) {
            String[] partes = item.split(":");
            if (partes.length != 2) {
                continue;
            }
            Producto p = buscarProductoPorId(partes[0]);
            if (p == null) {
                continue; // El producto ya no existe
            }
            try {
                int cantidad = Integer.parseInt(partes[1]);
                for (int i = 0; i < cantidad; i++) {
                    lista.add(p);
                }
            } catch (NumberFormatException ex) {
                // Cantidad inválida: se omite
            }
        }
        return lista;
    }

    // =====================================================================
    //  AUXILIARES CSV: escapar, escribir y leer
    // =====================================================================
    // Si el campo tiene coma, comillas o salto de línea, se encierra entre comillas
    private static String escapar(String s) {
        if (s == null) {
            return "";
        }
        if (s.contains(",") || s.contains("\"") || s.contains("\n") || s.contains("\r")) {
            return "\"" + s.replace("\"", "\"\"") + "\"";
        }
        return s;
    }

    private static String fila(String... campos) {
        StringJoiner sj = new StringJoiner(",");
        for (String c : campos) {
            sj.add(escapar(c));
        }
        return sj.toString();
    }

    private static void escribir(Path ruta, String encabezado, List<String> lineas) {
        try {
            Files.createDirectories(CARPETA);
            List<String> todo = new ArrayList<>();
            todo.add("\uFEFF" + encabezado); // BOM para que Excel muestre bien ñ y acentos
            todo.addAll(lineas);
            Files.write(ruta, todo, StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.err.println("No se pudo guardar " + ruta + ": " + e.getMessage());
        }
    }

    // Devuelve las filas del CSV (sin el encabezado), cada fila como lista de campos
    private static List<List<String>> leer(Path ruta) {
        List<List<String>> filas = new ArrayList<>();
        if (!Files.exists(ruta)) {
            return filas;
        }
        try {
            String t = Files.readString(ruta, StandardCharsets.UTF_8);
            if (!t.isEmpty() && t.charAt(0) == '\uFEFF') {
                t = t.substring(1);
            }
            List<String> fila = new ArrayList<>();
            StringBuilder campo = new StringBuilder();
            boolean entreComillas = false;

            for (int i = 0; i < t.length(); i++) {
                char c = t.charAt(i);
                if (entreComillas) {
                    if (c == '"') {
                        if (i + 1 < t.length() && t.charAt(i + 1) == '"') {
                            campo.append('"'); // Comilla escapada ""
                            i++;
                        } else {
                            entreComillas = false;
                        }
                    } else {
                        campo.append(c);
                    }
                } else if (c == '"') {
                    entreComillas = true;
                } else if (c == ',') {
                    fila.add(campo.toString());
                    campo.setLength(0);
                } else if (c == '\n' || c == '\r') {
                    if (c == '\r' && i + 1 < t.length() && t.charAt(i + 1) == '\n') {
                        i++;
                    }
                    fila.add(campo.toString());
                    campo.setLength(0);
                    if (!(fila.size() == 1 && fila.get(0).isEmpty())) { // Ignora líneas vacías
                        filas.add(fila);
                    }
                    fila = new ArrayList<>();
                } else {
                    campo.append(c);
                }
            }
            if (campo.length() > 0 || !fila.isEmpty()) { // Última fila sin salto de línea
                fila.add(campo.toString());
                filas.add(fila);
            }
        } catch (IOException e) {
            System.err.println("No se pudo leer " + ruta + ": " + e.getMessage());
        }
        if (!filas.isEmpty()) {
            filas.remove(0); // Quita el encabezado
        }
        return filas;
    }
}