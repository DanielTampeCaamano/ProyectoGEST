/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufro.proyectoges.backend.herramientas;

import java.sql.Date;
import java.util.List;
import ufro.proyectoges.backend.connection.SqlHandler;
import ufro.proyectoges.backend.entidades.Paciente;

/**
 *
 * @author shido
 */
public interface Herramienta {
    
    public SqlHandler handler = new SqlHandler("127.0.0.1", "ges");
    
    public List<Paciente> obtenerPacientes();
    public boolean registrarPacientes();
    public boolean descargarBasesDeDatos(Date inicio, Date termino);
    
    
    
}
