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
 * @author Yining Chen
 */
public class TeacherChangePanel extends javax.swing.JPanel {

    /**
     * Creates new form TeacherRegisterPanel
     */
    private JPanel userProcessContainer;
    private DataStore dataStore;
    private Teacher teacher;

    public TeacherChangePanel() {

    }

    public TeacherChangePanel(JPanel userProcessContainer, DataStore dataStore, Teacher teacher) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.dataStore = dataStore;
        this.teacher = teacher;
        int tchId = teacher.getTeacherID();
        txtTchId.setText(tchId + "");
        txtTchId.setEditable(false);

        populateInputs();

    }

    private void populateInputs() {
        txtTchFname.setText(teacher.getFirstName());
        txtTchLname.setText(teacher.getLastName());
        txtTchAge.setText(Integer.toString(teacher.getAge()));
        txtTchPhone.setText(teacher.getPhoneNumber());
        txtTchAddress.setText(teacher.getAddress());
        txtGroupid.setText(Integer.toString(teacher.getGroupID()));
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
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtTchPhone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTchAddress = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        txtGroupid = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        reviewBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel2.setText("Teacher ID:");
        add(jLabel2);
        jLabel2.setBounds(240, 133, 71, 16);

        txtTchId.setEnabled(false);
        add(txtTchId);
        txtTchId.setBounds(365, 128, 109, 26);

        jLabel3.setText("First Name:");
        add(jLabel3);
        jLabel3.setBounds(240, 171, 72, 16);

        txtTchFname.setEnabled(false);
        add(txtTchFname);
        txtTchFname.setBounds(365, 166, 109, 26);

        jLabel4.setText("Last Name:");
        add(jLabel4);
        jLabel4.setBounds(240, 203, 70, 16);

        txtTchLname.setEnabled(false);
        txtTchLname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTchLnameActionPerformed(evt);
            }
        });
        add(txtTchLname);
        txtTchLname.setBounds(365, 198, 109, 26);

        jLabel5.setText("Age:");
        add(jLabel5);
        jLabel5.setBounds(240, 240, 28, 16);

        txtTchAge.setEnabled(false);
        txtTchAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTchAgeActionPerformed(evt);
            }
        });
        add(txtTchAge);
        txtTchAge.setBounds(365, 235, 109, 26);

        jButton1.setText("<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(76, 452, 97, 29);

        jLabel6.setText("Phone:");
        add(jLabel6);
        jLabel6.setBounds(240, 281, 42, 16);

        txtTchPhone.setEnabled(false);
        add(txtTchPhone);
        txtTchPhone.setBounds(365, 276, 109, 26);

        jLabel7.setText("Address:");
        add(jLabel7);
        jLabel7.setBounds(240, 341, 55, 16);

        txtTchAddress.setEnabled(false);
        add(txtTchAddress);
        txtTchAddress.setBounds(365, 336, 109, 26);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 100));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Teacher Information");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel1)
                .addContainerGap(599, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(36, 36, 36))
        );

        add(jPanel1);
        jPanel1.setBounds(0, 0, 900, 100);

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        add(updateBtn);
        updateBtn.setBounds(240, 439, 88, 38);

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        add(saveBtn);
        saveBtn.setBounds(384, 436, 88, 41);

        txtGroupid.setEnabled(false);
        txtGroupid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGroupidActionPerformed(evt);
            }
        });
        add(txtGroupid);
        txtGroupid.setBounds(363, 383, 109, 26);

        jLabel8.setText("GroupID:");
        add(jLabel8);
        jLabel8.setBounds(240, 368, 56, 56);

        reviewBtn.setText("Review");
        reviewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reviewBtnActionPerformed(evt);
            }
        });
        add(reviewBtn);
        reviewBtn.setBounds(510, 440, 90, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/neu/csye6200/View/icon/back.jpg"))); // NOI18N
        add(jLabel9);
        jLabel9.setBounds(0, 96, 1000, 600);
    }// </editor-fold>//GEN-END:initComponents

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

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        txtTchFname.setEnabled(true);
        txtTchLname.setEnabled(true);
        txtTchPhone.setEnabled(true);
        txtTchAddress.setEnabled(true);
        txtTchAge.setEnabled(true);
    }//GEN-LAST:event_updateBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
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

        //int tchId 
        String tchFname = txtTchFname.getText();
        String tchLname = txtTchLname.getText();
        String phone = txtTchPhone.getText();
        String address = txtTchAddress.getText();

        teacher.setFirstName(tchFname);
        teacher.setLastName(tchLname);
        teacher.setPhoneNumber(phone);
        teacher.setAddress(address);
        FileUtil.writeTeacherCsv();
        //RatioRule.techTogroup(dataStore.getTchList(), dataStore);
        //RatioRule.changeTech(teacher, dataStore);

        String success = "Change successfully!";
        txtTchFname.setEnabled(false);
        txtTchLname.setEnabled(false);
        txtTchPhone.setEnabled(false);
        txtTchAddress.setEnabled(false);
        txtTchAge.setEnabled(false);
        JOptionPane.showMessageDialog(null, success);
        toTeacherInfoScreen();

        for (Teacher t : dataStore.getTchList()) {
            System.out.println(t);
        }

    }//GEN-LAST:event_saveBtnActionPerformed

    private void txtGroupidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGroupidActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_txtGroupidActionPerformed

    private void reviewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reviewBtnActionPerformed
        // TODO add your handling code here:
        teacher.setRegisterState(true);
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
        String registerdate = dateFormat.format(date);
        teacher.setRegisterDate(registerdate);
        FileUtil.writeTeacherCsv();
        String success = "Annual review is successful!";
        JOptionPane.showMessageDialog(null, success);
        toTeacherInfoScreen();
    }//GEN-LAST:event_reviewBtnActionPerformed
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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton reviewBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField txtGroupid;
    private javax.swing.JTextField txtTchAddress;
    private javax.swing.JTextField txtTchAge;
    private javax.swing.JTextField txtTchFname;
    private javax.swing.JTextField txtTchId;
    private javax.swing.JTextField txtTchLname;
    private javax.swing.JTextField txtTchPhone;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
