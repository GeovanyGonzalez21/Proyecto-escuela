package Metodos;
//Clase creada para utilizar métodos en la ventana.
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


public class MetodoInformacion {
    
    //Atributos
    int CodigoAnuncio;
    String Asunto;
    String Mensaje;
    
    //Getters and setters
    public int getCodigoAnuncio() {
        return CodigoAnuncio;
    }

    public void setCodigoAnuncio(int CodigoAnuncio) {
        this.CodigoAnuncio = CodigoAnuncio;
    }

    public String getAsunto() {
        return Asunto;
    }

    public void setAsunto(String Asunto) {
        this.Asunto = Asunto;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }

    
    public void Insertar(JTextField paramCodigo,JTextArea paramAsunto, JTextArea paramMensaje){
        //Inconporando  los valores obtenidos del formulario.
          try{
              //Verificamos que no hayan textfield vacios
            if(paramCodigo.getText().isEmpty()||paramAsunto.getText().isEmpty()||paramMensaje.getText().isEmpty()){
               JOptionPane.showMessageDialog(null, "Verificar que todos los campos tengas sus datos", "Campo vacío",JOptionPane.ERROR_MESSAGE);    
            }
            else{
                int Codigo=parseInt(paramCodigo.getText());
                setCodigoAnuncio(Codigo);
                setAsunto(paramAsunto.getText());
                setMensaje(paramMensaje.getText());
                //Conexion lista para enlazar mi conexion con mi consulta.
                Conexion objetoConexion=new Conexion();
                //Incorporar valores a la base de datos.
                String consulta="insert into informacion(CodigoAnuncio,Asunto,Mensaje)values (?,?,?);";


                //Enlanzar mi conexion con la consulta.
                CallableStatement cs=objetoConexion.establecerConexion().prepareCall(consulta);

                //Incorporar los parametros.
                //Primer parametro es igual al primer signo "?" y el segundo al segundo signo "?"
                cs.setInt(1, getCodigoAnuncio());
                cs.setString(2, getAsunto());
                cs.setString(3, getMensaje());

                cs.execute();

                //Despúes que se ejecute que nos enseñe un mensaje
                JOptionPane.showMessageDialog(null, "Se inserto correctamente la información.","Guardado", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            //Error si se repite la primary key.
            if(ex.getErrorCode()==1062){
            JOptionPane.showMessageDialog(null, "Código de información ya existente", "Llave primaria", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"Error: "+ex.toString() , "No se a podido insertar la información",JOptionPane.ERROR_MESSAGE);  
            }
        }
    }         

    public void ModificarInformacion(JTextField CodigoAnuncio,JTextArea Asunto, JTextArea Mensaje){
        try{
        //Verificamos que no hayan textfield vacios
        if(CodigoAnuncio.getText().isEmpty()||Asunto.getText().isEmpty()||Mensaje.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Verificar que todos los campos tengas sus datos", "Campo vacío",JOptionPane.ERROR_MESSAGE);
        }else{    
            //Pasamos el codigo a entero    
            setCodigoAnuncio(Integer.parseInt(CodigoAnuncio.getText()));
            setAsunto(Asunto.getText());
            setMensaje(Mensaje.getText());

            //Preparando conexion.

            Conexion conbase=new Conexion();
            //Variable para guardar la consulta con el codigo de modificar de sql.
            //Codigo de buscar de sql
            String Consulta2="Select CodigoAnuncio,Asunto,Mensaje from informacion Where informacion.CodigoAnuncio=?;";
            CallableStatement buscar=conbase.establecerConexion().prepareCall(Consulta2);
            buscar.setInt(1, getCodigoAnuncio());
            buscar.execute();
            //Si lo encuentra va a ejecutar y modificar, caso contrario lo que va a pasar es mandar al error de que no se encuentra.
            //Result set=proporciona varios métodos para obtener los datos de columna correspondientes a un fila.
            ResultSet buscare=buscar.executeQuery();
             //Si lo encuentra va a ejecutar y modificar, caso contrario lo que va a pasar es mandar al error de que no se encuentra.       
            if(buscare.next()){
                //Codigo de modificar de sql
                String Consulta="UPDATE informacion SET informacion.Asunto=?, informacion.Mensaje=? WHERE informacion.CodigoAnuncio=?;";
                CallableStatement cs=conbase.establecerConexion().prepareCall(Consulta);
                cs.setString(1, getAsunto());
                cs.setString(2, getMensaje());
                cs.setInt(3,getCodigoAnuncio());
                //Ejecutar
                cs.execute();
                    JOptionPane.showMessageDialog(null, "El anuncio ha sido modificada con éxito", "Modificado",JOptionPane.INFORMATION_MESSAGE);
               }else{
                    JOptionPane.showMessageDialog(null, "El anuncio no se modificó porque no se encuentra el código en la base.", "Código de anuncio no encontrado",JOptionPane.ERROR_MESSAGE);
                }        
            } 
        }catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"Error: "+e.toString() , "No se a podido modificar la información",JOptionPane.ERROR_MESSAGE);
            }

     }   
  
    public void Mostrar(JTable paramTablaInformacion){
    //Creamos un objeto tipo conexion.
    Conexion objetoConexion=new Conexion();
    
    DefaultTableModel modelo=new DefaultTableModel();
    //Incorporamos un orden de cabecera. Sirve para ordenar la tabla
    TableRowSorter<TableModel>OrdenarTabla=new TableRowSorter<TableModel>(modelo);
    //Donde va a estar mi consulta
    String sql="";
    
    //Añadimos a la tabla las columnas.
    modelo.addColumn("Código de anuncio");
    modelo.addColumn("Asunto");
    modelo.addColumn("Mensaje");
    
    //A la tabla vacía le insertamos el modelo previamente creado.
    paramTablaInformacion.setModel(modelo);
    
    //En la variable sql hacemos el select from de la tabla informaicon
    sql="select*from informacion;";
    
    //3 porque hay 3 columnas.
    String[]datos=new String[3];
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
            
            //Incorpore las filas a la tabla.
            modelo.addRow(datos);
        }
        //Incorpora el modelo a la tabla vacía y la llena.
        paramTablaInformacion.setModel(modelo);
        
    }   catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Error: "+ex.toString() , "No se pudieron mostrar los registros",JOptionPane.ERROR_MESSAGE);
    }
}
    //Eliminar
    public void EliminarInformacion(JTextField paramCodigoAnuncio){
        try{
        if(paramCodigoAnuncio.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Verificar que el campo de buscar código este lleno.", "Campo vacío",JOptionPane.ERROR_MESSAGE);                               
        }else{
        //Pasamos de string a int
        setCodigoAnuncio(parseInt(paramCodigoAnuncio.getText())); //Convertiendolo en int
        //Creamos el objeto con el cual nos conectaremos a la base de datos.
        Conexion objeto =new Conexion();
        //Codigo para eliminar de sql
        String Consulta="DELETE FROM informacion Where informacion.CodigoAnuncio=?;";
        //Codigo de buscar de sql
        String Consulta2="Select CodigoAnuncio,Asunto,Mensaje from informacion Where informacion.CodigoAnuncio=?;";
        //El método prepareCall se utiliza para crear objetos CallableStatement nuevos.
        //Primero verificaremos si existe, luego vamos a eliminar
        CallableStatement buscar=objeto.establecerConexion().prepareCall(Consulta2);
        buscar.setInt(1, getCodigoAnuncio());
        buscar.execute();
        //Result set=proporciona varios métodos para obtener los datos de columna correspondientes a un fila.
        ResultSet buscare=buscar.executeQuery();
        //Si lo encuentra va a poderse eliminar
            if(buscare.next()){
                //El método prepareCall se utiliza para crear objetos CallableStatement nuevos.
                CallableStatement cs=objeto.establecerConexion().prepareCall(Consulta);   
                cs.setInt(1, getCodigoAnuncio());
                cs.execute();
                //Si se ejecutó correctamente
                JOptionPane.showMessageDialog(null,"Se eliminó el anuncio correctamente." , "Eliminación realizada",JOptionPane.INFORMATION_MESSAGE);
            }else{
                //Si no se encontrò el codigo de anuncio.
                JOptionPane.showMessageDialog(null,"No se pudo eliminar el anuncio." , "Codigo de anuncio no encontrado",JOptionPane.ERROR_MESSAGE);           
                }
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error: "+e.toString() , "No se pudo eliminar el anuncio",JOptionPane.ERROR_MESSAGE);
        }
    }
    //Método para buscar por codigo de anuncio
    public void BuscarPorCodigoAnuncio(JTextField CodigoBusqueda, JTextField CodigoAnuncio, JTextArea Asunto, JTextArea Mensaje){
        try{
            if(CodigoBusqueda.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Verificar que el dato de buscar codigo este lleno", "Campo vacío",JOptionPane.ERROR_MESSAGE);
            }else{
                //Guardamos nuestra consulta en una cadena de texto.
                //Codigo de sql
                String Consulta="Select CodigoAnuncio,Asunto,Mensaje from informacion Where informacion.CodigoAnuncio=(?);";
                //Nos conectamos a la base.
                Conexion objetoInformacion=new Conexion();

                CallableStatement cs=objetoInformacion.establecerConexion().prepareCall(Consulta);
                //Pasamos el codigo a int porque Codigo de Anuncio es int
                setCodigoAnuncio(Integer.parseInt(CodigoBusqueda.getText()));
                cs.setInt(1, getCodigoAnuncio());
                //Ejecutando.
                cs.execute();   
                //Result set=proporciona varios métodos para obtener los datos de columna correspondientes a un fila.
                ResultSet rs=cs.executeQuery();    
                //Si se ejecuta y encuentra la consulta
                if(rs.next()){
                JOptionPane.showMessageDialog(null,"Se muestran los datos." , "Registro encontrado",JOptionPane.INFORMATION_MESSAGE);
                    cs.setInt(1,getCodigoAnuncio());
                    CodigoAnuncio.setText(rs.getString("CodigoAnuncio"));
                    Asunto.setText(rs.getString("Asunto"));
                    Mensaje.setText(rs.getString("Mensaje"));

                }
                //En el caso que no lo llegue a encontrar.
                else{
                    JOptionPane.showMessageDialog(null,"Verificar código de búsqueda" , "Registro no encontrado",JOptionPane.ERROR_MESSAGE);
                    CodigoBusqueda.setText("");
                    CodigoAnuncio.setText("");
                    Asunto.setText("");
                    Mensaje.setText("");
                }
              //Como es en SQL es una SQLException  
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error: "+e.toString() , "No se ha podido realizar la búsqueda",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    public void ReporteHTML(){
        //Creamos el reporte html a partir de un select from y tomar los datos de la tabla
        BufferedWriter ficheroSalida;
        //Creamos un objeto tipo conexión para conectarse a la base de datos.
        Conexion conectar=new Conexion();
        try{
            ficheroSalida=new BufferedWriter(new FileWriter(new File("Reporte informacion.html")));
            //Archivo html llevan todas las etiquetas correspondientes
            ficheroSalida.write("<HTML><HEAD><TITLE>REPORTE INFORMACION</TITLE><BODY bgcolor=FFFF86>");
            ficheroSalida.write("<h1>Reporte informacion colegio **El triunfo**</h1>");
            ficheroSalida.write("<center><table border = \"1\">");
            ficheroSalida.write("<tr><th>Codigo de anuncio</th><th>Asunto</th><th>Mensaje</th></tr>");
            //Creamos un objeto tipo conexion que contenga el metodo de establecer conexion a la base de datos.
            Connection connection=conectar.establecerConexion();
            Statement statement =connection.createStatement();
            ResultSet resultSet=statement.executeQuery("Select CodigoAnuncio,Asunto,Mensaje from informacion");
            
            //Ciclo while para rellenar tabla, mientras existan filas.
            while(resultSet.next()){
                String CodigoInformacion=resultSet.getString("CodigoAnuncio");
                String Asunto=resultSet.getString("Asunto");
                String Mensaje=resultSet.getString("Mensaje");
                ficheroSalida.write("<tr><td>"+CodigoInformacion+"</td><td>"+Asunto+"</td><td>"+Mensaje+"</td></tr>");
                
            }
            ficheroSalida.write("</center></table>");
            ficheroSalida.write("</BODY></HTML");
            
            //Cerramos la escritura
            ficheroSalida.close();
            //Cerramos la conexion
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