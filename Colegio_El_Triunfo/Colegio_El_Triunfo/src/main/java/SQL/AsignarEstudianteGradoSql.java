
package SQL;

import Metodos.MetodoAsignarGrado;

public class AsignarEstudianteGradoSql extends javax.swing.JFrame {



    public AsignarEstudianteGradoSql() {

        initComponents();
        setLocationRelativeTo(null); //Null es para colocar centrado
        setVisible(true);
    }
    //Limpia los campos vacios del formulario.
    public void Limpiar(){
        tfCodigoAsignacion.setText("");
        tfCodigoEstudiante.setText("");
        tfCodigoGrado.setText("");
        tfBuscar.setText("");
        tfEncargado.setText("");
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        lbCodigoEstudiante = new javax.swing.JLabel();
        tfCodigoEstudiante = new javax.swing.JTextField();
        btGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfCodigoGrado = new javax.swing.JTextField();
        lbCodigoAsignacion = new javax.swing.JLabel();
        tfCodigoAsignacion = new javax.swing.JTextField();
        btLimpiar = new javax.swing.JButton();
        btBuscar = new javax.swing.JButton();
        lbBuscar = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btModificar = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfEncargado = new javax.swing.JTextField();
        btSalir = new javax.swing.JButton();
        tfBuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(155, 155, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lbTitulo.setText("Asignar estudiante a grado");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(171, Short.MAX_VALUE)
                .addComponent(lbTitulo)
                .addGap(163, 163, 163))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTitulo)
                .addGap(19, 19, 19))
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 50));

        lbCodigoEstudiante.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbCodigoEstudiante.setText("Codigo de estudiante:");
        jPanel3.add(lbCodigoEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        tfCodigoEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoEstudianteActionPerformed(evt);
            }
        });
        jPanel3.add(tfCodigoEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 210, -1));

        btGuardar.setBackground(new java.awt.Color(50, 255, 50));
        btGuardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btGuardar.setText("Asignar");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });
        jPanel3.add(btGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel1.setText("Codigo de grado:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));
        jPanel3.add(tfCodigoGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 210, -1));

        lbCodigoAsignacion.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbCodigoAsignacion.setText("Código de asignación:");
        jPanel3.add(lbCodigoAsignacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        tfCodigoAsignacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tfCodigoAsignacionMousePressed(evt);
            }
        });
        tfCodigoAsignacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoAsignacionActionPerformed(evt);
            }
        });
        jPanel3.add(tfCodigoAsignacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 210, -1));

        btLimpiar.setBackground(new java.awt.Color(50, 255, 50));
        btLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btLimpiar.setText("Limpiar");
        btLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarActionPerformed(evt);
            }
        });
        jPanel3.add(btLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, -1));

        btBuscar.setBackground(new java.awt.Color(255, 155, 155));
        btBuscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });
        jPanel3.add(btBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, -1, -1));

        lbBuscar.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbBuscar.setText("Código:");
        jPanel3.add(lbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 267, 640, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Asignar");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel4.setText("Colocar el código del grado en el cuadro amarillo para así poder utilizar los distintos botones.");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        btModificar.setBackground(new java.awt.Color(255, 155, 155));
        btModificar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btModificar.setText("Modificar");
        btModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarActionPerformed(evt);
            }
        });
        jPanel3.add(btModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, -1, -1));

        btEliminar.setBackground(new java.awt.Color(255, 155, 155));
        btEliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btEliminar.setText("Eliminar");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });
        jPanel3.add(btEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, -1, -1));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Buscar Asignación estudiante-grado");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel2.setText("Encargado:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));
        jPanel3.add(tfEncargado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 210, -1));

        btSalir.setBackground(new java.awt.Color(255, 50, 50));
        btSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btSalir.setForeground(new java.awt.Color(255, 255, 255));
        btSalir.setText("Salir");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });
        jPanel3.add(btSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, -1, -1));

        tfBuscar.setBackground(new java.awt.Color(255, 255, 155));
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
        jPanel3.add(tfBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 160, -1));

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfCodigoEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoEstudianteActionPerformed

    }//GEN-LAST:event_tfCodigoEstudianteActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        //Insertar
        MetodoAsignarGrado objetoAsignar=new MetodoAsignarGrado();
        objetoAsignar.Insertar(tfCodigoAsignacion, tfCodigoGrado, tfCodigoEstudiante, tfEncargado);
        Limpiar();
    }//GEN-LAST:event_btGuardarActionPerformed

    private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarActionPerformed
        // TODO add your handling code here:
        Limpiar();
    }//GEN-LAST:event_btLimpiarActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        MetodoAsignarGrado objetoAsignar=new MetodoAsignarGrado();
        objetoAsignar.BuscarPorCodigoAsignar(tfBuscar, tfCodigoAsignacion, tfCodigoGrado, tfCodigoEstudiante, tfEncargado);
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
        //Modificar
        MetodoAsignarGrado objetoModificar=new MetodoAsignarGrado();
        objetoModificar.Modificar(tfBuscar, tfCodigoGrado, tfCodigoEstudiante, tfEncargado);
        Limpiar();

    }//GEN-LAST:event_btModificarActionPerformed

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        //Eliminar
        MetodoAsignarGrado objetoEliminar=new MetodoAsignarGrado();
        objetoEliminar.EliminarAsignacion(tfBuscar);
        Limpiar();
    }//GEN-LAST:event_btEliminarActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        //Cierra la ventana pero no el programa por completo
        dispose();
    }//GEN-LAST:event_btSalirActionPerformed

    private void tfCodigoAsignacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfCodigoAsignacionMousePressed
        tfCodigoAsignacion.setEnabled(true);
    }//GEN-LAST:event_tfCodigoAsignacionMousePressed

    private void tfBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBuscarActionPerformed

    private void tfCodigoAsignacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoAsignacionActionPerformed
        //Si el usuario desea volver a agregar se volverá a habilitar el textfield

    }//GEN-LAST:event_tfCodigoAsignacionActionPerformed

    private void tfBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfBuscarMouseClicked
        // TODO add your handling code here:
        tfCodigoAsignacion.setEnabled(false);

    }//GEN-LAST:event_tfBuscarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btLimpiar;
    private javax.swing.JButton btModificar;
    private javax.swing.JButton btSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbBuscar;
    private javax.swing.JLabel lbCodigoAsignacion;
    private javax.swing.JLabel lbCodigoEstudiante;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTextField tfBuscar;
    private javax.swing.JTextField tfCodigoAsignacion;
    private javax.swing.JTextField tfCodigoEstudiante;
    private javax.swing.JTextField tfCodigoGrado;
    private javax.swing.JTextField tfEncargado;
    // End of variables declaration//GEN-END:variables
}
