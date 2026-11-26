/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_punto_de_venta;

import java.util.ArrayList;


public class Admin extends Usuario {
    //Constructor con atributos de la clase usuario
    public Admin(String id, String correo, String nombre, String telefono, String contraseña, String ImagenPerfil) {
        super(id, correo, nombre, telefono, contraseña, ImagenPerfil);
    }
    
    //Método para agregar un producto
    public boolean darDeAltaProducto( ArrayList <Producto> productos, String nombre, String descripcion, double precio, int stock, String ImagenProduc){
        //Variables locales
        String Idtemp;//ID completo
        int Idnum;//Parte numerica del ID
        
        //Validar que el registro sea correcto
        if (productos == null || nombre == null || nombre.trim().isEmpty() || precio < 0 || stock < 0) {
            return false; // Validación básica de datos
        }
        //Generar ID
        if(productos.isEmpty()){
            //Si es el primer producto se toma un cero
            Idnum=0;
        }
        else{
            //Tomamos el ultimo ID
            Idtemp = productos.getLast().getIdProducto();
            Idtemp = Idtemp.substring(1);
            //Tomamos la parte numerica a un int
            Idnum = Integer.parseInt(Idtemp);
            Idnum++;
        }
   
        //Hacemos el Id
            Idtemp = "P" + Integer.toString(Idnum);
            //Creamos la instancia
            productos.add(new Producto(Idtemp, nombre, descripcion, precio, stock, ImagenProduc));
            return true;
    }
    
    //Método para eliminar producto
    public boolean darDeBajaProducto(ArrayList <Producto> productos, String IDproduc){
        //Buscar el producto elegido
        for(Producto p : productos){
            //Si existe hace que su stock sea cero
            if(p.getIdProducto().equals(IDproduc)){
                p.setStock(0);
                //Producto eliminado
                return true;
            }
        }
        //No se pudo eliminar
        return false;
    }
}
