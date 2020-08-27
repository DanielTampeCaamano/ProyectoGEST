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

    public HerramientaRegistrador() {
        sqlHandler = handler;

    }

    @Override
    public boolean descargarBasesDeDatos(Date inicio, Date termino) {

        return false;

    }

    @Override
    public Paciente buscarPacientePorNombre(String nombre) {
        try {
            queryResult = handler.selectFromWhere("*", "paciente", "nombreCompleto", nombre);
            while (queryResult.next()) {
                return new Paciente(queryResult.getString(2), new Rut(queryResult.getString(1)), buscarIPDporId(Integer.valueOf(queryResult.getString(1))));
            }
        } catch (SQLException e) {
        }
        return null;
    }

    @Override
    public Paciente buscarPacientePorFichaMed(int nroFicha) {
        try {
            queryResult = handler.selectFromWhere("*", "paciente", "idIPD", String.valueOf(nroFicha));
            while (queryResult.next()) {
                return new Paciente(queryResult.getString(2), new Rut(queryResult.getString(1)), buscarIPDporId(Integer.valueOf(queryResult.getString(1))));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

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

    @Override
    public boolean personaExiste(Persona p) {
        return buscarPersona(p.getRut()) != null;
    }

    @Override
    public Persona buscarPersona(Rut rut) {
        List<Persona> personasObtenidas = new ArrayList<>();
        try {
            queryResult = handler.selectFromWhere("*", "personas", "id", rut.getRut());
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

    @Override
    public void registrarMonitor(Monitor r) {

        sqlHandler.insertInto("personas", "(id,nombre,tipo_persona,clave)", "('" + r.getRut().getRut() + "','" + r.getNombre() + "','" + r.getTipo_persona() + "','" + r.getClave() + "')");
        sqlHandler.insertInto("monitor", "(identificacion,nombreCompleto)", "('" + r.getRut().getRut() + "','" + r.getNombre() + "')");

    }

    @Override
    public void registrarRegistrador(Registrador r) {

        sqlHandler.insertInto("personas", "(id,nombre,tipo_persona,clave)", "('" + r.getRut().getRut() + "','" + r.getNombre() + "','" + r.getTipo_persona() + "','" + r.getClave() + "')");
        sqlHandler.insertInto("registrador", "(id,nombre)", "('" + r.getRut().getRut() + "','" + r.getNombre() + "')");

    }

    @Override
    public void registrarPacientes(Paciente paciente) {

        if (paciente.getRutSinConvertir().isRutValido()) {
            sqlHandler.insertInto("personas", "(id,nombre,tipo_persona)", "('" + paciente.getRut().getRut() + "','" + paciente.getNombre() + "','" + paciente.getTipo_persona() + "')");
            sqlHandler.insertInto("paciente", "(rut,nombreCompleto)", "('" + paciente.getRut().getRut() + "','" + paciente.getNombre() + "')");
            registrarIPD(paciente.getIpdPaciente());
            //statement.executeUpdate("UPDATE paciente SET rut='"+paciente.getRutValidado()+"', nombreCompleto='"+paciente.getNombreCompleto()+"'");

        }
    }

    @Override
    public void registrarIPD(IPDPaciente ipd) {
        int ges = ipd.isEsGes() ? 1 : 0;
        int notificacionGes = ipd.isNotificacionPacienteGES() ? 1 : 0;
        int confirmado = ipd.isConfirmado() ? 1 : 0;
        int descartado = ipd.isDescartado() ? 1 : 0;
        int exceptuado = ipd.isExceptuado() ? 1 : 0;

        sqlHandler.insertInto("ipd",
                "(nombreCompletoPaciente, fechaInicio, fechaTermino, GES, notificacionPacienteGes,confirmado,descartado,exceptuado,observacion,rutPaciente,patologia)",
                "('" + ipd.getNombrePaciente() + "','" + ipd.getFechaInicio() + "','" + ipd.getFechaTermino() + "','" + ges + "','" + notificacionGes + "','" + confirmado + "','" + descartado + "','" + exceptuado + "','" + ipd.getObservacion() + "','" + ipd.getRutPaciente() + "','" + ipd.getCodigoPatologia() + "')");

    }

    @Override
    public IPDPaciente buscarIPDporId(int id) {
        try {
            ResultSet queryResult = sqlHandler.selectFromWhere("*", "ipd", "identificacion", String.valueOf(id));
            while (queryResult.next()) {
                return new IPDPaciente(queryResult.getString(1), queryResult.getString(2), queryResult.getDate(3), queryResult.getDate(4), queryResult.getInt(5) == 1, queryResult.getInt(6) == 1, queryResult.getInt(7) == 1, queryResult.getInt(8) == 1, queryResult.getInt(9) == 1, queryResult.getString(10), queryResult.getInt(12));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public int[] getIdPatologias() {
        int[] idPat = new int[obtenerPatologias().length];
        try {
            ResultSet queryResult = sqlHandler.selectFrom("*", "patologia");

            for (int i = 0; queryResult.next(); i++) {
                idPat[i] = queryResult.getInt(1);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return idPat;

    }

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

}
