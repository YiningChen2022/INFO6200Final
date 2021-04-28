/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.View;

import edu.neu.csye6200.Controller.DataStore;
import edu.neu.csye6200.Object.Immunization;
import edu.neu.csye6200.Object.Student;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author chenyu
 */
public class ImmunizationRecordPanel extends javax.swing.JPanel {

    /**
     * Creates new form ImmunizatopnRecordPanel
     */
    private JPanel userProcessContainer;
    private DataStore dataStore;
    private Student stu;
    private static boolean hasExpiredCase = false;

    public ImmunizationRecordPanel() {

    }

    public ImmunizationRecordPanel(JPanel userProcessContainer, DataStore dataStore, Student stu) {
        initComponents(); //To change body of generated methods, choose Tools | Templates.
        this.userProcessContainer = userProcessContainer;
        this.dataStore = dataStore;
        this.stu = stu;
        txtStuid.setText(String.valueOf(stu.getStuID()));
        txtStuname.setText(stu.getFirstName() + " " + stu.getLastName());
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

        jLabel2 = new javax.swing.JLabel();
        txtStuid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtStuname = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 153, 51));
        setLayout(null);

        jLabel2.setText("Student ID:");
        add(jLabel2);
        jLabel2.setBounds(85, 123, 70, 16);

        txtStuid.setEditable(false);
        txtStuid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStuidActionPerformed(evt);
            }
        });
        add(txtStuid);
        txtStuid.setBounds(173, 118, 103, 26);

        jLabel3.setText("Student Name:");
        add(jLabel3);
        jLabel3.setBounds(521, 123, 92, 16);

        txtStuname.setEditable(false);
        txtStuname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStunameActionPerformed(evt);
            }
        });
        add(txtStuname);
        txtStuname.setBounds(631, 118, 116, 26);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Immunization Type", "1st Dose", "2nd Dose", "3rd Dose", "4th Dose", "5th Dose", "No. of Does Required"
            }
        ));
        jScrollPane1.setViewportView(table);

        add(jScrollPane1);
        jScrollPane1.setBounds(57, 162, 774, 266);

        jButton2.setText("<< Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(60, 450, 97, 29);

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(746, 440, 105, 29);

        jButton3.setText("Reference");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(746, 481, 105, 29);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 100));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Student Immunization Record");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel1)
                .addContainerGap(520, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(36, 36, 36))
        );

        add(jPanel1);
        jPanel1.setBounds(0, 0, 906, 100);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/neu/csye6200/View/icon/back.jpg"))); // NOI18N
        add(jLabel5);
        jLabel5.setBounds(0, 96, 900, 510);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = table.getSelectedRow();
        if (selectedRow >= 0) {
            Immunization imm = (Immunization) table.getValueAt(selectedRow, 0);
            ImmunizationUpdatePanel panel = new ImmunizationUpdatePanel(userProcessContainer, dataStore, imm);
            userProcessContainer.add("ImmunizationUpdatePanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row from table first", "warning", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int selectedRow = table.getSelectedRow();
        if (selectedRow >= 0) {
            Immunization imm = (Immunization) table.getValueAt(selectedRow, 0);
            Immunization immunization = dataStore.getImmuList().get(imm.getImmuName());

            ImmunizationInfoPanel panel = new ImmunizationInfoPanel(userProcessContainer, dataStore, immunization);
            userProcessContainer.add("ImmunizationInfoPanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row from table first", "warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtStunameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStunameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStunameActionPerformed

    private void txtStuidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStuidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStuidActionPerformed
    public void populate() {
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        dtm.setRowCount(0);
        for (Immunization record : stu.getImmunizationmap().values()) {
            Object row[] = new Object[7];
            String[] arr = record.getDate();
            row[0] = record;
            row[1] = arr[0];
            row[2] = arr[1];
            row[3] = arr[2];
            row[4] = arr[3];
            row[5] = arr[4];
            row[6] = record.getDose();
            if (checkExpired(record)) {
                hasExpiredCase = true;
            }
            dtm.addRow(row);
        }
        if (hasExpiredCase) {
            JOptionPane.showMessageDialog(null, "Student should take more does!");
        }
        hasExpiredCase = false;
        table.setDefaultRenderer(Object.class, new TableCellRenderer() {
            private DefaultTableCellRenderer DEFAULT_RENDERER = new DefaultTableCellRenderer();

            @Override
            public Component getTableCellRendererComponent(javax.swing.JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = DEFAULT_RENDERER.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (column == 0) {
                    System.out.println(value);
                    Immunization i = (Immunization) value;
                    if (checkExpired(i)) {
                        c.setBackground(Color.RED);
                    } else {
                        c.setBackground(Color.WHITE);
                    }
                }
                return c;
            }

        });
    }

    private boolean checkExpired(Immunization i) {
        int required = Integer.parseInt(i.getDose());
        int done = 0;
        String lastDate = null;
        for (String date : i.getDate()) {
            if (date != null && !date.equals("0") && !date.equals("") && !date.equals(" ")) {
                done++;
                lastDate = date;
            }
        }
        if (done >= required) {
            return false;
        } else if (lastDate != null && calculateDayDiff(lastDate, getCurrentDateString()) > 60) {
            return true;
        } else {
            return true;
        }
    }

    private String getCurrentDateString() {
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyyMMdd");
        return ft.format(dNow);
    }

    private Date stringToDate(String input) {
        SimpleDateFormat ft = new SimpleDateFormat("yyyyMMdd");
        Date date = null;
        try {
            date = ft.parse(input);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
        return date;
    }

    private int calculateDayDiff(String s1, String s2) {
        Date d1 = stringToDate(s1);
        Date d2 = stringToDate(s2);
        long t1 = d1.getTime();
        long t2 = d2.getTime();
        return (int) ((t2 - t1) / (1000 * 60 * 60 * 24));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtStuid;
    private javax.swing.JTextField txtStuname;
    // End of variables declaration//GEN-END:variables
}
