package com.mycompany.practica5diu;

import java.awt.Color;

/**
 * @author Grupo06
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        this.getContentPane().setBackground(new Color(204, 255, 255));
    }

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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 51));
        setForeground(new java.awt.Color(102, 204, 0));
        setResizable(false);

        jLayeredPane1.setBackground(new java.awt.Color(153, 0, 255));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Configuración", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        jPanelColores.setBackground(new java.awt.Color(0, 204, 204));
        jPanelColores.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelColores.setToolTipText("Elimina el color no seleccionado de la imagen");

        cTodos.setBackground(new java.awt.Color(0, 204, 204));
        cTodos.setSelected(true);
        cTodos.setText("Todos");
        cTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cTodosActionPerformed(evt);
            }
        });

        cVerde.setBackground(new java.awt.Color(0, 204, 204));
        cVerde.setSelected(true);
        cVerde.setText("Verde");
        cVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cVerdeActionPerformed(evt);
            }
        });

        cAzul.setBackground(new java.awt.Color(0, 204, 204));
        cAzul.setSelected(true);
        cAzul.setText("Azul");
        cAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cAzulActionPerformed(evt);
            }
        });

        cRojo.setBackground(new java.awt.Color(0, 204, 204));
        cRojo.setSelected(true);
        cRojo.setText("Rojo");
        cRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cRojoActionPerformed(evt);
            }
        });

        labelFiltrado.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
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

        jPanelPosicion.setBackground(new java.awt.Color(0, 204, 204));
        jPanelPosicion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelPosicion.setToolTipText("Cambia la posición del logotipo en la imagen");

        rbArribaIzq.setBackground(new java.awt.Color(0, 204, 204));
        grupoPosiciones.add(rbArribaIzq);
        rbArribaIzq.setText("Esq. Superior Izq.");
        rbArribaIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbArribaIzqActionPerformed(evt);
            }
        });

        rbArribaDer.setBackground(new java.awt.Color(0, 204, 204));
        grupoPosiciones.add(rbArribaDer);
        rbArribaDer.setSelected(true);
        rbArribaDer.setText("Esq. Superior Der.");
        rbArribaDer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbArribaDerActionPerformed(evt);
            }
        });

        rbAbajoIzq.setBackground(new java.awt.Color(0, 204, 204));
        grupoPosiciones.add(rbAbajoIzq);
        rbAbajoIzq.setText("Esq. Inferior Izq.");
        rbAbajoIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAbajoIzqActionPerformed(evt);
            }
        });

        rbAbajoDer.setBackground(new java.awt.Color(0, 204, 204));
        grupoPosiciones.add(rbAbajoDer);
        rbAbajoDer.setText("Esq. Inferior Der.");
        rbAbajoDer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAbajoDerActionPerformed(evt);
            }
        });

        labelPosicion.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        labelPosicion.setText("Posición del logotipo:");

        javax.swing.GroupLayout jPanelPosicionLayout = new javax.swing.GroupLayout(jPanelPosicion);
        jPanelPosicion.setLayout(jPanelPosicionLayout);
        jPanelPosicionLayout.setHorizontalGroup(
            jPanelPosicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
            .addGroup(jPanelPosicionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPosicion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelPosicionLayout.setVerticalGroup(
            jPanelPosicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPosicionLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(labelPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
                    .addComponent(jPanelColores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelColores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Imagen", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        javax.swing.GroupLayout lienzoLayout = new javax.swing.GroupLayout(lienzo);
        lienzo.setLayout(lienzoLayout);
        lienzoLayout.setHorizontalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lienzoLayout.setVerticalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 452, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("Borja Álvarez Medina y Esther Zurita Curbelo");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("Hecho por:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lienzo, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(267, 267, 267))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lienzo, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26))
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

    private void rbArribaDerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbArribaDerActionPerformed
        if(rbArribaDer.isSelected()){
            lienzo.moveLogo(2);
        }
    }//GEN-LAST:event_rbArribaDerActionPerformed

    private void rbArribaIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbArribaIzqActionPerformed
        if(rbArribaIzq.isSelected()){
            lienzo.moveLogo(1);
        }
    }//GEN-LAST:event_rbArribaIzqActionPerformed

    private void rbAbajoIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAbajoIzqActionPerformed
        if(rbAbajoIzq.isSelected()){
            lienzo.moveLogo(3);
        }
    }//GEN-LAST:event_rbAbajoIzqActionPerformed

    private void rbAbajoDerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAbajoDerActionPerformed
        if(rbAbajoDer.isSelected()){
            lienzo.moveLogo(4);
        }
    }//GEN-LAST:event_rbAbajoDerActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
