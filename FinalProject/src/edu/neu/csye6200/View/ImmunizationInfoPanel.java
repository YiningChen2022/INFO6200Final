/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.View;

import edu.neu.csye6200.Controller.DataStore;
import edu.neu.csye6200.Object.Immunization;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author chenyu
 */
public class ImmunizationInfoPanel extends javax.swing.JPanel {

    /**
     * Creates new form ImmunizationInfoPanel
     */
    private JPanel userProcessContainer;
    private DataStore dataStore;
    private Immunization immunization;

    public ImmunizationInfoPanel() {

    }

    public ImmunizationInfoPanel(JPanel userProcessContainer, DataStore dataStore, Immunization immunization) {
        initComponents(); //To change body of generated methods, choose Tools | Templates.
        this.userProcessContainer = userProcessContainer;
        this.dataStore = dataStore;
        this.immunization = immunization;
        txtType.setText(immunization.getImmuName());
        txtDose.setText(immunization.getDose());
        txtDescription.setText(immunization.getDescription());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtType = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDose = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel3.setText("Immunization type:");
        add(jLabel3);
        jLabel3.setBounds(111, 177, 122, 16);

        txtType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTypeActionPerformed(evt);
            }
        });
        add(txtType);
        txtType.setBounds(276, 172, 342, 26);

        jLabel4.setText("Dose:");
        add(jLabel4);
        jLabel4.setBounds(197, 221, 36, 16);

        txtDose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoseActionPerformed(evt);
            }
        });
        add(txtDose);
        txtDose.setBounds(276, 216, 127, 26);

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        jScrollPane1.setViewportView(txtDescription);

        add(jScrollPane1);
        jScrollPane1.setBounds(276, 268, 482, 107);

        jLabel5.setText("Description:");
        add(jLabel5);
        jLabel5.setBounds(156, 268, 77, 16);

        jButton1.setText("<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(99, 443, 97, 29);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 100));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setText("Immunization Information");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        add(jPanel1);
        jPanel1.setBounds(0, 0, 906, 100);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/neu/csye6200/View/icon/back.jpg"))); // NOI18N
        add(jLabel6);
        jLabel6.setBounds(0, 96, 900, 510);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtDoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoseActionPerformed

    private void txtTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTypeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtDose;
    private javax.swing.JTextField txtType;
    // End of variables declaration//GEN-END:variables
}
