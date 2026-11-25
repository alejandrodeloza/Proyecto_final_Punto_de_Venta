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
    
    
}
