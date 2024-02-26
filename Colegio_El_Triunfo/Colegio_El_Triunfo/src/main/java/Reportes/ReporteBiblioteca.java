package Reportes;

import Metodos.MetodoBiblioteca;


public class ReporteBiblioteca extends javax.swing.JFrame {

    public ReporteBiblioteca() {
        initComponents();
        setVisible(true);
        //Lo vamos a utilizar para mostrar la tabla
        MetodoBiblioteca objetoBiblioteca=new MetodoBiblioteca();
        objetoBiblioteca.Mostrar(tbTotalBiblioteca);
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
        tbTotalBiblioteca = new javax.swing.JTable();
        btGenerarReporte = new javax.swing.JButton();
        btAbrirReporte = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPanel2.setBackground(new java.awt.Color(155, 155, 245));

        jPanel3.setBackground(new java.awt.Color(255, 204, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("Reporte biblioteca");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(323, 323, 323)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
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

        tbTotalBiblioteca.setBackground(new java.awt.Color(255, 255, 153));
        tbTotalBiblioteca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbTotalBiblioteca.setSelectionBackground(new java.awt.Color(51, 255, 204));
        tbTotalBiblioteca.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(tbTotalBiblioteca);

        btGenerarReporte.setBackground(new java.awt.Color(51, 255, 51));
        btGenerarReporte.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btGenerarReporte.setText("Generar Reporte");
        btGenerarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGenerarReporteActionPerformed(evt);
            }
        });

        btAbrirReporte.setBackground(new java.awt.Color(51, 255, 51));
        btAbrirReporte.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btAbrirReporte.setText("Abrir reporte");
        btAbrirReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAbrirReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btGenerarReporte)
                .addGap(99, 99, 99)
                .addComponent(btAbrirReporte)
                .addGap(133, 133, 133)
                .addComponent(jbSalir)
                .addGap(138, 138, 138))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir)
                    .addComponent(btGenerarReporte)
                    .addComponent(btAbrirReporte))
                .addContainerGap(57, Short.MAX_VALUE))
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
        MetodoBiblioteca objetoBibliotecaR =new MetodoBiblioteca();
        objetoBibliotecaR.ReporteHTML();
        
    }//GEN-LAST:event_btGenerarReporteActionPerformed

    private void btAbrirReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAbrirReporteActionPerformed
        // TODO add your handling code here:
        MetodoBiblioteca objetoBiblioteca=new MetodoBiblioteca();
        objetoBiblioteca.abrirArchivo("Reporte biblioteca.html");
    }//GEN-LAST:event_btAbrirReporteActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAbrirReporte;
    private javax.swing.JButton btGenerarReporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTable tbTotalBiblioteca;
    // End of variables declaration//GEN-END:variables
}
