
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harsh
 */
public class receivebook extends javax.swing.JFrame {

    /**
     * Creates new form receivebook
     */
    public receivebook() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Trajan Pro", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LIBRARY MANAGEMENT");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, 70));

        jLabel3.setFont(new java.awt.Font("Trajan Pro", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SYSTEM");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, 40));

        jLabel5.setFont(new java.awt.Font("Trajan Pro", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("RETURN BOOK");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 760));

        jLabel6.setBackground(new java.awt.Color(0, 0, 204));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("X");
        jLabel6.setOpaque(true);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 0, 60, 50));

        jLabel1.setFont(new java.awt.Font("Trajan Pro", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("User id");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, 170, 30));

        jLabel4.setFont(new java.awt.Font("Trajan Pro", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("First name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, 170, 30));

        jLabel7.setFont(new java.awt.Font("Trajan Pro", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("BOOK NAME");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, -1, 30));

        jLabel8.setFont(new java.awt.Font("Trajan Pro", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setText("Due date");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 430, 170, 30));

        jLabel11.setFont(new java.awt.Font("Trajan Pro", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 204));
        jLabel11.setText("charge");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 560, 170, 30));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 204));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 120, 240, 40));

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 0, 204));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 190, 240, 40));

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 0, 204));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 270, 380, 40));

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(0, 0, 204));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 350, 240, 40));

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(0, 0, 204));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 490, 240, 40));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Trajan Pro", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 204));
        jButton1.setText("Return book");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 680, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Trajan Pro", 1, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 204));
        jButton2.setText("SEARCH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 680, -1, -1));

        jLabel13.setFont(new java.awt.Font("Trajan Pro", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 204));
        jLabel13.setText("book id");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 500, 170, 30));

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(0, 0, 204));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 560, 240, 40));

        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(0, 0, 204));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 420, 240, 40));

        jLabel9.setFont(new java.awt.Font("Trajan Pro", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setText("ISSUE DATE");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 360, 170, 30));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 204));
        jButton4.setText("ADMIN");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 140, 50));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
void bookaddedback()
{
    try{
                Class.forName("java.sql.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/lib","root","abc");
                Statement st = con.createStatement();
                String query = "insert into addbook values("+booknumber+",'"+bookname+"','"+author+"','"+type+"');";
                st.executeUpdate(query);
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
}
void returnbook()
{
        try{
                String uid = jTextField1.getText();
                Class.forName("java.sql.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/lib","root","abc");
                Statement st = con.createStatement();
                String query = "delete from issuebook where userid = "+uid;
                st.executeUpdate(query);
                bookaddedback();
                JOptionPane.showMessageDialog(null, "BOOK RETURNED");
                empty();
           }                
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
}
String  booknumber,bookname,author,type;
void getdata()
{
            try
            {
                int aid=Integer.parseInt(jTextField1.getText());
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/lib","root","abc");
                Statement st = con.createStatement();
                String query = "select * from student where sid="+aid;
                ResultSet rs = st.executeQuery(query);
                rs.first();
                jTextField2.setText(rs.getString("fname"));               
                String query1 = "select * from issuebook where userid = "+aid;
                ResultSet rss = st.executeQuery(query1);
                rss.first();
                jTextField3.setText(rss.getString("bookname"));
                jTextField4.setText(rss.getString("issuedate"));
                jTextField5.setText(rss.getString("bookid"));
                jTextField7.setText(rss.getString("duedate"));
                bookname = rss.getString("bookname");
                booknumber = rss.getString("bookid");
                author = rss.getString("author");
                type = rss.getString("type");
                applicablecharge();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
}
void applicablecharge()
{   
    ZoneId z = ZoneId.of("Asia/Colombo");
    LocalDate today = LocalDate.now(z);
    String currentDate = today.toString();
    SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
    String idate = jTextField4.getText();
    String seconddate = currentDate;
    try
    {
        Date date1 = format.parse(idate);
        Date date2 = format.parse(seconddate);
        
        long dif = date2.getTime()-date1.getTime();
        
        int days = (int) (dif/(1000*60*60*24));
        System.out.print(""+days);
    
        if(days > 7)
        {
            days = days - 7;
            days = days*10;
            jTextField6.setText(days+"");
        }
        else
        {
            jTextField6.setText("0");
        }
    }
    catch(Exception e)
    {
        System.out.printf(e+"");
    }
}
String sdate;
void getdate()
{
    try
        {
            //int sid=Integer.parseInt(jTextField1.getText());
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/lib","root","abc");
            Statement st = con.createStatement();
            String query = "";
            ResultSet rs=st.executeQuery(query);
            while(rs.next())
            {
                sdate =rs.getString(1);
            } 
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
}
void empty()
{
    jTextField1.setText("");
    jTextField2.setText("");
    jTextField3.setText("");
    jTextField4.setText("");
    jTextField5.setText("");
    jTextField6.setText("");
    jTextField7.setText("");
}
    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        returnbook();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          getdata();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        admin_choice obj = new admin_choice();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c))
        {
            jTextField1.setEditable(false);
        }
        else
        {
            jTextField1.setEditable(true);
        }
    }//GEN-LAST:event_jTextField1KeyPressed

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
            java.util.logging.Logger.getLogger(receivebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(receivebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(receivebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(receivebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new receivebook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
