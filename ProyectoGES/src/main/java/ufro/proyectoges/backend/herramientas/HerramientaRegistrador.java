/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufro.proyectoges.backend.herramientas;

import java.sql.Date;
import java.util.List;
import ufro.proyectoges.backend.entidades.Paciente;

/**
 *
 * @author shido
 */
public class HerramientaRegistrador implements Herramienta{
    
    

    @Override
    public List<Paciente> obtenerPacientes() {
        return null;
    }

    @Override
    public boolean registrarPacientes() {
        return false;
    }

    @Override
    public boolean descargarBasesDeDatos(Date inicio, Date termino) {
        return false;
    }
    
}
