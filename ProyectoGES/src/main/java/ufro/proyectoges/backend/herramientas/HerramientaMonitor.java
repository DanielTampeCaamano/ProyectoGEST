/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufro.proyectoges.backend.herramientas;

import java.io.IOException;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import ufro.proyectoges.backend.connection.SqlHandler;
import ufro.proyectoges.backend.entidades.IPDPaciente;
import ufro.proyectoges.backend.entidades.Monitor;
import ufro.proyectoges.backend.entidades.Paciente;
import ufro.proyectoges.backend.entidades.Persona;
import ufro.proyectoges.backend.entidades.Registrador;
import ufro.proyectoges.backend.entidades.rut.Rut;

/**
 * Clase encargada de manejar los metodos que usa la entidad Monitor
 *
 * @author shido
 */
public class HerramientaMonitor implements Herramienta {

    private SqlHandler sqlHandler;

    /**
     *
     */
    public HerramientaMonitor() {
        sqlHandler = handler;
    }

    /**
     *
     * @param inicio
     * @param termino
     * @return
     */
    @Override
    public boolean descargarBasesDeDatos(Date inicio, Date termino) {
        return false;
    }

    /**
     *
     * @param nombre
     * @return
     */
    @Override
    public Paciente buscarPacientePorNombre(String nombre) {
        try {
            ResultSet queryResult = handler.selectFromWhere("*", "paciente", "nombreCompleto", nombre);
            while (queryResult.next()) {
                return new Paciente(queryResult.getString(2), new Rut(queryResult.getString(1)), buscarIPDporId(Integer.valueOf(queryResult.getString(1))));
            }
        } catch (SQLException e) {
        }
        return null;
    }

    /**
     *
     * @param rut
     * @return
     */
    @Override
    public Paciente buscarPacientePorRut(Rut rut) {
        try {
            ResultSet queryResult = handler.selectFromWhere("*", "paciente", "rut", rut.getRut());
            while (queryResult.next()) {
                return new Paciente(queryResult.getString(2), new Rut(queryResult.getString(1)), buscarIPDporId(Integer.valueOf(queryResult.getString(1))));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     *
     * @param p
     * @return
     */
    @Override
    public boolean personaExiste(Persona p) {
        return buscarPersona(p.getRut()) != null;
    }

    /**
     *
     * @param rut
     * @return
     */
    @Override
    public Persona buscarPersona(Rut rut) {
        List<Persona> personasObtenidas = new ArrayList<>();
        try {
            ResultSet queryResult = handler.selectFromWhere("*", "personas", "id", rut.getRut());
            while (queryResult.next()) {
                personasObtenidas.add(new Persona(queryResult.getString(2), new Rut(queryResult.getString(1)), queryResult.getString(3), queryResult.getString(4)));
            }

            if (!personasObtenidas.isEmpty()) {
                return personasObtenidas.get(0);
            } else {
                return null;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     *
     * @return
     */
    @Override
    public List<Paciente> obtenerPacientes() {
        List<Paciente> pacientes = new ArrayList<>();
        try {
            ResultSet queryResult = handler.selectFrom("*", "paciente");
            while (queryResult.next()) {
                Paciente pacienteObt = new Paciente(queryResult.getString(2), new Rut(queryResult.getString(1)), buscarIPDporId(Integer.valueOf(queryResult.getString(1))));
                pacientes.add(pacienteObt);
            }
        } catch (SQLException sqe) {
            System.out.println("No se pudo ejecutar query");
        }
        return pacientes;
    }

    /**
     *
     * @param r
     */
    @Override
    public void registrarMonitor(Monitor r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param r
     */
    @Override
    public void registrarRegistrador(Registrador r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
