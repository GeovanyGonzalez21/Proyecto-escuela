package SQL;
import Metodos.MetodoEstudiante;
public class AgregarEstudianteSql extends javax.swing.JFrame {

    public AgregarEstudianteSql() {

        initComponents();
        setLocationRelativeTo(null); //Null es para colocar centrado el JFrame
        setVisible(true);
    }
    public void Limpiar(){
        tfCodigoEstudiante.setText("");
        tfNombres.setText("");
        tfApellidos.setText("");
        tfEdad.setText("");
        tfGenero.setText("");
        tfCUI.setText("");
        tfBuscar.setText("");
        tfCodigoEstudiante.requestFocus();
    }
    @SuppressWarnings("unchecked")  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        lbCodigoEstudiante = new javax.swing.JLabel();
        lbNombres = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbGenero = new javax.swing.JLabel();
        lbCUI = new javax.swing.JLabel();
        btModificar = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();
        tfCodigoEstudiante = new javax.swing.JTextField();
        tfNombres = new javax.swing.JTextField();
        tfApellidos = new javax.swing.JTextField();
        tfEdad = new javax.swing.JTextField();
        tfGenero = new javax.swing.JTextField();
        tfCUI = new javax.swing.JTextField();
        btLimpiar = new javax.swing.JButton();
        lbAgregarEstudiante = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btGuardar = new javax.swing.JButton();
        lbCodigoEstudiante1 = new javax.swing.JLabel();
        btBuscar = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        lbBMEestudiante = new javax.swing.JLabel();
        lbInstrucciones = new javax.swing.JLabel();
        tfBuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel.setBackground(new java.awt.Color(153, 153, 255));
        jPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lbTitulo.setText("Datos del estudiante");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(lbTitulo)
                .addContainerGap(359, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTitulo)
                .addGap(19, 19, 19))
        );

        jPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 50));

        lbCodigoEstudiante.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbCodigoEstudiante.setText("Código de estudiante:");
        jPanel.add(lbCodigoEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        lbNombres.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbNombres.setText("Nombres:");
        jPanel.add(lbNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 92, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel3.setText("Apellidos:");
        jPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel4.setText("Edad:");
        jPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        lbGenero.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbGenero.setText("Género:");
        jPanel.add(lbGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        lbCUI.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbCUI.setText("CUI:");
        jPanel.add(lbCUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, -1, -1));

        btModificar.setBackground(new java.awt.Color(255, 153, 153));
        btModificar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btModificar.setText("Modificar");
        btModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarActionPerformed(evt);
            }
        });
        jPanel.add(btModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, -1, -1));

        btSalir.setBackground(new java.awt.Color(255, 51, 51));
        btSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btSalir.setForeground(new java.awt.Color(255, 255, 255));
        btSalir.setText("Salir");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });
        jPanel.add(btSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 180, -1, -1));

        tfCodigoEstudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tfCodigoEstudianteMousePressed(evt);
            }
        });
        jPanel.add(tfCodigoEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 92, 84, -1));
        jPanel.add(tfNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 306, -1));
        jPanel.add(tfApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 306, -1));

        tfEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEdadActionPerformed(evt);
            }
        });
        jPanel.add(tfEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 87, -1));
        jPanel.add(tfGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 87, -1));

        tfCUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCUIActionPerformed(evt);
            }
        });
        jPanel.add(tfCUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 306, -1));

        btLimpiar.setBackground(new java.awt.Color(51, 255, 51));
        btLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btLimpiar.setText("Limpiar");
        btLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarActionPerformed(evt);
            }
        });
        jPanel.add(btLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 130, -1, -1));

        lbAgregarEstudiante.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbAgregarEstudiante.setText("Agregar estudiante");
        jPanel.add(lbAgregarEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));
        jPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));
        jPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 900, -1));

        btGuardar.setBackground(new java.awt.Color(51, 255, 51));
        btGuardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btGuardar.setText("Guardar");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });
        jPanel.add(btGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 70, -1, -1));

        lbCodigoEstudiante1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbCodigoEstudiante1.setText("Código de estudiante:");
        jPanel.add(lbCodigoEstudiante1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 92, -1, -1));

        btBuscar.setBackground(new java.awt.Color(255, 153, 153));
        btBuscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });
        jPanel.add(btBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, -1));

        btEliminar.setBackground(new java.awt.Color(255, 153, 153));
        btEliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btEliminar.setText("Eliminar");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });
        jPanel.add(btEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 310, -1, -1));

        lbBMEestudiante.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbBMEestudiante.setText("Buscar / Modificar / Eliminar estudiante");
        jPanel.add(lbBMEestudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, -1, -1));

        lbInstrucciones.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbInstrucciones.setText("Colocar el código del estudiante en el cuadro amarillo para así poder utilizar los distintos botones.");
        jPanel.add(lbInstrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        tfBuscar.setBackground(new java.awt.Color(255, 255, 153));
        tfBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfBuscarMouseClicked(evt);
            }
        });
        tfBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBuscarActionPerformed(evt);
            }
        });
        jPanel.add(tfBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 140, -1));

        getContentPane().add(jPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
        //Modificar
        MetodoEstudiante objetoModificar=new MetodoEstudiante();
        objetoModificar.ModificarEstudiante(tfBuscar, tfNombres, tfApellidos, tfEdad, tfGenero, tfCUI);
    }//GEN-LAST:event_btModificarActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        // TODO add your handling code here:
        dispose(); //Cerrar la ventana actual.
    }//GEN-LAST:event_btSalirActionPerformed

    private void tfCUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCUIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCUIActionPerformed

    private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarActionPerformed
    // TODO add your handling code here:
    Limpiar();
    }//GEN-LAST:event_btLimpiarActionPerformed

    private void tfEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEdadActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        //Guardar
        MetodoEstudiante objetoEstudiante=new MetodoEstudiante();
        objetoEstudiante.Insertar(tfCodigoEstudiante, tfNombres, tfApellidos, tfEdad, tfGenero, tfCUI);
        Limpiar();
    }//GEN-LAST:event_btGuardarActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        //Buscar
        MetodoEstudiante objetoEstudiante=new MetodoEstudiante();
        objetoEstudiante.BuscarPorCodigoEstudiante(tfBuscar, tfCodigoEstudiante, tfNombres, tfApellidos, tfEdad, tfGenero, tfCUI);
    
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        //Eliminar
        MetodoEstudiante objetoEliminar=new MetodoEstudiante();
        objetoEliminar.EliminarEstudiante(tfBuscar);
        Limpiar();
    }//GEN-LAST:event_btEliminarActionPerformed

    private void tfBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBuscarActionPerformed

    private void tfBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfBuscarMouseClicked
        // TODO add your handling code here:
        //Para que no se  pueda editar el textfield de codigoEstudiante
        tfCodigoEstudiante.setEnabled(false);
    }//GEN-LAST:event_tfBuscarMouseClicked

    private void tfCodigoEstudianteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfCodigoEstudianteMousePressed
        // TODO add your handling code here:
        //Para volver a activar el textfield de codigo de estudiante.
        tfCodigoEstudiante.setEnabled(true);
    }//GEN-LAST:event_tfCodigoEstudianteMousePressed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btLimpiar;
    private javax.swing.JButton btModificar;
    private javax.swing.JButton btSalir;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbAgregarEstudiante;
    private javax.swing.JLabel lbBMEestudiante;
    private javax.swing.JLabel lbCUI;
    private javax.swing.JLabel lbCodigoEstudiante;
    private javax.swing.JLabel lbCodigoEstudiante1;
    private javax.swing.JLabel lbGenero;
    private javax.swing.JLabel lbInstrucciones;
    private javax.swing.JLabel lbNombres;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTextField tfApellidos;
    private javax.swing.JTextField tfBuscar;
    private javax.swing.JTextField tfCUI;
    private javax.swing.JTextField tfCodigoEstudiante;
    private javax.swing.JTextField tfEdad;
    private javax.swing.JTextField tfGenero;
    private javax.swing.JTextField tfNombres;
    // End of variables declaration//GEN-END:variables
}
