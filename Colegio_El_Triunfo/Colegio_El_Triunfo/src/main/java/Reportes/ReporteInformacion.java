package Reportes;

import Metodos.MetodoInformacion;


public class ReporteInformacion extends javax.swing.JFrame {
    
    public ReporteInformacion() {
        initComponents();
        setVisible(true);
        
        //Lo vamos a utilizar para mostrar la tabla
        MetodoInformacion objetoInformacion=new MetodoInformacion();
        objetoInformacion.Mostrar(tbTotalInformacion);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTotalInformacion = new javax.swing.JTable();
        btGenerarReporte = new javax.swing.JButton();
        btAbrirHTML = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPanel2.setBackground(new java.awt.Color(155, 155, 245));

        jPanel3.setBackground(new java.awt.Color(255, 204, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("Reporte información");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(213, 213, 213))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jbSalir.setBackground(new java.awt.Color(255, 49, 49));
        jbSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(255, 255, 255));
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        tbTotalInformacion.setBackground(new java.awt.Color(255, 255, 153));
        tbTotalInformacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbTotalInformacion.setSelectionBackground(new java.awt.Color(51, 255, 204));
        tbTotalInformacion.setSelectionForeground(new java.awt.Color(51, 51, 51));
        tbTotalInformacion.setShowGrid(true);
        jScrollPane1.setViewportView(tbTotalInformacion);
        tbTotalInformacion.getAccessibleContext().setAccessibleDescription("");

        btGenerarReporte.setBackground(new java.awt.Color(51, 255, 51));
        btGenerarReporte.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btGenerarReporte.setText("Generar reporte");
        btGenerarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGenerarReporteActionPerformed(evt);
            }
        });

        btAbrirHTML.setBackground(new java.awt.Color(51, 255, 51));
        btAbrirHTML.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btAbrirHTML.setText("Abrir reporte");
        btAbrirHTML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAbrirHTMLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btGenerarReporte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btAbrirHTML)
                        .addGap(105, 105, 105)
                        .addComponent(jbSalir)
                        .addGap(58, 58, 58))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(32, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir)
                    .addComponent(btAbrirHTML)
                    .addComponent(btGenerarReporte))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
         dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void btGenerarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGenerarReporteActionPerformed
        // TODO add your handling code here:
        //Generamos el reporte html.
        MetodoInformacion objetoInformacion=new MetodoInformacion();
        objetoInformacion.ReporteHTML();
    }//GEN-LAST:event_btGenerarReporteActionPerformed

    private void btAbrirHTMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAbrirHTMLActionPerformed
        // TODO add your handling code here:
        MetodoInformacion objetoInformacion=new MetodoInformacion();
        objetoInformacion.abrirArchivo("Reporte informacion.html");
    }//GEN-LAST:event_btAbrirHTMLActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAbrirHTML;
    private javax.swing.JButton btGenerarReporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTable tbTotalInformacion;
    // End of variables declaration//GEN-END:variables
}
