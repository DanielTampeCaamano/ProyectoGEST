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
public class DescargabaseDatos extends javax.swing.JFrame {

    private final Persona p;

    /**
     * Creates new form DescargabaseDatos
     * @param p
     */
    public DescargabaseDatos(Persona p) {
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
        DescargaBaseDatosJLabel = new javax.swing.JLabel();
        CasosVigentesJButton = new javax.swing.JButton();
        CasosExceptuadosJButton = new javax.swing.JButton();
        CasosCerradosJButton = new javax.swing.JButton();
        DiaFechaInicialCasosVigentesJTextField = new javax.swing.JTextField();
        MesFechaInicialCasosVigentesJTextField = new javax.swing.JTextField();
        AnioFechaInicialCasosVigentesJTextField = new javax.swing.JTextField();
        RangoFechaInicialJLabel = new javax.swing.JLabel();
        DiaFechaFinalCasosVigentesJTextField = new javax.swing.JTextField();
        MesFechaFinalCasosVigentesJTextField = new javax.swing.JTextField();
        AnioFechaFinalCasosVigentesJTextField = new javax.swing.JTextField();
        RangoFechaFinalJLabel = new javax.swing.JLabel();
        DiaFechaInicialCasosExceptuadosJTextField = new javax.swing.JTextField();
        MesFechaInicialCasosExceptuadosJTextField = new javax.swing.JTextField();
        AnioFechaInicialCasosExceptuadosJTextField = new javax.swing.JTextField();
        RangoFechaInicialCasosExceptuados = new javax.swing.JLabel();
        DiaFechaFinalCasosExceptuadosJTextField = new javax.swing.JTextField();
        MesFechaFinalCasosExceptuadosJTextField = new javax.swing.JTextField();
        AnioFechaFinalCasosExceptuadosJTextField = new javax.swing.JTextField();
        RangoFechaFinalCasosExceptuadosJLabel = new javax.swing.JLabel();
        DiaFechaInicialCasosCerradosJTextField = new javax.swing.JTextField();
        MesFechaInicialCasosCerradosJTextField = new javax.swing.JTextField();
        AnioFechaInicialCasosCerradosJTextField = new javax.swing.JTextField();
        RangoFechaInicialCasosCerradosJLabel = new javax.swing.JLabel();
        DiaFechaFinalCasosCerradosJTextField = new javax.swing.JTextField();
        MesFechaFinalCasosCerradosJTextField = new javax.swing.JTextField();
        AnioFechaFinalCasosCerradosJTextField = new javax.swing.JTextField();
        RangoFechaFinalCasosCerradosJLabel = new javax.swing.JLabel();
        DescargaJButton = new javax.swing.JButton();
        VolverJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ProyectoGES - Descarga de Base de Datos de Casos de Pacientes");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TituloJLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        TituloJLabel.setForeground(new java.awt.Color(0, 0, 0));
        TituloJLabel.setText("Sigges");
        getContentPane().add(TituloJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 23, -1, -1));

        DescargaBaseDatosJLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        DescargaBaseDatosJLabel.setForeground(new java.awt.Color(0, 0, 0));
        DescargaBaseDatosJLabel.setText("Descarga de Base de Datos de Casos de Pacientes");
        getContentPane().add(DescargaBaseDatosJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 73, -1, -1));

        CasosVigentesJButton.setText("Casos Vigentes");
        CasosVigentesJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasosVigentesJButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CasosVigentesJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 133, -1, -1));

        CasosExceptuadosJButton.setText("Casos Exceptuados");
        CasosExceptuadosJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasosExceptuadosJButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CasosExceptuadosJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 133, -1, -1));

        CasosCerradosJButton.setText("Casos Cerrados");
        CasosCerradosJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasosCerradosJButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CasosCerradosJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 133, -1, -1));

        DiaFechaInicialCasosVigentesJTextField.setEnabled(false);
        getContentPane().add(DiaFechaInicialCasosVigentesJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 230, 46, -1));

        MesFechaInicialCasosVigentesJTextField.setEnabled(false);
        getContentPane().add(MesFechaInicialCasosVigentesJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 230, 47, -1));

        AnioFechaInicialCasosVigentesJTextField.setEnabled(false);
        getContentPane().add(AnioFechaInicialCasosVigentesJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 230, 56, -1));

        RangoFechaInicialJLabel.setForeground(new java.awt.Color(0, 0, 0));
        RangoFechaInicialJLabel.setText("Rango Fecha Incial");
        RangoFechaInicialJLabel.setEnabled(false);
        getContentPane().add(RangoFechaInicialJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 198, -1, -1));

        DiaFechaFinalCasosVigentesJTextField.setEnabled(false);
        getContentPane().add(DiaFechaFinalCasosVigentesJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 294, 46, -1));

        MesFechaFinalCasosVigentesJTextField.setEnabled(false);
        getContentPane().add(MesFechaFinalCasosVigentesJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 294, 43, -1));

        AnioFechaFinalCasosVigentesJTextField.setEnabled(false);
        getContentPane().add(AnioFechaFinalCasosVigentesJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 294, 58, -1));

        RangoFechaFinalJLabel.setForeground(new java.awt.Color(0, 0, 0));
        RangoFechaFinalJLabel.setText("Rango Fecha Final");
        RangoFechaFinalJLabel.setEnabled(false);
        getContentPane().add(RangoFechaFinalJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 261, -1, -1));

        DiaFechaInicialCasosExceptuadosJTextField.setEnabled(false);
        getContentPane().add(DiaFechaInicialCasosExceptuadosJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 231, 45, -1));

        MesFechaInicialCasosExceptuadosJTextField.setEnabled(false);
        getContentPane().add(MesFechaInicialCasosExceptuadosJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 231, 50, -1));

        AnioFechaInicialCasosExceptuadosJTextField.setEnabled(false);
        getContentPane().add(AnioFechaInicialCasosExceptuadosJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 231, 52, -1));

        RangoFechaInicialCasosExceptuados.setForeground(new java.awt.Color(0, 0, 0));
        RangoFechaInicialCasosExceptuados.setText("Rango Fecha Incial");
        RangoFechaInicialCasosExceptuados.setEnabled(false);
        getContentPane().add(RangoFechaInicialCasosExceptuados, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 198, -1, -1));

        DiaFechaFinalCasosExceptuadosJTextField.setEnabled(false);
        getContentPane().add(DiaFechaFinalCasosExceptuadosJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 294, 45, -1));

        MesFechaFinalCasosExceptuadosJTextField.setEnabled(false);
        getContentPane().add(MesFechaFinalCasosExceptuadosJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 294, 50, -1));

        AnioFechaFinalCasosExceptuadosJTextField.setEnabled(false);
        getContentPane().add(AnioFechaFinalCasosExceptuadosJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 294, 51, -1));

        RangoFechaFinalCasosExceptuadosJLabel.setForeground(new java.awt.Color(0, 0, 0));
        RangoFechaFinalCasosExceptuadosJLabel.setText("Rango Fecha Final");
        RangoFechaFinalCasosExceptuadosJLabel.setEnabled(false);
        getContentPane().add(RangoFechaFinalCasosExceptuadosJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 261, -1, -1));

        DiaFechaInicialCasosCerradosJTextField.setEnabled(false);
        getContentPane().add(DiaFechaInicialCasosCerradosJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 231, 48, -1));

        MesFechaInicialCasosCerradosJTextField.setEnabled(false);
        getContentPane().add(MesFechaInicialCasosCerradosJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 231, 50, -1));

        AnioFechaInicialCasosCerradosJTextField.setEnabled(false);
        getContentPane().add(AnioFechaInicialCasosCerradosJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 231, 62, -1));

        RangoFechaInicialCasosCerradosJLabel.setForeground(new java.awt.Color(0, 0, 0));
        RangoFechaInicialCasosCerradosJLabel.setText("Rango Fecha Incial");
        RangoFechaInicialCasosCerradosJLabel.setEnabled(false);
        getContentPane().add(RangoFechaInicialCasosCerradosJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 198, -1, -1));

        DiaFechaFinalCasosCerradosJTextField.setEnabled(false);
        getContentPane().add(DiaFechaFinalCasosCerradosJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 294, 48, -1));

        MesFechaFinalCasosCerradosJTextField.setEnabled(false);
        getContentPane().add(MesFechaFinalCasosCerradosJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 294, 50, -1));

        AnioFechaFinalCasosCerradosJTextField.setEnabled(false);
        getContentPane().add(AnioFechaFinalCasosCerradosJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 294, 62, -1));

        RangoFechaFinalCasosCerradosJLabel.setForeground(new java.awt.Color(0, 0, 0));
        RangoFechaFinalCasosCerradosJLabel.setText("Rango Fecha Final");
        RangoFechaFinalCasosCerradosJLabel.setEnabled(false);
        getContentPane().add(RangoFechaFinalCasosCerradosJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 262, -1, -1));

        DescargaJButton.setText("Descargar");
        DescargaJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescargaJButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DescargaJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 393, -1, -1));

        VolverJButton.setText("Volver");
        VolverJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverJButtonActionPerformed(evt);
            }
        });
        getContentPane().add(VolverJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 393, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/med1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DescargaJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescargaJButtonActionPerformed
        // TODO add your handling code here:
        new GuardadoArchivo(p).setVisible(true);
    }//GEN-LAST:event_DescargaJButtonActionPerformed

    private void VolverJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverJButtonActionPerformed
        // TODO add your handling code here:
        new Menu(p).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VolverJButtonActionPerformed

    private void CasosVigentesJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasosVigentesJButtonActionPerformed
        // TODO add your handling code here:
        DiaFechaInicialCasosCerradosJTextField.setEnabled(false);
        MesFechaInicialCasosCerradosJTextField.setEnabled(false);
        AnioFechaInicialCasosCerradosJTextField.setEnabled(false);
        RangoFechaInicialCasosCerradosJLabel.setEnabled(false);
        DiaFechaFinalCasosCerradosJTextField.setEnabled(false);
        MesFechaFinalCasosCerradosJTextField.setEnabled(false);
        AnioFechaFinalCasosCerradosJTextField.setEnabled(false);
        RangoFechaFinalCasosCerradosJLabel.setEnabled(false);
        
        DiaFechaInicialCasosExceptuadosJTextField.setEnabled(false);
        MesFechaInicialCasosExceptuadosJTextField.setEnabled(false);
        AnioFechaInicialCasosExceptuadosJTextField.setEnabled(false);
        RangoFechaInicialCasosExceptuados.setEnabled(false);
        DiaFechaFinalCasosExceptuadosJTextField.setEnabled(false);
        MesFechaFinalCasosExceptuadosJTextField.setEnabled(false);
        AnioFechaFinalCasosExceptuadosJTextField.setEnabled(false);
        RangoFechaFinalCasosExceptuadosJLabel.setEnabled(false);
        
        DiaFechaInicialCasosVigentesJTextField.setEnabled(true);
        MesFechaInicialCasosVigentesJTextField.setEnabled(true);
        AnioFechaInicialCasosVigentesJTextField.setEnabled(true);
        RangoFechaInicialJLabel.setEnabled(true);
        DiaFechaFinalCasosVigentesJTextField.setEnabled(true);
        MesFechaFinalCasosVigentesJTextField.setEnabled(true);
        AnioFechaFinalCasosVigentesJTextField.setEnabled(true);
        RangoFechaFinalJLabel.setEnabled(true);
    }//GEN-LAST:event_CasosVigentesJButtonActionPerformed

    private void CasosExceptuadosJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasosExceptuadosJButtonActionPerformed
        // TODO add your handling code here:
        DiaFechaInicialCasosCerradosJTextField.setEnabled(false);
        MesFechaInicialCasosCerradosJTextField.setEnabled(false);
        AnioFechaInicialCasosCerradosJTextField.setEnabled(false);
        RangoFechaInicialCasosCerradosJLabel.setEnabled(false);
        DiaFechaFinalCasosCerradosJTextField.setEnabled(false);
        MesFechaFinalCasosCerradosJTextField.setEnabled(false);
        AnioFechaFinalCasosCerradosJTextField.setEnabled(false);
        RangoFechaFinalCasosCerradosJLabel.setEnabled(false);
        
        DiaFechaInicialCasosExceptuadosJTextField.setEnabled(true);
        MesFechaInicialCasosExceptuadosJTextField.setEnabled(true);
        AnioFechaInicialCasosExceptuadosJTextField.setEnabled(true);
        RangoFechaInicialCasosExceptuados.setEnabled(true);
        DiaFechaFinalCasosExceptuadosJTextField.setEnabled(true);
        MesFechaFinalCasosExceptuadosJTextField.setEnabled(true);
        AnioFechaFinalCasosExceptuadosJTextField.setEnabled(true);
        RangoFechaFinalCasosExceptuadosJLabel.setEnabled(true);
        
        DiaFechaInicialCasosVigentesJTextField.setEnabled(false);
        MesFechaInicialCasosVigentesJTextField.setEnabled(false);
        AnioFechaInicialCasosVigentesJTextField.setEnabled(false);
        RangoFechaInicialJLabel.setEnabled(false);
        DiaFechaFinalCasosVigentesJTextField.setEnabled(false);
        MesFechaFinalCasosVigentesJTextField.setEnabled(false);
        AnioFechaFinalCasosVigentesJTextField.setEnabled(false);
        RangoFechaFinalJLabel.setEnabled(false);
        
    }//GEN-LAST:event_CasosExceptuadosJButtonActionPerformed

    private void CasosCerradosJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasosCerradosJButtonActionPerformed
        // TODO add your handling code here:
        DiaFechaInicialCasosExceptuadosJTextField.setEnabled(false);
        MesFechaInicialCasosExceptuadosJTextField.setEnabled(false);
        AnioFechaInicialCasosExceptuadosJTextField.setEnabled(false);
        RangoFechaInicialCasosExceptuados.setEnabled(false);
        DiaFechaFinalCasosExceptuadosJTextField.setEnabled(false);
        MesFechaFinalCasosExceptuadosJTextField.setEnabled(false);
        AnioFechaFinalCasosExceptuadosJTextField.setEnabled(false);
        RangoFechaFinalCasosExceptuadosJLabel.setEnabled(false);
        
        DiaFechaInicialCasosVigentesJTextField.setEnabled(false);
        MesFechaInicialCasosVigentesJTextField.setEnabled(false);
        AnioFechaInicialCasosVigentesJTextField.setEnabled(false);
        RangoFechaInicialJLabel.setEnabled(false);
        DiaFechaFinalCasosVigentesJTextField.setEnabled(false);
        MesFechaFinalCasosVigentesJTextField.setEnabled(false);
        AnioFechaFinalCasosVigentesJTextField.setEnabled(false);
        RangoFechaFinalJLabel.setEnabled(false);
        
        DiaFechaInicialCasosCerradosJTextField.setEnabled(true);
        MesFechaInicialCasosCerradosJTextField.setEnabled(true);
        AnioFechaInicialCasosCerradosJTextField.setEnabled(true);
        RangoFechaInicialCasosCerradosJLabel.setEnabled(true);
        DiaFechaFinalCasosCerradosJTextField.setEnabled(true);
        MesFechaFinalCasosCerradosJTextField.setEnabled(true);
        AnioFechaFinalCasosCerradosJTextField.setEnabled(true);
        RangoFechaFinalCasosCerradosJLabel.setEnabled(true);
    }//GEN-LAST:event_CasosCerradosJButtonActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AnioFechaFinalCasosCerradosJTextField;
    private javax.swing.JTextField AnioFechaFinalCasosExceptuadosJTextField;
    private javax.swing.JTextField AnioFechaFinalCasosVigentesJTextField;
    private javax.swing.JTextField AnioFechaInicialCasosCerradosJTextField;
    private javax.swing.JTextField AnioFechaInicialCasosExceptuadosJTextField;
    private javax.swing.JTextField AnioFechaInicialCasosVigentesJTextField;
    private javax.swing.JButton CasosCerradosJButton;
    private javax.swing.JButton CasosExceptuadosJButton;
    private javax.swing.JButton CasosVigentesJButton;
    private javax.swing.JLabel DescargaBaseDatosJLabel;
    private javax.swing.JButton DescargaJButton;
    private javax.swing.JTextField DiaFechaFinalCasosCerradosJTextField;
    private javax.swing.JTextField DiaFechaFinalCasosExceptuadosJTextField;
    private javax.swing.JTextField DiaFechaFinalCasosVigentesJTextField;
    private javax.swing.JTextField DiaFechaInicialCasosCerradosJTextField;
    private javax.swing.JTextField DiaFechaInicialCasosExceptuadosJTextField;
    private javax.swing.JTextField DiaFechaInicialCasosVigentesJTextField;
    private javax.swing.JTextField MesFechaFinalCasosCerradosJTextField;
    private javax.swing.JTextField MesFechaFinalCasosExceptuadosJTextField;
    private javax.swing.JTextField MesFechaFinalCasosVigentesJTextField;
    private javax.swing.JTextField MesFechaInicialCasosCerradosJTextField;
    private javax.swing.JTextField MesFechaInicialCasosExceptuadosJTextField;
    private javax.swing.JTextField MesFechaInicialCasosVigentesJTextField;
    private javax.swing.JLabel RangoFechaFinalCasosCerradosJLabel;
    private javax.swing.JLabel RangoFechaFinalCasosExceptuadosJLabel;
    private javax.swing.JLabel RangoFechaFinalJLabel;
    private javax.swing.JLabel RangoFechaInicialCasosCerradosJLabel;
    private javax.swing.JLabel RangoFechaInicialCasosExceptuados;
    private javax.swing.JLabel RangoFechaInicialJLabel;
    private javax.swing.JLabel TituloJLabel;
    private javax.swing.JButton VolverJButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
