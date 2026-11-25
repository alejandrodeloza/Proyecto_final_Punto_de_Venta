package com.mycompany.sistema_punto_de_venta;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Utilidades {

    // Pone el logo de CyberVentana 
    public static void cargarLogo(JLabel etiqueta) {
        URL url = Utilidades.class.getResource("/imagenes/logo.png");
        if (url == null) {
            return; // si no encuentra la imagen, se queda el texto "CyberVentana"
        }
        Image img = new ImageIcon(url).getImage().getScaledInstance(160, 50, Image.SCALE_SMOOTH);
        etiqueta.setIcon(new ImageIcon(img));
        etiqueta.setText("");
    }
}