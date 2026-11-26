/*
 * CyberVentana - ventana principal
 */
package com.mycompany.sistema_punto_de_venta;

/**
 * Ventana principal de CyberVentana.
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        initComponents();
        Utilidades.cargarLogo(lblLogo); //carga imagen del logo
        // Hace que la rueda del ratón desplace más rápido
        scrollProductos.getVerticalScrollBar().setUnitIncrement(16);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEncabezado = new javax.swing.JPanel();
        panelIzquierda = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        panelDerecha = new javax.swing.JPanel();
        btnIniciarSesion = new javax.swing.JButton();
        btnCarrito = new javax.swing.JButton();
        scrollProductos = new javax.swing.JScrollPane();
        panelProductos = new javax.swing.JPanel();
        tarjeta1 = new javax.swing.JPanel();
        lblProducto1 = new javax.swing.JLabel();
        btnAgregar1 = new javax.swing.JButton();
        tarjeta2 = new javax.swing.JPanel();
        lblProducto2 = new javax.swing.JLabel();
        btnAgregar2 = new javax.swing.JButton();
        tarjeta3 = new javax.swing.JPanel();
        lblProducto3 = new javax.swing.JLabel();
        btnAgregar3 = new javax.swing.JButton();
        tarjeta4 = new javax.swing.JPanel();
        lblProducto4 = new javax.swing.JLabel();
        btnAgregar4 = new javax.swing.JButton();
        tarjeta5 = new javax.swing.JPanel();
        lblProducto5 = new javax.swing.JLabel();
        btnAgregar5 = new javax.swing.JButton();
        tarjeta6 = new javax.swing.JPanel();
        lblProducto6 = new javax.swing.JLabel();
        btnAgregar6 = new javax.swing.JButton();
        tarjeta7 = new javax.swing.JPanel();
        lblProducto7 = new javax.swing.JLabel();
        btnAgregar7 = new javax.swing.JButton();
        tarjeta8 = new javax.swing.JPanel();
        lblProducto8 = new javax.swing.JLabel();
        btnAgregar8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CyberVentana");
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

        txtBuscar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtBuscar.setColumns(30);
        panelIzquierda.add(txtBuscar);

        btnBuscar.setBackground(new java.awt.Color(0, 92, 184));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        panelIzquierda.add(btnBuscar);

        panelEncabezado.add(panelIzquierda, java.awt.BorderLayout.WEST);

        panelDerecha.setBackground(new java.awt.Color(33, 33, 33));
        panelDerecha.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        btnIniciarSesion.setBackground(new java.awt.Color(0, 92, 184));
        btnIniciarSesion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setText("Iniciar sesión");
        panelDerecha.add(btnIniciarSesion);

        btnCarrito.setBackground(new java.awt.Color(255, 102, 0));
        btnCarrito.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCarrito.setForeground(new java.awt.Color(255, 255, 255));
        btnCarrito.setText("Carrito");
        panelDerecha.add(btnCarrito);

        panelEncabezado.add(panelDerecha, java.awt.BorderLayout.EAST);

        getContentPane().add(panelEncabezado, java.awt.BorderLayout.NORTH);

        panelProductos.setBackground(new java.awt.Color(45, 45, 45));
        panelProductos.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panelProductos.setLayout(new java.awt.GridLayout(0, 4, 15, 15));

        tarjeta1.setBackground(new java.awt.Color(66, 66, 66));
        tarjeta1.setPreferredSize(new java.awt.Dimension(230, 250));
        tarjeta1.setLayout(new java.awt.BorderLayout());

        lblProducto1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblProducto1.setForeground(new java.awt.Color(255, 255, 255));
        lblProducto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProducto1.setText("Producto 1");
        tarjeta1.add(lblProducto1, java.awt.BorderLayout.CENTER);

        btnAgregar1.setBackground(new java.awt.Color(255, 102, 0));
        btnAgregar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregar1.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar1.setText("Agregar al carrito");
        tarjeta1.add(btnAgregar1, java.awt.BorderLayout.SOUTH);

        panelProductos.add(tarjeta1);

        tarjeta2.setBackground(new java.awt.Color(66, 66, 66));
        tarjeta2.setPreferredSize(new java.awt.Dimension(230, 250));
        tarjeta2.setLayout(new java.awt.BorderLayout());

        lblProducto2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblProducto2.setForeground(new java.awt.Color(255, 255, 255));
        lblProducto2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProducto2.setText("Producto 2");
        tarjeta2.add(lblProducto2, java.awt.BorderLayout.CENTER);

        btnAgregar2.setBackground(new java.awt.Color(255, 102, 0));
        btnAgregar2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregar2.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar2.setText("Agregar al carrito");
        tarjeta2.add(btnAgregar2, java.awt.BorderLayout.SOUTH);

        panelProductos.add(tarjeta2);

        tarjeta3.setBackground(new java.awt.Color(66, 66, 66));
        tarjeta3.setPreferredSize(new java.awt.Dimension(230, 250));
        tarjeta3.setLayout(new java.awt.BorderLayout());

        lblProducto3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblProducto3.setForeground(new java.awt.Color(255, 255, 255));
        lblProducto3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProducto3.setText("Producto 3");
        tarjeta3.add(lblProducto3, java.awt.BorderLayout.CENTER);

        btnAgregar3.setBackground(new java.awt.Color(255, 102, 0));
        btnAgregar3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregar3.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar3.setText("Agregar al carrito");
        tarjeta3.add(btnAgregar3, java.awt.BorderLayout.SOUTH);

        panelProductos.add(tarjeta3);

        tarjeta4.setBackground(new java.awt.Color(66, 66, 66));
        tarjeta4.setPreferredSize(new java.awt.Dimension(230, 250));
        tarjeta4.setLayout(new java.awt.BorderLayout());

        lblProducto4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblProducto4.setForeground(new java.awt.Color(255, 255, 255));
        lblProducto4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProducto4.setText("Producto 4");
        tarjeta4.add(lblProducto4, java.awt.BorderLayout.CENTER);

        btnAgregar4.setBackground(new java.awt.Color(255, 102, 0));
        btnAgregar4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregar4.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar4.setText("Agregar al carrito");
        tarjeta4.add(btnAgregar4, java.awt.BorderLayout.SOUTH);

        panelProductos.add(tarjeta4);

        tarjeta5.setBackground(new java.awt.Color(66, 66, 66));
        tarjeta5.setPreferredSize(new java.awt.Dimension(230, 250));
        tarjeta5.setLayout(new java.awt.BorderLayout());

        lblProducto5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblProducto5.setForeground(new java.awt.Color(255, 255, 255));
        lblProducto5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProducto5.setText("Producto 5");
        tarjeta5.add(lblProducto5, java.awt.BorderLayout.CENTER);

        btnAgregar5.setBackground(new java.awt.Color(255, 102, 0));
        btnAgregar5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregar5.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar5.setText("Agregar al carrito");
        tarjeta5.add(btnAgregar5, java.awt.BorderLayout.SOUTH);

        panelProductos.add(tarjeta5);

        tarjeta6.setBackground(new java.awt.Color(66, 66, 66));
        tarjeta6.setPreferredSize(new java.awt.Dimension(230, 250));
        tarjeta6.setLayout(new java.awt.BorderLayout());

        lblProducto6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblProducto6.setForeground(new java.awt.Color(255, 255, 255));
        lblProducto6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProducto6.setText("Producto 6");
        tarjeta6.add(lblProducto6, java.awt.BorderLayout.CENTER);

        btnAgregar6.setBackground(new java.awt.Color(255, 102, 0));
        btnAgregar6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregar6.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar6.setText("Agregar al carrito");
        tarjeta6.add(btnAgregar6, java.awt.BorderLayout.SOUTH);

        panelProductos.add(tarjeta6);

        tarjeta7.setBackground(new java.awt.Color(66, 66, 66));
        tarjeta7.setPreferredSize(new java.awt.Dimension(230, 250));
        tarjeta7.setLayout(new java.awt.BorderLayout());

        lblProducto7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblProducto7.setForeground(new java.awt.Color(255, 255, 255));
        lblProducto7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProducto7.setText("Producto 7");
        tarjeta7.add(lblProducto7, java.awt.BorderLayout.CENTER);

        btnAgregar7.setBackground(new java.awt.Color(255, 102, 0));
        btnAgregar7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregar7.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar7.setText("Agregar al carrito");
        tarjeta7.add(btnAgregar7, java.awt.BorderLayout.SOUTH);

        panelProductos.add(tarjeta7);

        tarjeta8.setBackground(new java.awt.Color(66, 66, 66));
        tarjeta8.setPreferredSize(new java.awt.Dimension(230, 250));
        tarjeta8.setLayout(new java.awt.BorderLayout());

        lblProducto8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblProducto8.setForeground(new java.awt.Color(255, 255, 255));
        lblProducto8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProducto8.setText("Producto 8");
        tarjeta8.add(lblProducto8, java.awt.BorderLayout.CENTER);

        btnAgregar8.setBackground(new java.awt.Color(255, 102, 0));
        btnAgregar8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregar8.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar8.setText("Agregar al carrito");
        tarjeta8.add(btnAgregar8, java.awt.BorderLayout.SOUTH);

        panelProductos.add(tarjeta8);

        scrollProductos.setViewportView(panelProductos);

        getContentPane().add(scrollProductos, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new VentanaPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar1;
    private javax.swing.JButton btnAgregar2;
    private javax.swing.JButton btnAgregar3;
    private javax.swing.JButton btnAgregar4;
    private javax.swing.JButton btnAgregar5;
    private javax.swing.JButton btnAgregar6;
    private javax.swing.JButton btnAgregar7;
    private javax.swing.JButton btnAgregar8;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCarrito;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblProducto1;
    private javax.swing.JLabel lblProducto2;
    private javax.swing.JLabel lblProducto3;
    private javax.swing.JLabel lblProducto4;
    private javax.swing.JLabel lblProducto5;
    private javax.swing.JLabel lblProducto6;
    private javax.swing.JLabel lblProducto7;
    private javax.swing.JLabel lblProducto8;
    private javax.swing.JPanel panelDerecha;
    private javax.swing.JPanel panelEncabezado;
    private javax.swing.JPanel panelIzquierda;
    private javax.swing.JPanel panelProductos;
    private javax.swing.JScrollPane scrollProductos;
    private javax.swing.JPanel tarjeta1;
    private javax.swing.JPanel tarjeta2;
    private javax.swing.JPanel tarjeta3;
    private javax.swing.JPanel tarjeta4;
    private javax.swing.JPanel tarjeta5;
    private javax.swing.JPanel tarjeta6;
    private javax.swing.JPanel tarjeta7;
    private javax.swing.JPanel tarjeta8;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
