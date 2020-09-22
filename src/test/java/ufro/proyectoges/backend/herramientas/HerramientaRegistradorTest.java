/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufro.proyectoges.backend.herramientas;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import ufro.proyectoges.backend.entidades.rut.Rut;

/**
 *
 * @author shido
 */
public class HerramientaRegistradorTest {

    private HerramientaRegistrador h;

    @org.testng.annotations.BeforeMethod
    public void setUp() {
        h = new HerramientaRegistrador();
    }

    @org.testng.annotations.Test
    public void testBuscarPacientePorNombre1() {
        assertNotNull(h.buscarPacientePorNombre("legalo"));
    }

    @org.testng.annotations.Test
    public void testBuscarPacientePorNombre2() {
        assertNotNull(h.buscarPacientePorNombre("nomnbre"));

    }

    @org.testng.annotations.Test
    public void testBuscarPacientePorNombre3() {
        assertNotNull(h.buscarPacientePorNombre("nombre2"));

    }

    @org.testng.annotations.Test
    public void testBuscarPacientePorNombre4() {
        assertNull(h.buscarPacientePorNombre("paciente"));

    }
    @org.testng.annotations.Test
    public void testBuscarPacientePorRut1() {
        assertNotNull(h.buscarPacientePorRut(new Rut("152361084")));
    }

    @org.testng.annotations.Test
    public void testBuscarPacientePorRut2() {
        assertNotNull(h.buscarPacientePorRut(new Rut("188772129")));

    }

    @org.testng.annotations.Test
    public void testBuscarPacientePorRut3() {
        assertNotNull(h.buscarPacientePorRut(new Rut("171261805")));

    }

    @org.testng.annotations.Test
    public void testBuscarPacientePorRut4() {
        assertNull(h.buscarPacientePorRut(new Rut("67807081")));

    }
}
