
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
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
public class adminLogin extends javax.swing.JFrame {

    /**
     * Creates new form adminLogin
     */
    public adminLogin() {
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

        jLabel3 = new javax.swing.JLabel();
        usrtxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pwdtxt = new javax.swing.JPasswordField();
        jLabellogin = new javax.swing.JLabel();
        jLabelcancel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        WTLMS = new javax.swing.JLabel();
        WTLMS1 = new javax.swing.JLabel();
        WTLMS2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("USERNAME");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 410, 260, -1));

        usrtxt.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        usrtxt.setForeground(new java.awt.Color(0, 0, 204));
        getContentPane().add(usrtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 410, 260, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("PASSWORD");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 500, -1, -1));

        pwdtxt.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        pwdtxt.setForeground(new java.awt.Color(0, 0, 204));
        pwdtxt.setEchoChar('*');
        getContentPane().add(pwdtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 490, 260, -1));

        jLabellogin.setBackground(new java.awt.Color(255, 255, 0));
        jLabellogin.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabellogin.setForeground(new java.awt.Color(0, 0, 204));
        jLabellogin.setText("LOGIN");
        jLabellogin.setOpaque(true);
        jLabellogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelloginMouseClicked(evt);
            }
        });
        getContentPane().add(jLabellogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 590, -1, -1));

        jLabelcancel.setBackground(new java.awt.Color(0, 0, 204));
        jLabelcancel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabelcancel.setForeground(new java.awt.Color(255, 255, 255));
        jLabelcancel.setText("Login as User?");
        jLabelcancel.setOpaque(true);
        jLabelcancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelcancelMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelcancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 660, 230, 40));

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        WTLMS.setBackground(new java.awt.Color(255, 255, 255));
        WTLMS.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        WTLMS.setForeground(new java.awt.Color(255, 255, 255));
        WTLMS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/adminlogog.png"))); // NOI18N
        jPanel1.add(WTLMS, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 80, 680, 540));

        WTLMS1.setBackground(new java.awt.Color(255, 255, 255));
        WTLMS1.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        WTLMS1.setForeground(new java.awt.Color(255, 255, 255));
        WTLMS1.setText("WELCOME TO LIBRARY MANAGEMENT SYSTEM");
        jPanel1.add(WTLMS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 680, 40));

        WTLMS2.setBackground(new java.awt.Color(255, 255, 255));
        WTLMS2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        WTLMS2.setForeground(new java.awt.Color(255, 255, 255));
        WTLMS2.setText("ADMINISTRATOR LOGIN");
        jPanel1.add(WTLMS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 530, 520, 110));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 740));

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
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 0, 60, 50));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/LMS_logo.PNG"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 30, -1, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/eyep.PNG"))); // NOI18N
        jLabel14.setOpaque(true);
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel14MouseExited(evt);
            }
        });
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 490, 50, 50));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelloginMouseClicked
        String usr = usrtxt.getText();
        String pwd = new String(pwdtxt.getPassword());
        if(usr.equalsIgnoreCase("admin") && pwd.equalsIgnoreCase("admin"))
        {
            admin_choice obj = new admin_choice();
            obj.setVisible(true);
            this.dispose();
        }
        else
        {
            try
            {
                 Class.forName("java.sql.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/lib","root","abc");
                Statement stmt = con.createStatement();
                String query = " select * from admin where adminname = '"+usr+"' and adminPass = '"+pwd+"';";
                ResultSet rs = stmt.executeQuery(query);

            if(rs.next()) 
                {
                    admin_choice obj = new admin_choice();
                    obj.setVisible(true);
                    this.dispose();
                }
            else
            {
                JOptionPane.showMessageDialog(null, "Incorrect username or password");
            }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_jLabelloginMouseClicked

    private void jLabelcancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelcancelMouseClicked
        student_login obj = new student_login();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabelcancelMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseEntered
        pwdtxt.setEchoChar((char)0);
    }//GEN-LAST:event_jLabel14MouseEntered

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseExited
        pwdtxt.setEchoChar('*');
    }//GEN-LAST:event_jLabel14MouseExited

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
            java.util.logging.Logger.getLogger(adminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel WTLMS;
    private javax.swing.JLabel WTLMS1;
    private javax.swing.JLabel WTLMS2;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelcancel;
    private javax.swing.JLabel jLabellogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pwdtxt;
    private javax.swing.JTextField usrtxt;
    // End of variables declaration//GEN-END:variables
}