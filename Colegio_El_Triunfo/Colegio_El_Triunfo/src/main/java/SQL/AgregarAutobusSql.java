package SQL;

import Metodos.MetodoAutobus;
import javax.swing.JOptionPane;

public class AgregarAutobusSql extends javax.swing.JFrame {

    public AgregarAutobusSql() {
        initComponents();
        setLocationRelativeTo(null); //Null es para colocar centrado el JFrame
        setVisible(true);
    }
    public void Limpiar(){
         //Codigo para limpiar formulario
        tfCodigoAutobus.setText("");
        tfPlaca.setText("");
        tfModelo.setText("");
        tfBuscar.setText("");
    }   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbAgregarEstudiante = new javax.swing.JLabel();
        btGuardar = new javax.swing.JButton();
        lbBMEestudiante = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        lbAgregarEstudiante2 = new javax.swing.JLabel();
        btGuardar1 = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();
        lbCodigoAutobus = new javax.swing.JLabel();
        lbPlaca = new javax.swing.JLabel();
        lbModelo = new javax.swing.JLabel();
        tfCodigoAutobus = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        tfModelo = new javax.swing.JTextField();
        tfPlaca = new javax.swing.JTextField();
        btLimpiar = new javax.swing.JButton();
        lbBMEestudiante1 = new javax.swing.JLabel();
        lbInstrucciones = new javax.swing.JLabel();
        btBuscar = new javax.swing.JButton();
        btModificar = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        tfBuscar = new javax.swing.JTextField();
        lbBuscar2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        lbAgregarEstudiante.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbAgregarEstudiante.setText("Agregar estudiante");

        btGuardar.setBackground(new java.awt.Color(51, 255, 51));
        btGuardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btGuardar.setText("Guardar");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        lbBMEestudiante.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbBMEestudiante.setText("Buscar / Modificar / Buscar estudiante");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(155, 155, 255));

        jPanel3.setBackground(new java.awt.Color(255, 204, 102));

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lbTitulo.setText("Datos del autobus");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTitulo)
                .addGap(319, 319, 319))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTitulo)
                .addGap(19, 19, 19))
        );

        lbAgregarEstudiante2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbAgregarEstudiante2.setText("Datos del autobús");

        btGuardar1.setBackground(new java.awt.Color(51, 255, 51));
        btGuardar1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btGuardar1.setText("Guardar");
        btGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardar1ActionPerformed(evt);
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

        lbCodigoAutobus.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbCodigoAutobus.setText("Código de autobús:");

        lbPlaca.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbPlaca.setText("Placa:");

        lbModelo.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbModelo.setText("Modelo:");

        tfCodigoAutobus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tfCodigoAutobusMousePressed(evt);
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

        lbBMEestudiante1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbBMEestudiante1.setText("Buscar / Modificar / Eliminar transporte");

        lbInstrucciones.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbInstrucciones.setText("Colocar el código del autobus/piloto en el cuadro amarillo correspondiente para así poder utilizar los distintos botones.");

        btBuscar.setBackground(new java.awt.Color(255, 155, 155));
        btBuscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        btModificar.setBackground(new java.awt.Color(255, 155, 155));
        btModificar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btModificar.setText("Modificar");
        btModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarActionPerformed(evt);
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

        tfBuscar.setBackground(new java.awt.Color(255, 255, 155));
        tfBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfBuscarMouseClicked(evt);
            }
        });

        lbBuscar2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbBuscar2.setText("Código de autobús: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCodigoAutobus)
                            .addComponent(lbModelo))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tfCodigoAutobus, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                                .addGap(24, 24, 24)
                                .addComponent(lbPlaca)
                                .addGap(18, 18, 18)
                                .addComponent(tfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfModelo))
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbAgregarEstudiante2)
                        .addGap(221, 221, 221)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btGuardar1)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(btSalir))
                        .addComponent(btLimpiar)))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbInstrucciones)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addComponent(tfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(btBuscar)
                                .addGap(18, 18, 18)
                                .addComponent(btModificar)
                                .addGap(29, 29, 29)
                                .addComponent(btEliminar))
                            .addComponent(lbBuscar2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator2)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbBMEestudiante1)
                .addGap(270, 270, 270))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbAgregarEstudiante2)
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCodigoAutobus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCodigoAutobus)
                            .addComponent(lbPlaca)
                            .addComponent(tfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btGuardar1)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbModelo)
                            .addComponent(tfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btLimpiar)))
                .addGap(7, 7, 7)
                .addComponent(btSalir)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbBMEestudiante1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbInstrucciones)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btBuscar)
                    .addComponent(btModificar)
                    .addComponent(btEliminar)
                    .addComponent(tfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbBuscar2))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
 
    }//GEN-LAST:event_btGuardarActionPerformed

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
    //Eliminar
    MetodoAutobus objetoAutobus=new MetodoAutobus();
    objetoAutobus.EliminarAutobus(tfBuscar);
    Limpiar();            

    }//GEN-LAST:event_btEliminarActionPerformed

    private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
        //Modificar
        MetodoAutobus objetoAutobus=new MetodoAutobus();
        objetoAutobus.Modificar(tfBuscar, tfPlaca, tfModelo);
        Limpiar();
    }//GEN-LAST:event_btModificarActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        //Buscar
        MetodoAutobus objetoAutobus=new MetodoAutobus();
        objetoAutobus.BuscarPorCodigoAutobus(tfBuscar,tfCodigoAutobus,tfPlaca,tfModelo);
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarActionPerformed
        // TODO add your handling code here:
        Limpiar();
    }//GEN-LAST:event_btLimpiarActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btSalirActionPerformed

    private void btGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardar1ActionPerformed
        //Codigo botón guardar
        MetodoAutobus objetoAutobus=new MetodoAutobus();
        objetoAutobus.Insertar(tfCodigoAutobus, tfPlaca, tfModelo);
        Limpiar();
    }//GEN-LAST:event_btGuardar1ActionPerformed

    private void tfBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfBuscarMouseClicked
        //Deshabilitará el texfield de codigo de autobus, para que no se puedan ingresar datos por alli
        tfCodigoAutobus.setEnabled(false);
    }//GEN-LAST:event_tfBuscarMouseClicked

    private void tfCodigoAutobusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfCodigoAutobusMousePressed
        // TODO add your handling code here:
        //Volverá a habilitarse si se necesita agregar de nuevo.
        tfCodigoAutobus.setEnabled(true);
    }//GEN-LAST:event_tfCodigoAutobusMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btGuardar1;
    private javax.swing.JButton btLimpiar;
    private javax.swing.JButton btModificar;
    private javax.swing.JButton btSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbAgregarEstudiante;
    private javax.swing.JLabel lbAgregarEstudiante2;
    private javax.swing.JLabel lbBMEestudiante;
    private javax.swing.JLabel lbBMEestudiante1;
    private javax.swing.JLabel lbBuscar2;
    private javax.swing.JLabel lbCodigoAutobus;
    private javax.swing.JLabel lbInstrucciones;
    private javax.swing.JLabel lbModelo;
    private javax.swing.JLabel lbPlaca;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTextField tfBuscar;
    private javax.swing.JTextField tfCodigoAutobus;
    private javax.swing.JTextField tfModelo;
    private javax.swing.JTextField tfPlaca;
    // End of variables declaration//GEN-END:variables
}
