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
    private IPDPaciente ipdPaciente;
    private int ipdId;
    
    public Paciente(String nombreCompleto, Rut rut, IPDPaciente ipd) {
        super(nombreCompleto, rut, "PACIENTE", null);
        super.setTipo_persona("PACIENTE");
        super.setHerramientaPersona(null);
        this.nombreCompleto = nombreCompleto;
        this.rutSinConvertir = rut;
        this.rutValidado = rut.getRut();
        this.ipdPaciente = ipd;
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

    public IPDPaciente getIpdPaciente() {
        return ipdPaciente;
    }

    public void setIpdPaciente(IPDPaciente ipdPaciente) {
        this.ipdPaciente = ipdPaciente;
    }
    
    
    @Override
    public String toString() {
        return "Paciente{" + "nombreCompleto=" + nombreCompleto + ", rutValidado=" + rutValidado + ", Null ipd?=" + (ipdPaciente == null) + '}';
    }
    
}
