/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufro.proyectoges.vista;

import java.sql.Date;
import javax.swing.JOptionPane;
import ufro.proyectoges.backend.entidades.IPDPaciente;
import ufro.proyectoges.backend.entidades.Monitor;
import ufro.proyectoges.backend.entidades.Paciente;
import ufro.proyectoges.backend.entidades.Persona;
import ufro.proyectoges.backend.entidades.Registrador;
import ufro.proyectoges.backend.entidades.rut.Rut;
import ufro.proyectoges.backend.herramientas.HerramientaLogIn;
import ufro.proyectoges.backend.herramientas.HerramientaMonitor;
import ufro.proyectoges.backend.herramientas.HerramientaRegistrador;

/**
 *
 * @author Roald
 */
public class Login extends javax.swing.JFrame {

    private HerramientaLogIn herramienta;

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        
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
        UsuarioJLabel = new javax.swing.JLabel();
        UsuarioJTextField = new javax.swing.JTextField();
        ContraseñaJLabel = new javax.swing.JLabel();
        ContraseñaJTextField = new javax.swing.JTextField();
        AceptarJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ProyectoGES - Login");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TituloJLabel.setFont(new java.awt.Font("Dialog", 3, 28)); // NOI18N
        TituloJLabel.setForeground(new java.awt.Color(0, 0, 0));
        TituloJLabel.setText("GEST-ION");
        getContentPane().add(TituloJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 21, -1, -1));

        UsuarioJLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        UsuarioJLabel.setForeground(new java.awt.Color(0, 0, 0));
        UsuarioJLabel.setText("Usuario");
        getContentPane().add(UsuarioJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 108, -1, -1));

        UsuarioJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioJTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(UsuarioJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 144, 207, -1));

        ContraseñaJLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ContraseñaJLabel.setForeground(new java.awt.Color(0, 0, 0));
        ContraseñaJLabel.setText("Contraseña");
        getContentPane().add(ContraseñaJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 181, -1, -1));

        ContraseñaJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContraseñaJTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(ContraseñaJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 211, 207, -1));

        AceptarJButton.setBackground(new java.awt.Color(102, 204, 255));
        AceptarJButton.setForeground(new java.awt.Color(0, 0, 0));
        AceptarJButton.setText("Ingresar");
        AceptarJButton.setOpaque(false);
        AceptarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarJButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AceptarJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 275, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/med1a.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsuarioJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioJTextFieldActionPerformed

    private void ContraseñaJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContraseñaJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContraseñaJTextFieldActionPerformed

    private void AceptarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarJButtonActionPerformed
        // TODO add your handling code here:
        herramienta = new HerramientaLogIn();
        if (Rut.rutBienEscrito(UsuarioJTextField.getText())) {
            Persona p = herramienta.buscarPersona(new Rut(UsuarioJTextField.getText()));
            if (p != null && p.getClave().equals(ContraseñaJTextField.getText()) && p != null) {
                new Menu(p).setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Usuario no existe y/o clave incorrecta", "Error de credenciales", JOptionPane.QUESTION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Rut Invalido, ocupe formato 123456789", "Error de RUT", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_AceptarJButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        //HerramientaRegistrador h = new HerramientaRegistrador();
        //h.registrarPacientes(new Paciente("paciente1", new Rut("188772129"), new IPDPaciente("188772129", "paciente1", new Date((long)1598299030.0), new Date((long)15982990343.0), true, true, true, true, true, null, 0)));
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarJButton;
    private javax.swing.JLabel ContraseñaJLabel;
    private javax.swing.JTextField ContraseñaJTextField;
    private javax.swing.JLabel TituloJLabel;
    private javax.swing.JLabel UsuarioJLabel;
    private javax.swing.JTextField UsuarioJTextField;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
