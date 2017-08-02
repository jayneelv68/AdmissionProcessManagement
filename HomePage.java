package javaapplication13;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;


public class HomePage {
    
    
    
    public static void main(String[] args) {
        new Y();
    }
    
}
    class Y implements ActionListener{
        JButton register,login;
        
        Y(){
            register = new JButton("Registeration");
            login = new JButton("Login");
            JLabel x = new JLabel("Nirma University", JLabel.CENTER); 
            JFrame f=new JFrame("Home Page");
            
            f.add(x);
            f.add(register);
            f.add(login); 
            
            register.addActionListener(this);
            login.addActionListener(this);            
              f.setLayout(new GridLayout(3,2,10,10));
              f.setSize(300,300);
              f.setVisible(true);
    
        }
        
        public void actionPerformed(ActionEvent e){
            
            if(e.getSource()==register)
            {
                 new Register();
                
                
            }
            else{
                new Login();
            }
                
            
        }
    
    }

