
package com.mycompany.colegio_el_triunfo;

import java.io.*;
import java.io.Serializable;

public class DatoLogin implements Serializable {
    private String Nombre;
    private String Apellido;
    private String Genero;
    private String Cargo;
    private String CorreoElectronico;
    private String Usuario;
    private String Contraseña;

    public DatoLogin(String Nombre, String Apellido, String Genero, String Cargo, String CorreoElectronico, String Usuario, String Contraseña) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Genero = Genero;
        this.Cargo = Cargo;
        this.CorreoElectronico = CorreoElectronico;
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
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
    
    
    @Override
    public String toString(){
        
        return "Nombre: "+Nombre+". Apellido: "+Apellido+". Genero: "+Genero+". Cargo: "+Cargo+". Correo electrónico: "+CorreoElectronico+". Usuario: "+Usuario+". Contraseña: "+Contraseña+"\n";
        
    }
    
}
