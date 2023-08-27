
package Int;

import Code.dbConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class Lecturer extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public Lecturer() {
        initComponents();
        conn = dbConnect.connect();  // _*_*_Connecting dbConnect class to Lecturer class at the start_*_*_* 
        ResultSet rs = null;
        tableload();
    }
    
     public void tableload(){   // _*_*_Loading the table_*_*_*   
    
          try {
            
              String sql = "select * from lecturer";
              pst = conn.prepareStatement(sql);
              rs = pst.executeQuery(sql);
              table.setModel(DbUtils.resultSetToTableModel(rs));
              
        } catch (Exception e) {
            
              System.err.println(e);
        }
    

    }
     
     public void clear(){     // _*_*_Clearing the texts_*_*_*
    
        id.setText("");
        name.setText("");
        hometown.setText("");
        birthday.setText("");
        age.setText("");
        gender.setSelectedItem("");
        faculty.setSelectedItem("");
        contact.setText("");
    
    }
     
     

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        birthday = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        hometown = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        faculty = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        searchtxt1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tohome = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UMS  |  Lecturer Page");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Lecturer Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 42, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NAME :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 161, -1, -1));

        name.setBackground(new java.awt.Color(204, 102, 255));
        name.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 22)); // NOI18N
        name.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 154, 600, 38));

        birthday.setBackground(new java.awt.Color(204, 102, 255));
        birthday.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 22)); // NOI18N
        birthday.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(birthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 227, 240, 38));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BIRTHDAY  (YY-MM-DD) :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 234, -1, -1));

        age.setBackground(new java.awt.Color(204, 102, 255));
        age.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 22)); // NOI18N
        age.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 300, 130, 38));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("AGE :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 307, -1, -1));

        hometown.setBackground(new java.awt.Color(204, 102, 255));
        hometown.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 22)); // NOI18N
        hometown.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(hometown, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 442, 493, 38));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("HOMETOWN :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 449, -1, -1));

        contact.setBackground(new java.awt.Color(204, 102, 255));
        contact.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 22)); // NOI18N
        contact.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 585, 255, 38));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CONTACT NO. :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 592, -1, -1));

        faculty.setBackground(new java.awt.Color(204, 102, 255));
        faculty.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 22)); // NOI18N
        faculty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "MEDICINE", "ENGINEERING", "COMPUTING", "MANAGEMENT & COMMERCE", "PHYSICAL SCIENCE", "BIOLOGICAL SCIENCE", "ARCHITECTURE" }));
        faculty.setBorder(null);
        jPanel1.add(faculty, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 515, 358, 35));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("FACULTY :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 520, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("GENDER :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 378, -1, -1));

        gender.setBackground(new java.awt.Color(204, 102, 255));
        gender.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 22)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "male", "female" }));
        gender.setBorder(null);
        jPanel1.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 373, 130, 38));

        jLabel9.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Lecturer ID :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 662, -1, -1));

        id.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 22)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 662, 152, 30));

        submit.setBackground(new java.awt.Color(0, 0, 204));
        submit.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 26)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel1.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 664, -1, -1));

        clear.setBackground(new java.awt.Color(0, 0, 0));
        clear.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 26)); // NOI18N
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setText("clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(804, 664, -1, -1));

        delete.setBackground(new java.awt.Color(255, 255, 255));
        delete.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 26)); // NOI18N
        delete.setText("delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1024, 664, -1, -1));

        update.setBackground(new java.awt.Color(250, 31, 31));
        update.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 26)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(905, 664, -1, -1));

        table.setBackground(new java.awt.Color(100, 49, 241));
        table.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 15)); // NOI18N
        table.setForeground(new java.awt.Color(255, 255, 255));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lecturer ID", "Name", "Birthday", "Age", "Gender", "Hometown", "Faculty", "Contact No."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        table.setShowHorizontalLines(false);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setPreferredWidth(50);
            table.getColumnModel().getColumn(1).setPreferredWidth(500);
            table.getColumnModel().getColumn(2).setPreferredWidth(30);
            table.getColumnModel().getColumn(3).setPreferredWidth(5);
            table.getColumnModel().getColumn(4).setPreferredWidth(30);
            table.getColumnModel().getColumn(5).setPreferredWidth(200);
            table.getColumnModel().getColumn(6).setPreferredWidth(200);
            table.getColumnModel().getColumn(7).setPreferredWidth(70);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 761, 1672, 224));

        searchtxt1.setBackground(new java.awt.Color(102, 0, 102));
        searchtxt1.setFont(new java.awt.Font("Yu Gothic", 1, 20)); // NOI18N
        searchtxt1.setForeground(new java.awt.Color(255, 255, 255));
        searchtxt1.setBorder(null);
        searchtxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchtxt1ActionPerformed(evt);
            }
        });
        searchtxt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchtxt1KeyReleased(evt);
            }
        });
        jPanel1.add(searchtxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 20, 350, 33));

        jLabel15.setFont(new java.awt.Font("Vivaldi", 1, 40)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("*");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1010, 30, 40));

        jLabel12.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Please make sure to enter the data in the mentioned format. As per the format, \" - \" signs are mandatory and no spaces should be left.");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 1010, -1, -1));

        jLabel16.setFont(new java.awt.Font("Vivaldi", 1, 40)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("*");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1010, 30, 40));

        jLabel17.setFont(new java.awt.Font("Vivaldi", 1, 40)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 0));
        jLabel17.setText("*");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1010, 30, 40));

        jLabel11.setFont(new java.awt.Font("Vivaldi", 1, 40)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("*");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 30, 60));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\KRISH\\Downloads\\loupe (2).png")); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 20, 40, 40));

        tohome.setBackground(new java.awt.Color(204, 0, 255));
        tohome.setIcon(new javax.swing.ImageIcon("C:\\Users\\KRISH\\Downloads\\home (3).png")); // NOI18N
        tohome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tohomeActionPerformed(evt);
            }
        });
        jPanel1.add(tohome, new org.netbeans.lib.awtextra.AbsoluteConstraints(1730, 10, 60, 60));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\KRISH\\OneDrive\\Pictures\\download.jpeg")); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1970, -1));

        setSize(new java.awt.Dimension(1992, 1153));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
            String nametxt = name.getText();
            String birthdaytxt = birthday.getText();
            String agetxt = age.getText();
            String gendertxt = (String) gender.getSelectedItem();
            String hometowntxt = hometown.getText();
            String facultytxt = (String) faculty.getSelectedItem();
            int contactnotxt = Integer.parseInt(contact.getText());
                    

           clear(); 
           try {
                
             
             String sql = "insert into lecturer(lecName,lecBirthday,lecAge,lecGender,lecHometown,lecFaculty,lecContactno) values ('"+nametxt+"','"+birthdaytxt+"','"+agetxt+"','"+gendertxt+"','"+hometowntxt+"','"+facultytxt+"','"+contactnotxt+"')";
             
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

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed


          String lid = id.getText();
         try{ 
          String sql =  "delete from lecturer where lecId = '"+lid+"' ";
        
        try {
            pst = conn.prepareStatement(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Lecturer.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Lecturer.class.getName()).log(Level.SEVERE, null, ex);
        }
           
            tableload();
            clear();
          
             JOptionPane.showMessageDialog(null,"DELETED !");
        
         }catch(Exception e){
             
         System.out.println(e);
            
            JOptionPane.showMessageDialog(null,"CANNOT DELETE !");
         
         }
        
        
        
        
        
        
    }//GEN-LAST:event_deleteActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
       clear();
    }//GEN-LAST:event_clearActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked


int row = table.getSelectedRow();

        String sid = table.getValueAt(row, 0).toString();
        String sname = table.getValueAt(row, 1).toString();
        String sbirthday = table.getValueAt(row, 2).toString();
        String sage = table.getValueAt(row, 3).toString();
        String sgender = table.getValueAt(row, 4).toString();
        String shometown = table.getValueAt(row, 5).toString();
        String sfaculty = table.getValueAt(row, 6).toString();
        String scontact = table.getValueAt(row, 7).toString();

        id.setText(sid);
        name.setText(sname);
        birthday.setText(sbirthday);
        age.setText(sage);
        gender.setSelectedItem(sgender);
        hometown.setText(shometown);
        faculty.setSelectedItem(sfaculty);
        contact.setText(scontact);



    }//GEN-LAST:event_tableMouseClicked

    private void tableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableKeyReleased
int row = table.getSelectedRow();

        String sid = table.getValueAt(row, 0).toString();
        String sname = table.getValueAt(row, 1).toString();
        String sbirthday = table.getValueAt(row, 2).toString();
        String sage = table.getValueAt(row, 3).toString();
        String sgender = table.getValueAt(row, 4).toString();
        String shometown = table.getValueAt(row, 5).toString();
        String syear = table.getValueAt(row, 6).toString();
        String scontact = table.getValueAt(row, 7).toString();

        id.setText(sid);
        name.setText(sname);
        birthday.setText(sbirthday);
        age.setText(sage);
        gender.setSelectedItem(sgender);
        hometown.setText(shometown);
        faculty.setSelectedItem(syear);
        contact.setText(scontact);    }//GEN-LAST:event_tableKeyReleased

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
            int idupdate = Integer.parseInt(id.getText());  /* @@@ But the id is not updated @@@ */
            String nameupdate = name.getText();
            String birthdayupdate = birthday.getText();
            String ageupdate = age.getText();
            String genderupdate = (String) gender.getSelectedItem();
            String hometownupdate = hometown.getText();
            String facultyupdate = (String) faculty.getSelectedItem();
            int contactnoupdate= Integer.parseInt(contact.getText());
            
            try {
                
                String sql = "update lecturer set lecName =  '"+nameupdate+"', lecBirthday = '"+birthdayupdate+"', lecAge = '"+ageupdate+"', lecGender = '"+genderupdate+"', lecHometown = '"+hometownupdate+"', lecFaculty = '"+facultyupdate+"', lecContactno = '"+contactnoupdate+"' where lecId = '"+idupdate+"' ";
                pst = conn.prepareStatement(sql);
                pst.execute();
                tableload();
                JOptionPane.showMessageDialog(null, "UPDATED!");
            
        } catch (Exception e) {
            System.err.println(e);
                            JOptionPane.showMessageDialog(null, "CANNOT UPDATE!");

        }   
            }//GEN-LAST:event_updateActionPerformed

    private void searchtxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchtxt1ActionPerformed

    private void searchtxt1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtxt1KeyReleased

        String search_Data = searchtxt1.getText();

        try {

            String sql = "select * from lecturer where lecName like  '%"+search_Data+"%' ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {

            System.err.println(e);
                     JOptionPane.showMessageDialog(null, "CANNOT SEARCH !");


        }

    }//GEN-LAST:event_searchtxt1KeyReleased

    private void tohomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tohomeActionPerformed
        Home home = null;
        try {
            home = new Home();
            
        } catch (Exception e) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, e);
        }
        home.setVisible(true);
         setVisible(false); 
         dispose();
    }//GEN-LAST:event_tohomeActionPerformed

    
   
    
    public static void main(String args[]) {
       
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Lecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lecturer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javax.swing.JTextField birthday;
    private javax.swing.JButton clear;
    private javax.swing.JTextField contact;
    private javax.swing.JButton delete;
    private javax.swing.JComboBox<String> faculty;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JTextField hometown;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField searchtxt1;
    private javax.swing.JButton submit;
    private javax.swing.JTable table;
    private javax.swing.JButton tohome;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
