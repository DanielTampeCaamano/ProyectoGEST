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
import ufro.proyectoges.backend.entidades.Monitor;
import ufro.proyectoges.backend.entidades.Paciente;
import ufro.proyectoges.backend.entidades.Registrador;
import ufro.proyectoges.backend.entidades.rut.Rut;

/**
 *
 * @author shido
 */
public class HerramientaRegistrador implements Herramienta {
    
    private SqlHandler sqlHandler;
    private Statement statement;
    private ResultSet queryResult;

    public HerramientaRegistrador() {
        sqlHandler = Herramienta.handler;
        statement = sqlHandler.getStatement();
        
    }
    
    public boolean registrarMonitor(Monitor r){
        try{
            statement.executeUpdate("INSERT INTO personas (id,nombre,tipo_persona) VALUES ('"+r.getRut().getRut()+"','"+r.getNombre()+"','"+r.getTipo_persona()+"')");
            statement.executeUpdate("INSERT INTO monitor (identificacion,nombreCompleto) VALUES ('"+r.getRut().getRut()+"','"+r.getNombre()+"')");
            return true;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    
    
    
    
    public boolean registrarRegistrador(Registrador r){
        try{
            statement.executeUpdate("INSERT INTO personas (id,nombre,tipo_persona) VALUES ('"+r.getRut().getRut()+"','"+r.getNombre()+"','"+r.getTipo_persona()+"')");
            statement.executeUpdate("INSERT INTO registrador (id,nombre) VALUES ('"+r.getRut().getRut()+"','"+r.getNombre()+"')");
            return true;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
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
    public boolean registrarPacientes(Paciente paciente) {
        try{
            if (paciente.getRutSinConvertir().isRutValido()){
                statement.executeLargeUpdate("INSERT INTO personas (id,nombre,tipo_persona) VALUES ('"+paciente.getRut().getRut()+"','"+paciente.getNombre()+"','"+paciente.getTipo_persona()+"')");
                statement.executeUpdate("INSERT INTO paciente (rut,nombreCompleto) VALUES ('"+paciente.getRutValidado()+"','"+paciente.getNombreCompleto()+"')");
                //statement.executeUpdate("UPDATE paciente SET rut='"+paciente.getRutValidado()+"', nombreCompleto='"+paciente.getNombreCompleto()+"'");
                return true;
            }
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
        return false;
    }

    @Override
    public boolean descargarBasesDeDatos(Date inicio, Date termino) {
        return false;
    }

}
