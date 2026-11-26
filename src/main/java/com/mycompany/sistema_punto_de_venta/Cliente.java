/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_punto_de_venta;

import java.util.*;


public class Cliente extends Usuario {
    //Atributos propios de cliente
    private ArrayList <String> direcciones = new ArrayList<>();
    private Carrito carrito = new Carrito();
    
    //Constructor con atributos de la clase usuario
    public Cliente(String id, String correo, String nombre, String telefono, String contraseña, String ImagenPerfil) {
        super(id, correo, nombre, telefono, contraseña, ImagenPerfil);
    }
    //Constructor vacio
    
    //Métodos getter
    public ArrayList<String> getDirecciones() {
        return direcciones;
    }
    public Carrito getCarrito() {
        return carrito;
    }
    
    
    //Métodos setter
    public void setDirecciones(ArrayList<String> direcciones) {
        this.direcciones = direcciones;
    }
    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }
    
    //Método para agregar producto al carrito
      public boolean agregarProductoCarrito(Producto p, int cantidad) {
        if (p == null || cantidad <= 0) 
            return false;

        int enCarrito = carrito.contarCantidadProducto(p.getIdProducto());
        if (enCarrito + cantidad <= p.getStock()) {
            carrito.agregarProducto(p, cantidad);
            return true;
        }
        return false; // No alcanza el stock
    }
    //Método para comprar carrito
     public boolean comprarCarrito() {
        if (carrito.getProductosCarrito().isEmpty()) {
            return false;
        }
        // Descontar stock de cada producto comprado
        for (Producto p : carrito.getProductosCarrito()) {
            p.reducirStock(1);
        }
        carrito.vaciarCarrito();
        return true;
    }
    //Método para agregar dirección
    public void agregarDireccion(String direccion) {
        if (direccion != null && !direccion.trim().isEmpty()) {
            direcciones.add(direccion);
        }
    }
}
