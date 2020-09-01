/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufro.proyectoges.backend.entidades;

import ufro.proyectoges.backend.entidades.rut.Rut;
import ufro.proyectoges.backend.herramientas.HerramientaAdmin;

/**
 * Clase Aministrador, implementacion pendiente
 *
 * @author shido
 */
public class Administrador extends Persona {

    /**
     * Este es el constructor de la clase Administrador, su implementacion esta
     * pendiente
     *
     * @param id ID del administrador
     * @param nombre Nombre del administrador, recibe un String
     * @param rut Rut del administrador, recibe un objeto clase Rut
     * @param clave Clave del administrador, recibe un String
     */
    public Administrador(int id, String nombre, Rut rut, String clave) {
        super(id, nombre, rut, "ADMINISTRADOR", clave);
        super.setTipo_persona("ADMINISTRADOR");
        super.setHerramientaPersona(new HerramientaAdmin());
    }

}
