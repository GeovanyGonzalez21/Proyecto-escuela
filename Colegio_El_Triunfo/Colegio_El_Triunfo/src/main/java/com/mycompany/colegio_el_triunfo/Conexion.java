
package com.mycompany.colegio_el_triunfo;
//Clase creada para la conexion a la base de datos.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {
    
    private Connection conectar = null;
    private String usuario="root";
    private String password = "PROGRA12345678910$";
    private String bd="colegio_el_triunfo";
    private String ip="Localhost";
    private String puerto = "3306";
    
    public Connection establecerConexion() {
        try {
            String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd;
            conectar = DriverManager.getConnection(cadena, usuario, password);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos: " + e.toString());
        }
        return conectar;
    }
}


