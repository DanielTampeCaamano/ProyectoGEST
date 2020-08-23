/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufro.proyectoges.backend.herramientas;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import ufro.proyectoges.backend.connection.SqlHandler;
import ufro.proyectoges.backend.entidades.Paciente;
import ufro.proyectoges.backend.entidades.rut.Rut;

/**
 *
 * @author shido
 */
public class HerramientaMonitor implements Herramienta {

    private ObjectMapper mapper;
    private SqlHandler sqlHandler;
    private Statement statement;
    private ResultSet queryResult;

    public HerramientaMonitor() {
        sqlHandler = Herramienta.handler;
        statement = sqlHandler.getStatement();
    }

    @Override
    public List<Paciente> obtenerPacientes() {
        List<Paciente> pacientes = new ArrayList<>();
        try {
            queryResult = statement.executeQuery("SELECT * FROM paciente");
            while (queryResult.next()) {
                Paciente pacienteObt = new Paciente(queryResult.getString(2), new Rut(queryResult.getString(1)));
                pacientes.add(pacienteObt);
            }
        } catch (SQLException sqe) {
            System.out.println("No se pudo ejecutar query");
        }
        return pacientes;
    }

    @Override
    public boolean registrarPacientes() {
        JOptionPane.showMessageDialog(null, "Usted no posee permiso para esta accion", "Permisos Insuficientes", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    @Override
    public boolean descargarBasesDeDatos(Date inicio, Date termino) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
