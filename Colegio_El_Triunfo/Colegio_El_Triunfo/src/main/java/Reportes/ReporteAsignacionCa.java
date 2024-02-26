
package Reportes;
import Metodos.MetodoAsignarCatedratico;


public class ReporteAsignacionCa extends javax.swing.JFrame {
        
    public ReporteAsignacionCa() {
       
        initComponents();
        setVisible(true);
    
    
     MetodoAsignarCatedratico objetoAsignar=new MetodoAsignarCatedratico();
        objetoAsignar.Mostrar(TablaAsignarCatedraticos);
    //Método para abrir archivo que se encuentre en la carpeta del proyecto
    
                }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        btGenerarReporte = new javax.swing.JButton();
        AbrirHTML = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaAsignarCatedraticos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jPanel2.setBackground(new java.awt.Color(255, 201, 101));

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lbTitulo.setText("Reporte asignación catedráticos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(lbTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(lbTitulo)
                .addGap(15, 15, 15))
        );

        btGenerarReporte.setBackground(new java.awt.Color(51, 255, 51));
        btGenerarReporte.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btGenerarReporte.setText("Generar reporte");
        btGenerarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGenerarReporteActionPerformed(evt);
            }
        });

        AbrirHTML.setBackground(new java.awt.Color(51, 255, 51));
        AbrirHTML.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AbrirHTML.setText("Abrir HTML");
        AbrirHTML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirHTMLActionPerformed(evt);
            }
        });

        btSalir.setBackground(new java.awt.Color(255, 50, 50));
        btSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btSalir.setForeground(new java.awt.Color(255, 255, 255));
        btSalir.setText("Salir");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        TablaAsignarCatedraticos.setBackground(new java.awt.Color(255, 255, 153));
        TablaAsignarCatedraticos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaAsignarCatedraticos.setSelectionBackground(new java.awt.Color(51, 255, 204));
        TablaAsignarCatedraticos.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(TablaAsignarCatedraticos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btGenerarReporte)
                .addGap(80, 80, 80)
                .addComponent(AbrirHTML)
                .addGap(66, 66, 66)
                .addComponent(btSalir)
                .addGap(135, 135, 135))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btGenerarReporte)
                    .addComponent(AbrirHTML)
                    .addComponent(btSalir))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btGenerarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGenerarReporteActionPerformed
        // TODO add your handling code here:
        //Método para crear archivo html
          MetodoAsignarCatedratico objetoAsignar=new MetodoAsignarCatedratico();
        objetoAsignar.ReporteHTML();

    }//GEN-LAST:event_btGenerarReporteActionPerformed

    private void AbrirHTMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirHTMLActionPerformed
        // TODO add your handling code here:
        //Abrir archivo html de reporte asignaciones catedraticos
         MetodoAsignarCatedratico objetoAsignar=new MetodoAsignarCatedratico();
        objetoAsignar.abrirArchivo("Reporte asignacion catedratico-grado.html");
    }//GEN-LAST:event_AbrirHTMLActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        // TODO add your handling code here:
        //Salir de la ventana pero no del programa
        dispose();
    }//GEN-LAST:event_btSalirActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AbrirHTML;
    private javax.swing.JTable TablaAsignarCatedraticos;
    private javax.swing.JButton btGenerarReporte;
    private javax.swing.JButton btSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTitulo;
    // End of variables declaration//GEN-END:variables
}
