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
public class Persona {
    
    protected String nombre;
    protected Rut rut;
    protected String tipo_persona;

    public Persona(String nombre, Rut rut, String tipo_persona) {
        this.nombre = nombre;
        this.rut = rut;
        this.tipo_persona = null;
    }

    public String getNombre() {
        return nombre;
    }

    public Rut getRut() {
        return rut;
    }

    public String getTipo_persona() {
        return tipo_persona;
    }

    public void setTipo_persona(String tipo_persona) {
        this.tipo_persona = tipo_persona;
    }
    
    
    
    
    
    
    
}
