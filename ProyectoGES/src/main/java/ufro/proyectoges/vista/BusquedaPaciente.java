/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufro.proyectoges.vista;

import java.awt.FlowLayout;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import ufro.proyectoges.backend.entidades.Paciente;
import ufro.proyectoges.backend.entidades.Persona;
import ufro.proyectoges.backend.entidades.rut.Rut;

/**
 *
 * @author Roald
 */
public class BusquedaPaciente extends javax.swing.JFrame {

    private final Persona p;

    /**
     * Creates new form BusquedaPaciente
     *
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
        ResultadosJScrollpane = new javax.swing.JScrollPane();
        ResultadosJTable = new javax.swing.JTable();
        RutJTextField1 = new javax.swing.JTextField();
        RutJTextField2 = new javax.swing.JTextField();
        BuscarRUTJButton = new javax.swing.JButton();
        NombreJTextField = new javax.swing.JTextField();
        BuscarNombreJButton = new javax.swing.JButton();
        VolverJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ProyectoGES - Busqueda de Paciente");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TituloJLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        TituloJLabel.setText("GEST-ION");
        getContentPane().add(TituloJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        BusquedaJLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BusquedaJLabel.setText("Busqueda");
        getContentPane().add(BusquedaJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, -1, -1));

        BusquedaRutJButton.setText("Buscar por RUT");
        BusquedaRutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedaRutJButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BusquedaRutJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 148, -1));

        BusquedaNombreJButton.setText("Buscar por Nombre");
        BusquedaNombreJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedaNombreJButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BusquedaNombreJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 161, -1));

        ResultadosJScrollpane.setEnabled(false);

        ResultadosJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rut", "Nombre", "Fecha Ingreso", "Accion"
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
        if (ResultadosJTable.getColumnModel().getColumnCount() > 0) {
            ResultadosJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(ResultadosJScrollpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 317, -1, 99));

        RutJTextField1.setEnabled(false);
        getContentPane().add(RutJTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 90, -1));

        RutJTextField2.setEnabled(false);
        getContentPane().add(RutJTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 37, -1));

        BuscarRUTJButton.setText("Buscar");
        BuscarRUTJButton.setEnabled(false);
        BuscarRUTJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarRUTJButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BuscarRUTJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        NombreJTextField.setEnabled(false);
        NombreJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreJTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(NombreJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 190, -1));

        BuscarNombreJButton.setText("Buscar");
        BuscarNombreJButton.setEnabled(false);
        BuscarNombreJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarNombreJButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BuscarNombreJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, -1, -1));

        VolverJButton.setText("Volver");
        VolverJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverJButtonActionPerformed(evt);
            }
        });
        getContentPane().add(VolverJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 434, -1, -1));

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
        BuscarNombreJButton.setEnabled(false);
        RutJTextField1.setEnabled(true);
        RutJTextField2.setEnabled(true);
        BuscarRUTJButton.setEnabled(true);
    }//GEN-LAST:event_BusquedaRutJButtonActionPerformed

    private void BusquedaNombreJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedaNombreJButtonActionPerformed
        // TODO add your handling code here:
        RutJTextField1.setEnabled(false);
        RutJTextField2.setEnabled(false);
        BuscarRUTJButton.setEnabled(false);
        NombreJTextField.setEnabled(true);
        BuscarNombreJButton.setEnabled(true);
    }//GEN-LAST:event_BusquedaNombreJButtonActionPerformed

    private void BuscarRUTJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarRUTJButtonActionPerformed
        String rutAnotado = RutJTextField1.getText() + RutJTextField2.getText();
        if (!RutJTextField1.getText().isEmpty() && !RutJTextField2.getText().isEmpty()) {
            Rut rut = new Rut(rutAnotado);
            if (rut.isRutValido()) {
                Paciente pacienteObt = p.getHerramientaPersona().buscarPacientePorRut(rut);
                if (p.getHerramientaPersona().personaExiste(pacienteObt)) {
                   
                    Object[] row = {pacienteObt.getRut().getRut(), pacienteObt.getNombreCompleto(), pacienteObt.getIpdPaciente().getFechaInicio().toString(),new javax.swing.JButton()};
                    DefaultTableModel model = (DefaultTableModel) ResultadosJTable.getModel();
                    model.addRow(row);
                    asignarListenerALista(pacienteObt, model);
                    RutJTextField1.setText("");
                    RutJTextField2.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "No existe paciente asociado al rut especificado");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Rut invalido");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Rellene todos los campos");
        }

    }//GEN-LAST:event_BuscarRUTJButtonActionPerformed
    
    private void asignarListenerALista(Paciente paciente, DefaultTableModel model){
        int posicionListener = model.getRowCount() - 1;
        
        
        javax.swing.JButton boton = (javax.swing.JButton) model.getValueAt(posicionListener, 3);
        
        boton.addActionListener((e) -> {
            new IngresoCasoPaciente(paciente).setVisible(true);
        });
    }
    
    private void BuscarNombreJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarNombreJButtonActionPerformed
        // TODO add your handling code here:
        if (!NombreJTextField.getText().isEmpty()) {

            Paciente pacienteObt = p.getHerramientaPersona().buscarPacientePorNombre(NombreJTextField.getText());
            if (pacienteObt != null) {
                Object[] row = {pacienteObt.getRut().getRut(),
                    pacienteObt.getNombreCompleto(),
                    pacienteObt.getIpdPaciente().getFechaInicio().toString()};
                DefaultTableModel model = (DefaultTableModel) ResultadosJTable.getModel();
                model.addRow(row);
                NombreJTextField.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro una persona con ese nombre");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Rellene todos los campos");
        }
    }//GEN-LAST:event_BuscarNombreJButtonActionPerformed

    private void NombreJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreJTextFieldActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarNombreJButton;
    private javax.swing.JButton BuscarRUTJButton;
    private javax.swing.JLabel BusquedaJLabel;
    private javax.swing.JButton BusquedaNombreJButton;
    private javax.swing.JButton BusquedaRutJButton;
    private javax.swing.JTextField NombreJTextField;
    private javax.swing.JScrollPane ResultadosJScrollpane;
    private javax.swing.JTable ResultadosJTable;
    private javax.swing.JTextField RutJTextField1;
    private javax.swing.JTextField RutJTextField2;
    private javax.swing.JLabel TituloJLabel;
    private javax.swing.JButton VolverJButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
