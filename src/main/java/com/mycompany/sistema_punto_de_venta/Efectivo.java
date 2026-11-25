/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_punto_de_venta;


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
}
