/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_punto_de_venta;


public abstract class Pago {
    //Atributos
    protected String idPago; //Formato: [G***]
    protected String fechaPago;
    protected double monto;
    
    //Constructor
    public Pago(String idPago, String fechaPago, double monto) {
        this.idPago = idPago;
        this.fechaPago = fechaPago;
        this.monto = monto;
    }
    
    //Métodos Getter
    public String getIdPago() {
        return idPago;
    }
    public String getFechaPago() {
        return fechaPago;
    }
    public double getMonto() {
        return monto;
    }
    
    //Métodos Setter
    public void setIdPago(String idPago) {
        this.idPago = idPago;
    }
    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    //Método de pago (polimorfismo)
    public abstract boolean procesarPago();
}
