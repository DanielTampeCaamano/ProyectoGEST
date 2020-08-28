/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufro.proyectoges.backend.entidades.fecha;

import java.sql.Date;

/**
 *
 * @author shido
 */
public class Fecha {
    
    private Date fecha;
    
    
    public Fecha(Date fecha){
        this.fecha = fecha;
    }
    
    public static String getYear(Date date) {
        if (date != null) {
            String fecha = date.toString();
            return "" + fecha.charAt(0) + fecha.charAt(1) + fecha.charAt(2) + fecha.charAt(3);
        }
        return "";
    }

    public static String getMonth(Date date) {
        if (date != null) {
            String fecha = date.toString();
            return "" + fecha.charAt(5) + fecha.charAt(6);
        }
        return "";
    }

    public static String getDay(Date date) {
        if (date != null) {
            String fecha = date.toString();
            return "" + fecha.charAt(8) + fecha.charAt(9);
        }
        return "";
    }
}