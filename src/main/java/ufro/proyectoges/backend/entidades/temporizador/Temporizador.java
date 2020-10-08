/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufro.proyectoges.backend.entidades.temporizador;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import ufro.proyectoges.vista.Login;



/**
 *
 * @author shido
 * 
 * 
 */
public class Temporizador {
    
    private static Timer timer;
    private static Temporizador instance;
    public static int miliseconds;

    public static Temporizador getTemporizador() {
        if (instance != null){
           instance = new Temporizador();
        }
        return instance;
    }
    
    private Temporizador(){
        
    }

    public static void resetTemporizador(JFrame frame){
        timer.cancel();
        initTimerThatLasts(frame);
    }
    
    public static boolean initTimerThatLasts(JFrame frame){
        
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                JOptionPane.showMessageDialog(null, "La sesion expiro");
                frame.dispose();
                timer.cancel();
                new Login().setVisible(true);
            }
        }, miliseconds, miliseconds);
        return true;//timer finalizado
    }
    
    
}
