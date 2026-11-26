/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sistema_punto_de_venta;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class InicioSesion extends javax.swing.JFrame {
    //referencias declaradas 
private Sistema_Punto_de_Venta sistema;
private VentanaPrincipal ventanaPrincipal;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(InicioSesion.class.getName());

    /**
     * Creates new form InicioSesion
     */
  

    // Constructor vacío 
    public InicioSesion() {
        this(new Sistema_Punto_de_Venta(), null);
    }

    // Constructor que recibe el sistema y la ventana principal
    public InicioSesion(Sistema_Punto_de_Venta sistema, VentanaPrincipal ventanaPrincipal) {
        initComponents();
        this.sistema = sistema;
        this.ventanaPrincipal = ventanaPrincipal;
        setLocationRelativeTo(null); // Centrar ventana
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE); // Cierra solo esta ventana
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Fondo = new javax.swing.JPanel();
        panelFormulario = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        IniciarSesion = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Registrar = new javax.swing.JButton();
        jPasswordField2 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(24, 37, 52));

        jPanel2.setBackground(new java.awt.Color(30, 42, 55));
        jPanel2.setForeground(new java.awt.Color(24, 37, 52));
        jPanel2.setLayout(new java.awt.GridLayout());

        Fondo.setBackground(new java.awt.Color(30, 42, 55));
        Fondo.setMinimumSize(new java.awt.Dimension(730, 542));
        Fondo.setLayout(new java.awt.GridBagLayout());

        panelFormulario.setBackground(new java.awt.Color(30, 42, 55));
        panelFormulario.setForeground(new java.awt.Color(60, 63, 65));
        panelFormulario.setMinimumSize(new java.awt.Dimension(500, 500));
        panelFormulario.setPreferredSize(new java.awt.Dimension(500, 500));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CyberVentana (3).png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("¡Hola de nuevo! Ingresa a tu cuenta ");

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(9, 157, 237));
        jLabel1.setText("Correo electrónico");

        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea2.setBackground(new java.awt.Color(25, 40, 52));
        jTextArea2.setColumns(20);
        jTextArea2.setForeground(new java.awt.Color(9, 157, 237));
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(9, 157, 237));
        jLabel4.setText("Contraseña");

        IniciarSesion.setBackground(new java.awt.Color(0, 168, 254));
        IniciarSesion.setForeground(new java.awt.Color(30, 42, 55));
        IniciarSesion.setText("Iniciar Sesion");
        IniciarSesion.addActionListener(this::IniciarSesionActionPerformed);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("¿Aún no tienes cuenta? ");

        Registrar.setBackground(new java.awt.Color(30, 42, 55));
        Registrar.setForeground(new java.awt.Color(9, 157, 237));
        Registrar.setText("Registrame ahora");
        Registrar.setBorder(null);
        Registrar.addActionListener(this::RegistrarActionPerformed);

        jPasswordField2.setBackground(new java.awt.Color(30, 42, 55));
        jPasswordField2.setForeground(new java.awt.Color(9, 157, 237));
        jPasswordField2.addActionListener(this::jPasswordField2ActionPerformed);

        javax.swing.GroupLayout panelFormularioLayout = new javax.swing.GroupLayout(panelFormulario);
        panelFormulario.setLayout(panelFormularioLayout);
        panelFormularioLayout.setHorizontalGroup(
            panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFormularioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(146, 146, 146))
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(Registrar))
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1))
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(Logo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFormularioLayout.createSequentialGroup()
                                .addGap(179, 179, 179)
                                .addComponent(IniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelFormularioLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel4)))
                        .addGap(178, 178, 178)))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        panelFormularioLayout.setVerticalGroup(
            panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(IniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Registrar))
                .addContainerGap(124, Short.MAX_VALUE))
        );

        Fondo.add(panelFormulario, new java.awt.GridBagConstraints());

        jPanel2.add(Fondo);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


    }//GEN-LAST:event_jButton1ActionPerformed

    private void IniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarSesionActionPerformed
       String correo = jTextArea2.getText().trim();
        String contra = new String(jPasswordField2.getPassword());

        if (correo.isEmpty() || contra.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Error al completar los campos");
            return;
        }

        if (sistema.iniciarSesion(correo, contra)) {
            Usuario u = sistema.buscarUsuario(correo);
            JOptionPane.showMessageDialog(this, "¡Bienvenido, " + u.getNombre() + "!");

            if (u instanceof Admin) {
                VentanaAdmin admin = new VentanaAdmin();
                admin.setVisible(true);
                if (ventanaPrincipal != null) {
                    ventanaPrincipal.dispose();
                }
            } else {
                if (ventanaPrincipal != null) {
                    ventanaPrincipal.guardarUsuarioActivo(u);
                }
            }
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Correo o contraseña incorrectos.");
        }
    }//GEN-LAST:event_IniciarSesionActionPerformed

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        java.awt.EventQueue.invokeLater(() -> new Registro(sistema).setVisible(true));
        this.dispose();
    }//GEN-LAST:event_RegistrarActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new InicioSesion().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JButton IniciarSesion;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton Registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JPanel panelFormulario;
    // End of variables declaration//GEN-END:variables

}
