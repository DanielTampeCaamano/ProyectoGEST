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
 * Clase que maneja las funciones del registrador
 * @author shido
 */
public class HerramientaRegistrador implements Herramienta {

    private ResultSet queryResult;

    private final SqlHandler sqlHandler;

    /**
     * Constructor de HerramientaRegistrador
     */
    public HerramientaRegistrador() {
        sqlHandler = handler;

    }

    /**
     * Metodo que venia con la implementacion de la interfaz Herramienta, aqui no hace nada
     * @param inicio Recibe un paremetro de tipo Date
     * @param termino Recibe un parametro de tipo Date
     * @return No retorna nada
     */
    @Override
    public boolean descargarBasesDeDatos(Date inicio, Date termino) {

        return false;

    }

    /**
     * Metodo que venia con la implementacion de la interfaz Herramienta, Busca un paciente por nombre
     * @param nombre Recibe un parametro de tipo String
     * @return Retorna un objeto de clase Paciente, que contiene los datos del paciente buscado
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
     * Metodo que venia con la implementacion de la interfaz Herramienta, este metodo busca a un paciente en la base de datos mediante el rut
     * @param rut Recibe un objeto de clase Rut, que hace alusion al rut del paciente
     * @return Retorna un objeto de clase Paciente, que contiene los datos del paciente
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
     * Metodo que venia con la implementacion de la interfaz Herramienta, este metodo verifica la existencia de la persona en la base de datos
     * @param p Recibe un objeto de clase Persona , que hace alusion a la persona que se pretende buscar
     * @return Retorna un valor booleano que indica si la persona existe en la base de datos
     */
    @Override
    public boolean personaExiste(Persona p) {
        return buscarPersona(p.getRut()) != null;
    }

    /**
     * Metodo que venia con la implementacion de la interfaz Herramienta, este metodo busca a una persona en la base de datos mediante el rut
     * @param rut Recibe un objeto de clase Rut
     * @return Retorna un objeto de clase Persona, que contiene los datos de la persona buscada
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
     * Metodo que venia con la implementacion de la interfaz Herramienta, este metodo recupera de la base de datos la tabla de los pacientes
     * @return Retorna una lista de objetos de clase Paciente, que contiene los datos de los pacientes almacenados en la base de datos
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
     * Metodo que venia con la implementacion de la interfaz Herramienta, Este metodo registra un Monitor en la base de datos
     * @param r Recibe un objeto de clase Monitor
     */
    @Override
    public void registrarMonitor(Monitor r) {

        sqlHandler.insertInto("personas", "(id,nombre,tipo_persona,clave)", "('" + r.getRut().getRut() + "','" + r.getNombre() + "','" + r.getTipo_persona() + "','" + r.getClave() + "')");
        sqlHandler.insertInto("monitor", "(identificacion,nombreCompleto)", "('" + r.getRut().getRut() + "','" + r.getNombre() + "')");

    }

    /**
     * Metodo que venia con la implementacion de la interfaz Herramienta, Este metodo registra un Registrador en la base de datos
     * @param r Recibe un objeto de clase Registrador
     */
    @Override
    public void registrarRegistrador(Registrador r) {

        sqlHandler.insertInto("personas", "(id,nombre,tipo_persona,clave)", "('" + r.getRut().getRut() + "','" + r.getNombre() + "','" + r.getTipo_persona() + "','" + r.getClave() + "')");
        sqlHandler.insertInto("registrador", "(id,nombre,clave)", "('" + r.getRut().getRut() + "','" + r.getNombre() + "','" + r.getClave() + "')");

    }

    /**
     * Metodo que venia con la implementacion de la interfaz Herramienta, Este metodo registra un paciente a la base de datos
     * @param paciente Recibe un objeto de clase Paciente, que hace alusion a los datos del paciente que se va a ingresar en la base de datos
     * @param registrador Recibe un objeto de clase Registrador, que hace alusion al registrador que ingreso al paciente ne la base de datos
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
     * Metodo que venia con la implementacion de la interfaz Herramienta, este metodo registra el IPD del paciente en la base de datos
     * @param ipd Recibe un objeto de clase IPDPaciente, que hace alusion al IPD del paciente
     * @param registrador Recibe un objeto de clase Registrador, que hace alusion al registrador que ingresa el IPD del paciente
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
     * Metodo que venia con la implementacion de la interfaz Herramienta, Este metodo busca el ipd del paciente en la base de datos mediante el ID
     * @param id Recibe una variable de tipo entero
     * @return Retorna un objeto de clase IPDPaciente, que contiene los datos del IPD del paciente
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
     * Metodo que venia con la implementacion de la interfaz Herramienta, este metodo recupera las patologias de la base de datos
     * @return Retorna un arreglo de String que contiene las patologias
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
     * Metodo que venia con la implementacion de la interfaz Herramienta, este metodo consulta el ID de la patologia por nombre
     * @param nombre Recibe una variable de tipo String, que contiene el nombre de la patologia
     * @return Retorna un entero que contiene el ID de la patologia consultada
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
     * Metodo que venia con la implementacion de la interfaz Herramienta, este metodo permite obtener el Registrador que ingreso el IPD del paciente
     * @param ipd Recibe un objeto de clase IPDPaciente, que contiene los datos del IPD del paciente
     * @return Retorna un objeto de clase Registrador que contiene los datos del registrador que ingreso el IPD del paciente
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
