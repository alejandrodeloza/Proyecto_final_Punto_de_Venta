/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistema_punto_de_venta;
import java.util.*;//Paquete con las clases de uso común (ArrayList)


public class Sistema_Punto_de_Venta {
    //Arraylist con todos los datos del sistema
    ArrayList <Usuario> usuarios = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    
    //Método para registrar usuario nuevo
    public void registrarUsuario(String nombre, String correo, String telefono, String contraseña, String ImagenPerfil){
        //Registro de clientes
        //Variables locales
        String Idtemp;
        
    usuarios.add(new Cliente("efef","s","w","s","",""));   
        
    }//Fin del método registro
}
