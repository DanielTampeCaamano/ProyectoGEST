/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufro.proyectoges.vista;

import ufro.proyectoges.backend.entidades.Persona;

/**
 *
 * @author Roald
 */
public class GuardadoArchivo extends javax.swing.JFrame {

    private final Persona p;

    /**
     * Creates new form GuardadoArchivo
     * @param p
     */
    public GuardadoArchivo(Persona p) {
        this.p = p;
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

        SelectorArchivoJFileChooser = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SelectorArchivoJFileChooser.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);
        SelectorArchivoJFileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectorArchivoJFileChooserActionPerformed(evt);
            }
        });
        getContentPane().add(SelectorArchivoJFileChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 583, 363));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/med3.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SelectorArchivoJFileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectorArchivoJFileChooserActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_SelectorArchivoJFileChooserActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser SelectorArchivoJFileChooser;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
