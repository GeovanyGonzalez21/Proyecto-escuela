package com.mycompany.colegio_el_triunfo;

import SQL.AgregarUsuario;

public class Inicial extends javax.swing.JFrame {

    public Inicial() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null); //Centrar Jframe.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        btCrear = new javax.swing.JButton();
        lbMensaje = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btEntrar = new javax.swing.JButton();
        lbNuevo = new javax.swing.JLabel();
        lbViejo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(155, 155, 255));

        jPanel3.setBackground(new java.awt.Color(255, 204, 102));

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        lbTitulo.setText("¡Bienvenido!");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(284, 284, 284)
                .addComponent(lbTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(lbTitulo)
                .addGap(19, 19, 19))
        );

        btCrear.setBackground(new java.awt.Color(50, 255, 50));
        btCrear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btCrear.setText("Crear Usuario");
        btCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCrearActionPerformed(evt);
            }
        });

        lbMensaje.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lbMensaje.setText("¡Un gusto tenerte por aquí! Bienvenido al sistema administrativo del colegio \"El triunfo\".");

        btEntrar.setBackground(new java.awt.Color(50, 255, 50));
        btEntrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btEntrar.setText("Ingresar");
        btEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarActionPerformed(evt);
            }
        });

        lbNuevo.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lbNuevo.setText("¿Eres nuevo? Presiona este botón para crear un usuario.");

        lbViejo.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lbViejo.setText("¿Ya tienes un usuario? Presiona este botón para ingresar al sistema.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel2)
                        .addGap(35, 35, 35)
                        .addComponent(lbNuevo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(btCrear))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(lbViejo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addComponent(btEntrar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 31, Short.MAX_VALUE)
                .addComponent(lbMensaje)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(lbNuevo))
                .addGap(18, 18, 18)
                .addComponent(btCrear)
                .addGap(37, 37, 37)
                .addComponent(lbViejo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btEntrar)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCrearActionPerformed
        // TODO add your handling code here:
        AgregarUsuario agregar=new AgregarUsuario();
        this.dispose();
    }//GEN-LAST:event_btCrearActionPerformed

    private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarActionPerformed
        // TODO add your handling code here:
        Ingresar ingreso=new Ingresar();
        this.dispose();
    }//GEN-LAST:event_btEntrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCrear;
    private javax.swing.JButton btEntrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbMensaje;
    private javax.swing.JLabel lbNuevo;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbViejo;
    // End of variables declaration//GEN-END:variables
}
