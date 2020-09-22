/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufro.proyectoges.backend.herramientas;

import java.io.File;
import java.sql.Date;
import java.util.List;
import ufro.proyectoges.backend.entidades.IPDPaciente;
import ufro.proyectoges.backend.entidades.Monitor;
import ufro.proyectoges.backend.entidades.Paciente;
import ufro.proyectoges.backend.entidades.Persona;
import ufro.proyectoges.backend.entidades.Registrador;
import ufro.proyectoges.backend.entidades.rut.Rut;

/**
 * Clase que maneja los metodos de la clase Administrador
 *
 * @author shido
 */
public class HerramientaAdmin implements Herramienta {

    /**
     * Constructor de la clase HerramientaAdmin, sin parametros
     */
    public HerramientaAdmin() {

    }

    /**
     * no contiene implementaciones
     *
     * @deprecated
     * @param id Entero
     * @return objeto IPDPAciente
     */
    public IPDPaciente buscarIPDporRut(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * no contiene implementaciones
     *
     * @deprecated
     * @param inicio variable Date
     * @param termino Variable Date
     * @return .
     */
    public boolean descargarBasesDeDatos(Date inicio, Date termino) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * no contiene implementaciones
     *
     * @deprecated
     * @param nombre.
     * @return .
     */
    public Paciente buscarPacientePorNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * no contiene implementaciones
     *
     * @deprecated
     * @param rut.
     * @return .
     */
    public Paciente buscarPacientePorRut(Rut rut) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * no contiene implementaciones
     *
     * @deprecated
     * @param p.
     * @return .
     */
    public boolean personaExiste(Persona p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * no contiene implementaciones
     *
     *
     * @deprecated
     * @param rut.
     * @return .
     */
    @Override
    public Persona buscarPersona(Rut rut) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates. 

    }

    /**
     * no contiene implementaciones
     *
     * @deprecated
     * @return .
     */
    public List<Paciente> obtenerPacientes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * no contiene implementaciones
     *
     * @deprecated
     * @param r .
     */
    public void registrarMonitor(Monitor r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * no contiene implementaciones
     *
     * @deprecated
     * @param r .
     */
    public void registrarRegistrador(Registrador r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * no contiene implementaciones
     *
     * @deprecated
     * @param paciente .
     * @param registrador.
     */
    public boolean registrarPacientes(Paciente paciente, Registrador registrador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * no contiene implementaciones
     *
     * @deprecated
     * @param ipd .
     * @param registrador.
     */
    public void registrarIPD(IPDPaciente ipd, Registrador registrador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * no contiene implementaciones
     *
     * @deprecated
     * @return .
     */
    public String[] obtenerPatologias() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * no contiene implementaciones
     *
     * @deprecated
     * @param nombre.
     * @return .
     */
    @Override
    public int consultarIDPatologiaPorNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * no contiene implementaciones
     *
     * @deprecated
     * @param ipd.
     * @return .
     */
    @Override
    public Registrador obtenerRegistradorIPD(IPDPaciente ipd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * no contiene implementaciones
     *
     * @deprecated
     * @param paciente.
     * @param registrador.
     */
    @Override
    public void actualizarDatosPaciente(Paciente paciente, Registrador registrador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * no contiene implementaciones
     *
     * @deprecated
     * @param ipd.
     * @param registrador.
     */
    @Override
    public void actualizarDatosIpd(IPDPaciente ipd, Registrador registrador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * no contiene implementaciones
     *
     * @deprecated
     * @return .
     */
    @Override
    public int getLastIdPaciente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * no contiene implementaciones
     *
     * @deprecated
     * @param rut.
     * @return .
     */
    @Override
    public int getSecIdByRut(Rut rut) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean descargarBasesDeDatos(Date inicio, Date termino, File ruta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
