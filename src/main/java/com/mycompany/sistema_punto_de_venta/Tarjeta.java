/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_punto_de_venta;

/**
 *
 * @author Alej
 */
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
    
}
