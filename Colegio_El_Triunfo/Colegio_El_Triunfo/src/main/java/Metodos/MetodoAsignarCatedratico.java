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


public class MetodoAsignarCatedratico {
int CodigoAsignacion;
int CodigoCatedratico;
int CodigoGrado;

    public int getCodigoAsignacion() {
        return CodigoAsignacion;
    }

    public void setCodigoAsignacion(int CodigoAsignacion) {
        this.CodigoAsignacion = CodigoAsignacion;
    }

    public int getCodigoCatedratico() {
        return CodigoCatedratico;
    }

    public void setCodigoCatedratico(int CodigoCatedratico) {
        this.CodigoCatedratico = CodigoCatedratico;
    }

    public int getCodigoGrado() {
        return CodigoGrado;
    }

    public void setCodigoGrado(int CodigoGrado) {
        this.CodigoGrado = CodigoGrado;
    }

    
    //Insertar
    public void Insertar(JTextField paramCodigoAsignacion, JTextField paramCodigoCatedratico, JTextField paramCodigoGrado){
       //Incorporando los valores obtenidos del formulario.
       try{
            //Verificamos que no hayan textfield vacios
            if(paramCodigoAsignacion.getText().isEmpty()||paramCodigoCatedratico.getText().isEmpty()||paramCodigoGrado.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Verificar que todos los campos tengas sus datos", "Campo vacío",JOptionPane.ERROR_MESSAGE);
            }
            else{
                //Pasamos de cadenas de texto a int
                int CodigoAsig=parseInt(paramCodigoAsignacion.getText());
                int CodigoCate=parseInt(paramCodigoCatedratico.getText());
                int CodigoGra=parseInt(paramCodigoGrado.getText());

                setCodigoAsignacion(CodigoAsig);
                setCodigoCatedratico(CodigoCate);
                setCodigoGrado(CodigoGra);

                //Conexion lista para enlazar
                Conexion objetoConexion=new Conexion();
                //Incorporar valores a la base de datos.
                String Consulta="insert into asignarcatedratico(CodigoAsignacion,CodigoCatedratico,CodigoGrado) values(?,?,?);";

                //Enlazar mi conexion con la consulta.
                CallableStatement cs=objetoConexion.establecerConexion().prepareCall(Consulta);

                //Incorporar los parametros
                //'?' es donde vamos a colocar los parametros
                cs.setInt(1, getCodigoAsignacion());
                cs.setInt(2, getCodigoCatedratico());
                cs.setInt(3, getCodigoGrado());


                //Ejecutar
                cs.execute();
                //Después que se ejecute que nos enseñe un mensaje
                 JOptionPane.showMessageDialog(null,"Se insertó correctamente la asignacion" , "Guardado",JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (SQLException ex) {
                //Error si se repite la primary key.
               if(ex.getErrorCode()==1062){
                   JOptionPane.showMessageDialog(null, "Código de asignacion se encuentra  en uso.", "LLave primaria/Dato único repetido",JOptionPane.ERROR_MESSAGE);
               }else{
                   JOptionPane.showMessageDialog(null,"Error: "+ex.toString() , "No se a podido asignar al catedratico",JOptionPane.ERROR_MESSAGE);
               }
            }    
        } 

    //Modificar
    public void Modificar(JTextField paramCodigoAsignar,JTextField paramCodigoCatedratico,JTextField paramCodigoGrado){
         try{ 
        //Verificamos que no hayan textfield vacios
        if(paramCodigoAsignar.getText().isEmpty()||paramCodigoCatedratico.getText().isEmpty()||paramCodigoGrado.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Verificar que todos los campos tengas sus datos", "Campo vacío",JOptionPane.ERROR_MESSAGE);
        }else{        
            //Pasamos los codigos a entero
            setCodigoAsignacion(Integer.parseInt(paramCodigoAsignar.getText()));
            setCodigoCatedratico(Integer.parseInt(paramCodigoCatedratico.getText()));
            setCodigoGrado(Integer.parseInt(paramCodigoGrado.getText()));
            

            //Preparando conexion
            Conexion conbase=new Conexion();
            //Codigo de buscar de sql
            String Consulta2="Select CodigoAsignacion,CodigoCatedratico,CodigoGrado from asignarcatedratico Where asignarcatedratico.CodigoAsignacion=?;";
            CallableStatement buscar=conbase.establecerConexion().prepareCall(Consulta2);
            buscar.setInt(1, getCodigoAsignacion());
            buscar.execute();
            //Result set=proporciona varios métodos para obtener los datos de columna correspondientes a un fila.
            ResultSet buscarag=buscar.executeQuery();
            //Si lo encuentra va a ejecutar y modificar, caso contrario lo que va a pasar es mandar al error de que no se encuentra.
            if(buscarag.next()){
                //Variable para guardar la consulta con el codigo a modificar de sql.
                String Consulta="update asignarcatedratico set asignarcatedratico.CodigoCatedratico=?, asignarcatedratico.CodigoGrado=? where asignarcatedratico.CodigoAsignacion=?;";
                //Try catch para evitar que el programa se cierra si ocurre un error.
                CallableStatement cs=conbase.establecerConexion().prepareCall(Consulta);
                cs.setInt(1, getCodigoCatedratico());
                cs.setInt(2, getCodigoGrado());
                cs.setInt(3, getCodigoAsignacion());
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
                JOptionPane.showMessageDialog(null, "Código de catedratico se encuentra en uso.", "Registro único repetido",JOptionPane.ERROR_MESSAGE);
                //Error si no se encuentra la primary key en la tabla de estudiantes on grados, la cual es foranea en esta tabla
            }else if(ex.getErrorCode()==1452){
                JOptionPane.showMessageDialog(null, "No se encuentra la llave primaria de Codigo catedrático/Grado en su respectiva tabla ", "No se encuentra llave foránea",JOptionPane.ERROR_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null,"Error: "+ex.toString() , "No se a podido insertar la asignación",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    //Llenar tabla con los datos de la tabla, método utilizado en reporte.
    public void Mostrar(JTable paramTablaAsignarCatedratico){
        //Creamos un objeto tipo Conexion
        Conexion objetoConexion=new Conexion();
        
        DefaultTableModel modelo=new DefaultTableModel();
        //Incorporamos un orden de cabecera. Sirve para ordenar la tabla.
        TableRowSorter<TableModel>OrdenarTabla=new TableRowSorter<TableModel>(modelo);
        //Donde va a estar mi consulta de sql
        String sql="";
        
        //Añadimos a la tabla las columnas
        modelo.addColumn("Código de asignación");
        modelo.addColumn("Código de catedratico");
        modelo.addColumn("Código de grado");
        
        //A la tabla vacia le insertamos el modelo previamente creado
        paramTablaAsignarCatedratico.setModel(modelo);
        //En la variable sql hacemos el select from de la tabla AsignarGrado
        sql="select *from asignarcatedratico;";
        //4 porque hay 4 columnas.
        String[]datos=new String[3];
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
                //Incorpore las filas a la tabla.
                modelo.addRow(datos);
            }
            //Incorpora el modelo a la tabla vacía y la llena.
            paramTablaAsignarCatedratico.setModel(modelo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error: "+ex.toString() , "No se pudieron mostrar los registros",JOptionPane.ERROR_MESSAGE);
        }  
    }
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
            String Consulta="Delete from asignarcatedratico where CodigoAsignacion=?;";
            //Codigo para buscar de sql
            String Consulta2="Select CodigoAsignacion,CodigoCatedratico,CodigoGrado from asignarcatedratico Where asignarcatedratico.CodigoAsignacion=?;";

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
    public void BuscarPorCodigoAsignar(JTextField CodigoBusqueda,JTextField paramCodigoAsignacion, JTextField paramCodigoCatedratico, JTextField paramCodigoGrado){
          try{
            //Verificamos que no hayan textfield vacios
            if(paramCodigoAsignacion.getText().isEmpty()||paramCodigoCatedratico.getText().isEmpty()||paramCodigoGrado.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Verificar que todos los campos tengas sus datos", "Campo vacío",JOptionPane.ERROR_MESSAGE);
            }
            else{

                //Guardamos nuestra consulta en una cadena de texto.
                //Código de sql
                String Consulta="Select CodigoAsignacion,CodigoCatedratico,CodigoGrado from asignarcatedratico Where asignarcatedratico.CodigoAsignacion=?;";
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
                    cs.setInt(1, getCodigoCatedratico());
                    paramCodigoCatedratico.setText(rs.getString("CodigoCatedratico"));
                    cs.setInt(1, getCodigoCatedratico());
                    paramCodigoGrado.setText(rs.getString("CodigoGrado"));
            }
            //En el caso que no lo llegue a encontrar limpia los textfield.
            else{
                JOptionPane.showMessageDialog(null,"Verificar código de búsqueda" , "Registro no encontrado",JOptionPane.ERROR_MESSAGE);
                CodigoBusqueda.setText("");
                paramCodigoAsignacion.setText("");
                paramCodigoCatedratico.setText("");
                paramCodigoGrado.setText("");
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
            ficheroSalida=new BufferedWriter(new FileWriter(new File("Reporte asignacion Catedratico-grado.html")));
            ficheroSalida.write("<HTML><HEAD><TITLE>REPORTE ASIGNACION CATEDRATICO-GRADO></TITLE></HEAD><BODY bgcolor=FFFF86>");
            ficheroSalida.write("<h1>Reporte asignación catedratico-grado Colegio *El triunfo*</h1>");
            ficheroSalida.write("<center><table border =\"1\">");
            ficheroSalida.write("<tr><th>Codigo de asignación</th><th>Codigo de catedratico</th><th>Codigo de grado</th></tr>");
            
            Connection connection=conectar.establecerConexion();
            Statement statement=connection.createStatement();
            //Vamos a hacer un select from para tomar datos de la tabla de asignar grado.
            ResultSet resultSet=statement.executeQuery("Select CodigoAsignacion,CodigoCatedratico,CodigoGrado from asignarcatedratico");
            
            while(resultSet.next()){
                String CodigoAsignacion=resultSet.getString("CodigoAsignacion");
                String CodigoCatedratico=resultSet.getString("CodigoCatedratico");
                String CodigoGrado=resultSet.getString("CodigoGrado");
                
                
                //Vamos imprimiendo las filas en el reporte
                ficheroSalida.write("<tr><td>"+CodigoAsignacion+"</td><td>"+CodigoCatedratico+"</td><td>"+CodigoGrado+"</td></tr>");
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