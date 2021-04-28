/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.View;

import edu.neu.csye6200.Controller.DataStore;
import edu.neu.csye6200.Object.Group;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chenyu
 */
public class TeacherArrangeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TeacherArrangePanel
     */
    private JPanel userProcessContainer;
    private DataStore dataStore;

    public TeacherArrangeJPanel() {
        initComponents();
    }

    TeacherArrangeJPanel(JPanel userProcessContainer, DataStore dataStore) {
        initComponents(); //To change body of generated methods, choose Tools | Templates.
        this.userProcessContainer = userProcessContainer;
        this.dataStore = dataStore;
        populate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAnnualReport = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAllStuReport = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Teacher ID", "Teacher Name", "Classroom", "Group ID"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1);
        jScrollPane1.setBounds(39, 129, 799, 258);

        btnAnnualReport.setText("Annual Report");
        btnAnnualReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnualReportActionPerformed(evt);
            }
        });
        add(btnAnnualReport);
        btnAnnualReport.setBounds(610, 430, 221, 29);

        jButton3.setText("<<Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(30, 489, 93, 29);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 100));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Teacher and Classroom arrangement ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(473, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(34, 34, 34))
        );

        add(jPanel1);
        jPanel1.setBounds(0, 0, 900, 100);

        btnAllStuReport.setText("All Student Report");
        btnAllStuReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllStuReportActionPerformed(evt);
            }
        });
        add(btnAllStuReport);
        btnAllStuReport.setBounds(610, 470, 221, 31);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/neu/csye6200/View/icon/back.jpg"))); // NOI18N
        add(jLabel5);
        jLabel5.setBounds(0, 96, 1000, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnnualReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnualReportActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow >= 0) {
            Group group = (Group) jTable1.getValueAt(selectedRow, 0);
            TeacherReportPanel panel = new TeacherReportPanel(userProcessContainer, dataStore, group);
            userProcessContainer.add("teacherReportJPanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row from table first", "warning", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_btnAnnualReportActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnAllStuReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllStuReportActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow >= 0) {
            Group group = (Group) jTable1.getValueAt(selectedRow, 0);
            AllStudentsImmuJPanel panel = new AllStudentsImmuJPanel(userProcessContainer, dataStore, group);
            userProcessContainer.add("allStudentsImmuJPanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row from table first", "warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAllStuReportActionPerformed
    private void populate() {
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        List<Group> grouplist = new ArrayList<>(dataStore.getGroupList());

        for (Group group : grouplist) {
            if (group.isTech() && group.getTeacher().isRegisterState()) {
                Object row[] = new Object[4];
                row[0] = group;
                row[1] = group.getTeacher().getFirstName() + " " + group.getTeacher().getLastName();
                row[3] = group.getClassID();
                row[2] = group.getGroupID();

                dtm.addRow(row);
            }
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAllStuReport;
    private javax.swing.JButton btnAnnualReport;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
