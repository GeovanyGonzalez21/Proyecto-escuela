package SQL;

import Metodos.MetodoInformacion;

public class AgregarInformacionSql extends javax.swing.JFrame {

    public AgregarInformacionSql() {
        initComponents();
        setLocationRelativeTo(null); //Para colocar el Jframe centrado.
        setVisible(true);
        //Cuando se cargue el formulario que muestre los alumnos.
        MetodoInformacion objetoInformacion=new MetodoInformacion();  
    }
 public AgregarInformacionSql Limpiar(){ //Función sin parametros que nos ayuda a limpiar el formulario.
        tfCodigoAnuncio.setText("");
        taAsunto.setText("");
        taMensaje.setText("");
        tfBuscar.setText("");
        return null; //No retorna nada.
    }
 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbagregarinformacion = new javax.swing.JLabel();
        lbCodigodeanuncio = new javax.swing.JLabel();
        lbAsunto = new javax.swing.JLabel();
        lbMensaje = new javax.swing.JLabel();
        tfCodigoAnuncio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taAsunto = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        taMensaje = new javax.swing.JTextArea();
        btguardar = new javax.swing.JButton();
        btlimpiar = new javax.swing.JButton();
        lbBEMinformacion = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        lbbuscarcodigo = new javax.swing.JLabel();
        tfBuscar = new javax.swing.JTextField();
        btBuscarcodigo = new javax.swing.JButton();
        btmodificarinfo = new javax.swing.JButton();
        bteliminarinfo = new javax.swing.JButton();
        btsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(155, 155, 245));

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("DATOS DE INFORMACION");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        lbagregarinformacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbagregarinformacion.setText("Agregar Informacion");

        lbCodigodeanuncio.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbCodigodeanuncio.setText("Codigo de Anuncio:");

        lbAsunto.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbAsunto.setText("Asunto:");

        lbMensaje.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbMensaje.setText("Mensaje:");

        tfCodigoAnuncio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tfCodigoAnuncioMousePressed(evt);
            }
        });

        taAsunto.setColumns(20);
        taAsunto.setRows(5);
        jScrollPane1.setViewportView(taAsunto);

        taMensaje.setColumns(20);
        taMensaje.setRows(5);
        jScrollPane2.setViewportView(taMensaje);

        btguardar.setBackground(new java.awt.Color(50, 255, 50));
        btguardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btguardar.setText("GUARDAR");
        btguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btguardarActionPerformed(evt);
            }
        });

        btlimpiar.setBackground(new java.awt.Color(50, 255, 50));
        btlimpiar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btlimpiar.setText("LIMPIAR");
        btlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlimpiarActionPerformed(evt);
            }
        });

        lbBEMinformacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbBEMinformacion.setText("BUSCAR/ ELIMINAR/ MODIFICAR INFORMACIÓN");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Colocar el Código de anuncio en el cuadro amarillo  para poder usar los distintos botones:");

        lbbuscarcodigo.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbbuscarcodigo.setText("Código de Anuncio:");

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

        btBuscarcodigo.setBackground(new java.awt.Color(255, 155, 155));
        btBuscarcodigo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btBuscarcodigo.setText("BUSCAR");
        btBuscarcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarcodigoActionPerformed(evt);
            }
        });

        btmodificarinfo.setBackground(new java.awt.Color(255, 155, 155));
        btmodificarinfo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btmodificarinfo.setText("MODIFICAR");
        btmodificarinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmodificarinfoActionPerformed(evt);
            }
        });

        bteliminarinfo.setBackground(new java.awt.Color(255, 155, 155));
        bteliminarinfo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bteliminarinfo.setText("ELIMINAR");
        bteliminarinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteliminarinfoActionPerformed(evt);
            }
        });

        btsalir.setBackground(new java.awt.Color(255, 51, 51));
        btsalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btsalir.setForeground(new java.awt.Color(255, 255, 255));
        btsalir.setText("Salir");
        btsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(lbagregarinformacion))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbbuscarcodigo)
                                .addGap(18, 18, 18)
                                .addComponent(tfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(btBuscarcodigo)
                                .addGap(28, 28, 28)
                                .addComponent(btmodificarinfo)
                                .addGap(18, 18, 18)
                                .addComponent(bteliminarinfo))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbBEMinformacion)
                                .addComponent(jLabel2)))))
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbMensaje)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbCodigodeanuncio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfCodigoAnuncio))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbAsunto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1)))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btguardar)
                        .addComponent(btlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btsalir))
                .addGap(10, 10, 10))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbagregarinformacion)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCodigodeanuncio)
                            .addComponent(tfCodigoAnuncio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btguardar))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbAsunto)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbMensaje)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lbBEMinformacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbbuscarcodigo)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btBuscarcodigo)
                                .addComponent(btmodificarinfo)
                                .addComponent(bteliminarinfo))
                            .addComponent(tfBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(btlimpiar)
                        .addGap(18, 18, 18)
                        .addComponent(btsalir)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalirActionPerformed
        // TODO add your handling code here:
          dispose(); //Cierra únicamente la ventana emergente que se está utilizando.
    }//GEN-LAST:event_btsalirActionPerformed

    
    private void btguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btguardarActionPerformed
        // TODO add your handling code here:
        MetodoInformacion objetoInformacion=new MetodoInformacion();
        objetoInformacion.Insertar(tfCodigoAnuncio, taAsunto,taMensaje);
        Limpiar();

    }//GEN-LAST:event_btguardarActionPerformed

    private void btlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlimpiarActionPerformed
        // TODO add your handling code here:
         Limpiar();
    }//GEN-LAST:event_btlimpiarActionPerformed

    private void btBuscarcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarcodigoActionPerformed
       //Buscar
        MetodoInformacion objetoInformacion=new MetodoInformacion();
        objetoInformacion.BuscarPorCodigoAnuncio(tfBuscar, tfCodigoAnuncio, taAsunto, taMensaje);

    }//GEN-LAST:event_btBuscarcodigoActionPerformed

    private void btmodificarinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmodificarinfoActionPerformed
        //Modificar
        MetodoInformacion objetoModificar=new MetodoInformacion();
        objetoModificar.ModificarInformacion(tfBuscar, taAsunto,taMensaje);
        Limpiar();
    }//GEN-LAST:event_btmodificarinfoActionPerformed

    private void bteliminarinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteliminarinfoActionPerformed
        //Eliminar
        MetodoInformacion objetoModificar=new MetodoInformacion();
        objetoModificar.EliminarInformacion(tfBuscar);
        Limpiar();
    }//GEN-LAST:event_bteliminarinfoActionPerformed

    private void tfBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfBuscarMouseClicked

    }//GEN-LAST:event_tfBuscarMouseClicked

    private void tfBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBuscarActionPerformed
        tfCodigoAnuncio.setEnabled(false);        
    }//GEN-LAST:event_tfBuscarActionPerformed

    private void tfCodigoAnuncioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfCodigoAnuncioMousePressed
        tfCodigoAnuncio.setEnabled(true);
    }//GEN-LAST:event_tfCodigoAnuncioMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscarcodigo;
    private javax.swing.JButton bteliminarinfo;
    private javax.swing.JButton btguardar;
    private javax.swing.JButton btlimpiar;
    private javax.swing.JButton btmodificarinfo;
    private javax.swing.JButton btsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbAsunto;
    private javax.swing.JLabel lbBEMinformacion;
    private javax.swing.JLabel lbCodigodeanuncio;
    private javax.swing.JLabel lbMensaje;
    private javax.swing.JLabel lbagregarinformacion;
    private javax.swing.JLabel lbbuscarcodigo;
    private javax.swing.JTextArea taAsunto;
    private javax.swing.JTextArea taMensaje;
    private javax.swing.JTextField tfBuscar;
    private javax.swing.JTextField tfCodigoAnuncio;
    // End of variables declaration//GEN-END:variables
}
