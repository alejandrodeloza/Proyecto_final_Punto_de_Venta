/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_punto_de_venta;


public class Cliente extends Usuario {
    //Atributos propios de cliente
    String direcciones[];
    
    //Constructor con atributos de la clase usuario
    public Cliente(String id, String correo, String nombre, String telefono, String contraseña, String ImagenPerfil) {
        super(id, correo, nombre, telefono, contraseña, ImagenPerfil);
    }
    
    //Métodos getter
    public String[] getDirecciones() {
        return direcciones;
    }
    
    //Métodos setter
    public void setDirecciones(String[] direcciones) {
        this.direcciones = direcciones;
    }
    
}
