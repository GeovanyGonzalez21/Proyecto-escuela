
package Reportes;
import Metodos.MetodoEmpleado;
import com.mycompany.colegio_el_triunfo.Conexion;



public class ReporteEmpleados extends javax.swing.JFrame {
    
    Conexion conectar=new Conexion();
    
    
    public ReporteEmpleados() {
        initComponents();
        setVisible(true);
        //Lo vamos a utilizar para mostrar la tabla
        
        MetodoEmpleado objetoEmpleado=new MetodoEmpleado();
        objetoEmpleado.Mostrar(JtEmpleados);
    }
   
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtEmpleados = new javax.swing.JTable();
        btAbrirHTML = new javax.swing.JButton();
        btGenerarReporteHTML = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPanel2.setBackground(new java.awt.Color(155, 155, 255));

        jPanel3.setBackground(new java.awt.Color(255, 204, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("Reporte Empleado");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(346, 346, 346)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(17, Short.MAX_VALUE))
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

        JtEmpleados.setBackground(new java.awt.Color(255, 255, 153));
        JtEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        JtEmpleados.setSelectionBackground(new java.awt.Color(51, 255, 204));
        JtEmpleados.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(JtEmpleados);

        btAbrirHTML.setBackground(new java.awt.Color(51, 255, 51));
        btAbrirHTML.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btAbrirHTML.setText("Abrir HTML");
        btAbrirHTML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAbrirHTMLActionPerformed(evt);
            }
        });

        btGenerarReporteHTML.setBackground(new java.awt.Color(51, 255, 51));
        btGenerarReporteHTML.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btGenerarReporteHTML.setText("Generar Reporte HTML");
        btGenerarReporteHTML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGenerarReporteHTMLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 913, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(btGenerarReporteHTML)
                        .addGap(68, 68, 68)
                        .addComponent(btAbrirHTML)
                        .addGap(82, 82, 82)
                        .addComponent(btSalir)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalir)
                    .addComponent(btAbrirHTML)
                    .addComponent(btGenerarReporteHTML))
                .addGap(12, 12, 12))
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

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btSalirActionPerformed

    private void btAbrirHTMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAbrirHTMLActionPerformed
        // TODO add your handling code here:
       MetodoEmpleado objetoEmpleado=new MetodoEmpleado();
        objetoEmpleado.abrirArchivo("Reporte empleados.html");
    }//GEN-LAST:event_btAbrirHTMLActionPerformed

    private void btGenerarReporteHTMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGenerarReporteHTMLActionPerformed
        // TODO add your handling code here:
       MetodoEmpleado objetoEmpleado=new MetodoEmpleado();
       objetoEmpleado.ReporteHTML();
    }//GEN-LAST:event_btGenerarReporteHTMLActionPerformed


    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JtEmpleados;
    private javax.swing.JButton btAbrirHTML;
    private javax.swing.JButton btGenerarReporteHTML;
    private javax.swing.JButton btSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}