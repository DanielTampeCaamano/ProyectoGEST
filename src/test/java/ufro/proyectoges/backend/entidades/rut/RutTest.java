/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufro.proyectoges.backend.entidades.rut;

import static org.testng.Assert.*;

/**
 *
 * @author shido
 */
public class RutTest {

    public RutTest() {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.Test
    public void testRutBienEscrito() {
        String rut = "201061911";
        assertTrue(Rut.rutBienEscrito(rut));
    }

    @org.testng.annotations.Test
    public void testRutBienEscrito2() {
        String rut = "15666919k";
        assertTrue(Rut.rutBienEscrito(rut));
    }

    @org.testng.annotations.Test
    public void testRutBienEscrito3() {
        String rut = "20901792k";
        assertTrue(Rut.rutBienEscrito(rut));
    }

    @org.testng.annotations.Test
    public void testRutBienEscrito4() {
        String rut = "56692368";
        assertTrue(Rut.rutBienEscrito(rut));
    }

}
