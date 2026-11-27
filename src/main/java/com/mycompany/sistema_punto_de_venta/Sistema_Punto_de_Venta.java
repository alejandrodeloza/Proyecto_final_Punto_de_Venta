/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.sistema_punto_de_venta;

import java.util.*; // Paquete con las clases de uso común (ArrayList)
import java.util.regex.*; // Paquete para usar toda la clase Regex

public class Sistema_Punto_de_Venta {

    // ArrayList con todos los datos del sistema
    static ArrayList<Usuario> usuarios = new ArrayList<>();
    static ArrayList<Producto> productos = new ArrayList<>();
    static ArrayList<Pedido> pedidos = new ArrayList<>();
    static ArrayList<Carrito> carritos = new ArrayList<>();
    static Cliente clienteActual;
    static Admin adminActual;

    public static void main(String[] args) {
        GestorCSV.cargarTodo();
        GestorCSV.guardarTodo();
        new VentanaPrincipal().setVisible(true);
    }

    // Método para registrar usuario nuevo
    public static void registrarUsuario(String correo, String nombre, String telefono, String contraseña, String ImagenPerfil, boolean Admin) {
        // Variables locales
        String Idtemp; // ID completo
        int Idnum; // Parte numérica del ID

        // Generar ID
        if (usuarios.isEmpty()) {
            // Si es el primer usuario se toma un cero
            Idnum = 0;
        } else {
            // Tomamos el último ID  
            Idtemp = usuarios.getLast().getId();
            Idtemp = Idtemp.substring(1);
            // Tomamos la parte numérica a un int
            Idnum = Integer.parseInt(Idtemp);
            Idnum++;
        }

        // Registro de admins
        if (Admin) {
            Idtemp = "A" + Integer.toString(Idnum);
            usuarios.add(new Admin(Idtemp, correo, nombre, telefono, contraseña, ImagenPerfil));
        } // Registro de clientes
        else {
            Idtemp = "C" + Integer.toString(Idnum);
            usuarios.add(new Cliente(Idtemp, correo, nombre, telefono, contraseña, ImagenPerfil));
        }
        // Aquí hay que cargar el csv
    } // Fin del método registro

    // Método para iniciar sesión 
    public static boolean iniciarSesion(String correo, String contraseña) {
        // Buscar usuario
        for (Usuario u : usuarios) {
            if (u.getCorreo().equals(correo) && u.getContraseña().equals(contraseña)) {
                if (u instanceof Cliente) {
                    // Guarda el objeto usuario en el cliente actual
                    clienteActual = (Cliente) u;
                    adminActual = null;
                    return true;
                } else {
                    adminActual = (Admin) u;
                    clienteActual = null;
                    return true;
                }
            }
        }
        // No hay coincidencias regresa false
        return false;
    } // Fin del método inicio de sesión

    // Método para buscar y devolver el usuario por su correo
    public static Usuario buscarUsuario(String correo) {
        for (Usuario u : usuarios) {
            if (u.getCorreo().equals(correo)) {
                return u;
            }
        }
        return null;
    } // Fin del método buscarUsuario

    // Método para verificar inicio de sesión (se usa int para las tres posibilidades)
    public static int verificarSesion() {
        if (Sistema_Punto_de_Venta.clienteActual != null) {
            // Cliente ya inició
            return 1;
        } else if (Sistema_Punto_de_Venta.adminActual != null) {
            // Admin inició
            return 2;
        } else {
            // No hay inicio
            return 3;
        }
    }

    // Método para validar nombre
    public static boolean nombreValido(String nombre) {
        String regex = "^(?=.*\\p{L})[\\p{L}\\p{M} ]+$";
        return Pattern.matches(regex, nombre);
    }

    // Métodos para validar correo
    public static boolean correoValido(String correo) {
        if (correo == null) {
            return false;
        }
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return Pattern.matches(regex, correo);
    }

    public boolean correoUnico(String correo) {
        for (Usuario u : usuarios) {
            if (u.getCorreo().equals(correo)) { // Correo ya registrado
                return false;
            }
        }
        return true;
    }

    // Método para validar teléfono
    public static boolean telefonoValido(String telefono) {
        String regex = "^[0-9]{10}$";
        return Pattern.matches(regex, telefono);
    }

    public boolean telefonoUnico(String telefono) {
        for (Usuario u : usuarios) {
            if (u.getTelefono().equals(telefono)) { // Teléfono ya registrado
                return false;
            }
        }
        return true;
    }

    // Método para validar contraseña
    public static boolean contrasenaValida(String contraseña) {
        // Validación de contraseña: al menos 8 caracteres, una mayúscula, una minúscula, un número y un carácter especial
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%#*?&.])[A-Za-z\\d@$!%*?&.]{8,}$";
        return Pattern.matches(regex, contraseña);
    }

    // Método para nuevo pedido
    public static void registrarPedido(String Idcliente, String fecha, String metodo, double total) {
        // Variables locales
        String Idtemp; // ID completo
        int Idnum; // Parte numérica del ID

        // Generar ID
        if (pedidos.isEmpty()) {
            // Si es el primer usuario se toma un cero
            Idnum = 0;
        } else {
            // Tomamos el último ID  
            Idtemp = pedidos.getLast().getIdPedido();
            Idtemp = Idtemp.substring(1);
            // Tomamos la parte numérica a un int
            Idnum = Integer.parseInt(Idtemp);
            Idnum++;
        }

        Idtemp = "E" + Integer.toString(Idnum);
        pedidos.add(new Pedido(Idtemp, Idcliente, fecha, metodo, total));
    }
}
