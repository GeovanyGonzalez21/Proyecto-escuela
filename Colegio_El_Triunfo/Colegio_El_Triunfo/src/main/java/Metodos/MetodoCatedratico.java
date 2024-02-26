
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

public class MetodoCatedratico {
    int Codigocatedratico;  
    String Nombres;
    String Apellidos;
    String DPI;
    String Genero;
    String Correo;
    String NumeroTelefono;
    String MateriaAsignada;
    String Jornada;

    public int getCodigocatedratico() {
        return Codigocatedratico;
    }

    public void setCodigocatedratico(int Codigocatedratico) {
        this.Codigocatedratico = Codigocatedratico;
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

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getNumeroTelefono() {
        return NumeroTelefono;
    }

    public void setNumeroTelefono(String NumeroTelefono) {
        this.NumeroTelefono = NumeroTelefono;
    }

    public String getMateriaAsignada() {
        return MateriaAsignada;
    }

    public void setMateriaAsignada(String MateriaAsignada) {
        this.MateriaAsignada = MateriaAsignada;
    }

    public String getJornada() {
        return Jornada;
    }

    public void setJornada(String Jornada) {
        this.Jornada = Jornada;
    }
    
    //Creamos objeto tipo conexion
    Conexion ConectarBase=new Conexion();
    
    //Insertar informacion
    public void Insertar(JTextField paramCodigo, JTextField paramNombres, JTextField paramApellidos, JTextField paramDPI, JTextField paramGenero,JTextField paramCorreo,JTextField paramNumeroTelefono,JTextField paramMateriaAsignada,JTextField paramJornada){
        //Incorporando los valores obtenidos del formulario
        try{
             //Verificamos que no hayan textfield vacios
            if(paramCodigo.getText().isEmpty()||paramNombres.getText().isEmpty()||paramApellidos.getText().isEmpty()||paramDPI.getText().isEmpty()||paramGenero.getText().isEmpty()||paramCorreo.getText().isEmpty()||paramNumeroTelefono.getText().isEmpty()||paramMateriaAsignada.getText().isEmpty()||paramJornada.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Verificar que todos los campos tengas sus datos", "Campo vacío",JOptionPane.ERROR_MESSAGE);
            }
            else{
                //Pasamos del dato string a int
                int Codigo=parseInt(paramCodigo.getText());
                setCodigocatedratico(Codigo);
                setNombres(paramNombres.getText());
                setApellidos(paramApellidos.getText());
                setDPI(paramDPI.getText());
                setGenero(paramGenero.getText());
                setCorreo(paramCorreo.getText());
                setNumeroTelefono(paramNumeroTelefono.getText());
                setMateriaAsignada(paramMateriaAsignada.getText());
                setJornada(paramJornada.getText());

                //Conexion lista para enlazar mi conexion con mi consulta.
                Conexion objetoConexion=new Conexion();
                //Incorporar valores a la base de datos.
                String consulta="insert into Catedratico(CodigoCatedratico, Nombres,Apellidos,DPI,Genero,Correo,NumeroTelefono,MateriaAsignada,Jornada) values(?,?,?,?,?,?,?,?,?);";

                //Enlazar mi conexion con la consulta
                CallableStatement cs=objetoConexion.establecerConexion().prepareCall(consulta);

                //Incoporar los parametros
                //"?" es donde se pasan los datos de los parametros.
                cs.setInt(1, getCodigocatedratico());
                cs.setString(2, getNombres());
                cs.setString(3, getApellidos());
                cs.setString(4, getDPI());
                cs.setString(5, getGenero());
                cs.setString(6, getCorreo());
                cs.setString(7,getNumeroTelefono());
                cs.setString(8, getMateriaAsignada());
                cs.setString(9,getJornada());


                //Ejecutamos
                cs.execute();
            //Después que se ejecute que nos enseñe un mensaje
            JOptionPane.showMessageDialog(null,"Se insertó correctamente al catedratico" , "Guardado",JOptionPane.INFORMATION_MESSAGE);
            }
         } catch (SQLException ex) {
             //Error si se repite la primary key.
            if(ex.getErrorCode()==1062){
                JOptionPane.showMessageDialog(null, "Código de catedratico se encuentra  en uso.", "LLave primaria/Dato único repetido",JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"Error: "+ex.toString() , "No se a podido insertar al catedratico",JOptionPane.ERROR_MESSAGE);
            }
        }   
    }
           
    //Modificar
    public void ModificarCatedratico(JTextField paramCodigo, JTextField paramNombres, JTextField paramApellidos, JTextField paramDPI, JTextField paramGenero,JTextField paramCorreo,JTextField paramNumeroTelefono,JTextField paramMateriaAsignada,JTextField paramJornada){
        try{
        //Verificamos que no hayan textfield vacios
        if(paramCodigo.getText().isEmpty()||paramNombres.getText().isEmpty()||paramApellidos.getText().isEmpty()||paramDPI.getText().isEmpty()||paramGenero.getText().isEmpty()||paramCorreo.getText().isEmpty()||paramNumeroTelefono.getText().isEmpty()||paramMateriaAsignada.getText().isEmpty()||paramJornada.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Verificar que todos los campos tengas sus datos", "Campo vacío",JOptionPane.ERROR_MESSAGE);
        }else {
            //Pasamos el codigo a entero
            //tomamos los datos de los textfield.
            setCodigocatedratico(Integer.parseInt(paramCodigo.getText()));
            //Los demás son string por lo tanto se colocan normal.
            setNombres(paramNombres.getText());
            setApellidos(paramApellidos.getText());
            //Pasamos edad a entero.
            setDPI(paramDPI.getText());
            setGenero(paramGenero.getText());
            setCorreo(paramCorreo.getText());
            setNumeroTelefono(paramNumeroTelefono.getText());
            setMateriaAsignada(paramMateriaAsignada.getText());
            setJornada(paramJornada.getText());

            //Preparando conexion
            Conexion conbase=new Conexion();
            //Codigo de buscar de sql
            String Consulta2="Select Codigocatedratico,Nombres,Apellidos,DPI,Genero,Correo,NumeroTelefono,MateriaAsignada,Jornada from catedratico Where catedratico.Codigocatedratico=?;";
            CallableStatement buscar=conbase.establecerConexion().prepareCall(Consulta2);
            buscar.setInt(1, getCodigocatedratico());
            buscar.execute();  
            //Result set=proporciona varios métodos para obtener los datos de columna correspondientes a un fila.
            ResultSet buscare=buscar.executeQuery();
            //Si lo encuentra va a ejecutar y modificar, caso contrario lo que va a pasar es mandar al error de que no se encuentra.
            if(buscare.next()){     
            //Variable para guardar la consulta con el codigo de modificar de sql.
                String Consulta="UPDATE catedratico SET catedratico.Nombres=?,catedratico.Apellidos=?,catedratico.DPI=?,catedratico.Genero=?,catedratico.Correo=?,catedratico.NumeroTelefono=?,catedratico.MateriaAsignada=?,catedratico.Jornada=? WHERE catedratico.Codigocatedratico=?;";
                CallableStatement cs=conbase.establecerConexion().prepareCall(Consulta);
                cs.setString(1, getNombres());
                cs.setString(2, getApellidos());
                cs.setString(3, getDPI());
                cs.setString(4, getGenero());
                cs.setString(5, getCorreo());
                cs.setString(6,getNumeroTelefono());
                cs.setString(7,getMateriaAsignada());
                cs.setString(8,getJornada());
                cs.setInt(9, getCodigocatedratico());
                //Ejecutar
                cs.execute();
                    JOptionPane.showMessageDialog(null, "El catedratico ha sido modificado con éxito", "Modificado",JOptionPane.INFORMATION_MESSAGE);
            }else{
                    JOptionPane.showMessageDialog(null, "El catedratico no se modificó, porque no se encuentra el código en la base.", "Código de catedratico no encontrado",JOptionPane.ERROR_MESSAGE);
                }
            }               
        }catch (SQLException e) {
            if(e.getErrorCode()==1062){
                JOptionPane.showMessageDialog(null, "codigo se encuentra en uso.", "Dato único repetido",JOptionPane.ERROR_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null,"Error: "+e.toString() , "No se a podido modificar al catedratico",JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    //Llenado de tabla.
    public void Mostrar(JTable paramTablacatedratico){
        //Creamos un objeto tipo conexion
        Conexion objetoConexion=new Conexion();
        
        DefaultTableModel modelo=new DefaultTableModel();
        //Incorporamos un orden de cabecera. Sirve para ordenar la tabla
        TableRowSorter<TableModel>OrdenarTabla=new TableRowSorter<TableModel>(modelo);
        //Donde va a estar mi consulta
        String sql="";
        
        //Añadimos a la tabla las columnas
        modelo.addColumn("Codigo catedratico");
        modelo.addColumn("Nombres");
        modelo.addColumn("Apellidos");
        modelo.addColumn("DPI");
        modelo.addColumn("Genero");
        modelo.addColumn("Correo");
        modelo.addColumn("Numero Telefono");
        modelo.addColumn("Materia Asignada");
        modelo.addColumn("Jornada");
        
        //A la tabla vacía le insertamos el modelo previamente creado.
        paramTablacatedratico.setModel(modelo);
        
        //En la variable sql hacemos el select from de la tabla grado
        sql="select*from catedratico;";
        
       
        String[]datos=new String[9];
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
                datos[5]=rs.getString(6);
                datos[6]=rs.getString(7);
                datos[7]=rs.getString(8);
                datos[8]=rs.getString(9);
                
                //Incorpore las filas a la tabla.
                modelo.addRow(datos);
            }
            //Incorpora el modelo a la tabla vacia y la llena.
            paramTablacatedratico.setModel(modelo);
        }catch(SQLException ex){
         JOptionPane.showMessageDialog(null, "No se pudieron mostrar los registros"+ex.toString());           
        }
   }
    
    
   
       //Eliminar
    public void EliminarCatedratico(JTextField Codigocatedratico){
        try{
        if(Codigocatedratico.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Verificar que el campo de buscar código este lleno.", "Campo vacío",JOptionPane.ERROR_MESSAGE);                    
        }else{
            //Pasamos de string a int
            setCodigocatedratico(parseInt(Codigocatedratico.getText()));
            //Creamos el objeto con el cual nos conectaremos a la base de datos.
            Conexion objeto=new Conexion();
            //Codigo para eliminar de sql
            String Consulta="Delete from catedratico Where Codigocatedratico=?;";
            //Codigo para buscar de sql
            String Consulta2="Select Codigocatedratico,Nombres,Apellidos,DPI,Genero,Correo,NumeroTelefono,MateriaAsignada,Jornada from catedratico Where catedratico.Codigocatedratico=?;";

            //Primero verificaremos si existe, luego vamos a eliminar.
            CallableStatement buscar=objeto.establecerConexion().prepareCall(Consulta2);
            buscar.setInt(1, getCodigocatedratico());
            buscar.execute();
            //Result set=proporciona varios métodos para obtener los datos de columna correspondientes a un fila.
            ResultSet buscare=buscar.executeQuery();
             //Si lo encuentra va a poderse eliminar.
            if(buscare.next()){
                //El método prepareCall se utiliza para crear objetos CallableStatement nuevos.
                CallableStatement cs=objeto.establecerConexion().prepareCall(Consulta);
                cs.setInt(1, getCodigocatedratico());
                cs.execute();            
                //Si se ejecutó correctamente
                JOptionPane.showMessageDialog(null,"Se eliminó al catedratico correctamente." , "Eliminación realizada",JOptionPane.INFORMATION_MESSAGE);           
                }else{
                    JOptionPane.showMessageDialog(null,"No se pudo eliminar al catedratico." , "Codigo de catedratico no encontrado",JOptionPane.ERROR_MESSAGE);           
                }
            }
        }catch(SQLException e){
            if(e.getErrorCode()==1451){
                JOptionPane.showMessageDialog(null,"No se puede eliminar al catedratico, porque es un registro con llave forarena en una tabla", "Error al eliminar estudiante",JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"Error: "+e.toString() , "No se pudo eliminar al catedratico",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    //Buscar
    public void BuscarPorCodigo(JTextField CodigoBusqueda, JTextField paramCodigo, JTextField paramNombres, JTextField paramApellidos, JTextField paramDPI, JTextField paramGenero,JTextField paramCorreo,JTextField paramNumeroTelefono,JTextField paramMateriaAsignada,JTextField paramJornada){
         try{
             //Verificamos que no hayan textfield vacios
            if(paramCodigo.getText().isEmpty()||paramNombres.getText().isEmpty()||paramApellidos.getText().isEmpty()||paramDPI.getText().isEmpty()||paramGenero.getText().isEmpty()||paramCorreo.getText().isEmpty()||paramNumeroTelefono.getText().isEmpty()||paramMateriaAsignada.getText().isEmpty()||paramJornada.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Verificar que todos los campos tengas sus datos", "Campo vacío",JOptionPane.ERROR_MESSAGE);
            }
            else{


                //Guardamos nuestra consulta en una cadena de texto.
                //Codigo de sql
                String Consulta="Select Codigocatedratico,Nombres,Apellidos,DPI,Genero,Correo,NumeroTelefono,MateriaAsignada,Jornada from catedratico Where catedratico.Codigocatedratico=?;";
                //Nos conectamos a la base.
                Conexion objetoGrado=new Conexion();
      
                CallableStatement cs=objetoGrado.establecerConexion().prepareCall(Consulta);
                //Pasamos el codigo a int porque codigo de gaado es int
                setCodigocatedratico(Integer.parseInt(CodigoBusqueda.getText()));
                cs.setInt(1, getCodigocatedratico());
                //Ejecutando.
                cs.execute();

                //Result set=proporciona varios métodos para obtener los datos de columna correspondientes a un fila.
                ResultSet rs=cs.executeQuery();
            
                //Si se ejecuta y encuentra la consuta.
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Registro encontrado.");
                cs.setInt(1, getCodigocatedratico());
                paramCodigo.setText(rs.getString("Codigocatedratico"));
                paramNombres.setText(rs.getString("Nombres"));
                paramApellidos.setText(rs.getString("Apellidos"));
                paramDPI.setText(rs.getString("DPI"));
                paramGenero.setText(rs.getString("Genero"));
                paramCorreo.setText(rs.getString("Correo"));
                paramNumeroTelefono.setText(rs.getString("NumeroTelefono"));
                paramMateriaAsignada.setText(rs.getString("MateriaAsignada"));
                paramJornada.setText(rs.getString("Jornada"));
                
            }
            //En el caso que no lo llegue a encontrar
            else{
                JOptionPane.showMessageDialog(null, "Registro no encontrado, verificar código");
                CodigoBusqueda.setText("");
                paramCodigo.setText("");
                paramNombres.setText("");
                paramApellidos.setText("");
                paramDPI.setText("");
                paramGenero.setText("");
                paramCorreo.setText("");
                paramNumeroTelefono.setText("");
                paramMateriaAsignada.setText("");
                paramJornada.setText("");
                }
            }
        //Como es en SQL es una SQLException   
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"No se ha podido realizar la búsqueda. Error: "+e.getErrorCode());
        }
    }
    public void ReporteHTML(){
        //Creamos el reporte html a partir de un select from y tomar datos de las tablas.
        BufferedWriter ficheroSalida;
        //Creamos un objetio tipo conexion para conectarse a la base de datos.
        Conexion conectar=new Conexion();
        try{
            ficheroSalida=new BufferedWriter(new FileWriter(new File("Reporte Catedraticos.html")));
            //Archivo html llevan todas las etiquetas correspondientes
            ficheroSalida.write("<HTML><HEAD><TITLE>REPORTE CATEDRATICOS</TITLE><BODY bgcolor=FFFF86>");
            ficheroSalida.write("<h1>Reporte Catedraticos colegio **El triunfo**</h1>");
            ficheroSalida.write("<center><table border = \"1\">");
            ficheroSalida.write("<tr><th>Codigo de catedraticos</th><th>Nombres</th><th>Apellidos</th><th>DPI</th><th>Genero</th><th>Correo</th><th>Numero Telefono</th><th>Materia Asignada</th><th>Jornada</th></tr>");
            //Creamos un objeto tipo conexión que contenga el metodo de establecer conexión a la base de datos.
            Connection connection=conectar.establecerConexion();
            Statement statement = connection.createStatement();
            ResultSet resultSet=statement.executeQuery("Select Codigocatedratico,Nombres,Apellidos,DPI,Genero,Correo,NumeroTelefono,MateriaAsignada,Jornada from catedratico;");
            
            //Ciclo while para rellenar tabla, mientras existan filas.
            while(resultSet.next()){
                String Codigocatedratico=resultSet.getString("Codigocatedratico");
                String Nombres=resultSet.getString("Nombres");
                String Apellidos=resultSet.getString("Apellidos");
                String DPI=resultSet.getString("DPI");
                String Genero=resultSet.getString("Genero");
                String Correo=resultSet.getNString("Correo");
                String NumeroTelefono=resultSet.getNString("NumeroTelefono");
                String MateriaAsignada=resultSet.getNString("MateriaAsignada");
                String Jornada=resultSet.getNString("Jornada");
                ficheroSalida.write("<tr><td>"+Codigocatedratico+"</td><td>"+Nombres+"</td><td>"+Apellidos+"</td><td>"+DPI+"</td><td>"+Genero+"</td><td>"+Correo+"</td><td>"+NumeroTelefono+"</td><td>"+MateriaAsignada+"</td><td>"+Jornada+"</td></tr>");
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

   
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

