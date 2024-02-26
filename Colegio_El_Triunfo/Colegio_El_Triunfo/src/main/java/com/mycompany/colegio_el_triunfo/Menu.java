package com.mycompany.colegio_el_triunfo;

import Reportes.ReporteAsignacionEsGra;
import Reportes.ReporteAsignacionPilotoBus;
import Reportes.ReporteAsignacionCa;
import Reportes.ReporteAsignacionEsBus;
import Reportes.ReporteAutobus;
import Reportes.ReporteBiblioteca;
import Reportes.ReporteCatedratico;
import Reportes.ReporteComida;
import Reportes.ReporteEmpleados;
import Reportes.ReporteEstudiante;
import Reportes.ReporteGrado;
import Reportes.ReporteInformacion;
import Reportes.ReportePiloto;
import Reportes.ReporteUtensilios;
import SQL.AgregarAutobusSql;
import SQL.AgregarBibliotecaSql;
import SQL.AgregarComidasql;
import SQL.AgregarEstudianteSql;
import SQL.AgregarGradoSql;
import SQL.AgregarInformacionSql;
import SQL.AgregarPilotoSql;
import SQL.AsignarCatedraticosql;
import SQL.AsignarEstudianteBusSql;
import SQL.AsignarEstudianteGradoSql;
import SQL.AsignarTransporteSql;
import SQL.Catedraticosql;
import SQL.Empleadosql;
import SQL.Inventariosql;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taFrase = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        btSalir = new javax.swing.JButton();
        lbDireccion = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        muEstudiante = new javax.swing.JMenu();
        miAgregarEstudiante = new javax.swing.JMenuItem();
        muAsignación = new javax.swing.JMenu();
        miAsignar = new javax.swing.JMenuItem();
        muGrado = new javax.swing.JMenu();
        miCrear = new javax.swing.JMenuItem();
        muCatedráticos = new javax.swing.JMenu();
        muCatedratico = new javax.swing.JMenuItem();
        miDesignarCurso = new javax.swing.JMenuItem();
        muInformación = new javax.swing.JMenu();
        miAgregarInformacion = new javax.swing.JMenuItem();
        btAsignarBus = new javax.swing.JMenu();
        miAgregarPiloto = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        miAsignarBus = new javax.swing.JMenuItem();
        miAsignarEsBus = new javax.swing.JMenuItem();
        muBiblioteca = new javax.swing.JMenu();
        miAgregar = new javax.swing.JMenuItem();
        muServicioLimpieza = new javax.swing.JMenu();
        miEmpleado = new javax.swing.JMenuItem();
        miActualizarInventario = new javax.swing.JMenuItem();
        muComida = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        muReporte = new javax.swing.JMenu();
        miEstudiantes = new javax.swing.JMenuItem();
        muGrados = new javax.swing.JMenuItem();
        miReporteAsignacionEs = new javax.swing.JMenuItem();
        muCatedraticos = new javax.swing.JMenuItem();
        miAsignacionCa = new javax.swing.JMenuItem();
        miReporteInformacion = new javax.swing.JMenuItem();
        miReportePiloto = new javax.swing.JMenuItem();
        miReporteAutobus = new javax.swing.JMenuItem();
        miAsigPilotoBus = new javax.swing.JMenuItem();
        muAsingarEsBus = new javax.swing.JMenuItem();
        miReporteBiblioteca = new javax.swing.JMenuItem();
        miReporteEmpleados = new javax.swing.JMenuItem();
        miReporteUtensilios = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 51));

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));
        jPanel2.setToolTipText("");

        jLabel1.setBackground(new java.awt.Color(255, 204, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setText("Sistema Administrativo Colegio \"El triunfo\"");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel2.setText("Usuario: Administrador    Año: 2023");

        taFrase.setBackground(new java.awt.Color(255, 255, 153));
        taFrase.setColumns(20);
        taFrase.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        taFrase.setRows(5);
        taFrase.setText("\"La enseñanza que deja huella no es la que se hace  de cabeza a cabeza,  sino de corazón a corazón.\"\n                                                                                                                       -Howard G. Hendricks");
        jScrollPane1.setViewportView(taFrase);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel3.setText("!Bienvenido! ¡Es un gusto tenerte de nuevo por aquí!");

        btSalir.setBackground(new java.awt.Color(255, 102, 102));
        btSalir.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btSalir.setText("Salir");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        lbDireccion.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lbDireccion.setText("4ta Calle y 10 ma avenida lote 145, Amatitlán.           Teléfono: 66332387");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(lbDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(54, 54, 54)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(420, 420, 420)
                        .addComponent(btSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbDireccion)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jMenuBar1.setBackground(new java.awt.Color(255, 102, 102));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar1.setForeground(new java.awt.Color(51, 51, 51));
        jMenuBar1.setToolTipText("");

        muEstudiante.setText("Estudiante");

        miAgregarEstudiante.setText("Agregar");
        miAgregarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAgregarEstudianteActionPerformed(evt);
            }
        });
        muEstudiante.add(miAgregarEstudiante);

        jMenuBar1.add(muEstudiante);

        muAsignación.setText("Asignación de grado");

        miAsignar.setText("Asignar");
        miAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAsignarActionPerformed(evt);
            }
        });
        muAsignación.add(miAsignar);

        jMenuBar1.add(muAsignación);

        muGrado.setText("Grado");

        miCrear.setText("Crear");
        miCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCrearActionPerformed(evt);
            }
        });
        muGrado.add(miCrear);

        jMenuBar1.add(muGrado);

        muCatedráticos.setText("Catedrático");

        muCatedratico.setText("Agregar");
        muCatedratico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muCatedraticoActionPerformed(evt);
            }
        });
        muCatedráticos.add(muCatedratico);

        miDesignarCurso.setText("Designar curso");
        miDesignarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miDesignarCursoActionPerformed(evt);
            }
        });
        muCatedráticos.add(miDesignarCurso);

        jMenuBar1.add(muCatedráticos);

        muInformación.setText("Información");

        miAgregarInformacion.setText("Agregar");
        miAgregarInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAgregarInformacionActionPerformed(evt);
            }
        });
        muInformación.add(miAgregarInformacion);

        jMenuBar1.add(muInformación);

        btAsignarBus.setText("Transporte");

        miAgregarPiloto.setText("Agregar Piloto");
        miAgregarPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAgregarPilotoActionPerformed(evt);
            }
        });
        btAsignarBus.add(miAgregarPiloto);

        jMenuItem3.setText("Agregar Autobus");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        btAsignarBus.add(jMenuItem3);

        miAsignarBus.setText("Asignar piloto-autobus");
        miAsignarBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAsignarBusActionPerformed(evt);
            }
        });
        btAsignarBus.add(miAsignarBus);

        miAsignarEsBus.setText("Asignar estudiante-autobus");
        miAsignarEsBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAsignarEsBusActionPerformed(evt);
            }
        });
        btAsignarBus.add(miAsignarEsBus);

        jMenuBar1.add(btAsignarBus);

        muBiblioteca.setText("Biblioteca");

        miAgregar.setText("Agregar");
        miAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAgregarActionPerformed(evt);
            }
        });
        muBiblioteca.add(miAgregar);

        jMenuBar1.add(muBiblioteca);

        muServicioLimpieza.setText("Servicio de limpieza");

        miEmpleado.setText("Empleado");
        miEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEmpleadoActionPerformed(evt);
            }
        });
        muServicioLimpieza.add(miEmpleado);

        miActualizarInventario.setText("Actualizar inventario");
        miActualizarInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miActualizarInventarioActionPerformed(evt);
            }
        });
        muServicioLimpieza.add(miActualizarInventario);

        jMenuBar1.add(muServicioLimpieza);

        muComida.setText("Comida");

        jMenuItem1.setText("Agregar comida");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        muComida.add(jMenuItem1);

        jMenuBar1.add(muComida);

        muReporte.setText("Reporte");

        miEstudiantes.setText("Estudiantes");
        miEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEstudiantesActionPerformed(evt);
            }
        });
        muReporte.add(miEstudiantes);

        muGrados.setText("Grados");
        muGrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muGradosActionPerformed(evt);
            }
        });
        muReporte.add(muGrados);

        miReporteAsignacionEs.setText("Asignación estudiante-grado");
        miReporteAsignacionEs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miReporteAsignacionEsActionPerformed(evt);
            }
        });
        muReporte.add(miReporteAsignacionEs);

        muCatedraticos.setText("Catedráticos");
        muCatedraticos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muCatedraticosActionPerformed(evt);
            }
        });
        muReporte.add(muCatedraticos);

        miAsignacionCa.setText("Asignación catedráticos");
        miAsignacionCa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAsignacionCaActionPerformed(evt);
            }
        });
        muReporte.add(miAsignacionCa);

        miReporteInformacion.setText("Información");
        miReporteInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miReporteInformacionActionPerformed(evt);
            }
        });
        muReporte.add(miReporteInformacion);

        miReportePiloto.setText("Piloto");
        miReportePiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miReportePilotoActionPerformed(evt);
            }
        });
        muReporte.add(miReportePiloto);

        miReporteAutobus.setText("Autobus");
        miReporteAutobus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miReporteAutobusActionPerformed(evt);
            }
        });
        muReporte.add(miReporteAutobus);

        miAsigPilotoBus.setText("Asignación piloto-bus");
        miAsigPilotoBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAsigPilotoBusActionPerformed(evt);
            }
        });
        muReporte.add(miAsigPilotoBus);

        muAsingarEsBus.setText("Asignación estudiante-transporte");
        muAsingarEsBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muAsingarEsBusActionPerformed(evt);
            }
        });
        muReporte.add(muAsingarEsBus);

        miReporteBiblioteca.setText("Biblioteca");
        miReporteBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miReporteBibliotecaActionPerformed(evt);
            }
        });
        muReporte.add(miReporteBiblioteca);

        miReporteEmpleados.setText("Empleados");
        miReporteEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miReporteEmpleadosActionPerformed(evt);
            }
        });
        muReporte.add(miReporteEmpleados);

        miReporteUtensilios.setText("Utensilios");
        miReporteUtensilios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miReporteUtensiliosActionPerformed(evt);
            }
        });
        muReporte.add(miReporteUtensilios);

        jMenuItem2.setText("Comida");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        muReporte.add(jMenuItem2);

        jMenuBar1.add(muReporte);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);//Cerrar el programa por completo
    }//GEN-LAST:event_btSalirActionPerformed

    private void miEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEstudiantesActionPerformed
        ReporteEstudiante vReporteEstudiante=new ReporteEstudiante();
    }//GEN-LAST:event_miEstudiantesActionPerformed

    private void miAgregarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAgregarEstudianteActionPerformed
        // TODO add your handling code here:
        AgregarEstudianteSql vAgregarEstudiante=new AgregarEstudianteSql();
    }//GEN-LAST:event_miAgregarEstudianteActionPerformed

    private void miAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAsignarActionPerformed
        // TODO add your handling code here:
        AsignarEstudianteGradoSql vAsignarEstudiante=new AsignarEstudianteGradoSql();
    }//GEN-LAST:event_miAsignarActionPerformed

    private void miCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCrearActionPerformed
        // TODO add your handling code here:
            AgregarGradoSql vAgregarGrado=new AgregarGradoSql();
    }//GEN-LAST:event_miCrearActionPerformed

    private void muGradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muGradosActionPerformed
        // TODO add your handling code here:
        ReporteGrado vReporteGrado= new ReporteGrado();
    }//GEN-LAST:event_muGradosActionPerformed

    private void muCatedraticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muCatedraticoActionPerformed
        //Abriendo ventana AgregarCatedratico
        Catedraticosql vAgregarCatedratico=new Catedraticosql();
    }//GEN-LAST:event_muCatedraticoActionPerformed

    private void muCatedraticosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muCatedraticosActionPerformed
        //Abriendo ventana ReporteCatedraticos
        ReporteCatedratico ventana=new ReporteCatedratico();
    }//GEN-LAST:event_muCatedraticosActionPerformed

    private void miAgregarPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAgregarPilotoActionPerformed
        // TODO add your handling code here:
        AgregarPilotoSql vAgregarTransporte=new AgregarPilotoSql();
    }//GEN-LAST:event_miAgregarPilotoActionPerformed

    private void miReporteAsignacionEsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miReporteAsignacionEsActionPerformed

        //Abrir ventana de reporte asignacion
        ReporteAsignacionEsGra vReporteAsignacion=new ReporteAsignacionEsGra();
    }//GEN-LAST:event_miReporteAsignacionEsActionPerformed

    private void miDesignarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miDesignarCursoActionPerformed
        // TODO add your handling code here:
        AsignarCatedraticosql vAsignarCatedratico=new AsignarCatedraticosql();
    }//GEN-LAST:event_miDesignarCursoActionPerformed

    private void miAsignacionCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAsignacionCaActionPerformed
        // TODO add your handling code here:
        //Abrir ventana reportes de asignación de catedráticos
        ReporteAsignacionCa vReporteAginacionCa=new ReporteAsignacionCa();
    }//GEN-LAST:event_miAsignacionCaActionPerformed

    private void miAsignarBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAsignarBusActionPerformed
        // TODO add your handling code here:
        AsignarTransporteSql vAsignarTransporte=new AsignarTransporteSql();
    }//GEN-LAST:event_miAsignarBusActionPerformed

    private void miAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAgregarActionPerformed
        // TODO add your handling code here:
        AgregarBibliotecaSql vAgregarBiblioteca=new AgregarBibliotecaSql();
    }//GEN-LAST:event_miAgregarActionPerformed

    private void miAgregarInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAgregarInformacionActionPerformed
        // TODO add your handling code here:
        AgregarInformacionSql vAgregarInformacionSql=new AgregarInformacionSql();
    }//GEN-LAST:event_miAgregarInformacionActionPerformed

    private void miReporteInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miReporteInformacionActionPerformed
        // TODO add your handling code here:
        ReporteInformacion vReporteInformacion=new ReporteInformacion();
    }//GEN-LAST:event_miReporteInformacionActionPerformed

    private void miReporteBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miReporteBibliotecaActionPerformed
        // TODO add your handling code here:
        ReporteBiblioteca vReporteBiblioteca=new ReporteBiblioteca();
    }//GEN-LAST:event_miReporteBibliotecaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        AgregarComidasql vAgregarComida=new AgregarComidasql();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        ReporteComida vReporteComida=new ReporteComida();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void miAsigPilotoBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAsigPilotoBusActionPerformed
        // TODO add your handling code here:
        ReporteAsignacionPilotoBus vReporteAsignacionBus=new ReporteAsignacionPilotoBus();
    }//GEN-LAST:event_miAsigPilotoBusActionPerformed

    private void miEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEmpleadoActionPerformed
        // TODO add your handling code here:
        Empleadosql vEmpleadosql=new Empleadosql();
    }//GEN-LAST:event_miEmpleadoActionPerformed

    private void miActualizarInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miActualizarInventarioActionPerformed
        // TODO add your handling code here:
       Inventariosql vInventario=new Inventariosql();

    }//GEN-LAST:event_miActualizarInventarioActionPerformed

    private void miReporteEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miReporteEmpleadosActionPerformed
        // TODO add your handling code here:
        ReporteEmpleados vReporteEmpleados=new ReporteEmpleados();
    }//GEN-LAST:event_miReporteEmpleadosActionPerformed

    private void miReporteUtensiliosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miReporteUtensiliosActionPerformed
        // TODO add your handling code here:
        ReporteUtensilios vReporteUtensilios=new ReporteUtensilios();
    }//GEN-LAST:event_miReporteUtensiliosActionPerformed

    private void miReportePilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miReportePilotoActionPerformed
        // TODO add your handling code here:
        ReportePiloto vReportePiloto=new ReportePiloto();
    }//GEN-LAST:event_miReportePilotoActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        AgregarAutobusSql vAgregarAutobus=new AgregarAutobusSql();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void miReporteAutobusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miReporteAutobusActionPerformed
        // TODO add your handling code here:
        ReporteAutobus vReporteAutobus=new ReporteAutobus();
    }//GEN-LAST:event_miReporteAutobusActionPerformed

    private void miAsignarEsBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAsignarEsBusActionPerformed
        // TODO add your handling code here:
        AsignarEstudianteBusSql ventanaAEB=new AsignarEstudianteBusSql();
    }//GEN-LAST:event_miAsignarEsBusActionPerformed

    private void muAsingarEsBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muAsingarEsBusActionPerformed
        // TODO add your handling code here:
        ReporteAsignacionEsBus ventananaEB=new ReporteAsignacionEsBus();
    }//GEN-LAST:event_muAsingarEsBusActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btAsignarBus;
    private javax.swing.JButton btSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDireccion;
    private javax.swing.JMenuItem miActualizarInventario;
    private javax.swing.JMenuItem miAgregar;
    private javax.swing.JMenuItem miAgregarEstudiante;
    private javax.swing.JMenuItem miAgregarInformacion;
    private javax.swing.JMenuItem miAgregarPiloto;
    private javax.swing.JMenuItem miAsigPilotoBus;
    private javax.swing.JMenuItem miAsignacionCa;
    private javax.swing.JMenuItem miAsignar;
    private javax.swing.JMenuItem miAsignarBus;
    private javax.swing.JMenuItem miAsignarEsBus;
    private javax.swing.JMenuItem miCrear;
    private javax.swing.JMenuItem miDesignarCurso;
    private javax.swing.JMenuItem miEmpleado;
    private javax.swing.JMenuItem miEstudiantes;
    private javax.swing.JMenuItem miReporteAsignacionEs;
    private javax.swing.JMenuItem miReporteAutobus;
    private javax.swing.JMenuItem miReporteBiblioteca;
    private javax.swing.JMenuItem miReporteEmpleados;
    private javax.swing.JMenuItem miReporteInformacion;
    private javax.swing.JMenuItem miReportePiloto;
    private javax.swing.JMenuItem miReporteUtensilios;
    private javax.swing.JMenu muAsignación;
    private javax.swing.JMenuItem muAsingarEsBus;
    private javax.swing.JMenu muBiblioteca;
    private javax.swing.JMenuItem muCatedratico;
    private javax.swing.JMenuItem muCatedraticos;
    private javax.swing.JMenu muCatedráticos;
    private javax.swing.JMenu muComida;
    private javax.swing.JMenu muEstudiante;
    private javax.swing.JMenu muGrado;
    private javax.swing.JMenuItem muGrados;
    private javax.swing.JMenu muInformación;
    private javax.swing.JMenu muReporte;
    private javax.swing.JMenu muServicioLimpieza;
    private javax.swing.JTextArea taFrase;
    // End of variables declaration//GEN-END:variables

    
}
