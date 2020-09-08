/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufro.proyectoges.vista;

import java.io.File;
import java.sql.Date;
import java.sql.SQLException;
import ufro.proyectoges.backend.entidades.Persona;

/**
 * Esta ventana gestiona el guardado del archivo de la descarga de base de datos
 * de pacientes
 *
 * @author Roald
 */
public class GuardadoArchivo extends javax.swing.JFrame {

    private final Persona p;
    private final Date[] datos;

    /**
     * Creates new form GuardadoArchivo
     *
     * @param p Persona que usa este programa
     * @param datos Datos que se usan para guardar el archivo de la base de
     * datos
     */
    public GuardadoArchivo(Persona p, Date[] datos) {
        this.p = p;
        this.datos = datos;
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

    /**
     * Este metodo gestiona la accion de guardar el archivo de la informacion
     * descargada de la base de datos
     *
     * @param evt Este evento se genera al hacer click en el boton guardar
     */
    private void SelectorArchivoJFileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectorArchivoJFileChooserActionPerformed
        // TODO add your handling code here:
        File archivo = this.SelectorArchivoJFileChooser.getSelectedFile();
        if (archivo != null) {
            p.getHerramientaPersona().descargarBasesDeDatos(datos[0], datos[1], archivo);
        }
        this.dispose();
    }//GEN-LAST:event_SelectorArchivoJFileChooserActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser SelectorArchivoJFileChooser;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
