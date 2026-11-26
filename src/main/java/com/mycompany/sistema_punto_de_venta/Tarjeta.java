/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_punto_de_venta;

import java.util.regex.*;

public class Tarjeta extends Pago {

    //Atributos
    private String numeroTarjeta;
    private String titular;
    private String fechaVencimiento;
    private String cvv;

    //Constructor
    public Tarjeta(String numeroTarjeta, String titular, String fechaVencimiento, String cvv, String idPago, String fechaPago, double monto) {
        super(idPago, fechaPago, monto);
        this.numeroTarjeta = numeroTarjeta;
        this.titular = titular;
        this.fechaVencimiento = fechaVencimiento;
        this.cvv = cvv;
    }

    //Métodos Getter
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public String getTitular() {
        return titular;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public String getCvv() {
        return cvv;
    }

    //Métodos Setter
    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    //Método de pago (polimorfismo)
    @Override
    public boolean procesarPago() {
        if(validarTarjetanum(numeroTarjeta) && validarTarjetafech(fechaVencimiento) && validarTarjetacvv(cvv) && Sistema_Punto_de_Venta.nombreValido(titular))
            return true;
        return false;
    }

    //Métodos para validar tarjeta
    public boolean validarTarjetanum(String num) {
        //16 digitos y solo números
        String regex = "^[0-9]{16}$";
        //Compararción
        return Pattern.matches(regex, num);
    }

    public boolean validarTarjetafech(String fech) {
        //Dos digitos para mes solo 1 a 12, después / y el año en dos digitos
        String regex = "^(0[1-9]|1[0-2])\\/([0-9]{2})$";
        //Compararción
        return Pattern.matches(regex, fech);
    }
    
    public boolean validarTarjetacvv(String cvv) {
        //Tres o cuatro digitos del 0 al 9
        String regex = "^[0-9]{3,4}$";
        //Compararción
        return Pattern.matches(regex, cvv);
    }
}
