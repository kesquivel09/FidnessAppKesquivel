/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.fidness_kristel_esquivel;
import java.util.ArrayList;
import java.util.List;
       
/**
 *
 * @author krist
 */
public class Rutina implements Exportable{
    public int idRutina;
    public int cantidadEjercicios;
    public String zonaEnfasis;
    public List<Ejercicios> rutinaUsuario = new ArrayList<>();
    
    //Se define para crear la lógica de seleccion de ejercicios según la zona a la que se le desea dar enfasis.
    public static void CreandoRutina(List<Ejercicios> ejerciciosRegistrados, String zonaEnfasis, int cantidadEjercicios ){
        
    }

    //Se define para poder generar un archivo con la rutina creada por el usuario.
    @Override
    public void Exportar() {
     }
    
    
}
