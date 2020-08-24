/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufro.proyectoges.backend.herramientas;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import ufro.proyectoges.backend.connection.SqlHandler;
import ufro.proyectoges.backend.entidades.IPDPaciente;
import ufro.proyectoges.backend.entidades.Paciente;
import ufro.proyectoges.backend.entidades.Persona;
import ufro.proyectoges.backend.entidades.rut.Rut;
import ufro.proyectoges.vista.IPD;

/**
 *
 * @author shido
 */
public class Herramienta {

    protected SqlHandler sqlHandler;
    protected Statement statement;
    protected ResultSet queryResult;

    public SqlHandler handler = new SqlHandler("127.0.0.1", "ges");

    public List<Paciente> obtenerPacientes() {
        List<Paciente> pacientes = new ArrayList<>();
        try {
            queryResult = statement.executeQuery("SELECT * FROM paciente");
            while (queryResult.next()) {
                Paciente pacienteObt = new Paciente(queryResult.getString(2), new Rut(queryResult.getString(1)), queryResult.getInt(3));
                pacientes.add(pacienteObt);
            }
        } catch (SQLException sqe) {
            System.out.println("No se pudo ejecutar query");
        }
        return pacientes;
    }
    
    

    public Persona buscarPersona(Rut rut) {
        List<Persona> personasObtenidas = new ArrayList<>();
        try {
            queryResult = statement.executeQuery("SELECT * FROM personas WHERE id=" + rut.getRut());
            while (queryResult.next()) {
                personasObtenidas.add(new Persona(queryResult.getString(2), new Rut(queryResult.getString(1)), queryResult.getString(3), queryResult.getString(4)));
            }

            if (!personasObtenidas.isEmpty()) {
                return personasObtenidas.get(0);
            } else {
                return null;
            }

            //hecho asi por si despues guardamos una persona en mas de una tabla, no borrar
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean personaExiste(Persona p) {
        return buscarPersona(p.getRut()) != null;
    }

    public boolean descargarBasesDeDatos(Date inicio, Date termino) {

        return false;

    }

    public Paciente buscarPacientePorRut(Rut rut) {
        try {
            queryResult = statement.executeQuery("SELECT * FROM paciente WHERE rut=" + rut.getRut());
            while (queryResult.next()) {
                return new Paciente(queryResult.getString(2), new Rut(queryResult.getString(1)), queryResult.getInt(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Paciente buscarPacientePorFichaMed(int nroFicha) {
        try {
            queryResult = statement.executeQuery("SELECT * FROM paciente WHERE idIPD=" + nroFicha);
            while (queryResult.next()) {
                return new Paciente(queryResult.getString(2), new Rut(queryResult.getString(1)), queryResult.getInt(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Paciente buscarPacientePorNombre(String nombre) {
        try {
            queryResult = statement.executeQuery("SELECT * FROM paciente WHERE nombreCompleto=" + nombre);
            while (queryResult.next()) {
                return new Paciente(queryResult.getString(2), new Rut(queryResult.getString(1)), queryResult.getInt(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
