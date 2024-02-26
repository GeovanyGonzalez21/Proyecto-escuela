
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

public class MetodoBiblioteca {
 //Atributos
    int CodigoLibro;
    int CodigoGrado;
    String NombreAutor;
    String Edicion;
    String Curso;
    String Link;

    public int getCodigoLibro() {    
        return CodigoLibro;
    }

    public void setCodigoLibro(int CodigoLibro) {
        this.CodigoLibro = CodigoLibro;
    }

    public int getCodigoGrado() {
        return CodigoGrado;
    }

    public void setCodigoGrado(int CodigoGrado) {
        this.CodigoGrado = CodigoGrado;
    }

    public String getNombreAutor() {
        return NombreAutor;
    }

    public void setNombreAutor(String NombreAutor) {
        this.NombreAutor = NombreAutor;
    }

    public String getEdicion() {
        return Edicion;
    }

    public void setEdicion(String Edicion) {
        this.Edicion = Edicion;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    public String getLink() {
        return Link;
    }

    public void setLink(String Link) {
        this.Link = Link;
    }

    public void Insertar(JTextField paramCodigoLibro, JTextField paramCodigoGrado,JTextField paramNombreAutor, JTextField paramEdicion,JTextField paramCurso, JTextField paramLink){  
        try{
            //Verificamos que no hayan textfield vacios
            if(paramCodigoLibro.getText().isEmpty()||paramCodigoGrado.getText().isEmpty()||paramNombreAutor.getText().isEmpty()||paramEdicion.getText().isEmpty()||paramCurso.getText().isEmpty()||paramLink.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Verificar que todos los campos tengas sus datos", "Campo vacío",JOptionPane.ERROR_MESSAGE);
            }
            else{
                //Incorporando los valores obtenidos del formulario
                //Pasamos de cadena de texto a int.
                int CodigoLibros=parseInt(paramCodigoLibro.getText());
                int CodigoGrados=parseInt(paramCodigoGrado.getText());
                setCodigoLibro(CodigoLibros);
                setCodigoGrado(CodigoGrados);
                setNombreAutor(paramNombreAutor.getText());
                setEdicion(paramEdicion.getText());
                setCurso(paramCurso.getText());
                setLink(paramLink.getText());

                //Conexion lista para enlazar mi conexion con mi consulta
                Conexion objetoConexion=new Conexion();
                //Incorporar valores de la base de datos.
                String Consulta="insert into biblioteca (CodigoLibro, CodigoGrado,NombreAutor, Edicion,Curso,Link) values(?,?,?,?,?,?);";

                //Enlanzar mi conexion con la consulta.
                CallableStatement cs=objetoConexion.establecerConexion().prepareCall(Consulta);

                //Incorporar los parametros.
                //Primer parametro es igual al primer signo "?" y el segundo al segundo signo "?"
                cs.setInt(1, getCodigoLibro());
                cs.setInt(2, getCodigoGrado());
                cs.setString(3, getNombreAutor());
                cs.setString(4, getEdicion());
                cs.setString(5,getCurso());
                cs.setString(6, getLink());


                //Ejecutar
                cs.execute();

                //Después que se ejecute que nos enseñe un mensaje.
                JOptionPane.showMessageDialog(null,"Se insertó correctamente el libro" , "Guardado",JOptionPane.INFORMATION_MESSAGE);
            }
         } catch (SQLException ex) {
             //Error si se repite la primary key.
            if(ex.getErrorCode()==1062){
                JOptionPane.showMessageDialog(null, "Código de libro se encuentra  en uso.", "LLave primaria repetida",JOptionPane.ERROR_MESSAGE);
            //Si no encuentra la llave foranea.
            }else if(ex.getErrorCode()==1452){
                JOptionPane.showMessageDialog(null, "No se encuentra la llave primaria en la tabla de grado.", "LLave foránea no encontrada",JOptionPane.ERROR_MESSAGE);
            }    
            else{
                JOptionPane.showMessageDialog(null,"Error: "+ex.toString() , "No se a podido insertar el libro",JOptionPane.ERROR_MESSAGE);
            }
        } 
    }

//Modificar
    public void ModificarLibro(JTextField paramCodigo, JTextField paramGrado,JTextField paramNombreAutor, JTextField paramEdicion,JTextField paramCurso, JTextField paramLink){
        try{
            if(paramCodigo.getText().isEmpty()||paramGrado.getText().isEmpty()||paramNombreAutor.getText().isEmpty()||paramEdicion.getText().isEmpty()||paramCurso.getText().isEmpty()||paramLink.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Verificar que todos los campos tengas sus datos", "Campo vacío",JOptionPane.ERROR_MESSAGE);
        }else{
            //Pasamos el codigo a entero
            setCodigoLibro(Integer.parseInt(paramCodigo.getText()));
            setCodigoGrado(Integer.parseInt(paramGrado.getText()));
            setNombreAutor(paramNombreAutor.getText());
            setEdicion(paramEdicion.getText());
            setCurso(paramCurso.getText());
            setLink(paramLink.getText());

            //Preparando conexion
            Conexion conbase=new Conexion();
            //Codigo de buscar de sql
            String Consulta2="Select CodigoLibro,CodigoGrado,NombreAutor,Edicion,Curso,Link from biblioteca Where biblioteca.CodigoLibro=?;";
            CallableStatement buscar=conbase.establecerConexion().prepareCall(Consulta2);
            buscar.setInt(1, getCodigoLibro());
            buscar.execute();
            //Result set=proporciona varios métodos para obtener los datos de columna correspondientes a un fila.
            ResultSet buscarb=buscar.executeQuery();
             //Si lo encuentra va a ejecutar y modificar, caso contrario lo que va a pasar es mandar al error de que no se encuentra.
             if(buscarb.next()){
            //Variable para guardar la consulta
            String Consulta="Update biblioteca set biblioteca.CodigoGrado=?, biblioteca.NombreAutor=?, biblioteca.Edicion=?, biblioteca.Curso=?,biblioteca.Link=? where biblioteca.CodigoLibro=?;";

                CallableStatement cs=conbase.establecerConexion().prepareCall(Consulta);
                cs.setInt(1, getCodigoGrado());
                cs.setString(2, getNombreAutor());
                cs.setString(3, getEdicion());
                cs.setString(4, getCurso());
                cs.setString(5,getLink());
                cs.setInt(6, getCodigoLibro());

                //Ejecutar
                cs.execute();
                JOptionPane.showMessageDialog(null, "El libro ha sido modificado con éxito", "Modificado",JOptionPane.INFORMATION_MESSAGE);
             }else{
                    JOptionPane.showMessageDialog(null, "El libro no se modificó, porque no se encuentra el código en la base.", "Código de libro no encontrado",JOptionPane.ERROR_MESSAGE);
                }
            }
        }catch (SQLException e) {
            //Si no encuentra la llave foranea.
            if(e.getErrorCode()==1452){
                JOptionPane.showMessageDialog(null, "No se encuentra la llave primaria en la tabla de grado.", "LLave foránea no encontrada",JOptionPane.ERROR_MESSAGE);
            }  
            else{
                JOptionPane.showMessageDialog(null,"Error: "+e.toString() , "No se a podido modificar al libro",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
     public void Mostrar(JTable paramTablaBiblioteca){
        //Creamos un objeto tipo Conexion
        Conexion objetoConexion=new Conexion();

        DefaultTableModel modelo=new DefaultTableModel();
        //Incorporamos un orden de cabecera. Sirve para ordenar la tabla
        TableRowSorter<TableModel>OrdenarTabla=new TableRowSorter<TableModel>(modelo);
        //Donde va a estar mi consulta de sql
        String sql="";

        //Añadimos a la tabla las columnas
        modelo.addColumn("Codigo de libro");
        modelo.addColumn("Codigo de Grado");
        modelo.addColumn("Nombre de autor");
        modelo.addColumn("Edición");
        modelo.addColumn("Curso");
        modelo.addColumn("Link");
        //A la tabla vacía le insertamos el modelo previamente creado.
        paramTablaBiblioteca.setModel(modelo);

        //En la variable sql hacemos el select from de la tabla Biblioteca
        sql="select*from biblioteca;";

        //6 porque hay 6 columnas.
        String[]datos=new String[6];
        Statement st; //Va a realizar la consulta.
        //Hacemos un try catch para atrapar errores y no se cierre el programa.
        try{
            //Realizando la conexión.
            st=objetoConexion.establecerConexion().createStatement();
            ResultSet rs=st.executeQuery(sql); //Ejecuta la consulta
            
            //Llenando el modelo con los datos.
            while(rs.next()){
                //Los vectores siempre inician en 0, los parámetros no
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
            paramTablaBiblioteca.setModel(modelo);
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error: "+ex.toString() , "No se pudieron mostrar los registros",JOptionPane.ERROR_MESSAGE);
    }   
}
public void EliminarBiblioteca(JTextField paramCodigoLibro){
    try{
    if(paramCodigoLibro.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "Verificar que el campo de buscar código este lleno.", "Campo vacío",JOptionPane.ERROR_MESSAGE);                            
    }else{
    //Pasamos de string a int.
    setCodigoLibro(parseInt(paramCodigoLibro.getText()));
    //Creamos el objeto con el cual nos conectaremos a la base de datos.
    Conexion objeto=new Conexion();
    
    //Codigo para eliminar de sql
    String Consulta="Delete from biblioteca where biblioteca.CodigoLibro=?;";
    //Codigo para buscar de sql
    String Consulta2="Select CodigoLibro,CodigoGrado,NombreAutor,Edicion,Curso,Link from biblioteca Where biblioteca.CodigoLibro=?;";
        //Primero verificaremos si existe, luego vamos a eliminar.
        CallableStatement buscar=objeto.establecerConexion().prepareCall(Consulta2);
        buscar.setInt(1, getCodigoLibro());
        buscar.execute();
        //Result set=proporciona varios métodos para obtener los datos de columna correspondientes a un fila.
        ResultSet buscarb=buscar.executeQuery();
        //Si lo encuentra va a poderse eliminar
        if(buscarb.next()){
        //El método prepareCall se utiliza para crear objetos CallableStatement nuevos.
        CallableStatement cs=objeto.establecerConexion().prepareCall(Consulta);
        cs.setInt(1, getCodigoLibro());
        //Ejecutamos
        cs.execute();
        //Si se ejecutó correctamente.
            JOptionPane.showMessageDialog(null,"Se eliminó al piloto correctamente." , "Eliminación realizada",JOptionPane.INFORMATION_MESSAGE);
         }else{
            JOptionPane.showMessageDialog(null,"No se pudo eliminar el libro." , "Codigo de libro no encontrado",JOptionPane.ERROR_MESSAGE);           
            }
         }
        }catch(SQLException e){
           JOptionPane.showMessageDialog(null,"Error: "+e.toString() , "No se pudo eliminar al libro",JOptionPane.ERROR_MESSAGE);
        }
        
    }

//Método para buscar por código de libro
public void BuscarPorCodigoAnuncio(JTextField CodigoBusqueda, JTextField CodigoLibro, JTextField CodigoGrado,JTextField NombreAutor, JTextField Edicion, JTextField Curso, JTextField Link){
        try{
            if(CodigoBusqueda.getText().isEmpty()){
                 JOptionPane.showMessageDialog(null, "Verificar que el dato de buscar codigo este lleno", "Campo vacío",JOptionPane.ERROR_MESSAGE);   
        }else{
            //Guardamos nuestra consulta en una cadena de texto.
            //Codigo de sql
            String Consulta="Select CodigoLibro,CodigoGrado,NombreAutor,Edicion,Curso,Link from biblioteca Where biblioteca.CodigoLibro=?;";
            //Nos conectamos a la base de datos.
            Conexion objetoBiblioteca=new Conexion();
            CallableStatement cs=objetoBiblioteca.establecerConexion().prepareCall(Consulta);
            //Pasamos el codigo a int porque Codigo de libro es int
            setCodigoLibro(Integer.parseInt(CodigoBusqueda.getText()));
            cs.setInt(1, getCodigoLibro());    
            //Ejecutando
            cs.execute();    
            //Result set=proporciona varios métodos para obtener los datos de columna correspondientes a una fila.
            ResultSet rs=cs.executeQuery();
            
            //Si se ejecuta y encuentra la consulta
            if(rs.next()){
                JOptionPane.showMessageDialog(null,"Se muestran los datos." , "Registro encontrado",JOptionPane.INFORMATION_MESSAGE);
                cs.setInt(1, getCodigoLibro());
                CodigoLibro.setText(rs.getString("CodigoLibro"));
                cs.setInt(1,getCodigoGrado());
                CodigoGrado.setText(rs.getString("CodigoGrado"));
                NombreAutor.setText(rs.getString("NombreAutor"));
                Edicion.setText(rs.getString("Edicion"));
                Curso.setText(rs.getString("Curso"));
                Link.setText(rs.getString("Link"));

            }
            //En el caso que no lo llegue a encontrar limpia los textfield
            else{
                JOptionPane.showMessageDialog(null,"Verificar código de búsqueda" , "Registro no encontrado",JOptionPane.ERROR_MESSAGE);
                CodigoBusqueda.setText("");
                CodigoLibro.setText("");
                NombreAutor.setText("");
                Edicion.setText("");
                Curso.setText("");
                Link.setText("");
            }
        }
            //Como es en SQL es una SQLException  
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error: "+e.toString() , "No se ha podido realizar la búsqueda",JOptionPane.ERROR_MESSAGE);
        }   
    }
    //Método para crear archivo HTML con el reporte de la tabla
    public void ReporteHTML(){
        BufferedWriter ficheroSalida;
        //Creamos objeto tipo conexión para conectarse a la base datos.
        Conexion conectar=new Conexion();
        try {
                ficheroSalida = new BufferedWriter(new FileWriter(new File("Reporte biblioteca.html")));
                ficheroSalida.write("<HTML><HEAD><TITLE>REPORTE BIBLIOTECA</TITLE><BODY bgcolor=FFFF86>");
                ficheroSalida.write("<h1>Reporte Biblioteca colegio **El triunfo**</h1>");
                ficheroSalida.write("<center><table border =\"1\">");
                ficheroSalida.write("<tr><th>Codigo de libro</th><th>Codigo de grado</th><th>Nombre de autor</th><th>Edición</th><th>Curso</th><th>Link</th></tr>");
                Connection connection = conectar.establecerConexion();
                Statement statement = connection.createStatement();
                //Vamos a hacer un select from para tomar datos de la tabla biblioteca.
                ResultSet resultSet = statement.executeQuery("Select CodigoLibro,CodigoGrado,NombreAutor,Edicion,Curso,Link from biblioteca");

                while (resultSet.next()) {
                    String CodigoLibro = resultSet.getString("CodigoLibro");
                    String CodigoGrado = resultSet.getString("CodigoGrado");
                    String NombreAutor = resultSet.getString("NombreAutor");
                    String Edicion = resultSet.getString("Edicion");
                    String Curso = resultSet.getString("Curso");
                    String Link = resultSet.getString("Link"); 
                    //Vamos imprimiendo las filas en el reporte.
                    ficheroSalida.write("<tr><td>"+CodigoLibro+"</td><td>"+CodigoGrado+"</td><td>"+NombreAutor+"</td><td>"+Edicion+"</td><td>"+Curso+"</td><td>"+Link+"</td></tr>");

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
    
