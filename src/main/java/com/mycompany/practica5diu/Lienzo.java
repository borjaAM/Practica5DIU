/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica5diu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 * @author Grupo 06
 */
public class Lienzo extends JPanel {
    private BufferedImage imagen = null;

    public Lienzo() throws MalformedURLException, IOException {
        imagen = ImageIO.read(new URL("https://lh3.googleusercontent.com/proxy/xnfeTnsUMNccpVQgeS_h3JZ_jsZuLtKl-jsKaq1aUSCp2YcgIgaKXA0T9Y-qaLO-01ZeOtQzecWriZR4YXH7itFKf7tFN_2TQROC7z6WP-X8TeSKQIMfneFbXpNGzVq1gyBNZIT3cw0lUHaBVimbGhaq0RkzH_a6PUo6"));
        this.setPreferredSize(new Dimension(imagen.getWidth(), imagen.getHeight()));
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(imagen, 0, 0, null);
        //imagen = UtilsPractica5.seleccionarComponentes(imagen, false, true, false);
        //g.drawImage(imagen, 0, 0, null);
    }
}
