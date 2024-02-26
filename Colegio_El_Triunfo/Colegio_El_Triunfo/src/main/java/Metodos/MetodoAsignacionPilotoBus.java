
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


public class MetodoAsignacionPilotoBus {
    //Atributos
    int CodigoAsignacion;
    int CodigoPiloto;
    int CodigoAutobus;
    String RutaAsignada;
    //Getters and setters

    public int getCodigoAsignacion() {
        return CodigoAsignacion;
    }

    public void setCodigoAsignacion(int CodigoAsignacion) {
        this.CodigoAsignacion = CodigoAsignacion;
    }

    public int getCodigoPiloto() {
        return CodigoPiloto;
    }

    public void setCodigoPiloto(int CodigoPiloto) {
        this.CodigoPiloto = CodigoPiloto;
    }

    public int getCodigoAutobus() {
        return CodigoAutobus;
    }

    public void setCodigoAutobus(int CodigoAutobus) {
        this.CodigoAutobus = CodigoAutobus;
    }

    public String getRutaAsignada() {
        return RutaAsignada;
    }

    public void setRutaAsignada(String RutaAsignada) {
        this.RutaAsignada = RutaAsignada;
    }
    
    
    //Insertar
    public void Insertar(JTextField paramCodigoAsignacion, JTextField paramCodigoPiloto, JTextField paramCodigoBus, JTextArea paramRutaAsignada){
        //Incorporando los valores obtenidos del formulario.
        try{
            //Verificamos que no hayan textfield vacios
            if(paramCodigoAsignacion.getText().isEmpty()||paramCodigoPiloto.getText().isEmpty()||paramCodigoBus.getText().isEmpty()||paramRutaAsignada.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Verificar que todos los campos tengas sus datos", "Campo vacío",JOptionPane.ERROR_MESSAGE);                
            }else{
            //Pasamos las cadenas de texto a int
            int CodigoAsig=parseInt(paramCodigoAsignacion.getText());
            int CodigoPi=parseInt(paramCodigoPiloto.getText());
            int CodigoBus=parseInt(paramCodigoBus.getText());
            
            //Ruta asignada es un dato string pues se queda como se recibe del text area.
            setCodigoAsignacion(CodigoAsig);
            setCodigoPiloto(CodigoPi);
            setCodigoAutobus(CodigoBus);
            setRutaAsignada(paramRutaAsignada.getText());
            
            //Conexion lista para enlazar mi conexion con mi consulta
            Conexion objetoConexion=new Conexion();
            //Incorpor valores a la base de datos.
            String Consulta="insert into asignacionpilotobus(CodigoAsignacion,CodigoPiloto,CodigoAutobus,RutaAsignada) values(?,?,?,?);";
            //Enlazar mi conexión con la consulta
            CallableStatement cs=objetoConexion.establecerConexion().prepareCall(Consulta);
            
            //Incorporamos los parametros
            //'?' es donde se van a rellenar los datos.
            cs.setInt(1, getCodigoAsignacion());
            cs.setInt(2, getCodigoPiloto());
            cs.setInt(3, getCodigoAutobus());
            cs.setString(4, getRutaAsignada());
            
            //Ejecutamos
            cs.execute();
            
            //Si se ejecutó correctamente que nos muestre un mensaje, caso contraría que lo mande al catch
            JOptionPane.showMessageDialog(null,"Se insertó correctamente al la asignacion" , "Guardado",JOptionPane.INFORMATION_MESSAGE);
        }
        } catch (SQLException ex) {
             //Error si se repite la primary key o registros únicos
            if(ex.getErrorCode()==1062){
                JOptionPane.showMessageDialog(null, "Código de asignacion/piloto/bus se encuentra en uso.", "LLave primaria/registro único duplicado ",JOptionPane.ERROR_MESSAGE);
            }else if(ex.getErrorCode()==1452){
                JOptionPane.showMessageDialog(null, "No se encuentra la llave primaria en la tabla piloto o autobus.", "LLave foránea no encontrada",JOptionPane.ERROR_MESSAGE);
            }            
            else{
                JOptionPane.showMessageDialog(null,"Error: "+ex.toString() , "No se a podido insertar la asignación",JOptionPane.ERROR_MESSAGE);
            }
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
            String Consulta="Delete from asignacionpilotobus where CodigoAsignacion=?;";
            //Codigo para buscar de sql
            String Consulta2="select CodigoAsignacion,CodigoPiloto,CodigoAutobus,RutaAsignada from asignacionpilotobus where asignacionpilotobus.CodigoAsignacion=?;";

            //Primero verificamos si existe, luego vamos a eliminar.
            CallableStatement buscar=objeto.establecerConexion().prepareCall(Consulta2);
            buscar.setInt(1, getCodigoAsignacion());
            buscar.execute();
            //Result set=proporciona varios métodos para obtener los datos de columna correspondientes a un fila.
            ResultSet buscarapb=buscar.executeQuery();
            //Si lo encuentra va a poderse eliminar.
            if(buscarapb.next()){
                //El método prepareCall se utiliza para crear objetos CallableStatement nuevos.
                CallableStatement cs=objeto.establecerConexion().prepareCall(Consulta);
                cs.setInt(1, getCodigoAsignacion());

                //Ejecutamos
                cs.execute();

                //Si se ejecutó correctamente.
                JOptionPane.showMessageDialog(null, "La asignación a sido eliminada con éxito", "Eliminada",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"No se pudo eliminar al la asignación." , "Codigo de asignación no encontrado",JOptionPane.ERROR_MESSAGE);                       
                }
            }
        }catch(SQLException ex){
            //Error de no eliminar llaves primarias que son foraneas en otra tabla.
            if(ex.getErrorCode()==1451){
                JOptionPane.showMessageDialog(null,"No se puede eliminar la asignacion , porque es un registro con llave forarena en una tabla", "Error al eliminar asignacion",JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"Error: "+ex.toString() , "No se pudo eliminar la asignación",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    public void ModificarAsignacion(JTextField paramCodigoAsignacion, JTextField paramCodigoPiloto, JTextField paramCodigoBus, JTextArea paramRutaAsignada){
        try{
        //Verificamos que no hayan textfield vacios.
            if(paramCodigoAsignacion.getText().isEmpty()||paramCodigoPiloto.getText().isEmpty()||paramCodigoBus.getText().isEmpty()||paramRutaAsignada.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Verificar que todos los campos tengas sus datos", "Campo vacío",JOptionPane.ERROR_MESSAGE);                  
        }else{
            //Pasamos datos de string a int
            setCodigoAsignacion(Integer.parseInt(paramCodigoAsignacion.getText()));
            setCodigoPiloto(Integer.parseInt(paramCodigoPiloto.getText()));
            setCodigoAutobus(Integer.parseInt(paramCodigoBus.getText()));
            //Este valor se queda como string
            setRutaAsignada(paramRutaAsignada.getText());

            //Preparando conexion
            Conexion conbase=new Conexion();
            //Codigo de buscar de sql
            String Consulta2="select CodigoAsignacion,CodigoPiloto,CodigoAutobus,RutaAsignada from asignacionpilotobus where asignacionpilotobus.CodigoAsignacion=?;";
            CallableStatement buscar=conbase.establecerConexion().prepareCall(Consulta2);
            buscar.setInt(1, getCodigoAsignacion());
            buscar.execute();
            //Result set=proporciona varios métodos para obtener los datos de columna correspondientes a un fila.
            ResultSet buscarapi=buscar.executeQuery();
            //Si lo encuentra va a ejecutar y modificar, caso contrario lo que va a pasar es mandar al error de que no se encuentra.
            if(buscarapi.next()){
                //Variable para guardar la consulta
                String Consulta="Update asignacionpilotobus Set asignacionpilotobus.CodigoPiloto=?, asignacionpilotobus.CodigoAutobus=?, asignacionpilotobus.RutaAsignada=? where asignacionpilotobus.CodigoAsignacion=?;";

                CallableStatement cs=conbase.establecerConexion().prepareCall(Consulta);
                cs.setInt(1, getCodigoPiloto());
                cs.setInt(2, getCodigoAutobus());
                cs.setString(3, getRutaAsignada());
                cs.setInt(4, getCodigoAsignacion());

                //Ejecutar
                cs.execute();
                JOptionPane.showMessageDialog(null,"Se modificó correctamente al la asignacion" , "Modificado",JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, "La asignación no se modificó, porque no se encuentra el código en la base.", "Código de asignación no encontrado",JOptionPane.ERROR_MESSAGE);                
                } 
            }
        } catch (SQLException ex) {
            if(ex.getErrorCode()==1062){
                JOptionPane.showMessageDialog(null, "Código de piloto/bus se encuentra en uso.", "Registro único duplicado ",JOptionPane.ERROR_MESSAGE);
            }else if(ex.getErrorCode()==1452){
                JOptionPane.showMessageDialog(null, "No se encuentra la llave primaria en la tabla piloto o autobus.", "LLave foránea no encontrada",JOptionPane.ERROR_MESSAGE);
            }                 
            else{
                JOptionPane.showMessageDialog(null,"Error: "+ex.toString() , "No se ha podido insertar la asignación",JOptionPane.ERROR_MESSAGE);
            }
        } 
    }
    //Método para mostrar tabla en reportes
    public void Mostrar(JTable paramTablaAsignacion){
        //Creamos un objeto tipo conexion
        Conexion objetoConexion=new Conexion();
        
        DefaultTableModel modelo=new DefaultTableModel();
        //Incorporamos un orden de cabecera. Sirve para ordenar la tabla.
        TableRowSorter<TableModel>OrdenarTabla=new TableRowSorter<TableModel>(modelo);
        //Donde va a estar mi consulta.
        String sql="";
        
        //Añadimos a la tabla las columnas
        modelo.addColumn("Código de asignación");
        modelo.addColumn("Código de piloto");
        modelo.addColumn("Código de autobús");
        modelo.addColumn("Ruta asignada");
        
        //A la tabla vacia le insertamos el modelo previamente creado.
        paramTablaAsignacion.setModel(modelo);
        //En la variable sql hacemos el select from de la tabla de asignacion piloto bus
        sql="Select*from asignacionpilotobus;";
        
        //4 porque hay 4 columnas.
        String[]datos=new String[4];
        Statement st; //Va a realizar la consulta
        //Hacemos un try catch para atrapar los errores y no se cierre el programa
        try{
            st=objetoConexion.establecerConexion().createStatement();
            ResultSet rs=st.executeQuery(sql);
            
            while(rs.next()){
                //Los vectores siempre inician en 0, los parámetros no
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                
                //Incorporamos las filas al modelo
                modelo.addRow(datos);
                
                //Incorporamos el modelo a la tabla vacia y la llena.
                paramTablaAsignacion.setModel(modelo);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error: "+ex.toString() , "No se pudieron mostrar los registros",JOptionPane.ERROR_MESSAGE);
        }   
    }
    //Buscar registros por codigo de asignacion
    public void BuscarPorCodigoAsignacion(JTextField CodigoBusqueda,JTextField paramCodigoAsignacion, JTextField paramCodigoPiloto, JTextField paramCodigoBus, JTextArea paramRutaAsignada){
    try{
        if(CodigoBusqueda.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Verificar que el dato de buscar codigo este lleno", "Campo vacío",JOptionPane.ERROR_MESSAGE);   
        }else{
            //Guardarmos nuestra consulta en una cadena de texto.
            //Codigo de sql
            String Consulta="select CodigoAsignacion,CodigoPiloto,CodigoAutobus,RutaAsignada from asignacionpilotobus where asignacionpilotobus.CodigoAsignacion=?;";
            //Nos conectamos a la base de datos.
            Conexion objetoAsignar=new Conexion();
            CallableStatement cs=objetoAsignar.establecerConexion().prepareCall(Consulta);
            //Pasamos los codigos a int porque vienen en string, dejando solo a ruta asignada como string.
            setCodigoAsignacion(Integer.parseInt(CodigoBusqueda.getText()));
            cs.setInt(1, getCodigoAsignacion());
            //Ejecutando
            cs.execute();
            //Result set=proporciona varios métodos para obtener los datos de columna correspondientes a un fila.
            ResultSet rs=cs.executeQuery();
            //Si se ejecuta y encuentra la consulta
            if(rs.next()){
                JOptionPane.showMessageDialog(null,"Se muestran los datos." , "Registro encontrado",JOptionPane.INFORMATION_MESSAGE);
                cs.setInt(1, getCodigoAsignacion());
                paramCodigoAsignacion.setText(rs.getString("CodigoAsignacion"));
                cs.setInt(1, getCodigoPiloto());
                paramCodigoPiloto.setText(rs.getString("CodigoPiloto"));
                cs.setInt(1, getCodigoAutobus());
                paramCodigoBus.setText(rs.getString("CodigoAutobus"));
                paramRutaAsignada.setText(rs.getString("RutaAsignada"));
            }
            //En el caso que no lo llegue a encontrar.
            else{
                JOptionPane.showMessageDialog(null,"Verificar código de búsqueda" , "Registro no encontrado",JOptionPane.ERROR_MESSAGE);
                CodigoBusqueda.setText("");
                paramCodigoAsignacion.setText("");
                paramCodigoPiloto.setText("");
                paramCodigoBus.setText("");
                paramRutaAsignada.setText("");
                }
             }    
        //Como es en SQL es una SQLException
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error: "+ex.toString() , "No se ha podido realizar la búsqueda",JOptionPane.ERROR_MESSAGE);
        }         
    }  
    
    //Metodo para crear archivo html
    public void GenerarReporteHTML(){
        BufferedWriter ficheroSalida;
        //Creamos un objeto con el cual nos conectamos a la base de datos.
        Conexion conectar=new Conexion();
        try{
            ficheroSalida=new BufferedWriter(new FileWriter(new File("Reporte asignacion piloto-bus.html")));
            ficheroSalida.write("<HTML><HEAD><TITLE>REPORTE ASIGNACION PILOTO-BUS</TITLE></HEAD><BODY bgcolor=FFFF86>");
            ficheroSalida.write("<h1>Reporte asignación piloto-bus Colegio **El triunfo**</h1>");
            ficheroSalida.write("<center><table border = \"1\">");
            ficheroSalida.write("<tr><th>Codigo de asignacion</th><th>Codigo de piloto</th><th>Codigo de autobús</th><th>Ruta asignada</th></tr>");
            //Creamos un objeto tipo conexion que contenga el método de conectar a la base de datos.
            Connection connection=conectar.establecerConexion();
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("select CodigoAsignacion,CodigoPiloto,CodigoAutobus,RutaAsignada from asignacionpilotobus");
            
            //Ciclo while para rellenar tabla, mientras existan filas
            while(resultSet.next()){
                String CodigoAsignacion=resultSet.getString("CodigoAsignacion");
                String CodigoPiloto=resultSet.getString("CodigoPiloto");
                String CodigoAutobus=resultSet.getString("CodigoAutobus");
                String RutaAsignada=resultSet.getString("RutaAsignada");
                
                ficheroSalida.write("<tr><td>"+CodigoAsignacion+"</td><td>"+CodigoPiloto+"</td><td>"+CodigoAutobus+"</td><td>"+RutaAsignada+"</td></tr>");
            }
            ficheroSalida.write("</center></table>");
            ficheroSalida.write("</BODY></HTML>");
            
            //Cerramos el archivo
            ficheroSalida.close();
            //Cerrramos la conexion
            connection.close();
            JOptionPane.showMessageDialog(null, "Reporte generado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al generar el reporte: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } 
    }
    //Para abfir archivo de reporte html.
    public void abrirArchivo(String archivo){
        try{
             File objetofile=new File(archivo);
             Desktop.getDesktop().open(objetofile);
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null,"Verificar existencia o volver a crearlo" , "No se encuentra el archivo html",JOptionPane.ERROR_MESSAGE);
        }
    }     
}
