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

    /**
     *
     * @param nombre
     * @param rut
     * @param tipo_persona
     * @param clave
     */
    public Persona(String nombre, Rut rut, String tipo_persona, String clave) {
        this.nombre = nombre;
        this.rut = rut;
        this.tipo_persona = tipo_persona;
        this.clave = clave;
    }

    /**
     *
     * @return
     */
    public Herramienta getHerramientaPersona() {
        return herramientaPersona;
    }

    /**
     *
     * @param herramientaPersona
     */
    public void setHerramientaPersona(Herramienta herramientaPersona) {
        this.herramientaPersona = herramientaPersona;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @return
     */
    public Rut getRut() {
        return rut;
    }

    /**
     *
     * @return
     */
    public String getClave() {
        return clave;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", rut=" + rut + ", tipo_persona=" + tipo_persona + ", clave=" + clave + ", herramientaPersona=" + herramientaPersona + '}';
    }

    /**
     *
     * @return
     */
    public String getTipo_persona() {
        return tipo_persona;
    }

    /**
     *
     * @param tipo_persona
     */
    public void setTipo_persona(String tipo_persona) {
        this.tipo_persona = tipo_persona;
    }

}
