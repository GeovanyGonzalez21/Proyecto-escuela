package SQL;
import Metodos.MetodoAsignacionPilotoBus;

public class AsignarTransporteSql extends javax.swing.JFrame {

    public AsignarTransporteSql() {
       initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    //Método para limpiar
    public void Limpiar(){
        tfCodigoAsignacion.setText("");
        tfCodigoPiloto.setText("");
        tfCodigoAutobus.setText("");
        TaRutaAsignada.setText("");
        tfBuscar.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbCodigoAsignación = new javax.swing.JLabel();
        lbCodigoAutobus = new javax.swing.JLabel();
        tfCodigoAsignacion = new javax.swing.JTextField();
        tfCodigoAutobus = new javax.swing.JTextField();
        btAsignar = new javax.swing.JButton();
        btLimpiar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lbCodigo = new javax.swing.JLabel();
        tfBuscar = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        tbModificarAsignacion = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        btEliminar = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();
        lbRutaAsignada = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TaRutaAsignada = new javax.swing.JTextArea();
        lbCodigoPiloto = new javax.swing.JLabel();
        tfCodigoPiloto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(155, 155, 255));

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lbTitulo.setText("Asignar piloto a autobus");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTitulo)
                .addGap(178, 178, 178))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(lbTitulo)
                .addGap(14, 14, 14))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Datos piloto/autobus");

        lbCodigoAsignación.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbCodigoAsignación.setText("Código de asignación:");

        lbCodigoAutobus.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbCodigoAutobus.setText("Codigo de autobus:");

        tfCodigoAsignacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tfCodigoAsignacionMousePressed(evt);
            }
        });

        btAsignar.setBackground(new java.awt.Color(51, 255, 51));
        btAsignar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btAsignar.setText("Asignar");
        btAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAsignarActionPerformed(evt);
            }
        });

        btLimpiar.setBackground(new java.awt.Color(51, 255, 51));
        btLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btLimpiar.setText("Limpiar");
        btLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel5.setText("Colocar el Código de anuncio en el cuadro amarillo  para poder usar los distintos botones:");

        lbCodigo.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbCodigo.setText("Código:");

        tfBuscar.setBackground(new java.awt.Color(255, 255, 155));
        tfBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfBuscarMouseClicked(evt);
            }
        });

        btBuscar.setBackground(new java.awt.Color(255, 155, 155));
        btBuscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        tbModificarAsignacion.setBackground(new java.awt.Color(255, 155, 155));
        tbModificarAsignacion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tbModificarAsignacion.setText("Modificar");
        tbModificarAsignacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbModificarAsignacionActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Buscar Asignación");

        btEliminar.setBackground(new java.awt.Color(255, 155, 155));
        btEliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btEliminar.setText("Eliminar");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
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

        lbRutaAsignada.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbRutaAsignada.setText("Ruta asignada:");

        TaRutaAsignada.setColumns(20);
        TaRutaAsignada.setRows(5);
        jScrollPane1.setViewportView(TaRutaAsignada);

        lbCodigoPiloto.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbCodigoPiloto.setText("Código de piloto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(lbCodigoAutobus)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tfCodigoAutobus, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(lbCodigoPiloto)
                                            .addGap(46, 46, 46)
                                            .addComponent(tfCodigoPiloto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(lbCodigoAsignación)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(tfCodigoAsignacion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(72, 72, 72)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btAsignar)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(btSalir))
                                        .addComponent(btLimpiar)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbRutaAsignada)
                                .addGap(57, 57, 57)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(btBuscar)
                                .addGap(18, 18, 18)
                                .addComponent(tbModificarAsignacion)
                                .addGap(18, 18, 18)
                                .addComponent(btEliminar))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jLabel6)))
                .addGap(0, 28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCodigoAsignación)
                            .addComponent(tfCodigoAsignacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btAsignar)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btLimpiar)
                            .addComponent(lbCodigoPiloto)
                            .addComponent(tfCodigoPiloto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btSalir)
                            .addComponent(lbCodigoAutobus)
                            .addComponent(tfCodigoAutobus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbRutaAsignada)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigo)
                    .addComponent(tfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscar)
                    .addComponent(btEliminar)
                    .addComponent(tbModificarAsignacion))
                .addGap(15, 15, 15))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btSalirActionPerformed

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        //Eliminar
        MetodoAsignacionPilotoBus objetoEliminar=new MetodoAsignacionPilotoBus();
        objetoEliminar.EliminarAsignacion(tfBuscar);
        Limpiar();
    }//GEN-LAST:event_btEliminarActionPerformed

    private void tbModificarAsignacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbModificarAsignacionActionPerformed
        //Modificar
        MetodoAsignacionPilotoBus objetoModificar=new MetodoAsignacionPilotoBus();
        objetoModificar.ModificarAsignacion(tfBuscar, tfCodigoPiloto, tfCodigoAutobus, TaRutaAsignada);
        Limpiar();
    }//GEN-LAST:event_tbModificarAsignacionActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        //Buscar
        MetodoAsignacionPilotoBus objetoAsignar=new MetodoAsignacionPilotoBus();
        objetoAsignar.BuscarPorCodigoAsignacion(tfBuscar, tfCodigoAsignacion, tfCodigoPiloto, tfCodigoAutobus, TaRutaAsignada);
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarActionPerformed
        // TODO add your handling code here:
        Limpiar();
    }//GEN-LAST:event_btLimpiarActionPerformed

    private void btAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAsignarActionPerformed
        //Insertar
        MetodoAsignacionPilotoBus objetoAsignar=new MetodoAsignacionPilotoBus();
        objetoAsignar.Insertar(tfCodigoAsignacion, tfCodigoPiloto, tfCodigoAutobus, TaRutaAsignada);
        Limpiar();
    }//GEN-LAST:event_btAsignarActionPerformed

    private void tfBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfBuscarMouseClicked
        // TODO add your handling code here:
        //Hacemos que no se pueda modificar, para que así se inserte el dato donde es.
        tfCodigoAsignacion.setEnabled(false);
    }//GEN-LAST:event_tfBuscarMouseClicked

    private void tfCodigoAsignacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfCodigoAsignacionMousePressed
        // TODO add your handling code here:
        //Lo volvemos a habilitar por si quiere agregar nuevos registros el usuario.
        tfCodigoAsignacion.setEnabled(true);
    }//GEN-LAST:event_tfCodigoAsignacionMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TaRutaAsignada;
    private javax.swing.JButton btAsignar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btLimpiar;
    private javax.swing.JButton btSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbCodigoAsignación;
    private javax.swing.JLabel lbCodigoAutobus;
    private javax.swing.JLabel lbCodigoPiloto;
    private javax.swing.JLabel lbRutaAsignada;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JButton tbModificarAsignacion;
    private javax.swing.JTextField tfBuscar;
    private javax.swing.JTextField tfCodigoAsignacion;
    private javax.swing.JTextField tfCodigoAutobus;
    private javax.swing.JTextField tfCodigoPiloto;
    // End of variables declaration//GEN-END:variables
}
