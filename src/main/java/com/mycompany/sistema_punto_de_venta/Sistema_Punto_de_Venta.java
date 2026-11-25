/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistema_punto_de_venta;
import java.util.*;//Paquete con las clases de uso común (ArrayList)
import java.util.regex.*;//Paquete para usar toda la clase Regex


public class Sistema_Punto_de_Venta {
    //Arraylist con todos los datos del sistema
    ArrayList <Usuario> usuarios = new ArrayList<>();
    ArrayList <Producto> productos = new ArrayList<>();
    ArrayList <Pedido> pedidos = new ArrayList<>();
    ArrayList <Carrito> carritos = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    
    //Métodos de validación de datos
    //Método para registrar usuario nuevo
    public void registrarUsuario(String correo, String nombre, String telefono, String contraseña, String ImagenPerfil, boolean Admin){
        //Variables locales
        String Idtemp;//ID completo
        int Idnum;//Parte numerica del ID
        
        //Generar ID
        if(usuarios.isEmpty()){
            //Si es el primer usuario se toma un cero
            Idnum=0;
        }
        else{
            //Tomamos el ultimo ID  
            Idtemp = usuarios.getLast().getId();
            Idtemp = Idtemp.substring(1);
            //Tomamos la parte numerica a un int
            Idnum = Integer.parseInt(Idtemp);
            Idnum++;
        }
        
        //Registro de admins
        if(Admin){
            //Hacemos el Id
            Idtemp = "A" + Integer.toString(Idnum);
            //Creamos la instancia
            usuarios.add(new Admin(Idtemp, correo, nombre, telefono, contraseña, ImagenPerfil));
        }
        //Registro de clientes
        else{
            //Hacemos el Id
            Idtemp = "C" + Integer.toString(Idnum);
            //Creamos la instancia
            usuarios.add(new Cliente(Idtemp, correo, nombre, telefono, contraseña, ImagenPerfil));   
        }
        
    }//Fin del método registro
    
    //Método para iniciar sesión 
    public boolean iniciarSesion(String correo, String contraseña){
        //Buscar usuario
        for (Usuario u : usuarios){
            if(u.getCorreo().equals(correo) && u.getContraseña().equals(contraseña))
                //Si hay coincidencias regresa un true
                return true;
        }
        //No hay coincidencias regresa false
        return false;
    }//Fin del método inicio de sesión
    
    //Método para validar nombre
    public static boolean nombreValido(String nombre) {
        //Reglas
        String regex = "^(?=.*\\p{L})[\\p{L}\\p{M} ]+$";
        //Compararación
        return Pattern.matches(regex, nombre);
    }
    
    //Métodos para validar correo
    public static boolean correoValido(String correo) {
        //Revisar que no este vacio
        if (correo == null) {
            return false;
        }
        //Reglas
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        //Compararación
        return Pattern.matches(regex, correo);
    }
    public boolean correoUnico(String correo){
        //Buscar coincidencias
        for(Usuario u : usuarios){
            if(u.getCorreo().equals(correo))
                //Correo ya registrado
                return false;
        }
        return true;
    }
    
    //Método para validar telefono
    public static boolean telefonoValido(String telefono) {
        //Diez digitos y solo números
        String regex = "^[0-9]{10}$";
        //Compararción
        return Pattern.matches(regex, telefono);
    }
    public boolean telefonoUnico(String telefono){
        //Buscar coincidencias
        for(Usuario u : usuarios){
            if(u.getTelefono().equals(telefono))
                //Correo ya registrado
                return false;
        }
        return true;
    }
    
    //Método para validar contraseña
    public static boolean contrasenaValida(String contraseña) { 
        // Validacion de constraseña: al menos 8 caracteres, una mayúscula, una minúscula, un número y un carácter especial
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&.])[A-Za-z\\d@$!%*?&.]{8,}$";
         //Compararción
        return Pattern.matches(regex, contraseña);
    }
}
