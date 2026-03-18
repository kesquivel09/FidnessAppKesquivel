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
public class Maquinas implements Modificable{
    public int activoMaquina;
    public String nombre;
    public String tipo;
    public List<Maquinas> listadoMaquinas = new ArrayList<>(); //Se almacenan las máquinas registradas.

    public Maquinas(int activoMaquina, String nombre, String tipo, String descripcion) {
        this.activoMaquina = activoMaquina;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public int getActivoMaquina() {
        return activoMaquina;
    }

    public void setActivoMaquina(int activoMaquina) {
        this.activoMaquina = activoMaquina;
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

    @Override
    public void Registrar() { //Aquí se ejecuta la lógica para registrar una máquina en el listado de máquinas
         }

    @Override
    public void Eliminar() {//Aquí se ejecuta la lógica para eliminar una máquina en el listado de máquinas
       }

  
}
