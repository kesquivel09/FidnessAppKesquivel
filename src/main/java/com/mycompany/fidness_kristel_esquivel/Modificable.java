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
public interface Modificable { //Definimos esta interfaz para utilizarla en Maquinas y Ejercicios ya que ambos nesecitan 
    //registrar y eliminar elementos de los ya creados.
    
    public void Registrar();
    public void Eliminar();
}
