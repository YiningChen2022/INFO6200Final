/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.View;

import edu.neu.csye6200.Controller.DataStore;
import edu.neu.csye6200.Controller.FileUtil;
import edu.neu.csye6200.Object.Immunization;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class ImmunizationUpdatePanel extends javax.swing.JPanel {

    /**
     * Creates new form ImmunizationUpdatePanel
     */
    private DataStore datastore;
    private Immunization immunization;
    private JPanel userProcessContainer;

    public ImmunizationUpdatePanel() {

    }

    public ImmunizationUpdatePanel(JPanel userProcessContainer, DataStore dataStore, Immunization imm) {
        initComponents(); //To change body of generated methods, choose Tools | Templates.
        this.datastore = datastore;
        this.userProcessContainer = userProcessContainer;
        this.immunization = imm;
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
        String registerdate = dateFormat.format(date);
        txtDate.setText(registerdate);
        initialization();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtType = new javax.swing.JTextField();
        txtDose1 = new javax.swing.JTextField();
        txtDose2 = new javax.swing.JTextField();
        txtDose3 = new javax.swing.JTextField();
        txtDose4 = new javax.swing.JTextField();
        txtDose5 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel1.setText("Immunization Type");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(47, 224, 121, 16);

        jLabel2.setText("1st Dose");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(213, 224, 56, 16);

        jLabel3.setText("2nd Dose");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(333, 224, 60, 16);

        jLabel4.setText("3rd Dose");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(453, 224, 57, 16);

        jLabel5.setText("4th Dose");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(570, 220, 57, 16);

        jLabel6.setText("5th Dose");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(680, 220, 57, 16);
        jPanel2.add(txtType);
        txtType.setBounds(47, 258, 103, 26);
        jPanel2.add(txtDose1);
        txtDose1.setBounds(213, 258, 77, 26);
        jPanel2.add(txtDose2);
        txtDose2.setBounds(333, 258, 85, 26);
        jPanel2.add(txtDose3);
        txtDose3.setBounds(453, 258, 83, 26);
        jPanel2.add(txtDose4);
        txtDose4.setBounds(570, 260, 76, 26);
        jPanel2.add(txtDose5);
        txtDose5.setBounds(670, 260, 80, 26);

        jButton2.setText("Comfirm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(610, 360, 99, 29);

        jButton3.setText("<< Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(53, 446, 97, 29);

        jLabel10.setText("Date:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(626, 151, 33, 16);
        jPanel2.add(txtDate);
        txtDate.setBounds(671, 146, 101, 26);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 100));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel8.setText("Immunization Record Update");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(36, 36, 36))
        );

        jPanel2.add(jPanel1);
        jPanel1.setBounds(0, 0, 900, 100);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/neu/csye6200/View/icon/back.jpg"))); // NOI18N
        jPanel2.add(jLabel7);
        jLabel7.setBounds(0, 80, 1400, 710);

        add(jPanel2, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String[] arr = new String[5];
        arr[0] = txtDose1.getText();
        arr[1] = txtDose2.getText();
        arr[2] = txtDose3.getText();
        arr[3] = txtDose4.getText();
        arr[4] = txtDose5.getText();
        immunization.setDate(arr);
        FileUtil.writeCsv();
        JOptionPane.showMessageDialog(null, "Update successfully!");
        toImmunizationRecordScreen();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void toImmunizationRecordScreen() {
        CardLayout layout = (CardLayout) this.userProcessContainer.getLayout();
        this.userProcessContainer.remove(this);
        Component[] comps = this.userProcessContainer.getComponents();
        for (Component comp : comps) {
            if (comp instanceof ImmunizationRecordPanel) {
                ImmunizationRecordPanel panel = (ImmunizationRecordPanel) comp;
                panel.populate();
            }
        }
        layout.previous(userProcessContainer);
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void initialization() {
        String[] arr = immunization.getDate();
        txtType.setText(immunization.getImmuName());
        txtDose1.setText(arr[0]);
        txtDose2.setText(arr[1]);
        txtDose3.setText(arr[2]);
        txtDose4.setText(arr[3]);
        txtDose5.setText(arr[4]);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDose1;
    private javax.swing.JTextField txtDose2;
    private javax.swing.JTextField txtDose3;
    private javax.swing.JTextField txtDose4;
    private javax.swing.JTextField txtDose5;
    private javax.swing.JTextField txtType;
    // End of variables declaration//GEN-END:variables
}
