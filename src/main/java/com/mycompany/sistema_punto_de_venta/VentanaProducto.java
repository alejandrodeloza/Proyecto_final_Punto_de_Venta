package com.mycompany.sistema_punto_de_venta;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 * Ventana de detalle de un producto de CyberVentana.
 */
public class VentanaProducto extends javax.swing.JFrame {

    private Producto producto;   // producto que se está mostrando
    private int cantidad = 1;    // cantidad que se agregará al carrito

    // Constructor vacío (para que funcione el diseñador de NetBeans)
    public VentanaProducto() {
        initComponents();
        setLocationRelativeTo(null);
        // Hace que la rueda del ratón desplace más rápido
        scrollProducto.getVerticalScrollBar().setUnitIncrement(16);
    }

    // Constructor para abrir la ventana con un producto: new VentanaProducto(p).setVisible(true);
    public VentanaProducto(Producto p) {
        this();
        mostrarProducto(p);
        cargarMasProductos(Sistema_Punto_de_Venta.productos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEncabezado = new javax.swing.JPanel();
        panelIzquierda = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        panelDerecha = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        btnCarrito = new javax.swing.JButton();
        scrollProducto = new javax.swing.JScrollPane();
        panelContenido = new javax.swing.JPanel();
        panelDetalle = new javax.swing.JPanel();
        lblImagen = new javax.swing.JLabel();
        panelInfo = new javax.swing.JPanel();
        panelTitulos = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblDisponibles = new javax.swing.JLabel();
        panelDescripcion = new javax.swing.JPanel();
        txaDescripcion = new javax.swing.JTextArea();
        panelCompra = new javax.swing.JPanel();
        lblCantidadTexto = new javax.swing.JLabel();
        btnMenos = new javax.swing.JButton();
        lblCantidad = new javax.swing.JLabel();
        btnMas = new javax.swing.JButton();
        btnAgregarCarrito = new javax.swing.JButton();
        btnComprar = new javax.swing.JButton();
        panelMas = new javax.swing.JPanel();
        lblMasProductos = new javax.swing.JLabel();
        panelEnvuelve = new javax.swing.JPanel();
        panelGridMas = new javax.swing.JPanel();
        tarjetaMas1 = new javax.swing.JPanel();
        lblMas1 = new javax.swing.JLabel();
        btnVer1 = new javax.swing.JButton();
        tarjetaMas2 = new javax.swing.JPanel();
        lblMas2 = new javax.swing.JLabel();
        btnVer2 = new javax.swing.JButton();
        tarjetaMas3 = new javax.swing.JPanel();
        lblMas3 = new javax.swing.JLabel();
        btnVer3 = new javax.swing.JButton();
        tarjetaMas4 = new javax.swing.JPanel();
        lblMas4 = new javax.swing.JLabel();
        btnVer4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CyberVentana - Producto");
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
        panelDerecha.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        btnVolver.setBackground(new java.awt.Color(9, 157, 237));
        btnVolver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        panelDerecha.add(btnVolver);

        btnCarrito.setBackground(new java.awt.Color(255, 102, 0));
        btnCarrito.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCarrito.setForeground(new java.awt.Color(255, 255, 255));
        btnCarrito.setText("Carrito");
        btnCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarritoActionPerformed(evt);
            }
        });
        panelDerecha.add(btnCarrito);

        panelEncabezado.add(panelDerecha, java.awt.BorderLayout.EAST);

        getContentPane().add(panelEncabezado, java.awt.BorderLayout.NORTH);

        panelContenido.setBackground(new java.awt.Color(30, 42, 55));
        panelContenido.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panelContenido.setLayout(new java.awt.BorderLayout());

        panelDetalle.setBackground(new java.awt.Color(25, 40, 52));
        panelDetalle.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panelDetalle.setPreferredSize(new java.awt.Dimension(900, 440));
        panelDetalle.setLayout(new java.awt.BorderLayout());

        lblImagen.setBackground(new java.awt.Color(30, 42, 55));
        lblImagen.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblImagen.setForeground(new java.awt.Color(9, 157, 237));
        lblImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagen.setText("Imagen del producto");
        lblImagen.setOpaque(true);
        lblImagen.setPreferredSize(new java.awt.Dimension(420, 400));
        panelDetalle.add(lblImagen, java.awt.BorderLayout.WEST);

        panelInfo.setBackground(new java.awt.Color(25, 40, 52));
        panelInfo.setLayout(new java.awt.BorderLayout());

        panelTitulos.setBackground(new java.awt.Color(25, 40, 52));
        panelTitulos.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelTitulos.setLayout(new java.awt.GridLayout(3, 1));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(9, 157, 237));
        lblNombre.setText("Nombre del producto");
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        panelTitulos.add(lblNombre);

        lblPrecio.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(255, 102, 0));
        lblPrecio.setText("$0.00");
        lblPrecio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        panelTitulos.add(lblPrecio);

        lblDisponibles.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDisponibles.setForeground(new java.awt.Color(9, 157, 237));
        lblDisponibles.setText("Disponibles: 0");
        lblDisponibles.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        panelTitulos.add(lblDisponibles);

        panelInfo.add(panelTitulos, java.awt.BorderLayout.NORTH);

        panelDescripcion.setBackground(new java.awt.Color(25, 40, 52));
        panelDescripcion.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelDescripcion.setLayout(new java.awt.BorderLayout());

        txaDescripcion.setBackground(new java.awt.Color(25, 40, 52));
        txaDescripcion.setForeground(new java.awt.Color(9, 157, 237));
        txaDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txaDescripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(9, 157, 237)));
        txaDescripcion.setMargin(new java.awt.Insets(10, 10, 10, 10));
        txaDescripcion.setEditable(false);
        txaDescripcion.setLineWrap(true);
        txaDescripcion.setWrapStyleWord(true);
        txaDescripcion.setRows(6);
        txaDescripcion.setText("Descripción del producto.");
        txaDescripcion.setPreferredSize(new java.awt.Dimension(300, 120));
        panelDescripcion.add(txaDescripcion, java.awt.BorderLayout.CENTER);

        panelInfo.add(panelDescripcion, java.awt.BorderLayout.CENTER);

        panelCompra.setBackground(new java.awt.Color(25, 40, 52));
        panelCompra.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelCompra.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblCantidadTexto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCantidadTexto.setForeground(new java.awt.Color(9, 157, 237));
        lblCantidadTexto.setText("Cantidad");
        lblCantidadTexto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        panelCompra.add(lblCantidadTexto);

        btnMenos.setBackground(new java.awt.Color(9, 157, 237));
        btnMenos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMenos.setForeground(new java.awt.Color(255, 255, 255));
        btnMenos.setText("-");
        btnMenos.setPreferredSize(new java.awt.Dimension(45, 32));
        btnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosActionPerformed(evt);
            }
        });
        panelCompra.add(btnMenos);

        lblCantidad.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblCantidad.setForeground(new java.awt.Color(9, 157, 237));
        lblCantidad.setText("1");
        lblCantidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantidad.setPreferredSize(new java.awt.Dimension(40, 32));
        panelCompra.add(lblCantidad);

        btnMas.setBackground(new java.awt.Color(9, 157, 237));
        btnMas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMas.setForeground(new java.awt.Color(255, 255, 255));
        btnMas.setText("+");
        btnMas.setPreferredSize(new java.awt.Dimension(45, 32));
        btnMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasActionPerformed(evt);
            }
        });
        panelCompra.add(btnMas);

        btnAgregarCarrito.setBackground(new java.awt.Color(255, 102, 0));
        btnAgregarCarrito.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregarCarrito.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarCarrito.setText("Agregar al carrito");
        btnAgregarCarrito.setPreferredSize(new java.awt.Dimension(200, 40));
        btnAgregarCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCarritoActionPerformed(evt);
            }
        });
        panelCompra.add(btnAgregarCarrito);

        btnComprar.setBackground(new java.awt.Color(9, 157, 237));
        btnComprar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnComprar.setForeground(new java.awt.Color(255, 255, 255));
        btnComprar.setText("Comprar ahora");
        btnComprar.setPreferredSize(new java.awt.Dimension(200, 40));
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });
        panelCompra.add(btnComprar);

        panelInfo.add(panelCompra, java.awt.BorderLayout.SOUTH);

        panelDetalle.add(panelInfo, java.awt.BorderLayout.CENTER);

        panelContenido.add(panelDetalle, java.awt.BorderLayout.NORTH);

        panelMas.setBackground(new java.awt.Color(30, 42, 55));
        panelMas.setLayout(new java.awt.BorderLayout());

        lblMasProductos.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblMasProductos.setForeground(new java.awt.Color(9, 157, 237));
        lblMasProductos.setText("Más productos");
        lblMasProductos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMasProductos.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelMas.add(lblMasProductos, java.awt.BorderLayout.NORTH);

        panelEnvuelve.setBackground(new java.awt.Color(30, 42, 55));
        panelEnvuelve.setLayout(new java.awt.BorderLayout());

        panelGridMas.setBackground(new java.awt.Color(30, 42, 55));
        panelGridMas.setLayout(new java.awt.GridLayout(0, 4));

        tarjetaMas1.setBackground(new java.awt.Color(25, 40, 52));
        tarjetaMas1.setPreferredSize(new java.awt.Dimension(230, 250));
        tarjetaMas1.setLayout(new java.awt.BorderLayout());

        lblMas1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblMas1.setForeground(new java.awt.Color(9, 157, 237));
        lblMas1.setText("Producto 1");
        lblMas1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tarjetaMas1.add(lblMas1, java.awt.BorderLayout.CENTER);

        btnVer1.setBackground(new java.awt.Color(9, 157, 237));
        btnVer1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVer1.setForeground(new java.awt.Color(255, 255, 255));
        btnVer1.setText("Ver producto");
        tarjetaMas1.add(btnVer1, java.awt.BorderLayout.SOUTH);

        panelGridMas.add(tarjetaMas1);

        tarjetaMas2.setBackground(new java.awt.Color(25, 40, 52));
        tarjetaMas2.setPreferredSize(new java.awt.Dimension(230, 250));
        tarjetaMas2.setLayout(new java.awt.BorderLayout());

        lblMas2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblMas2.setForeground(new java.awt.Color(9, 157, 237));
        lblMas2.setText("Producto 2");
        lblMas2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tarjetaMas2.add(lblMas2, java.awt.BorderLayout.CENTER);

        btnVer2.setBackground(new java.awt.Color(9, 157, 237));
        btnVer2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVer2.setForeground(new java.awt.Color(255, 255, 255));
        btnVer2.setText("Ver producto");
        tarjetaMas2.add(btnVer2, java.awt.BorderLayout.SOUTH);

        panelGridMas.add(tarjetaMas2);

        tarjetaMas3.setBackground(new java.awt.Color(25, 40, 52));
        tarjetaMas3.setPreferredSize(new java.awt.Dimension(230, 250));
        tarjetaMas3.setLayout(new java.awt.BorderLayout());

        lblMas3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblMas3.setForeground(new java.awt.Color(9, 157, 237));
        lblMas3.setText("Producto 3");
        lblMas3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tarjetaMas3.add(lblMas3, java.awt.BorderLayout.CENTER);

        btnVer3.setBackground(new java.awt.Color(9, 157, 237));
        btnVer3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVer3.setForeground(new java.awt.Color(255, 255, 255));
        btnVer3.setText("Ver producto");
        tarjetaMas3.add(btnVer3, java.awt.BorderLayout.SOUTH);

        panelGridMas.add(tarjetaMas3);

        tarjetaMas4.setBackground(new java.awt.Color(25, 40, 52));
        tarjetaMas4.setPreferredSize(new java.awt.Dimension(230, 250));
        tarjetaMas4.setLayout(new java.awt.BorderLayout());

        lblMas4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblMas4.setForeground(new java.awt.Color(9, 157, 237));
        lblMas4.setText("Producto 4");
        lblMas4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tarjetaMas4.add(lblMas4, java.awt.BorderLayout.CENTER);

        btnVer4.setBackground(new java.awt.Color(9, 157, 237));
        btnVer4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVer4.setForeground(new java.awt.Color(255, 255, 255));
        btnVer4.setText("Ver producto");
        tarjetaMas4.add(btnVer4, java.awt.BorderLayout.SOUTH);

        panelGridMas.add(tarjetaMas4);

        panelEnvuelve.add(panelGridMas, java.awt.BorderLayout.NORTH);

        panelMas.add(panelEnvuelve, java.awt.BorderLayout.CENTER);

        panelContenido.add(panelMas, java.awt.BorderLayout.CENTER);

        scrollProducto.setViewportView(panelContenido);

        getContentPane().add(scrollProducto, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Agrega a carrito y te manda a el
    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        if (producto == null) {
            return;
        }
        if (Sistema_Punto_de_Venta.verificarSesion() == 1) {
            // Usa el método del Cliente: valida que carrito + cantidad no pase del stock
            if (Sistema_Punto_de_Venta.clienteActual.agregarProductoCarrito(producto, cantidad)) {
                JOptionPane.showMessageDialog(this, "Agregado: " + producto.getNombre() + " x" + cantidad);
                new VentanaCarrito().setVisible(true);
            } else {
                int enCarrito = Sistema_Punto_de_Venta.clienteActual.getCarrito().contarCantidadProducto(producto.getIdProducto());
                JOptionPane.showMessageDialog(this, "No hay existencias suficientes. Ya tienes " + enCarrito
                        + " en el carrito y hay " + producto.getStock() + " disponibles.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Inicie sesión para comprar");
        }
    }//GEN-LAST:event_btnComprarActionPerformed

    // Llena la parte de arriba con los datos del producto
    public void mostrarProducto(Producto p) {
        producto = p;
        cantidad = 1;
        lblCantidad.setText("1");
        lblNombre.setText(p.getNombre());
        lblPrecio.setText("$" + String.format("%.2f", p.getPrecio()));
        lblDisponibles.setText("Disponibles: " + p.getStock());
        // Si tu clase Producto tiene descripción, descomenta la siguiente línea:
        // txaDescripcion.setText(p.getDescripcion());
        ImageIcon icono = null;
        if (p.getImagen() != null && !p.getImagen().isEmpty()) {
            icono = cargarImagen(p.getImagen(), 400, 380);
        }
        if (icono != null) {
            lblImagen.setIcon(icono);
            lblImagen.setText("");
        } else {
            lblImagen.setIcon(null);
            lblImagen.setText("Sin imagen");
        }
        setTitle("CyberVentana - " + p.getNombre());
    }

    // Carga una imagen (de src/main/resources o de una ruta) ajustada a un tamaño máximo, sin deformarla
    private ImageIcon cargarImagen(String ruta, int ancho, int alto) {
        try {
            java.net.URL url = getClass().getResource(ruta);
            ImageIcon icono = (url != null) ? new ImageIcon(url) : new ImageIcon(ruta);
            int w = icono.getIconWidth();
            int h = icono.getIconHeight();
            if (w <= 0 || h <= 0) {
                return null;
            }
            double escala = Math.min((double) ancho / w, (double) alto / h);
            Image img = icono.getImage().getScaledInstance((int) (w * escala), (int) (h * escala), Image.SCALE_SMOOTH);
            return new ImageIcon(img);
        } catch (Exception ex) {
            return null;
        }
    }

    // Llena la parte de abajo con tarjetas pequeñas de los demás productos
    public void cargarMasProductos(ArrayList<Producto> productos) {
        // Quita las tarjetas de ejemplo
        panelGridMas.removeAll();

        for (Producto p : productos) {
            // No se muestra el producto actual ni los dados de baja
            if (p == producto || p.getStock() <= 0) {
                continue;
            }

            JPanel tarjeta = new JPanel();
            tarjeta.setBackground(new Color(25, 40, 52));
            tarjeta.setPreferredSize(new Dimension(230, 250));
            tarjeta.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            tarjeta.setLayout(new BorderLayout(5, 5));

            // Imagen (arriba)
            JLabel lblImg = new JLabel();
            lblImg.setHorizontalAlignment(SwingConstants.CENTER);
            ImageIcon icono = (p.getImagen() != null && !p.getImagen().isEmpty()) ? cargarImagen(p.getImagen(), 110, 110) : null;
            if (icono != null) {
                lblImg.setIcon(icono);
            } else {
                lblImg.setText("Sin imagen");
                lblImg.setForeground(new Color(9, 157, 237));
            }

            // Nombre y precio (centro)
            String infoHtml = "<html><center>"
                    + p.getNombre() + "<br>"
                    + "<span style='color:#ff6600; font-size:14px;'>$" + String.format("%.2f", p.getPrecio()) + "</span>"
                    + "</center></html>";
            JLabel lblInfo = new JLabel(infoHtml);
            lblInfo.setFont(new Font("Segoe UI", Font.BOLD, 15));
            lblInfo.setForeground(new Color(9, 157, 237));
            lblInfo.setHorizontalAlignment(SwingConstants.CENTER);

            // Botón (abajo): abre la ventana de ese producto y cierra la actual
            JButton btnVer = new JButton("Ver producto");
            btnVer.setBackground(new Color(9, 157, 237));
            btnVer.setFont(new Font("Segoe UI", Font.BOLD, 14));
            btnVer.setForeground(Color.WHITE);
            btnVer.setFocusPainted(false);
            btnVer.addActionListener(e -> {
                new VentanaProducto(p).setVisible(true);
                dispose();
            });

            tarjeta.add(lblImg, BorderLayout.NORTH);
            tarjeta.add(lblInfo, BorderLayout.CENTER);
            tarjeta.add(btnVer, BorderLayout.SOUTH);
            panelGridMas.add(tarjeta);
        }

        panelGridMas.revalidate();
        panelGridMas.repaint();
    }

    // Botón Volver: cierra esta ventana
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }

    // Botón Carrito: solo si hay sesión iniciada
    private void btnCarritoActionPerformed(java.awt.event.ActionEvent evt) {
        if (Sistema_Punto_de_Venta.verificarSesion() == 1) {
            java.awt.EventQueue.invokeLater(() -> new VentanaCarrito().setVisible(true));
        } else {
            JOptionPane.showMessageDialog(this, "Inicie sesión para ver el carrito");
        }
    }

    // Botón +: sube la cantidad (sin pasar de las existencias)
    private void btnMasActionPerformed(java.awt.event.ActionEvent evt) {
        int maximo = (producto != null) ? producto.getStock() : 99;
        if (cantidad < maximo) {
            cantidad++;
            lblCantidad.setText(String.valueOf(cantidad));
        }
    }

    // Botón -: baja la cantidad (mínimo 1)
    private void btnMenosActionPerformed(java.awt.event.ActionEvent evt) {
        if (cantidad > 1) {
            cantidad--;
            lblCantidad.setText(String.valueOf(cantidad));
        }
    }

    // Botón Agregar al carrito
    private void btnAgregarCarritoActionPerformed(java.awt.event.ActionEvent evt) {
         if (producto == null) {
            return;
        }
        if (Sistema_Punto_de_Venta.verificarSesion() == 1) {
            // Usa el método del Cliente: valida que carrito + cantidad no pase del stock
            if (Sistema_Punto_de_Venta.clienteActual.agregarProductoCarrito(producto, cantidad)) {
                JOptionPane.showMessageDialog(this, "Agregado: " + producto.getNombre() + " x" + cantidad);
            } else {
                int enCarrito = Sistema_Punto_de_Venta.clienteActual.getCarrito().contarCantidadProducto(producto.getIdProducto());
                JOptionPane.showMessageDialog(this, "No hay existencias suficientes. Ya tienes " + enCarrito
                        + " en el carrito y hay " + producto.getStock() + " disponibles.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Inicie sesión para agregar a carrito");
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            VentanaProducto ventana = new VentanaProducto();
            if (!Sistema_Punto_de_Venta.productos.isEmpty()) {
                ventana.mostrarProducto(Sistema_Punto_de_Venta.productos.get(0));
                ventana.cargarMasProductos(Sistema_Punto_de_Venta.productos);
            }
            ventana.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JButton btnAgregarCarrito;
    private javax.swing.JButton btnCarrito;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnMas;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnVer1;
    private javax.swing.JButton btnVer2;
    private javax.swing.JButton btnVer3;
    private javax.swing.JButton btnVer4;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCantidadTexto;
    private javax.swing.JLabel lblDisponibles;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblMas1;
    private javax.swing.JLabel lblMas2;
    private javax.swing.JLabel lblMas3;
    private javax.swing.JLabel lblMas4;
    private javax.swing.JLabel lblMasProductos;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JPanel panelCompra;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JPanel panelDerecha;
    private javax.swing.JPanel panelDescripcion;
    private javax.swing.JPanel panelDetalle;
    private javax.swing.JPanel panelEncabezado;
    private javax.swing.JPanel panelEnvuelve;
    private javax.swing.JPanel panelGridMas;
    private javax.swing.JPanel panelInfo;
    private javax.swing.JPanel panelIzquierda;
    private javax.swing.JPanel panelMas;
    private javax.swing.JPanel panelTitulos;
    private javax.swing.JScrollPane scrollProducto;
    private javax.swing.JPanel tarjetaMas1;
    private javax.swing.JPanel tarjetaMas2;
    private javax.swing.JPanel tarjetaMas3;
    private javax.swing.JPanel tarjetaMas4;
    private javax.swing.JTextArea txaDescripcion;
    // End of variables declaration//GEN-END:variables
}
