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
public class Monitor extends Persona{
    
    public Monitor(String nombre, Rut rut) {
        super(nombre, rut, "MONITOR");
        super.setTipo_persona("MONITOR");
    }
    
}
