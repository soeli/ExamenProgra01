/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

/**
 *
 * @author SOFIA ELIZONDO
 */
public class Auto {
    
    
    String numRegistro;
    String nombreDuenio;
    String cedulaDuenio;
    String placaAuto;

    public Auto(String numRegistro, String nombreDuenio, String cedulaDuenio, String placaAuto) {
        this.numRegistro = numRegistro;
        this.nombreDuenio = nombreDuenio;
        this.cedulaDuenio = cedulaDuenio;
        this.placaAuto = placaAuto;
    }

    public String getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(String numRegistro) {
        this.numRegistro = numRegistro;
    }

    public String getNombreDuenio() {
        return nombreDuenio;
    }

    public void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }

    public String getCedulaDuenio() {
        return cedulaDuenio;
    }

    public void setCedulaDuenio(String cedulaDuenio) {
        this.cedulaDuenio = cedulaDuenio;
    }

    public String getPlacaAuto() {
        return placaAuto;
    }

    public void setPlacaAuto(String placaAuto) {
        this.placaAuto = placaAuto;
    }
    
    
}
