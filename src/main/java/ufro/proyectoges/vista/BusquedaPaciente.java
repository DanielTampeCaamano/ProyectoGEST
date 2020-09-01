/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufro.proyectoges.vista;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import ufro.proyectoges.backend.entidades.Paciente;
import ufro.proyectoges.backend.entidades.Persona;
import ufro.proyectoges.backend.entidades.rut.Rut;

/**
 * Esta es la ventana que se usa para la busqueda de pacientes
 *
 * @author Roald
 */
public class BusquedaPaciente extends javax.swing.JFrame implements MouseListener {

    private final Persona p;
    private DefaultTableModel model;
    private final List<Paciente> pacientesObtenidos;
    private final Menu menu;

    /**
     * Creates new form BusquedaPaciente 0
     *
     * @param p Recibe un objeto de clase Persona que contiene los datos de la
     * persona que utiliza el programa
     * @param menu Recibe la ventana Menu
     */
    public BusquedaPaciente(Persona p, Menu menu) {
        this.menu = menu;
        this.p = p;
        initComponents();
        ResultadosJTable.setEnabled(true);
        ResultadosJTable.setRowSelectionAllowed(true);
        pacientesObtenidos = new ArrayList<>();
        this.ResultadosJTable.addMouseListener(this);
    }

    /**
     * Este metodo recupera la lista de pacientes
     *
     * @return Retorna la lista de pacientes, una lista de objetos de clase
     * Paciente
     */
    public List<Paciente> getPacientesObtenidos() {
        return pacientesObtenidos;
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
                "Rut", "Nombre", "Fecha de Ingreso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ResultadosJTable.setColumnSelectionAllowed(true);
        ResultadosJTable.setEnabled(false);
        ResultadosJTable.getTableHeader().setReorderingAllowed(false);
        ResultadosJScrollpane.setViewportView(ResultadosJTable);
        ResultadosJTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (ResultadosJTable.getColumnModel().getColumnCount() > 0) {
            ResultadosJTable.getColumnModel().getColumn(0).setResizable(false);
            ResultadosJTable.getColumnModel().getColumn(1).setResizable(false);
            ResultadosJTable.getColumnModel().getColumn(2).setResizable(false);
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

    /**
     * Este metodo sirve para regresar al menu principal al hacer click en el
     * boton Volver
     *
     * @param evt Este evento se genera al hacer click en el boton
     */
    private void VolverJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverJButtonActionPerformed
        // TODO add your handling code here:
        this.menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VolverJButtonActionPerformed
    /**
     * Este metodo sirve para habilitar los campos para la busqueda del paciente
     * mediante el Rut, a la vez que desactiva los otros campos
     *
     * @param evt Este es el evento generado al hacer click en el boton
     * BusquedaRut
     */
    private void BusquedaRutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedaRutJButtonActionPerformed
        // TODO add your handling code here:
        NombreJTextField.setEnabled(false);
        BuscarNombreJButton.setEnabled(false);
        RutJTextField1.setEnabled(true);
        RutJTextField2.setEnabled(true);
        BuscarRUTJButton.setEnabled(true);
    }//GEN-LAST:event_BusquedaRutJButtonActionPerformed
    /**
     * Este metodo sirve para habilitar los campos para la busqueda del paciente
     * mediante el nombre, a la vez que desactiva los otros campos
     *
     * @param evt Este evento se genera cuando se hace click en el boton
     * BusquedaNombre
     */
    private void BusquedaNombreJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedaNombreJButtonActionPerformed
        // TODO add your handling code here:
        RutJTextField1.setEnabled(false);
        RutJTextField2.setEnabled(false);
        BuscarRUTJButton.setEnabled(false);
        NombreJTextField.setEnabled(true);
        BuscarNombreJButton.setEnabled(true);
    }//GEN-LAST:event_BusquedaNombreJButtonActionPerformed
    /**
     * Este metodo sirve para generar la busqueda del paciente por rut a la base
     * de datos con los datos ingresados en los campos a utilizar, y mostrarlo
     * en la tabla de resultados
     *
     * @param evt Este evento se genera al hacer click en el boton BuscarRUT
     */
    private void BuscarRUTJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarRUTJButtonActionPerformed
        String rutAnotado = RutJTextField1.getText() + RutJTextField2.getText();
        if (!RutJTextField1.getText().isEmpty() && !RutJTextField2.getText().isEmpty() && Rut.rutBienEscrito(rutAnotado)) {
            Rut rut = new Rut(rutAnotado);
            if (rut.isRutValido()) {
                Paciente pacienteObt = p.getHerramientaPersona().buscarPacientePorRut(rut);
                if (pacienteObt != null && p.getHerramientaPersona().personaExiste(pacienteObt) && pacienteObt.getTipo_persona().equals("PACIENTE")) {
                    Object[] row = {pacienteObt.getRut().getRut(), pacienteObt.getNombreCompleto(), pacienteObt.getIpdPaciente().getFechaDeGuardado().toString()};
                    if (!pacienteYaAgregado(pacienteObt)) {
                        model = (DefaultTableModel) ResultadosJTable.getModel();
                        pacientesObtenidos.add(pacienteObt);
                        model.addRow(row);
                        RutJTextField1.setText("");
                        RutJTextField2.setText("");
                    } else {
                        JOptionPane.showMessageDialog(null, "Ya se agrego ese paciente a la tabla");
                    }
                } else {
                    System.out.println(p.getTipo_persona());
                    JOptionPane.showMessageDialog(null, "No existe paciente asociado al rut especificado");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Rut invalido");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Rellene todos los campos");
        }

    }//GEN-LAST:event_BuscarRUTJButtonActionPerformed
    /**
     * Este metodo retorna el atributo que contiene la persona que usa este
     * programa
     *
     * @return Retorna un objeto de clase Persona
     */
    public Persona getP() {
        return p;
    }

    /**
     * Este metodo genera la busqueda del paciente en la base de datos mediante
     * el nombre obtenido de los campos que estaban destinados para ese fin, y
     * luego los muestra en la tabla de resultados
     *
     * @param evt Este evento se genera al hacer click en el boton BuscarNombre
     */
    private void BuscarNombreJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarNombreJButtonActionPerformed

        if (!NombreJTextField.getText().isEmpty()) {
            Paciente pacienteObt = p.getHerramientaPersona().buscarPacientePorNombre(NombreJTextField.getText());
            if (pacienteObt != null && p.getHerramientaPersona().personaExiste(pacienteObt) && pacienteObt.getTipo_persona().equals("PACIENTE")) {
                Object[] row = {pacienteObt.getRut().getRut(),
                    pacienteObt.getNombreCompleto(),
                    pacienteObt.getIpdPaciente().getFechaDeGuardado().toString()};
                if (!pacienteYaAgregado(pacienteObt)) {
                    model = (DefaultTableModel) ResultadosJTable.getModel();
                    pacientesObtenidos.add(pacienteObt);
                    model.addRow(row);
                    NombreJTextField.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Ya se agrego ese paciente a la tabla");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro una persona con ese nombre");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Rellene todos los campos");
        }
    }//GEN-LAST:event_BuscarNombreJButtonActionPerformed
    /**
     * Este metodo corrobora si un paciente ya fue agregado a la lista de
     * resultados
     *
     * @param p Recibe un objeto de clase Paciente que contiene los datos del
     * paciente a verificar
     * @return Retorna una variable boolean que contiene si el paciente fue
     * agregado o no
     */
    private boolean pacienteYaAgregado(Paciente p) {
        return pacientesObtenidos.stream().anyMatch(pacientesObtenido -> (p.getRutValidado().equals(pacientesObtenido.getRutValidado())));
    }

    

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

    /**
     * Este metodo genera una accion en caso de que se haga click en algun
     * resultado de la tabla de resultados de la busqueda del paciente
     *
     * @param e Este es el evento que se espera de la accion de hacer click en
     * la tabla de resultados
     */
    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getSource() == ResultadosJTable && e.getClickCount() == 2) {

            new IngresoCasoPaciente(pacientesObtenidos.get(ResultadosJTable.getSelectedRow()), this).setVisible(true);

        }

    }

    public JTable getResultadosJTable() {
        return ResultadosJTable;
    }

    public DefaultTableModel getModel() {
        return model;
    }

    /**
     * Este metodo no tiene implementacion
     *
     * @param e Evento generado por presionar un boton del mouse
     */
    @Override
    public void mousePressed(MouseEvent e) {
    }

    /**
     * Este metodo no tiene implementacion
     *
     * @param e Evento generado por soltar un boton de mouse
     */
    @Override
    public void mouseReleased(MouseEvent e) {
    }

    /**
     * Este metodo no tiene implementacion
     *
     * @param e Este evento se genera al posar el mouse sobre un componente
     */
    @Override
    public void mouseEntered(MouseEvent e) {
    }

    /**
     * Este metodo no tiene implementacion
     *
     * @param e Este evento se genera al posar el mouse sobre un componente
     */
    @Override
    public void mouseExited(MouseEvent e) {
    }
}
