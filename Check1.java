
package javaapplication13;

import java.sql.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class Check1{
    
    public boolean x(int a) throws ClassNotFoundException, SQLException{
    
        String JDBC_DRIVER = "com.mysql.jdbc.Driver";
            String DATABASE_URL = "jdbc:mysql://localhost:3306/admission";
            String USERNAME = "root";
            String PASSWORD = "";
            Connection con = null;

            Statement stmt1 = null;

            Class.forName(JDBC_DRIVER);
            con = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);

            

            stmt1 = con.createStatement();
            ResultSet rs = stmt1.executeQuery("Select *from candidates WHERE appnumber='" + a + "'");
            
            if (!rs.next())
                      return true;
            else
                return false;
            

                
            
    
    
    
    
    }
    
}
