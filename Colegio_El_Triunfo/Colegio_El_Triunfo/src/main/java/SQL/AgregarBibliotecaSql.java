
package SQL;

import Metodos.MetodoBiblioteca;
import com.mycompany.colegio_el_triunfo.Conexion;


public class AgregarBibliotecaSql extends javax.swing.JFrame {

    Conexion ConectarBase=new Conexion();
    private static AgregarBibliotecaSql instance =null;
    
    public AgregarBibliotecaSql(){
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null); //Null es para colocar centrado el JFrame.
        //Cuando se cargue el formulario que muestre los alumnos.
        MetodoBiblioteca objetoBiblioteca=new MetodoBiblioteca();
    }
        public AgregarBibliotecaSql Limpiar(){ //Función sin parametros que nos ayuda a limpiar el formulario.
        tfCodigodelibro.setText("");
        tfNombredeautor.setText("");
        tfEdicion.setText("");
        tfCodigoGrado.setText("");
        tfLink.setText("");
        tfCurso.setText("");
        tfBuscarcodigo.setText("");
        return null; //No retorna nada.
    }   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lbagregarinformacion = new javax.swing.JLabel();
        lbcodigodelibro = new javax.swing.JLabel();
        lbNombredeautor = new javax.swing.JLabel();
        lbEdicion = new javax.swing.JLabel();
        lbGrado = new javax.swing.JLabel();
        tfCodigodelibro = new javax.swing.JTextField();
        tfNombredeautor = new javax.swing.JTextField();
        tfEdicion = new javax.swing.JTextField();
        tfCodigoGrado = new javax.swing.JTextField();
        lbLink = new javax.swing.JLabel();
        lbCurso = new javax.swing.JLabel();
        tfLink = new javax.swing.JTextField();
        tfCurso = new javax.swing.JTextField();
        btGuardar = new javax.swing.JButton();
        btLimpiar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lbBME = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbBuscarcodigo = new javax.swing.JLabel();
        tfBuscarcodigo = new javax.swing.JTextField();
        btbuscar = new javax.swing.JButton();
        btModificar = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("DATOS DE BIBLIOTECA");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPanel2.setBackground(new java.awt.Color(155, 155, 245));

        jPanel3.setBackground(new java.awt.Color(255, 204, 102));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel2.setText("DATOS DE BIBLIOTECA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(17, 17, 17))
        );

        lbagregarinformacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbagregarinformacion.setText("Agregar Información:");

        lbcodigodelibro.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbcodigodelibro.setText("Código de Libro:");

        lbNombredeautor.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbNombredeautor.setText("Nombre de Autor:");

        lbEdicion.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbEdicion.setText("Edición:");

        lbGrado.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbGrado.setText("Código de grado:");

        tfCodigodelibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tfCodigodelibroMousePressed(evt);
            }
        });

        tfEdicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEdicionActionPerformed(evt);
            }
        });

        lbLink.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbLink.setText("Link:");

        lbCurso.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbCurso.setText("Curso:");

        tfCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCursoActionPerformed(evt);
            }
        });

        btGuardar.setBackground(new java.awt.Color(50, 255, 50));
        btGuardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btGuardar.setText("GUARDAR");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        btLimpiar.setBackground(new java.awt.Color(50, 255, 50));
        btLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btLimpiar.setText("LIMPIAR");
        btLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarActionPerformed(evt);
            }
        });

        lbBME.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbBME.setText("BUSCAR/MODIFICAR/ELIMINAR");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Colocar el Código de Libro en el cuadro amarillo  para poder usar los distintos botones:");

        lbBuscarcodigo.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbBuscarcodigo.setText("Código de Libro:");

        tfBuscarcodigo.setBackground(new java.awt.Color(255, 255, 155));
        tfBuscarcodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfBuscarcodigoMouseClicked(evt);
            }
        });
        tfBuscarcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBuscarcodigoActionPerformed(evt);
            }
        });

        btbuscar.setBackground(new java.awt.Color(255, 155, 155));
        btbuscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btbuscar.setText("BUSCAR");
        btbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbuscarActionPerformed(evt);
            }
        });

        btModificar.setBackground(new java.awt.Color(255, 155, 155));
        btModificar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btModificar.setText("MODIFICAR");
        btModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarActionPerformed(evt);
            }
        });

        btEliminar.setBackground(new java.awt.Color(255, 155, 155));
        btEliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btEliminar.setText("ELIMINAR");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });

        btSalir.setBackground(new java.awt.Color(255, 51, 51));
        btSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btSalir.setForeground(new java.awt.Color(255, 255, 255));
        btSalir.setText("Salir");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lbEdicion)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfEdicion))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lbNombredeautor)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfNombredeautor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lbLink)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfLink, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lbCurso)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfCurso))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbcodigodelibro)
                                    .addComponent(lbGrado))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfCodigoGrado, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(tfCodigodelibro))
                                .addGap(73, 73, 73)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btGuardar))
                                .addGap(39, 39, 39)
                                .addComponent(btSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(226, 226, 226)
                                .addComponent(lbagregarinformacion))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(208, 208, 208)
                                .addComponent(lbBME))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel10))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbBuscarcodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfBuscarcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btbuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btEliminar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbagregarinformacion)
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbcodigodelibro)
                            .addComponent(tfCodigodelibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btGuardar))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btLimpiar))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbGrado)
                                    .addComponent(tfCodigoGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbEdicion)
                            .addComponent(tfEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbLink)
                            .addComponent(tfLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCurso)
                            .addComponent(tfCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNombredeautor)
                            .addComponent(tfNombredeautor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbBME)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbBuscarcodigo)
                            .addComponent(tfBuscarcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btbuscar)
                                .addComponent(btModificar)
                                .addComponent(btEliminar))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btSalir)))
                .addContainerGap(11, Short.MAX_VALUE))
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

    private void tfEdicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEdicionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEdicionActionPerformed

    private void tfCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCursoActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        //Guardar
        MetodoBiblioteca objetoBiblioteca=new MetodoBiblioteca();
        objetoBiblioteca.Insertar(tfCodigodelibro, tfCodigoGrado, tfNombredeautor, tfEdicion, tfCurso, tfLink);
        Limpiar();
    }//GEN-LAST:event_btGuardarActionPerformed

    private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarActionPerformed
        // TODO add your handling code here:
        Limpiar();
    }//GEN-LAST:event_btLimpiarActionPerformed

    private void tfBuscarcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBuscarcodigoActionPerformed
        // TODO add your handling code here:
        tfCodigodelibro.setEnabled(false);
    }//GEN-LAST:event_tfBuscarcodigoActionPerformed

    private void btbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbuscarActionPerformed
        //Buscar
        MetodoBiblioteca objetoBiblioteca=new MetodoBiblioteca();
        objetoBiblioteca.BuscarPorCodigoAnuncio(tfBuscarcodigo, tfCodigodelibro, tfCodigoGrado, tfNombredeautor, tfEdicion, tfCurso, tfLink);
    }//GEN-LAST:event_btbuscarActionPerformed

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        //Eliminar
        MetodoBiblioteca objetoEliminar=new MetodoBiblioteca();
        objetoEliminar.EliminarBiblioteca(tfBuscarcodigo);
        Limpiar();
    }//GEN-LAST:event_btEliminarActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btSalirActionPerformed

    private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
        //Modificar  
        MetodoBiblioteca objetoModificar=new MetodoBiblioteca();
        objetoModificar.ModificarLibro(tfBuscarcodigo, tfCodigoGrado, tfNombredeautor, tfEdicion, tfCurso, tfLink);
        Limpiar();
    }//GEN-LAST:event_btModificarActionPerformed

    private void tfBuscarcodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfBuscarcodigoMouseClicked
        // TODO add your handling code here:
        //Hacemos que no se pueda modificar, para que así se inserte el dato donde es.
        tfCodigodelibro.setEnabled(false);
    }//GEN-LAST:event_tfBuscarcodigoMouseClicked

    private void tfCodigodelibroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfCodigodelibroMousePressed
        // TODO add your handling code here:
        //Volvemos a habilitar en caso que queramos guardar datos.
        tfCodigodelibro.setEnabled(true);
    }//GEN-LAST:event_tfCodigodelibroMousePressed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btLimpiar;
    private javax.swing.JButton btModificar;
    private javax.swing.JButton btSalir;
    private javax.swing.JButton btbuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbBME;
    private javax.swing.JLabel lbBuscarcodigo;
    private javax.swing.JLabel lbCurso;
    private javax.swing.JLabel lbEdicion;
    private javax.swing.JLabel lbGrado;
    private javax.swing.JLabel lbLink;
    private javax.swing.JLabel lbNombredeautor;
    private javax.swing.JLabel lbagregarinformacion;
    private javax.swing.JLabel lbcodigodelibro;
    private javax.swing.JTextField tfBuscarcodigo;
    private javax.swing.JTextField tfCodigoGrado;
    private javax.swing.JTextField tfCodigodelibro;
    private javax.swing.JTextField tfCurso;
    private javax.swing.JTextField tfEdicion;
    private javax.swing.JTextField tfLink;
    private javax.swing.JTextField tfNombredeautor;
    // End of variables declaration//GEN-END:variables
}
