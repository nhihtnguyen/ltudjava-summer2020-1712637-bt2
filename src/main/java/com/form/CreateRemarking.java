/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.form;

import com.entity.ReExaminationEntity;
import com.pakage.dao.ReExaminationDAO;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Nhi
 */
public class CreateRemarking extends javax.swing.JFrame {

    /**
     * Creates new form CreateRemarking
     */
    public CreateRemarking() {
        initComponents();
        initLayout();
         this.setLocationRelativeTo(null);
    }
     Boolean isLoad = false;
    private final String[] dayOfMonth = {"31", "28", "31", "30", "31", "30", "31", "31", "30", "31", "30", "31"};
    
    private void initLayout()
    {
        cmbDayFrom.removeAllItems();
        cmbDayTo.removeAllItems();
        cmbMonthFrom.removeAllItems();
        cmbMonthTo.removeAllItems();
        cmbYearFrom.removeAllItems();
        cmbYearTo.removeAllItems();
        for (int i = 1; i <= 31; i++) {
            String day = (i < 10 ? "0" : "") + String.valueOf(i);
            cmbDayFrom.addItem(String.valueOf(day));
            cmbDayTo.addItem(String.valueOf(day));
        }
        for (int i = 1; i <= 12; i++) {
            String month =  (i < 10 ? "0" : "") + String.valueOf(i);
            cmbMonthFrom.addItem(String.valueOf(month));
            cmbMonthTo.addItem(String.valueOf(month));
        }
        for (int i = 2018; i <= 2030; i++) {
            String year = String.valueOf(i);
            cmbYearFrom.addItem(String.valueOf(year));
            cmbYearTo.addItem(String.valueOf(year));
        }
        txtDate.setEnabled(false);
        isLoad = true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jlabel_Username = new javax.swing.JLabel();
        jlabel_Password2 = new javax.swing.JLabel();
        cmbDayTo = new javax.swing.JComboBox<>();
        cmbDayFrom = new javax.swing.JComboBox<>();
        cmbMonthTo = new javax.swing.JComboBox<>();
        cmbMonthFrom = new javax.swing.JComboBox<>();
        cmbYearFrom = new javax.swing.JComboBox<>();
        cmbYearTo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        bt_quayve = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Tao phuc khao");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jlabel_Username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlabel_Username.setText("Ngay bat dau :");
        jlabel_Username.setToolTipText("");

        jlabel_Password2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlabel_Password2.setText("Ngay ket thuc :");
        jlabel_Password2.setToolTipText("");

        cmbDayTo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbDayTo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDayToItemStateChanged(evt);
            }
        });

        cmbDayFrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbDayFrom.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDayFromItemStateChanged(evt);
            }
        });
        cmbDayFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDayFromActionPerformed(evt);
            }
        });

        cmbMonthTo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbMonthTo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbMonthToItemStateChanged(evt);
            }
        });

        cmbMonthFrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbMonthFrom.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbMonthFromItemStateChanged(evt);
            }
        });

        cmbYearFrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbYearFrom.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbYearFromItemStateChanged(evt);
            }
        });

        cmbYearTo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbYearTo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbYearToItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("TAO DON PHUC KHAO");

        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Ten dot phuc khao :");

        bt_quayve.setText("Quay Ve");
        bt_quayve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_quayveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlabel_Password2)
                    .addComponent(jlabel_Username)
                    .addComponent(jLabel1))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_quayve))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbDayTo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbDayFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbMonthTo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbMonthFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbYearTo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbYearFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(81, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(bt_quayve)))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlabel_Username)
                                .addComponent(cmbDayFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(25, 25, 25)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlabel_Password2)
                                .addComponent(cmbDayTo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(cmbMonthFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(25, 25, 25)
                            .addComponent(cmbMonthTo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmbYearFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(cmbYearTo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ReExaminationDAO requestDAO = new ReExaminationDAO();
        String name = txtName.getText();
        int dateFrom = Integer.valueOf(cmbDayFrom.getSelectedItem().toString());
        int monthFrom = Integer.valueOf(cmbMonthFrom.getSelectedItem().toString());
        int yearFrom = Integer.valueOf(cmbYearFrom.getSelectedItem().toString());
        Date dayFrom = new GregorianCalendar(yearFrom, monthFrom - 1, dateFrom).getTime();

        int dateTo = Integer.valueOf(cmbDayTo.getSelectedItem().toString());
        int monthTo = Integer.valueOf(cmbMonthTo.getSelectedItem().toString());
        int yearTo = Integer.valueOf(cmbYearTo.getSelectedItem().toString());
        Date dayTo = new GregorianCalendar(yearTo, monthTo - 1, dateTo).getTime();
        ReExaminationEntity item = new  ReExaminationEntity(name,dayFrom, dayTo);
        Boolean isUpdate = requestDAO.create(item);
        if (isUpdate){
            JOptionPane.showMessageDialog(null, "Thanh cong", "Them sinh vien thanh cong !", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "That bai", "Them sinh vien that bai !", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmbDayToItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDayToItemStateChanged
        // TODO add your handling code here:
        if (isLoad){
            updateRemark();
        }

    }//GEN-LAST:event_cmbDayToItemStateChanged

    private void cmbDayFromItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDayFromItemStateChanged
        // TODO add your handling code here:
        if (isLoad){
            updateRemark();
        }

    }//GEN-LAST:event_cmbDayFromItemStateChanged

    private void cmbMonthToItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbMonthToItemStateChanged
        // TODO add your handling code here:
        if (isLoad){
            updateRemark();
        }
    }//GEN-LAST:event_cmbMonthToItemStateChanged

    private void cmbMonthFromItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbMonthFromItemStateChanged
        // TODO add your handling code here:
        if (isLoad){
            updateRemark();
        }
    }//GEN-LAST:event_cmbMonthFromItemStateChanged

    private void cmbYearFromItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbYearFromItemStateChanged
        // TODO add your handling code here:
        if (isLoad){
            updateRemark();
        }
    }//GEN-LAST:event_cmbYearFromItemStateChanged

    private void cmbYearToItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbYearToItemStateChanged
        // TODO add your handling code here:
        if (isLoad){
            updateRemark();
        }
    }//GEN-LAST:event_cmbYearToItemStateChanged

    private void cmbDayFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDayFromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDayFromActionPerformed

    private void bt_quayveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_quayveActionPerformed
        // TODO add your handling code here:
        AdminDashboard ad = new AdminDashboard();
        ad.setVisible(true);
        this.setVisible(false);          // TODO add your handling code here:
    }//GEN-LAST:event_bt_quayveActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreateRemarking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateRemarking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateRemarking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateRemarking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateRemarking().setVisible(true);
            }
        });
    }
    
       public void updateRemark(){
        if (cmbDayFrom == null){
            return;
        }
        String from = cmbDayFrom.getSelectedItem().toString() + "/" + cmbMonthFrom.getSelectedItem().toString() + "/" + cmbYearFrom.getSelectedItem().toString();
        String to = cmbDayTo.getSelectedItem().toString() + "/" + cmbMonthTo.getSelectedItem().toString() + "/" + cmbYearTo.getSelectedItem().toString();
        String date = from + " - " + to;
        txtDate.setText(date);
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_quayve;
    private javax.swing.JComboBox<String> cmbDayFrom;
    private javax.swing.JComboBox<String> cmbDayTo;
    private javax.swing.JComboBox<String> cmbMonthFrom;
    private javax.swing.JComboBox<String> cmbMonthTo;
    private javax.swing.JComboBox<String> cmbYearFrom;
    private javax.swing.JComboBox<String> cmbYearTo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlabel_Password2;
    private javax.swing.JLabel jlabel_Username;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
