package Code;

import java.sql.*;
import javax.swing.JOptionPane;
public class dbConnect {
    
    public static Connection connect(){
        
        Connection conn = null;
        
        String url,user,pass;
        url = "jdbc:mysql://localhost:3306/university_management_system_2?userSSL=true";
        user = "root";
        pass = "";
        
        try{
        
        
           Class.forName("com.mysql.cj.jdbc.Driver"); // *_*_*_Adding the JDBC Driver_*_*_*
            
            conn = DriverManager.getConnection(url,user,pass);
            System.out.println("Driver Loaded !");
            //JOptionPane.showMessageDialog(null, " Driver Loaded !");

            
            
        }catch(Exception e){
            
            System.out.println(e);
            
        }
        
        
        return conn;
    
    
    }
    
}
