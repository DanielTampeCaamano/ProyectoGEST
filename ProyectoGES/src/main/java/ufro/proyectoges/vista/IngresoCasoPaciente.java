/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufro.proyectoges.vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import ufro.proyectoges.backend.entidades.IPDPaciente;
import ufro.proyectoges.backend.entidades.Paciente;
import ufro.proyectoges.backend.entidades.Persona;
import ufro.proyectoges.backend.entidades.Registrador;
import ufro.proyectoges.backend.entidades.rut.Rut;
import ufro.proyectoges.backend.herramientas.HerramientaRegistrador;

/**
 * Esta ventana gestiona el ingreso de los datos del paciente al sistema, o su visualizacion
 * @author Roald
 */
public class IngresoCasoPaciente extends javax.swing.JFrame implements KeyListener, ActionListener {

    private Persona p;
    private IPDPaciente ipd;
    private List<String> patologias;
    private boolean soloVista;
    private Paciente pacienteAObservar;
    private BusquedaPaciente previous;

    /**
     * Creates new form IngresoCasoPaciente
     * Este metodo setea la forma para cuando se va a ingresar a un paciente al sistema
     * @param p Recibe un objeto de clase Persona, que hace alusion a la persona usando el programa
     */
    public IngresoCasoPaciente(Persona p) {
        this.p = p;
        this.ipd = null;
        patologias = new ArrayList<>();
        initComponents();
        this.soloVista = false;
        this.PatologiasJTextField.setEditable(false);
        this.confirmacionIPD.setText("IPD no cargado");
        this.PatologiasJComboBox.setModel(new DefaultComboBoxModel<>(p.getHerramientaPersona().obtenerPatologias()));
        this.NombreJTextField.addKeyListener(this);
        this.RUTJTextField1.addKeyListener(this);
        this.RUTJTextField2.addKeyListener(this);
        this.PatologiasJComboBox.addActionListener(this);
        this.NombreFuncionarioJLabel.setText("");
        this.RUTFuncionarioJLabel.setText("");
        this.FechaJLabel.setText("");
        this.FechaIngresoJLabel.setText("");
        this.FuncionarioRegistroJLabel.setText("");

    }

    /**
     * Este metodo setea la forma para cuando se va a visualizar los datos de un paciente que se haya buscado
     * @param p Recibe un objeto de clase Persona, que hace alusion a la persona usando el programa
     * @param previous Recibe los datos de la ventana BusquedaPaciente
     */
    public IngresoCasoPaciente(Paciente p, BusquedaPaciente previous) {
        this.previous = previous;
        this.pacienteAObservar = p;
        initComponents();

        this.confirmacionIPD.setText("IPD Confirmado");

        this.PatologiasJTextField.setEditable(false);
        this.NombreJTextField.setEditable(false);
        this.RUTJTextField1.setEditable(false);
        this.RUTJTextField2.setEditable(false);
        this.PatologiasJComboBox.setEnabled(false);

        this.NombreJTextField.setText(p.getNombreCompleto());
        this.RUTJTextField1.setText(p.getRutValidado().substring(0, p.getRutValidado().length() - 1));
        this.RUTJTextField2.setText("" + p.getRutValidado().charAt(p.getRutValidado().length() - 1));
        this.PatologiasJTextField.setText(p.getIpdPaciente().getCodigoPatologia());

        Registrador registrador = previous.getP().getHerramientaPersona().obtenerRegistradorIPD(p.getIpdPaciente());

        this.NombreFuncionarioJLabel.setText(registrador.getNombre());
        this.RUTFuncionarioJLabel.setText(registrador.getRut().getRut());
        this.FechaJLabel.setText(p.getIpdPaciente().getFechaDeGuardado().toString());

        this.soloVista = true;

    }

    /**
     * Retorna el el contenido del campo Nombre
     * @return Retorna el contenido del JTextField Nombre
     */
    public JTextField getNombreJTextField() {
        return NombreJTextField;
    }

    /**
     * Retorna el contenido del campo Patologias
     * @return Retorna el contenido del JTextField Patologias
     */
    public JTextField getPatologiasJTextField() {
        return PatologiasJTextField;
    }

    /**
     * Retorna el contenido del campo RUT
     * @return Retorna el contenido del JTextField RUT
     */
    public JTextField getRUTJTextField1() {
        return RUTJTextField1;
    }

    /**
     * Retorna el contenido del campo RUT
     * @return Retorna el contenido del JTextField RUT
     */
    public JTextField getRUTJTextField2() {
        return RUTJTextField2;
    }

    /**
     * Retorna el contenido del IPD del paciente
     * @return Retorna un objeto de clase IPDPaciente, que contiene los datos del IPD del paciente al que esta relacionado
     */
    public IPDPaciente getIpd() {
        return ipd;
    }

    /**
     * Este metodo edita el contenido del IPD del paciente
     * @param ipd Este parametro edita el contenido del IPD del paciente
     */
    public void setIpd(IPDPaciente ipd) {
        this.ipd = ipd;
    }

    /**
     * Este metodo retorna la persona usando el sistema
     * @return Retorna un objeto de clase Persona, aludiendo a la persona usando el sistema
     */
    public Persona getP() {
        return p;
    }

    /**
     *
     * @param p
     */
    public void setP(Persona p) {
        this.p = p;
    }

    /**
     *
     * @return
     */
    public JLabel getConfirmacionIPD() {
        return confirmacionIPD;
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
        IngresoPacienteJLabel = new javax.swing.JLabel();
        NombreJLabel = new javax.swing.JLabel();
        NombreJTextField = new javax.swing.JTextField();
        RUTJLabel = new javax.swing.JLabel();
        RUTJTextField1 = new javax.swing.JTextField();
        RUTJTextField2 = new javax.swing.JTextField();
        PatologiasJLabel = new javax.swing.JLabel();
        PatologiasJTextField = new javax.swing.JTextField();
        PatologiasJComboBox = new javax.swing.JComboBox<>();
        IPDJButton = new javax.swing.JButton();
        FuncionarioRegistroJLabel = new javax.swing.JLabel();
        NombreFuncionarioJLabel = new javax.swing.JLabel();
        RUTFuncionarioJLabel = new javax.swing.JLabel();
        FechaIngresoJLabel = new javax.swing.JLabel();
        FechaJLabel = new javax.swing.JLabel();
        IngresarJButton = new javax.swing.JButton();
        VolverJButton = new javax.swing.JButton();
        confirmacionIPD = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ProyectoGES - Ingreso Caso Paciente");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TituloJLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        TituloJLabel.setText("GEST-ION");
        getContentPane().add(TituloJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 35, -1, -1));

        IngresoPacienteJLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        IngresoPacienteJLabel.setText("Ingreso Caso Paciente");
        getContentPane().add(IngresoPacienteJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 98, -1, -1));

        NombreJLabel.setText("Nombre Completo:");
        getContentPane().add(NombreJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 190, -1, -1));

        NombreJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreJTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(NombreJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 188, 394, -1));

        RUTJLabel.setText("RUT:");
        getContentPane().add(RUTJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 225, -1, -1));
        getContentPane().add(RUTJTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 225, 78, -1));
        getContentPane().add(RUTJTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 225, 23, -1));

        PatologiasJLabel.setText("Patologias:");
        getContentPane().add(PatologiasJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 266, -1, -1));

        PatologiasJTextField.setToolTipText("Puede utilizar el desplegable para ingresar patologias");
        getContentPane().add(PatologiasJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 264, 296, -1));

        PatologiasJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Patologia 1", "Patologia 2", "Patologia 3", "Patologia 4", "Patologia 5", "Patologia 6", "Patologia 7", "Patologia 8", "Patologia 9", "Patologia 10", "Patologia 11", "Patologia 12", "Patologia 13", "Patologia 14", "Patologia 15", "Patologia 16", "Patologia 17", "Patologia 18", "Patologia 19", "Patologia 20", "Patologia 21", "Patologia 22", "Patologia 23", "Patologia 24", "Patologia 25" }));
        PatologiasJComboBox.setToolTipText("Seleccione las patologia que desee ingresar");
        PatologiasJComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PatologiasJComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                agregadorpatologia(evt);
            }
        });
        PatologiasJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatologiasJComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(PatologiasJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 261, 176, -1));

        IPDJButton.setText("I.P.D.");
        IPDJButton.setToolTipText("Informe Proceso Diagnostico");
        IPDJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IPDJButtonActionPerformed(evt);
            }
        });
        getContentPane().add(IPDJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 334, -1, -1));

        FuncionarioRegistroJLabel.setText("Funcionario Registro:");
        getContentPane().add(FuncionarioRegistroJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 390, -1, -1));

        NombreFuncionarioJLabel.setText("Nombres Apellidos");
        getContentPane().add(NombreFuncionarioJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 415, -1, -1));

        RUTFuncionarioJLabel.setText("12.345.678-9");
        getContentPane().add(RUTFuncionarioJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 436, -1, -1));

        FechaIngresoJLabel.setText("Fecha Ingreso:");
        getContentPane().add(FechaIngresoJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 390, -1, -1));

        FechaJLabel.setText("dd/mm/aaaa");
        getContentPane().add(FechaJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 436, -1, -1));

        IngresarJButton.setText("Ingresar");
        IngresarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarJButtonActionPerformed(evt);
            }
        });
        getContentPane().add(IngresarJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 385, -1, -1));

        VolverJButton.setText("Volver");
        VolverJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverJButtonActionPerformed(evt);
            }
        });
        getContentPane().add(VolverJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 385, -1, -1));

        confirmacionIPD.setText("TEXT");
        getContentPane().add(confirmacionIPD, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 339, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/med2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombreJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreJTextFieldActionPerformed
    /**
     *
     * @param evt
     */
    private void IPDJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IPDJButtonActionPerformed
        // TODO add your handling code here:
        if (!soloVista) {
            Rut rut = new Rut(RUTJTextField1.getText() + RUTJTextField2.getText());
            if (!NombreJTextField.getText().isEmpty() && !RUTJTextField1.getText().isEmpty() && !RUTJTextField2.getText().isEmpty() && !this.PatologiasJTextField.getText().isEmpty() && Rut.rutBienEscrito(RUTJTextField1.getText() + RUTJTextField2.getText()) && rut.isRutValido()) {
                new IPD(p, this).setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Complete los datos de manera correcta");
            }
        } else {
            this.setEnabled(false);
            new IPD(pacienteAObservar, this).setVisible(true);
        }


    }//GEN-LAST:event_IPDJButtonActionPerformed
    /**
     *
     * @param evt
     */
    private void IngresarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarJButtonActionPerformed
        // TODO add your handling code here:
        String rut = RUTJTextField1.getText() + RUTJTextField2.getText();

        if (!rut.isEmpty() && ipd != null) {
            Rut rutValidado = new Rut(rut);
            Paciente pacienteAIngresar = new Paciente(NombreJTextField.getText(), new Rut(RUTJTextField1.getText() + RUTJTextField2.getText()), ipd);
            if (rutValidado.isRutValido() && !p.getHerramientaPersona().personaExiste(pacienteAIngresar)) {
                p.getHerramientaPersona().registrarPacientes(pacienteAIngresar, (Registrador) p);
                new Menu(p).setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Rut invalido o Rut ya registrado", "Error de validacion", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Campo de rut vacio", "Error de validacion", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_IngresarJButtonActionPerformed
    /**
     *
     * @param evt
     */
    private void VolverJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverJButtonActionPerformed
        // TODO add your handling code here:
        if (!soloVista) {
            new Menu(p).setVisible(true);
        } else {
            this.previous.setEnabled(true);
        }

        this.dispose();
    }//GEN-LAST:event_VolverJButtonActionPerformed
    /**
     *
     * @param evt
     */
    private void agregadorpatologia(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_agregadorpatologia
        // TODO add your handling code here:

        if (!patologias.contains(PatologiasJComboBox.getItemAt(PatologiasJComboBox.getSelectedIndex()))) {
            patologias.add(PatologiasJComboBox.getItemAt(PatologiasJComboBox.getSelectedIndex()));
            PatologiasJTextField.setText(patologias.toString());
        }

    }//GEN-LAST:event_agregadorpatologia

    private void PatologiasJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatologiasJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PatologiasJComboBoxActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FechaIngresoJLabel;
    private javax.swing.JLabel FechaJLabel;
    private javax.swing.JLabel FuncionarioRegistroJLabel;
    private javax.swing.JButton IPDJButton;
    private javax.swing.JButton IngresarJButton;
    private javax.swing.JLabel IngresoPacienteJLabel;
    private javax.swing.JLabel NombreFuncionarioJLabel;
    private javax.swing.JLabel NombreJLabel;
    private javax.swing.JTextField NombreJTextField;
    private javax.swing.JComboBox<String> PatologiasJComboBox;
    private javax.swing.JLabel PatologiasJLabel;
    private javax.swing.JTextField PatologiasJTextField;
    private javax.swing.JLabel RUTFuncionarioJLabel;
    private javax.swing.JLabel RUTJLabel;
    private javax.swing.JTextField RUTJTextField1;
    private javax.swing.JTextField RUTJTextField2;
    private javax.swing.JLabel TituloJLabel;
    private javax.swing.JButton VolverJButton;
    private javax.swing.JLabel confirmacionIPD;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
/**
     *
     * @param e
     */
    @Override
    public void keyTyped(KeyEvent e) {

    }

    /**
     *
     * @param e
     */
    @Override
    public void keyPressed(KeyEvent e) {
        if (ipd != null) {
            advertirCambios();
        }
    }

    /**
     *
     * @param e
     */
    @Override
    public void keyReleased(KeyEvent e) {

    }

    /**
     *
     */
    private void advertirCambios() {
        ipd = null;
        confirmacionIPD.setText("Datos modificados, se debe re-hacer ipd");
    }

    /**
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.PatologiasJComboBox && ipd != null) {
            advertirCambios();
        }
    }
}
