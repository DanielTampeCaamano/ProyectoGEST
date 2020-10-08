/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufro.proyectoges.backend.entidades.temporizador;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author shido
 */
public class TemporizadorTest {
    
//    
    @org.testng.annotations.Test
    public void testSetTimerToFrame1() {
        Temporizador.miliseconds = 1000;
        assertTrue(Temporizador.setTimerToFrame(null));
    }
    @org.testng.annotations.Test
    public void testSetTimerToFrame2() {
        Temporizador.miliseconds = 2000;
        assertTrue(Temporizador.setTimerToFrame(null));
    }
    @org.testng.annotations.Test
    public void testSetTimerToFrame3() {
        Temporizador.miliseconds = 3000;
        assertTrue(Temporizador.setTimerToFrame(null));
    }
    @org.testng.annotations.Test
    public void testSetTimerToFrame4() {
        
        Temporizador.miliseconds = 4000;
        assertTrue(Temporizador.setTimerToFrame(null));
    }
    
    @org.testng.annotations.Test
    public void testResetTimerToFrame1() {
        Temporizador.miliseconds = 1000;
        assertTrue(Temporizador.resetTemporizador(null));
    }
    @org.testng.annotations.Test
    public void testResetTimerToFrame2() {
        Temporizador.miliseconds = 2000;
        assertTrue(Temporizador.resetTemporizador(null));
    }
    @org.testng.annotations.Test
    public void testResetTimerToFrame3() {
        Temporizador.miliseconds = 3000;
        assertTrue(Temporizador.resetTemporizador(null));
    }
    @org.testng.annotations.Test
    public void testResetTimerToFrame4() {
        Temporizador.miliseconds = 4000;
        assertTrue(Temporizador.resetTemporizador(null));
    }
    
    
}
