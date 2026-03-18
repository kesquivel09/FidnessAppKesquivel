/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.fidness_kristel_esquivel;

import Fidness_GUI.InicioSesion;
import Fidness_GUI.registroCliente;
import Fidness_GUI.registroEmpleado;
import javax.swing.JFrame;

/**
 *
 * @author krist
 */
public class navegacionVentanas {
    
    public static void cambiarVentanasComboBox(JFrame actual, String seleccion){
        if (seleccion.equals("Empleado")){
            registroEmpleado empleado = new registroEmpleado();
            actual.dispose();
            empleado.setVisible(true);
        }else{
            registroCliente cliente = new registroCliente();
            actual.dispose();
            cliente.setVisible(true);
        }
    }
    
    public static void cerrarSesion(JFrame actual){
        InicioSesion volver = new InicioSesion();
        volver.setVisible(true);
    }
}
