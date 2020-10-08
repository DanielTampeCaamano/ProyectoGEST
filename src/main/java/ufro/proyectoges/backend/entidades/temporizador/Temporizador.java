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

    /**
     * 
     * Metodo que permite que la clase pueda ser operada sin 
     * inicializar
     *
     * @return una instancia de esta clase
     */
    public static Temporizador getTemporizador() {
        if (instance != null) {
            instance = new Temporizador();
        }
        return instance;
    }

    private Temporizador() {

    }
    /**
     * @param frame resetea el timer para la ventana dada   
    **/

    public static void resetTemporizador(JFrame frame) {
        timer.cancel();
        setTimerToFrame(frame);
    }

    /**
     * 
     * Programa un temporizador que dura this.miliseconds
     * 
     * @param frame
     * @return si el timer finalizo de manera correca
     */
    
    public static boolean setTimerToFrame(JFrame frame) {

        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                JOptionPane.showMessageDialog(null, "La sesion expiro");
                if (frame != null) {
                    frame.dispose();
                    new Login().setVisible(true);
                }
                timer.cancel();

            }
        }, miliseconds, miliseconds);
        return true;//timer finalizado
    }

}
