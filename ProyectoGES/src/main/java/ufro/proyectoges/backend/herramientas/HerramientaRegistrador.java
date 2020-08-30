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
public class HerramientaRegistrador implements Herramienta {

    private ResultSet queryResult;

    private final SqlHandler sqlHandler;

    /**
     *
     */
    public HerramientaRegistrador() {
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
            queryResult = handler.selectFromWhere("*", "paciente", "nombreCompleto", "'" + nombre + "'");
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
            queryResult = handler.selectFromWhere("*", "paciente", "rut", rut.getRut());
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
        try {
            queryResult = handler.selectFromWhere("*", "personas", "id", rut.getRut());
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
        List<Paciente> pacientes = new ArrayList<>();
        try {
            queryResult = handler.selectFrom("*", "paciente");
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

        sqlHandler.insertInto("personas", "(id,nombre,tipo_persona,clave)", "('" + r.getRut().getRut() + "','" + r.getNombre() + "','" + r.getTipo_persona() + "','" + r.getClave() + "')");
        sqlHandler.insertInto("monitor", "(identificacion,nombreCompleto)", "('" + r.getRut().getRut() + "','" + r.getNombre() + "')");

    }

    /**
     *
     * @param r
     */
    @Override
    public void registrarRegistrador(Registrador r) {

        sqlHandler.insertInto("personas", "(id,nombre,tipo_persona,clave)", "('" + r.getRut().getRut() + "','" + r.getNombre() + "','" + r.getTipo_persona() + "','" + r.getClave() + "')");
        sqlHandler.insertInto("registrador", "(id,nombre,clave)", "('" + r.getRut().getRut() + "','" + r.getNombre() + "','" + r.getClave() + "')");

    }

    /**
     *
     * @param paciente
     * @param registrador
     */
    @Override
    public void registrarPacientes(Paciente paciente, Registrador registrador) {

        if (paciente.getRutSinConvertir().isRutValido()) {
            sqlHandler.insertInto("personas", "(id,nombre,tipo_persona)", "('" + paciente.getRut().getRut() + "','" + paciente.getNombre() + "','" + paciente.getTipo_persona() + "')");
            sqlHandler.insertInto("paciente", "(rut,nombreCompleto)", "('" + paciente.getRut().getRut() + "','" + paciente.getNombre() + "')");
            registrarIPD(paciente.getIpdPaciente(), registrador);
            //statement.executeUpdate("UPDATE paciente SET rut='"+paciente.getRutValidado()+"', nombreCompleto='"+paciente.getNombreCompleto()+"'");

        }
    }

    /**
     *
     * @param ipd
     * @param registrador
     */
    @Override
    public void registrarIPD(IPDPaciente ipd, Registrador registrador) {
        int ges = ipd.isEsGes() ? 1 : 0;
        int notificacionGes = ipd.isNotificacionPacienteGES() ? 1 : 0;
        int confirmado = ipd.isConfirmado() ? 1 : 0;
        int descartado = ipd.isDescartado() ? 1 : 0;
        int exceptuado = ipd.isExceptuado() ? 1 : 0;
        if (ipd.getFechaTermino() != null) {
            sqlHandler.insertInto("ipd",
                    "(identificacion, nombreCompletoPaciente, fechaInicio, fechaTermino, GES, notificacionPacienteGes,confirmado,descartado,exceptuado,observacion,patologia,registrador,fechaIngreso)",
                    "('" + ipd.getRutPaciente() + "','" + ipd.getNombrePaciente() + "','" + ipd.getFechaInicio() + "','" + ipd.getFechaTermino() + "','" + ges + "','" + notificacionGes + "','" + confirmado + "','" + descartado + "','" + exceptuado + "','" + ipd.getObservacion() + "','" + ipd.getCodigoPatologia() + "','" + registrador.getRut().getRut() + "','" + ipd.getFechaDeGuardado() + "')");
        } else {
            sqlHandler.insertInto("ipd",
                    "(identificacion,nombreCompletoPaciente, fechaInicio, GES, notificacionPacienteGes,confirmado,descartado,exceptuado,observacion,patologia,registrador,fechaIngreso)",
                    "('" + ipd.getRutPaciente() + "','" + ipd.getNombrePaciente() + "','" + ipd.getFechaInicio() + "','" + ges + "','" + notificacionGes + "','" + confirmado + "','" + descartado + "','" + exceptuado + "','" + ipd.getObservacion() + "','" + ipd.getCodigoPatologia() + "','" + registrador.getRut().getRut() + "','" + ipd.getFechaDeGuardado() + "')");
        }

    }

    /**
     *
     *
     */
    @Override
    public IPDPaciente buscarIPDporId(int id) {
        try {
            ResultSet queryResult = sqlHandler.selectFromWhere("*", "ipd", "identificacion", String.valueOf(id));
            while (queryResult.next()) {
                return new IPDPaciente(queryResult.getString(1), queryResult.getString(2), queryResult.getDate(3), queryResult.getDate(4), queryResult.getInt(5) == 1, queryResult.getInt(6) == 1, queryResult.getInt(7) == 1, queryResult.getInt(8) == 1, queryResult.getInt(9) == 1, queryResult.getString(10), queryResult.getString(11), queryResult.getString(12), queryResult.getDate(13));
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
    public String[] obtenerPatologias() {
        List<String> patologiasGuardadas = new ArrayList<>();
        try {
            ResultSet queryResult = sqlHandler.selectFrom("*", "patologia");

            while (queryResult.next()) {
                patologiasGuardadas.add(queryResult.getString(2));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        String[] patToString = new String[patologiasGuardadas.size()];

        for (int i = 0; i < patologiasGuardadas.size(); i++) {
            patToString[i] = patologiasGuardadas.get(i);
        }
        return patToString;
    }

    /**
     *
     * @param nombre
     * @return
     */
    @Override
    public int consultarIDPatologiaPorNombre(String nombre) {

        try {
            queryResult = sqlHandler.selectFromWhere("identificacion", "patologia", "nombrePatologia", nombre);
            while (queryResult.next()) {
                return queryResult.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    /**
     *
     * @param ipd
     * @return
     */
    @Override
    public Registrador obtenerRegistradorIPD(IPDPaciente ipd) {

        queryResult = sqlHandler.selectFromWhere("*", "registrador", "id", ipd.getIdRegistrador());

        try {
            while (queryResult.next()) {
                return new Registrador(queryResult.getString(2), new Rut(queryResult.getString(1)), queryResult.getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
