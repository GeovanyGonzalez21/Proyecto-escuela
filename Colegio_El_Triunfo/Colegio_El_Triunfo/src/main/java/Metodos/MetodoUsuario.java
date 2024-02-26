
package Metodos;

//Para crear usuario y ver login

import com.mycompany.colegio_el_triunfo.Conexion;
import com.mycompany.colegio_el_triunfo.Ingresar;
import com.mycompany.colegio_el_triunfo.Menu;
import static java.lang.Integer.parseInt;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class MetodoUsuario {
    int CodigoUsuario;
    String Nombre;
    String Apellido;
    String Genero;
    String Cargo;
    String CorreoElectronico;
    String Usuario;
    String Contraseña;
    
    //Getters and setters

    public int getCodigoUsuario() {
        return CodigoUsuario;
    }

    public void setCodigoUsuario(int CodigoUsuario) {
        this.CodigoUsuario = CodigoUsuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public void setCorreoElectronico(String CorreoElectronico) {
        this.CorreoElectronico = CorreoElectronico;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
    Conexion conectar=new Conexion();
    
    public void Insertar(JTextField paramCodigoUsuario, JTextField paramNombre,JTextField paramApellido,JTextField paramGenero,JTextField paramCargo,JTextArea paramCorreoElectronico,JTextField paramUsuario,JTextField paramContraseña){
        //Incorporamos los valores obtenidos del formulario.
        try{
            //Verificamos que no hayan textfield vacios
            if(paramCodigoUsuario.getText().isEmpty()||paramNombre.getText().isEmpty()||paramApellido.getText().isEmpty()||paramGenero.getText().isEmpty()||paramCargo.getText().isEmpty()||paramCorreoElectronico.getText().isEmpty()||paramContraseña.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Verificar que todos los campos tengas sus datos", "Campo vacío",JOptionPane.ERROR_MESSAGE);
            }else{
                //Pasamos una cadena de texto a int
                int Codigo=parseInt(paramCodigoUsuario.getText());
                //Los demás se quedan como string
                setCodigoUsuario(Codigo);
                setNombre(paramNombre.getText());
                setApellido(paramApellido.getText());
                setGenero(paramGenero.getText());
                setCargo(paramCargo.getText());
                setCorreoElectronico(paramCorreoElectronico.getText());
                setUsuario(paramUsuario.getText());
                setContraseña(paramContraseña.getText());

                //Conexion lista para enlazar mi conexion con mi consulta
                Conexion objetoConexion=new Conexion();
                //Incorporamos los valores a la base de datos
                String Consulta="insert into usuario(CodigoUsuario,Nombre,Apellido,Genero,Cargo,CorreoElectronico,Usuario,Contraseña) values(?,?,?,?,?,?,?,?);";

                //Enlazar mi conexion con la consulta
                CallableStatement cs=objetoConexion.establecerConexion().prepareCall(Consulta);

                //Incorporar los parametros
                //'?' es donde se van a rellenar los datos
                cs.setInt(1, getCodigoUsuario());
                cs.setString(2, getNombre());
                cs.setString(3,getApellido());
                cs.setString(4, getGenero());
                cs.setString(5, getCargo());
                cs.setString(6, getCorreoElectronico());
                cs.setString(7, getUsuario());
                cs.setString(8, getContraseña());

                //Ejecutamos
                cs.execute();

                //Después que se ejecute que nos enseñe un mensaje
                JOptionPane.showMessageDialog(null,"Se insertó correctamente al usuario" , "Guardado",JOptionPane.INFORMATION_MESSAGE);
            }
         } catch (SQLException ex) {
             //Error si se repite la primary key o un dato no repetible
            if(ex.getErrorCode()==1062){
                JOptionPane.showMessageDialog(null, "Código de usuario/correo/usuario se encuentra  en uso.", "LLave primaria/Dato único repetido",JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"Error: "+ex.toString() , "No se a podido insertar al usuario",JOptionPane.ERROR_MESSAGE);
            }
        }              
    }
    //Modificar
    public void ModificarUsuario(JTextField paramCodigoUsuario, JTextField paramNombre,JTextField paramApellido,JTextField paramGenero,JTextField paramCargo,JTextArea paramCorreoElectronico,JTextField paramUsuario,JTextField paramContraseña){
        try{
        //Verificamos que no hayan textfield vacios
        if(paramCodigoUsuario.getText().isEmpty()||paramNombre.getText().isEmpty()||paramApellido.getText().isEmpty()||paramGenero.getText().isEmpty()||paramCargo.getText().isEmpty()||paramCorreoElectronico.getText().isEmpty()||paramContraseña.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Verificar que todos los campos tengas sus datos", "Campo vacío",JOptionPane.ERROR_MESSAGE);
        }else{     
            //Pasamos el codigo a entero
            //Codigo de usuario se pasa a int
            setCodigoUsuario(Integer.parseInt(paramCodigoUsuario.getText()));
            //Los demás son string
            setNombre(paramNombre.getText());
            setApellido(paramApellido.getText());
            setGenero(paramGenero.getText());
            setCargo(paramCargo.getText());
            setCorreoElectronico(paramCorreoElectronico.getText());
            setUsuario(paramUsuario.getText());
            setContraseña(paramContraseña.getText());

            //Preparando conexion
            Conexion conbase=new Conexion();
            //Codigo de modificar de sql
            String Consulta2="Select CodigoUsuario,Nombre,Apellido,Genero,Cargo, Area from usuario Where usuario.CodigoUsuario=?;";
            CallableStatement buscar=conbase.establecerConexion().prepareCall(Consulta2);
            buscar.setInt(1, getCodigoUsuario());
            buscar.execute();
            //Result set=proporciona varios métodos para obtener los datos de columna correspondientes a un fila.
            ResultSet buscare=buscar.executeQuery();
            //Si lo encuentra va a ejecutar y modificar, caso contrario lo que va a pasar es mandar al error de que no se encuentra.
            if(buscare.next()){
            //Variable para guardar la consulta con el codigo a modificar en sql
            String Consulta="UPDATE usuario SET usuario.Nombre=?, usuario.Apellido=?, usuario.Genero=?, usuario.Cargo=?, usuario.CorreoElectronico=?,usuario.Usuario=?, usuario.Contraseña=? WHERE Usuario.CodigoUsuario=?;";
            //Try catch para evitar que el programa se cierre y capturar errores

                CallableStatement cs=conbase.establecerConexion().prepareCall(Consulta);
                cs.setString(1, getNombre());
                cs.setString(2, getApellido());
                cs.setString(3, getGenero());
                cs.setString(4, getCargo());
                cs.setString(5, getCorreoElectronico());
                cs.setString(6, getUsuario());
                cs.setString(7, getContraseña());
                cs.setInt(8, getCodigoUsuario());

                //Ejecutar
                cs.execute();
                JOptionPane.showMessageDialog(null, "El usuario ha sido modificado con éxito", "Modificado",JOptionPane.INFORMATION_MESSAGE);
            }else{
                    JOptionPane.showMessageDialog(null, "El usuario no se modificó, porque no se encuentra el código en la base.", "Código de usuario no encontrado",JOptionPane.ERROR_MESSAGE);
                }  
            }
        }catch (SQLException e) {
            if(e.getErrorCode()==1062){
                JOptionPane.showMessageDialog(null, "Correo/usuario se encuentra  en uso.", "Dato único repetido",JOptionPane.ERROR_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null,"Error: "+e.toString() , "No se a podido modificar al estudiante",JOptionPane.ERROR_MESSAGE);
            }
        } 
    }
    //Eliminar
    public void EliminarUsuario(JTextField paramCodigoUsuario){
        try{
        if(paramCodigoUsuario.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Verificar que el campo de buscar código este lleno.", "Campo vacío",JOptionPane.ERROR_MESSAGE);                                
        }else{
            //Pasamos de stirng a int
            setCodigoUsuario(parseInt(paramCodigoUsuario.getText()));
            //Creamos el objeto con el cual nos conectaremos a la base de datos
            Conexion objeto=new Conexion();

            //Código para eliminar de sql
            String Consulta="delete from usuario where CodigoUsuario=?;";
            //Codigo para buscar de sql
            String Consulta2="Select CodigoUsuario,Nombre,Apellido,Genero,Cargo, Area from usuario Where usuario.CodigoUsuario=?;";

            //Primero verificaremos si existe, luego vamos a eliminar
            CallableStatement buscar=objeto.establecerConexion().prepareCall(Consulta2);
            buscar.setInt(1, getCodigoUsuario());
            buscar.execute();
            //Result set=proporciona varios métodos para obtener los datos de columna correspondientes a un fila.
            ResultSet buscare=buscar.executeQuery();
            //Si lo encuentra va a poderse eliminar
                if(buscare.next()){
                //Si lo encuentra va a poderse eliminar.
                //El método prepareCall se utiliza para crear objetos CallableStatement nuevos.
                CallableStatement cs=objeto.establecerConexion().prepareCall(Consulta);
                cs.setInt(1, getCodigoUsuario());
                cs.execute();       
                //Si se ejecutó correctamente
                JOptionPane.showMessageDialog(null,"Se eliminó al usuario correctamente." , "Eliminación realizada",JOptionPane.INFORMATION_MESSAGE);
             }else{
                    JOptionPane.showMessageDialog(null,"No se pudo eliminar al usuario." , "Codigo de usuario no encontrado",JOptionPane.ERROR_MESSAGE);                           
                }
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error: "+e.toString() , "No se pudo eliminar al usuario",JOptionPane.ERROR_MESSAGE);
            
        }
    }   
    //Buscar por codigo de usuario
    public void BuscarPorCodigoUsuario(JTextField CodigoBusqueda, JTextField paramCodigoUsuario, JTextField paramNombre,JTextField paramApellido,JTextField paramGenero,JTextField paramCargo,JTextArea paramCorreoElectronico,JTextField paramUsuario,JTextField paramContraseña){
    try{
        if(CodigoBusqueda.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Verificar que el dato de buscar codigo este lleno", "Campo vacío",JOptionPane.ERROR_MESSAGE);
         }else{
            //Guardamos nuestra consulta en una cadena de texto
            //Codigo de sql
            String Consulta="select CodigoUsuario,Nombre,Apellido,Genero,Cargo,CorreoElectronico,Usuario,Contraseña from usuario where CodigoUsuario=?;";
            //Nos conectamos a la base de datos
            Conexion objetoUsuario=new Conexion();

            CallableStatement cs=objetoUsuario.establecerConexion().prepareCall(Consulta);
            //Pasamos el codigo a int porque CodigoUsuario es int
            setCodigoUsuario(Integer.parseInt(CodigoBusqueda.getText()));
            cs.setInt(1, getCodigoUsuario());
            //Ejecutando
            cs.execute();
            //Result set=proporciona varios métodos para obtener los datos de columna correspondientes a un fila.
            ResultSet rs=cs.executeQuery();
                //Si se ejecuta y encuentra la consulta
                if(rs.next()){
                    JOptionPane.showMessageDialog(null,"Se muestran los datos." , "Registro encontrado",JOptionPane.INFORMATION_MESSAGE);
                    cs.setInt(1, getCodigoUsuario());
                    paramCodigoUsuario.setText(rs.getString("CodigoUsuario"));
                    paramNombre.setText(rs.getString("Nombre"));
                    paramApellido.setText(rs.getString("Apellido"));
                    paramGenero.setText(rs.getString("Genero"));
                    paramCargo.setText(rs.getString("Cargo"));
                    paramCorreoElectronico.setText(rs.getString("CorreoElectronico"));
                    paramUsuario.setText(rs.getString("Usuario"));
                    paramContraseña.setText(rs.getString("Contraseña"));
                }
                //En caso que no lo llegue a encontrar
                else{
                    JOptionPane.showMessageDialog(null,"Verificar código de búsqueda" , "Registro no encontrado",JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error: "+ex.toString() , "No se ha podido realizar la búsqueda",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void Ingresar(JTextField paramUsuario, JTextField paramContraseña){
        //Incorporamos valores del formulario
        setUsuario(paramUsuario.getText());
        setContraseña(paramContraseña.getText());
        //Inicializamos en 
        boolean encontrado=false;
        
        //Si algún campo está vacio
        if(paramUsuario.getText().isEmpty() || paramContraseña.getText().isEmpty()){
             JOptionPane.showMessageDialog(null, "Algún campo está vacío", "Atención", JOptionPane.ERROR_MESSAGE);
             //Limpiamos
             paramUsuario.setText("");
             paramContraseña.setText("");
        }else{
            //Realizar la consulta en la base de datos
            String Consulta="Select*from usuario where Usuario= ? AND Contraseña=?";
            //Try catch
            try{
                Connection conn=conectar.establecerConexion();
                PreparedStatement pstmt = conn.prepareStatement(Consulta);
                pstmt.setString(1, getUsuario());
                pstmt.setString(2, getContraseña());
                ResultSet rs = pstmt.executeQuery();        
                //Verificamos concidiencia en la base de datos
                if(rs.next()){
                     JOptionPane.showMessageDialog(null, "Datos correctos", "¡Bienvenido!", JOptionPane.INFORMATION_MESSAGE);
                     //Abrimos el menu
                     Menu vmenu=new Menu();
                     encontrado=true;
                }
                //Si no se encuentra el usuario y contraseña.
                else{
                     JOptionPane.showMessageDialog(null, "Datos incorrectos", "Acceso denegado", JOptionPane.INFORMATION_MESSAGE);
                     //Limpiamos
                     paramUsuario.setText("");
                     paramContraseña.setText("");
                     Ingresar ventana=new Ingresar();
                }
                //Cerramos
                rs.close();
                conn.close();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Error: "+ex.toString() , "No se ha podido realizar la búsqueda del usuario",JOptionPane.ERROR_MESSAGE);
            }
        }  
        
    }
}
