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
import ufro.proyectoges.backend.entidades.Monitor;
import ufro.proyectoges.backend.entidades.Paciente;
import ufro.proyectoges.backend.entidades.Persona;
import ufro.proyectoges.backend.entidades.Registrador;
import ufro.proyectoges.backend.entidades.rut.Rut;

/**
 *
 * @author shido
 */
public class HerramientaRegistrador extends Herramienta {
    
    private SqlHandler sqlHandler;
    private Statement statement;
    private ResultSet queryResult;

    public HerramientaRegistrador() {
        sqlHandler = handler;
        statement = sqlHandler.getStatement();
        
    }
    
    public boolean registrarMonitor(Monitor r){
        try{
            statement.executeUpdate("INSERT INTO personas (id,nombre,tipo_persona,clave) VALUES ('"+r.getRut().getRut()+"','"+r.getNombre()+"','"+r.getTipo_persona()+"','"+r.getClave()+"')");
            statement.executeUpdate("INSERT INTO monitor (identificacion,nombreCompleto) VALUES ('"+r.getRut().getRut()+"','"+r.getNombre()+"')");
            return true;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    
    
    public boolean registrarRegistrador(Registrador r){
        try{
            statement.executeUpdate("INSERT INTO personas (id,nombre,tipo_persona,clave) VALUES ('"+r.getRut().getRut()+"','"+r.getNombre()+"','"+r.getTipo_persona()+"','"+r.getClave()+"')");
            statement.executeUpdate("INSERT INTO registrador (id,nombre) VALUES ('"+r.getRut().getRut()+"','"+r.getNombre()+"')");
            return true;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    
    public List<Paciente> obtenerPacientes() {
        List<Paciente> pacientes = new ArrayList<>();
        try {
            queryResult = statement.executeQuery("SELECT * FROM paciente");
            while (queryResult.next()) {
                Paciente pacienteObt = new Paciente(queryResult.getString(2), new Rut(queryResult.getString(1)),queryResult.getInt(3));
                pacientes.add(pacienteObt);
            }
        } catch (SQLException sqe) {
            System.out.println("No se pudo ejecutar query");
        }
        return pacientes;
    }

    public boolean registrarPacientes(Paciente paciente) {
        try{
            if (paciente.getRutSinConvertir().isRutValido()){
                statement.executeLargeUpdate("INSERT INTO personas (id,nombre,tipo_persona) VALUES ('"+paciente.getRut().getRut()+"','"+paciente.getNombre()+"','"+paciente.getTipo_persona()+"')");
                statement.executeUpdate("INSERT INTO paciente (rut,nombreCompleto) VALUES ('"+paciente.getRutValidado()+"','"+paciente.getNombreCompleto()+"')");
                registrarIPD(paciente.getIpdPaciente());
                //statement.executeUpdate("UPDATE paciente SET rut='"+paciente.getRutValidado()+"', nombreCompleto='"+paciente.getNombreCompleto()+"'");
                return true;
            }
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
        return false;
    }
    
    public boolean registrarIPD(IPDPaciente ipd){
        int ges = ipd.isEsGes()? 1 : 0;
        int notificacionGes = ipd.isNotificacionPacienteGES()? 1 : 0;
        int confirmado = ipd.isConfirmado()? 1 : 0;
        int descartado = ipd.isDescartado()? 1 : 0;
        int exceptuado = ipd.isExceptuado()? 1 : 0;
        try {
            
            System.out.println("INSERT INTO ipd (nombreCompletoPaciente, fechaInicio, fechaTermino, GES, notificacionPacienteGes,confirmado,descartado,exceptuado,observacion,rutPaciente,patologia) "
                    + "VALUES ('" + ipd.getNombrePaciente() + "','" + ipd.getFechaInicio().getTime() + "','" + ipd.getFechaTermino().getTime() + "','" + ges + "','" + notificacionGes + "','" + confirmado + "','" + descartado + "','" + exceptuado + "','" + ipd.getObservacion() + "','" + ipd.getRutPaciente() + "','" + ipd.getCodigoPatologia() + "')");
            statement.executeUpdate("INSERT INTO ipd (nombreCompletoPaciente, fechaInicio, fechaTermino, GES, notificacionPacienteGes,confirmado,descartado,exceptuado,observacion,rutPaciente,patologia) "
                    + "VALUES ('" + ipd.getNombrePaciente() + "','" + ipd.getFechaInicio() + "','" + ipd.getFechaTermino() + "','" + ges + "','" + notificacionGes + "','" + confirmado + "','" + descartado + "','" + exceptuado + "','" + ipd.getObservacion() + "','" + ipd.getRutPaciente() + "','" + ipd.getCodigoPatologia() + "')");
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }


    @Override
    public boolean descargarBasesDeDatos(Date inicio, Date termino) {
        return false;
    }

    @Override
    public Persona buscarPersona(Rut rut) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean personaExiste(Persona p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Paciente buscarPacientePorRut(Rut rut) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Paciente buscarPacientePorFichaMed(int nroFicha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Paciente buscarPacientePorNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
