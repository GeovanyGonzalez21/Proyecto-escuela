
package SQL;
import Metodos.MetodoAsignarCatedratico;


public class AsignarCatedraticosql extends javax.swing.JFrame {

    public AsignarCatedraticosql(){
    initComponents();
        setLocationRelativeTo(null); //Null es para colocar centrado
        setVisible(true);
    
    }
    
     //Limpia los campos vacios del formulario.
    public void Limpiar(){
        tfCodigoAsignacion.setText("");
        tfCodigoCatedratico.setText("");
        tfCodigoGrado.setText("");
        tfBuscar.setText("");
        
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        lbCodigoAsignacion = new javax.swing.JLabel();
        lbCodigoCatedratico = new javax.swing.JLabel();
        lbCodigoGrado = new javax.swing.JLabel();
        lbBuscar = new javax.swing.JLabel();
        btBuscarAsignacion = new javax.swing.JButton();
        btLimpiar = new javax.swing.JButton();
        btAsignar = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();
        tfCodigoAsignacion = new javax.swing.JTextField();
        tfCodigoCatedratico = new javax.swing.JTextField();
        tfCodigoGrado = new javax.swing.JTextField();
        tfBuscar = new javax.swing.JTextField();
        btEliminar = new javax.swing.JButton();
        lbAgregarEstudiante = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbAgregarEstudiante1 = new javax.swing.JLabel();
        lbInstrucciones = new javax.swing.JLabel();
        btModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(155, 155, 255));

        jPanel2.setBackground(new java.awt.Color(255, 201, 101));

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lbTitulo.setText("Asignar Catedrático");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(lbTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbCodigoAsignacion.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbCodigoAsignacion.setText("Código de asignación:");

        lbCodigoCatedratico.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbCodigoCatedratico.setText("Código de catedrático:");

        lbCodigoGrado.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbCodigoGrado.setText("Código de grado:");

        lbBuscar.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbBuscar.setText("Código:");

        btBuscarAsignacion.setBackground(new java.awt.Color(255, 155, 155));
        btBuscarAsignacion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btBuscarAsignacion.setText("Buscar");
        btBuscarAsignacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarAsignacionActionPerformed(evt);
            }
        });

        btLimpiar.setBackground(new java.awt.Color(50, 255, 50));
        btLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btLimpiar.setText("Limpiar");
        btLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarActionPerformed(evt);
            }
        });

        btAsignar.setBackground(new java.awt.Color(50, 255, 50));
        btAsignar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btAsignar.setText("Asignar");
        btAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAsignarActionPerformed(evt);
            }
        });

        btSalir.setBackground(new java.awt.Color(255, 49, 49));
        btSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btSalir.setForeground(new java.awt.Color(255, 255, 255));
        btSalir.setText("Salir");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        tfCodigoAsignacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfCodigoAsignacionMouseClicked(evt);
            }
        });

        tfBuscar.setBackground(new java.awt.Color(255, 255, 153));
        tfBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfBuscarMouseClicked(evt);
            }
        });

        btEliminar.setBackground(new java.awt.Color(255, 155, 155));
        btEliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btEliminar.setText("Eliminar");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });

        lbAgregarEstudiante.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbAgregarEstudiante.setText("Asignar");

        lbAgregarEstudiante1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbAgregarEstudiante1.setText("Buscar Asignación/Catedrático/Grado");

        lbInstrucciones.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbInstrucciones.setText("Colocar el código que necesita y presione el botón correspondiente para mostrar la información.");

        btModificar.setBackground(new java.awt.Color(255, 155, 155));
        btModificar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btModificar.setText("Modificar");
        btModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbInstrucciones)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btBuscarAsignacion)
                        .addGap(27, 27, 27)
                        .addComponent(btEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btModificar)))
                .addGap(0, 14, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addGap(14, 14, 14))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(lbAgregarEstudiante1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbCodigoAsignacion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfCodigoAsignacion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbCodigoCatedratico)
                                    .addComponent(lbCodigoGrado))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfCodigoGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfCodigoCatedratico, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btLimpiar)
                            .addComponent(btAsignar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbAgregarEstudiante)
                        .addGap(279, 279, 279))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btSalir)
                        .addGap(41, 41, 41))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbAgregarEstudiante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCodigoAsignacion)
                            .addComponent(tfCodigoAsignacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAsignar))
                        .addGap(69, 69, 69))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbCodigoCatedratico)
                        .addComponent(tfCodigoCatedratico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btLimpiar)))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigoGrado)
                    .addComponent(tfCodigoGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(lbAgregarEstudiante1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbInstrucciones)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBuscar)
                    .addComponent(tfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscarAsignacion)
                    .addComponent(btEliminar)
                    .addComponent(btModificar))
                .addGap(33, 33, 33)
                .addComponent(btSalir)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btSalirActionPerformed

    private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarActionPerformed

        Limpiar();
    }//GEN-LAST:event_btLimpiarActionPerformed

    private void btAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAsignarActionPerformed
        // TODO add your handling code here:
       MetodoAsignarCatedratico objetoCatedratico=new MetodoAsignarCatedratico();
       objetoCatedratico.Insertar(tfCodigoAsignacion, tfCodigoCatedratico, tfCodigoGrado);
       Limpiar();
    }//GEN-LAST:event_btAsignarActionPerformed

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        // TODO add your handling code here:
        MetodoAsignarCatedratico objetoAsignar=new MetodoAsignarCatedratico();
        objetoAsignar.EliminarAsignacion(tfBuscar);
        Limpiar();
    }//GEN-LAST:event_btEliminarActionPerformed

    private void btBuscarAsignacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarAsignacionActionPerformed
        // TODO add your handling code here:
        //Buscar asignaciones por codigo de asignacion.
        MetodoAsignarCatedratico objetoAsignar=new MetodoAsignarCatedratico();
        objetoAsignar.BuscarPorCodigoAsignar(tfBuscar, tfCodigoAsignacion, tfCodigoCatedratico, tfCodigoGrado);
    }//GEN-LAST:event_btBuscarAsignacionActionPerformed

    private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
        // TODO add your handling code here:
      MetodoAsignarCatedratico objetoAsignar=new MetodoAsignarCatedratico();
      objetoAsignar.Modificar(tfBuscar, tfCodigoCatedratico, tfCodigoGrado);
      Limpiar();
    }//GEN-LAST:event_btModificarActionPerformed

    private void tfBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfBuscarMouseClicked
        // TODO add your handling code here:
    tfCodigoAsignacion.setEnabled(false);
    }//GEN-LAST:event_tfBuscarMouseClicked

    private void tfCodigoAsignacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfCodigoAsignacionMouseClicked
        // TODO add your handling code here:
         tfCodigoAsignacion.setEnabled(true);
    }//GEN-LAST:event_tfCodigoAsignacionMouseClicked

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAsignar;
    private javax.swing.JButton btBuscarAsignacion;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btLimpiar;
    private javax.swing.JButton btModificar;
    private javax.swing.JButton btSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbAgregarEstudiante;
    private javax.swing.JLabel lbAgregarEstudiante1;
    private javax.swing.JLabel lbBuscar;
    private javax.swing.JLabel lbCodigoAsignacion;
    private javax.swing.JLabel lbCodigoCatedratico;
    private javax.swing.JLabel lbCodigoGrado;
    private javax.swing.JLabel lbInstrucciones;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTextField tfBuscar;
    private javax.swing.JTextField tfCodigoAsignacion;
    private javax.swing.JTextField tfCodigoCatedratico;
    private javax.swing.JTextField tfCodigoGrado;
    // End of variables declaration//GEN-END:variables
}
