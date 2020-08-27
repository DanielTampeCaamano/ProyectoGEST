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

public class HerramientaLogIn implements Herramienta {

    public HerramientaLogIn() {

    }

    @Override
    public boolean descargarBasesDeDatos(Date inicio, Date termino) {
        JOptionPane.showMessageDialog(null, "Permisos insuficientes");
        return false;
    }

    @Override
    public Paciente buscarPacientePorNombre(String nombre) {
        JOptionPane.showMessageDialog(null, "Permisos insuficientes");
        return null;
    }

    

    @Override
    public Paciente buscarPacientePorRut(Rut rut) {
        JOptionPane.showMessageDialog(null, "Permisos insuficientes");
        return null;
    }

    @Override
    public boolean personaExiste(Persona p) {
        JOptionPane.showMessageDialog(null, "Permisos insuficientes");
        return false;
    }

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

    @Override
    public List<Paciente> obtenerPacientes() {
        JOptionPane.showMessageDialog(null, "Permisos insuficientes");
        return null;
    }

    @Override
    public void registrarMonitor(Monitor r) {
        JOptionPane.showMessageDialog(null, "Permisos insuficientes");
    }

    @Override
    public void registrarRegistrador(Registrador r) {
        JOptionPane.showMessageDialog(null, "Permisos insuficientes");
    }

    @Override
    public void registrarPacientes(Paciente paciente) {
        JOptionPane.showMessageDialog(null, "Permisos insuficientes");
    }

    @Override
    public void registrarIPD(IPDPaciente ipd) {
        JOptionPane.showMessageDialog(null, "Permisos insuficientes");
    }

    @Override
    public IPDPaciente buscarIPDporId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String[] obtenerPatologias() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int consultarIDPatologiaPorNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
