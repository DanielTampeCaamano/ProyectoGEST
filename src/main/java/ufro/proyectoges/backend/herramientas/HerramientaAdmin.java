/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufro.proyectoges.backend.herramientas;

import java.io.File;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import ufro.proyectoges.backend.connection.SqlHandler;
import ufro.proyectoges.backend.entidades.IPDPaciente;
import ufro.proyectoges.backend.entidades.Monitor;
import ufro.proyectoges.backend.entidades.Paciente;
import ufro.proyectoges.backend.entidades.Persona;
import ufro.proyectoges.backend.entidades.Registrador;
import ufro.proyectoges.backend.entidades.rut.Rut;
import static ufro.proyectoges.backend.herramientas.Herramienta.handler;

/**
 * Clase que maneja los metodos de la clase Administrador
 *
 * @author shido
 */
public class HerramientaAdmin implements Herramienta {

    private ResultSet queryResult;

    private static final SqlHandler sqlHandler = handler;

    /**
     * Constructor de la clase HerramientaAdmin, sin parametros
     */
    public HerramientaAdmin() {

    }

    /**
     * no contiene implementaciones
     *
     * @deprecated
     * @param id Entero
     * @return objeto IPDPAciente
     */
    public IPDPaciente buscarIPDporRut(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * no contiene implementaciones
     *
     * @deprecated
     * @param inicio variable Date
     * @param termino Variable Date
     * @return .
     */
    public boolean descargarBasesDeDatos(Date inicio, Date termino) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * no contiene implementaciones
     *
     * @deprecated
     * @param nombre.
     * @return .
     */
    public Paciente buscarPacientePorNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * no contiene implementaciones
     *
     * @deprecated
     * @param rut.
     * @return .
     */
    public Paciente buscarPacientePorRut(Rut rut) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * no contiene implementaciones
     *
     * @deprecated
     * @param p.
     * @return .
     */
    public boolean personaExiste(Persona p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * no contiene implementaciones
     *
     *
     * @deprecated
     * @param rut.
     * @return .
     */
    @Override
    public Persona buscarPersona(Rut rut) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates. 

    }

    /**
     * no contiene implementaciones
     *
     * @deprecated
     * @return .
     */
    @Override
    public List<Paciente> obtenerPacientes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Este metodo se encarga de ingresar un nuevo Monitor al sistema
     *
     * @param monitor Este parametro entrega la informacion que se ingresara,
     * mediante un objeto de clase Monitor
     */
    @Override
    public void registrarMonitor(Monitor monitor) {
        sqlHandler.insertInto(
                "monitor",
                "(id,nombre,clave,secondary_id)",
                "('" + monitor.getRut().getRut()
                + "','" + monitor.getNombre()
                + "'," + monitor.getClave()
                + "','1'" + ")");
        sqlHandler.insertInto(
                "personas",
                "(id,nombre,tipo_persona,clave,secondary_id)",
                "('" + monitor.getRut().getRut()
                + "','" + monitor.getNombre()
                + "','" + monitor.getTipo_persona()
                + "','" + monitor.getClave()
                + "','1'" + ")");
    }

    /**
     * Este metodo ingresa un Registrador al sistema
     *
     * @param registrador Este parametro entrega los datos que se ingresaran al
     * sistema, mediante un objeto de clase Registrador
     */
    @Override
    public void registrarRegistrador(Registrador registrador) {
        sqlHandler.insertInto(
                "registrador",
                "(id,nombre,clave,secondary_id)",
                "('" + registrador.getRut().getRut()
                + "','" + registrador.getNombre()
                + "'," + registrador.getClave()
                + "','1'" + ")");
        sqlHandler.insertInto(
                "personas",
                "(id,nombre,tipo_persona,clave,secondary_id)",
                "('" + registrador.getRut().getRut()
                + "','" + registrador.getNombre()
                + "','" + registrador.getTipo_persona()
                + "','" + registrador.getClave()
                + "','1'" + ")");
    }

    /**
     * Este metodo obtiene los nombres de los monitores
     *
     * @return Retorna un vector que contiene la lista de los nombres de los
     * monitores
     */
    public String[] obtenerMonitores() {
        List<Monitor> monitores = new ArrayList<>();
        try {
            queryResult = handler.selectFrom("*", "monitor");
            while (queryResult.next()) {
                Monitor monitorObt = new Monitor(queryResult.getInt(1),
                        queryResult.getString(2),
                        new Rut(queryResult.getString(1)),
                        queryResult.getString(3));
                monitores.add(monitorObt);
            }
        } catch (SQLException sqe) {
            System.out.println("No se pudo ejecutar query");
        }
        String[] listaMonitores = new String[monitores.size()];
        for (int i = 0; i < listaMonitores.length; i++) {
            listaMonitores[i] = monitores.get(i).getNombre();
        }
        return listaMonitores;
    }

    /**
     * Este metodo recupera la lista de monitores con todos sus datos
     *
     * @return Retrona una List que contiene los datos de los monitores para que
     * sean utilizados mas tarde
     */
    @Override
    public List<Monitor> obtenerListaMonitores() {
        List<Monitor> monitores = new ArrayList<>();
        try {
            queryResult = handler.selectFromWhere("*", "personas", "tipo_persona", "MONITOR");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return monitores;
    }

    /**
     * Este metodo entrega una lista de nombres de los registradores
     *
     * @return Retorna un vector que contiene los nombes de los registradores
     */
    @Override
    public String[] obtenerRegistradores() {
        List<Registrador> registradores = new ArrayList<>();
        try {
            queryResult = handler.selectFrom("*", "registrador");
            while (queryResult.next()) {
                Registrador registradorObj = new Registrador(queryResult.getInt(1),
                        queryResult.getString(2),
                        new Rut(queryResult.getString(1)),
                        queryResult.getString(3));
                registradores.add(registradorObj);
            }
        } catch (SQLException sqe) {
            System.out.println("No se pudo ejecutar query");
        }
        String[] listaRegistradores = new String[registradores.size()];
        for (int i = 0; i < listaRegistradores.length; i++) {
            listaRegistradores[i] = registradores.get(i).getNombre();
        }
        return listaRegistradores;
    }

    /**
     * Este metodo recupera la informacion de los registradores con todos sus
     * datos
     *
     * @return Retorna una List que contiene los datos de los registradores
     */
    @Override
    public List<Registrador> obtenerListaRegistradores() {
        List<Registrador> registradores = new ArrayList<>();
        try {
            queryResult = handler.selectFromWhere("*", "personas", "tipo_persona", "REGISTRADOR");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return registradores;
    }

    /**
     * Este metodo se utiliza para eliminar Monitores del sistema
     *
     * @param nombre Este parametro es el nombre del Monitor que sera eliminado
     * del sistema
     */
    @Override
    public void eliminarMonitor(String nombre) {
        handler.deleteFromWhere("monitor", "nombre", nombre);
        handler.deleteFromWhere("personas", "nombre", nombre);
    }

    /**
     * Este metodo se utiliza para eliminar Registradores del sistema
     *
     * @param nombre Este parametro es el nombre del Registrador que sera
     * eliminado del sistema
     */
    @Override
    public void eliminarRegistrador(String nombre) {
        handler.deleteFromWhere("registrador", "nombre", nombre);
        handler.deleteFromWhere("personas", "nombre", nombre);
    }

    /**
     * Este metodo se utiliza para actualizar los datos de los Monitores del
     * sistema
     *
     * @param monitor Este parametro es el nombre del Monitor que actualizaran
     * los datos
     */
    @Override
    public void actualizarDatosMonitor(Monitor monitor) {
        handler.updateWhere("monitor", "identificacion='" + monitor.getId() + "',nombreCompleto='" + monitor.getNombre() + "',clave='" + monitor.getClave() + "'", "identificacion=" + monitor.getId());
        handler.updateWhere("personas", "id='" + monitor.getId() + "',nombre='" + monitor.getNombre() + "',clave='" + monitor.getClave() + "'", "id=" + monitor.getId() + " AND tipo_persona=MONITOR");
    }

    /**
     * Este metod se utiliza para actualizar los datos de los regitradores del
     * sistema
     *
     * @param registrador Este parametro es el nombre del Registrador que
     * actualizaran los datos
     */
    @Override
    public void actualizarDatosRegistrador(Registrador registrador) {
        handler.updateWhere("monitor", "id='" + registrador.getId() + "',nombre='" + registrador.getNombre() + "',clave='" + registrador.getClave() + "'", "id=" + registrador.getId());
        handler.updateWhere("personas", "id='" + registrador.getId() + "',nombre='" + registrador.getNombre() + "',clave='" + registrador.getClave() + "'", "id=" + registrador.getId() + " AND tipo_persona=REGISTRADOR");
    }

    /**
     * no contiene implementaciones
     *
     * @return
     * @deprecated
     * @param paciente .
     * @param registrador.
     */
    @Override
    public boolean registrarPacientes(Paciente paciente, Registrador registrador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * no contiene implementaciones
     *
     * @deprecated
     * @param ipd .
     * @param registrador.
     */
    @Override
    public void registrarIPD(IPDPaciente ipd, Registrador registrador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * no contiene implementaciones
     *
     * @deprecated
     * @return .
     */
    @Override
    public String[] obtenerPatologias() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * no contiene implementaciones
     *
     * @deprecated
     * @param nombre.
     * @return .
     */
    @Override
    public int consultarIDPatologiaPorNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * no contiene implementaciones
     *
     * @deprecated
     * @param ipd.
     * @return .
     */
    @Override
    public Registrador obtenerRegistradorIPD(IPDPaciente ipd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * no contiene implementaciones
     *
     * @deprecated
     * @param paciente.
     * @param registrador.
     */
    @Override
    public void actualizarDatosPaciente(Paciente paciente, Registrador registrador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * no contiene implementaciones
     *
     * @deprecated
     * @param ipd.
     * @param registrador.
     */
    @Override
    public void actualizarDatosIpd(IPDPaciente ipd, Registrador registrador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * no contiene implementaciones
     *
     * @deprecated
     * @return .
     */
    @Override
    public int getLastIdPaciente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * no contiene implementaciones
     *
     * @deprecated
     * @param rut.
     * @return .
     */
    @Override
    public int getSecIdByRut(Rut rut) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @deprecated @param inicio
     * @param termino
     * @param ruta
     * @return
     */
    @Override
    public boolean descargarBasesDeDatos(Date inicio, Date termino, File ruta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
