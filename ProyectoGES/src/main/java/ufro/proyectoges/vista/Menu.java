/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufro.proyectoges.vista;

import ufro.proyectoges.backend.entidades.Persona;
import ufro.proyectoges.backend.herramientas.HerramientaMonitor;
import ufro.proyectoges.backend.herramientas.HerramientaRegistrador;

/**
 *
 * @author Roald
 */
public class Menu extends javax.swing.JFrame {

    private Persona persona;

    /**
     * Creates new form Menu
     *
     * @param persona
     */
    public Menu(Persona persona) {
        this.persona = persona;

        if (persona.getHerramientaPersona() == null) {
            switch (persona.getTipo_persona()) {
                case "REGISTRADOR":
                    persona.setHerramientaPersona(new HerramientaRegistrador());
                    break;
                case "MONITOR":
                    persona.setHerramientaPersona(new HerramientaMonitor());
                    break;
                default:
                    System.out.println("caso default");
                    break;
            }
        }

        initComponents();
        this.setTitle("TIPO DE CUENTA: " + persona.getTipo_persona());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TituloJLabel = new javax.swing.JLabel();
        MenuJLabel = new javax.swing.JLabel();
        IngresoPacientesJButton = new javax.swing.JButton();
        BusquedaPacientesJButton = new javax.swing.JButton();
        DescargaBaseDatosJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ProyectoGES - Menu");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TituloJLabel.setFont(new java.awt.Font("Dialog", 0, 28)); // NOI18N
        TituloJLabel.setForeground(new java.awt.Color(0, 0, 0));
        TituloJLabel.setText("GEST-ION");
        getContentPane().add(TituloJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 26, -1, -1));

        MenuJLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        MenuJLabel.setForeground(new java.awt.Color(0, 0, 0));
        MenuJLabel.setText("MENU");
        getContentPane().add(MenuJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 104, -1, -1));

        IngresoPacientesJButton.setBackground(new java.awt.Color(102, 204, 255));
        IngresoPacientesJButton.setText("Ingreso de Casos de Pacientes");
        IngresoPacientesJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresoPacientesJButtonActionPerformed(evt);
            }
        });
        getContentPane().add(IngresoPacientesJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 220, 51));

        BusquedaPacientesJButton.setBackground(new java.awt.Color(102, 204, 255));
        BusquedaPacientesJButton.setText("Busqueda de Casos de Pacientes");
        BusquedaPacientesJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedaPacientesJButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BusquedaPacientesJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 220, 46));

        DescargaBaseDatosJButton.setBackground(new java.awt.Color(102, 204, 255));
        DescargaBaseDatosJButton.setText("Descarga de Base de Datos");
        DescargaBaseDatosJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescargaBaseDatosJButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DescargaBaseDatosJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 220, 43));

        jLabel1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/med1a.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngresoPacientesJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresoPacientesJButtonActionPerformed
        // TODO add your handling code here:
        new IngresoCasoPaciente(persona).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_IngresoPacientesJButtonActionPerformed

    private void BusquedaPacientesJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedaPacientesJButtonActionPerformed
        new BusquedaPaciente(persona).setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_BusquedaPacientesJButtonActionPerformed

    private void DescargaBaseDatosJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescargaBaseDatosJButtonActionPerformed
        // TODO add your handling code here:
        new DescargabaseDatos(persona).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DescargaBaseDatosJButtonActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BusquedaPacientesJButton;
    private javax.swing.JButton DescargaBaseDatosJButton;
    private javax.swing.JButton IngresoPacientesJButton;
    private javax.swing.JLabel MenuJLabel;
    private javax.swing.JLabel TituloJLabel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
