
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


public class MetodoComida {

int CodigoMenu;
String NombredeSeccion;
String Nombre;
String Descripcion;
String Precio;

    public int getCodigoMenu() {
        return CodigoMenu;
    }

    public void setCodigoMenu(int CodigoMenu) {
        this.CodigoMenu = CodigoMenu;
    }

    public String getNombredeSeccion() {
        return NombredeSeccion;
    }

    public void setNombredeSeccion(String NombredeSeccion) {
        this.NombredeSeccion = NombredeSeccion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

  public void Insertar(JTextField paramCodigo, JTextField paramNombredeSeccion,JTextField paramNombre,JTextField paramDescripcion,JTextField paramPrecio){
        //Incorporando los valores obtenidos del formulario.  
        try{
            //Pasamos una cadena de texto a int
            int Codigo=parseInt(paramCodigo.getText());
            setCodigoMenu(Codigo);
            setNombredeSeccion(paramNombredeSeccion.getText());
            setNombre(paramNombre.getText());
            setDescripcion(paramDescripcion.getText());         
            setPrecio(paramPrecio.getText());
            
            //Conexion lista para enlazar mi conexion con mi consulta
            Conexion objetoConexion=new Conexion();
            //Incorporar valores a la base de datos.
            String Consulta="insert into comida(CodigoMenu,NombredeSeccion,Nombre,Descripcion,Precio) values(?,?,?,?,?);";
            
            //Enlazar mi conexion con la consulta
            CallableStatement cs=objetoConexion.establecerConexion().prepareCall(Consulta);
            
            //Incorporar los parametros
            //'?' es donde se van a rellenar los datos
            cs.setInt(1, getCodigoMenu());
            cs.setString(2, getNombredeSeccion());
            cs.setString(3, getNombre());
            cs.setString(4, getDescripcion());
            cs.setString(5, getPrecio());
            
            //Ejecutamos
            cs.execute();
            
            //Después que se ejecute que nos enseñe un mensaje
            JOptionPane.showMessageDialog(null,"Se insertó correctamente el menu" , "Guardado",JOptionPane.INFORMATION_MESSAGE);
         } catch (SQLException ex) {
             //Error si se repite la primary key.
            if(ex.getErrorCode()==1062){
                JOptionPane.showMessageDialog(null, "Código de menu se encuentra  en uso.", "LLave primaria repetida",JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"Error: "+ex.toString() , "No se a podido insertar el menu",JOptionPane.ERROR_MESSAGE);
            }
        }  
    }

    public void Modificar(JTextField paramCodigo, JTextField paramNombredeSeccion,JTextField paramNombre,JTextField paramDescripcion,JTextField paramPrecio){
         try{
        //Verificamos que no hayan textfield vacios
        if(paramCodigo.getText().isEmpty()||paramNombredeSeccion.getText().isEmpty()||paramNombre.getText().isEmpty()||paramDescripcion.getText().isEmpty()||paramPrecio.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Verificar que todos los campos tengas sus datos", "Campo vacío",JOptionPane.ERROR_MESSAGE);
        }else {
            //Pasamos el codigo a entero
            //tomamos los datos de los textfield.
            int Codigo=parseInt(paramCodigo.getText());
            setCodigoMenu(Codigo);
            //Los demás son string por lo tanto se colocan normal.
            setNombredeSeccion(paramNombredeSeccion.getText());
            setNombre(paramNombre.getText());
            setDescripcion(paramDescripcion.getText());
            setPrecio(paramPrecio.getText());
            //Preparando conexion
            Conexion conbase=new Conexion();
            //Codigo de buscar de sql
            String Consulta2="Select CodigoMenu,NombredeSeccion,Nombre,Descripcion,Precio from comida Where comida.CodigoMenu=?;";
            CallableStatement buscar=conbase.establecerConexion().prepareCall(Consulta2);
            buscar.setInt(1, getCodigoMenu());
            buscar.execute();  
            //Result set=proporciona varios métodos para obtener los datos de columna correspondientes a un fila.
            ResultSet buscare=buscar.executeQuery();
            //Si lo encuentra va a ejecutar y modificar, caso contrario lo que va a pasar es mandar al error de que no se encuentra.
            if(buscare.next()){     
                //Variable para guardar la consulta con el codigo de modificar de sql.
                String Consulta="UPDATE comida SET comida.NombredeSeccion=?,comida.Nombre=?,comida.Descripcion=?,comida.Precio=? Where comida.CodigoMenu=?;";
                CallableStatement cs=conbase.establecerConexion().prepareCall(Consulta);
                cs.setString(1, getNombredeSeccion());
                cs.setString(2,getNombre());
                cs.setString(3,getDescripcion());
                cs.setString(4,getPrecio());
                cs.setInt(5, getCodigoMenu());
                //Ejecutar
                cs.execute();
                    JOptionPane.showMessageDialog(null, "El Menu ha sido modificado con éxito", "Modificado",JOptionPane.INFORMATION_MESSAGE);
            }else{
                    JOptionPane.showMessageDialog(null, "El Menu no se modificó, porque no se encuentra el código en la base.", "Código de Menu no encontrado",JOptionPane.ERROR_MESSAGE);
                }
            }               
        }catch (SQLException e) {
            if(e.getErrorCode()==1062){
                JOptionPane.showMessageDialog(null, "Codigo se encuentra en uso.", "Dato único repetido",JOptionPane.ERROR_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null,"Error: "+e.toString() , "No se a podido modificar el Menu",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    //Método utilizado en reporte para colocar la tabla
    public void Mostrar(JTable paramTablaComida){
        //Creamos un objeto de tipo conexion
        Conexion objetoConexion=new Conexion();
        
        DefaultTableModel modelo=new DefaultTableModel();
        //Incorporamos in orden de cabecera. Sirve para ordenar la tabla
        TableRowSorter<TableModel>OrdenarTabla=new TableRowSorter<TableModel>(modelo);
        //Donde va a estar mi consulta;
        String sql="";
        
        //Añadimos a la lista las columnas.
        modelo.addColumn("Codigo de Menu");
        modelo.addColumn("Nombre de Seccion");
        modelo.addColumn("Nombre");
        modelo.addColumn("Descripción");
        modelo.addColumn("Precio");
        
        
        //A la tabla vacia le insertamos el modelo previamente creado
        paramTablaComida.setModel(modelo);
        
        //En la variable sql hacemos el select from de la tabla estudiante
        sql="select*from comida;";
        
        //6 porque hay 6 columnas.
        String[]datos=new String[5];
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
              
                
                //Incorpore las filas a la tabla.
                modelo.addRow(datos);
            }
            //Incorpora el modelo a la tabla vacía y la llena.
            paramTablaComida.setModel(modelo);
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error: "+ex.toString() , "No se pudieron mostrar los registros",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void EliminarComida(JTextField paramCodigoMenu){
         try{
        if(paramCodigoMenu.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Verificar que el campo de buscar código este lleno.", "Campo vacío",JOptionPane.ERROR_MESSAGE);                    
        }else{
            //Pasamos de string a int
            setCodigoMenu(parseInt(paramCodigoMenu.getText()));
            //Creamos el objeto con el cual nos conectaremos a la base de datos.
            Conexion objeto=new Conexion();
            //Codigo para eliminar de sql
            String Consulta="Delete from comida Where CodigoMenu=?;";
            //Codigo para buscar de sql
            String Consulta2="Select CodigoMenu,NombredeSeccion,Nombre,Descripcion,Precio from comida Where comida.CodigoMenu=?;";

            //Primero verificaremos si existe, luego vamos a eliminar.
             CallableStatement buscar=objeto.establecerConexion().prepareCall(Consulta2);
             buscar.setInt(1, getCodigoMenu());
             buscar.execute();
            //Result set=proporciona varios métodos para obtener los datos de columna correspondientes a un fila.
            ResultSet buscare=buscar.executeQuery();
             //Si lo encuentra va a poderse eliminar.
                if(buscare.next()){
                //El método prepareCall se utiliza para crear objetos CallableStatement nuevos.
                CallableStatement cs=objeto.establecerConexion().prepareCall(Consulta);
                cs.setInt(1, getCodigoMenu());
                cs.execute();            
                //Si se ejecutó correctamente
                JOptionPane.showMessageDialog(null,"Se eliminó el Menu correctamente." , "Eliminación realizada",JOptionPane.INFORMATION_MESSAGE);           
                }else{
                    JOptionPane.showMessageDialog(null,"No se pudo eliminar el Menu." , "Codigo de Menu no encontrado",JOptionPane.ERROR_MESSAGE);           
                }
            }
        }catch(SQLException e){
            if(e.getErrorCode()==1451){
                JOptionPane.showMessageDialog(null,"No se puede eliminar al Menu, porque es un registro con llave forarena en una tabla", "Error al eliminar estudiante",JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"Error: "+e.toString() , "No se pudo eliminar el Menu",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    //Método para buscar por codigo de comida
    public void BuscarPorCodigo(JTextField CodigoBusqueda,JTextField paramCodigo, JTextField paramNombredeSeccion,JTextField paramNombre,JTextField paramDescripcion,JTextField paramPrecio){
         try{
        //Verificamos que no hayan textfield vacios
        if(paramCodigo.getText().isEmpty()||paramNombredeSeccion.getText().isEmpty()||paramNombre.getText().isEmpty()||paramDescripcion.getText().isEmpty()||paramPrecio.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Verificar que todos los campos tengas sus datos", "Campo vacío",JOptionPane.ERROR_MESSAGE);
        }else {
            //Guardamos nuestra consulta en una cadena de texto.
            //Codigo de sql
            String Consulta="Select CodigoMenu,NombredeSeccion,Nombre,Descripcion,Precio from comida Where comida.CodigoMenu=?;";
            //Nos conectamos a la base
            Conexion objetoComida=new Conexion();
      
            CallableStatement cs=objetoComida.establecerConexion().prepareCall(Consulta);
            //Pasamos el codigo a int porque Codigo de estudiante es int
            setCodigoMenu(Integer.parseInt(CodigoBusqueda.getText()));
            cs.setInt(1, getCodigoMenu());
            //Ejecutando
            cs.execute();
            //Result set=proporciona varios métodos para obtener los datos de columna correspondientes a un fila.
            ResultSet rs=cs.executeQuery();
            //Si se ejecuta y encuentra la consulta
            if(rs.next()){
                JOptionPane.showMessageDialog(null,"Se muestran los datos." , "Registro encontrado",JOptionPane.INFORMATION_MESSAGE);
                cs.setInt(1, getCodigoMenu());
                paramCodigo.setText(rs.getString("CodigoMenu"));
                paramNombredeSeccion.setText(rs.getString("NombredeSeccion"));
                paramNombre.setText(rs.getString("Nombre"));
                paramDescripcion.setText(rs.getString("Descripcion"));
                paramPrecio.setText(rs.getString("Precio"));
            }
             //En el caso que no lo llegue a encontrar.
            else{
                JOptionPane.showMessageDialog(null,"Verificar código de búsqueda" , "Registro no encontrado",JOptionPane.ERROR_MESSAGE);
                CodigoBusqueda.setText("");
                paramCodigo.setText("");
                paramNombredeSeccion.setText("");
                paramNombre.setText("");
                paramDescripcion.setText("");
                paramPrecio.setText("");
                 }
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error: "+e.toString() , "No se ha podido realizar la búsqueda",JOptionPane.ERROR_MESSAGE);
        }
    }
    //Generar reporte HTML.
    public void ReporteHTML(){
        BufferedWriter ficheroSalida;
        //Creamos objeto tipo conexión para conectarse a la base datos.
        Conexion conectar=new Conexion();
        try {
                ficheroSalida = new BufferedWriter(new FileWriter(new File("Reporte comida.html")));
                ficheroSalida.write("<HTML><HEAD><TITLE>REPORTE COMIDA</TITLE><BODY bgcolor=FFFF86>");
                ficheroSalida.write("<h1>Reporte comida colegio **El triunfo**</h1>");
                ficheroSalida.write("<center><table border =\"1\">");
                ficheroSalida.write("<tr><th>Codigo de menu</th><th>Nombre de seccion</th><th>Nombre</th><th>Descripcion</th><th>Precio</th></tr>");
                Connection connection = conectar.establecerConexion();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT CodigoMenu, NombredeSeccion, Nombre,Descripcion,Precio FROM comida");

            while (resultSet.next()) {
                String CodigoMenu = resultSet.getString("CodigoMenu");
                String NombredeSeccion = resultSet.getString("NombredeSeccion");
                String Nombre = resultSet.getString("Nombre");
                String Descripcion = resultSet.getString("Descripcion");
                String Precio = resultSet.getString("Precio"); 
                ficheroSalida.write("<tr><td>"+CodigoMenu+"</td><td>"+NombredeSeccion+"</td><td>"+Nombre+"</td><td>"+Descripcion+"</td><td>"+Precio+"</td></tr>");

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
