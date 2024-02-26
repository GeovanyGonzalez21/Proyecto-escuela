
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

public class MetodoGrado {
    //Atributos
    int CodigoGrado;
    String GradoAcademico;
    String Jornada;
    String Materias;
    String Año;
    
    //Getters and setters

    public int getCodigoGrado() {
        return CodigoGrado;
    }

    public void setCodigoGrado(int CodigoGrado) {
        this.CodigoGrado = CodigoGrado;
    }

    public String getGradoAcademico() {
        return GradoAcademico;
    }

    public void setGradoAcademico(String GradoAcademico) {
        this.GradoAcademico = GradoAcademico;
    }

    public String getJornada() {
        return Jornada;
    }

    public void setJornada(String Jornada) {
        this.Jornada = Jornada;
    }

    public String getMaterias() {
        return Materias;
    }

    public void setMaterias(String Materias) {
        this.Materias = Materias;
    }

    public String getAño() {
        return Año;
    }

    public void setAño(String Año) {
        this.Año = Año;
    }
    
    //Insertar grado
    public void Insertar(JTextField paramCodigo, JTextField paramGrado, JTextField paramJornada, JTextArea paramMaterias, JTextField paramAño){
        //Incorporando los valores obtenidos del formulario
        try{
            //Verificamos que no hayan textfield vacios
            if(paramCodigo.getText().isEmpty()||paramGrado.getText().isEmpty()||paramJornada.getText().isEmpty()||paramMaterias.getText().isEmpty()||paramAño.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Verificar que todos los campos tengas sus datos", "Campo vacío",JOptionPane.ERROR_MESSAGE);
            }else{
                //Pasamos del dato string a int
                int Codigo=parseInt(paramCodigo.getText());
                setCodigoGrado(Codigo);
                setGradoAcademico(paramGrado.getText());
                setJornada(paramJornada.getText());
                setMaterias(paramMaterias.getText());
                setAño(paramAño.getText());

                //Conexion lista para enlazar mi conexion con mi consulta.
                Conexion objetoConexion=new Conexion();
                //Incorporar valores a la base de datos.
                String consulta="insert into grado(CodigoGrado, GradoAcademico,Jornada,Materias,Año) values(?,?,?,?,?);";

                //Enlazar mi conexion con la consulta
                CallableStatement cs=objetoConexion.establecerConexion().prepareCall(consulta);

                //Incoporar los parametros
                //"?" es donde se pasan los datos de los parametros.
                cs.setInt(1, getCodigoGrado());
                cs.setString(2, getGradoAcademico());
                cs.setString(3, getJornada());
                cs.setString(4, getMaterias());
                cs.setString(5, getAño());

                //Ejecutamos
                cs.execute();

                //Después que se ejecute que nos enseñe un mensaje
                JOptionPane.showMessageDialog(null,"Se insertó correctamente el grado" , "Guardado",JOptionPane.INFORMATION_MESSAGE);
            }   
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error: "+ex.getErrorCode());
             //Error si se repite la primary key.
            if(ex.getErrorCode()==1062){
                JOptionPane.showMessageDialog(null, "Código de grado se encuentra  en uso.", "LLave primaria repetida",JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"Error: "+ex.toString() , "No se a podido insertar el grado",JOptionPane.ERROR_MESSAGE);
            }
        } 
    }

    //Modificar
    public void ModificarGrado(JTextField paramCodigo, JTextField paramGrado, JTextField paramJornada, JTextArea paramMaterias, JTextField paramAño){
        try{
        //Verificamos que no hayan textfield vacios
        if(paramCodigo.getText().isEmpty()||paramGrado.getText().isEmpty()||paramJornada.getText().isEmpty()||paramMaterias.getText().isEmpty()||paramAño.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Verificar que todos los campos tengas sus datos", "Campo vacío",JOptionPane.ERROR_MESSAGE);
        }else{
            //Pasamos el codigo a entero
            //Tomamos los datos de los textfield
            setCodigoGrado(Integer.parseInt(paramCodigo.getText()));
            //Los demás son string por lo tanto se colocan normal.
            setGradoAcademico(paramGrado.getText());
            setJornada(paramJornada.getText());
            setMaterias(paramMaterias.getText());
            setAño(paramAño.getText());

            //Preparando conexión.
            Conexion conbase=new Conexion();
            String Consulta2="Select CodigoGrado,GradoAcademico,Jornada,Materias,Año from grado Where grado.CodigoGrado=?;";
            CallableStatement buscar=conbase.establecerConexion().prepareCall(Consulta2);
            buscar.setInt(1, getCodigoGrado());
            buscar.execute();
            //Result set=proporciona varios métodos para obtener los datos de columna correspondientes a un fila.
            ResultSet buscarg=buscar.executeQuery();
            //Si lo encuentra va a ejecutar y modificar, caso contrario lo que va a pasar es mandar al error de que no se encuentra.
            if(buscarg.next()){
                //Codigo de modificar de sql
                //Variable para guardar la consulta con el codigo de modificar de sql.
                String Consulta="UPDATE grado SET grado.GradoAcademico=?, grado.Jornada=?, grado.Materias=?, grado.Año=? WHERE grado.CodigoGrado=?;";
                CallableStatement cs=conbase.establecerConexion().prepareCall(Consulta);
                cs.setString(1, getGradoAcademico());
                cs.setString(2, getJornada());
                cs.setString(3, getMaterias());
                cs.setString(4, getAño());
                cs.setInt(5,getCodigoGrado());
                //Ejecutar
                cs.execute();
                JOptionPane.showMessageDialog(null, "El grado ha sido modificado con éxito", "Modificado",JOptionPane.INFORMATION_MESSAGE);        
            }else{
                    JOptionPane.showMessageDialog(null, "El estudiante no se modificó, porque no se encuentra el código en la base.", "Código de estudiante no encontrado",JOptionPane.ERROR_MESSAGE);
            }
        }
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error: "+e.toString() , "No se a podido modificar al grado",JOptionPane.ERROR_MESSAGE);
        } 
    }

    //Mostrar datos en la tabla.
    public void Mostrar(JTable paramTablaGrado){
        //Creamos un objeto tipo conexion
        Conexion objetoConexion=new Conexion();
        DefaultTableModel modelo=new DefaultTableModel();
        //Incorporamos un orden de cabecera. Sirve para ordenar la tabla
        TableRowSorter<TableModel>OrdenarTabla=new TableRowSorter<TableModel>(modelo);
        //Donde va a estar mi consulta
        String sql="";
        //Añadimos a la tabla las columnas
        modelo.addColumn("Codigo grado");
        modelo.addColumn("Grado académico");
        modelo.addColumn("Jornada");
        modelo.addColumn("Materias");
        modelo.addColumn("Año");
        
        //A la tabla vacía le insertamos el modelo previamente creado.
        paramTablaGrado.setModel(modelo);
        
        //En la variable sql hacemos el select from de la tabla grado
        sql="select*from grado;";
        
        //5 orque hay 5 columnas.
        String[]datos=new String[5];
        Statement st; //Va a realizar la consulta.
        //Hacemos un try catch para atrapar errores y no se cierre el programa.
        try{
            //Realizamos la conexion
            st=objetoConexion.establecerConexion().createStatement();
            
            ResultSet rs=st.executeQuery(sql);
            //Mientras está recorriendo
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                
                //Incorpore las filas a la tabla.
                modelo.addRow(datos);
            }
         //Incorpora el modelo a la tabla vacia y la llena.
         paramTablaGrado.setModel(modelo);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error: "+ex.toString() , "No se pudieron mostrar los registros",JOptionPane.ERROR_MESSAGE);
        }
   }

    //Eliminar
    public void EliminarGrado(JTextField paramCodigoGrado){
       try{
        if(paramCodigoGrado.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Verificar que el campo de buscar código este lleno.", "Campo vacío",JOptionPane.ERROR_MESSAGE);                                   
        }else{
            //Pasamos de string a int
            setCodigoGrado(parseInt(paramCodigoGrado.getText()));
            //Creamos el objeto con el cual nos conectaremos a la base de datos
            Conexion objeto=new Conexion();

            //Codigo para eliminar de sql
            String Consulta="delete from grado where CodigoGrado=?;";
            //Codigo para buscar de sql
            String Consulta2="Select CodigoGrado,GradoAcademico,Jornada,Materias,Año from grado Where grado.CodigoGrado=?;";

            //Primeros verificaremos si existe, luego vamos a eliminar.
            //El método prepareCall se utiliza para crear objetos CallableStatement nuevos.
            CallableStatement buscar=objeto.establecerConexion().prepareCall(Consulta2);
            buscar.setInt(1, getCodigoGrado());
            buscar.execute();
            //Result set=proporciona varios métodos para obtener los datos de columna correspondientes a un fila.
            ResultSet buscare=buscar.executeQuery();
                //Si lo encuentra va a poderse eliminar.
                if(buscare.next()){

                CallableStatement cs=objeto.establecerConexion().prepareCall(Consulta);
                cs.setInt(1, getCodigoGrado());
                //Ejecutamos
                cs.execute();
                //Si se ejecutó correcamente.  
                JOptionPane.showMessageDialog(null,"Se eliminó al grado correctamente." , "Eliminación realizada",JOptionPane.INFORMATION_MESSAGE);
                }else{
                     JOptionPane.showMessageDialog(null,"No se pudo eliminar al grado." , "Codigo de grado no encontrado",JOptionPane.ERROR_MESSAGE);                    
                }
            }   
        }catch(SQLException e){
            if(e.getErrorCode()==1451){
               JOptionPane.showMessageDialog(null,"No se puede eliminar al grado, porque es un registro con llave forarena en una tabla", "Error al eliminar grado",JOptionPane.ERROR_MESSAGE);
            }else{
               JOptionPane.showMessageDialog(null,"Error: "+e.toString() , "No se pudo eliminar al grado",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    //Buscar
    public void BuscarPorCodigo(JTextField CodigoBusqueda, JTextField paramCodigo, JTextField paramGrado, JTextField paramJornada, JTextArea paramMaterias, JTextField paramAño){
        //Guardamos nuestra consulta en una cadena de texto.
        try{
            if(CodigoBusqueda.getText().isEmpty()){
              JOptionPane.showMessageDialog(null, "Verificar que el dato de buscar codigo este lleno", "Campo vacío",JOptionPane.ERROR_MESSAGE);
            }else{
                //Codigo de sql
                String Consulta="Select CodigoGrado,GradoAcademico,Jornada,Materias,Año from grado Where grado.CodigoGrado=?;";
                //Nos conectamos a la base.
                Conexion objetoGrado=new Conexion();
                CallableStatement cs=objetoGrado.establecerConexion().prepareCall(Consulta);
                //Pasamos el codigo a int porque codigo de grado es int
                setCodigoGrado(Integer.parseInt(CodigoBusqueda.getText()));
                cs.setInt(1, getCodigoGrado());
                //Ejecutando.
                cs.execute();
                //Result set=proporciona varios métodos para obtener los datos de columna correspondientes a un fila.
                ResultSet rs=cs.executeQuery();        
                //Si se ejecuta y encuentra la consuta.
                if(rs.next()){
                    JOptionPane.showMessageDialog(null,"Se muestran los datos." , "Registro encontrado",JOptionPane.INFORMATION_MESSAGE);
                    cs.setInt(1, getCodigoGrado());
                    paramCodigo.setText(rs.getString("CodigoGrado"));
                    paramGrado.setText(rs.getString("GradoAcademico"));
                    paramJornada.setText(rs.getString("Jornada"));
                    paramMaterias.setText(rs.getString("Materias"));
                    paramAño.setText(rs.getString("Año"));
                }
                //En el caso que no lo llegue a encontrar
                else{
                    JOptionPane.showMessageDialog(null,"Verificar código de búsqueda" , "Registro no encontrado",JOptionPane.ERROR_MESSAGE);
                    CodigoBusqueda.setText("");
                    paramCodigo.setText("");
                    paramGrado.setText("");
                    paramJornada.setText("");
                    paramMaterias.setText("");
                    paramAño.setText("");
                }
            //Como es en SQL es una SQLException
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error: "+e.toString() , "No se ha podido realizar la búsqueda",JOptionPane.ERROR_MESSAGE);
        }
    }
    public void ReporteHTML(){
        //Creamos el reporte html a partir de un select from y tomar datos de la tabla.
        BufferedWriter ficheroSalida;
        //Creamos un objeto tipo conexion para conectarse a la base de datos.
        Conexion conectar=new Conexion();
        try{
            ficheroSalida=new BufferedWriter(new FileWriter(new File("Reporte grados.html")));
            //Archivo html llevan todas las etiquetas correspondientes
                ficheroSalida.write("<HTML><HEAD><TITLE>REPORTE GRADOS</TITLE><BODY bgcolor=FFFF86>");
            ficheroSalida.write("<h1>Reporte Grados colegio **El triunfo**</h1>");
            ficheroSalida.write("<center><table border = \"1\">");
            ficheroSalida.write("<tr><th>Codigo de grado</th><th>Grado académico</th><th>Jornada</th><th>Materias</th><th>Año</th></tr>");
            //Creamos un objeto tipo conexión que contenga el metodo de establecer conexión a la base de datos.
            Connection connection=conectar.establecerConexion();
            Statement statement = connection.createStatement();
            ResultSet resultSet=statement.executeQuery("Select CodigoGrado,GradoAcademico,Jornada,Materias,Año from grado;");
            
            //Ciclo while para rellenar tabla, mientras existan filas.
            while(resultSet.next()){
                String CodigoGrado=resultSet.getString("CodigoGrado");
                String GradoAcademico=resultSet.getString("GradoAcademico");
                String Jornada=resultSet.getString("Jornada");
                String Materias=resultSet.getString("Materias");
                String Año=resultSet.getString("Año");
                ficheroSalida.write("<tr><td>"+CodigoGrado+"</td><td>"+GradoAcademico+"</td><td>"+Jornada+"</td><td>"+Materias+"</td><td>"+Año+"</td></tr>");
            }
            ficheroSalida.write("</center></table>");
            ficheroSalida.write("</BODY></HTML>");
            
            //Cerramos la escritura
            ficheroSalida.close();
            //Cerramos la conexión
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
