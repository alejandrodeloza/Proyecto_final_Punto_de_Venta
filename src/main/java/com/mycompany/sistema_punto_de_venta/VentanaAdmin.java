package com.mycompany.sistema_punto_de_venta;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Ventana del administrador de CyberVentana: tabla de productos, alta y baja.
 */
public class VentanaAdmin extends javax.swing.JFrame {

    // Siguiente ID que se asignará a un producto nuevo
    private int siguienteId = 1;

    public VentanaAdmin() {
        initComponents();
        setLocationRelativeTo(null);
        // Colores del encabezado de la tabla y del área de scroll
        tablaProductos.getTableHeader().setBackground(new java.awt.Color(0, 92, 184));
        tablaProductos.getTableHeader().setForeground(java.awt.Color.WHITE);
        tablaProductos.getTableHeader().setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
        scrollTabla.getViewport().setBackground(new java.awt.Color(66, 66, 66));
        scrollTabla.getVerticalScrollBar().setUnitIncrement(16);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEncabezado = new javax.swing.JPanel();
        panelIzquierda = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        panelDerecha = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        panelCentro = new javax.swing.JPanel();
        scrollTabla = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        panelLateral = new javax.swing.JPanel();
        panelFormulario = new javax.swing.JPanel();
        lblAgregar = new javax.swing.JLabel();
        panelCampos = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblCategoria = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        lblPrecio = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        lblExistencias = new javax.swing.JLabel();
        txtExistencias = new javax.swing.JTextField();
        panelBotones = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnQuitar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CyberVentana - Administrador");
        setExtendedState(6);

        panelEncabezado.setBackground(new java.awt.Color(33, 33, 33));
        panelEncabezado.setLayout(new java.awt.BorderLayout());

        panelIzquierda.setBackground(new java.awt.Color(33, 33, 33));
        panelIzquierda.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CyberVentana (3).png"))); // NOI18N
        Logo.setPreferredSize(new java.awt.Dimension(300, 70));
        panelIzquierda.add(Logo);

        panelEncabezado.add(panelIzquierda, java.awt.BorderLayout.WEST);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Panel de administración");
        panelEncabezado.add(lblTitulo, java.awt.BorderLayout.CENTER);

        panelDerecha.setBackground(new java.awt.Color(33, 33, 33));
        panelDerecha.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        btnSalir.setBackground(new java.awt.Color(0, 92, 184));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Cerrar sesión");
        panelDerecha.add(btnSalir);

        panelEncabezado.add(panelDerecha, java.awt.BorderLayout.EAST);

        getContentPane().add(panelEncabezado, java.awt.BorderLayout.NORTH);

        panelCentro.setBackground(new java.awt.Color(45, 45, 45));
        panelCentro.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panelCentro.setLayout(new java.awt.BorderLayout());

        tablaProductos.setBackground(new java.awt.Color(66, 66, 66));
        tablaProductos.setForeground(new java.awt.Color(255, 255, 255));
        tablaProductos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tablaProductos.setRowHeight(28);
        tablaProductos.setSelectionBackground(new java.awt.Color(255, 102, 0));
        tablaProductos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tablaProductos.setGridColor(new java.awt.Color(110, 110, 110));
        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Categoría", "Precio", "Existencias"
            }
        ));
        scrollTabla.setViewportView(tablaProductos);

        panelCentro.add(scrollTabla, java.awt.BorderLayout.CENTER);

        getContentPane().add(panelCentro, java.awt.BorderLayout.CENTER);

        panelLateral.setBackground(new java.awt.Color(45, 45, 45));
        panelLateral.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panelLateral.setLayout(new java.awt.BorderLayout());

        panelFormulario.setBackground(new java.awt.Color(66, 66, 66));
        panelFormulario.setPreferredSize(new java.awt.Dimension(360, 340));
        panelFormulario.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panelFormulario.setLayout(new java.awt.BorderLayout());

        lblAgregar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAgregar.setForeground(new java.awt.Color(255, 255, 255));
        lblAgregar.setText("Agregar producto");
        lblAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelFormulario.add(lblAgregar, java.awt.BorderLayout.NORTH);

        panelCampos.setBackground(new java.awt.Color(66, 66, 66));
        panelCampos.setLayout(new java.awt.GridLayout(4, 2));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre");
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        panelCampos.add(lblNombre);

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        panelCampos.add(txtNombre);

        lblCategoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCategoria.setForeground(new java.awt.Color(255, 255, 255));
        lblCategoria.setText("Categoría");
        lblCategoria.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        panelCampos.add(lblCategoria);

        txtCategoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        panelCampos.add(txtCategoria);

        lblPrecio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecio.setText("Precio");
        lblPrecio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        panelCampos.add(lblPrecio);

        txtPrecio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        panelCampos.add(txtPrecio);

        lblExistencias.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblExistencias.setForeground(new java.awt.Color(255, 255, 255));
        lblExistencias.setText("Existencias");
        lblExistencias.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        panelCampos.add(lblExistencias);

        txtExistencias.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        panelCampos.add(txtExistencias);

        panelFormulario.add(panelCampos, java.awt.BorderLayout.CENTER);

        panelBotones.setBackground(new java.awt.Color(66, 66, 66));
        panelBotones.setLayout(new java.awt.GridLayout(2, 1));

        btnAgregar.setBackground(new java.awt.Color(255, 102, 0));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar producto");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        panelBotones.add(btnAgregar);

        btnQuitar.setBackground(new java.awt.Color(0, 92, 184));
        btnQuitar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnQuitar.setForeground(new java.awt.Color(255, 255, 255));
        btnQuitar.setText("Quitar seleccionado");
        btnQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarActionPerformed(evt);
            }
        });
        panelBotones.add(btnQuitar);

        panelFormulario.add(panelBotones, java.awt.BorderLayout.SOUTH);

        panelLateral.add(panelFormulario, java.awt.BorderLayout.NORTH);

        getContentPane().add(panelLateral, java.awt.BorderLayout.EAST);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Agrega un producto a la tabla (valida que los datos sean correctos)
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {
        String nombre = txtNombre.getText().trim();
        String categoria = txtCategoria.getText().trim();
        if (nombre.isEmpty() || categoria.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Escribe el nombre y la categoría del producto.");
            return;
        }
        try {
            double precio = Double.parseDouble(txtPrecio.getText().trim());
            int existencias = Integer.parseInt(txtExistencias.getText().trim());
            if (precio < 0 || existencias < 0) {
                throw new NumberFormatException();
            }
            DefaultTableModel modelo = (DefaultTableModel) tablaProductos.getModel();
            modelo.addRow(new Object[]{siguienteId++, nombre, categoria, precio, existencias});
            txtNombre.setText("");
            txtCategoria.setText("");
            txtPrecio.setText("");
            txtExistencias.setText("");
            txtNombre.requestFocus();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El precio debe ser un número y las existencias un entero, ambos mayores o iguales a 0.");
        }
    }

    // Quita de la tabla el producto seleccionado
    private void btnQuitarActionPerformed(java.awt.event.ActionEvent evt) {
        int fila = tablaProductos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Selecciona un producto de la tabla para quitarlo.");
            return;
        }
        int opcion = JOptionPane.showConfirmDialog(this, "¿Quitar el producto seleccionado?",
                "Confirmar", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            DefaultTableModel modelo = (DefaultTableModel) tablaProductos.getModel();
            modelo.removeRow(tablaProductos.convertRowIndexToModel(fila));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnQuitar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblAgregar;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblExistencias;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelCampos;
    private javax.swing.JPanel panelCentro;
    private javax.swing.JPanel panelDerecha;
    private javax.swing.JPanel panelEncabezado;
    private javax.swing.JPanel panelFormulario;
    private javax.swing.JPanel panelIzquierda;
    private javax.swing.JPanel panelLateral;
    private javax.swing.JScrollPane scrollTabla;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtExistencias;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
