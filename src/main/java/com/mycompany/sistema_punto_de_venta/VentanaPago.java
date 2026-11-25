package com.mycompany.sistema_punto_de_venta;

/**
 * Ventana de métodos de pago de CyberVentana.
 */
public class VentanaPago extends javax.swing.JFrame {

    public VentanaPago() {
        initComponents();
        Utilidades.cargarLogo(lblLogo); //carga imagen del logo
        // Hace que la rueda del ratón desplace más rápido
        scrollOpciones.getVerticalScrollBar().setUnitIncrement(16);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoPago = new javax.swing.ButtonGroup();
        panelEncabezado = new javax.swing.JPanel();
        panelIzquierda = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
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

        panelEncabezado.setBackground(new java.awt.Color(33, 33, 33));
        panelEncabezado.setLayout(new java.awt.BorderLayout());

        panelIzquierda.setBackground(new java.awt.Color(33, 33, 33));
        panelIzquierda.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblLogo.setBackground(new java.awt.Color(255, 255, 255));
        lblLogo.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblLogo.setForeground(new java.awt.Color(0, 92, 184));
        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setText("CyberVentana");
        lblLogo.setOpaque(true);
        lblLogo.setPreferredSize(new java.awt.Dimension(180, 50));
        panelIzquierda.add(lblLogo);

        panelEncabezado.add(panelIzquierda, java.awt.BorderLayout.WEST);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Método de pago");
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelEncabezado.add(lblTitulo, java.awt.BorderLayout.CENTER);

        panelDerecha.setBackground(new java.awt.Color(33, 33, 33));
        panelDerecha.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        btnVolver.setBackground(new java.awt.Color(0, 92, 184));
        btnVolver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver al carrito");
        panelDerecha.add(btnVolver);

        panelEncabezado.add(panelDerecha, java.awt.BorderLayout.EAST);

        getContentPane().add(panelEncabezado, java.awt.BorderLayout.NORTH);

        panelContenedor.setBackground(new java.awt.Color(45, 45, 45));
        panelContenedor.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panelContenedor.setLayout(new java.awt.BorderLayout());

        panelOpciones.setBackground(new java.awt.Color(45, 45, 45));
        panelOpciones.setLayout(new java.awt.GridLayout(0, 1));

        opcionTarjeta.setBackground(new java.awt.Color(66, 66, 66));
        opcionTarjeta.setPreferredSize(new java.awt.Dimension(600, 220));
        opcionTarjeta.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        opcionTarjeta.setLayout(new java.awt.BorderLayout());

        rbTarjeta.setBackground(new java.awt.Color(66, 66, 66));
        grupoPago.add(rbTarjeta);
        rbTarjeta.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        rbTarjeta.setForeground(new java.awt.Color(255, 255, 255));
        rbTarjeta.setSelected(true);
        rbTarjeta.setText("Tarjeta de crédito / débito");
        opcionTarjeta.add(rbTarjeta, java.awt.BorderLayout.NORTH);

        panelCamposTarjeta.setBackground(new java.awt.Color(66, 66, 66));
        panelCamposTarjeta.setLayout(new java.awt.GridLayout(4, 2));

        lblNumero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNumero.setForeground(new java.awt.Color(255, 255, 255));
        lblNumero.setText("Número de tarjeta");
        lblNumero.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        panelCamposTarjeta.add(lblNumero);

        txtNumero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        panelCamposTarjeta.add(txtNumero);

        lblTitular.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTitular.setForeground(new java.awt.Color(255, 255, 255));
        lblTitular.setText("Titular");
        lblTitular.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        panelCamposTarjeta.add(lblTitular);

        txtTitular.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        panelCamposTarjeta.add(txtTitular);

        lblVencimiento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblVencimiento.setForeground(new java.awt.Color(255, 255, 255));
        lblVencimiento.setText("Vencimiento (MM/AA)");
        lblVencimiento.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        panelCamposTarjeta.add(lblVencimiento);

        txtVencimiento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        panelCamposTarjeta.add(txtVencimiento);

        lblCvv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCvv.setForeground(new java.awt.Color(255, 255, 255));
        lblCvv.setText("CVV");
        lblCvv.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        panelCamposTarjeta.add(lblCvv);

        txtCvv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        panelCamposTarjeta.add(txtCvv);

        opcionTarjeta.add(panelCamposTarjeta, java.awt.BorderLayout.CENTER);

        panelOpciones.add(opcionTarjeta);

        opcionPaypal.setBackground(new java.awt.Color(66, 66, 66));
        opcionPaypal.setPreferredSize(new java.awt.Dimension(600, 110));
        opcionPaypal.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        opcionPaypal.setLayout(new java.awt.BorderLayout());

        rbPaypal.setBackground(new java.awt.Color(66, 66, 66));
        grupoPago.add(rbPaypal);
        rbPaypal.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        rbPaypal.setForeground(new java.awt.Color(255, 255, 255));
        rbPaypal.setText("PayPal");
        opcionPaypal.add(rbPaypal, java.awt.BorderLayout.NORTH);

        panelCamposPaypal.setBackground(new java.awt.Color(66, 66, 66));
        panelCamposPaypal.setLayout(new java.awt.GridLayout(1, 2));

        lblCorreo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreo.setText("Correo de PayPal");
        lblCorreo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        panelCamposPaypal.add(lblCorreo);

        txtCorreo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        panelCamposPaypal.add(txtCorreo);

        opcionPaypal.add(panelCamposPaypal, java.awt.BorderLayout.CENTER);

        panelOpciones.add(opcionPaypal);

        opcionEfectivo.setBackground(new java.awt.Color(66, 66, 66));
        opcionEfectivo.setPreferredSize(new java.awt.Dimension(600, 100));
        opcionEfectivo.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        opcionEfectivo.setLayout(new java.awt.BorderLayout());

        rbEfectivo.setBackground(new java.awt.Color(66, 66, 66));
        grupoPago.add(rbEfectivo);
        rbEfectivo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        rbEfectivo.setForeground(new java.awt.Color(255, 255, 255));
        rbEfectivo.setText("Efectivo");
        opcionEfectivo.add(rbEfectivo, java.awt.BorderLayout.NORTH);

        lblNotaEfectivo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNotaEfectivo.setForeground(new java.awt.Color(255, 255, 255));
        lblNotaEfectivo.setText("Pagarás en efectivo al recibir tu pedido.");
        lblNotaEfectivo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        opcionEfectivo.add(lblNotaEfectivo, java.awt.BorderLayout.CENTER);

        panelOpciones.add(opcionEfectivo);

        panelContenedor.add(panelOpciones, java.awt.BorderLayout.NORTH);

        scrollOpciones.setViewportView(panelContenedor);

        getContentPane().add(scrollOpciones, java.awt.BorderLayout.CENTER);

        panelLateral.setBackground(new java.awt.Color(45, 45, 45));
        panelLateral.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panelLateral.setLayout(new java.awt.BorderLayout());

        panelResumen.setBackground(new java.awt.Color(66, 66, 66));
        panelResumen.setPreferredSize(new java.awt.Dimension(340, 140));
        panelResumen.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panelResumen.setLayout(new java.awt.BorderLayout());

        panelTotal.setBackground(new java.awt.Color(66, 66, 66));
        panelTotal.setLayout(new java.awt.GridLayout(1, 2));

        lblTotalTexto.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblTotalTexto.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalTexto.setText("Total a pagar");
        lblTotalTexto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        panelTotal.add(lblTotalTexto);

        lblTotalValor.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblTotalValor.setForeground(new java.awt.Color(255, 102, 0));
        lblTotalValor.setText("$0.00");
        lblTotalValor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        panelTotal.add(lblTotalValor);

        panelResumen.add(panelTotal, java.awt.BorderLayout.NORTH);

        btnConfirmar.setBackground(new java.awt.Color(255, 102, 0));
        btnConfirmar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmar.setText("Confirmar pago");
        btnConfirmar.setPreferredSize(new java.awt.Dimension(200, 40));
        panelResumen.add(btnConfirmar, java.awt.BorderLayout.SOUTH);

        panelLateral.add(panelResumen, java.awt.BorderLayout.NORTH);

        getContentPane().add(panelLateral, java.awt.BorderLayout.EAST);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new VentanaPago().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnVolver;
    private javax.swing.ButtonGroup grupoPago;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblCvv;
    private javax.swing.JLabel lblLogo;
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
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtCvv;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtTitular;
    private javax.swing.JTextField txtVencimiento;
    // End of variables declaration//GEN-END:variables
}
