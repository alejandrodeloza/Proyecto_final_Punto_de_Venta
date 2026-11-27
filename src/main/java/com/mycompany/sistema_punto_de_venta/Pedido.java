/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_punto_de_venta;

import java.util.*;

public class Pedido {

    //Atributos
    private String idPedido; //Formato: [E***]
    private String idCliente;
    private String fecha;
    private String metodo_de_pago;
    private String[] estado = {"Pago pendiente", "Pagado", "Enviando", "Entregado"};
    private ArrayList<Producto> ProductosComprados = new ArrayList<>();
    private double Total_de_pago;

    //Constructor
    public Pedido(String idPedido, String idCliente, String fecha, String metodo_de_pago, double Total_de_pago) {
        this.idPedido = idPedido;
        this.idCliente = idCliente;
        this.fecha = fecha;
        this.metodo_de_pago = metodo_de_pago;
        this.Total_de_pago = Total_de_pago;
    }

    //Métodos Getter
    public String getIdPedido() {
        return idPedido;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public String getFecha() {
        return fecha;
    }

    public String getMetodo_de_pago() {
        return metodo_de_pago;
    }

    public String[] getEstado() {
        return estado;
    }

    public ArrayList<Producto> getProductosComprados() {
        return ProductosComprados;
    }

    public double getTotal_de_pago() {
        return Total_de_pago;
    }

    //Métodos Setter
    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setMetodo_de_pago(String metodo_de_pago) {
        this.metodo_de_pago = metodo_de_pago;
    }

    public void setEstado(String[] estado) {
        this.estado = estado;
    }

    public void setProductosComprados(ArrayList<Producto> ProductosComprados) {
        this.ProductosComprados = ProductosComprados;
    }

    public void setTotal_de_pago(double Total_de_pago) {
        this.Total_de_pago = Total_de_pago;
    }

    //Método generar ticked
    public String generarticket(int estado, Cliente c) {
        String Ticket;

        //Concatenar atributos
        Ticket = "ID del pedido:\t" + idPedido + "\n";
        Ticket += "Cliente:\t" + c.getNombre() + "\n";
        Ticket += "Fecha:\t" + fecha + "\n";
        Ticket += "Metodo de pago:\t" + metodo_de_pago + "\n";
        Ticket += "Estado:\t" + this.estado[estado] + "\n";
        Ticket += "Productos:\t\tPrecio\n";
        //Agregar productos
        for (Producto p : ProductosComprados) {
            Ticket += p.getNombre() + "\t\t" + p.getPrecio() + "\n";
        }
        Ticket += "Total:\t\t" + Total_de_pago + "\n";

        return Ticket;
    }

    private int estadoActual = 0; // 0 Pago pendiente, 1 Pagado, 2 Enviando, 3 Entregado

    public int getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(int estadoActual) {
        this.estadoActual = estadoActual;
    }
}
