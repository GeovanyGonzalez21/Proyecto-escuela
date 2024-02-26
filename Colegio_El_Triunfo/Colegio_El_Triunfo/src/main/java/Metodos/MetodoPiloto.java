
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


public class MetodoPiloto {
    //Atributos
    int CodigoPiloto;
    String Nombre;
    int Edad;
    String Telefono;

    public int getCodigoPiloto() {
        return CodigoPiloto;
    }

    public void setCodigoPiloto(int CodigoPiloto) {
        this.CodigoPiloto = CodigoPiloto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    
    public void Insertar(JTextField paramCodigo,JTextField paramNombre,JTextField paramEdad,JTextField paramTelefono){
        //Incorporando los valores obtenidos del formulario.
        try{
            //Verificamos que no hayan textfield vacios.
            if(paramCodigo.getText().isEmpty()||paramNombre.getText().isEmpty()||paramEdad.getText().isEmpty()||paramTelefono.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Verificar que todos los campos tengas sus datos", "Campo vacío",JOptionPane.ERROR_MESSAGE);  
            }else{
                //Pasamos una cadena de texto a int
                int CodigoP=parseInt(paramCodigo.getText());
                int EdadP=parseInt(paramEdad.getText());
                setCodigoPiloto(CodigoP);
                setNombre(paramNombre.getText());
                setEdad(EdadP);
                setTelefono(paramTelefono.getText());

                //Conexion lista para enlazar mi conexion con mi consulta.
                Conexion objetoConexion=new Conexion();
                //Incorporar valores de la base de datos
                String Consulta="insert into piloto(CodigoPiloto,Nombre,Edad,Telefono) values (?,?,?,?);";

                //Enlazar mi coneion con la consulta
                CallableStatement cs=objetoConexion.establecerConexion().prepareCall(Consulta);

                //Incorporar los parametros (?)
                cs.setInt(1, getCodigoPiloto());
                cs.setString(2, getNombre());
                cs.setInt(3, getEdad());
                cs.setString(4,getTelefono());

                cs.execute();
                //Después que se ejecute que nos enseñe un mensaje
                JOptionPane.showMessageDialog(null,"Se insertó correctamente al piloto" , "Guardado",JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
             //Error si se repite la primary key.
            if(ex.getErrorCode()==1062){
                JOptionPane.showMessageDialog(null, "Código de piloto se encuentra  en uso.", "LLave primaria repetida",JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"Error: "+ex.toString() , "No se a podido insertar al piloto",JOptionPane.ERROR_MESSAGE);
            }
        } 
 
    }
    
    public void Modificar(JTextField paramCodigo,JTextField paramNombre,JTextField paramEdad,JTextField paramTelefono){
        try{
        //Verificamos que no hayan textfield vacios
        if(paramCodigo.getText().isEmpty()||paramNombre.getText().isEmpty()||paramEdad.getText().isEmpty()||paramTelefono.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Verificar que todos los campos tengas sus datos", "Campo vacío",JOptionPane.ERROR_MESSAGE);
        }else{
            //Pasamos el codigo a entero
            setCodigoPiloto(Integer.parseInt(paramCodigo.getText()));
            //Los demás string por lo tanto se colocan normal
            setNombre(paramNombre.getText());
            //Dato int es edad.
            setEdad(Integer.parseInt(paramEdad.getText()));
            setTelefono(paramTelefono.getText());

            //Preparando conexion
            Conexion conbase=new Conexion();
            //Buscaremos el codigo de piloto
            String Consulta2="Select CodigoPiloto,Nombre,Edad,Telefono from piloto Where piloto.CodigoPiloto=?;";
            CallableStatement buscar=conbase.establecerConexion().prepareCall(Consulta2);
            buscar.setInt(1, getCodigoPiloto());
            buscar.execute();
            //Result set=proporciona varios métodos para obtener los datos de columna correspondientes a un fila.
            ResultSet buscare=buscar.executeQuery();
            //Si lo encuentra va a ejecutar y modificar, caso contrario lo que va a pasar es mandar al error de que no se encuentra.
            if(buscare.next()){
            //Codigo de modificar de sql
            //Variable para guardar la consulta con el codigo a modificar.
                String Consulta="UPDATE piloto SET piloto.Nombre=?, piloto.Edad=?, piloto.Telefono=? WHERE piloto.CodigoPiloto=?;";      
                CallableStatement cs=conbase.establecerConexion().prepareCall(Consulta);
                cs.setString(1, getNombre());
                cs.setInt(2,getEdad());
                cs.setString(3, getTelefono());
                cs.setInt(4, getCodigoPiloto());

                //Ejecutamos
                cs.execute();
                JOptionPane.showMessageDialog(null, "El piloto ha sido modificado con éxito", "Modificado",JOptionPane.INFORMATION_MESSAGE);
             }else{
                    JOptionPane.showMessageDialog(null, "El piloto no se modificó, porque no se encuentra el código en la base.", "Código de piloto no encontrado",JOptionPane.ERROR_MESSAGE);            
                }
            }     
        }catch (SQLException e) {
            if(e.getErrorCode()==1062){
                JOptionPane.showMessageDialog(null,"Error: "+e.toString() , "No se a podido modificar al piloto",JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void Mostrar(JTable paramTablaPiloto){
        //Creamos un objeto tipo Conexion
        Conexion objetoConexion=new Conexion();
        
        DefaultTableModel modelo=new DefaultTableModel();
        //Incorporamos un orden de cabecera. Sirve para ordenar la tabla.
        TableRowSorter<TableModel>OrdenarTabla=new TableRowSorter<TableModel>(modelo);
        //Donde va a estar mi consulta.
        String sql="";
        
        //Añadimos a la tabla las columnas
        modelo.addColumn("Codigo piloto");
        modelo.addColumn("Nombre");
        modelo.addColumn("Edad");
        modelo.addColumn("Telefono");

        //A la tabla vacía le insertamos el modelo previamente creado.
        paramTablaPiloto.setModel(modelo);
        //En la variable sql hacemos el select from de la tabla piloto
         sql="select*from piloto;";

         //4 porque hay 4 columnas.
         String[]datos=new String[4];
         Statement st; //Va a realizar la consulta
         //Hacemos un try catch para atrapar errores y no se cierre el programa.
        try{
        //Realizando la conexion.
            st=objetoConexion.establecerConexion().createStatement();

            ResultSet rs=st.executeQuery(sql); //Ejecuta la consulta.
        //Mientras está recorriendo
        while(rs.next()){
            //Los vectores siempre inician en 0, los parámetros no.
            datos[0]=rs.getString(1);
            datos[1]=rs.getString(2);
            datos[2]=rs.getString(3);
            datos[3]=rs.getString(4);
            
            //Incorporamos las filas al modelo.
            modelo.addRow(datos);
        } 
        //Incorpora el modelo a la tabla vacía y la llena.
        paramTablaPiloto.setModel(modelo);
                  
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error: "+ex.toString() , "No se pudieron mostrar los registros",JOptionPane.ERROR_MESSAGE);
         }        

    }
    public void EliminarPiloto(JTextField paramCodigoPiloto){
       try{
        if(paramCodigoPiloto.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Verificar que el campo de buscar código este lleno.", "Campo vacío",JOptionPane.ERROR_MESSAGE);                                
        }else{
        //Pasamos de string a int
            setCodigoPiloto(parseInt(paramCodigoPiloto.getText()));
            //Creamos el objeto con el cual nos conectaremos a la base de datos.
            Conexion objeto=new Conexion();
            //Código para eliminar de sql
            String Consulta="Delete from piloto Where CodigoPiloto=?";
            //Codigo para buscar de sql
            String Consulta2="Select CodigoPiloto,Nombre,Edad,Telefono from piloto Where piloto.CodigoPiloto=?;";

            //Primero verificaremos si existe, luego vamos a eliminar.
            CallableStatement buscar=objeto.establecerConexion().prepareCall(Consulta2);
            buscar.setInt(1, getCodigoPiloto());
            buscar.execute();
            //Result set=proporciona varios métodos para obtener los datos de columna correspondientes a un fila.
            ResultSet buscare=buscar.executeQuery();
            //Si lo encuentra va a poderse eliminar
                if(buscare.next()){
                //El método prepareCall se utiliza para crear objetos CallableStatement nuevos.
                CallableStatement cs=objeto.establecerConexion().prepareCall(Consulta);
                cs.setInt(1, getCodigoPiloto());
                cs.execute();
                //Si se ejecutó correctamente.
                JOptionPane.showMessageDialog(null,"Se eliminó al piloto correctamente." , "Eliminación realizada",JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null,"No se pudo eliminar al piloto." , "Codigo de piloto no encontrado",JOptionPane.ERROR_MESSAGE);                    
                }
            }    
        }catch(SQLException e){
            if(e.getErrorCode()==1451){
                JOptionPane.showMessageDialog(null,"No se puede eliminar al piloto, porque es un registro con llave forarena en una tabla", "Error al eliminar piloto",JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"Error: "+e.toString() , "No se pudo eliminar al piloto",JOptionPane.ERROR_MESSAGE);
            }
        }
    }  
    //Método para buscar por codigo de piloto
    public void BuscarPorCodigoPiloto(JTextField CodigoBusqueda,JTextField paramCodigo,JTextField paramNombre,JTextField paramEdad,JTextField paramTelefono){
        try{
            if(CodigoBusqueda.getText().isEmpty()){
              JOptionPane.showMessageDialog(null, "Verificar que el dato de buscar codigo este lleno", "Campo vacío",JOptionPane.ERROR_MESSAGE);
            }else{
            //Guardamos nuestra consulta en una cadena de texto.
            //Codigo de sql
            String Consulta="Select CodigoPiloto,Nombre,Edad,Telefono from piloto Where piloto.CodigoPiloto=?;";
            //Nos conectamos a la base
            Conexion objetoPiloto=new Conexion();

            CallableStatement cs=objetoPiloto.establecerConexion().prepareCall(Consulta);
            //Pasamos el codigo a int porque codigo de piloto es un int
            setCodigoPiloto(Integer.parseInt(CodigoBusqueda.getText()));
            cs.setInt(1, getCodigoPiloto());
            //Ejecutando
            cs.execute();
            //Result set=proporciona varios métodos para obtener los datos de columna correspondientes a un fila.
            ResultSet rs=cs.executeQuery();   

                //Si se ejecuta y encuentra la consulta
                if(rs.next()){
                    JOptionPane.showMessageDialog(null,"Se muestran los datos." , "Registro encontrado",JOptionPane.INFORMATION_MESSAGE);
                    cs.setInt(1, getCodigoPiloto());
                    paramCodigo.setText(rs.getString("CodigoPiloto"));
                    paramNombre.setText(rs.getString("Nombre"));
                    cs.setInt(1, getEdad());
                    paramEdad.setText(rs.getString("Edad"));
                    paramTelefono.setText(rs.getString("Telefono"));

                }
                //En el caso de que no lo llegue a encontrar
                else{
                    JOptionPane.showMessageDialog(null,"Verificar código de búsqueda" , "Registro no encontrado",JOptionPane.ERROR_MESSAGE);
                    CodigoBusqueda.setText("");
                    paramCodigo.setText("");
                    paramNombre.setText("");
                    paramEdad.setText("");
                    paramTelefono.setText("");
                }
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error: "+e.toString() , "No se ha podido realizar la búsqueda",JOptionPane.ERROR_MESSAGE);
        }   
    }
    //Método para crear archivo HTML con el reporte de la tabla
    public void ReporteHTML(){
        BufferedWriter ficheroSalida;
        //Creamos objeto tipo conexión para conectase a la base de datos.
        Conexion conectar=new Conexion();
        try{
            ficheroSalida=new BufferedWriter(new FileWriter(new File("Reporte pilotos.html")));
            ficheroSalida.write("<HTML><HEAD><TITLE>REPORTE PILOTOS</TITLE><BODY bgcolor=FFFF86>");
            ficheroSalida.write("<h1>Reporte Pilotos colegio **El triunfo**</h1>");
            ficheroSalida.write("<center><table border =\"1\">");
            ficheroSalida.write("<tr><th>Codigo de piloto</th><th>Nombre</th><th>Edad</th><th>Telefono</th></tr>");
            Connection connection=conectar.establecerConexion();
            Statement statement=connection.createStatement();
            //Vamos a hacer un select from para tomar datos de la tabla piloto
            ResultSet resultSet=statement.executeQuery("Select CodigoPiloto,Nombre,Edad,Telefono from piloto");
            
            while(resultSet.next()){
                String CodigoPiloto=resultSet.getString("CodigoPiloto");
                String Nombre=resultSet.getString("Nombre");
                String Edad=resultSet.getString("Edad");
                String Telefono=resultSet.getString("Telefono");
                
                //Vamos imprimiendo las filas en el reporte
                ficheroSalida.write("<tr><td>"+CodigoPiloto+"</td><td>"+Nombre+"</td><td>"+Edad+"</td><td>"+Telefono+"</td></tr>");
            }
            //Llenadas las filas cerramos etiquetas de html.
            ficheroSalida.write("</center></table>");
            ficheroSalida.write("</BODY></HTML>");
            ficheroSalida.close();
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

