/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import Controlador.ControladorRegistro;
import java.util.ArrayList;

/**
 *
 * @author SOFIA ELIZONDO
 */
public class MetodosParqueo {
    
    ControladorRegistro controlador;
    
    private ArrayList <Auto> arrayAutos;
    String arregloDevolverInformacion[]=new String[3];
    
    public MetodosParqueo()
    {
        arrayAutos=new ArrayList <Auto>();
    }
    
    public boolean consultaAutos(String registro)
    {
        boolean consultaAutos=false;
        for(int contador=0;contador<arrayAutos.size();contador++)
        {
            if(arrayAutos.get(contador).getNumRegistro().equals(registro))
            {
                arregloDevolverInformacion[0]=arrayAutos.get(contador).getNombreDuenio();
                arregloDevolverInformacion[1]=arrayAutos.get(contador).getCedulaDuenio();
                arregloDevolverInformacion[2]=arrayAutos.get(contador).getPlacaAuto();
                consultaAutos=true;
            }
        }
        
        return consultaAutos;
    }
    
    
    public String[] devolverInformacion()
    {
        return arregloDevolverInformacion;
    }
    
    public void agregarAutos(String informacion[])
    {
        Auto temporal=new Auto(informacion[0],informacion[1],informacion[2],informacion[3]);
        arrayAutos.add(temporal);
    }
    
    public void modificarAutos(String informacion[])
    {
        for(int contador=0;contador<arrayAutos.size();contador++)
        {
            if(arrayAutos.get(contador).getNumRegistro().equals(informacion))
            {
                arrayAutos.get(contador).setNombreDuenio(informacion[1]);
                arrayAutos.get(contador).setCedulaDuenio(informacion[2]);
                arrayAutos.get(contador).setPlacaAuto(informacion[3]);
            }
        }
    }
    
    public void eliminarAutos(String informacion[])
    {
        for(int contador=0;contador<arrayAutos.size();contador++)
        {
            if(arrayAutos.get(contador).getNumRegistro().equals(informacion))
            {
                arrayAutos.remove(contador);
            }
        }
    }
    
    
    
    
//    public String devolverCodigo()
//    {
//        String codigo= "";
//        
//        if(arrayMatricula.size()==0)
//        {
//            codigo="1";
//        }
//        else
//        {
//            for(int contador=0;contador<arrayMatricula.size();contador++)
//            {
//                if(arrayMatricula.get(contador)!=null)
//                {
//                    codigo=arrayMatricula.get(contador).getCodigo();
//                }
//            }
//            int numero=Integer.parseInt(codigo);
//            numero++;
//            codigo=""+numero;
//        }
//        
//        return codigo; 
//    }
    
}
