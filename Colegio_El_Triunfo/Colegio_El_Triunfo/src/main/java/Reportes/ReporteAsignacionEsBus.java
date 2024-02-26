
package Reportes;

import Metodos.MetodoAsignacionPilotoBus;
import Metodos.MetodoAsignarEstudianteBus;

public class ReporteAsignacionEsBus extends javax.swing.JFrame {


    public ReporteAsignacionEsBus() {
        initComponents();
        setVisible(true);
        //Lo vamos a utilizar para mostrar la tabla
        MetodoAsignacionPilotoBus objetoAsignar= new MetodoAsignacionPilotoBus();
        objetoAsignar.Mostrar(tbEstudainteBus);
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        btSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbEstudainteBus = new javax.swing.JTable();
        btGenerarReporte = new javax.swing.JButton();
        btAbrirReporte = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(155, 157, 255));

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lbTitulo.setText("Reporte asignación estudiante-Bus");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTitulo)
                .addGap(199, 199, 199))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(lbTitulo)
                .addContainerGap())
        );

        btSalir.setBackground(new java.awt.Color(255, 49, 49));
        btSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btSalir.setForeground(new java.awt.Color(255, 255, 255));
        btSalir.setText("Salir");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        tbEstudainteBus.setBackground(new java.awt.Color(255, 255, 153));
        tbEstudainteBus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbEstudainteBus.setSelectionBackground(new java.awt.Color(51, 255, 204));
        tbEstudainteBus.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(tbEstudainteBus);

        btGenerarReporte.setBackground(new java.awt.Color(51, 255, 51));
        btGenerarReporte.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btGenerarReporte.setText("Generar reporte");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(btGenerarReporte)
                        .addGap(39, 39, 39)
                        .addComponent(btAbrirReporte)
                        .addGap(54, 54, 54)
                        .addComponent(btSalir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalir)
                    .addComponent(btGenerarReporte)
                    .addComponent(btAbrirReporte))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed

        dispose();
    }//GEN-LAST:event_btSalirActionPerformed

    private void btAbrirReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAbrirReporteActionPerformed
        // TODO add your handling code here:
        MetodoAsignarEstudianteBus objetoAsignar=new MetodoAsignarEstudianteBus();
        objetoAsignar.abrirArchivo("Reporte asignacion estudiante-bus.html");
    }//GEN-LAST:event_btAbrirReporteActionPerformed

    private void btGenerarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGenerarReporteActionPerformed
        // TODO add your handling code here:
        MetodoAsignarEstudianteBus objetoAsignar=new MetodoAsignarEstudianteBus();
        objetoAsignar.ReporteHTML();
    }//GEN-LAST:event_btGenerarReporteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAbrirReporte;
    private javax.swing.JButton btGenerarReporte;
    private javax.swing.JButton btSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTable tbEstudainteBus;
    // End of variables declaration//GEN-END:variables
}
