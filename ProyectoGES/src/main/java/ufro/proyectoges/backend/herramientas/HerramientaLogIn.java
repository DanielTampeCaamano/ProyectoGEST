/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufro.proyectoges.backend.herramientas;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import ufro.proyectoges.backend.entidades.IPDPaciente;
import ufro.proyectoges.backend.entidades.Monitor;
import ufro.proyectoges.backend.entidades.Paciente;
import ufro.proyectoges.backend.entidades.Persona;
import ufro.proyectoges.backend.entidades.Registrador;
import ufro.proyectoges.backend.entidades.rut.Rut;
import static ufro.proyectoges.backend.herramientas.Herramienta.handler;
/**
 * Clase que se encarga de manejar los metodos para el Login del Programa
 * @author Roald
 */
public class HerramientaLogIn implements Herramienta {
/**
 * 
 */
    public HerramientaLogIn() {

    }
/**
 * 
 * @param inicio
 * @param termino
 * @return 
 */
    @Override
    public boolean descargarBasesDeDatos(Date inicio, Date termino) {
        JOptionPane.showMessageDialog(null, "Permisos insuficientes");
        return false;
    }
/**
 * 
 * @param nombre
 * @return 
 */
    @Override
    public Paciente buscarPacientePorNombre(String nombre) {
        JOptionPane.showMessageDialog(null, "Permisos insuficientes");
        return null;
    }
/**
 * 
 * @param rut
 * @return 
 */
    @Override
    public Paciente buscarPacientePorRut(Rut rut) {
        JOptionPane.showMessageDialog(null, "Permisos insuficientes");
        return null;
    }
/**
 * 
 * @param p
 * @return 
 */
    @Override
    public boolean personaExiste(Persona p) {
        JOptionPane.showMessageDialog(null, "Permisos insuficientes");
        return false;
    }
/**
 * 
 * @param rut
 * @return 
 */
    @Override
    public Persona buscarPersona(Rut rut) {
        try {
            ResultSet queryResult = handler.selectFromWhere("*", "personas", "id", rut.getRut());
            while (queryResult.next()) {
                return new Persona(queryResult.getString(2), new Rut(queryResult.getString(1)), queryResult.getString(3), queryResult.getString(4));
            }

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return null;
    }
/**
 * 
 * @return 
 */
    @Override
    public List<Paciente> obtenerPacientes() {
        JOptionPane.showMessageDialog(null, "Permisos insuficientes");
        return null;
    }
/**
 * 
 * @param r 
 */
    @Override
    public void registrarMonitor(Monitor r) {
        JOptionPane.showMessageDialog(null, "Permisos insuficientes");
    }
/**
 * 
 * @param r 
 */
    @Override
    public void registrarRegistrador(Registrador r) {
        JOptionPane.showMessageDialog(null, "Permisos insuficientes");
    }

    
/**
 * 
 * @param id
 * @return 
 */
    @Override
    public IPDPaciente buscarIPDporId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
/**
 * 
 * @return 
 */
    @Override
    public String[] obtenerPatologias() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
/**
 * 
 * @param nombre
 * @return 
 */
    @Override
    public int consultarIDPatologiaPorNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
/**
 * 
 * @param paciente
 * @param registrador 
 */
    @Override
    public void registrarPacientes(Paciente paciente, Registrador registrador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
/**
 * 
 * @param ipd
 * @param registrador 
 */
    @Override
    public void registrarIPD(IPDPaciente ipd, Registrador registrador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
/**
 * 
 * @param ipd
 * @return 
 */
    @Override
    public Registrador obtenerRegistradorIPD(IPDPaciente ipd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
