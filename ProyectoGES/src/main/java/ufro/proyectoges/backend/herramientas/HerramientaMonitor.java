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
 * @author shido
 */
public class HerramientaMonitor implements Herramienta {

    private SqlHandler sqlHandler;

    /**
     * Constructor de la clase HerramientaMonitor
     */
    public HerramientaMonitor() {
        sqlHandler = handler;
    }

    /**
     * Metodo que venia con la implementacion de la interfaz Herramienta, aqui no hace nada
     * @param inicio Recibe una variable de tipo Date
     * @param termino Recibe una variable de tipo Date
     * @return Debiera retornar un boolean, aqui solo retorna falso
     */
    @Override
    public boolean descargarBasesDeDatos(Date inicio, Date termino) {
        return false;
    }

    /**
     * Metodo que venia con la implementacion de la interfaz Herramienta, Se utiliza para buscar paciente por nombre
     * @param nombre Recibe una variable String, que hace alusion al nombre del paciente que se pretende buscar
     * @return Retorna un objeto de clase Paciente, que contiene los datos del paciente que se pretende buscar
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
     * Metodo que venia con la implementacion de la interfaz Herramienta, aqui se utiliza para buscar un paciente atraves del rut
     * @param rut Recibe un objeto de tipo Rut
     * @return Retorna un objeto de clase Paciente, que contiene los datos del paciente que se busco
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
     * Metodo que venia con la implementacion de la interfaz Herramienta, verifica si la persona existe
     * @param p Recibe un objeto de tipo Persona, que contiene los datos de la persona a verificar
     * @return Retorna si la persona existe 
     */
    @Override
    public boolean personaExiste(Persona p) {
        return buscarPersona(p.getRut()) != null;
    }

    /**
     * Metodo que venia con la implementacion de la interfaz Herramienta, sirve para buscar una persona por el rut
     * @param rut Recibe un objeto de clase Rut, que contiene el rut de la persona a buscar
     * @return Retorna un objeto de clase Persona que contiene los datos de la persona buscada
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
     * Metodo que venia con la implementacion de la interfaz Herramienta, obtiene una lista de pacientes de la base de datos
     * @return Retorna una lista de objetos de clase de Paciente
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
     * Metodo que venia con la implementacion de la interfaz Herramienta, aqui no hace nada
     * @param r Recibe un objeto de tipo Monitor
     */
    @Override
    public void registrarMonitor(Monitor r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Metodo que venia con la implementacion de la interfaz Herramienta, aqui no hace nada
     * @param r Recibe un objeto de clase Registrador
     */
    @Override
    public void registrarRegistrador(Registrador r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Metodo que venia con la implementacion de la interfaz Herramienta, aqui no hace nada
     * @param id Recibe un parametro de tipo entero que contiene el id del IPD del paciente
     * @return Debiera retornar un objeto de clase IPDPaciente, aqui no retorna nada
     */
    @Override
    public IPDPaciente buscarIPDporId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Metodo que venia con la implementacion de la interfaz Herramienta, aqui no hace nada
     * @return No retorna nada
     */
    @Override
    public String[] obtenerPatologias() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Metodo que venia con la implementacion de la interfaz Herramienta, aqui no hace nada
     * @param nombre Recibe un parametro de tipo String
     * @return No retorna nada
     */
    @Override
    public int consultarIDPatologiaPorNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Metodo que venia con la implementacion de la interfaz Herramienta, aqui no hace nada
     * @param paciente Recibe un parametro de de clase Paciente
     * @param registrador Recibe un parametro de clase Registrador
     */
    @Override
    public void registrarPacientes(Paciente paciente, Registrador registrador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Metodo que venia con la implementacion de la interfaz Herramienta, aqui no hace nada
     * @param ipd Recibe un parametro de clase IPDPaciente
     * @param registrador Recibe un parametro de clase Registrador
     */
    @Override
    public void registrarIPD(IPDPaciente ipd, Registrador registrador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Metodo que venia con la implementacion de la interfaz Herramienta, aqui no hace nada
     * @param ipd Recibe un parametro de clase IPDPaciente
     * @return No retorna nada
     */
    @Override
    public Registrador obtenerRegistradorIPD(IPDPaciente ipd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
