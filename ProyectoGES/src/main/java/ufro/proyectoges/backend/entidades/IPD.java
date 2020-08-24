/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufro.proyectoges.backend.entidades;

import java.sql.Date;

/**
 *
 * @author Roald
 */
public class IPD {
   private String rutPaciente;
   private String nombrePaciente;
   private Date fechaInicio;
   private Date fechaTermino;
   private boolean esGes;
   private boolean notificacionPacienteGES;
   private boolean confirmado;
   private boolean exceptuado;
   private String observacion;

    public IPD() {
    }

    public IPD(String rutPaciente, String nombrePaciente, Date fechaInicio, Date fechaTermino, boolean esGes, boolean notificacionPacienteGES, boolean confirmado, boolean exceptuado, String observacion) {
        this.rutPaciente = rutPaciente;
        this.nombrePaciente = nombrePaciente;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
        this.esGes = esGes;
        this.notificacionPacienteGES = notificacionPacienteGES;
        this.confirmado = confirmado;
        this.exceptuado = exceptuado;
        this.observacion = observacion;
    }

    public String getRutPaciente() {
        return rutPaciente;
    }

    public void setRutPaciente(String rutPaciente) {
        this.rutPaciente = rutPaciente;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaTermino() {
        return fechaTermino;
    }

    public void setFechaTermino(Date fechaTermino) {
        this.fechaTermino = fechaTermino;
    }

    public boolean isEsGes() {
        return esGes;
    }

    public void setEsGes(boolean esGes) {
        this.esGes = esGes;
    }

    public boolean isNotificacionPacienteGES() {
        return notificacionPacienteGES;
    }

    public void setNotificacionPacienteGES(boolean notificacionPacienteGES) {
        this.notificacionPacienteGES = notificacionPacienteGES;
    }

    public boolean isConfirmado() {
        return confirmado;
    }

    public void setConfirmado(boolean confirmado) {
        this.confirmado = confirmado;
    }

    public boolean isExceptuado() {
        return exceptuado;
    }

    public void setExceptuado(boolean exceptuado) {
        this.exceptuado = exceptuado;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
   
    
}
