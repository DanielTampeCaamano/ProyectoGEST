/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufro.proyectoges.backend.entidades;

import ufro.proyectoges.backend.entidades.rut.Rut;
import ufro.proyectoges.backend.herramientas.Herramienta;

/**
 *
 * @author shido
 */
public class Persona {
    
    protected String nombre;
    protected Rut rut;
    protected String tipo_persona;
    private String clave;
    protected Herramienta herramientaPersona;
    
    public Persona(String nombre, Rut rut, String tipo_persona,String clave) {
        this.nombre = nombre;
        this.rut = rut;
        this.tipo_persona = tipo_persona;
        this.clave = clave;
    }

    public Herramienta getHerramientaPersona() {
        return herramientaPersona;
    }

    public void setHerramientaPersona(Herramienta herramientaPersona) {
        this.herramientaPersona = herramientaPersona;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public Rut getRut() {
        return rut;
    }

    public String getClave() {
        return clave;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", rut=" + rut + ", tipo_persona=" + tipo_persona + ", clave=" + clave + ", herramientaPersona=" + herramientaPersona + '}';
    }

    
    
    
    

    public String getTipo_persona() {
        return tipo_persona;
    }

    public void setTipo_persona(String tipo_persona) {
        this.tipo_persona = tipo_persona;
    }
    
    
    
    
    
    
    
}
