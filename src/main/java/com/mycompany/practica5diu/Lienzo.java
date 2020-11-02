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
    //Esq. Sup. Izq. = 1, Esq. Sup. Der. = 2, Esq. Infer. Izq. = 3, 
    //Esq. Infer. Der. = 4
   private int pos;
    public Lienzo() throws MalformedURLException {
        pos=2; 
        try {
            imagenO =  ImageIO.read(new URL("https://www.bing.com/images/blob?bcid=RKuR-Kq8XvsBsA"));
            logo =  ImageIO.read(new URL("https://th.bing.com/th/id/OIP.IG0HUFy_Ns8UpSXcq8L50AHaHa?pid=Api&rs=1"));
            this.setPreferredSize(new Dimension(imagenO.getWidth(), imagenO.getHeight()));
            
        } catch (IOException ex) {
            Logger.getLogger(Lienzo.class.getName()).log(Level.SEVERE, null, ex);
        }
        imagenM = UtilsPractica5.seleccionarComponentes(imagenO, true, true, true);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.drawImage(imagenM, 0, 0, null);
        if(pos == 1) g.drawImage(logo, 0,0, null);
        if(pos == 2) g.drawImage(logo, imagenO.getWidth()-logo.getWidth(),0, null);
        if(pos == 3) g.drawImage(logo, 0, imagenO.getHeight()-logo.getHeight(), null);
        if(pos == 4) g.drawImage(logo, imagenO.getWidth()-logo.getWidth(), imagenO.getHeight()-logo.getHeight(), null);
    }
    
    public void changeColor(boolean[] colors){
        imagenM = UtilsPractica5.seleccionarComponentes(imagenO, colors[0], colors[1], colors[2]);
        this.repaint();
    }
    
    public void moveLogo(int pos){
        this.pos = pos;
        this.repaint();
    }
}
