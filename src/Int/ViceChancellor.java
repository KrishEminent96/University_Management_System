
package Int;

import Code.dbConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class ViceChancellor extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public ViceChancellor() {
        initComponents();
        conn = dbConnect.connect();  // _*_*_Connecting dbConnect class to ViceChancellor class at the start_*_*_* 
        ResultSet rs = null;
                tableload();

                
    }
public void clear(){     // _*_*_Clearing the texts_*_*_*
    
       
        name.setText("");
        hometown.setText("");
        birthday.setText("");
        age.setText("");
        gender.setSelectedItem("");
        contact.setText("");
    
    }


public void tableload(){   // _*_*_Loading the table_*_*_*   
    
          try {
            
              String sql = "select * from vice_chancellor";
              pst = conn.prepareStatement(sql);
              rs = pst.executeQuery(sql);
              table.setModel(DbUtils.resultSetToTableModel(rs));
              
        } catch (Exception e) {
            
              System.err.println(e);
        }
    

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        hometown = new javax.swing.JTextField();
        birthday = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox<>();
        submit = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        delete = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        tohome = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UMS  |  Vice Chancellor Page");

        jPanel1.setBackground(new java.awt.Color(153, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("Vice Chancellor Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 33, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NAME :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 142, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BIRTHDAY  (YY-MM-DD) :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 215, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("AGE :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 288, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("GENDER :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 361, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("HOMETOWN :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 434, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CONTACT NO. :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 507, -1, -1));

        name.setBackground(new java.awt.Color(255, 204, 102));
        name.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 22)); // NOI18N
        name.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 135, 600, 38));

        hometown.setBackground(new java.awt.Color(255, 204, 102));
        hometown.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 22)); // NOI18N
        hometown.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(hometown, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 427, 495, 38));

        birthday.setBackground(new java.awt.Color(255, 204, 102));
        birthday.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 22)); // NOI18N
        birthday.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(birthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 208, 240, 38));

        age.setBackground(new java.awt.Color(255, 204, 102));
        age.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 22)); // NOI18N
        age.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 281, 240, 38));

        contact.setBackground(new java.awt.Color(255, 204, 102));
        contact.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 22)); // NOI18N
        contact.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, 255, 38));

        gender.setBackground(new java.awt.Color(255, 204, 102));
        gender.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 22)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "male", "female" }));
        gender.setBorder(null);
        jPanel1.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 354, 130, 38));

        submit.setBackground(new java.awt.Color(0, 0, 255));
        submit.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 26)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel1.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 556, -1, -1));

        clear.setBackground(new java.awt.Color(0, 0, 0));
        clear.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 26)); // NOI18N
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setText("clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(611, 556, -1, -1));

        update.setBackground(new java.awt.Color(250, 31, 31));
        update.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 26)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(712, 556, -1, -1));

        table.setBackground(new java.awt.Color(255, 204, 102));
        table.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 15)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "vcName", "vcBirthday", "vcAge", "vcGender", "vcHometown", "vcContactNo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setPreferredWidth(500);
            table.getColumnModel().getColumn(1).setPreferredWidth(30);
            table.getColumnModel().getColumn(2).setPreferredWidth(5);
            table.getColumnModel().getColumn(3).setPreferredWidth(30);
            table.getColumnModel().getColumn(4).setPreferredWidth(200);
            table.getColumnModel().getColumn(5).setPreferredWidth(70);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 693, 1316, 45));

        delete.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 26)); // NOI18N
        delete.setText("delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(831, 556, -1, -1));

        jLabel11.setFont(new java.awt.Font("Vivaldi", 1, 40)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("*");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 30, 40));

        jLabel12.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Please make sure to enter the data in the mentioned format. As per the format, \" - \" signs are mandatory and no spaces should be left.");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 1010, -1, -1));

        jLabel15.setFont(new java.awt.Font("Vivaldi", 1, 40)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("*");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1010, 30, 40));

        jLabel13.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Please make sure to enter the data in the mentioned format. As per the format, \" - \" signs are mandatory and no spaces should be left.");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 1010, -1, -1));

        jLabel16.setFont(new java.awt.Font("Vivaldi", 1, 40)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("*");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1010, 30, 40));

        jLabel14.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Please make sure to enter the data in the mentioned format. As per the format, \" - \" signs are mandatory and no spaces should be left.");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 1010, -1, -1));

        jLabel17.setFont(new java.awt.Font("Vivaldi", 1, 40)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 0));
        jLabel17.setText("*");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1010, 30, 40));

        jLabel18.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Please make sure to enter the data in the mentioned format. As per the format, \" - \" signs are mandatory and no spaces should be left.");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 1010, -1, -1));

        jLabel19.setFont(new java.awt.Font("Vivaldi", 1, 40)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        jLabel19.setText("*");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1010, 30, 40));

        tohome.setBackground(new java.awt.Color(255, 204, 51));
        tohome.setIcon(new javax.swing.ImageIcon("C:\\Users\\KRISH\\Downloads\\home (3).png")); // NOI18N
        tohome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tohomeActionPerformed(evt);
            }
        });
        jPanel1.add(tohome, new org.netbeans.lib.awtextra.AbsoluteConstraints(1730, 30, 60, 60));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\KRISH\\Downloads\\wallpaperflare.com_wallpaper (40).jpg")); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

        setSize(new java.awt.Dimension(1835, 999));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        
            String nametxt = name.getText();
            String birthdaytxt = birthday.getText();
            String agetxt = age.getText();
            String gendertxt = (String) gender.getSelectedItem();
            String hometowntxt = hometown.getText();
            int contactnotxt = Integer.parseInt(contact.getText());
    
           clear(); 
        
           try {
                
             
             String sql = "insert into vice_chancellor(vcName,vcBirthday,vcAge,vcGender,vcHometown,vcContactno) values ('"+nametxt+"','"+birthdaytxt+"','"+agetxt+"','"+gendertxt+"','"+hometowntxt+"','"+contactnotxt+"')";
             
                    pst = conn.prepareStatement(sql);
                    pst.execute();
                    tableload();
                    

                         JOptionPane.showMessageDialog(null, "Data added successfully!");

        } catch (Exception e) 
        
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error occured !. Please double check and try again");
            

        }
            
            
            
            
            
            
             
     
              
        
        
    }//GEN-LAST:event_submitActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
       
        clear();
        
        
    }//GEN-LAST:event_clearActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
          String nameupdate = name.getText();
            String birthdayupdate = birthday.getText();
            String ageupdate = age.getText();
            String genderupdate = (String) gender.getSelectedItem();
            String hometownupdate = hometown.getText();
            int contactnoupdate= Integer.parseInt(contact.getText());
            
             try {
                
                String sql = "update vice_chancellor set vcBirthday = '"+birthdayupdate+"', vcAge = '"+ageupdate+"',vcGender = '"+genderupdate+"', vcHometown = '"+hometownupdate+"',vcContactno = '"+contactnoupdate+"' where  vcName =  '"+nameupdate+"' ";
                pst = conn.prepareStatement(sql);
                pst.execute();
                tableload();
                JOptionPane.showMessageDialog(null, "UPDATED!");
            
        } catch (Exception e) {
            System.err.println(e);
                            JOptionPane.showMessageDialog(null, "CANNOT UPDATE!");

        }   
                                                  

    }//GEN-LAST:event_updateActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        
       int row = table.getSelectedRow();
        
        String sname = table.getValueAt(row, 0).toString();
        String sbirthday = table.getValueAt(row, 1).toString();
        String sage = table.getValueAt(row, 2).toString();
        String sgender = table.getValueAt(row, 3).toString();
        String shometown = table.getValueAt(row, 4).toString();
        
        String scontact = table.getValueAt(row, 5).toString();

        
        name.setText(sname);
        birthday.setText(sbirthday);
        age.setText(sage);
        gender.setSelectedItem(sgender);
        hometown.setText(shometown);
        contact.setText(scontact);
        
        
        
        
    }//GEN-LAST:event_tableMouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
         String VCNAME = name.getText();
        
        try{

        

            String sql =  "delete from vice_chancellor where vcName = '"+VCNAME+"' ";
        
            pst = conn.prepareStatement(sql);
            pst.execute();
           
            tableload();
            clear();
          
             JOptionPane.showMessageDialog(null,"DELETED !");
 
           
        }catch(Exception e){

            System.out.println(e);
            
            JOptionPane.showMessageDialog(null,"CANNOT DELETE !");

        }

    }//GEN-LAST:event_deleteActionPerformed

    private void tohomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tohomeActionPerformed
  Home home = null;
        try {
            home = new Home();
            
        } catch (Exception e) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, e);
    }
        
        setVisible(false); 
         dispose();
        home.setVisible(true);    }//GEN-LAST:event_tohomeActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(ViceChancellor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViceChancellor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViceChancellor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViceChancellor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
           
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViceChancellor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javax.swing.JTextField birthday;
    private javax.swing.JButton clear;
    private javax.swing.JTextField contact;
    private javax.swing.JButton delete;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JTextField hometown;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JButton submit;
    private javax.swing.JTable table;
    private javax.swing.JButton tohome;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
