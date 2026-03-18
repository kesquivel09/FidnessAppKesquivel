/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fidness_kristel_esquivel;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author krist
 */
public class Ejercicios implements Modificable{
    public int idEjercicio;
    public String nombre;
    public String tipo;
    public String urlEjecucion;
    public Maquinas maquina;
    public List<Ejercicios> ejerciciosdisponibles = new ArrayList<>(); //Se almacenan los ejercicios registrados.

    public Ejercicios (int idEjercicio, String nombre, String tipo, String urlEjecucion, Maquinas maquina) {
        this.idEjercicio = idEjercicio;
        this.nombre = nombre;
        this.tipo = tipo;
        this.urlEjecucion = urlEjecucion;
        this.maquina = maquina;
    }

    public int getIdEjercicio() {
        return idEjercicio;
    }

    public void setIdEjercicio(int idEjercicio) {
        this.idEjercicio = idEjercicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUrlEjecucion() {
        return urlEjecucion;
    }

    public void setUrlEjecucion(String urlEjecucion) {
        this.urlEjecucion = urlEjecucion;
    }

    public Maquinas getMaquina() {
        return maquina;
    }

    public void setMaquina(Maquinas maquina) {
        this.maquina = maquina;
    }

    @Override
    public void Registrar() { //Aquí se ejecuta la lógica para registrar un nuevon ejercicio en la lista de ejercicios.
    }

    @Override
    public void Eliminar() { //Aquí se ejecuta la lógica para eliminar un ejercicio de la lista de ejercicios.
        }

    
}
