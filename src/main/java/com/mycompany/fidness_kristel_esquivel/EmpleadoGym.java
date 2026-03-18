/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fidness_kristel_esquivel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author krist
 */
public class EmpleadoGym extends Usuario implements Serializable {      //Hereda los métodos y atributos de la clase Usuario
    // Unicamente agrega un nuevo atributo que corresponde a un id único de empleado.
    public List<String> idsPermitidos = new ArrayList<>();

    public EmpleadoGym(String tipoUsuario, String nombreUsuarios, int cedula, String apellido1Usuario, String apellido2Usuario, String correo, int telefono, String contrasena, String id) {
        super(tipoUsuario, nombreUsuarios, cedula, apellido1Usuario, apellido2Usuario, correo, telefono, contrasena, id);

    }

    @Override
    public void registrarUsuario(List<Usuario> listausuarios)  throws ExcepcionesGym{//Se define para registrar usuarios y almacenarlos en la lista, sobre este metodo se aplica poliformismo.
        idsPermitidos.add("EM.111");
        idsPermitidos.add("EM.222");
        idsPermitidos.add("EM.333");
        
        
        if (!idsPermitidos.contains(super.getId())){
            throw new ExcepcionesGym ("ID no permitido.");
        }
        
        
        List<Usuario> cargaArchivo;
        try {
        FileInputStream usuariosAlmacenados = new FileInputStream("registrados.gym");
        ObjectInputStream leerregistros = new ObjectInputStream(usuariosAlmacenados);
        cargaArchivo = (List<Usuario>) leerregistros.readObject();
        leerregistros.close();
        } catch (FileNotFoundException e) {
            cargaArchivo = new ArrayList<>();
        } catch (IOException | ClassNotFoundException ex) {
            throw new ExcepcionesGym("Error al cargar usuarios: " + ex.getMessage());
        }
        cargaArchivo.add(this);
        try {
            FileOutputStream registrarUsuarios = new FileOutputStream("registrados.gym");
            ObjectOutputStream output = new ObjectOutputStream(registrarUsuarios);
            output.writeObject(cargaArchivo);
            output.close();
            registrarUsuarios.close();    
        } catch (IOException ex) {
            System.out.println("Exception " + ex.getMessage());
        }
  
    }  
    

    @Override
    public void eliminarUsuario(List<Usuario> listaUsuarios) {//Se define para eliminar usuarios y borrarlos de la lista.
    }


//Se define para permitir el inicio de sesión mediante credenciales almacenadas de los usuarios.
                                                            //Valida el usuario y contarseña contra la lista de usuarios registrados.
    }

    
    


