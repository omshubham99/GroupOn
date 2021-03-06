/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author OM SHUBHAM
 */
public class ChangePassword extends javax.swing.JFrame {

    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    /**
     * Creates new form ChangePassword
     */
    String cpwd=null,user=null;
    public ChangePassword() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(55,97,195));
    }
      public ChangePassword(String s,String u) {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(55,97,195));
        cpwd=s;
        user=u;
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
        jLabel2 = new javax.swing.JLabel();
        pwd_cpwd = new javax.swing.JPasswordField();
        pwd_newpassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        pwd_confirmpassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        pwd_update = new javax.swing.JButton();
        pwd_reset = new javax.swing.JButton();
        abort = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Change Password");

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Change Password");

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Current Password:");

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("New Password:");

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Confirm Password:");

        pwd_update.setBackground(new java.awt.Color(0, 153, 255));
        pwd_update.setText("Update");
        pwd_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwd_updateActionPerformed(evt);
            }
        });

        pwd_reset.setBackground(new java.awt.Color(0, 153, 255));
        pwd_reset.setText("Reset");
        pwd_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwd_resetActionPerformed(evt);
            }
        });

        abort.setBackground(new java.awt.Color(0, 153, 255));
        abort.setText("Cancel");
        abort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pwd_confirmpassword, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pwd_newpassword, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pwd_cpwd))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(abort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pwd_update, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pwd_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pwd_cpwd, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pwd_newpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pwd_confirmpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pwd_update, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(pwd_reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(abort))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pwd_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwd_updateActionPerformed
        Connection conn=null;
        String UpdateQuery = null;
        PreparedStatement pst = null;
        ResultSet rs=null;
        String s=pwd_cpwd.getText();
        String s1=pwd_newpassword.getText();
        String s2=pwd_confirmpassword.getText();
        if(s.equals(cpwd)) {
            conn=MysqlConnect.ConnectDB();
            if(s1.equals(s2)) {
                
                 if(s.equals(s1))
                      JOptionPane.showMessageDialog(null, "New Password should be different from Current Password!");
                 else{
                try {
                    UpdateQuery = "update login_info SET password=? WHERE username=?";
                    pst=conn.prepareStatement(UpdateQuery);
                    pst.setString(1,s1);
                    pst.setString(2, user);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Updated Successfully!");
                    dispose();
                } 
                catch (SQLException ex) {
                       JOptionPane.showMessageDialog(null, ex);
                }
              }
            }
            else {
                JOptionPane.showMessageDialog(null, "PASSWORD DOESN'T MATCH");
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "INCORRECT PASSWORD");
        }
    }//GEN-LAST:event_pwd_updateActionPerformed

    private void abortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abortActionPerformed
         
// TODO add your handling code here:
      dispose();
    }//GEN-LAST:event_abortActionPerformed

    private void pwd_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwd_resetActionPerformed
        // TODO add your handling code here:
        pwd_cpwd.setText(null);
        pwd_newpassword.setText(null);
        pwd_confirmpassword.setText(null);
        
    }//GEN-LAST:event_pwd_resetActionPerformed

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
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField pwd_confirmpassword;
    private javax.swing.JPasswordField pwd_cpwd;
    private javax.swing.JPasswordField pwd_newpassword;
    private javax.swing.JButton pwd_reset;
    private javax.swing.JButton pwd_update;
    // End of variables declaration//GEN-END:variables
}
