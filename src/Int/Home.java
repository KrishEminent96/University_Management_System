
package Int;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;


public class Home extends javax.swing.JFrame {

    
    public Home() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH); /*** To stay maximized the jFrame ***/

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        vchanc = new javax.swing.JButton();
        lect = new javax.swing.JButton();
        student = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        aboutus = new javax.swing.JButton();
        ContactUs = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UMS | WELCOME PAGE");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vchanc.setBackground(new java.awt.Color(153, 153, 153));
        vchanc.setIcon(new javax.swing.ImageIcon("C:\\Users\\KRISH\\Downloads\\boss.png")); // NOI18N
        vchanc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vchancActionPerformed(evt);
            }
        });
        jPanel1.add(vchanc, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, -1, -1));

        lect.setBackground(new java.awt.Color(255, 153, 204));
        lect.setIcon(new javax.swing.ImageIcon("C:\\Users\\KRISH\\Downloads\\teacher (1).png")); // NOI18N
        lect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lectActionPerformed(evt);
            }
        });
        jPanel1.add(lect, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 270, -1, -1));

        student.setBackground(new java.awt.Color(102, 102, 255));
        student.setIcon(new javax.swing.ImageIcon("C:\\Users\\KRISH\\Downloads\\graduate.png")); // NOI18N
        student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentActionPerformed(evt);
            }
        });
        jPanel1.add(student, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 270, -1, -1));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Vice Chancellor");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 550, -1, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 102));
        jLabel2.setText("Lecturers");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 550, 113, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Students");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 550, -1, -1));

        logout.setBackground(new java.awt.Color(0, 51, 255));
        logout.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 24)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Log Out");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 980, -1, -1));

        aboutus.setBackground(new java.awt.Color(255, 255, 102));
        aboutus.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        aboutus.setText("about us");
        aboutus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutusActionPerformed(evt);
            }
        });
        jPanel1.add(aboutus, new org.netbeans.lib.awtextra.AbsoluteConstraints(1680, 980, -1, -1));

        ContactUs.setBackground(new java.awt.Color(139, 133, 133));
        ContactUs.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        ContactUs.setText("contact");
        ContactUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContactUsActionPerformed(evt);
            }
        });
        jPanel1.add(ContactUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(1780, 980, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\KRISH\\Downloads\\Welcome to University of Wales (1).png")); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1940, 1080));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lectActionPerformed

         Lecturer lec = null;
        try {
            lec = new Lecturer();
        } catch (Exception e) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, e);
        }
        lec.setVisible(true); 
        
        setVisible(false); /* To close current window with opening other window */
         dispose();
    }//GEN-LAST:event_lectActionPerformed

    private void studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentActionPerformed
         
        // STUDENT BUTTON CODE to redirect the homepage to STUDENT page
        
        Student stu = null;
        try {
            stu = new Student();
            
        } catch (Exception e) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, e);
        }
        stu.setVisible(true);
        
        setVisible(false); /* To close current window with opening other window */
         dispose();
    }//GEN-LAST:event_studentActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        new Login().setVisible(true);
        
         setVisible(false); /* To close current window with opening other window */
         dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void aboutusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutusActionPerformed
        about ab = null;
        try {
            ab = new about();
            
        } catch (Exception e) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, e);
        }
        ab.setVisible(true); 
        
        setVisible(false); /* To close current window with opening other window */
         dispose();
    }//GEN-LAST:event_aboutusActionPerformed

    private void vchancActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vchancActionPerformed
         ViceChancellor vc = null;
        try {
            vc = new ViceChancellor();  /* Creating an object relevent to ViceChancellor() class  */

        } catch (Exception e) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, e);
        }
        vc.setVisible(true); /* Calling to ViceChancellor() class via that object, by calling the setVisible() method  */
        
         setVisible(false); /* To close current window with opening other window */
         dispose();
    }//GEN-LAST:event_vchancActionPerformed

    private void ContactUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContactUsActionPerformed
     
        ContactUs co = null;
        try {
            co = new ContactUs();
            //co.setVisible(true); 
            
        } catch (Exception e) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, e);
        }
        co.setVisible(true);
        
        setVisible(false); /* To close current window with opening other window */
         dispose();
        
        }//GEN-LAST:event_ContactUsActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ContactUs;
    private javax.swing.JButton aboutus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lect;
    private javax.swing.JButton logout;
    private javax.swing.JButton student;
    private javax.swing.JButton vchanc;
    // End of variables declaration//GEN-END:variables
}
