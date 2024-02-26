
package Reportes;

import Metodos.MetodoAsignarGrado;


public class ReporteAsignacionEsGra extends javax.swing.JFrame {

    public ReporteAsignacionEsGra() {
        initComponents();
        setVisible(true);
        //Llamamos al metodo asignar grado para utilizar su método "mostrar" y llenar la tabla vacía
        MetodoAsignarGrado objetoAsignar=new MetodoAsignarGrado();
        objetoAsignar.Mostrar(tbTotalAsignarEsGra);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        btSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTotalAsignarEsGra = new javax.swing.JTable();
        btCrearReporte = new javax.swing.JButton();
        btAbrirReporte = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jPanel2.setBackground(new java.awt.Color(255, 201, 101));

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lbTitulo.setText("Reporte asignación estudiante-grado");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTitulo)
                .addGap(111, 111, 111))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbTitulo)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        btSalir.setBackground(new java.awt.Color(255, 50, 50));
        btSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btSalir.setForeground(new java.awt.Color(255, 255, 255));
        btSalir.setText("Salir");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        tbTotalAsignarEsGra.setBackground(new java.awt.Color(255, 255, 153));
        tbTotalAsignarEsGra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbTotalAsignarEsGra.setSelectionBackground(new java.awt.Color(51, 255, 204));
        tbTotalAsignarEsGra.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(tbTotalAsignarEsGra);

        btCrearReporte.setBackground(new java.awt.Color(51, 255, 51));
        btCrearReporte.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btCrearReporte.setText("Crear reporte");
        btCrearReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCrearReporteActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btCrearReporte)
                        .addGap(40, 40, 40)
                        .addComponent(btAbrirReporte)
                        .addGap(56, 56, 56)
                        .addComponent(btSalir)
                        .addGap(66, 66, 66)))
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalir)
                    .addComponent(btCrearReporte)
                    .addComponent(btAbrirReporte))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        // TODO add your handling code here:
        dispose(); //Salir de la ventana pero no del programa.
    }//GEN-LAST:event_btSalirActionPerformed

    private void btCrearReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCrearReporteActionPerformed
        // TODO add your handling code here:
        MetodoAsignarGrado objetoAsignar=new MetodoAsignarGrado();
        objetoAsignar.ReporteHTML();

    }//GEN-LAST:event_btCrearReporteActionPerformed

    private void btAbrirReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAbrirReporteActionPerformed
        // TODO add your handling code here:
        MetodoAsignarGrado objetoAsignar=new MetodoAsignarGrado();
        objetoAsignar.abrirArchivo("Reporte asignacion estudiante-grado.html");
    }//GEN-LAST:event_btAbrirReporteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAbrirReporte;
    private javax.swing.JButton btCrearReporte;
    private javax.swing.JButton btSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTable tbTotalAsignarEsGra;
    // End of variables declaration//GEN-END:variables
}
