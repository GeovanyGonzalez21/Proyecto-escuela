
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


public class MetodoEstudiante {
    
    //Atributos
    int CodigoEstudiante;
    String Nombres;
    String Apellidos;
    int Edad;
    String Genero;
    String CUI;
    
    //Getters and setters

    public int getCodigoEstudiante() {
        return CodigoEstudiante;
    }

    public void setCodigoEstudiante(int CodigoEstudiante) {
        this.CodigoEstudiante = CodigoEstudiante;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getCUI() {
        return CUI;
    }

    public void setCUI(String CUI) {
        this.CUI = CUI;
    }
    
    //Guardar
    public void Insertar(JTextField paramCodigo, JTextField paramNombres,JTextField paramApellidos,JTextField paramEdad,JTextField paramGenero,JTextField paramCUI){
        try{
            //Verificamos que no hayan textfield vacios
            if(paramCodigo.getText().isEmpty()||paramNombres.getText().isEmpty()||paramApellidos.getText().isEmpty()||paramEdad.getText().isEmpty()||paramGenero.getText().isEmpty()||paramCUI.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Verificar que todos los campos tengas sus datos", "Campo vacío",JOptionPane.ERROR_MESSAGE);
            }
            else{
            //Incorporando los valores obtenidos del formulario.  
            //Pasamos una cadena de texto a int
            int Codigo=parseInt(paramCodigo.getText());
            int EdadE=parseInt(paramEdad.getText());
            setCodigoEstudiante(Codigo);
            setNombres(paramNombres.getText());
            setApellidos(paramApellidos.getText());
            setEdad(EdadE);
            setGenero(paramGenero.getText());
            setCUI(paramCUI.getText());

            //Conexion lista para enlazar mi conexion con mi consulta
            Conexion objetoConexion=new Conexion();
            //Incorporar valores a la base de datos.
            String Consulta="insert into estudiante(CodigoEstudiante,Nombres,Apellidos,Edad,Genero,CUI) values(?,?,?,?,?,?);";
            //Enlazar mi conexion con la consulta
            CallableStatement cs=objetoConexion.establecerConexion().prepareCall(Consulta);
            
            //Incorporar los parametros
            //'?' es donde se van a rellenar los datos
            cs.setInt(1, getCodigoEstudiante());
            cs.setString(2, getNombres());
            cs.setString(3, getApellidos());
            cs.setInt(4, getEdad());
            cs.setString(5, getGenero());
            cs.setString(6, getCUI());
            
            //Ejecutamos
            cs.execute();
            
            //Después que se ejecute que nos enseñe un mensaje
            JOptionPane.showMessageDialog(null,"Se insertó correctamente al estudiante" , "Guardado",JOptionPane.INFORMATION_MESSAGE);
            }
         } catch (SQLException ex) {
             //Error si se repite la primary key.
            if(ex.getErrorCode()==1062){
                JOptionPane.showMessageDialog(null, "Código de estudiante/CUI se encuentra  en uso.", "LLave primaria/Dato único repetido",JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"Error: "+ex.toString() , "No se a podido insertar al estudiante",JOptionPane.ERROR_MESSAGE);
            }
        } 
    }
    //Modificar
    public void ModificarEstudiante(JTextField paramCodigo, JTextField paramNombres,JTextField paramApellidos,JTextField paramEdad,JTextField paramGenero,JTextField paramCUI){
       try{
        //Verificamos que no hayan textfield vacios
        if(paramCodigo.getText().isEmpty()||paramNombres.getText().isEmpty()||paramApellidos.getText().isEmpty()||paramEdad.getText().isEmpty()||paramGenero.getText().isEmpty()||paramCUI.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Verificar que todos los campos tengas sus datos", "Campo vacío",JOptionPane.ERROR_MESSAGE);
        }else {
            //Pasamos el codigo a entero
            //tomamos los datos de los textfield.
            setCodigoEstudiante(Integer.parseInt(paramCodigo.getText()));
            //Los demás son string por lo tanto se colocan normal.
            setNombres(paramNombres.getText());
            setApellidos(paramApellidos.getText());
            //Pasamos edad a entero.
            setEdad(Integer.parseInt(paramEdad.getText()));
            setGenero(paramGenero.getText());
            setCUI(paramCUI.getText());

            //Preparando conexion
            Conexion conbase=new Conexion();
            //Codigo de buscar de sql
            String Consulta2="Select CodigoEstudiante,Nombres,Apellidos,Edad,Genero,CUI from estudiante Where estudiante.CodigoEstudiante=?;";
            CallableStatement buscar=conbase.establecerConexion().prepareCall(Consulta2);
            buscar.setInt(1, getCodigoEstudiante());
            buscar.execute();  
            //Result set=proporciona varios métodos para obtener los datos de columna correspondientes a un fila.
            ResultSet buscare=buscar.executeQuery();
            //Si lo encuentra va a ejecutar y modificar, caso contrario lo que va a pasar es mandar al error de que no se encuentra.
            if(buscare.next()){     
            //Variable para guardar la consulta con el codigo de modificar de sql.
                String Consulta="UPDATE estudiante SET estudiante.Nombres=?,estudiante.Apellidos=?, estudiante.Edad=?, estudiante.Genero=?, estudiante.CUI=? WHERE estudiante.CodigoEstudiante=?;";
                CallableStatement cs=conbase.establecerConexion().prepareCall(Consulta);
                cs.setString(1, getNombres());
                cs.setString(2, getApellidos());
                cs.setInt(3, getEdad());
                cs.setString(4, getGenero());
                cs.setString(5, getCUI());
                cs.setInt(6, getCodigoEstudiante());
                //Ejecutar
                cs.execute();
                    JOptionPane.showMessageDialog(null, "El estudiante ha sido modificado con éxito", "Modificado",JOptionPane.INFORMATION_MESSAGE);
            }else{
                    JOptionPane.showMessageDialog(null, "El estudiante no se modificó, porque no se encuentra el código en la base.", "Código de estudiante no encontrado",JOptionPane.ERROR_MESSAGE);
                }
            }               
        }catch (SQLException e) {
            if(e.getErrorCode()==1062){
                JOptionPane.showMessageDialog(null, "CUI se encuentra en uso.", "Dato único repetido",JOptionPane.ERROR_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null,"Error: "+e.toString() , "No se a podido modificar al estudiante",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    //Método utilizado en reporte para colocar la tabla
    public void Mostrar(JTable paramTablaEstudiante){
        //Creamos un objeto de tipo conexion
        Conexion objetoConexion=new Conexion();
        
        DefaultTableModel modelo=new DefaultTableModel();
        //Incorporamos in orden de cabecera. Sirve para ordenar la tabla
        TableRowSorter<TableModel>OrdenarTabla=new TableRowSorter<TableModel>(modelo);
        //Donde va a estar mi consulta;
        String sql="";
        
        //Añadimos a la lista las columnas.
        modelo.addColumn("Codigo de estudiante");
        modelo.addColumn("Nombres");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Edad");
        modelo.addColumn("Genero");
        modelo.addColumn("CUI");
        
        //A la tabla vacia le insertamos el modelo previamente creado
        paramTablaEstudiante.setModel(modelo);
        
        //En la variable sql hacemos el select from de la tabla estudiante
        sql="select*from estudiante;";
        
        //6 porque hay 6 columnas.
        String[]datos=new String[6];
        Statement st; //Va a realizar la consulta
        //Hacemos un try catch para atrapar errores y no se cierre el programa.
        try{
            //Realizando la conexion
            st=objetoConexion.establecerConexion().createStatement();
            
            ResultSet rs=st.executeQuery(sql); //Ejecuta la consulta.
            //Mientras está recorriendo.
            while(rs.next()){
                //Los vectores siempre inician en 0, los parámetros no.
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                
                //Incorpore las filas a la tabla.
                modelo.addRow(datos);
            }
            //Incorpora el modelo a la tabla vacía y la llena.
            paramTablaEstudiante.setModel(modelo);
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error: "+ex.toString() , "No se pudieron mostrar los registros",JOptionPane.ERROR_MESSAGE);
        }
    }
    //Eliminar
    public void EliminarEstudiante(JTextField paramCodigoEstudiante){
       try{
        if(paramCodigoEstudiante.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Verificar que el campo de buscar código este lleno.", "Campo vacío",JOptionPane.ERROR_MESSAGE);                    
        }else{
            //Pasamos de string a int
            setCodigoEstudiante(parseInt(paramCodigoEstudiante.getText()));
            //Creamos el objeto con el cual nos conectaremos a la base de datos.
            Conexion objeto=new Conexion();
            //Codigo para eliminar de sql
            String Consulta="Delete from estudiante Where CodigoEstudiante=?;";
            //Codigo para buscar de sql
            String Consulta2="Select CodigoEstudiante,Nombres,Apellidos,Edad,Genero,CUI from estudiante Where estudiante.CodigoEstudiante=?;";

            //Primero verificaremos si existe, luego vamos a eliminar.
             CallableStatement buscar=objeto.establecerConexion().prepareCall(Consulta2);
             buscar.setInt(1, getCodigoEstudiante());
             buscar.execute();
            //Result set=proporciona varios métodos para obtener los datos de columna correspondientes a un fila.
            ResultSet buscare=buscar.executeQuery();
             //Si lo encuentra va a poderse eliminar.
                if(buscare.next()){
                //El método prepareCall se utiliza para crear objetos CallableStatement nuevos.
                CallableStatement cs=objeto.establecerConexion().prepareCall(Consulta);
                cs.setInt(1, getCodigoEstudiante());
                cs.execute();            
                //Si se ejecutó correctamente
                JOptionPane.showMessageDialog(null,"Se eliminó al estudiante correctamente." , "Eliminación realizada",JOptionPane.INFORMATION_MESSAGE);           
                }else{
                    JOptionPane.showMessageDialog(null,"No se pudo eliminar al estudiante." , "Codigo de estudiante no encontrado",JOptionPane.ERROR_MESSAGE);           
                }
            }
        }catch(SQLException e){
            if(e.getErrorCode()==1451){
                JOptionPane.showMessageDialog(null,"No se puede eliminar al estudiante, porque es un registro con llave forarena en una tabla", "Error al eliminar estudiante",JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"Error: "+e.toString() , "No se pudo eliminar al estudiante",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    //Método para buscar por codigo de estudiante
    public void BuscarPorCodigoEstudiante(JTextField CodigoBusqueda,JTextField paramCodigo, JTextField paramNombres,JTextField paramApellidos,JTextField paramEdad,JTextField paramGenero,JTextField paramCUI){
     try{
         if(CodigoBusqueda.getText().isEmpty()){
              JOptionPane.showMessageDialog(null, "Verificar que el dato de buscar codigo este lleno", "Campo vacío",JOptionPane.ERROR_MESSAGE);
         }else{
            //Guardamos nuestra consulta en una cadena de texto.
            //Codigo de sql
            String Consulta="Select CodigoEstudiante,Nombres,Apellidos,Edad,Genero,CUI from estudiante Where estudiante.CodigoEstudiante=?;";
            //Nos conectamos a la base de datos
            Conexion objetoEstudiante=new Conexion();

            CallableStatement cs=objetoEstudiante.establecerConexion().prepareCall(Consulta);
            //Pasamos el codigo a int porque Codigo de estudiante es int
            setCodigoEstudiante(Integer.parseInt(CodigoBusqueda.getText()));
            cs.setInt(1, getCodigoEstudiante());
            //Ejecutando
            cs.execute();
            //Result set=proporciona varios métodos para obtener los datos de columna correspondientes a un fila.
            ResultSet rs=cs.executeQuery();
            //Si se ejecuta y encuentra la consulta
            if(rs.next()){
                JOptionPane.showMessageDialog(null,"Se muestran los datos." , "Registro encontrado",JOptionPane.INFORMATION_MESSAGE);
                cs.setInt(1, getCodigoEstudiante());
                paramCodigo.setText(rs.getString("CodigoEstudiante"));
                paramNombres.setText(rs.getString("Nombres"));
                paramApellidos.setText(rs.getString("Apellidos"));
                cs.setInt(1, getEdad());
                paramEdad.setText(rs.getString("Edad"));
                paramGenero.setText(rs.getString("Genero"));
                paramCUI.setText(rs.getString("CUI"));
            }
               //En el caso que no lo llegue a encontrar.
                else{
                    JOptionPane.showMessageDialog(null,"Verificar código de búsqueda" , "Registro no encontrado",JOptionPane.ERROR_MESSAGE);
                    CodigoBusqueda.setText("");
                    paramCodigo.setText("");
                    paramNombres.setText("");
                    paramApellidos.setText("");
                    paramEdad.setText("");
                    paramGenero.setText("");
                    paramCUI.setText("");
               }
            }    
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error: "+e.toString() , "No se ha podido realizar la búsqueda",JOptionPane.ERROR_MESSAGE);
        }
    }
    public void ReporteHTML(){
        BufferedWriter ficheroSalida;
        //Creamos objeto tipo conexión para conectarse a la base datos.
        Conexion conectar=new Conexion();
        try {
                ficheroSalida = new BufferedWriter(new FileWriter(new File("Reporte estudiantes.html")));
                ficheroSalida.write("<HTML><HEAD><TITLE>REPORTE ESTUDIANTES</TITLE><BODY bgcolor=FFFF86>");
                ficheroSalida.write("<h1>Reporte Estudiantes colegio **El triunfo**</h1>");
                ficheroSalida.write("<center><table border =\"1\">");
                ficheroSalida.write("<tr><th>Codigo de estudiante</th><th>Nombres</th><th>Apellidos</th><th>Edad</th><th>Genero</th><th>CUI</th></tr>");
                Connection connection = conectar.establecerConexion();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT CodigoEstudiante, Nombres, Apellidos,Edad,Genero,CUI FROM estudiante");

            while (resultSet.next()) {
                String CodigoEstudiante = resultSet.getString("CodigoEstudiante");
                String Nombres = resultSet.getString("Nombres");
                String Apellidos = resultSet.getString("Apellidos");
                String Edad = resultSet.getString("Edad");
                String Genero = resultSet.getString("Genero");
                String CUI = resultSet.getString("CUI"); 
                ficheroSalida.write("<tr><td>"+CodigoEstudiante+"</td><td>"+Nombres+"</td><td>"+Apellidos+"</td><td>"+Edad+"</td><td>"+Genero+"</td><td>"+CUI+"</td></tr>");

            }
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
