
import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harsh
 */
public class addstudent extends javax.swing.JFrame {

    /**
     * Creates new form newLogin
     */
    public addstudent() {
        //setExtendedState(getExtendedState() | adminLogin.MAXIMIZED_BOTH);
        this.setUndecorated(true);
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

        jPanel1 = new javax.swing.JPanel();
        jLabelcancel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelcancel.setBackground(new java.awt.Color(0, 0, 204));
        jLabelcancel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelcancel.setForeground(new java.awt.Color(255, 255, 255));
        jLabelcancel.setText("Already have an account?");
        jLabelcancel.setOpaque(true);
        jLabelcancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelcancelMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelcancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 270, 40));

        jLabel1.setFont(new java.awt.Font("Trajan Pro", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("JOIN LIBRARY MANAGEMENT SYSTEM");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 550, 80));

        jLabel2.setBackground(new java.awt.Color(0, 0, 204));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 60, 50));

        jLabel3.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("FIRST NAME");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 145, -1, -1));

        jLabel4.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("LAST NAME");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 145, -1, -1));

        jLabel5.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("E-MAIL ADDRESS");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        jTextField1.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 165, 180, 40));

        jTextField2.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 165, 220, 40));

        jTextField3.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 490, 40));

        jLabel6.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("USERNAME");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, -1, 20));

        jTextField4.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 490, 40));

        jLabel7.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("PASSWORD");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, -1, -1));

        jLabel8.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setText("SID");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        jTextField6.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 180, 40));

        jLabel9.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setText("PHONE NUMBER");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, -1, -1));

        jTextField7.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(0, 0, 204));
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField7KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 220, 40));

        jPasswordField1.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(0, 0, 204));
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, 490, 40));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Trajan Pro", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("JOIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 610, 470, 60));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/eyep.PNG"))); // NOI18N
        jLabel10.setOpaque(true);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 510, 50, 40));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 204));
        jButton3.setText("ADMIN");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 140, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 740));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
void clearfield(){
    jTextField1.setText("");
    jTextField2.setText("");
    jTextField3.setText("");
    jTextField4.setText("");
    jPasswordField1.setText("");
    jTextField6.setText("");
    jTextField7.setText("");
}
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabelcancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelcancelMouseClicked
        student_login obj = new student_login();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabelcancelMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        int a=JOptionPane.showConfirmDialog(this, "DO YOU WANT TO SAVE RECORDS ...?");
        if(a==0)
        {
            
            try
            {
                String fname = jTextField1.getText();
                String pname = jTextField2.getText();
                String email = jTextField3.getText();
                // int sid = Integer.parseInt(jTextField6.getText());
                //int num = Integer.parseInt(jTextField7.getText());
                String sid = jTextField6.getText();
                String num = jTextField7.getText();
                String uname = jTextField4.getText();
                String pass = jPasswordField1.getText();
                
                if(fname.isEmpty() || pname.isEmpty() || email.isEmpty() || sid.isEmpty() || num.isEmpty() || pass.isEmpty() || uname.isEmpty())
                {
                    JOptionPane.showMessageDialog(null,"ENTER ALL THE DETAILS");
                }
                else
                {
                    Class.forName("java.sql.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/lib","root","abc");
                    Statement st = con.createStatement();
                    String query = "insert into student values("+sid+",'"+fname+"','"+pname+"','"+email+"','"+num+"','"+uname+"','"+pass+"')";
                    st.executeUpdate(query);
                    clearfield();
                    JOptionPane.showMessageDialog(null,"User added successfully... Your username is - "+uname+"  and password is - "+pass);
                    student_login obj = new student_login();
                    obj.setVisible(true);
                    this.dispose();
                }
                
            }
             
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        if(a==1)
        {
            clearfield();
        }
        if(a==2)
        {
            addstudent obj = new addstudent();
            obj.setVisible(true);
            this.dispose();
        }  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
         jPasswordField1.setEchoChar('*');
    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
         jPasswordField1.setEchoChar((char)0);
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        admin_choice obj = new admin_choice();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
       
    }//GEN-LAST:event_jPasswordField1KeyPressed

    private void jTextField7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c))
        {
            jTextField7.setEditable(false);
        }
        else
        {
            jTextField7.setEditable(true);
        }
    }//GEN-LAST:event_jTextField7KeyPressed

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
            java.util.logging.Logger.getLogger(addstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addstudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelcancel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}