

package Int;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.JFrame;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;



public class Welcome extends javax.swing.JFrame {

 
    public Welcome() {
        initComponents();
                        setExtendedState(JFrame.MAXIMIZED_BOTH); /*** To stay maximized the jFrame ***/

        
      
        
    }
    public void close(){
    
         setVisible(false); 
         dispose();
        
        
    }
    
    
    
    public static void toLogin(){
    
     Welcome load = new Welcome();
       
       load.setVisible(true);
        try{
            
           for(int i = 0; i < 100; i++)
           {
             Thread.sleep(60);
             load.progress.setValue(i);
             
             

           }
           
     
           }catch(Exception e)
        {
            
            System.out.println(e);
            
        }
        
        new Login().setVisible(true);
       
        
 
    }
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        progress = new javax.swing.JProgressBar();
        jLabel15 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UMS | Home Page");

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\KRISH\\Downloads\\Untitled design (25).png")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, -1, 466));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 80)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("UNIVERSITY OF  WALES");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 550, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("~ Feet on the ground, eyes towards the stars ~");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 660, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("welcome!");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 790, -1, -1));

        progress.setBackground(new java.awt.Color(255, 255, 255));
        progress.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 24)); // NOI18N
        progress.setForeground(new java.awt.Color(0, 0, 204));
        progress.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        progress.setStringPainted(true);
        jPanel1.add(progress, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 880, 870, 30));

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\KRISH\\Downloads\\Untitled design (47).png")); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Walse University - United Kingdom |");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 22, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 60, 295, 10));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 204));
        jLabel1.setText("University Management System");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 27, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\KRISH\\Downloads\\Untitled design (43).png")); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1480, 20, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\KRISH\\Downloads\\Untitled design (55).png")); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1600, 20, -1, 70));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1770, 10, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(241, 235, 62));
        jLabel10.setText("Accredited by IIE of UK");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1740, 80, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\KRISH\\Downloads\\Untitled design (34).png")); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 470, 870));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1760, 20, 110, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\KRISH\\Downloads\\wallpaperflare.com_wallpaper (26).jpg")); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1070));

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

    
    public static void main(String args[]) {
        
        toLogin();
    
        
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
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JProgressBar progress;
    // End of variables declaration//GEN-END:variables

}
