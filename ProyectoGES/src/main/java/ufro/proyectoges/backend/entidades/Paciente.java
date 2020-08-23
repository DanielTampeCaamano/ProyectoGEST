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
public class Paciente {
    
    private String nombreCompleto;
    private String rutValidado;

    public Paciente(String nombreCompleto, Rut rut) {
       this.nombreCompleto = nombreCompleto;
       this.rutValidado = rut.getRut();
    }

    public Paciente() {
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
