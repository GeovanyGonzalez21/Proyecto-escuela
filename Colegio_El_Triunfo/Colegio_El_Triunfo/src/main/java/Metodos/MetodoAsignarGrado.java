
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
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class MetodoAsignarGrado {
    //Atributos
    int CodigoAsignacion;
    int CodigoGrado;
    int CodigoEstudiante;
    String Encargado;
    
    //Getters and setters
    public int getCodigoAsignacion() {
        return CodigoAsignacion;
    }

    public void setCodigoAsignacion(int CodigoAsignacion) {
        this.CodigoAsignacion = CodigoAsignacion;
    }

    public int getCodigoGrado() {
        return CodigoGrado;
    }

    public void setCodigoGrado(int CodigoGrado) {
        this.CodigoGrado = CodigoGrado;
    }

    public int getCodigoEstudiante() {
        return CodigoEstudiante;
    }

    public void setCodigoEstudiante(int CodigoEstudiante) {
        this.CodigoEstudiante = CodigoEstudiante;
    }

    public String getEncargado() {
        return Encargado;
    }

    public void setEncargado(String Encargado) {
        this.Encargado = Encargado;
    }

    //Insertar
    public void Insertar(JTextField paramCodigoAsignacion, JTextField paramCodigoGrado, JTextField paramCodigoEstudiante,JTextField paramEncargado){
       //Incorporando los valores obtenidos del formulario.
       try{
           //Verificamos que no hayan textfield vacios
           if(paramCodigoAsignacion.getText().isEmpty()||paramCodigoGrado.getText().isEmpty()||paramCodigoEstudiante.getText().isEmpty()||paramEncargado.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Verificar que todos los campos tengas sus datos", "Campo vacío",JOptionPane.ERROR_MESSAGE);
           }else{
                //Pasamos de cadenas de texto a int
                int CodigoAsig=parseInt(paramCodigoAsignacion.getText());
                int CodigoGra=parseInt(paramCodigoGrado.getText());
                int CodigoEs=parseInt(paramCodigoEstudiante.getText());

                setCodigoAsignacion(CodigoAsig);
                setCodigoGrado(CodigoGra);
                setCodigoEstudiante(CodigoEs);
                setEncargado(paramEncargado.getText());

                //Conexion lista para enlazar
                Conexion objetoConexion=new Conexion();
                //Incorporar valores a la base de datos.
                String Consulta="insert into asignargrado(CodigoAsignacion,CodigoGrado,CodigoEstudiante,Encargado) values(?,?,?,?);";

                //Enlazar mi conexion con la consulta.
                CallableStatement cs=objetoConexion.establecerConexion().prepareCall(Consulta);

                //Incorporar los parametros
                //'?' es donde vamos a colocar los parametros
                cs.setInt(1, getCodigoAsignacion());
                cs.setInt(2, getCodigoGrado());
                cs.setInt(3, getCodigoEstudiante());
                cs.setString(4, getEncargado());

                //Ejecutar
                cs.execute();

                //Después que se ejecute que nos enseñe un mensaje.
                JOptionPane.showMessageDialog(null,"Se insertó correctamente la asignación" , "Guardado",JOptionPane.INFORMATION_MESSAGE);
            } 
        } catch (SQLException ex) {
             //Error si se repite la primary key.
            if(ex.getErrorCode()==1062){
                JOptionPane.showMessageDialog(null, "Código de asignación se encuentra  en uso.", "LLave primaria repetida",JOptionPane.ERROR_MESSAGE);
            //Error si no se encuentra la primary key en la tabla de estudiantes on grados, la cual es foranea en esta tabla
            }else if(ex.getErrorCode()==1452){
               JOptionPane.showMessageDialog(null, "No se encuentra la llave primaria de Codigo Grado/estudiante en la tabla estudiante/grado", "No se encuentra llave foránea",JOptionPane.ERROR_MESSAGE);
            }
            else{
               JOptionPane.showMessageDialog(null,"Error: "+ex.toString() , "No se a podido insertar la asignación",JOptionPane.ERROR_MESSAGE);
            }
        }  
    }
    //Modificar
    public void Modificar(JTextField paramCodigoAsignar,JTextField paramCodigoGrado,JTextField paramCodigoEstudiante,JTextField paramEncargado){
     try{ 
        //Verificamos que no hayan textfield vacios
        if(paramCodigoAsignar.getText().isEmpty()||paramCodigoGrado.getText().isEmpty()||paramCodigoEstudiante.getText().isEmpty()||paramEncargado.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Verificar que todos los campos tengas sus datos", "Campo vacío",JOptionPane.ERROR_MESSAGE);
        }else{        
            //Pasamos los codigos a entero
            setCodigoAsignacion(Integer.parseInt(paramCodigoAsignar.getText()));
            setCodigoGrado(Integer.parseInt(paramCodigoGrado.getText()));
            setCodigoEstudiante(Integer.parseInt(paramCodigoEstudiante.getText()));
            //El noombre de encargado string
            setEncargado(paramEncargado.getText());

            //Preparando conexion
            Conexion conbase=new Conexion();
            //Codigo de buscar de sql
            String Consulta2="Select CodigoAsignacion,CodigoGrado,CodigoEstudiante,Encargado from asignargrado Where asignargrado.CodigoAsignacion=?;";
            CallableStatement buscar=conbase.establecerConexion().prepareCall(Consulta2);
            buscar.setInt(1, getCodigoAsignacion());
            buscar.execute();
            //Result set=proporciona varios métodos para obtener los datos de columna correspondientes a un fila.
            ResultSet buscarag=buscar.executeQuery();
            //Si lo encuentra va a ejecutar y modificar, caso contrario lo que va a pasar es mandar al error de que no se encuentra.
            if(buscarag.next()){
                //Variable para guardar la consulta con el codigo a modificar de sql.
                String Consulta="update asignargrado set asignargrado.CodigoGrado=?, asignargrado.CodigoEstudiante=?,asignargrado.Encargado=? where asignargrado.CodigoAsignacion=?;";
                //Try catch para evitar que el programa se cierra si ocurre un error.
                CallableStatement cs=conbase.establecerConexion().prepareCall(Consulta);
                cs.setInt(1, getCodigoGrado());
                cs.setInt(2, getCodigoEstudiante());
                cs.setString(3, getEncargado());
                cs.setInt(4, getCodigoAsignacion());
                //Ejecutamos
                cs.execute();
                JOptionPane.showMessageDialog(null,"Se modificó correctamente la asignación" , "Modificado",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "La asignación no se modificó, porque no se encuentra el código en la base.", "Código de asignación no encontrado",JOptionPane.ERROR_MESSAGE);
                } 
            } 
        } catch (SQLException ex) {
            //Error si se repite la primary key.
            if(ex.getErrorCode()==1062){
                JOptionPane.showMessageDialog(null, "Código de estudiante se encuentra en uso.", "Registro único repetido",JOptionPane.ERROR_MESSAGE);
                //Error si no se encuentra la primary key en la tabla de estudiantes on grados, la cual es foranea en esta tabla
            }else if(ex.getErrorCode()==1452){
                JOptionPane.showMessageDialog(null, "No se encuentra la llave primaria de Codigo Grado/estudiante en la tabla estudiante/grado", "No se encuentra llave foránea",JOptionPane.ERROR_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null,"Error: "+ex.toString() , "No se a podido insertar la asignación",JOptionPane.ERROR_MESSAGE);
            }
        } 
    }
    //Llenar tabla con los datos de la tabla, método utilizado en reporte.
    public void Mostrar(JTable paramTablaAsignarGrado){
        //Creamos un objeto tipo Conexion
        Conexion objetoConexion=new Conexion();
        DefaultTableModel modelo=new DefaultTableModel();
        //Incorporamos un orden de cabecera. Sirve para ordenar la tabla.
        TableRowSorter<TableModel>OrdenarTabla=new TableRowSorter<TableModel>(modelo);
        //Donde va a estar mi consulta de sql
        String sql="";
        //Añadimos a la tabla las columnas
        modelo.addColumn("Código de asignación");
        modelo.addColumn("Código de grado");
        modelo.addColumn("Código de estudiante");
        modelo.addColumn("Encargado");
        //A la tabla vacia le insertamos el modelo previamente creado
        paramTablaAsignarGrado.setModel(modelo);
        //En la variable sql hacemos el select from de la tabla AsignarGrado
        sql="select *from AsignarGrado;";
        //4 porque hay 4 columnas.
        String[]datos=new String[4];
        Statement st; //Va a realizar la consulta
        //Hacemos un try catch para atrapar error y no se cierre el programa.
        try{
            //Realizando la conexion
            st=objetoConexion.establecerConexion().createStatement();
            ResultSet rs=st.executeQuery(sql); //Ejecutamos la consulta
            
            //Llenando el modelo con los datos.
            while(rs.next()){
                //Los vectores siempre incian en 0, los paramétros no.
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                
                //Incorpore las filas a la tabla.
                modelo.addRow(datos);
            }
            //Incorpora el modelo a la tabla vacía y la llena.
            paramTablaAsignarGrado.setModel(modelo);
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
            String Consulta="Delete from asignargrado where CodigoAsignacion=?;";
            //Codigo para buscar de sql
            String Consulta2="Select CodigoAsignacion,CodigoGrado,CodigoEstudiante,Encargado from asignargrado Where asignargrado.CodigoAsignacion=?;";

            //hacemos un try catch para evitar que el programa se cierre al momento de un error.
            //Primero verificamos si existe, luego vamos a eliminar.
            CallableStatement buscar=objeto.establecerConexion().prepareCall(Consulta2);
            buscar.setInt(1, getCodigoAsignacion());
            buscar.execute();
            //Result set=proporciona varios métodos para obtener los datos de columna correspondientes a un fila.
            ResultSet buscarag=buscar.executeQuery();
               //Si lo encuentra va a poderse eliminar.
               if(buscarag.next()){
                //El método prepareCall se utiliza para crear objetos CallableStatement nuevos.
                CallableStatement cs=objeto.establecerConexion().prepareCall(Consulta);
                cs.setInt(1, getCodigoAsignacion());
                //Ejecutamos
                cs.execute();

                JOptionPane.showMessageDialog(null,"Se eliminó la asignación correctamente." , "Eliminación realizada",JOptionPane.INFORMATION_MESSAGE);
                //Si no lo encuentra
            }else{
                    JOptionPane.showMessageDialog(null,"No se pudo eliminar la asignación." , "Codigo de asignación no encontrado",JOptionPane.ERROR_MESSAGE);                           
                }
            }   
        }catch(SQLException e){
            if(e.getErrorCode()==1451){
                JOptionPane.showMessageDialog(null,"No se pudo eliminar la asignación, porque es un registro de llave foranea en una tabla." , "Error al eliminar la asignación",JOptionPane.ERROR_MESSAGE);                           
            }else{
            JOptionPane.showMessageDialog(null,"Error: "+e.toString() , "No se pudo eliminar la asignacion",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    //Buscar por codigo de asignacion
    public void BuscarPorCodigoAsignar(JTextField CodigoBusqueda,JTextField paramCodigoAsignacion, JTextField paramCodigoGrado, JTextField paramCodigoEstudiante,JTextField paramEncargado){
        try{
          if(CodigoBusqueda.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Verificar que el dato de buscar codigo este lleno", "Campo vacío",JOptionPane.ERROR_MESSAGE);  
            }else{
                //Guardamos nuestra consulta en una cadena de texto.
                //Código de sql
                String Consulta="Select CodigoAsignacion,CodigoGrado,CodigoEstudiante,Encargado from asignargrado Where asignargrado.CodigoAsignacion=?;";
                //Nos conectamos a la base de datos.
                Conexion objetoAsignar=new Conexion();
                CallableStatement cs=objetoAsignar.establecerConexion().prepareCall(Consulta);
                //Pasamos el parámetro a int porque codigo de asignacion es int
                setCodigoAsignacion(Integer.parseInt(CodigoBusqueda.getText()));
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
                    cs.setInt(1, getCodigoGrado());
                    paramCodigoGrado.setText(rs.getString("CodigoGrado"));
                    cs.setInt(1, getCodigoEstudiante());
                    paramCodigoEstudiante.setText(rs.getString("CodigoEstudiante"));
                    paramEncargado.setText(rs.getString("Encargado"));
                }
                //En el caso que no lo llegue a encontrar limpia los textfield.
                else{
                    JOptionPane.showMessageDialog(null,"Verificar código de búsqueda" , "Registro no encontrado",JOptionPane.ERROR_MESSAGE);
                    CodigoBusqueda.setText("");
                    paramCodigoAsignacion.setText("");
                    paramCodigoGrado.setText("");
                    paramCodigoEstudiante.setText("");
                    paramEncargado.setText("");
                }
            }        
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error: "+e.toString() , "No se ha podido realizar la búsqueda",JOptionPane.ERROR_MESSAGE);
        }  
    }
    //Crear reporte html
    public void ReporteHTML(){
        BufferedWriter ficheroSalida;
        //Creamos objeto tipo conexión para conectase a la base de datos.
        Conexion conectar=new Conexion();
        try {
            ficheroSalida=new BufferedWriter(new FileWriter(new File("Reporte asignacion estudiante-grado.html")));
            ficheroSalida.write("<HTML><HEAD><TITLE>REPORTE ASIGNACION ESTUDIANTE-GRADO></TITLE></HEAD><BODY bgcolor=FFFF86>");
            ficheroSalida.write("<h1>Reporte asignación estudiante-grado Colegio **El triunfo**</h1>");
            ficheroSalida.write("<center><table border =\"1\">");
            ficheroSalida.write("<tr><th>Codigo de asignación</th><th>Codigo de grado</th><th>Codigo de estudiante</th><th>Encargado</th></tr>");
            
            Connection connection=conectar.establecerConexion();
            Statement statement=connection.createStatement();
            //Vamos a hacer un select from para tomar datos de la tabla de asignar grado.
            ResultSet resultSet=statement.executeQuery("Select CodigoAsignacion,CodigoGrado,CodigoEstudiante,Encargado from asignargrado");
            
            while(resultSet.next()){
                String CodigoAsignacion=resultSet.getString("CodigoAsignacion");
                String CodigoGrado=resultSet.getString("CodigoGrado");
                String CodigoEstudiante=resultSet.getString("CodigoEstudiante");
                String Encargado=resultSet.getString("Encargado");
                
                //Vamos imprimiendo las filas en el reporte
                ficheroSalida.write("<tr><td>"+CodigoAsignacion+"</td><td>"+CodigoGrado+"</td><td>"+CodigoEstudiante+"</td><td>"+Encargado+"</td></tr>");
            }
            //Llenadas las filas cerramos etiquetas de html
            ficheroSalida.write("</center></table>");
            ficheroSalida.write("</BODY></HTML>");
            //Cerramos fichero
            ficheroSalida.close();
            //Cerramos conexión
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
