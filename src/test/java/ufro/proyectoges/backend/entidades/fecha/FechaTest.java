/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufro.proyectoges.backend.entidades.fecha;

import java.sql.Date;
import static org.testng.Assert.*;

/**
 *
 * @author shido
 */
public class FechaTest {

    private final Date date1 = Date.valueOf("1999-08-07");
    private final Date date2 = Date.valueOf("2001-02-03");
    private final Date date3 = Date.valueOf("2005-12-30");
    private final Date date4 = Date.valueOf("2010-06-21");

    @org.testng.annotations.Test
    public void testGetDay1() {
        assertEquals(Fecha.getDay(date1), "07");
    }

    @org.testng.annotations.Test
    public void testGetDay2() {
        assertEquals(Fecha.getDay(date2), "03");
    }

    @org.testng.annotations.Test
    public void testGetDay3() {
        assertEquals(Fecha.getDay(date3), "30");
    }

    @org.testng.annotations.Test
    public void testGetDay4() {
        assertEquals(Fecha.getDay(date4), "21");
    }
    
    @org.testng.annotations.Test
    public void testGetMonth1() {
        assertEquals(Fecha.getMonth(date1), "08");
    }

    @org.testng.annotations.Test
    public void testGetMonth2() {
        assertEquals(Fecha.getMonth(date2), "02");
    }

    @org.testng.annotations.Test
    public void testGetMonth3() {
        assertEquals(Fecha.getMonth(date3), "12");
    }

    @org.testng.annotations.Test
    public void testGetMonth4() {
        assertEquals(Fecha.getMonth(date4), "06");
    }
    @org.testng.annotations.Test
    public void testGetYear1() {
        assertEquals(Fecha.getYear(date1), "1999");
    }

    @org.testng.annotations.Test
    public void testGetYear2() {
        assertEquals(Fecha.getYear(date2), "2001");
    }

    @org.testng.annotations.Test
    public void testGetYear3() {
        assertEquals(Fecha.getYear(date3), "2005");
    }

    @org.testng.annotations.Test
    public void testGetYear4() {
        assertEquals(Fecha.getYear(date4), "2010");
    }
    
    @org.testng.annotations.Test
    public void testFecha1MenorFecha2a() {
        assertTrue(Fecha.fecha1MenorQueFecha2(date1, date2));
    }
    
    @org.testng.annotations.Test
    public void testFecha1MenorFecha2b() {
        assertFalse(Fecha.fecha1MenorQueFecha2(date2, date1));
    }
    
    @org.testng.annotations.Test
    public void testFecha1MenorFecha2c() {
        assertTrue(Fecha.fecha1MenorQueFecha2(date3, date4));
    }
    
    @org.testng.annotations.Test
    public void testFecha1MenorFecha2d() {
        assertFalse(Fecha.fecha1MenorQueFecha2(date4, date1));
    }
    
    

}
