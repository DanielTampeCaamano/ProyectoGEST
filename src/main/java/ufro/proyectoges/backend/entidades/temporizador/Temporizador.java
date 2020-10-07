/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufro.proyectoges.backend.entidades.temporizador;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;



/**
 *
 * @author shido
 * 
 * 
 */
public class Temporizador {
    
    private static Timer timer;

    
    
    public static boolean initTimerThatLasts(int miliseconds){
        System.out.println("iniciando timer");
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                int op = JOptionPane.showConfirmDialog(null, "Quiere continuar con la sesion?");
                switch (op){
                    case 0://yes
                        Temporizador.initTimerThatLasts(miliseconds);
                        timer.cancel();
                        break;
                    case 1:
                        JOptionPane.showMessageDialog(null, "Finalizando 1");
                        System.exit(0);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Finalizando 2");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Algo fallo");
                        System.exit(0);
                        break;
                }
            }
        }, miliseconds, miliseconds);
        return true;//timer finalizado
    }
    
    
}
