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

public class MetodoUtensilios {
    
    int CodigoUtensilio;
    String Nombre;
    int unidades;

    public int getCodigoUtensilio() {
        return CodigoUtensilio;
    }

    public void setCodigoUtensilio(int CodigoUtensilio) {
        this.CodigoUtensilio = CodigoUtensilio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    
     public void Insertar(JTextField paramCodigo, JTextField paramNombre,JTextField paramUnidades){
      //Incorporando los valores obtenidos del formulario.  
        try{
            //Verificamos que no hayan textfield vacios
            if(paramCodigo.getText().isEmpty()||paramNombre.getText().isEmpty()||paramUnidades.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Verificar que todos los campos tengas sus datos", "Campo vacío",JOptionPane.ERROR_MESSAGE);
            }
            else{
            //Pasamos una cadena de texto a int
            int Codigo=parseInt(paramCodigo.getText());
            setCodigoUtensilio(Codigo);
            setNombre(paramNombre.getText());
            int Unidades=parseInt(paramUnidades.getText());
           setUnidades(Unidades);
           
            
            
            //Conexion lista para enlazar mi conexion con mi consulta
            Conexion objetoConexion=new Conexion();
            //Incorporar valores a la base de datos.
            String Consulta="insert into utensilios(CodigoUtensilio,Nombre,Unidades) values(?,?,?);";
            
            //Enlazar mi conexion con la consulta
            CallableStatement cs=objetoConexion.establecerConexion().prepareCall(Consulta);
            
            //Incorporar los parametros
            //'?' es donde se van a rellenar los datos
            cs.setInt(1, getCodigoUtensilio());
            cs.setString(2, getNombre());
            cs.setInt(3,getUnidades());
            
            cs.execute();
            //Después que se ejecute que nos enseñe un mensaje
            JOptionPane.showMessageDialog(null,"Se insertó correctamente al Utensilio" , "Guardado",JOptionPane.INFORMATION_MESSAGE);
            }
         } catch (SQLException ex) {
             //Error si se repite la primary key.
            if(ex.getErrorCode()==1062){
                JOptionPane.showMessageDialog(null, "Código de Utensilio se encuentra  en uso.", "LLave primaria/Dato único repetido",JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"Error: "+ex.toString() , "No se a podido insertar al utensilio",JOptionPane.ERROR_MESSAGE);
            }
        } 
            
    }
       
       
    

    public void ModificarUtensilios(JTextField paramCodigo, JTextField paramNombre,JTextField paramUnidades){
             try{
        //Verificamos que no hayan textfield vacios
        if(paramCodigo.getText().isEmpty()||paramNombre.getText().isEmpty()||paramUnidades.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Verificar que todos los campos tengas sus datos", "Campo vacío",JOptionPane.ERROR_MESSAGE);
        }else {
            //Pasamos el codigo a entero
            //tomamos los datos de los textfield.
            setCodigoUtensilio(Integer.parseInt(paramCodigo.getText()));
            //Los demás son string por lo tanto se colocan normal.
            setNombre(paramNombre.getText());
            setUnidades(Integer.parseInt(paramUnidades.getText()));
            

            //Preparando conexion
            Conexion conbase=new Conexion();
            //Codigo de buscar de sql
            String Consulta2="Select CodigoUtensilio,Nombre,Unidades from utensilios Where utensilios.CodigoUtensilio=?;";
            CallableStatement buscar=conbase.establecerConexion().prepareCall(Consulta2);
            buscar.setInt(1, getCodigoUtensilio());
            buscar.execute();  
            //Result set=proporciona varios métodos para obtener los datos de columna correspondientes a un fila.
            ResultSet buscare=buscar.executeQuery();
            //Si lo encuentra va a ejecutar y modificar, caso contrario lo que va a pasar es mandar al error de que no se encuentra.
            if(buscare.next()){     
            //Variable para guardar la consulta con el codigo de modificar de sql.
                String Consulta="UPDATE utensilios SET utensilios.Nombre=?,utensilios.Unidades=? WHERE utensilios.CodigoUtensilio=?;";
                CallableStatement cs=conbase.establecerConexion().prepareCall(Consulta);
                cs.setString(1, getNombre());
                
                cs.setInt(2, getUnidades());
                
                cs.setInt(3, getCodigoUtensilio());
                //Ejecutar
                cs.execute();
                    JOptionPane.showMessageDialog(null, "El inventario ha sido modificado con éxito", "Modificado",JOptionPane.INFORMATION_MESSAGE);
            }else{
                    JOptionPane.showMessageDialog(null, "El inventario no se modificó, porque no se encuentra el código en la base.", "Código de utensilio no encontrado",JOptionPane.ERROR_MESSAGE);
                }
            }               
        }catch (SQLException e) {
            if(e.getErrorCode()==1062){
                JOptionPane.showMessageDialog(null, "Codigo se encuentra en uso.", "Dato único repetido",JOptionPane.ERROR_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null,"Error: "+e.toString() , "No se a podido modificar el inventario",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    //Método utilizado en reporte para colocar la tabla
    public void Mostrar(JTable paramTablaUtensilios){
        //Creamos un objeto de tipo conexion
        Conexion objetoConexion=new Conexion();
        
        DefaultTableModel modelo=new DefaultTableModel();
        //Incorporamos in orden de cabecera. Sirve para ordenar la tabla
        TableRowSorter<TableModel>OrdenarTabla=new TableRowSorter<TableModel>(modelo);
        //Donde va a estar mi consulta;
        String sql="";
        
        //Añadimos a la lista las columnas.
        modelo.addColumn("Codigo de Utensilio");
        modelo.addColumn("Nombre");
        modelo.addColumn("Unidades");
        
        //A la tabla vacia le insertamos el modelo previamente creado
        paramTablaUtensilios.setModel(modelo);
        
        //En la variable sql hacemos el select from de la tabla empleado
        sql="select*from utensilios;";
        
        //7 porque hay 7 columnas.
        String[]datos=new String[3];
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
              
                //Incorpore las filas a la tabla.
                modelo.addRow(datos);
            }
            //Incorpora el modelo a la tabla vacía y la llena.
            paramTablaUtensilios.setModel(modelo);
            
        }catch(SQLException ex){
        JOptionPane.showMessageDialog(null, "No se pudieron mostrar los registros"+ex.toString());            
        }
    }
    
    public void EliminarUtensilios(JTextField paramCodigoUtensilio){
        try{
        if(paramCodigoUtensilio.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Verificar que el campo de buscar código este lleno.", "Campo vacío",JOptionPane.ERROR_MESSAGE);                    
        }else{
            //Pasamos de string a int
            setCodigoUtensilio(parseInt(paramCodigoUtensilio.getText()));
            //Creamos el objeto con el cual nos conectaremos a la base de datos.
            Conexion objeto=new Conexion();
            //Codigo para eliminar de sql
            String Consulta="Delete from utensilios Where CodigoUtensilio=?;";
            //Codigo para buscar de sql
            String Consulta2="Select CodigoUtensilio,Nombre,Unidades from utensilios Where utensilios.CodigoUtensilio=?;";

            //Primero verificaremos si existe, luego vamos a eliminar.
             CallableStatement buscar=objeto.establecerConexion().prepareCall(Consulta2);
             buscar.setInt(1, getCodigoUtensilio());
             buscar.execute();
            //Result set=proporciona varios métodos para obtener los datos de columna correspondientes a un fila.
            ResultSet buscare=buscar.executeQuery();
             //Si lo encuentra va a poderse eliminar.
                if(buscare.next()){
                //El método prepareCall se utiliza para crear objetos CallableStatement nuevos.
                CallableStatement cs=objeto.establecerConexion().prepareCall(Consulta);
                cs.setInt(1, getCodigoUtensilio());
                cs.execute();            
                //Si se ejecutó correctamente
                JOptionPane.showMessageDialog(null,"Se eliminó del inventario correctamente." , "Eliminación realizada",JOptionPane.INFORMATION_MESSAGE);           
                }else{
                    JOptionPane.showMessageDialog(null,"No se pudo eliminar del inventario." , "Codigo de utensilio no encontrado",JOptionPane.ERROR_MESSAGE);           
                }
            }
        }catch(SQLException e){
            if(e.getErrorCode()==1451){
                JOptionPane.showMessageDialog(null,"No se puede eliminar del inventario, porque es un registro con llave forarena en una tabla", "Error al eliminar estudiante",JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"Error: "+e.toString() , "No se pudo eliminar del inventario",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
public void BuscarPorCodigoUtensilios(JTextField CodigoBusqueda,JTextField paramCodigo, JTextField paramNombre,JTextField paramUnidades){
        try{
        //Verificamos que no hayan textfield vacios
        if(paramCodigo.getText().isEmpty()||paramNombre.getText().isEmpty()||paramUnidades.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Verificar que todos los campos tengas sus datos", "Campo vacío",JOptionPane.ERROR_MESSAGE);
        }else {
        
            //Guardamos nuestra consulta en una cadena de texto.
            //Codigo de sql
            String Consulta="Select CodigoUtensilio,Nombre,Unidades from Utensilios Where Utensilios.CodigoUtensilio=?;";
            //Nos conectamos a la base
            Conexion objetoUtensilios=new Conexion();
     
            CallableStatement cs=objetoUtensilios.establecerConexion().prepareCall(Consulta);
            //Pasamos el codigo a int porque Codigo de estudiante es int
            setCodigoUtensilio(Integer.parseInt(CodigoBusqueda.getText()));
            cs.setInt(1, getCodigoUtensilio());

            //Ejecutando
            cs.execute();
            
            //Result set=proporciona varios métodos para obtener los datos de columna correspondientes a un fila.
            ResultSet rs=cs.executeQuery();
            
            //Si se ejecuta y encuentra la consulta
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Registro encontrado");
                cs.setInt(1, getCodigoUtensilio());
                paramCodigo.setText(rs.getString("CodigoUtensilio"));
                paramNombre.setText(rs.getString("Nombre"));
                cs.setInt(1,getUnidades());
                paramUnidades.setText(rs.getString("Unidades"));
            }
            //En el caso que no lo llegue a encontrar.
            else{
                JOptionPane.showMessageDialog(null, "Registro no encontrado, verificar código.");
                CodigoBusqueda.setText("");
                paramCodigo.setText("");
                paramNombre.setText("");
                paramUnidades.setText("");
                }   
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"No se ha podido realizar la búsqueda. Error: "+e.getErrorCode());
        }
    }

    //Generar reporte HTML.
    public void ReporteHTML(){
        BufferedWriter ficheroSalida;
        //Creamos objeto tipo conexión para conectarse a la base datos.
        Conexion conectar=new Conexion();
        try {
                ficheroSalida = new BufferedWriter(new FileWriter(new File("Reporte utensilios.html")));
                ficheroSalida.write("<HTML><HEAD><TITLE>REPORTE UTENSILIOS</TITLE><BODY bgcolor=FFFF86>");
                ficheroSalida.write("<h1>Reporte Utensilios colegio *El triunfo*</h1>");
                ficheroSalida.write("<center><table border =\"1\">");
                ficheroSalida.write("<tr><th>Codigo de Utensilio</th><th>Nombre</th><th>Unidades</th></tr>");
                Connection connection = conectar.establecerConexion();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT CodigoUtensilio, Nombre,Unidades FROM Utensilios");

            while (resultSet.next()) {
                
                String CodigoUtensilio = resultSet.getString("CodigoUtensilio");
                String Nombre = resultSet.getString("Nombre");
                String Unidades = resultSet.getString("Unidades");
                
                        
                ficheroSalida.write("<tr><td>"+CodigoUtensilio+"</td><td>"+Nombre+"</td><td>"+Unidades+"</td></tr>");

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