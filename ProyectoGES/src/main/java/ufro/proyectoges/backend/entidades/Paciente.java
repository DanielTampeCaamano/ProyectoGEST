/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufro.proyectoges.backend.entidades;

import ufro.proyectoges.backend.entidades.rut.Rut;

/**
 *
 * @author shido
 */
public class Paciente extends Persona {
    
    private String nombreCompleto;
    private String rutValidado;
    private Rut rutSinConvertir;
    
    public Paciente(String nombreCompleto, Rut rut) {
        super(nombreCompleto, rut, "PACIENTE", null);
        super.setTipo_persona("PACIENTE");
        this.nombreCompleto = nombreCompleto;
        this.rutSinConvertir = rut;
        this.rutValidado = rut.getRut();
    }
    
    public Rut getRutSinConvertir() {
        return rutSinConvertir;
    }
    
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    
    public String getRutValidado() {
        return rutValidado;
    }
    
    @Override
    public String toString() {
        return "Paciente{" + "nombreCompleto=" + nombreCompleto + ", rutValidado=" + rutValidado + '}';
    }
    
}
