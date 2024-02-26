
package Reportes;
import Metodos.MetodoComida;





public class ReporteComida extends javax.swing.JFrame {

    
    public ReporteComida() {
         
         initComponents();
    
        setVisible(true);
         MetodoComida objetoComida=new MetodoComida();
        objetoComida.Mostrar(jtComida);
    }

    
    @SuppressWarnings("unchecked")
    
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        btSalir = new javax.swing.JButton();
        btReporteHTML = new javax.swing.JButton();
        btGenerar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtComida = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lbTitulo.setText("Reporte comida");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addComponent(lbTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo)
                .addContainerGap(15, Short.MAX_VALUE))
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

        btReporteHTML.setBackground(new java.awt.Color(101, 255, 50));
        btReporteHTML.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btReporteHTML.setText("Abrir html");
        btReporteHTML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReporteHTMLActionPerformed(evt);
            }
        });

        btGenerar.setBackground(new java.awt.Color(101, 255, 50));
        btGenerar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btGenerar.setText("Generar reporte");
        btGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGenerarActionPerformed(evt);
            }
        });

        jtComida.setBackground(new java.awt.Color(255, 255, 153));
        jtComida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtComida.setSelectionBackground(new java.awt.Color(51, 255, 204));
        jtComida.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(jtComida);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(btGenerar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btReporteHTML)
                .addGap(110, 110, 110)
                .addComponent(btSalir)
                .addGap(167, 167, 167))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btGenerar)
                    .addComponent(btReporteHTML)
                    .addComponent(btSalir))
                .addGap(23, 23, 23))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        // TODO add your handling code here:
        dispose(); //Cerrar la ventana actual.
    }//GEN-LAST:event_btSalirActionPerformed

    private void btReporteHTMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReporteHTMLActionPerformed
        // TODO add your handling code here:
        //Código para abrir archivo html.
     MetodoComida objetoComida=new MetodoComida();
        objetoComida.abrirArchivo("Reporte Comida.html");
        
        
    }//GEN-LAST:event_btReporteHTMLActionPerformed

    private void btGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGenerarActionPerformed
        // TODO add your handling code here:
       MetodoComida objetoComida=new MetodoComida();
        objetoComida.ReporteHTML();
    }//GEN-LAST:event_btGenerarActionPerformed
       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGenerar;
    private javax.swing.JButton btReporteHTML;
    private javax.swing.JButton btSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtComida;
    private javax.swing.JLabel lbTitulo;
    // End of variables declaration//GEN-END:variables
}
