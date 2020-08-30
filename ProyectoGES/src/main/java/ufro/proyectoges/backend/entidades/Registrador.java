/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufro.proyectoges.backend.entidades;

import ufro.proyectoges.backend.entidades.rut.Rut;
import ufro.proyectoges.backend.herramientas.HerramientaRegistrador;

/**
 *
 * @author shido
 */
public class Registrador extends Persona {

    /**
     *
     * @param nombre
     * @param rut
     * @param clave
     */
    public Registrador(String nombre, Rut rut, String clave) {
        super(nombre, rut, "REGISTRADOR", clave);
        super.setTipo_persona("REGISTRADOR");
        super.setHerramientaPersona(new HerramientaRegistrador());
    }

}
