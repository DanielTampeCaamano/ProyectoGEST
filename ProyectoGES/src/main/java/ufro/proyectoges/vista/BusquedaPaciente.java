/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufro.proyectoges.vista;

import java.awt.event.ActionEvent;
import ufro.proyectoges.backend.entidades.Persona;

/**
 *
 * @author Roald
 */
public class BusquedaPaciente extends javax.swing.JFrame {

    private final Persona p;

    /**
     * Creates new form BusquedaPaciente
     * @param p
     */
    public BusquedaPaciente(Persona p) {
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

        TituloJLabel = new javax.swing.JLabel();
        BusquedaJLabel = new javax.swing.JLabel();
        BusquedaRutJButton = new javax.swing.JButton();
        BusquedaNombreJButton = new javax.swing.JButton();
        BusquedaNumeroFichaJButton = new javax.swing.JButton();
        ResultadosJScrollpane = new javax.swing.JScrollPane();
        ResultadosJTable = new javax.swing.JTable();
        RutJTextField1 = new javax.swing.JTextField();
        RutJTextField2 = new javax.swing.JTextField();
        BuscarRUTJButton = new javax.swing.JButton();
        NombreJTextField = new javax.swing.JTextField();
        ApellidoJTextField = new javax.swing.JTextField();
        BuscarNombreJButton = new javax.swing.JButton();
        NumeroFichaJTextField = new javax.swing.JTextField();
        BuscarNumeroFichaJButton = new javax.swing.JButton();
        VolverJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ProyectoGES - Busqueda de Paciente");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TituloJLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        TituloJLabel.setForeground(new java.awt.Color(0, 0, 0));
        TituloJLabel.setText("GEST-ION");
        getContentPane().add(TituloJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        BusquedaJLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BusquedaJLabel.setForeground(new java.awt.Color(0, 0, 0));
        BusquedaJLabel.setText("Busqueda");
        getContentPane().add(BusquedaJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, -1, -1));

        BusquedaRutJButton.setText("Buscar por RUT");
        BusquedaRutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedaRutJButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BusquedaRutJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 120, 148, -1));

        BusquedaNombreJButton.setText("Buscar por Nombre");
        BusquedaNombreJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedaNombreJButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BusquedaNombreJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 120, 161, -1));

        BusquedaNumeroFichaJButton.setText("Buscar Por Numero de Ficha Medica");
        BusquedaNumeroFichaJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedaNumeroFichaJButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BusquedaNumeroFichaJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, -1, -1));

        ResultadosJScrollpane.setEnabled(false);

        ResultadosJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Ficha Medica", "Rut", "Nombre", "Fecha Ingreso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ResultadosJTable.setEnabled(false);
        ResultadosJScrollpane.setViewportView(ResultadosJTable);

        getContentPane().add(ResultadosJScrollpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 317, -1, 99));

        RutJTextField1.setEnabled(false);
        getContentPane().add(RutJTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 193, 62, -1));

        RutJTextField2.setEnabled(false);
        getContentPane().add(RutJTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 193, 37, -1));

        BuscarRUTJButton.setText("Buscar");
        BuscarRUTJButton.setEnabled(false);
        BuscarRUTJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarRUTJButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BuscarRUTJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 263, -1, -1));

        NombreJTextField.setEnabled(false);
        getContentPane().add(NombreJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 193, 94, -1));

        ApellidoJTextField.setEnabled(false);
        getContentPane().add(ApellidoJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 193, 102, -1));

        BuscarNombreJButton.setText("Buscar");
        BuscarNombreJButton.setEnabled(false);
        BuscarNombreJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarNombreJButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BuscarNombreJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 263, -1, -1));

        NumeroFichaJTextField.setEnabled(false);
        getContentPane().add(NumeroFichaJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 193, 192, -1));

        BuscarNumeroFichaJButton.setText("Buscar");
        BuscarNumeroFichaJButton.setEnabled(false);
        BuscarNumeroFichaJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarNumeroFichaJButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BuscarNumeroFichaJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 263, -1, -1));

        VolverJButton.setText("Volver");
        VolverJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverJButtonActionPerformed(evt);
            }
        });
        getContentPane().add(VolverJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 434, -1, -1));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/med2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverJButtonActionPerformed
        // TODO add your handling code here:
        new Menu(p).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VolverJButtonActionPerformed

    private void BusquedaRutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedaRutJButtonActionPerformed
        // TODO add your handling code here:
        NombreJTextField.setEnabled(false);
        ApellidoJTextField.setEnabled(false);
        BuscarNombreJButton.setEnabled(false);
        NumeroFichaJTextField.setEnabled(false);
        BuscarNumeroFichaJButton.setEnabled(false);
        RutJTextField1.setEnabled(true);
        RutJTextField2.setEnabled(true);
        BuscarRUTJButton.setEnabled(true);
    }//GEN-LAST:event_BusquedaRutJButtonActionPerformed

    private void BusquedaNombreJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedaNombreJButtonActionPerformed
        // TODO add your handling code here:
        RutJTextField1.setEnabled(false);
        RutJTextField2.setEnabled(false);
        BuscarRUTJButton.setEnabled(false);
        NumeroFichaJTextField.setEnabled(false);
        BuscarNumeroFichaJButton.setEnabled(false);
        NombreJTextField.setEnabled(true);
        ApellidoJTextField.setEnabled(true);
        BuscarNombreJButton.setEnabled(true);
    }//GEN-LAST:event_BusquedaNombreJButtonActionPerformed

    private void BusquedaNumeroFichaJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedaNumeroFichaJButtonActionPerformed
        // TODO add your handling code here:
        RutJTextField1.setEnabled(false);
        RutJTextField2.setEnabled(false);
        BuscarRUTJButton.setEnabled(false);
        NombreJTextField.setEnabled(false);
        ApellidoJTextField.setEnabled(false);
        BuscarNombreJButton.setEnabled(false);
        NumeroFichaJTextField.setEnabled(true);
        BuscarNumeroFichaJButton.setEnabled(true);
    }//GEN-LAST:event_BusquedaNumeroFichaJButtonActionPerformed

    private void BuscarRUTJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarRUTJButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarRUTJButtonActionPerformed

    private void BuscarNombreJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarNombreJButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarNombreJButtonActionPerformed

    private void BuscarNumeroFichaJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarNumeroFichaJButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarNumeroFichaJButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidoJTextField;
    private javax.swing.JButton BuscarNombreJButton;
    private javax.swing.JButton BuscarNumeroFichaJButton;
    private javax.swing.JButton BuscarRUTJButton;
    private javax.swing.JLabel BusquedaJLabel;
    private javax.swing.JButton BusquedaNombreJButton;
    private javax.swing.JButton BusquedaNumeroFichaJButton;
    private javax.swing.JButton BusquedaRutJButton;
    private javax.swing.JTextField NombreJTextField;
    private javax.swing.JTextField NumeroFichaJTextField;
    private javax.swing.JScrollPane ResultadosJScrollpane;
    private javax.swing.JTable ResultadosJTable;
    private javax.swing.JTextField RutJTextField1;
    private javax.swing.JTextField RutJTextField2;
    private javax.swing.JLabel TituloJLabel;
    private javax.swing.JButton VolverJButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
