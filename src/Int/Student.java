
package Int;

import Code.dbConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class Student extends javax.swing.JFrame {

   Connection conn = null;
   PreparedStatement pst = null;
   ResultSet rs = null;
  
   
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++   
    
    
    public Student() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH); /*** To stay maximized the jFrame ***/
        conn = dbConnect.connect();  // _*_*_Connecting dbConnect class to Student class at the start_*_*_* 
        ResultSet rs = null;
        tableload();                  
        
    }
    
   
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++   
    
    public void tableload(){   // _*_*_Loading the table_*_*_*   
    
          try {
            
              String sql = "select * from student";
              pst = conn.prepareStatement(sql);
              rs = pst.executeQuery(sql);
              table.setModel(DbUtils.resultSetToTableModel(rs));
              
        } catch (Exception e) {
            
              System.err.println(e);
        }
   
    }
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++   
       
    public void clear(){     // _*_*_Clearing the texts_*_*_*
    
        id.setText("");
        name.setText("");
        hometown.setText("");
        birthday.setText("");
        age.setText("");
        gender.setSelectedItem("");
        year.setSelectedItem("");
        contact.setText("");
    
    }
    
    
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        submit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        hometown = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        birthday = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        year = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        delete = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        clear = new javax.swing.JButton();
        searchtxt = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        tohome = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UMS |  Student Page");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        submit.setBackground(new java.awt.Color(0, 0, 255));
        submit.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 26)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel1.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 620, -1, 41));

        jLabel1.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Student Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 24, -1, -1));

        jLabel2.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("STUDENT ID :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 610, 130, 60));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NAME :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, 31));

        name.setBackground(new java.awt.Color(153, 153, 255));
        name.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 22)); // NOI18N
        name.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 600, 38));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("HOMETOWN :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, -1, 31));

        hometown.setBackground(new java.awt.Color(153, 153, 255));
        hometown.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 22)); // NOI18N
        hometown.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        hometown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hometownActionPerformed(evt);
            }
        });
        jPanel1.add(hometown, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 426, 38));

        jLabel16.setFont(new java.awt.Font("Vivaldi", 1, 40)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("*");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 30, 40));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("BIRTHDAY  (YY-MM-DD) :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, 31));

        birthday.setBackground(new java.awt.Color(153, 153, 255));
        birthday.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 22)); // NOI18N
        birthday.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        birthday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birthdayActionPerformed(evt);
            }
        });
        jPanel1.add(birthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 255, 38));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("AGE :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, 31));

        age.setBackground(new java.awt.Color(153, 153, 255));
        age.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 22)); // NOI18N
        age.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });
        jPanel1.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 255, 38));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("GENDER :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, -1, 31));

        gender.setBackground(new java.awt.Color(102, 102, 255));
        gender.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 22)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "male", "female" }));
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        jPanel1.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 129, 38));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("YEAR :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, -1, 31));

        year.setBackground(new java.awt.Color(153, 153, 255));
        year.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 22)); // NOI18N
        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "1st year", "2nd year", "3rd year", "4th year", "5th year", "6th year" }));
        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });
        jPanel1.add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, -1, 38));

        jLabel10.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("CONTACT NO. :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 550, -1, 31));

        contact.setBackground(new java.awt.Color(153, 153, 255));
        contact.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 22)); // NOI18N
        contact.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });
        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 550, 255, 38));

        delete.setBackground(new java.awt.Color(255, 255, 255));
        delete.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 26)); // NOI18N
        delete.setText("delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 620, -1, -1));

        jLabel15.setFont(new java.awt.Font("Vivaldi", 1, 40)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("*");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1010, 30, 40));

        jLabel12.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Please make sure to enter the data in the mentioned format. As per the format, \" - \" signs are mandatory and no spaces should be left.");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 1010, -1, -1));

        table.setBackground(new java.awt.Color(51, 51, 51));
        table.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 15)); // NOI18N
        table.setForeground(new java.awt.Color(204, 204, 204));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Name", "Birthday", "Age", "Gender", "Hometown", "Year", "Contact No"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setSelectionBackground(new java.awt.Color(67, 97, 145));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setPreferredWidth(50);
            table.getColumnModel().getColumn(1).setPreferredWidth(1000);
            table.getColumnModel().getColumn(2).setPreferredWidth(70);
            table.getColumnModel().getColumn(3).setPreferredWidth(70);
            table.getColumnModel().getColumn(4).setPreferredWidth(70);
            table.getColumnModel().getColumn(5).setPreferredWidth(200);
            table.getColumnModel().getColumn(6).setPreferredWidth(70);
            table.getColumnModel().getColumn(7).setPreferredWidth(70);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 700, 1825, 290));

        clear.setBackground(new java.awt.Color(0, 0, 0));
        clear.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 26)); // NOI18N
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setText("clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 620, -1, 41));

        searchtxt.setBackground(new java.awt.Color(30, 30, 54));
        searchtxt.setFont(new java.awt.Font("Yu Gothic", 1, 20)); // NOI18N
        searchtxt.setForeground(new java.awt.Color(255, 255, 255));
        searchtxt.setBorder(null);
        searchtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchtxtActionPerformed(evt);
            }
        });
        searchtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchtxtKeyReleased(evt);
            }
        });
        jPanel1.add(searchtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 20, 350, 33));

        update.setBackground(new java.awt.Color(250, 31, 31));
        update.setFont(new java.awt.Font("Swis721 LtCn BT", 1, 26)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 620, -1, 43));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\KRISH\\Downloads\\loupe (3).png")); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 10, 50, 50));

        id.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 24)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 620, 180, 40));

        tohome.setBackground(new java.awt.Color(0, 0, 102));
        tohome.setIcon(new javax.swing.ImageIcon("C:\\Users\\KRISH\\Downloads\\home (3).png")); // NOI18N
        tohome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tohomeActionPerformed(evt);
            }
        });
        jPanel1.add(tohome, new org.netbeans.lib.awtextra.AbsoluteConstraints(1780, 10, 60, 60));

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\KRISH\\Downloads\\wallpaperflare.com_wallpaper (38).jpg")); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1060));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1290, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
       // _*_*Inserting data to the database_*_*_*  
    
    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
            
          
            String nametxt = name.getText();
            String birthdaytxt = birthday.getText();
            String agetxt = age.getText();
            String gendertxt = (String) gender.getSelectedItem();
            String hometowntxt = hometown.getText();
            String yeartxt = (String) year.getSelectedItem();
            int contactnotxt = Integer.parseInt(contact.getText());
                    

           clear(); 
     
         try {
                
             
             String sql = "insert into student(name,birthday,age,gender,hometown,year,contactno) values ('"+nametxt+"','"+birthdaytxt+"','"+agetxt+"','"+gendertxt+"','"+hometowntxt+"','"+yeartxt+"','"+contactnotxt+"')";
             
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
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++   

    
    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void hometownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hometownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hometownActionPerformed

    private void birthdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birthdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_birthdayActionPerformed

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearActionPerformed

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactActionPerformed
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++   
    
    // _*_*_Deleting data from the database_*_*_*  
    
    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
 
             String lid = id.getText();
        
        try{

        

            String sql =  "delete from student where id = '"+lid+"' ";
        
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
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++   

    
    // _*_*_Clear button_*_*_*
    
    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
       
        clear();
    }//GEN-LAST:event_clearActionPerformed
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++   
    
    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        
            int idupdate = Integer.parseInt(id.getText());
            String nameupdate = name.getText();
            String birthdayupdate = birthday.getText();
            String ageupdate = age.getText();
            String genderupdate = (String) gender.getSelectedItem();
            String hometownupdate = hometown.getText();
            String yearupdate = (String) year.getSelectedItem(); 
            int contactnoupdate= Integer.parseInt(contact.getText());
         
            
            try {
                
                String sql = "update student set name =  '"+nameupdate+"', birthday = '"+birthdayupdate+"', age = '"+ageupdate+"', gender = '"+genderupdate+"', hometown = '"+hometownupdate+"', year = '"+yearupdate+"', contactno = '"+contactnoupdate+"' where id = '"+idupdate+"' ";
                pst = conn.prepareStatement(sql);
                pst.execute();
                tableload();
                JOptionPane.showMessageDialog(null, "Updated!");
            
        } catch (Exception e) {
            System.err.println(e);
               JOptionPane.showMessageDialog(null, "Cannot Update ");

            
        }
    
        
    }//GEN-LAST:event_updateActionPerformed
      
    private void searchtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtxtKeyReleased
        
        String searchData = searchtxt.getText();
        
        try {
            
        String sql = "select * from student where name like  '%"+searchData+"%' ";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        table.setModel(DbUtils.resultSetToTableModel(rs));
        
            
        } catch (Exception e) {
            
            System.err.println(e);
            
        }
    
    }//GEN-LAST:event_searchtxtKeyReleased

        // _*_*_Selecting data from the Table when mouse clicked and Setting them to display on the relevant text fields_*_*_*

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
        year.setSelectedItem(syear);
        contact.setText(scontact);
    }//GEN-LAST:event_tableKeyReleased

    private void tableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableKeyPressed

    }//GEN-LAST:event_tableKeyPressed

    // _*_*_Selecting the data from the Table when mouse clicked and Setting them to display on the relevant text fields_*_*_*
    
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked

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
        year.setSelectedItem(syear);
        contact.setText(scontact);

    }//GEN-LAST:event_tableMouseClicked

    private void searchtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchtxtActionPerformed

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
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student().setVisible(true);
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
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JTextField searchtxt;
    private javax.swing.JButton submit;
    private javax.swing.JTable table;
    private javax.swing.JButton tohome;
    private javax.swing.JButton update;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
}
