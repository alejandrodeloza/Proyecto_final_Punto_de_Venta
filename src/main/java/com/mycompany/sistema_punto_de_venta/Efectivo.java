/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_punto_de_venta;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;//Numeros random
import javax.swing.JOptionPane;


public class Efectivo extends Pago {
    //Atributos
    private String tienda;
    private String codigoReferencia;
    private String fechaLimite;
    private boolean pagado;
    
    //Constructor
    public Efectivo(String tienda, String codigoReferencia, String fechaLimite, boolean pagado, String idPago, String fechaPago, double monto) {
        super(idPago, fechaPago, monto);
        this.tienda = tienda;
        this.codigoReferencia = codigoReferencia;
        this.fechaLimite = fechaLimite;
        this.pagado = pagado;
    }

    public Efectivo(String idPago, String fechaPago, double monto) {
        super(idPago, fechaPago, monto);
    }
    
    
    //Métodos Getter
    public String getTienda() {
        return tienda;
    }
    public String getCodigoReferencia() {
        return codigoReferencia;
    }
    public String getFechaLimite() {
        return fechaLimite;
    }
    public boolean isPagado() {
        return pagado;
    }
    
    //Métodos Setter
    public void setTienda(String tienda) {
        this.tienda = tienda;
    }
    public void setCodigoReferencia(String codigoReferencia) {
        this.codigoReferencia = codigoReferencia;
    }
    public void setFechaLimite(String fechaLimite) {
        this.fechaLimite = fechaLimite;
    }
    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }
    
    //Método de pago (polimorfismo)
    @Override
    public boolean procesarPago() {
        tienda="OXXO";
        codigoReferencia=generarReferencia();
        Date fechaActual = new Date();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaActual);
        calendar.add(Calendar.DAY_OF_YEAR, 5); // Suma 5 días (usa número negativo para restar)

        Date fechaFutura = calendar.getTime();
        fechaLimite = fechaFutura.toString();
        pagado=false;
        JOptionPane.showInputDialog(0, generarFichaPago());
        return true;
    }
    
    // - generarReferencia(): String (Método privado)
    private String generarReferencia() {
        // Genera un código alfanumérico único de 10 caracteres
        return "REF-" + UUID.randomUUID().toString().substring(0, 10).toUpperCase();
    }

    // + generarFichaPago(): String
    public String generarFichaPago() {
        return """
               --- FICHA DE PAGO EN EFECTIVO ---
               Tienda autorizada: """ + this.tienda + "\n" +
               "Código de referencia: " + this.codigoReferencia + "\n" +
               "Fecha límite de pago: " + this.fechaLimite + "\n" +
               "Estado: " + (this.pagado ? "PAGADO" : "PENDIENTE");
    }

    // + confirmarPago(): void
    public void confirmarPago() {
        this.pagado = true;
        System.out.println("El pago con referencia " + this.codigoReferencia + " ha sido confirmado.");
    }
    
}
