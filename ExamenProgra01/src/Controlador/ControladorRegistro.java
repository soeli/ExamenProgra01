/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.MetodosParqueo;
import Vista.RegistroParqueo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author SOFIA ELIZONDO
 */
public class ControladorRegistro implements ActionListener{
    
    
    RegistroParqueo registroParqueo;
    MetodosParqueo metodos;
            
    
    public ControladorRegistro (RegistroParqueo registroParqueo)
    {
        registroParqueo=registroParqueo;
        this.metodos=new MetodosParqueo();
        
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Buscar"))
        {
            if(metodos.consultaAutos(registroParqueo.devolverRegistro()))
            {
                this.registroParqueo.devolverInformacion(metodos.devolverInformacion());
            }
            else
            {
                //this.registroParqueo.mostrarMensaje("Registro no existe");
            }
            
            
            System.out.println("Buscar");
        }
        
        if(e.getActionCommand().equals("Agregar"))
        {
            if(this.metodos.consultaAutos(this.registroParqueo.enviarInformacion()[0]))
            {
                this.registroParqueo.mostrarMensaje("Registro Existente");
            }
            else
            {
                this.metodos.agregarAutos(this.registroParqueo.enviarInformacion());
                this.registroParqueo.mostrarMensaje("Auto Registrado");
            }
            System.out.println("Agregar");
            
        }
        if(e.getActionCommand().equals("Modificar"))
        {
            if(this.metodos.consultaAutos(this.registroParqueo.enviarInformacion()[0]))
            {
                this.metodos.modificarAutos(registroParqueo.enviarInformacion());
                this.registroParqueo.mostrarMensaje("Registro Modifica");
            }
            else
            {
                this.registroParqueo.mostrarMensaje("Registro no existe");
            }
            System.out.println("Modificar");
        }
        if(e.getActionCommand().equals("Eliminar"))
        {
            if(this.metodos.consultaAutos(this.registroParqueo.enviarInformacion()[0]))
            {
                this.metodos.eliminarAutos(this.registroParqueo.enviarInformacion());
                this.registroParqueo.mostrarMensaje("Registro Eliminado");
            }
            else
            {
                this.registroParqueo.mostrarMensaje("Registro no existe");
            }
            System.out.println("Eliminar");
        }
    }
    
}
