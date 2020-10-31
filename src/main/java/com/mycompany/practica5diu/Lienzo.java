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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 * @author Grupo 06
 */
public class Lienzo extends JPanel {
    private BufferedImage imagenO = null;
    private BufferedImage imagenM = null;
    private BufferedImage logo = null;
    private int rgb;
    public Lienzo() throws MalformedURLException {
        try {
            imagenO =  ImageIO.read(new URL("https://www.bing.com/images/blob?bcid=RKuR-Kq8XvsBsA"));
            //logo =  ImageIO.read(new URL(""));
            this.setPreferredSize(new Dimension(imagenO.getWidth(), imagenO.getHeight()));
            
        } catch (IOException ex) {
            Logger.getLogger(Lienzo.class.getName()).log(Level.SEVERE, null, ex);
        }
        rgb=3;
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        //g.drawImage(imagen, 0, 0, null);
        
        if(rgb == 3){
            g.drawImage(imagenO, 0, 0, null);
        }else{
            g.drawImage(imagenM, 0, 0, null);
        }
        g.drawImage(logo, 0, 0, null);
    }
    
    public void changeColor(int rgb, boolean[] colors){
        this.rgb = rgb;
        imagenM = UtilsPractica5.seleccionarComponentes(imagenO, colors[0], colors[1], colors[2]);
        this.repaint();
    }
}
