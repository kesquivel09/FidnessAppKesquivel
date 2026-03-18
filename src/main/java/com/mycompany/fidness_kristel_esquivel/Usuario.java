/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fidness_kristel_esquivel;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author krist
 */
public abstract class Usuario implements Serializable { //Clase abstracta usuario que hereda sus métodos y atributos a empleado y clientes.
    public String tipoUsuario;  
    public String nombreUsuarios;
    public int cedula;           
    public String apellido1Usuario;
    public String apellido2Usuario;
    public String correo;        
    public int telefono;    
    public static String idUsuarioActual = "";
    public String contrasena; 
    public String id;

    public Usuario(String tipoUsuario, String nombreUsuarios, int cedula, String apellido1Usuario, String apellido2Usuario, String correo, int telefono, String contrasena, String id) {
        this.tipoUsuario = tipoUsuario;
        this.nombreUsuarios = nombreUsuarios;
        this.cedula = cedula;
        this.apellido1Usuario = apellido1Usuario;
        this.apellido2Usuario = apellido2Usuario;
        this.correo = correo;
        this.telefono = telefono;
        this.contrasena = contrasena;
        this.id = id;
    } 

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombreUsuarios() {
        return nombreUsuarios;
    }

    public void setNombreUsuarios(String nombreUsuarios) {
        this.nombreUsuarios = nombreUsuarios;
    }

    public String getApellido1Usuario() {
        return apellido1Usuario;
    }

    public void setApellido1Usuario(String apellido1Usuario) {
        this.apellido1Usuario = apellido1Usuario;
    }

    public String getApellido2Usuario() {
        return apellido2Usuario;
    }

    public void setApellido2Usuario(String apellido2Usuario) {
        this.apellido2Usuario = apellido2Usuario;
    }


    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public static String iniciarSesion(String usuario, String contrasena) throws ClassNotFoundException{

        try {
            List<Usuario> listaInfoUsuarioArchivo = new ArrayList<Usuario>();
            FileInputStream cargaInfoUsuarioArchivos = new FileInputStream("registrados.gym");
            ObjectInputStream leerInformacionArchivo = new ObjectInputStream(cargaInfoUsuarioArchivos);
            listaInfoUsuarioArchivo = (List<Usuario>) leerInformacionArchivo.readObject();
            
            for (Usuario registrado : listaInfoUsuarioArchivo){
                if (registrado.id.equals(usuario)&& registrado.contrasena.equals(contrasena)){
                    idUsuarioActual = registrado.getId();
                    System.out.println(idUsuarioActual);
                    return registrado.tipoUsuario;
                }
            }
        } catch (IOException ex) {
            System.out.println("Exception " + ex.getMessage());
        }
        return null;
    }
//Valida el usuario y contarseña contra la lista de usuarios registrados.
    public abstract void registrarUsuario(List<Usuario> listausuarios) throws ExcepcionesGym; //Se define para registrar usuarios y almacenarlos en la lista.
    public abstract void eliminarUsuario(List<Usuario> listaUsuarios); //Se define para eliminar usuarios y borrarlos de la lista.
}


