/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.View;

import edu.neu.csye6200.Controller.DataStore;
import edu.neu.csye6200.Object.Group;
import edu.neu.csye6200.Object.Student;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class TeacherReportPanel extends javax.swing.JPanel {

    /**
     * Creates new form TeacherReportPanel
     */
    private JPanel userProcessContainer;
    private DataStore dataStore;
    private Group group;

    public TeacherReportPanel() {

    }

    public TeacherReportPanel(JPanel userProcessContainer, DataStore dataStore, Group group) {
        initComponents(); //To change body of generated methods, choose Tools | Templates.
        this.userProcessContainer = userProcessContainer;
        this.dataStore = dataStore;
        this.group = group;
        populate();
        txtTid.setText(String.valueOf(group.getTeacher().getTeacherID()));
        txtTname.setText(group.getTeacher().getFirstName() + " " + group.getTeacher().getLastName());

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
        txtTid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTname = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel2.setText("Teacher ID:");
        add(jLabel2);
        jLabel2.setBounds(99, 122, 71, 16);
        add(txtTid);
        txtTid.setBounds(182, 117, 121, 26);

        jLabel3.setText("Teacher Name:");
        add(jLabel3);
        jLabel3.setBounds(500, 122, 93, 16);
        add(txtTname);
        txtTname.setBounds(611, 117, 121, 26);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Student ID", "Student Name", "Age(Months)", "Parent Name", "Phone Number"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1);
        jScrollPane1.setBounds(69, 155, 699, 223);

        jButton2.setText("<< Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(70, 410, 97, 29);

        jButton1.setText("View Immunization Record");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(539, 413, 211, 29);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 100));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Teacher & Student Group Report");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel1)
                .addContainerGap(483, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(37, 37, 37))
        );

        add(jPanel1);
        jPanel1.setBounds(0, 0, 900, 100);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/neu/csye6200/View/icon/back.jpg"))); // NOI18N
        add(jLabel5);
        jLabel5.setBounds(0, 96, 1030, 610);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow >= 0) {
            Student stu = (Student) jTable1.getValueAt(selectedRow, 0);
            System.out.println(stu);
            ImmunizationRecordPanel panel = new ImmunizationRecordPanel(userProcessContainer, dataStore, stu);
            userProcessContainer.add("ImmunizationRecordJPanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row from table first", "Warning!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    public void populate() {
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        List<Student> stulist = new ArrayList<>(group.getStudentsList());
        for (Student student : stulist) {
            if (student.isRegisterState()) {
                Object row[] = new Object[5];
                row[0] = student;
                row[1] = student.getFirstName() + " " + student.getLastName();
                row[2] = student.getAge();
                row[3] = student.getParentFirstName() + " " + student.getParentLastName();
                row[4] = student.getPhoneNumber();
                dtm.addRow(row);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtTid;
    private javax.swing.JTextField txtTname;
    // End of variables declaration//GEN-END:variables
}
