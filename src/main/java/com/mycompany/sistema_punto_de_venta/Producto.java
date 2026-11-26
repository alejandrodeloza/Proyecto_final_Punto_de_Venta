/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_punto_de_venta;

import java.util.*;


public class Producto {
    //Atributos
    private String idProducto; //formato: [P***];
    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;
    private ArrayList <String> especificaciones = new ArrayList<>();
    private String imagen;
    
    //Constructor
    public Producto(String idProducto, String nombre, String descripcion, double precio, int stock, String imagen) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.imagen = imagen;
    }
    
    //Métodos getter
    public String getIdProducto() {
        return idProducto;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public double getPrecio() {
        return precio;
    }
    public int getStock() {
        return stock;
    }
    public ArrayList<String> getEspecificaciones() {
        return especificaciones;
    }
    public String getImagen() {
        return imagen;
    }
    
    //Métodos setter
    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public void setEspecificaciones(ArrayList<String> especificaciones) {
        this.especificaciones = especificaciones;
    }
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    //Método para reducir el stock(el parametro es el numero que se reduce)
    public void reducirStock(int cantidad){
        stock -= cantidad;
    }
    
    //Método para aumentar el stock(el parametro es el numero que se aumenta)
    public void aumentarStock(int cantidad){
        stock += cantidad;
    }
}
