/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.fos_app.GUI;

/**
 *
 * @author khail
 */
public class MainMenuManagerGUI extends javax.swing.JFrame {

    /**
     * Creates new form MainMenuGUI
     */
    public MainMenuManagerGUI() {
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

        jLabel1 = new javax.swing.JLabel();
        vendorperformancebtn = new javax.swing.JButton();
        custcompbtn = new javax.swing.JButton();
        runnerperfbtn = new javax.swing.JButton();
        vendoritemsbtn = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(666, 523));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Manager Menu");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 260, -1));

        vendorperformancebtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        vendorperformancebtn.setText("Vendor Performance");
        vendorperformancebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendorperformancebtnActionPerformed(evt);
            }
        });
        getContentPane().add(vendorperformancebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 250, 70));

        custcompbtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        custcompbtn.setText("Customer Complaints");
        custcompbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custcompbtnActionPerformed(evt);
            }
        });
        getContentPane().add(custcompbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 270, 70));

        runnerperfbtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        runnerperfbtn.setText("Runner Performance");
        runnerperfbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runnerperfbtnActionPerformed(evt);
            }
        });
        getContentPane().add(runnerperfbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, 70));

        vendoritemsbtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        vendoritemsbtn.setText("Vendor Items");
        vendoritemsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendoritemsbtnActionPerformed(evt);
            }
        });
        getContentPane().add(vendoritemsbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 270, 70));

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton5.setText("Logout");
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void custcompbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custcompbtnActionPerformed
        ResolveComplaints rc = new ResolveComplaints();
        rc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_custcompbtnActionPerformed

    private void vendoritemsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendoritemsbtnActionPerformed
        ItemManagementManagerForm imf = new ItemManagementManagerForm();
        imf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_vendoritemsbtnActionPerformed

    private void runnerperfbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runnerperfbtnActionPerformed
        RunnerPerformance rp = new RunnerPerformance();
        rp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_runnerperfbtnActionPerformed

    private void vendorperformancebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendorperformancebtnActionPerformed
        VendorRevenueDashboard vrd = new VendorRevenueDashboard();
        vrd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_vendorperformancebtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenuManagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenuManagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenuManagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuManagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuManagerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton custcompbtn;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton runnerperfbtn;
    private javax.swing.JButton vendoritemsbtn;
    private javax.swing.JButton vendorperformancebtn;
    // End of variables declaration//GEN-END:variables
}
