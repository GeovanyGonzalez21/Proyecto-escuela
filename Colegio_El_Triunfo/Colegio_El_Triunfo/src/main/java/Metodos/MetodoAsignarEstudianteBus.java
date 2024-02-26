
package Metodos;

import com.mycompany.colegio_el_triunfo.Conexion;
import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class MetodoAsignarEstudianteBus {
    //Atributos
    int CodigoAsignacion;
    int CodigoEstudiante;
    int CodigoTransporte;
    String DireccionEs;
    String TelefonoEs;

    //Getters and setters
    public int getCodigoAsignacion() {
        return CodigoAsignacion;
    }

    public void setCodigoAsignacion(int CodigoAsignacion) {
        this.CodigoAsignacion = CodigoAsignacion;
    }

    public int getCodigoEstudiante() {
        return CodigoEstudiante;
    }

    public void setCodigoEstudiante(int CodigoEstudiante) {
        this.CodigoEstudiante = CodigoEstudiante;
    }

    public int getCodigoTransporte() {
        return CodigoTransporte;
    }

    public void setCodigoTransporte(int CodigoTransporte) {
        this.CodigoTransporte = CodigoTransporte;
    }

    public String getDireccionEs() {
        return DireccionEs;
    }

    public void setDireccionEs(String DireccionEs) {
        this.DireccionEs = DireccionEs;
    }

    public String getTelefonoEs() {
        return TelefonoEs;
    }

    public void setTelefonoEs(String TelefonoEn) {
        this.TelefonoEs = TelefonoEn;
    }
    
    //Insertar
    public void Insertar(JTextField paramCodigoAsignacion,JTextField paramCodigoEstudiante, JTextField paramCodigoTransporte, JTextArea paramDireccion,JTextField paramTelefono){
       //Incorporamos los valores obtenidos del formulario
       try{
           //Verificamos que no hayan textfield vacios
           if(paramCodigoAsignacion.getText().isEmpty()||paramCodigoEstudiante.getText().isEmpty()||paramCodigoTransporte.getText().isEmpty()||paramDireccion.getText().isEmpty()||paramTelefono.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Verificar que todos los campos tengas sus datos", "Campo vacío",JOptionPane.ERROR_MESSAGE);               
           }else{
           //Pasamos de cadenos de texto a int
           int CodigoAsing=parseInt(paramCodigoAsignacion.getText());
           int CodigoEstu=parseInt(paramCodigoEstudiante.getText());
           int CodigoTrans=parseInt(paramCodigoTransporte.getText());
           
           setCodigoAsignacion(CodigoAsing);
           setCodigoEstudiante(CodigoEstu);
           setCodigoTransporte(CodigoTrans);
           
           //Los demas si los pasamos como vienen (String
           setDireccionEs(paramDireccion.getText());
           setTelefonoEs(paramTelefono.getText());
           
           //Conexion lista para enlazar
           Conexion objetoConexion=new Conexion();
           //Incorporar valores a la base de datos.
           String Consulta="insert into asignarbusestudiante(CodigoAsignacion,CodigoEstudiante,CodigoBus,DireccionEstudiante,TelefonoEncargado) values (?,?,?,?,?);";
           
           //Enlazamos mi conexion con la consulta
           CallableStatement cs=objetoConexion.establecerConexion().prepareCall(Consulta);
           
           //Incorporar los parametros
           //'?' es donde vamos a colocar los parametros
           cs.setInt(1, getCodigoAsignacion());
           cs.setInt(2, getCodigoEstudiante());
           cs.setInt(3, getCodigoTransporte());
           cs.setString(4, getDireccionEs());
           cs.setString(5, getTelefonoEs());
           
           //Ejecutamos
           cs.execute();
           //Después que se ejecute nos enseñe un mensaje.
            JOptionPane.showMessageDialog(null,"Se insertó correctamente al la asignacion" , "Guardado",JOptionPane.INFORMATION_MESSAGE);
        } 
        } catch (SQLException ex) {
             //Error si se repite la primary key o registros únicos
            if(ex.getErrorCode()==1062){
                JOptionPane.showMessageDialog(null, "Código de asignacion/estudiante se encuentra en uso.", "LLave primaria/registro único duplicado ",JOptionPane.ERROR_MESSAGE);
            }else if(ex.getErrorCode()==1452){
                JOptionPane.showMessageDialog(null, "No se encuentra la llave primaria en la tabla de estudiantes/autobus", "LLave foránea no encontrada",JOptionPane.ERROR_MESSAGE);
            }            
            else{
                JOptionPane.showMessageDialog(null,"Error: "+ex.toString() , "No se a podido insertar la asignación",JOptionPane.ERROR_MESSAGE);
            }
        } 
    }
    //Modificar
    public void Modificar(JTextField paramCodigoAsignacion,JTextField paramCodigoEstudiante, JTextField paramCodigoTransporte, JTextArea paramDireccion,JTextField paramTelefono){
        try{
           //Verificamos que no hayan textfield vacios
           if(paramCodigoAsignacion.getText().isEmpty()||paramCodigoEstudiante.getText().isEmpty()||paramCodigoTransporte.getText().isEmpty()||paramDireccion.getText().isEmpty()||paramTelefono.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Verificar que todos los campos tengas sus datos", "Campo vacío",JOptionPane.ERROR_MESSAGE);               
            }else{
                //Pasamos los codigos a entero
                setCodigoAsignacion(Integer.parseInt(paramCodigoAsignacion.getText()));
                setCodigoEstudiante(Integer.parseInt(paramCodigoEstudiante.getText()));
                setCodigoTransporte(Integer.parseInt(paramCodigoTransporte.getText()));
                //Los demas datos string
                setDireccionEs(paramDireccion.getText());
                setTelefonoEs(paramTelefono.getText());
                //Preparando conexion
                Conexion conbase=new Conexion();
                //Codigo de buscar de sql
                String Consulta2="select CodigoAsignacion,CodigoEstudiante,CodigoBus,DireccionEstudiante,TelefonoEncargado from asignarbusestudiante where  asignarbusestudiante.CodigoAsignacion=?;";
                CallableStatement buscar=conbase.establecerConexion().prepareCall(Consulta2);
                buscar.setInt(1, getCodigoAsignacion());
                buscar.execute();
                //Result set=proporciona varios métodos para obtener los datos de columna correspondientes a un fila.
                ResultSet buscare=buscar.executeQuery();
                //Si lo encuentra va a ejecutar y modificar, caso contrario lo que va a pasar es mandar al error de que no se encuentra.
                if(buscare.next()){
                    //Si lo encuentra va a ejecutar y modificar, caso contrario lo que va a pasar es mandar al error de que no se encuentra.
                    String Consulta="update asignarbusestudiante set asignarbusestudiante.CodigoEstudiante=?, asignarbusestudiante.CodigoBus=?, asignarBusestudiante.DireccionEstudiante=?, asignarBusestudiante.TelefonoEncargado=? where asignarbusestudiante.CodigoAsignacion=?;";
                    CallableStatement cs=conbase.establecerConexion().prepareCall(Consulta);
                    cs.setInt(1, getCodigoEstudiante());
                    cs.setInt(2, getCodigoTransporte());
                    cs.setString(3, getDireccionEs());
                    cs.setString(4, getTelefonoEs());
                    cs.setInt(5, getCodigoAsignacion());            
                    //Ejecutamos
                    cs.execute();
                    JOptionPane.showMessageDialog(null,"Se modificó correctamente al la asignacion" , "Modificado",JOptionPane.INFORMATION_MESSAGE);
                }else{
                JOptionPane.showMessageDialog(null, "La asignación no se modificó, porque no se encuentra el código en la base.", "Código de asignacion no encontrado",JOptionPane.ERROR_MESSAGE);            
                }
            }
        } catch (SQLException ex) {
             //Error si se repite la primary key o registros únicos
            if(ex.getErrorCode()==1062){
                JOptionPane.showMessageDialog(null, "Código de estudiante se encuentra en uso.", "Registro único duplicado ",JOptionPane.ERROR_MESSAGE);
            }else if(ex.getErrorCode()==1452){
                JOptionPane.showMessageDialog(null, "No se encuentra la llave primaria en la tabla de estudiantes/autobus", "LLave foránea no encontrada",JOptionPane.ERROR_MESSAGE);
            }            
            else{
                JOptionPane.showMessageDialog(null,"Error: "+ex.toString() , "No se ha podido modificar la asignación",JOptionPane.ERROR_MESSAGE);
            }
        } 
    }
    
    //Llenar tabla con los datos de la tabla, método utilizado en reporte.
    public void Mostrar(JTable paramTablaAsignacionEB){
        //Creamos un objeto tipo Conexion
        Conexion objetoConexion=new Conexion();
        
        DefaultTableModel modelo=new DefaultTableModel();
        //Incorporamos un orden de cabecera. Sirve para ordenar la tabla
        TableRowSorter<TableModel>OrdenarTabla=new TableRowSorter<TableModel>(modelo);
        //Donde va a estar mi conuslta de sql
        String sql="";
        
        //Añadimos a la tabla las columnas.
        modelo.addColumn("Código de asignación");
        modelo.addColumn("Código de estudiante");
        modelo.addColumn("Código de autobus");
        modelo.addColumn("Dirección estudiante");
        modelo.addColumn("Teléfono encargado");
        
        //A la tabla vacía le isnertamos el modelo previamente creado.
        paramTablaAsignacionEB.setModel(modelo);
        
        //En la variable sql hacemos el select from de la tabla asignarbusestudiante.
        sql="select*from asignarbusestudiante;";
        
        //5 porque hay 5 columnas.
        String[]datos=new String[4];
        Statement st; //Va a realizar la consulta
        //Hacemos un try catch para atrapar error y no se cierre el programa.
        try{
            //Realizando la conexion
            st=objetoConexion.establecerConexion().createStatement();
            ResultSet rs=st.executeQuery(sql); //Ejecutamos la consulta
            
            //Llenando el modelo con los datos
            while(rs.next()){
                //Los vectores siempre inician en 0, los parámetros no.
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                
                //Incorpore las filas a la tabla
                modelo.addRow(datos);
            }
            //Incorpore el modelo a la tabla vacía y la llena.
            paramTablaAsignacionEB.setModel(modelo);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error: "+ex.toString() , "No se pudieron mostrar los registros",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Eliminar
    public void EliminarAsignacion(JTextField paramCodigoAsignacion){
       try{
        if(paramCodigoAsignacion.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Verificar que el campo de buscar código este lleno.", "Campo vacío",JOptionPane.ERROR_MESSAGE);                    
        }else{           
            //Pasamos de string a int
            setCodigoAsignacion(parseInt(paramCodigoAsignacion.getText()));
            //Creamos el objeto con el cual nos conectaremos a la base de datos.
            Conexion objeto=new Conexion();

            //Código para eliminar de sql
            String Consulta="delete from asignarbusestudiante where codigoAsignacion=?;";
            //Codigo para buscar de sql
            String Consulta2="select CodigoAsignacion,CodigoEstudiante,CodigoBus,DireccionEstudiante,TelefonoEncargado from asignarbusestudiante where  asignarbusestudiante.CodigoAsignacion=?;";
            //Hacemos un try catch para evitar que el programa se cierre al momento de un error.

                //Primero verificaremos si existe, luego vamos a eliminar.
                CallableStatement buscar=objeto.establecerConexion().prepareCall(Consulta2);
                buscar.setInt(1, getCodigoAsignacion());
                buscar.execute();
                //Result set=proporciona varios métodos para obtener los datos de columna correspondientes a un fila.
                ResultSet buscarab=buscar.executeQuery();
                //Si lo encuentra va a poderse eliminar.
                if(buscarab.next()){

               //El método prepareCall se utiliza para crear objetos CallableStatement nuevos.
               CallableStatement cs=objeto.establecerConexion().prepareCall(Consulta);
               cs.setInt(1, getCodigoAsignacion());
               //Rjecutamos
               cs.execute();

               //Si se ejecutó correctamente.
                JOptionPane.showMessageDialog(null, "La asignación a sido eliminada con éxito", "Eliminada",JOptionPane.INFORMATION_MESSAGE);
            //Si no lo encuentra.
            }else{
                    JOptionPane.showMessageDialog(null,"No se pudo eliminar la asignación." , "Codigo de asignación no encontrado",JOptionPane.ERROR_MESSAGE);                           
                }
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error: "+ex.toString() , "No se pudo eliminar la asignación",JOptionPane.ERROR_MESSAGE);
        }
    }
    //Buscar por codigo de asignacion
    public void BuscarPorCodigoAsignar(JTextField CodigoBuscar,JTextField paramCodigoAsignacion,JTextField paramCodigoEstudiante, JTextField paramCodigoTransporte, JTextArea paramDireccion,JTextField paramTelefono){
        try{
           if(CodigoBuscar.getText().isEmpty()){
              JOptionPane.showMessageDialog(null, "Verificar que el dato de buscar codigo este lleno", "Campo vacío",JOptionPane.ERROR_MESSAGE);               
           }else{    
            //Guardarmos nuestra consulta en una cadena de texto.
            //Código de sql
            String Consulta="select CodigoAsignacion,CodigoEstudiante,CodigoBus,DireccionEstudiante,TelefonoEncargado from asignarbusestudiante where  asignarbusestudiante.CodigoAsignacion=?;";
            //Nos conectamos a la base de datos.
            Conexion objetoAsignar=new Conexion();
                CallableStatement cs=objetoAsignar.establecerConexion().prepareCall(Consulta);
                //Pasamos el parámetro a int porque codigo de asignacion es un int
                setCodigoAsignacion(Integer.parseInt(CodigoBuscar.getText()));
                cs.setInt(1, getCodigoAsignacion());

                //Ejecutamos
                cs.execute();

                //Result set=proporciona varios métodos para obtener los datos de columna correspondientes a una fila.
                ResultSet rs=cs.executeQuery();

                //Si se ejecuta y encuentra la consulta
                if(rs.next()){
                    JOptionPane.showMessageDialog(null,"Se muestran los datos." , "Registro encontrado",JOptionPane.INFORMATION_MESSAGE);
                    cs.setInt(1, getCodigoAsignacion());
                    paramCodigoAsignacion.setText(rs.getString("CodigoAsignacion"));
                    cs.setInt(1, getCodigoEstudiante());
                    paramCodigoEstudiante.setText(rs.getString("CodigoEstudiante"));
                    cs.setInt(1, getCodigoTransporte());
                    paramCodigoTransporte.setText(rs.getString("CodigoBus"));
                    paramDireccion.setText(rs.getString("DireccionEstudiante"));
                    paramTelefono.setText(rs.getString("TelefonoEncargado")); 
                }
                //En el caso que no lo llegue a encontrar limpia los textfield.
                else{
                    JOptionPane.showMessageDialog(null,"Verificar código de búsqueda" , "Registro no encontrado",JOptionPane.ERROR_MESSAGE);
                    CodigoBuscar.setText("");
                    paramCodigoAsignacion.setText("");
                    paramCodigoEstudiante.setText("");
                    paramCodigoTransporte.setText("");
                    paramDireccion.setText("");
                    paramTelefono.setText("");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error: "+ex.toString() , "No se ha podido realizar la búsqueda",JOptionPane.ERROR_MESSAGE);
        }
    }
    //Crear reporte html
    public void ReporteHTML(){
        BufferedWriter ficheroSalida;
        //Creamos un objeto tipo conexion para conectarse a la base de datos
        Conexion conectar=new Conexion();
        try{
            ficheroSalida=new BufferedWriter(new FileWriter(new File("Reporte asignacion estudiante-bus.html")));
            ficheroSalida.write("<HTML><HEAD><TITLE>REPORTE ASIGNACION ESTUDIANTE-BUS</TITLE></HEAD><BODY bgcolor=FFFF86>");
            ficheroSalida.write("<h1>Reporte asignacion estudiante-bus Colegio **El triunfo**</h1>");
            ficheroSalida.write("<center><table border =\"1\">");
            ficheroSalida.write("<tr><th>Codigo de asignación</th><th>Codigo de estudiante</th><th>Codigo de autobus</th><Código bus</th><th>Dirección estudiante</th><th>Telefono encargado</th></tr>");
            
            Connection connection=conectar.establecerConexion();
            Statement statement=connection.createStatement();
            //Vamos a hacer un select from para tomar datos de la tabla de asignar grado.
            ResultSet resultSet=statement.executeQuery("select CodigoAsignacion,CodigoEstudiante,CodigoBus,DireccionEstudiante,TelefonoEncargado from asignarbusestudiante");
            
            while(resultSet.next()){
                String CodigoAsignacion=resultSet.getString("CodigoAsignacion");
                String CodigoEstudiante=resultSet.getString("CodigoEstudiante");
                String CodigoAutobus=resultSet.getString("CodigoBus");
                String Direccion=resultSet.getString("DireccionEstudiante");
                String Telefono=resultSet.getString("TelefonoEncargado");
                
                //Vamos imprimiendo las filas en el reporte
                ficheroSalida.write("<tr><td>"+CodigoAsignacion+"</td><td>"+CodigoEstudiante+"</td><td>"+CodigoAutobus+"</td><td>"+Direccion+"</td><td>"+Telefono+"</td></tr>");
            }
            //Llenadas las filas cerramos las etiquetas de html
            ficheroSalida.write("</center></table>");
            ficheroSalida.write("</BODY></HTML>");
            //Cerramos fichero
            ficheroSalida.close();
            //Cerranos conexion
            connection.close();
            
            JOptionPane.showMessageDialog(null, "Reporte generado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al generar el reporte: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } 
    }
    //Para abfir archivo de reporte html.
   public void abrirArchivo(String archivo){ //Método creado para abrir el reporte.
        try{
             File objetofile=new File(archivo);
             Desktop.getDesktop().open(objetofile);
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null,"Verificar existencia o volver a crearlo" , "No se encuentra el archivo html",JOptionPane.ERROR_MESSAGE);
        }
    }     


}

