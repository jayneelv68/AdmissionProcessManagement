
package javaapplication13;


import javax.swing.*;  				      
import java.awt.*;  					
import java.awt.event.* ; 
import java.applet.*;
import java.sql.*;
import java.math.*;
import java.sql.Connection;
import java.sql.DriverManager;  
import java.lang.*;
import java.util.logging.Level;
import java.util.logging.Logger;


class Login implements ActionListener{
         JTextField appnumber;
         JPasswordField pf ;
         JButton login;
         String lname,fname,email,gname;
         int dob,state,board,category,percent12,jeem,jeep,jeec,jeet,norm_marks,grelation,choice1,choice2,choice3,gender,rank;
         long hcno,mcno,appnumber1,gno,aadhar;
          Login(){
     	
   
 
    appnumber = new JTextField(15);
    pf = new JPasswordField(10);
    login = new JButton("Sign In");
    
       
     
      
    
    JFrame f = new JFrame("Login Page");
    
 
    f.add(new JLabel("JEE Application No.: "));
    f.add(appnumber);
 
    f.add(new JLabel("Password: "));
    f.add(pf);
    
  
    f.add(login);
 
    f.setLayout(new GridLayout(3,2,10,10));
    f.setSize(350,200);
    f.setVisible(true);
    
    
    
    
   login.addActionListener(this);
  }
    
          
        public void actionPerformed(ActionEvent e)
           {
               if(e.getSource()==login){
                   try {
                       new Dashboard(Integer.parseInt(appnumber.getText()),pf.getPassword());
                   } catch (ClassNotFoundException ex) {
                       
                   }
         }
}
  
}
   					         
            


 



