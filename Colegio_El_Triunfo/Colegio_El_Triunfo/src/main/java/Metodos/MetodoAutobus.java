
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

public class MetodoAutobus {
    //Atributos
    int CodigoAutobus;
    String Placa;
    String Modelo;

    public int getCodigoAutobus() {
        return CodigoAutobus;
    }

    public void setCodigoAutobus(int CodigoAutobus) {
        this.CodigoAutobus = CodigoAutobus;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }
    //Insertar
    public void Insertar(JTextField paramCodigo, JTextField paramPlaca, JTextField paramModelo){
        //Incorporando los valores obtenidos del formulario
        try{
            //Verificamos que no hayan textfield vacios
            if(paramCodigo.getText().isEmpty()||paramPlaca.getText().isEmpty()||paramModelo.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Verificar que todos los campos tengas sus datos", "Campo vacío",JOptionPane.ERROR_MESSAGE);                
            }else{
                //Pasamos una cadena de texto a int
                int CodigoA=parseInt(paramCodigo.getText());
                setCodigoAutobus(CodigoA);
                setPlaca(paramPlaca.getText());
                setModelo(paramModelo.getText());

                //Conexion lista para enlazar mi conexion con mi consulta
                Conexion objetoConexion=new Conexion();
                //Incorporar valores de la base de datos
                String Consulta="insert into autobus(CodigoAutobus,Placa,Modelo) values (?,?,?);";

                //Enlazar mi conexion con la consulta
                CallableStatement cs=objetoConexion.establecerConexion().prepareCall(Consulta);

                //Incoporar los parametros(?)
                cs.setInt(1, getCodigoAutobus());
                cs.setString(2, getPlaca());
                cs.setString(3, getModelo());

                //Ejecutamos
                cs.execute();
                //Despues que se ejecute que nos enseñe un mensaje
                JOptionPane.showMessageDialog(null,"Se insertó correctamente al autobus" , "Guardado",JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
             //Error si se repite la primary key.
            if(ex.getErrorCode()==1062){
                JOptionPane.showMessageDialog(null, "Código de autobus o placa se encuentra  en uso.", "LLave primaria o placa duplicado",JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"Error: "+ex.toString() , "No se a podido insertar al autobus",JOptionPane.ERROR_MESSAGE);
            }
        } 
    }
    //Modificar
    public void Modificar(JTextField paramCodigo, JTextField paramPlaca, JTextField paramModelo){
        try{
            //Verificamos que no hayan textfield vacios
             if(paramCodigo.getText().isEmpty()||paramPlaca.getText().isEmpty()||paramModelo.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Verificar que todos los campos tengas sus datos", "Campo vacío",JOptionPane.ERROR_MESSAGE);                
            }else{   
                //Pasamos el codigo a entero
                setCodigoAutobus(Integer.parseInt(paramCodigo.getText()));
                //Los demás string por lo tanto se colocan normal
                setPlaca(paramPlaca.getText());
                setModelo(paramModelo.getText());
                //Preparando conexion
                Conexion conbase=new Conexion();
                //Codigo de buscar de sql
                String Consulta2="Select CodigoAutobus,Placa,Modelo from autobus Where autobus.CodigoAutobus=?;";
                CallableStatement buscar=conbase.establecerConexion().prepareCall(Consulta2);
                buscar.setInt(1, getCodigoAutobus());
                buscar.execute();
                //Result set=proporciona varios métodos para obtener los datos de columna correspondientes a un fila.
                ResultSet buscara=buscar.executeQuery();
                //Si lo encuentra va a ejecutar y modificar, caso contrario lo que va a pasar es mandar al error de que no se encuentra.
                if(buscara.next()){

                    //Variable para guardar la consulta ocn el codigo a modificar
                    String Consulta="UPDATE autobus SET autobus.Placa=?, autobus.Modelo=? WHERE autobus.CodigoAutobus=?;";
                    //Usamos try catch para evitar que el programa se cierre si ocurre un error.
                    CallableStatement cs=conbase.establecerConexion().prepareCall(Consulta);
                    cs.setString(1, getPlaca());
                    cs.setString(2,getModelo());
                    cs.setInt(3, getCodigoAutobus());

                    //Ejecutamos
                    cs.execute();
                    JOptionPane.showMessageDialog(null, "El autobus ha sido modificado con éxito", "Modificado",JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, "El autobus no se modificó, porque no se encuentra el código en la base.", "Código de autobus no encontrado",JOptionPane.ERROR_MESSAGE);
                }
            }               
        }catch (SQLException e) {
            if(e.getErrorCode()==1062){
                JOptionPane.showMessageDialog(null, "Placa se encuentra  en uso.", "Dato único repetido",JOptionPane.ERROR_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null,"Error: "+e.toString() , "No se a podido modificar al autobus",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public void Mostrar(JTable paramTablaAutobus){
        //Creamos un objeto tipo conexion
        Conexion objetoConexion=new Conexion();
        DefaultTableModel modelo=new DefaultTableModel();
        //Incorporamos un orden de cabecera. Sirve para ordenar la tabla.
        TableRowSorter<TableModel>OrdenarTabla=new TableRowSorter<TableModel>(modelo);
        //Donde va a estar mi consulta
        String sql="";
        //Añadimos a la tabla las columnas
        modelo.addColumn("Codigo de autobus");
        modelo.addColumn("Placa");
        modelo.addColumn("Modelo");
        
        //A la tabla vacia le insertamos el modelo previamente creado.
        paramTablaAutobus.setModel(modelo);
        //En la variable sql hacemos el select from de la tabla autobus
        sql="Select*from autobus;";
        
        //4 porque hay 4 columnas
        String[]datos=new String[4];
        Statement st; //Va a realizar la consulta
        //Hacemos un try catch para atrapar errores y no se cierre el programa.
        try{
            st=objetoConexion.establecerConexion().createStatement();
            ResultSet rs=st.executeQuery(sql); //Ejecutamos la consulta
            
            while(rs.next()){
                //Los vectores siempre inician en 0, los parámetros no
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                
                //Incorporamos las filas al modelo.
                modelo.addRow(datos);
                //Incorporamos el modelo a la tabla vacia y la llena.
            }
            //Incorpora el modelo a la tabla vacía y la llena.
            paramTablaAutobus.setModel(modelo);
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error: "+ex.toString() , "No se pudieron mostrar los registros",JOptionPane.ERROR_MESSAGE);
        }   
    }
    //Eliminar.
    public void EliminarAutobus(JTextField paramCodigoAutobus){
        try{
            if(paramCodigoAutobus.getText().isEmpty()){
               JOptionPane.showMessageDialog(null, "Verificar que el campo de buscar código este lleno.", "Campo vacío",JOptionPane.ERROR_MESSAGE);                     
            }else{
                //Pasamos de string a int
                setCodigoAutobus(parseInt(paramCodigoAutobus.getText()));
                //Creamos el objeto con el cual nos conectamos a la base de datos.
                Conexion objeto=new Conexion();

                //Codigo para eliminar de sql
                String Consulta="Delete from autobus Where CodigoAutobus=?";
                //Codigo para buscar de sql
                String Consulta2="Select CodigoAutobus,Placa,Modelo from autobus Where autobus.CodigoAutobus=?;";

                //Primero verificaremos si existe, luego vamos a eliminar.
                CallableStatement buscar=objeto.establecerConexion().prepareCall(Consulta2);
                buscar.setInt(1, getCodigoAutobus());
                buscar.execute();
                //Result set=proporciona varios métodos para obtener los datos de columna correspondientes a un fila.
                ResultSet buscara=buscar.executeQuery();
                //Si lo encuentra va a poderse eliminar.
                if(buscara.next()){
                //El método prepareCall se utiliza para crear objetos CallableStatement nuevos.
                CallableStatement cs=objeto.establecerConexion().prepareCall(Consulta);
                cs.setInt(1, getCodigoAutobus());
                cs.execute();

                //Si se ejecutó correctamente.
                JOptionPane.showMessageDialog(null,"Se eliminó al autobus correctamente." , "Eliminación realizada",JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null,"No se pudo eliminar al autobus." , "Codigo de autobus no encontrado",JOptionPane.ERROR_MESSAGE);                           
                }
            }
        }catch(SQLException e){
            if(e.getErrorCode()==1451){
                JOptionPane.showMessageDialog(null,"No se puede eliminar al autobus, porque es un registro con llave forarena en una tabla", "Error al eliminar piloto",JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"Error: "+e.toString() , "No se pudo eliminar al piloto",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    //Método para buscar por codigo de autobus
    public void BuscarPorCodigoAutobus(JTextField CodigoBusqueda,JTextField paramCodigo, JTextField paramPlaca, JTextField paramModelo){
        try{
            if(CodigoBusqueda.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Verificar que el dato de buscar codigo este lleno", "Campo vacío",JOptionPane.ERROR_MESSAGE);
            }else{
                //Guardamos nuestra consulta en una cadena de texto.
                //Codigo de sql
                String Consulta="Select CodigoAutobus,Placa,Modelo from autobus Where autobus.CodigoAutobus=?;";
                //Nos conectamos a la base
                Conexion objetoAutobus=new Conexion();
                CallableStatement cs=objetoAutobus.establecerConexion().prepareCall(Consulta);
                //Pasamos el codigo a int porque codigo de autobus es int
                setCodigoAutobus(Integer.parseInt(CodigoBusqueda.getText()));
                cs.setInt(1, getCodigoAutobus());
                //Ejecutando
                cs.execute();
                //Result set=proporciona varios métodos para obtener los datos de columna correspondientes a un fila.
                ResultSet rs=cs.executeQuery();
            
                //Si se ejecuta y encuentra la consulta
                if(rs.next()){
                    JOptionPane.showMessageDialog(null,"Se muestran los datos." , "Registro encontrado",JOptionPane.INFORMATION_MESSAGE);
                    cs.setInt(1, getCodigoAutobus());
                    paramCodigo.setText(rs.getString("CodigoAutobus"));
                    paramPlaca.setText(rs.getString("Placa"));
                    paramModelo.setText(rs.getString("Modelo"));

                //En el caso de que no lo llegue a encontrar
                }else{
                    JOptionPane.showMessageDialog(null,"Verificar código de búsqueda" , "Registro no encontrado",JOptionPane.ERROR_MESSAGE);
                    CodigoBusqueda.setText("");
                    paramCodigo.setText("");
                    paramPlaca.setText("");
                    paramModelo.setText("");
                }
            }    
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error: "+e.toString() , "No se ha podido realizar la búsqueda",JOptionPane.ERROR_MESSAGE);
        }   
    }
    //Método para crear archivo HTML con el reporte de la tabla
    public void ReporteHTML(){
        //Creamos el reporte html a partir de un select from y tomar los datos de la tabla.
        BufferedWriter ficheroSalida;
        //Creamos un objeto tipo conexión para conectarse a la base de datos
        Conexion conectar=new Conexion();
        try{
            ficheroSalida=new BufferedWriter(new FileWriter(new File("Reporte autobus.html")));
                ficheroSalida.write("<HTML><HEAD><TITLE>REPORTE AUTOBUSES</TITLE><BODY bgcolor=FFFF86>");
            ficheroSalida.write("<h1>Reporte autobuses colegio **El triunfo**</h1>");
            ficheroSalida.write("<center><table border=\"1\">");
            ficheroSalida.write("<tr><th>Codigo de autobus</th><th>Placa</th><th>Modelo</th></tr>");
            
            //Creamos un objeto tipo conexion que contenga el método de conectase a la base de datos.
            Connection connection=conectar.establecerConexion();
            Statement statement = connection.createStatement();
            ResultSet resultSet=statement.executeQuery("Select CodigoAutobus,Placa,Modelo from autobus");
            
            //Ciclo while para rellenar tabla, mientras existan filas.
            while(resultSet.next()){
                String CodigoAutobus=resultSet.getString("CodigoAutobus");
                String Placa=resultSet.getString("Placa");
                String Modelo=resultSet.getString("Modelo");
                ficheroSalida.write("<tr><td>"+CodigoAutobus+"</td><td>"+Placa+"</td><td>"+Modelo+"</td></tr>");
            }
            //Cerramos etiquetas html
            ficheroSalida.write("</center></table>");
            ficheroSalida.write("</BODY></HTML>");
            
            //Cerramos la escritura
            ficheroSalida.close();;
            //Crrramos la conexion
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

