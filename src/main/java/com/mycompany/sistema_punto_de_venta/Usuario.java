/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_punto_de_venta;


public class Usuario {
    //Atributos
    String id;//Tambien sirve para identificar si es admin o cliente, formato:[U001] o [A001]
    String correo;
    String nombre;
    String telefono;
    String contraseña;
    String ImagenPerfil;
    
    //Constructor con todos los atributos
    public Usuario(String id, String correo, String nombre, String telefono, String contraseña, String ImagenPerfil) {
        this.id = id;
        this.correo = correo;
        this.nombre = nombre;
        this.telefono = telefono;
        this.contraseña = contraseña;
        this.ImagenPerfil = ImagenPerfil;
    }
    
    //Métodos getter
    public String getId() {
        return id;
    }
    public String getCorreo() {
        return correo;
    }
    public String getNombre() {
        return nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getContraseña() {
        return contraseña;
    }
    public String getImagenPerfil() {
        return ImagenPerfil;
    }
    
    
    //Métodos setter
    public void setId(String id) {
        this.id = id;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public void setImagenPerfil(String ImagenPerfil) {
        this.ImagenPerfil = ImagenPerfil;
    }
    
}
