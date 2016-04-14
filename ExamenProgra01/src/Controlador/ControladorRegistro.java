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
        this.registroParqueo = registroParqueo;
        this.metodos=new MetodosParqueo();
        
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Buscar"))
        {
            buscar();
        }
        
        if(e.getActionCommand().equals("Agregar"))
        {   
            if(metodos.consultaAutos(registroParqueo.devolverRegistro()))
           {
               registroParqueo.mostrarMensaje("Registro en uso");
                System.out.println("Rigistro Ocupado");
                registroParqueo.estadoInicial();
            }
           else
            {
                metodos.agregarAutos(registroParqueo.devolverInformacion());
                registroParqueo.mostrarMensaje("Auto Registrado");
                registroParqueo.estadoInicial();
           }
            
            System.out.println("Agregar");
            
        }
        
        
        if(e.getActionCommand().equals("Modificar"))
        {
            if(metodos.consultaAutos(registroParqueo.devolverRegistro()))
            {
                this.metodos.modificarAutos(registroParqueo.devolverInformacion());
                this.registroParqueo.mostrarMensaje("Registro Modificado");
                registroParqueo.estadoInicial();
            }
            else
            {
                this.registroParqueo.mostrarMensaje("Registro no existe");
                registroParqueo.estadoInicial();
            }
            System.out.println("Modificar");
        }
        
        
        if(e.getActionCommand().equals("Eliminar"))
        {
            if(metodos.consultaAutos(registroParqueo.devolverRegistro()))
            {
                this.metodos.eliminarAutos(this.registroParqueo.devolverInformacion());
                this.registroParqueo.mostrarMensaje("Registro Eliminado");
                registroParqueo.estadoInicial();
            }
            else
            {
                this.registroParqueo.mostrarMensaje("Registro no existe");
                registroParqueo.estadoInicial();
            }
            System.out.println("Eliminar");
        }
    }
    
    
    public void buscar()
    {
        if(metodos.consultaAutos(registroParqueo.devolverRegistro()))
            {
               this.registroParqueo.mostrarInformacion(metodos.devolverInformacion(registroParqueo.devolverRegistro()));
               registroParqueo.habilitarModificar();
            }
            else
            {
                //this.registroParqueo.mostrarMensaje("Registro no existe");
                registroParqueo.habilitarAgregar();
            }
            
            
            System.out.println("Buscar");
    }
    
}
