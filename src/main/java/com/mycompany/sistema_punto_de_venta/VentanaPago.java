package com.mycompany.sistema_punto_de_venta;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Ventana de métodos de pago de CyberVentana.
 */
public class VentanaPago extends javax.swing.JFrame {
    
    private Pedido ped;
    private boolean pago;
    private int metod=0;
    
    public VentanaPago() {
        initComponents();
        setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        for(Pedido pe: Sistema_Punto_de_Venta.pedidos){
            if(Sistema_Punto_de_Venta.clienteActual.getId().equals(pe.getIdCliente()))
                ped = pe;
        }
        lblTotalValor.setText(Double.toString(ped.getTotal_de_pago()));
        // Hace que la rueda del ratón desplace más rápido
        scrollOpciones.getVerticalScrollBar().setUnitIncrement(16);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoPago = new javax.swing.ButtonGroup();
        panelEncabezado = new javax.swing.JPanel();
        panelIzquierda = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        panelDerecha = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        scrollOpciones = new javax.swing.JScrollPane();
        panelContenedor = new javax.swing.JPanel();
        panelOpciones = new javax.swing.JPanel();
        opcionTarjeta = new javax.swing.JPanel();
        rbTarjeta = new javax.swing.JRadioButton();
        panelCamposTarjeta = new javax.swing.JPanel();
        lblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        lblTitular = new javax.swing.JLabel();
        txtTitular = new javax.swing.JTextField();
        lblVencimiento = new javax.swing.JLabel();
        txtVencimiento = new javax.swing.JTextField();
        lblCvv = new javax.swing.JLabel();
        txtCvv = new javax.swing.JTextField();
        opcionPaypal = new javax.swing.JPanel();
        rbPaypal = new javax.swing.JRadioButton();
        panelCamposPaypal = new javax.swing.JPanel();
        lblCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        lblContraseña = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JTextField();
        opcionEfectivo = new javax.swing.JPanel();
        rbEfectivo = new javax.swing.JRadioButton();
        lblNotaEfectivo = new javax.swing.JLabel();
        panelLateral = new javax.swing.JPanel();
        panelResumen = new javax.swing.JPanel();
        panelTotal = new javax.swing.JPanel();
        lblTotalTexto = new javax.swing.JLabel();
        lblTotalValor = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CyberVentana - Método de pago");
        setExtendedState(6);

        panelEncabezado.setBackground(new java.awt.Color(30, 42, 55));
        panelEncabezado.setLayout(new java.awt.BorderLayout());

        panelIzquierda.setBackground(new java.awt.Color(30, 42, 55));
        panelIzquierda.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CyberVentana (3).png"))); // NOI18N
        Logo.setPreferredSize(new java.awt.Dimension(300, 70));
        panelIzquierda.add(Logo);

        panelEncabezado.add(panelIzquierda, java.awt.BorderLayout.WEST);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Método de pago");
        panelEncabezado.add(lblTitulo, java.awt.BorderLayout.CENTER);

        panelDerecha.setBackground(new java.awt.Color(30, 42, 55));
        panelDerecha.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 25));

        btnVolver.setBackground(new java.awt.Color(0, 92, 184));
        btnVolver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver al carrito");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        panelDerecha.add(btnVolver);

        panelEncabezado.add(panelDerecha, java.awt.BorderLayout.EAST);

        getContentPane().add(panelEncabezado, java.awt.BorderLayout.NORTH);

        panelContenedor.setBackground(new java.awt.Color(22, 28, 36));
        panelContenedor.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panelContenedor.setLayout(new java.awt.BorderLayout());

        panelOpciones.setBackground(new java.awt.Color(30, 42, 55));
        panelOpciones.setLayout(new java.awt.GridLayout(0, 1));

        opcionTarjeta.setBackground(new java.awt.Color(30, 42, 55));
        opcionTarjeta.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        opcionTarjeta.setPreferredSize(new java.awt.Dimension(600, 220));
        opcionTarjeta.setLayout(new java.awt.BorderLayout());

        rbTarjeta.setBackground(new java.awt.Color(30, 42, 55));
        grupoPago.add(rbTarjeta);
        rbTarjeta.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        rbTarjeta.setForeground(new java.awt.Color(255, 255, 255));
        rbTarjeta.setSelected(true);
        rbTarjeta.setText("Tarjeta de crédito / débito");
        rbTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTarjetaActionPerformed(evt);
            }
        });
        opcionTarjeta.add(rbTarjeta, java.awt.BorderLayout.NORTH);

        panelCamposTarjeta.setBackground(new java.awt.Color(30, 42, 55));
        panelCamposTarjeta.setLayout(new java.awt.GridLayout(4, 2));

        lblNumero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNumero.setForeground(new java.awt.Color(255, 255, 255));
        lblNumero.setText("Número de tarjeta");
        lblNumero.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        panelCamposTarjeta.add(lblNumero);

        txtNumero.setBackground(new java.awt.Color(25, 40, 52));
        txtNumero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        panelCamposTarjeta.add(txtNumero);

        lblTitular.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTitular.setForeground(new java.awt.Color(255, 255, 255));
        lblTitular.setText("Titular");
        lblTitular.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        panelCamposTarjeta.add(lblTitular);

        txtTitular.setBackground(new java.awt.Color(25, 40, 52));
        txtTitular.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        panelCamposTarjeta.add(txtTitular);

        lblVencimiento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblVencimiento.setForeground(new java.awt.Color(255, 255, 255));
        lblVencimiento.setText("Vencimiento (MM/AA)");
        lblVencimiento.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        panelCamposTarjeta.add(lblVencimiento);

        txtVencimiento.setBackground(new java.awt.Color(25, 40, 52));
        txtVencimiento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        panelCamposTarjeta.add(txtVencimiento);

        lblCvv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCvv.setForeground(new java.awt.Color(255, 255, 255));
        lblCvv.setText("CVV");
        lblCvv.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        panelCamposTarjeta.add(lblCvv);

        txtCvv.setBackground(new java.awt.Color(25, 40, 52));
        txtCvv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        panelCamposTarjeta.add(txtCvv);

        opcionTarjeta.add(panelCamposTarjeta, java.awt.BorderLayout.CENTER);

        panelOpciones.add(opcionTarjeta);

        opcionPaypal.setBackground(new java.awt.Color(30, 42, 55));
        opcionPaypal.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        opcionPaypal.setMinimumSize(new java.awt.Dimension(302, 90));
        opcionPaypal.setPreferredSize(new java.awt.Dimension(600, 90));
        opcionPaypal.setLayout(new java.awt.BorderLayout());

        rbPaypal.setBackground(new java.awt.Color(30, 42, 55));
        grupoPago.add(rbPaypal);
        rbPaypal.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        rbPaypal.setForeground(new java.awt.Color(255, 255, 255));
        rbPaypal.setText("PayPal");
        rbPaypal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPaypalActionPerformed(evt);
            }
        });
        opcionPaypal.add(rbPaypal, java.awt.BorderLayout.NORTH);

        panelCamposPaypal.setBackground(new java.awt.Color(30, 42, 55));
        panelCamposPaypal.setLayout(new java.awt.GridLayout(2, 2));

        lblCorreo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCorreo.setText("Correo de PayPal");
        panelCamposPaypal.add(lblCorreo);

        txtCorreo.setBackground(new java.awt.Color(25, 40, 52));
        txtCorreo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        panelCamposPaypal.add(txtCorreo);

        lblContraseña.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(255, 255, 255));
        lblContraseña.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblContraseña.setText("Contraseña de PayPal");
        panelCamposPaypal.add(lblContraseña);

        txtContraseña.setBackground(new java.awt.Color(25, 40, 52));
        txtContraseña.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        panelCamposPaypal.add(txtContraseña);

        opcionPaypal.add(panelCamposPaypal, java.awt.BorderLayout.CENTER);

        panelOpciones.add(opcionPaypal);

        opcionEfectivo.setBackground(new java.awt.Color(30, 42, 55));
        opcionEfectivo.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        opcionEfectivo.setPreferredSize(new java.awt.Dimension(600, 100));
        opcionEfectivo.setLayout(new java.awt.BorderLayout());

        rbEfectivo.setBackground(new java.awt.Color(30, 42, 55));
        grupoPago.add(rbEfectivo);
        rbEfectivo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        rbEfectivo.setForeground(new java.awt.Color(255, 255, 255));
        rbEfectivo.setText("Efectivo");
        rbEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEfectivoActionPerformed(evt);
            }
        });
        opcionEfectivo.add(rbEfectivo, java.awt.BorderLayout.NORTH);

        lblNotaEfectivo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNotaEfectivo.setForeground(new java.awt.Color(255, 255, 255));
        lblNotaEfectivo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNotaEfectivo.setText("Pagar en tienda física: Por el momento solo disponeble: OXXO");
        opcionEfectivo.add(lblNotaEfectivo, java.awt.BorderLayout.CENTER);

        panelOpciones.add(opcionEfectivo);

        panelContenedor.add(panelOpciones, java.awt.BorderLayout.NORTH);

        scrollOpciones.setViewportView(panelContenedor);

        getContentPane().add(scrollOpciones, java.awt.BorderLayout.CENTER);

        panelLateral.setBackground(new java.awt.Color(22, 28, 36));
        panelLateral.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panelLateral.setLayout(new java.awt.BorderLayout());

        panelResumen.setBackground(new java.awt.Color(30, 42, 55));
        panelResumen.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panelResumen.setPreferredSize(new java.awt.Dimension(340, 140));
        panelResumen.setLayout(new java.awt.BorderLayout());

        panelTotal.setBackground(new java.awt.Color(30, 42, 55));
        panelTotal.setLayout(new java.awt.GridLayout(1, 2));

        lblTotalTexto.setBackground(new java.awt.Color(30, 42, 55));
        lblTotalTexto.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblTotalTexto.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalTexto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTotalTexto.setText("Total a pagar");
        panelTotal.add(lblTotalTexto);

        lblTotalValor.setBackground(new java.awt.Color(30, 42, 55));
        lblTotalValor.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblTotalValor.setForeground(new java.awt.Color(255, 102, 0));
        lblTotalValor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotalValor.setText("$0.00");
        panelTotal.add(lblTotalValor);

        panelResumen.add(panelTotal, java.awt.BorderLayout.NORTH);

        btnConfirmar.setBackground(new java.awt.Color(255, 102, 0));
        btnConfirmar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmar.setText("Confirmar pago");
        btnConfirmar.setPreferredSize(new java.awt.Dimension(200, 40));
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        panelResumen.add(btnConfirmar, java.awt.BorderLayout.SOUTH);

        panelLateral.add(panelResumen, java.awt.BorderLayout.NORTH);

        getContentPane().add(panelLateral, java.awt.BorderLayout.EAST);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTarjetaActionPerformed
        
    }//GEN-LAST:event_rbTarjetaActionPerformed

    private void rbPaypalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPaypalActionPerformed
        
    }//GEN-LAST:event_rbPaypalActionPerformed

    private void rbEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEfectivoActionPerformed
        
    }//GEN-LAST:event_rbEfectivoActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        Cliente c = Sistema_Punto_de_Venta.clienteActual;
        int estado;
        String metodoTexto;

        if (rbTarjeta.isSelected()) {
            Tarjeta t = new Tarjeta(txtNumero.getText().trim(), txtTitular.getText().trim(),
                    txtVencimiento.getText().trim(), txtCvv.getText().trim(),
                    "", ped.getFecha(), ped.getTotal_de_pago());
            if (!t.procesarPago()) {
                JOptionPane.showMessageDialog(this, "Datos de tarjeta inválidos.");
                return;
            }
            estado = 1; // Pagado
            metodoTexto = "Tarjeta";

        } else if (rbPaypal.isSelected()) {
            Paypal p = new Paypal(txtCorreo.getText().trim(), txtContraseña.getText(),
                    "", ped.getFecha(), ped.getTotal_de_pago());
            if (!p.procesarPago()) {
                JOptionPane.showMessageDialog(this, "Correo de PayPal inválido.");
                return;
            }
            estado = 1; // Pagado
            metodoTexto = "PayPal";

        } else {
            Efectivo e = new Efectivo("", ped.getFecha(), ped.getTotal_de_pago());
            e.procesarPago(); // muestra la ficha de pago
            estado = 0; // Pago pendiente
            metodoTexto = "Efectivo (OXXO)";
        }

        // Completar los datos del pedido
        ped.setMetodo_de_pago(metodoTexto);
        ped.setProductosComprados(new ArrayList<>(c.getCarrito().getProductosCarrito()));
        ped.setEstadoActual(estado);

        String ticket = ped.generarticket(estado, c);

        c.comprarCarrito(); // descuenta stock y vacía el carrito

        JOptionPane.showMessageDialog(this, ticket, "Pedido registrado", JOptionPane.INFORMATION_MESSAGE);
        GestorCSV.guardarTodo();
        this.dispose();
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        new VentanaCarrito().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnVolver;
    private javax.swing.ButtonGroup grupoPago;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblCvv;
    private javax.swing.JLabel lblNotaEfectivo;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblTitular;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTotalTexto;
    private javax.swing.JLabel lblTotalValor;
    private javax.swing.JLabel lblVencimiento;
    private javax.swing.JPanel opcionEfectivo;
    private javax.swing.JPanel opcionPaypal;
    private javax.swing.JPanel opcionTarjeta;
    private javax.swing.JPanel panelCamposPaypal;
    private javax.swing.JPanel panelCamposTarjeta;
    private javax.swing.JPanel panelContenedor;
    private javax.swing.JPanel panelDerecha;
    private javax.swing.JPanel panelEncabezado;
    private javax.swing.JPanel panelIzquierda;
    private javax.swing.JPanel panelLateral;
    private javax.swing.JPanel panelOpciones;
    private javax.swing.JPanel panelResumen;
    private javax.swing.JPanel panelTotal;
    private javax.swing.JRadioButton rbEfectivo;
    private javax.swing.JRadioButton rbPaypal;
    private javax.swing.JRadioButton rbTarjeta;
    private javax.swing.JScrollPane scrollOpciones;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtCvv;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtTitular;
    private javax.swing.JTextField txtVencimiento;
    // End of variables declaration//GEN-END:variables
}
