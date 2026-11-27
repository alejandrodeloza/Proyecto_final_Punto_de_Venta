package com.mycompany.sistema_punto_de_venta;
/*
 * CyberVentana - ventana del carrito
 */


/**
 * Ventana del carrito de compras de CyberVentana.
 */
public class VentanaCarrito extends javax.swing.JFrame {

    public VentanaCarrito() {
        initComponents();
        setLocationRelativeTo(null);
        // Hace que la rueda del ratón desplace más rápido
        scrollItems.getVerticalScrollBar().setUnitIncrement(16);
        cargarCarrito();
    }
    
      // Reconstruye las tarjetas y los totales a partir del carrito del cliente actual
    private void cargarCarrito() {
        panelItems.removeAll();

        Cliente cliente = Sistema_Punto_de_Venta.clienteActual;
        if (cliente == null) {
            return;
        }
        Carrito carrito = cliente.getCarrito();

        // Agrupa las unidades repetidas: un producto = una tarjeta
        java.util.LinkedHashMap<String, Producto> unicos = new java.util.LinkedHashMap<>();
        for (Producto p : carrito.getProductosCarrito()) {
            unicos.putIfAbsent(p.getIdProducto(), p);
        }

        if (unicos.isEmpty()) {
            javax.swing.JLabel vacio = new javax.swing.JLabel("Tu carrito está vacío", javax.swing.SwingConstants.CENTER);
            vacio.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 18));
            vacio.setForeground(java.awt.Color.WHITE);
            panelItems.add(vacio);
        }

        for (Producto p : unicos.values()) {
            final String id = p.getIdProducto();
            int cantidad = carrito.contarCantidadProducto(id);

            javax.swing.JPanel tarjeta = new javax.swing.JPanel(new java.awt.BorderLayout());
            tarjeta.setBackground(new java.awt.Color(30, 42, 55));
            tarjeta.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
            tarjeta.setPreferredSize(new java.awt.Dimension(600, 80));

            javax.swing.JLabel lblNombre = new javax.swing.JLabel(p.getNombre());
            lblNombre.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 16));
            lblNombre.setForeground(java.awt.Color.WHITE);
            tarjeta.add(lblNombre, java.awt.BorderLayout.CENTER);

            javax.swing.JPanel acciones = new javax.swing.JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));
            acciones.setBackground(new java.awt.Color(30, 42, 55));

            // Botón "-" : quita una unidad
            javax.swing.JButton btnMenos = new javax.swing.JButton("-");
            btnMenos.setBackground(new java.awt.Color(0, 92, 184));
            btnMenos.setForeground(java.awt.Color.WHITE);
            btnMenos.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
            btnMenos.setPreferredSize(new java.awt.Dimension(45, 30));
            btnMenos.addActionListener(e -> {
                carrito.reducirUnidad(id);
                cargarCarrito();
            });
            acciones.add(btnMenos);

            javax.swing.JLabel lblCant = new javax.swing.JLabel(String.valueOf(cantidad), javax.swing.SwingConstants.CENTER);
            lblCant.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 16));
            lblCant.setForeground(java.awt.Color.WHITE);
            lblCant.setPreferredSize(new java.awt.Dimension(40, 30));
            acciones.add(lblCant);

            // Botón "+" : agrega una unidad (valida el stock)
            javax.swing.JButton btnMas = new javax.swing.JButton("+");
            btnMas.setBackground(new java.awt.Color(0, 92, 184));
            btnMas.setForeground(java.awt.Color.WHITE);
            btnMas.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
            btnMas.setPreferredSize(new java.awt.Dimension(45, 30));
            btnMas.addActionListener(e -> {
                if (!carrito.aumentarUnidad(id)) {
                    javax.swing.JOptionPane.showMessageDialog(this, "No hay más existencias de " + p.getNombre());
                }
                cargarCarrito();
            });
            acciones.add(btnMas);

            // Precio de la línea = precio unitario x cantidad
            javax.swing.JLabel lblPrecio = new javax.swing.JLabel("$" + String.format("%.2f", p.getPrecio() * cantidad),
                    javax.swing.SwingConstants.RIGHT);
            lblPrecio.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 16));
            lblPrecio.setForeground(java.awt.Color.WHITE);
            lblPrecio.setPreferredSize(new java.awt.Dimension(120, 30));
            acciones.add(lblPrecio);

            // Botón Eliminar : quita todas las unidades del producto
            javax.swing.JButton btnEliminar = new javax.swing.JButton("Eliminar");
            btnEliminar.setBackground(new java.awt.Color(110, 110, 110));
            btnEliminar.setForeground(java.awt.Color.WHITE);
            btnEliminar.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 13));
            btnEliminar.addActionListener(e -> {
                carrito.eliminarProducto(id);
                cargarCarrito();
            });
            acciones.add(btnEliminar);

            tarjeta.add(acciones, java.awt.BorderLayout.EAST);
            panelItems.add(tarjeta);
        }

        // Totales del resumen
        double total = carrito.calcularTotal();
        lblTotalProductosValor.setText(String.valueOf(carrito.getProductosCarrito().size()));
        lblEnvioValor.setText("$0.00");
        lblSubtotalValor.setText("$" + String.format("%.2f", total));
        lblTotalValor.setText("$" + String.format("%.2f", total));

        panelItems.revalidate();
        panelItems.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEncabezado = new javax.swing.JPanel();
        panelIzquierda = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        panelDerecha = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        scrollItems = new javax.swing.JScrollPane();
        panelContenedor = new javax.swing.JPanel();
        panelItems = new javax.swing.JPanel();
        tarjetaItem1 = new javax.swing.JPanel();
        lblNombreItem1 = new javax.swing.JLabel();
        panelAcciones1 = new javax.swing.JPanel();
        btnMenos1 = new javax.swing.JButton();
        lblCantidad1 = new javax.swing.JLabel();
        btnMas1 = new javax.swing.JButton();
        lblPrecioItem1 = new javax.swing.JLabel();
        btnEliminar1 = new javax.swing.JButton();
        tarjetaItem2 = new javax.swing.JPanel();
        lblNombreItem2 = new javax.swing.JLabel();
        panelAcciones2 = new javax.swing.JPanel();
        btnMenos2 = new javax.swing.JButton();
        lblCantidad2 = new javax.swing.JLabel();
        btnMas2 = new javax.swing.JButton();
        lblPrecioItem2 = new javax.swing.JLabel();
        btnEliminar2 = new javax.swing.JButton();
        tarjetaItem3 = new javax.swing.JPanel();
        lblNombreItem3 = new javax.swing.JLabel();
        panelAcciones3 = new javax.swing.JPanel();
        btnMenos3 = new javax.swing.JButton();
        lblCantidad3 = new javax.swing.JLabel();
        btnMas3 = new javax.swing.JButton();
        lblPrecioItem3 = new javax.swing.JLabel();
        btnEliminar3 = new javax.swing.JButton();
        panelLateral = new javax.swing.JPanel();
        panelResumen = new javax.swing.JPanel();
        panelTotales = new javax.swing.JPanel();
        lblTotalProductosTexto = new javax.swing.JLabel();
        lblTotalProductosValor = new javax.swing.JLabel();
        lblEnvioTexto = new javax.swing.JLabel();
        lblEnvioValor = new javax.swing.JLabel();
        lblSubtotalTexto = new javax.swing.JLabel();
        lblSubtotalValor = new javax.swing.JLabel();
        lblTotalTexto = new javax.swing.JLabel();
        lblTotalValor = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CyberVentana - Carrito");
        setExtendedState(6);

        panelEncabezado.setBackground(new java.awt.Color(30, 42, 55));
        panelEncabezado.setLayout(new java.awt.BorderLayout());

        panelIzquierda.setBackground(new java.awt.Color(30, 42, 55));
        panelIzquierda.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CyberVentana (3).png"))); // NOI18N
        Logo.setPreferredSize(new java.awt.Dimension(300, 70));
        panelIzquierda.add(Logo);

        panelEncabezado.add(panelIzquierda, java.awt.BorderLayout.WEST);

        panelDerecha.setBackground(new java.awt.Color(30, 42, 55));
        panelDerecha.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 25));

        btnVolver.setBackground(new java.awt.Color(0, 92, 184));
        btnVolver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Seguir comprando");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        panelDerecha.add(btnVolver);

        panelEncabezado.add(panelDerecha, java.awt.BorderLayout.EAST);

        lblTitulo.setBackground(new java.awt.Color(30, 42, 55));
        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Carrito de compras");
        panelEncabezado.add(lblTitulo, java.awt.BorderLayout.CENTER);

        getContentPane().add(panelEncabezado, java.awt.BorderLayout.NORTH);

        panelContenedor.setBackground(new java.awt.Color(22, 28, 36));
        panelContenedor.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panelContenedor.setLayout(new java.awt.BorderLayout());

        panelItems.setBackground(new java.awt.Color(45, 45, 45));
        panelItems.setLayout(new java.awt.GridLayout(0, 1));

        tarjetaItem1.setBackground(new java.awt.Color(30, 42, 55));
        tarjetaItem1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        tarjetaItem1.setPreferredSize(new java.awt.Dimension(600, 80));
        tarjetaItem1.setLayout(new java.awt.BorderLayout());

        lblNombreItem1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblNombreItem1.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreItem1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNombreItem1.setText("Producto 1");
        tarjetaItem1.add(lblNombreItem1, java.awt.BorderLayout.CENTER);

        panelAcciones1.setBackground(new java.awt.Color(30, 42, 55));
        panelAcciones1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        btnMenos1.setBackground(new java.awt.Color(0, 92, 184));
        btnMenos1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMenos1.setForeground(new java.awt.Color(255, 255, 255));
        btnMenos1.setText("-");
        btnMenos1.setPreferredSize(new java.awt.Dimension(45, 30));
        panelAcciones1.add(btnMenos1);

        lblCantidad1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblCantidad1.setForeground(new java.awt.Color(255, 255, 255));
        lblCantidad1.setText("1");
        lblCantidad1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantidad1.setPreferredSize(new java.awt.Dimension(40, 30));
        panelAcciones1.add(lblCantidad1);

        btnMas1.setBackground(new java.awt.Color(0, 92, 184));
        btnMas1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMas1.setForeground(new java.awt.Color(255, 255, 255));
        btnMas1.setText("+");
        btnMas1.setPreferredSize(new java.awt.Dimension(45, 30));
        btnMas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMas1ActionPerformed(evt);
            }
        });
        panelAcciones1.add(btnMas1);

        lblPrecioItem1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblPrecioItem1.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecioItem1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPrecioItem1.setText("$0.00");
        lblPrecioItem1.setPreferredSize(new java.awt.Dimension(120, 30));
        panelAcciones1.add(lblPrecioItem1);

        btnEliminar1.setBackground(new java.awt.Color(110, 110, 110));
        btnEliminar1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnEliminar1.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar1.setText("Eliminar");
        panelAcciones1.add(btnEliminar1);

        tarjetaItem1.add(panelAcciones1, java.awt.BorderLayout.EAST);

        panelItems.add(tarjetaItem1);

        tarjetaItem2.setBackground(new java.awt.Color(30, 42, 55));
        tarjetaItem2.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        tarjetaItem2.setPreferredSize(new java.awt.Dimension(600, 80));
        tarjetaItem2.setLayout(new java.awt.BorderLayout());

        lblNombreItem2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblNombreItem2.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreItem2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNombreItem2.setText("Producto 2");
        tarjetaItem2.add(lblNombreItem2, java.awt.BorderLayout.CENTER);

        panelAcciones2.setBackground(new java.awt.Color(30, 42, 55));
        panelAcciones2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        btnMenos2.setBackground(new java.awt.Color(0, 92, 184));
        btnMenos2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMenos2.setForeground(new java.awt.Color(255, 255, 255));
        btnMenos2.setText("-");
        btnMenos2.setPreferredSize(new java.awt.Dimension(45, 30));
        panelAcciones2.add(btnMenos2);

        lblCantidad2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblCantidad2.setForeground(new java.awt.Color(255, 255, 255));
        lblCantidad2.setText("1");
        lblCantidad2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantidad2.setPreferredSize(new java.awt.Dimension(40, 30));
        panelAcciones2.add(lblCantidad2);

        btnMas2.setBackground(new java.awt.Color(0, 92, 184));
        btnMas2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMas2.setForeground(new java.awt.Color(255, 255, 255));
        btnMas2.setText("+");
        btnMas2.setPreferredSize(new java.awt.Dimension(45, 30));
        panelAcciones2.add(btnMas2);

        lblPrecioItem2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblPrecioItem2.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecioItem2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPrecioItem2.setText("$0.00");
        lblPrecioItem2.setPreferredSize(new java.awt.Dimension(120, 30));
        panelAcciones2.add(lblPrecioItem2);

        btnEliminar2.setBackground(new java.awt.Color(110, 110, 110));
        btnEliminar2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnEliminar2.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar2.setText("Eliminar");
        panelAcciones2.add(btnEliminar2);

        tarjetaItem2.add(panelAcciones2, java.awt.BorderLayout.EAST);

        panelItems.add(tarjetaItem2);

        tarjetaItem3.setBackground(new java.awt.Color(30, 42, 55));
        tarjetaItem3.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        tarjetaItem3.setPreferredSize(new java.awt.Dimension(600, 80));
        tarjetaItem3.setLayout(new java.awt.BorderLayout());

        lblNombreItem3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblNombreItem3.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreItem3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNombreItem3.setText("Producto 3");
        tarjetaItem3.add(lblNombreItem3, java.awt.BorderLayout.CENTER);

        panelAcciones3.setBackground(new java.awt.Color(30, 42, 55));
        panelAcciones3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        btnMenos3.setBackground(new java.awt.Color(0, 92, 184));
        btnMenos3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMenos3.setForeground(new java.awt.Color(255, 255, 255));
        btnMenos3.setText("-");
        btnMenos3.setPreferredSize(new java.awt.Dimension(45, 30));
        panelAcciones3.add(btnMenos3);

        lblCantidad3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblCantidad3.setForeground(new java.awt.Color(255, 255, 255));
        lblCantidad3.setText("1");
        lblCantidad3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantidad3.setPreferredSize(new java.awt.Dimension(40, 30));
        panelAcciones3.add(lblCantidad3);

        btnMas3.setBackground(new java.awt.Color(0, 92, 184));
        btnMas3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMas3.setForeground(new java.awt.Color(255, 255, 255));
        btnMas3.setText("+");
        btnMas3.setPreferredSize(new java.awt.Dimension(45, 30));
        panelAcciones3.add(btnMas3);

        lblPrecioItem3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblPrecioItem3.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecioItem3.setText("$0.00");
        lblPrecioItem3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPrecioItem3.setPreferredSize(new java.awt.Dimension(120, 30));
        panelAcciones3.add(lblPrecioItem3);

        btnEliminar3.setBackground(new java.awt.Color(110, 110, 110));
        btnEliminar3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnEliminar3.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar3.setText("Eliminar");
        panelAcciones3.add(btnEliminar3);

        tarjetaItem3.add(panelAcciones3, java.awt.BorderLayout.EAST);

        panelItems.add(tarjetaItem3);

        panelContenedor.add(panelItems, java.awt.BorderLayout.NORTH);

        scrollItems.setViewportView(panelContenedor);

        getContentPane().add(scrollItems, java.awt.BorderLayout.CENTER);

        panelLateral.setBackground(new java.awt.Color(22, 28, 36));
        panelLateral.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panelLateral.setLayout(new java.awt.BorderLayout());

        panelResumen.setBackground(new java.awt.Color(30, 42, 55));
        panelResumen.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panelResumen.setPreferredSize(new java.awt.Dimension(340, 260));
        panelResumen.setLayout(new java.awt.BorderLayout());

        panelTotales.setBackground(new java.awt.Color(30, 42, 55));
        panelTotales.setLayout(new java.awt.GridLayout(4, 2));

        lblTotalProductosTexto.setBackground(new java.awt.Color(30, 42, 55));
        lblTotalProductosTexto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTotalProductosTexto.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalProductosTexto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTotalProductosTexto.setText("Total de productos");
        panelTotales.add(lblTotalProductosTexto);

        lblTotalProductosValor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTotalProductosValor.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalProductosValor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotalProductosValor.setText("$0.00");
        panelTotales.add(lblTotalProductosValor);

        lblEnvioTexto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEnvioTexto.setForeground(new java.awt.Color(255, 255, 255));
        lblEnvioTexto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblEnvioTexto.setText("Costo de envío");
        panelTotales.add(lblEnvioTexto);

        lblEnvioValor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEnvioValor.setForeground(new java.awt.Color(255, 255, 255));
        lblEnvioValor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEnvioValor.setText("$0.00");
        panelTotales.add(lblEnvioValor);

        lblSubtotalTexto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSubtotalTexto.setForeground(new java.awt.Color(255, 255, 255));
        lblSubtotalTexto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSubtotalTexto.setText("Subtotal");
        panelTotales.add(lblSubtotalTexto);

        lblSubtotalValor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSubtotalValor.setForeground(new java.awt.Color(255, 255, 255));
        lblSubtotalValor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSubtotalValor.setText("$0.00");
        panelTotales.add(lblSubtotalValor);

        lblTotalTexto.setBackground(new java.awt.Color(30, 42, 55));
        lblTotalTexto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTotalTexto.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalTexto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTotalTexto.setText("Total (incl. IVA)");
        panelTotales.add(lblTotalTexto);

        lblTotalValor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTotalValor.setForeground(new java.awt.Color(255, 102, 0));
        lblTotalValor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotalValor.setText("$0.00");
        panelTotales.add(lblTotalValor);

        panelResumen.add(panelTotales, java.awt.BorderLayout.NORTH);

        btnSiguiente.setBackground(new java.awt.Color(255, 102, 0));
        btnSiguiente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        btnSiguiente.setText("Ir al siguiente paso");
        btnSiguiente.setPreferredSize(new java.awt.Dimension(200, 40));
        panelResumen.add(btnSiguiente, java.awt.BorderLayout.SOUTH);

        panelLateral.add(panelResumen, java.awt.BorderLayout.NORTH);

        getContentPane().add(panelLateral, java.awt.BorderLayout.EAST);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnMas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMas1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JButton btnEliminar1;
    private javax.swing.JButton btnEliminar2;
    private javax.swing.JButton btnEliminar3;
    private javax.swing.JButton btnMas1;
    private javax.swing.JButton btnMas2;
    private javax.swing.JButton btnMas3;
    private javax.swing.JButton btnMenos1;
    private javax.swing.JButton btnMenos2;
    private javax.swing.JButton btnMenos3;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel lblCantidad1;
    private javax.swing.JLabel lblCantidad2;
    private javax.swing.JLabel lblCantidad3;
    private javax.swing.JLabel lblEnvioTexto;
    private javax.swing.JLabel lblEnvioValor;
    private javax.swing.JLabel lblNombreItem1;
    private javax.swing.JLabel lblNombreItem2;
    private javax.swing.JLabel lblNombreItem3;
    private javax.swing.JLabel lblPrecioItem1;
    private javax.swing.JLabel lblPrecioItem2;
    private javax.swing.JLabel lblPrecioItem3;
    private javax.swing.JLabel lblSubtotalTexto;
    private javax.swing.JLabel lblSubtotalValor;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTotalProductosTexto;
    private javax.swing.JLabel lblTotalProductosValor;
    private javax.swing.JLabel lblTotalTexto;
    private javax.swing.JLabel lblTotalValor;
    private javax.swing.JPanel panelAcciones1;
    private javax.swing.JPanel panelAcciones2;
    private javax.swing.JPanel panelAcciones3;
    private javax.swing.JPanel panelContenedor;
    private javax.swing.JPanel panelDerecha;
    private javax.swing.JPanel panelEncabezado;
    private javax.swing.JPanel panelItems;
    private javax.swing.JPanel panelIzquierda;
    private javax.swing.JPanel panelLateral;
    private javax.swing.JPanel panelResumen;
    private javax.swing.JPanel panelTotales;
    private javax.swing.JScrollPane scrollItems;
    private javax.swing.JPanel tarjetaItem1;
    private javax.swing.JPanel tarjetaItem2;
    private javax.swing.JPanel tarjetaItem3;
    // End of variables declaration//GEN-END:variables
}
