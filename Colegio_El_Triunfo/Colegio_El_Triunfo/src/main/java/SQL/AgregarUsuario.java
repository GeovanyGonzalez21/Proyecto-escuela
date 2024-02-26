
package SQL;


import Metodos.MetodoUsuario;
import com.mycompany.colegio_el_triunfo.DatoLogin;
import com.mycompany.colegio_el_triunfo.Ingresar;


public class AgregarUsuario extends javax.swing.JFrame {

    public AgregarUsuario() {
        initComponents();
        setLocationRelativeTo(null); //Centrar Jframe.
        setVisible(true);
    }

    public DatoLogin Limpiar(){
        tfCodigoUsuario.setText("");
        tfNombre.setText("");
        tfApellido.setText("");
        tfGenero.setText("");
        tfCargo.setText("");
        taCorreoElectronico.setText("");
        tfUsuario.setText("");
        tfContraseña.setText("");
        tfBuscar.setText("");
        return null;
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbBMEestudiante = new javax.swing.JLabel();
        lbInstrucciones = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbNombre = new javax.swing.JLabel();
        lbApellido = new javax.swing.JLabel();
        lbGenero = new javax.swing.JLabel();
        lbCorreoElectronico = new javax.swing.JLabel();
        lbUsuario = new javax.swing.JLabel();
        lbContraseña = new javax.swing.JLabel();
        btGuardar = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();
        btLimpiar = new javax.swing.JButton();
        tfNombre = new javax.swing.JTextField();
        tfApellido = new javax.swing.JTextField();
        tfGenero = new javax.swing.JTextField();
        tfUsuario = new javax.swing.JTextField();
        tfContraseña = new javax.swing.JTextField();
        btIngresar = new javax.swing.JButton();
        lbCargo = new javax.swing.JLabel();
        tfCargo = new javax.swing.JTextField();
        lbAgregarUsuario = new javax.swing.JLabel();
        lbBMEestudiante1 = new javax.swing.JLabel();
        lbInstrucciones1 = new javax.swing.JLabel();
        tfBuscar = new javax.swing.JTextField();
        btEliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btModificar = new javax.swing.JButton();
        btBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfCodigoUsuario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taCorreoElectronico = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();

        lbBMEestudiante.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbBMEestudiante.setText("Buscar / Modificar / Eliminar estudiante");

        lbInstrucciones.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbInstrucciones.setText("Colocar el código del estudiante en el cuadro amarillo para así poder utilizar los distintos botones.");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(155, 155, 255));

        lbNombre.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbNombre.setText("Nombre:");

        lbApellido.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbApellido.setText("Apellido:");

        lbGenero.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbGenero.setText("Genero:");

        lbCorreoElectronico.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbCorreoElectronico.setText("Correo electrónico:");

        lbUsuario.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbUsuario.setText("Usuario:");

        lbContraseña.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbContraseña.setText("Contraseña:");

        btGuardar.setBackground(new java.awt.Color(50, 255, 50));
        btGuardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btGuardar.setText("Guardar");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
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

        btLimpiar.setBackground(new java.awt.Color(50, 255, 50));
        btLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btLimpiar.setText("Limpiar");
        btLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarActionPerformed(evt);
            }
        });

        btIngresar.setBackground(new java.awt.Color(50, 255, 50));
        btIngresar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btIngresar.setText("Ingresar");
        btIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIngresarActionPerformed(evt);
            }
        });

        lbCargo.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbCargo.setText("Cargo:");

        lbAgregarUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbAgregarUsuario.setText("Agregar usuario");

        lbBMEestudiante1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbBMEestudiante1.setText("Buscar/Modificar/Eliminar usuario");

        lbInstrucciones1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbInstrucciones1.setText("Colocar el código del Usuario en el cuadro amarillo para así poder utilizar los distintos botones.");

        tfBuscar.setBackground(new java.awt.Color(255, 255, 155));
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

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel3.setText("Código de usuario:");

        btModificar.setBackground(new java.awt.Color(255, 155, 155));
        btModificar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btModificar.setText("Modificar");
        btModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarActionPerformed(evt);
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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel1.setText("Codigo usuario:");

        tfCodigoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tfCodigoUsuarioMousePressed(evt);
            }
        });

        taCorreoElectronico.setColumns(20);
        taCorreoElectronico.setRows(5);
        jScrollPane1.setViewportView(taCorreoElectronico);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE)
                .addGap(18, 18, 18))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(lbBMEestudiante1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbInstrucciones1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(51, 51, 51)
                                        .addComponent(btBuscar)
                                        .addGap(40, 40, 40)
                                        .addComponent(btModificar)))
                                .addGap(35, 35, 35)
                                .addComponent(btEliminar)
                                .addGap(27, 27, 27)
                                .addComponent(btSalir))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(336, 336, 336)
                                .addComponent(lbAgregarUsuario))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(24, 24, 24)
                                        .addComponent(tfCodigoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbApellido)
                                            .addComponent(lbCargo)
                                            .addComponent(lbUsuario))
                                        .addGap(68, 68, 68)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(lbContraseña)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(85, 85, 85)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(tfGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lbGenero)
                                                .addComponent(lbNombre))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(lbCorreoElectronico)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(38, 38, 38)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btGuardar)
                                            .addComponent(btLimpiar)
                                            .addComponent(btIngresar))))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbAgregarUsuario)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfCodigoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNombre)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btGuardar))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbApellido)
                    .addComponent(tfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbGenero)
                    .addComponent(tfGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLimpiar))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btIngresar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbCargo)
                                .addComponent(tfCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbCorreoElectronico)))))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbContraseña)
                    .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbUsuario))
                .addGap(11, 11, 11)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lbBMEestudiante1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbInstrucciones1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEliminar)
                    .addComponent(btModificar)
                    .addComponent(btBuscar)
                    .addComponent(btSalir))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lbTitulo.setText("Datos del usuario");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(317, 317, 317)
                .addComponent(lbTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTitulo)
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        //Eliminar
        MetodoUsuario objetoEliminar=new MetodoUsuario();
        objetoEliminar.EliminarUsuario(tfBuscar);
        Limpiar();
    }//GEN-LAST:event_btEliminarActionPerformed

    private void btIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIngresarActionPerformed
        //Ingresar
        Ingresar vIngresar=new Ingresar();
        this.dispose();
    }//GEN-LAST:event_btIngresarActionPerformed

    private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarActionPerformed
        // TODO add your handling code here:
        Limpiar(); //Limpia los text Field.
    }//GEN-LAST:event_btLimpiarActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        //Salir
        dispose(); //Cerrar unicamente la ventana en uso.
    }//GEN-LAST:event_btSalirActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        //Guardar
        MetodoUsuario objeto=new MetodoUsuario();
        objeto.Insertar(tfCodigoUsuario, tfNombre, tfApellido, tfGenero, tfCargo, taCorreoElectronico, tfUsuario, tfContraseña);
        Limpiar();
    }//GEN-LAST:event_btGuardarActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        //Buscar
        MetodoUsuario objeto=new MetodoUsuario();
        objeto.BuscarPorCodigoUsuario(tfBuscar, tfCodigoUsuario, tfNombre, tfApellido, tfGenero, tfCargo, taCorreoElectronico, tfUsuario, tfContraseña);
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
        //Modificar    
        MetodoUsuario objetoModificar=new MetodoUsuario();
        objetoModificar.ModificarUsuario(tfBuscar, tfNombre, tfApellido, tfGenero, tfCargo, taCorreoElectronico, tfUsuario, tfContraseña);
        Limpiar();
    }//GEN-LAST:event_btModificarActionPerformed

    private void tfBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfBuscarMouseClicked
        // TODO add your handling code here:
        //Descativamos el codigo de usuario para evitar errores en el programa
        tfCodigoUsuario.setEnabled(false);
    }//GEN-LAST:event_tfBuscarMouseClicked

    private void tfCodigoUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfCodigoUsuarioMousePressed
        // TODO add your handling code here:
        //Volvemos a activarlo por si se quiere agregar otros usuarios
        tfCodigoUsuario.setEnabled(true);
    }//GEN-LAST:event_tfCodigoUsuarioMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btIngresar;
    private javax.swing.JButton btLimpiar;
    private javax.swing.JButton btModificar;
    private javax.swing.JButton btSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbAgregarUsuario;
    private javax.swing.JLabel lbApellido;
    private javax.swing.JLabel lbBMEestudiante;
    private javax.swing.JLabel lbBMEestudiante1;
    private javax.swing.JLabel lbCargo;
    private javax.swing.JLabel lbContraseña;
    private javax.swing.JLabel lbCorreoElectronico;
    private javax.swing.JLabel lbGenero;
    private javax.swing.JLabel lbInstrucciones;
    private javax.swing.JLabel lbInstrucciones1;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JTextArea taCorreoElectronico;
    private javax.swing.JTextField tfApellido;
    private javax.swing.JTextField tfBuscar;
    private javax.swing.JTextField tfCargo;
    private javax.swing.JTextField tfCodigoUsuario;
    private javax.swing.JTextField tfContraseña;
    private javax.swing.JTextField tfGenero;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
}
