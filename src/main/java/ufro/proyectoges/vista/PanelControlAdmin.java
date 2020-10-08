/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufro.proyectoges.vista;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import ufro.proyectoges.backend.entidades.Persona;
import ufro.proyectoges.backend.entidades.temporizador.Temporizador;

/**
 * Esta ventana meneja las acciones del administrador
 *
 * @author shido
 */
public class PanelControlAdmin extends javax.swing.JFrame implements MouseListener, KeyListener, MouseMotionListener {

    private final Persona persona;

    /**
     * Creates new form PanelControlAdmin
     *
     * @param persona Persona que suar este programa
     */
    public PanelControlAdmin(Persona persona) {
        this.persona = persona;
        initComponents();
        addMouseMotionListener(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        panelAdmin = new javax.swing.JPanel();
        agregarRegistradorRadioButton = new javax.swing.JRadioButton();
        agregarMonitorButton = new javax.swing.JRadioButton();
        paneAgreg = new javax.swing.JPanel();
        labelNombre = new javax.swing.JLabel();
        fieldNombre = new javax.swing.JTextField();
        labelRut = new javax.swing.JLabel();
        rutFielld1 = new javax.swing.JTextField();
        rutField2 = new javax.swing.JTextField();
        claveField = new javax.swing.JTextField();
        claveLabel = new javax.swing.JLabel();
        confirmClaveLabel = new javax.swing.JLabel();
        confirmClaveField = new javax.swing.JTextField();
        elimRegis = new javax.swing.JRadioButton();
        elimMonitor = new javax.swing.JRadioButton();
        panelElim = new javax.swing.JPanel();
        registradores = new javax.swing.JComboBox<>();
        elimRegisSeleccionado = new javax.swing.JToggleButton();
        panelModificacion = new javax.swing.JPanel();
        labelNombre2 = new javax.swing.JLabel();
        fieldNombre2 = new javax.swing.JTextField();
        labelRut2 = new javax.swing.JLabel();
        rutFielld3 = new javax.swing.JTextField();
        rutField4 = new javax.swing.JTextField();
        claveField2 = new javax.swing.JTextField();
        claveLabel2 = new javax.swing.JLabel();
        confirmClaveLabel2 = new javax.swing.JLabel();
        confirmClaveField2 = new javax.swing.JTextField();
        confirmModif = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        modifRegis = new javax.swing.JRadioButton();
        modisMoni = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelAdmin.setLayout(null);

        agregarRegistradorRadioButton.setText("Agregar Registrador");
        agregarRegistradorRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarRegistradorRadioButtonActionPerformed(evt);
            }
        });
        panelAdmin.add(agregarRegistradorRadioButton);
        agregarRegistradorRadioButton.setBounds(32, 31, 124, 23);

        agregarMonitorButton.setText("Agregar Monitor");
        agregarMonitorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarMonitorButtonActionPerformed(evt);
            }
        });
        panelAdmin.add(agregarMonitorButton);
        agregarMonitorButton.setBounds(354, 31, 103, 23);

        labelNombre.setText("Nombre");

        fieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNombreActionPerformed(evt);
            }
        });

        labelRut.setText("Rut");

        rutFielld1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rutFielld1ActionPerformed(evt);
            }
        });

        claveLabel.setText("Clave");

        confirmClaveLabel.setText("Confirme clave");

        confirmClaveField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmClaveFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneAgregLayout = new javax.swing.GroupLayout(paneAgreg);
        paneAgreg.setLayout(paneAgregLayout);
        paneAgregLayout.setHorizontalGroup(
            paneAgregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneAgregLayout.createSequentialGroup()
                .addGroup(paneAgregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneAgregLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(paneAgregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelRut)
                            .addComponent(claveLabel)))
                    .addGroup(paneAgregLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(confirmClaveLabel)))
                .addGap(19, 19, 19)
                .addGroup(paneAgregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneAgregLayout.createSequentialGroup()
                        .addComponent(rutFielld1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rutField2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(paneAgregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(confirmClaveField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                        .addComponent(claveField, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        paneAgregLayout.setVerticalGroup(
            paneAgregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneAgregLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(paneAgregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre)
                    .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paneAgregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRut)
                    .addComponent(rutFielld1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rutField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paneAgregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(claveField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(claveLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paneAgregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmClaveLabel)
                    .addComponent(confirmClaveField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelAdmin.add(paneAgreg);
        paneAgreg.setBounds(71, 56, 584, 140);

        elimRegis.setText("Eliminar Registrador");
        panelAdmin.add(elimRegis);
        elimRegis.setBounds(32, 203, 120, 23);

        elimMonitor.setText("Eliminar Monitor");
        panelAdmin.add(elimMonitor);
        elimMonitor.setBounds(428, 203, 99, 23);

        registradores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        elimRegisSeleccionado.setText("Eliminar Seleccionado");

        javax.swing.GroupLayout panelElimLayout = new javax.swing.GroupLayout(panelElim);
        panelElim.setLayout(panelElimLayout);
        panelElimLayout.setHorizontalGroup(
            panelElimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelElimLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(registradores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(elimRegisSeleccionado)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        panelElimLayout.setVerticalGroup(
            panelElimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelElimLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panelElimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registradores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(elimRegisSeleccionado))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        panelAdmin.add(panelElim);
        panelElim.setBounds(136, 228, 277, 79);

        labelNombre2.setText("Nombre");

        fieldNombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNombre2ActionPerformed(evt);
            }
        });

        labelRut2.setText("Rut");

        rutFielld3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rutFielld3ActionPerformed(evt);
            }
        });

        claveLabel2.setText("Clave");

        confirmClaveLabel2.setText("Confirme clave");

        confirmClaveField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmClaveField2ActionPerformed(evt);
            }
        });

        confirmModif.setText("Confirmar");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout panelModificacionLayout = new javax.swing.GroupLayout(panelModificacion);
        panelModificacion.setLayout(panelModificacionLayout);
        panelModificacionLayout.setHorizontalGroup(
            panelModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelModificacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelModificacionLayout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(labelNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelModificacionLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(confirmClaveLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelRut2)
                                .addComponent(claveLabel2)))))
                .addGap(18, 18, 18)
                .addGroup(panelModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelModificacionLayout.createSequentialGroup()
                        .addComponent(rutFielld3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rutField4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fieldNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(claveField2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmClaveField2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmModif, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        panelModificacionLayout.setVerticalGroup(
            panelModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModificacionLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNombre2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRut2)
                    .addComponent(rutFielld3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rutField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(claveLabel2)
                    .addComponent(claveField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelModificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirmClaveLabel2)
                    .addComponent(confirmClaveField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmModif)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        panelAdmin.add(panelModificacion);
        panelModificacion.setBounds(20, 353, 583, 199);

        modifRegis.setText("Modificar Datos Registrador");
        modifRegis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifRegisActionPerformed(evt);
            }
        });
        panelAdmin.add(modifRegis);
        modifRegis.setBounds(32, 328, 159, 23);

        modisMoni.setText("Modificar Datos Monitor");
        panelAdmin.add(modisMoni);
        modisMoni.setBounds(390, 328, 138, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * no contiene implementaciones
     *
     *
     * @param evt .
     */
    private void agregarRegistradorRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarRegistradorRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agregarRegistradorRadioButtonActionPerformed
    /**
     * no contiene implementaciones
     *
     *
     * @param evt .
     */
    private void agregarMonitorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarMonitorButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agregarMonitorButtonActionPerformed
    /**
     * no contiene implementaciones
     *
     *
     * @param evt .
     */
    private void fieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNombreActionPerformed
    /**
     * no contiene implementaciones
     *
     *
     * @param evt .
     */
    private void rutFielld1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rutFielld1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rutFielld1ActionPerformed
    /**
     * no contiene implementaciones
     *
     *
     * @param evt .
     */
    private void confirmClaveFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmClaveFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmClaveFieldActionPerformed
    /**
     * no contiene implementaciones
     *
     *
     * @param evt .
     */
    private void fieldNombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNombre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNombre2ActionPerformed
    /**
     * no contiene implementaciones
     *
     *
     * @param evt .
     */
    private void rutFielld3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rutFielld3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rutFielld3ActionPerformed
    /**
     * no contiene implementaciones
     *
     *
     * @param evt .
     */
    private void confirmClaveField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmClaveField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmClaveField2ActionPerformed
    /**
     * no contiene implementaciones
     *
     *
     * @param evt .
     */
    private void modifRegisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifRegisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modifRegisActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton agregarMonitorButton;
    private javax.swing.JRadioButton agregarRegistradorRadioButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JTextField claveField;
    private javax.swing.JTextField claveField2;
    private javax.swing.JLabel claveLabel;
    private javax.swing.JLabel claveLabel2;
    private javax.swing.JTextField confirmClaveField;
    private javax.swing.JTextField confirmClaveField2;
    private javax.swing.JLabel confirmClaveLabel;
    private javax.swing.JLabel confirmClaveLabel2;
    private javax.swing.JButton confirmModif;
    private javax.swing.JRadioButton elimMonitor;
    private javax.swing.JRadioButton elimRegis;
    private javax.swing.JToggleButton elimRegisSeleccionado;
    private javax.swing.JTextField fieldNombre;
    private javax.swing.JTextField fieldNombre2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelNombre2;
    private javax.swing.JLabel labelRut;
    private javax.swing.JLabel labelRut2;
    private javax.swing.JRadioButton modifRegis;
    private javax.swing.JRadioButton modisMoni;
    private javax.swing.JPanel paneAgreg;
    private javax.swing.JPanel panelAdmin;
    private javax.swing.JPanel panelElim;
    private javax.swing.JPanel panelModificacion;
    private javax.swing.JComboBox<String> registradores;
    private javax.swing.JTextField rutField2;
    private javax.swing.JTextField rutField4;
    private javax.swing.JTextField rutFielld1;
    private javax.swing.JTextField rutFielld3;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
        Temporizador.resetTemporizador(this);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Temporizador.resetTemporizador(this);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        Temporizador.resetTemporizador(this);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        Temporizador.resetTemporizador(this);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Temporizador.resetTemporizador(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        Temporizador.resetTemporizador(this);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        Temporizador.resetTemporizador(this);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        Temporizador.resetTemporizador(this);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Temporizador.resetTemporizador(this);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        Temporizador.resetTemporizador(this);
    }
}
