/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.View;

import edu.neu.csye6200.Controller.DataStore;
import edu.neu.csye6200.Controller.FileUtil;
import edu.neu.csye6200.Controller.RatioRule;
import edu.neu.csye6200.Object.Teacher;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author chenyu
 */
public class TeacherRegisterPanel extends javax.swing.JPanel {

    /**
     * Creates new form TeacherRegisterPanel
     */
    private JPanel userProcessContainer;
    private DataStore dataStore;

    public TeacherRegisterPanel() {

    }

    public TeacherRegisterPanel(JPanel userProcessContainer, DataStore dataStore) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.dataStore = dataStore;
        int tchId = getMaxTchId(dataStore.getTchList()) + 1;
        txtTchId.setText(tchId + "");
        txtTchId.setEditable(false);
//To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtTchId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTchFname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTchLname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTchAge = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtTchPhone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTchAddress = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Teacher ID:");

        jLabel3.setText("First Name:");

        jLabel4.setText("Last Name:");

        txtTchLname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTchLnameActionPerformed(evt);
            }
        });

        jLabel5.setText("Age:");

        txtTchAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTchAgeActionPerformed(evt);
            }
        });

        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        jButton1.setText("<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Phone:");

        jLabel7.setText("Address:");

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 100));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("New Teacher Register");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel1)
                .addContainerGap(583, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtTchId, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTchFname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTchLname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTchAge, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTchPhone)
                            .addComponent(txtTchAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnRegister)
                .addGap(229, 229, 229))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTchId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTchFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTchLname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTchAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTchPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTchAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btnRegister)
                .addGap(29, 29, 29)
                .addComponent(jButton1)
                .addContainerGap(72, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        RatioRule.techTogroup(dataStore.getTchList(), dataStore);

        if (txtTchFname.getText().equals("") | txtTchLname.getText().equals("") | txtTchAge.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Teacher's information can not be empty");
            return;
        }

        try {
            Integer.parseInt(txtTchAge.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Teacher's age can not be letters");
            return;
        }
        try {
            Integer.parseInt(txtTchId.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Teacher's id can not be letters");
            return;
        }

        //int tchId =Integer.parseInt(txtTchId.getText());
        int tchId = getMaxTchId(dataStore.getTchList()) + 1;
        String tchFname = txtTchFname.getText();
        String tchLname = txtTchLname.getText();
        String phone = txtTchPhone.getText();
        String address = txtTchAddress.getText();
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
        String registerdate = dateFormat.format(date);

        Teacher teacher = new Teacher(tchId, tchFname, tchLname, phone, address, Integer.parseInt(txtTchAge.getText()));
        teacher.setRegisterState(true);
        teacher.setRegisterDate(registerdate);
        RatioRule.techTogroup(dataStore.getTchList(), dataStore);

        RatioRule.addTech(teacher, dataStore);
        FileUtil.writeTeacherCsv();
        String success = "Register successfully! and arranege to group" + teacher.getGroupID();
        for (Teacher t : dataStore.getTchList()) {
            System.out.println(t);
        }
        JOptionPane.showMessageDialog(null, success);
        toTeacherInfoScreen();

    }//GEN-LAST:event_btnRegisterActionPerformed

    private void txtTchAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTchAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTchAgeActionPerformed

    private void txtTchLnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTchLnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTchLnameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed
    private void toTeacherInfoScreen() {
        CardLayout layout = (CardLayout) this.userProcessContainer.getLayout();
        this.userProcessContainer.remove(this);
        Component[] comps = this.userProcessContainer.getComponents();
        for (Component comp : comps) {
            if (comp instanceof TeacherManagementPanel) {
                TeacherManagementPanel panel = (TeacherManagementPanel) comp;
                panel.populate();
            }
        }
        layout.previous(userProcessContainer);
    }

    private int getMaxTchId(List<Teacher> list) {
        int maxID = list.get(list.size() - 1).getTeacherID();
        return maxID;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtTchAddress;
    private javax.swing.JTextField txtTchAge;
    private javax.swing.JTextField txtTchFname;
    private javax.swing.JTextField txtTchId;
    private javax.swing.JTextField txtTchLname;
    private javax.swing.JTextField txtTchPhone;
    // End of variables declaration//GEN-END:variables
}
