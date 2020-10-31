/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica5diu;

/**
 *
 * @author Usuario
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoPosiciones = new javax.swing.ButtonGroup();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanelColores = new javax.swing.JPanel();
        cTodos = new javax.swing.JCheckBox();
        cVerde = new javax.swing.JCheckBox();
        cAzul = new javax.swing.JCheckBox();
        cRojo = new javax.swing.JCheckBox();
        labelFiltrado = new javax.swing.JLabel();
        jPanelPosicion = new javax.swing.JPanel();
        rbArribaIzq = new javax.swing.JRadioButton();
        rbArribaDer = new javax.swing.JRadioButton();
        rbAbajoIzq = new javax.swing.JRadioButton();
        rbAbajoDer = new javax.swing.JRadioButton();
        labelPosicion = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        try {
            lienzo = new com.mycompany.practica5diu.Lienzo();
        } catch (java.net.MalformedURLException e1) {
            e1.printStackTrace();
        }

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Configuración"));

        jPanelColores.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cTodos.setSelected(true);
        cTodos.setText("Todos");
        cTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cTodosActionPerformed(evt);
            }
        });

        cVerde.setSelected(true);
        cVerde.setText("Verde");
        cVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cVerdeActionPerformed(evt);
            }
        });

        cAzul.setSelected(true);
        cAzul.setText("Azul");
        cAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cAzulActionPerformed(evt);
            }
        });

        cRojo.setSelected(true);
        cRojo.setText("Rojo");
        cRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cRojoActionPerformed(evt);
            }
        });

        labelFiltrado.setText("Filtrar color de la imagen:");

        javax.swing.GroupLayout jPanelColoresLayout = new javax.swing.GroupLayout(jPanelColores);
        jPanelColores.setLayout(jPanelColoresLayout);
        jPanelColoresLayout.setHorizontalGroup(
            jPanelColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelColoresLayout.createSequentialGroup()
                .addGroup(jPanelColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelColoresLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanelColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cRojo)
                            .addComponent(cAzul)
                            .addComponent(cVerde)
                            .addComponent(cTodos)))
                    .addGroup(jPanelColoresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelFiltrado)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelColoresLayout.setVerticalGroup(
            jPanelColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelColoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelFiltrado)
                .addGap(18, 18, 18)
                .addComponent(cTodos)
                .addGap(18, 18, 18)
                .addComponent(cRojo)
                .addGap(18, 18, 18)
                .addComponent(cVerde)
                .addGap(18, 18, 18)
                .addComponent(cAzul)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanelPosicion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        grupoPosiciones.add(rbArribaIzq);
        rbArribaIzq.setText("Esq. Superior Izq.");

        grupoPosiciones.add(rbArribaDer);
        rbArribaDer.setSelected(true);
        rbArribaDer.setText("Esq. Superior Der.");

        grupoPosiciones.add(rbAbajoIzq);
        rbAbajoIzq.setText("Esq. Inferior Izq.");

        grupoPosiciones.add(rbAbajoDer);
        rbAbajoDer.setText("Esq. Inferior Der.");

        labelPosicion.setText("Posición del logotipo:");

        javax.swing.GroupLayout jPanelPosicionLayout = new javax.swing.GroupLayout(jPanelPosicion);
        jPanelPosicion.setLayout(jPanelPosicionLayout);
        jPanelPosicionLayout.setHorizontalGroup(
            jPanelPosicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPosicionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPosicion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelPosicionLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanelPosicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPosicionLayout.createSequentialGroup()
                        .addComponent(rbAbajoDer)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelPosicionLayout.createSequentialGroup()
                        .addGroup(jPanelPosicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbAbajoIzq)
                            .addComponent(rbArribaIzq)
                            .addComponent(rbArribaDer))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanelPosicionLayout.setVerticalGroup(
            jPanelPosicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPosicionLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(labelPosicion)
                .addGap(30, 30, 30)
                .addComponent(rbArribaIzq)
                .addGap(35, 35, 35)
                .addComponent(rbArribaDer)
                .addGap(35, 35, 35)
                .addComponent(rbAbajoIzq)
                .addGap(35, 35, 35)
                .addComponent(rbAbajoDer)
                .addContainerGap())
        );

        jLayeredPane1.setLayer(jPanelColores, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanelPosicion, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelPosicion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanelColores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelColores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Imagen"));

        javax.swing.GroupLayout lienzoLayout = new javax.swing.GroupLayout(lienzo);
        lienzo.setLayout(lienzoLayout);
        lienzoLayout.setHorizontalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 626, Short.MAX_VALUE)
        );
        lienzoLayout.setVerticalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 417, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lienzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lienzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cTodosActionPerformed
        if(cTodos.isSelected()){
            cRojo.setSelected(true);
            cVerde.setSelected(true);
            cAzul.setSelected(true);
            lienzo.changeColor(new boolean[]{true, true, true});
        }
        cTodos.setSelected(true);
    }//GEN-LAST:event_cTodosActionPerformed

    private void cRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cRojoActionPerformed
        if(!cRojo.isSelected()){
            if(cVerde.isSelected() || cAzul.isSelected()){
                cRojo.setSelected(false);
                cTodos.setSelected(false);
                lienzo.changeColor( new boolean[]{false, cVerde.isSelected(), cAzul.isSelected()});
            }else{
                cRojo.setSelected(true);
            }
        }else{
            cRojo.setSelected(true);
            if(cVerde.isSelected() && cAzul.isSelected()){
                cTodos.setSelected(true);
            }
            lienzo.changeColor( new boolean[]{true, cVerde.isSelected(), cAzul.isSelected()});
        }
    }//GEN-LAST:event_cRojoActionPerformed

    private void cVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cVerdeActionPerformed
        if(!cVerde.isSelected()){
            if(cRojo.isSelected() || cAzul.isSelected()){
                cVerde.setSelected(false);
                cTodos.setSelected(false);
                lienzo.changeColor( new boolean[]{cRojo.isSelected(), false, cAzul.isSelected()});
            }else{
                cVerde.setSelected(true);
            }
        }else{
            cVerde.setSelected(true);
            if(cRojo.isSelected() && cAzul.isSelected()){
                cTodos.setSelected(true);
            }
            lienzo.changeColor( new boolean[]{cRojo.isSelected(), true, cAzul.isSelected()});
        }
    }//GEN-LAST:event_cVerdeActionPerformed

    private void cAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cAzulActionPerformed
        if(!cAzul.isSelected()){
            if(cRojo.isSelected() || cVerde.isSelected()){
                cAzul.setSelected(false);
                cTodos.setSelected(false);
                lienzo.changeColor( new boolean[]{cRojo.isSelected(), cVerde.isSelected(), false});
            }else{
                cAzul.setSelected(true);
            }
        }else{
            cAzul.setSelected(true);
            if(cRojo.isSelected() && cVerde.isSelected()){
                cTodos.setSelected(true);
            }
            lienzo.changeColor( new boolean[]{cRojo.isSelected(), cVerde.isSelected(), true});
        }
    }//GEN-LAST:event_cAzulActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cAzul;
    private javax.swing.JCheckBox cRojo;
    private javax.swing.JCheckBox cTodos;
    private javax.swing.JCheckBox cVerde;
    private javax.swing.ButtonGroup grupoPosiciones;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelColores;
    private javax.swing.JPanel jPanelPosicion;
    private javax.swing.JLabel labelFiltrado;
    private javax.swing.JLabel labelPosicion;
    private com.mycompany.practica5diu.Lienzo lienzo;
    private javax.swing.JRadioButton rbAbajoDer;
    private javax.swing.JRadioButton rbAbajoIzq;
    private javax.swing.JRadioButton rbArribaDer;
    private javax.swing.JRadioButton rbArribaIzq;
    // End of variables declaration//GEN-END:variables
}
