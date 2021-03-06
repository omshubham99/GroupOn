/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupon;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author OM SHUBHAM
 */
public class Profile extends javax.swing.JFrame {

    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    /**
     * Creates new form Profile
     */
    public Profile() {
        initComponents();
    }
    String user=null,pwd=null;
    public Profile(String u,String pd) {
        initComponents();
        user=u;
        pwd=pd;
        start();
    }
    

    String myimgPath = null;
    public ImageIcon ResizeImage(String ImagePath,byte[] pic) {
        ImageIcon MyImage = null;
        if(ImagePath!=null) {
            MyImage = new ImageIcon(ImagePath);
        }
        else {
            MyImage = new ImageIcon(pic);
        }
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(label_myprofilepic.getWidth(),label_myprofilepic.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image=new ImageIcon(newImg);
        return image;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        txt_myusername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_myregno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_mycontactno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_mycollege = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_mydob = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_mycountry = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_mystatus = new javax.swing.JTextField();
        bt_changepwd = new javax.swing.JButton();
        bt_save = new javax.swing.JButton();
        label_myname = new javax.swing.JLabel();
        bt_uploadimg = new javax.swing.JLabel();
        label_myprofilepic = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        l10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 550));
        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Username:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 160, 150, 30);

        txt_myusername.setEditable(false);
        txt_myusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_myusernameActionPerformed(evt);
            }
        });
        getContentPane().add(txt_myusername);
        txt_myusername.setBounds(180, 160, 280, 30);

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Registration No.");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 200, 160, 30);
        getContentPane().add(txt_myregno);
        txt_myregno.setBounds(180, 200, 280, 30);

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Contact No.");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 240, 150, 30);
        getContentPane().add(txt_mycontactno);
        txt_mycontactno.setBounds(180, 240, 280, 30);

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("College Name");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 280, 150, 30);
        getContentPane().add(txt_mycollege);
        txt_mycollege.setBounds(180, 280, 280, 30);

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Date of Birth");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 320, 150, 30);
        getContentPane().add(txt_mydob);
        txt_mydob.setBounds(180, 320, 280, 30);

        jLabel9.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Country:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 360, 150, 30);
        getContentPane().add(txt_mycountry);
        txt_mycountry.setBounds(180, 360, 280, 30);

        jLabel11.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("My Status:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 400, 150, 30);
        getContentPane().add(txt_mystatus);
        txt_mystatus.setBounds(180, 400, 280, 60);

        bt_changepwd.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        bt_changepwd.setText("Change Password");
        bt_changepwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_changepwdActionPerformed(evt);
            }
        });
        getContentPane().add(bt_changepwd);
        bt_changepwd.setBounds(250, 480, 160, 30);

        bt_save.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        bt_save.setText("Save Changes");
        bt_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_saveActionPerformed(evt);
            }
        });
        getContentPane().add(bt_save);
        bt_save.setBounds(70, 480, 150, 30);

        label_myname.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 30)); // NOI18N
        label_myname.setForeground(new java.awt.Color(0, 102, 102));
        label_myname.setText("My Name");
        label_myname.setToolTipText("");
        getContentPane().add(label_myname);
        label_myname.setBounds(130, 90, 280, 50);

        bt_uploadimg.setBackground(new java.awt.Color(102, 102, 102));
        bt_uploadimg.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        bt_uploadimg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bt_uploadimg.setText("Upload/Change");
        bt_uploadimg.setOpaque(true);
        bt_uploadimg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_uploadimgMouseClicked(evt);
            }
        });
        getContentPane().add(bt_uploadimg);
        bt_uploadimg.setBounds(0, 110, 110, 30);
        getContentPane().add(label_myprofilepic);
        label_myprofilepic.setBounds(0, 0, 110, 110);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 120, 140);

        jLabel2.setBackground(new java.awt.Color(255, 0, 0));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 520, 140);

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 34, 14);

        jLabel14.setBackground(new java.awt.Color(49, 27, 146));
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setOpaque(true);
        jLabel14.setPreferredSize(new java.awt.Dimension(500, 500));
        getContentPane().add(jLabel14);
        jLabel14.setBounds(0, 140, 520, 380);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(200, 520, 73, 23);
        getContentPane().add(l10);
        l10.setBounds(310, 520, 160, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    
    private void bt_changepwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_changepwdActionPerformed
        // TODO add your handling code here:
        ChangePassword cp=new ChangePassword(pwd,user);
        cp.setVisible(true);
    }//GEN-LAST:event_bt_changepwdActionPerformed

    private void bt_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_saveActionPerformed
        // TODO add your handling code here:
        String UpdateQuery = null;
        PreparedStatement pst = null;
        conn=MysqlConnect.ConnectDB();
        if(myimgPath==null) {
            try {
                UpdateQuery = "update login_info SET registration_no=?,dob=?,country=?,college=?,contact_no=?,status=?WHERE username=?";
                pst=conn.prepareStatement(UpdateQuery);
                pst.setString(1, txt_myregno.getText());
                pst.setString(2, txt_mydob.getText());
                pst.setString(3, txt_mycountry.getText());
                pst.setString(4, txt_mycollege.getText());
                pst.setString(5, txt_mycontactno.getText());
                pst.setString(6, txt_mystatus.getText());
                pst.setString(7, txt_myusername.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Profile Updated!");
            }
            catch(SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        else {
            try {
                InputStream img=new FileInputStream(new File(myimgPath));
                UpdateQuery="update login_info SET registration_no=?,dob=?,country=?,college=?,contact_no=?,status=?,image=? WHERE username=?";
                pst=conn.prepareStatement(UpdateQuery);
                pst.setString(1, txt_myregno.getText());
                pst.setString(2, txt_mydob.getText());
                pst.setString(3, txt_mycountry.getText());
                pst.setString(4, txt_mycollege.getText());
                pst.setString(5, txt_mycontactno.getText());
                pst.setString(6, txt_mystatus.getText());
                pst.setBlob(7,img);
                pst.setString(8, txt_myusername.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Profile Updated!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }//GEN-LAST:event_bt_saveActionPerformed

    private void bt_uploadimgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_uploadimgMouseClicked
        // TODO add your handling code here:
        conn=MysqlConnect.ConnectDB();
        JFileChooser file= new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        //filter the files
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images","jpg","gif","png");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        //if the user save it
        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile=file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            label_myprofilepic.setIcon(ResizeImage(path,null));
            myimgPath=path;
        }
        else if(result==JFileChooser.CANCEL_OPTION) {
            System.out.println("No File Select");
        }
    }//GEN-LAST:event_bt_uploadimgMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Profile pf=new Profile();
        pf.start();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_myusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_myusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_myusernameActionPerformed

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
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }
    public void start() {
        System.out.println(user);
    
           try {
            //label_myname.setText("bfhaf");
            conn=MysqlConnect.ConnectDB();
            String sql="SELECT * FROM login_info WHERE username=";
            Statement stmt = conn.createStatement();
            sql=sql+"'"+user+"'";
            rs=stmt.executeQuery(sql);
            System.out.println(sql);
            while(rs.next()){
                System.out.println(rs.getString("username"));
                label_myname.setText(rs.getString("full_name"));
                txt_myusername.setText(rs.getString("username"));
                txt_myregno.setText(rs.getString("registration_no"));
                txt_mycontactno.setText(rs.getString("contact_no"));
                txt_mycollege.setText(rs.getString("college"));
                txt_mydob.setText(rs.getString("dob"));
                txt_mycountry.setText(rs.getString("country"));
                txt_mystatus.setText(rs.getString("status"));
                byte[] img = rs.getBytes("image");
                        if(img!=null){
                            ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(label_myprofilepic.getWidth(), label_myprofilepic.getHeight(), Image.SCALE_SMOOTH));
                            label_myprofilepic.setIcon(imageIcon);
                        }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_changepwd;
    private javax.swing.JButton bt_save;
    private javax.swing.JLabel bt_uploadimg;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel l10;
    private javax.swing.JLabel label_myname;
    private javax.swing.JLabel label_myprofilepic;
    private javax.swing.JTextField txt_mycollege;
    private javax.swing.JTextField txt_mycontactno;
    private javax.swing.JTextField txt_mycountry;
    private javax.swing.JTextField txt_mydob;
    private javax.swing.JTextField txt_myregno;
    private javax.swing.JTextField txt_mystatus;
    private javax.swing.JTextField txt_myusername;
    // End of variables declaration//GEN-END:variables
}
