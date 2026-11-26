/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_punto_de_venta;


public class Paypal extends Pago {
    //Atributos (Son los datos de la cuenta de PayPal del usuario)
    private String correoPaypal;
    private String contraseñaPaypal;
    
    //Constructor
    public Paypal(String correoPaypal, String contraseñaPaypal, String idPago, String fechaPago, double monto) {
        super(idPago, fechaPago, monto);
        this.correoPaypal = correoPaypal;
        this.contraseñaPaypal = contraseñaPaypal;
    }
    
    //Métodos Getter
    public String getCorreoPaypal() {
        return correoPaypal;
    }
    public String getContraseñaPaypal() {
        return contraseñaPaypal;
    }
    
    //Métodos Setter
    public void setCorreoPaypal(String correoPaypal) {
        this.correoPaypal = correoPaypal;
    }
    public void setContraseñaPaypal(String contraseñaPaypal) {
        this.contraseñaPaypal = contraseñaPaypal;
    }
    
    //Método de pago (polimorfismo)

    @Override
    public boolean procesarPago() {
        return Sistema_Punto_de_Venta.correoValido(correoPaypal);
    }
    
}
