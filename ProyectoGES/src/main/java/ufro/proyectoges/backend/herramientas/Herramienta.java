/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufro.proyectoges.backend.herramientas;

import java.sql.Date;
import java.util.List;
import ufro.proyectoges.backend.connection.SqlHandler;
import ufro.proyectoges.backend.entidades.IPDPaciente;
import ufro.proyectoges.backend.entidades.Monitor;
import ufro.proyectoges.backend.entidades.Paciente;
import ufro.proyectoges.backend.entidades.Persona;
import ufro.proyectoges.backend.entidades.Registrador;
import ufro.proyectoges.backend.entidades.rut.Rut;

public interface Herramienta {

    public SqlHandler handler = new SqlHandler("127.0.0.1", "ges");
    
    public abstract IPDPaciente buscarIPDporId(int id);
    
    public abstract boolean descargarBasesDeDatos(Date inicio, Date termino);
    
    public abstract Paciente buscarPacientePorNombre(String nombre);
    
    
    public abstract Paciente buscarPacientePorRut(Rut rut);
    
    public abstract boolean personaExiste(Persona p);
    
    public abstract Persona buscarPersona(Rut rut);
    
    public abstract List<Paciente> obtenerPacientes();

    public abstract void registrarMonitor(Monitor r);

    public abstract void  registrarRegistrador(Registrador r);

    public abstract void registrarPacientes(Paciente paciente);

    public abstract void registrarIPD(IPDPaciente ipd);
    
    public abstract String[] obtenerPatologias();
    
    public abstract int consultarIDPatologiaPorNombre(String nombre);

}
