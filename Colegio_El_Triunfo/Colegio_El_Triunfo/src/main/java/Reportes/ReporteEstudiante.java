package Reportes;

import Metodos.MetodoEstudiante;
import com.mycompany.colegio_el_triunfo.Conexion;


public class ReporteEstudiante extends javax.swing.JFrame {

    
    public ReporteEstudiante() {
        initComponents();
        setVisible(true);
        //Lo vamos a utilizar para mostrar la tabla
        
        MetodoEstudiante objetoEstudiante=new MetodoEstudiante();
        objetoEstudiante.Mostrar(lbTotalEstudiante);
    }
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        btSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lbTotalEstudiante = new javax.swing.JTable();
        btGenerarReporteHTML = new javax.swing.JButton();
        btAbrirHTML = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(155, 155, 255));

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lbTitulo.setText("Reporte Estudiante");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(368, 368, 368)
                .addComponent(lbTitulo)
                .addContainerGap(309, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbTitulo)
                .addContainerGap(19, Short.MAX_VALUE))
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

        lbTotalEstudiante.setBackground(new java.awt.Color(255, 255, 153));
        lbTotalEstudiante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        lbTotalEstudiante.setSelectionBackground(new java.awt.Color(51, 255, 204));
        lbTotalEstudiante.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(lbTotalEstudiante);

        btGenerarReporteHTML.setBackground(new java.awt.Color(51, 255, 51));
        btGenerarReporteHTML.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btGenerarReporteHTML.setText("Generar Reporte");
        btGenerarReporteHTML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGenerarReporteHTMLActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btGenerarReporteHTML)
                        .addGap(86, 86, 86)
                        .addComponent(btAbrirHTML)
                        .addGap(103, 103, 103)
                        .addComponent(btSalir)
                        .addGap(153, 153, 153))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAbrirHTML)
                    .addComponent(btSalir)
                    .addComponent(btGenerarReporteHTML))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btSalirActionPerformed

    private void btGenerarReporteHTMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGenerarReporteHTMLActionPerformed
        // TODO add your handling code here:
        MetodoEstudiante objetoEstudianteR=new MetodoEstudiante();
        objetoEstudianteR.ReporteHTML();
    }//GEN-LAST:event_btGenerarReporteHTMLActionPerformed

    private void btAbrirHTMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAbrirHTMLActionPerformed
        // TODO add your handling code here:
        MetodoEstudiante ObjetoEstudiante=new MetodoEstudiante();
        ObjetoEstudiante.abrirArchivo("Reporte estudiantes.html");
    }//GEN-LAST:event_btAbrirHTMLActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAbrirHTML;
    private javax.swing.JButton btGenerarReporteHTML;
    private javax.swing.JButton btSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTable lbTotalEstudiante;
    // End of variables declaration//GEN-END:variables
}
