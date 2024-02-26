
package Reportes;
import Metodos.MetodoCatedratico;
import com.mycompany.colegio_el_triunfo.Conexion;


public class ReporteCatedratico extends javax.swing.JFrame {
    
    public ReporteCatedratico() {
        initComponents();
        setVisible(true);
        
        MetodoCatedratico objetoCatedratico=new MetodoCatedratico();
        objetoCatedratico.Mostrar(jtCatedratico);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        btSalir = new javax.swing.JButton();
        btVerReporteHTML = new javax.swing.JButton();
        GenerarHTML = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCatedratico = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(155, 157, 255));

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lbTitulo.setText("Reporte catedratico");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTitulo)
                .addGap(327, 327, 327))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo)
                .addContainerGap(15, Short.MAX_VALUE))
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

        btVerReporteHTML.setBackground(new java.awt.Color(101, 255, 50));
        btVerReporteHTML.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btVerReporteHTML.setText("Abrir html");
        btVerReporteHTML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVerReporteHTMLActionPerformed(evt);
            }
        });

        GenerarHTML.setBackground(new java.awt.Color(101, 255, 50));
        GenerarHTML.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        GenerarHTML.setText("Generar reporte");
        GenerarHTML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarHTMLActionPerformed(evt);
            }
        });

        jtCatedratico.setBackground(new java.awt.Color(255, 255, 153));
        jtCatedratico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtCatedratico.setSelectionBackground(new java.awt.Color(51, 255, 204));
        jtCatedratico.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(jtCatedratico);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(GenerarHTML)
                .addGap(114, 114, 114)
                .addComponent(btVerReporteHTML)
                .addGap(119, 119, 119)
                .addComponent(btSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 836, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalir)
                    .addComponent(btVerReporteHTML)
                    .addComponent(GenerarHTML))
                .addGap(30, 30, 30))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed

        dispose();
    }//GEN-LAST:event_btSalirActionPerformed

    private void btVerReporteHTMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVerReporteHTMLActionPerformed
        // TODO add your handling code here:
        //Código para abrir archivo html
      MetodoCatedratico ObjetoCatedratico=new MetodoCatedratico();
        ObjetoCatedratico.abrirArchivo("Reporte catedratico.html");
    }//GEN-LAST:event_btVerReporteHTMLActionPerformed

    private void GenerarHTMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarHTMLActionPerformed
        // TODO add your handling code here:
     MetodoCatedratico objetoCatedraticoR=new MetodoCatedratico();
        objetoCatedraticoR.ReporteHTML();
            
    }//GEN-LAST:event_GenerarHTMLActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GenerarHTML;
    private javax.swing.JButton btSalir;
    private javax.swing.JButton btVerReporteHTML;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtCatedratico;
    private javax.swing.JLabel lbTitulo;
    // End of variables declaration//GEN-END:variables
}
