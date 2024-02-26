
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
/**
 *
 * @author laure
 */
public class MetodoEmpleado {
    
   //Atributos
    int CodigoEmpleado;
    String Nombres;
    String Apellidos;
    String DPI;
    String Numero;
    String Correo;
    String Area;

    public int getCodigoEmpleado() {
        return CodigoEmpleado;
    }

    public void setCodigoEmpleado(int CodigoEmpleado) {
        this.CodigoEmpleado = CodigoEmpleado;
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

    public String getDPI() {
        return DPI;
    }

    public void setDPI(String DPI) {
        this.DPI = DPI;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }
    

     public void Insertar(JTextField paramCodigo, JTextField paramNombres,JTextField paramApellidos,JTextField paramDPI,JTextField paramNumero,JTextField paramCorreo,JTextField paramArea){
      //Incorporando los valores obtenidos del formulario.  
        try{
            //Verificamos que no hayan textfield vacios
            if(paramCodigo.getText().isEmpty()||paramNombres.getText().isEmpty()||paramApellidos.getText().isEmpty()||paramDPI.getText().isEmpty()||paramNumero.getText().isEmpty()||paramCorreo.getText().isEmpty()||paramArea.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Verificar que todos los campos tengas sus datos", "Campo vacío",JOptionPane.ERROR_MESSAGE);
            }
            else{
            //Pasamos una cadena de texto a int
            int Codigo=parseInt(paramCodigo.getText());
            setCodigoEmpleado(Codigo);
            setNombres(paramNombres.getText());
            setApellidos(paramApellidos.getText());
            setDPI(paramDPI.getText());
            setNumero(paramNumero.getText());
            setCorreo(paramCorreo.getText());
            setArea(paramArea.getText());
            
            //Conexion lista para enlazar mi conexion con mi consulta
            Conexion objetoConexion=new Conexion();
            //Incorporar valores a la base de datos.
            String Consulta="insert into empleado(CodigoEmpleado,Nombres,Apellidos,DPI,Numero,Correo,Area) values(?,?,?,?,?,?,?);";
            
            //Enlazar mi conexion con la consulta
            CallableStatement cs=objetoConexion.establecerConexion().prepareCall(Consulta);
            
            //Incorporar los parametros
            //'?' es donde se van a rellenar los datos
            cs.setInt(1, getCodigoEmpleado());
            cs.setString(2, getNombres());
            cs.setString(3, getApellidos());
            cs.setString(4, getDPI());
            cs.setString(5, getNumero());
            cs.setString(6, getCorreo());
            cs.setString(7,getArea());
            
            cs.execute();
             //Después que se ejecute que nos enseñe un mensaje
            JOptionPane.showMessageDialog(null,"Se insertó correctamente al empleado" , "Guardado",JOptionPane.INFORMATION_MESSAGE);
            }
         } catch (SQLException ex) {
             //Error si se repite la primary key.
            if(ex.getErrorCode()==1062){
                JOptionPane.showMessageDialog(null, "Código de empleado se encuentra  en uso.", "LLave primaria/Dato único repetido",JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"Error: "+ex.toString() , "No se a podido insertar al empleado",JOptionPane.ERROR_MESSAGE);
            }
        } 
        
    }
              
             
    

    public void ModificarEmpleado(JTextField paramCodigo, JTextField paramNombres,JTextField paramApellidos,JTextField paramDPI,JTextField paramNumero,JTextField paramCorreo,JTextField paramArea){
    try{
        //Verificamos que no hayan textfield vacios
        if(paramCodigo.getText().isEmpty()||paramNombres.getText().isEmpty()||paramApellidos.getText().isEmpty()||paramDPI.getText().isEmpty()||paramNumero.getText().isEmpty()||paramCorreo.getText().isEmpty()||paramArea.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Verificar que todos los campos tengas sus datos", "Campo vacío",JOptionPane.ERROR_MESSAGE);
        }else {
        //Pasamos el codigo a entero
        //tomamos los datos de los textfield.
        setCodigoEmpleado(Integer.parseInt(paramCodigo.getText()));
        //Los demás son string por lo tanto se colocan normal.
        setNombres(paramNombres.getText());
        setApellidos(paramApellidos.getText());
        setDPI(paramDPI.getText());
        setNumero(paramNumero.getText());
        setCorreo(paramCorreo.getText());
        setArea(paramArea.getText());
        
        //Preparando conexion
        Conexion conbase=new Conexion();
        //Codigo de buscar de sql
        String Consulta2="Select CodigoEmpleado,Nombres,Apellidos,DPI,Numero,Correo,Area from empleado Where empleado.CodigoEmpleado=?;";
        CallableStatement buscar=conbase.establecerConexion().prepareCall(Consulta2);
        buscar.setInt(1, getCodigoEmpleado());
        buscar.execute();  
        //Result set=proporciona varios métodos para obtener los datos de columna correspondientes a un fila.
        ResultSet buscare=buscar.executeQuery();
        //Si lo encuentra va a ejecutar y modificar, caso contrario lo que va a pasar es mandar al error de que no se encuentra.
        if(buscare.next()){     
        //Variable para guardar la consulta con el codigo de modificar de sql.
            String Consulta="UPDATE empleado SET empleado.Nombres=?,empleado.Apellidos=?, empleado.DPI=?, empleado.Numero=?, empleado.Correo=?,empleado.Area=? WHERE empleado.CodigoEmpleado=?;";
            CallableStatement cs=conbase.establecerConexion().prepareCall(Consulta);
            cs.setString(1, getNombres());
            cs.setString(2, getApellidos());
            cs.setString(3, getDPI());
            cs.setString(4, getNumero());
            cs.setString(5,getCorreo());
            cs.setString(6,getArea());
            cs.setInt(7, getCodigoEmpleado());
            //Ejecutar
            cs.execute();
                JOptionPane.showMessageDialog(null, "El empleado ha sido modificado con éxito", "Modificado",JOptionPane.INFORMATION_MESSAGE);
        }else{
                JOptionPane.showMessageDialog(null, "El empleado no se modificó, porque no se encuentra el código en la base.", "Código de empleado no encontrado",JOptionPane.ERROR_MESSAGE);
            }
        }               
        }catch (SQLException e) {
            if(e.getErrorCode()==1062){
                JOptionPane.showMessageDialog(null, "Código de empleado se encuentra  en uso.", "LLave primaria repetida",JOptionPane.ERROR_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null,"Error: "+e.toString() , "No se a podido modificar al empleado",JOptionPane.ERROR_MESSAGE);
            }
        }

    }

    //Mostrar datos en la tabla.
    public void Mostrar(JTable paramTablaEmpleado){
        //Creamos un objeto tipo conexion
        Conexion objetoConexion=new Conexion();
        DefaultTableModel modelo=new DefaultTableModel();
        //Incorporamos un orden de cabecera. Sirve para ordenar la tabla
        TableRowSorter<TableModel>OrdenarTabla=new TableRowSorter<TableModel>(modelo);
        //Donde va a estar mi consulta
        String sql="";
        //Añadimos a la tabla las columnas
        modelo.addColumn("Codigo de empleado");
        modelo.addColumn("Nombres");
        modelo.addColumn("Apellidos");
        modelo.addColumn("DPI");
        modelo.addColumn("Número de teléfono");
        modelo.addColumn("Correo");
        modelo.addColumn("Area");
        
        //A la tabla vacia le insertamos el modelo previamente creado.
        paramTablaEmpleado.setModel(modelo);
        
        //En la variable sql hacemos el select from de la tabla empleado
        sql="select*from empleado";
        //Los arreglos siempre inician desde 0, 7 porque hay 7 columnas.
        String[]datos=new String[7];
        Statement st; //Va a realizar la consulta
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
                datos[5]=rs.getString(6);
                datos[6]=rs.getString(7);
                
                //Incorpore las filas a la tabla.
                modelo.addRow(datos);
            }
            //Incorpora el modelo a la tabla vacía y la llena.
            paramTablaEmpleado.setModel(modelo);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "No se pudieron mostrar los registros"+ex.toString());                       
        }
    }
    //Eliminar
    public void EliminarEmpleado(JTextField paramCodigoEmpleado){
      try{
        if(paramCodigoEmpleado.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Verificar que el campo de buscar código este lleno.", "Campo vacío",JOptionPane.ERROR_MESSAGE);                    
        }else{
            //Pasamos de string a int
            setCodigoEmpleado(parseInt(paramCodigoEmpleado.getText()));
            //Creamos el objeto con el cual nos conectaremos a la base de datos.
            Conexion objeto=new Conexion();
            //Codigo para eliminar de sql
            String Consulta="Delete from empleado Where CodigoEmpleado=?;";
            //Codigo para buscar de sql
            String Consulta2="Select CodigoEmpleado,Nombres,Apellidos,DPI,Numero,Correo,Area from empleado Where empleado.CodigoEmpleado=?;";

            //Primero verificaremos si existe, luego vamos a eliminar.
             CallableStatement buscar=objeto.establecerConexion().prepareCall(Consulta2);
             buscar.setInt(1, getCodigoEmpleado());
             buscar.execute();
            //Result set=proporciona varios métodos para obtener los datos de columna correspondientes a un fila.
            ResultSet buscare=buscar.executeQuery();
             //Si lo encuentra va a poderse eliminar.
                if(buscare.next()){
                //El método prepareCall se utiliza para crear objetos CallableStatement nuevos.
                CallableStatement cs=objeto.establecerConexion().prepareCall(Consulta);
                cs.setInt(1, getCodigoEmpleado());
                cs.execute();            
                //Si se ejecutó correctamente
                JOptionPane.showMessageDialog(null,"Se eliminó al empleado correctamente." , "Eliminación realizada",JOptionPane.INFORMATION_MESSAGE);           
                }else{
                    JOptionPane.showMessageDialog(null,"No se pudo eliminar al empleado." , "Codigo de empleado no encontrado",JOptionPane.ERROR_MESSAGE);           
                }
            }
        }catch(SQLException e){
            if(e.getErrorCode()==1451){
                JOptionPane.showMessageDialog(null,"No se puede eliminar al empleado, porque es un registro con llave foranea en una tabla", "Error al eliminar empleado",JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"Error: "+e.toString() , "No se pudo eliminar al empleado",JOptionPane.ERROR_MESSAGE);
            }
        }
    
    }
    
    //Método para buscar por codigo de estudiante
    public void BuscarPorCodigoEmpleado(JTextField CodigoBusqueda,JTextField paramCodigo, JTextField paramNombres,JTextField paramApellidos,JTextField paramDPI,JTextField paramNumero,JTextField paramCorreo,JTextField paramArea){
        //Guardamos nuestra consulta en una cadena de texto.
        //Codigo de sql
        String Consulta="Select CodigoEmpleado,Nombres,Apellidos,DPI,Numero,Correo,Area from empleado Where empleado.CodigoEmpleado=?;";
        //Nos conectamos a la base
        Conexion objetoEmpleado=new Conexion();
        try{
            CallableStatement cs=objetoEmpleado.establecerConexion().prepareCall(Consulta);
            //Pasamos el codigo a int porque Codigo de estudiante es int
            setCodigoEmpleado(Integer.parseInt(CodigoBusqueda.getText()));
            cs.setInt(1, getCodigoEmpleado());

            //Ejecutando
            cs.execute();
            
            //Result set=proporciona varios métodos para obtener los datos de columna correspondientes a un fila.
            ResultSet rs=cs.executeQuery();
            
            //Si se ejecuta y encuentra la consulta
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Registro encontrado");
                cs.setInt(1, getCodigoEmpleado());
                paramCodigo.setText(rs.getString("CodigoEmpleado"));
                paramNombres.setText(rs.getString("Nombres"));
                paramApellidos.setText(rs.getString("Apellidos"));
                paramDPI.setText(rs.getString ("DPI"));
                paramNumero.setText(rs.getString("Numero"));
                paramCorreo.setText(rs.getString("Correo"));
                paramArea.setText(rs.getString("Area"));
            }
           //En el caso que no lo llegue a encontrar.
        else{
                JOptionPane.showMessageDialog(null, "Registro no encontrado, verificar código.");
                CodigoBusqueda.setText("");
                paramCodigo.setText("");
                paramNombres.setText("");
                paramApellidos.setText("");
                paramDPI.setText("");
                paramNumero.setText("");
                paramCorreo.setText("");
                paramArea.setText("");
           }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"No se ha podido realizar la búsqueda. Error: "+e.getErrorCode());
        }
    }

    public void ReporteHTML(){
        BufferedWriter ficheroSalida;
        //Creamos objeto tipo conexión para conectarse a la base datos.
        Conexion conectar=new Conexion();
        try {
                ficheroSalida = new BufferedWriter(new FileWriter(new File("Reporte empleados.html")));
                ficheroSalida.write("<HTML><HEAD><TITLE>REPORTE EMPLEADOS</TITLE><BODY bgcolor=FFFF86>");
                ficheroSalida.write("<h1>Reporte Empleados colegio **El triunfo**</h1>");
                ficheroSalida.write("<center><table border =\"1\">");
                ficheroSalida.write("<tr><th>Codigo de empleado</th><th>Nombres</th><th>Apellidos</th><th>DPI</th><th>Numero</th><th>Correo</th><th>Area</th></tr>");
                Connection connection = conectar.establecerConexion();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT CodigoEmpleado, Nombres, Apellidos,DPI,Numero,Correo,Area FROM empleado");

            while (resultSet.next()) {
                
                String CodigoEmpleado = resultSet.getString("CodigoEmpleado");
                String Nombres = resultSet.getString("Nombres");
                String Apellidos = resultSet.getString("Apellidos");
                String DPI = resultSet.getString("DPI");
                String Numero = resultSet.getString("Numero");
                String Correo = resultSet.getString("Correo");
                String Area = resultSet.getString("Area");
                        
                ficheroSalida.write("<tr><td>"+CodigoEmpleado+"</td><td>"+Nombres+"</td><td>"+Apellidos+"</td><td>"+DPI+"</td><td>"+Numero+"</td><td>"+Correo+"</td><td>"+Area+"</td></tr>");

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
     

