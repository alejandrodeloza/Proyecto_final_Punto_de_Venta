/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_punto_de_venta;

import java.util.*;


public class Carrito {
    //Atributos
    private ArrayList <Producto> productosCarrito = new ArrayList<>();
    private double total;
    
    //Constructor Vacio
    public Carrito() {    
    }

    //Constructor con parametros
    public Carrito(double total, ArrayList <Producto> productosCarrito) {
        this.total = total;
        this.productosCarrito = productosCarrito;
    }
    
    //Métodos getter
    public ArrayList<Producto> getProductosCarrito() {
        return productosCarrito;
    }
    public double getTotal() {
        return total;
    }
    
    //Métodos setter
    public void setProductosCarrito(ArrayList<Producto> productosCarrito) {
        this.productosCarrito = productosCarrito;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    
    public void agregarProducto(Producto p, int cantidad) {
        if (p != null && cantidad > 0) {
            for (int i = 0; i < cantidad; i++) {
                productosCarrito.add(p);
            }
            calcularTotal();
        }
    }

    public boolean eliminarProducto(String idProducto) {
        boolean eliminado = productosCarrito.removeIf(p -> p.getIdProducto().equals(idProducto));
        if (eliminado) {
            calcularTotal();
        }
        return eliminado;
    }

    // Quitar una sola unidad para el botón "-" en VentanaCarrito)
    public void reducirUnidad(String idProducto) {
        for (int i = 0; i < productosCarrito.size(); i++) {
            if (productosCarrito.get(i).getIdProducto().equals(idProducto)) {
                productosCarrito.remove(i);
                break;
            }
        }
        calcularTotal();
    }
    
    // Añadir una sola unidad para el botón "+" en VentanaCarrito
    public boolean aumentarUnidad(String idProducto) {
        Producto productoEncontrado = null;
        int cantidadActual = 0;

        //Buscamos el producto y contamos cuántas unidades ya están en el carrito
        for (Producto p : productosCarrito) {
            if (p.getIdProducto().equals(idProducto)) {
                productoEncontrado = p;
                cantidadActual++;
            }
        }

        //Validamos que exista y que haya stock suficiente para sumar 1 más
        if (productoEncontrado != null && cantidadActual < productoEncontrado.getStock()) {
            productosCarrito.add(productoEncontrado); // <-- Aquí va el objeto encontrado
            calcularTotal();
            return true;
        }

        return false; // No se pudo aumentar (sin stock suficiente o no encontrado)
    }


    public double calcularTotal() {
        double suma = 0.0;
        for (Producto p : productosCarrito) {
            suma += p.getPrecio();
        }
        this.total = suma;
        return this.total;
    }

    public void vaciarCarrito() {
        productosCarrito.clear();
        this.total = 0.0;
    }

    // Cuenta cuántas unidades de un mismo producto hay en el carrito
    public int contarCantidadProducto(String idProducto) {
        int contador = 0;
        for (Producto p : productosCarrito) {
            if (p.getIdProducto().equals(idProducto)) {
                contador++;
            }
        }
        return contador;
    }

}
