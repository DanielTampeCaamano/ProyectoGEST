/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufro.proyectoges.backend.herramientas;

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
import ufro.proyectoges.backend.entidades.Persona;
import ufro.proyectoges.backend.entidades.rut.Rut;

/**
 *
 * @author shido
 */
public class HerramientaMonitor extends Herramienta {

    private SqlHandler sqlHandler;
    private Statement statement;
    private ResultSet queryResult;

    public HerramientaMonitor() {
        sqlHandler = handler;
        statement = sqlHandler.getStatement();
    }

}
