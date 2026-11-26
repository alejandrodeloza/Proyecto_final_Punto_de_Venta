/*
 * CyberVentana - ventana principal
 */
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
 * Ventana principal de CyberVentana.
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    private Sistema_Punto_de_Venta sistema;
    private Usuario usuarioActivo = null;

    // Constructor vacío (crea un sistema nuevo si ejecutas esta ventana sola)
    public VentanaPrincipal() {
        this(new Sistema_Punto_de_Venta());
    }

    // Constructor principal que recibe el sistema compartido
    public VentanaPrincipal(Sistema_Punto_de_Venta sistema) {
        initComponents();
        this.sistema = sistema;
        setLocationRelativeTo(null);
        cargarProductos(Sistema_Punto_de_Venta.productos);
        // Hace que la rueda del ratón desplace más rápido
        scrollProductos.getVerticalScrollBar().setUnitIncrement(16);
    }
   
//para guardar el usuario 
    public void guardarUsuarioActivo(Usuario u) {
    this.usuarioActivo = u;
    btnIniciarSesion.setText("Mi Cuenta");
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEncabezado = new javax.swing.JPanel();
        panelIzquierda = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
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

        panelEncabezado.setBackground(new java.awt.Color(30, 42, 55));
        panelEncabezado.setLayout(new java.awt.BorderLayout());

        panelIzquierda.setBackground(new java.awt.Color(30, 42, 55));
        panelIzquierda.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CyberVentana (3).png"))); // NOI18N
        Logo.setPreferredSize(new java.awt.Dimension(300, 70));
        panelIzquierda.add(Logo);

        txtBuscar.setBackground(new java.awt.Color(30, 42, 55));
        txtBuscar.setColumns(30);
        txtBuscar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(255, 255, 255));
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        panelIzquierda.add(txtBuscar);

        btnBuscar.setBackground(new java.awt.Color(0, 168, 254));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(30, 42, 55));
        btnBuscar.setText("Buscar");
        panelIzquierda.add(btnBuscar);

        panelEncabezado.add(panelIzquierda, java.awt.BorderLayout.WEST);

        panelDerecha.setBackground(new java.awt.Color(30, 42, 55));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 18);
        flowLayout1.setAlignOnBaseline(true);
        panelDerecha.setLayout(flowLayout1);

        btnIniciarSesion.setBackground(new java.awt.Color(0, 168, 254));
        btnIniciarSesion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(30, 42, 55));
        btnIniciarSesion.setText("Iniciar sesión");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        panelDerecha.add(btnIniciarSesion);

        btnCarrito.setBackground(new java.awt.Color(255, 102, 0));
        btnCarrito.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCarrito.setForeground(new java.awt.Color(255, 255, 255));
        btnCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Carrito.png"))); // NOI18N
        btnCarrito.setMaximumSize(new java.awt.Dimension(42, 42));
        btnCarrito.setMinimumSize(new java.awt.Dimension(42, 42));
        btnCarrito.setPreferredSize(new java.awt.Dimension(42, 42));
        btnCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarritoActionPerformed(evt);
            }
        });
        panelDerecha.add(btnCarrito);

        panelEncabezado.add(panelDerecha, java.awt.BorderLayout.CENTER);

        getContentPane().add(panelEncabezado, java.awt.BorderLayout.NORTH);

        panelProductos.setBackground(new java.awt.Color(22, 28, 36));
        panelProductos.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panelProductos.setLayout(new java.awt.GridLayout(0, 4, 15, 15));

        tarjeta1.setBackground(new java.awt.Color(66, 66, 66));
        tarjeta1.setPreferredSize(new java.awt.Dimension(230, 250));
        tarjeta1.setLayout(new java.awt.BorderLayout());

        lblProducto1.setBackground(new java.awt.Color(30, 42, 55));
        lblProducto1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblProducto1.setForeground(new java.awt.Color(255, 255, 255));
        lblProducto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProducto1.setText("Producto 1");
        tarjeta1.add(lblProducto1, java.awt.BorderLayout.CENTER);

        btnAgregar1.setBackground(new java.awt.Color(255, 102, 0));
        btnAgregar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregar1.setForeground(new java.awt.Color(28, 34, 41));
        btnAgregar1.setText("Agregar al carrito");
        tarjeta1.add(btnAgregar1, java.awt.BorderLayout.SOUTH);

        panelProductos.add(tarjeta1);

        tarjeta2.setBackground(new java.awt.Color(66, 66, 66));
        tarjeta2.setPreferredSize(new java.awt.Dimension(230, 250));
        tarjeta2.setLayout(new java.awt.BorderLayout());

        lblProducto2.setBackground(new java.awt.Color(30, 42, 55));
        lblProducto2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblProducto2.setForeground(new java.awt.Color(255, 255, 255));
        lblProducto2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProducto2.setText("Producto 2");
        tarjeta2.add(lblProducto2, java.awt.BorderLayout.CENTER);

        btnAgregar2.setBackground(new java.awt.Color(255, 102, 0));
        btnAgregar2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregar2.setForeground(new java.awt.Color(28, 34, 41));
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
        btnAgregar3.setForeground(new java.awt.Color(28, 34, 41));
        btnAgregar3.setText("Agregar al carrito");
        btnAgregar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar3ActionPerformed(evt);
            }
        });
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
        btnAgregar4.setForeground(new java.awt.Color(28, 34, 41));
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
        btnAgregar5.setForeground(new java.awt.Color(28, 34, 41));
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
        btnAgregar6.setForeground(new java.awt.Color(28, 34, 41));
        btnAgregar6.setText("Agregar al carrito");
        btnAgregar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar6ActionPerformed(evt);
            }
        });
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
        btnAgregar7.setForeground(new java.awt.Color(28, 34, 41));
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
        btnAgregar8.setForeground(new java.awt.Color(28, 34, 41));
        btnAgregar8.setText("Agregar al carrito");
        tarjeta8.add(btnAgregar8, java.awt.BorderLayout.SOUTH);

        panelProductos.add(tarjeta8);

        scrollProductos.setViewportView(panelProductos);

        getContentPane().add(scrollProductos, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Evento boton de inicio de sesión
    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        if (usuarioActivo == null) {
            // si no ha iniciado sesión, abre la ventana InicioSesion
            InicioSesion login = new InicioSesion(sistema, this);
            login.setVisible(true);
        } else {
            // si ya inició sesión, abre la ventana VentanaDatosCuenta
            VentanaDatosCuenta datos = new VentanaDatosCuenta(usuarioActivo);
            datos.setVisible(true);
        }
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new VentanaPrincipal().setVisible(true));
    }

    private void btnCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarritoActionPerformed
        if(Sistema_Punto_de_Venta.verificarSesion()==1)
        java.awt.EventQueue.invokeLater(() -> new VentanaCarrito().setVisible(true));
        else{
             JOptionPane.showMessageDialog(this, "Inicie sesión para agregar a carrito");
        }
    }//GEN-LAST:event_btnCarritoActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btnAgregar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregar6ActionPerformed

    private void btnAgregar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregar3ActionPerformed
 
    public void cargarProductos(ArrayList<Producto> productos) {
        // Elimina las tarjetas de ejemplo 
        panelProductos.removeAll();

        for (Producto p : productos) {
            // Si el producto fue dado de baja (stock == 0), no se muestra
            if (p.getStock() <= 0) {
                continue;
            }

            //Crear tarjeta 
            JPanel tarjeta = new JPanel();
            tarjeta.setBackground(new Color(30,42,55));
            tarjeta.setPreferredSize(new Dimension(230, 250));
            tarjeta.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            tarjeta.setLayout(new BorderLayout(5, 5));

            //Imagen del producto (arriba)
            JLabel lblImagen = new JLabel();
            lblImagen.setHorizontalAlignment(SwingConstants.CENTER);
            if (p.getImagen() != null && !p.getImagen().isEmpty()) {
                try {
                    // Busca la imagen en src/main/resources
                    java.net.URL imgUrl = getClass().getResource(p.getImagen());
                    ImageIcon icono = (imgUrl != null) ? new ImageIcon(imgUrl) : new ImageIcon(p.getImagen());
                    Image imgEscalada = icono.getImage().getScaledInstance(110, 110, Image.SCALE_SMOOTH);
                    lblImagen.setIcon(new ImageIcon(imgEscalada));
                } catch (Exception ex) {
                    lblImagen.setText("Sin imagen");
                    lblImagen.setForeground(Color.LIGHT_GRAY);
                }
            }

            //Información del objeto Producto (centro)
            String infoHtml = "<html><center>"
                    + p.getNombre() + "<br>"
                    + "<span style='color:#ff6600; font-size:14px;'>$" + String.format("%.2f", p.getPrecio()) + "</span><br>"
                    + "<span style='font-size:10px; color:#cccccc;'>Disponibles: " + p.getStock() + "</span>"
                    + "</center></html>";

            JLabel lblProducto = new JLabel(infoHtml);
            lblProducto.setFont(new Font("Segoe UI", Font.BOLD, 15));
            lblProducto.setForeground(Color.WHITE);
            lblProducto.setHorizontalAlignment(SwingConstants.CENTER);

            //Botón "Agregar al carrito" (abajo)
            JButton btnAgregar = new JButton("Agregar al carrito");
            btnAgregar.setBackground(new Color(255, 102, 0));
            btnAgregar.setFont(new Font("Segoe UI", Font.BOLD, 14));
            btnAgregar.setForeground(Color.WHITE);
            btnAgregar.setFocusPainted(false);

            // Evento al presionar el botón de este producto
            btnAgregar.addActionListener(e -> {
                if(Sistema_Punto_de_Venta.verificarSesion()==1)
                    JOptionPane.showMessageDialog(this, "Agregado: " + p.getNombre());
                else{
                     JOptionPane.showMessageDialog(this, "Inicie sesión para agregar a carrito");
                }
                // Aquí puedes agregar 'p' a la lista de tu VentanaCarrito
            });

            //Armar la tarjeta y añadirla al panelProductos
            tarjeta.add(lblImagen, BorderLayout.NORTH);
            tarjeta.add(lblProducto, BorderLayout.CENTER);
            tarjeta.add(btnAgregar, BorderLayout.SOUTH);

            panelProductos.add(tarjeta);
        }

        // Refrescar el contenedor
        panelProductos.revalidate();
        panelProductos.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
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
