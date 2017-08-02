
package javaapplication13;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.sym.AND;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
//import connect.Connecting.*;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.*;
import java.math.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.event.TableModelEvent.UPDATE;

class Register implements ActionListener{
    
         JTextField aadhar,email,fname,lname,hcno,jeem,jeep,jeec,jeet,appnumber,gname,gno,percent12,dob,mcno; 
         JPasswordField pass,cpass;
         JButton submitButton;
         JRadioButton gender1,gender2;
         JComboBox grelation,state,board,category,choice1,choice2,choice3;
         int s1,g1,b1,c1,gender,ch1,ch2,ch3;
         int rank;
         int jeem1,jeep1,jeec1,jeet1,dob1=0,hcno1,mcno1;
         long aadhar1,appnumber1,gno1,percent12i;
         String fname1,lname1,email1,gname1,pass1;
         double normmarks;
         
 
  Register() { 
      
     gender1 = new JRadioButton("Male");
     gender2 = new JRadioButton("Female");
    
    submitButton = new JButton("Submit");
   
    JLabel fname_l = new JLabel("First Name: ", JLabel.LEFT); 
    JLabel lname_l = new JLabel("Last Name: ", JLabel.LEFT); 
    JLabel dob_l = new JLabel("Date of Birth: ", JLabel.LEFT);
    JLabel  perc_l= new JLabel("Percentage of 12th: ", JLabel.LEFT);
    JLabel board_l = new JLabel("Board: ", JLabel.LEFT); 
    JLabel state_l = new JLabel("State: ", JLabel.LEFT); 
    JLabel category_l = new JLabel("Category: ", JLabel.LEFT); 
    
    JLabel appnumber_l = new JLabel("JEE Mains Application No.: ", JLabel.LEFT); 
    JLabel jeem_l = new JLabel("Maths(JEE Mains): ", JLabel.LEFT); 
    JLabel jeep_l = new JLabel("Physics(JEE Mains): ", JLabel.LEFT); 
    JLabel jeec_l = new JLabel("Chemistry(JEE Mains): ", JLabel.LEFT); 
    JLabel jeet_l = new JLabel("Total Marks(JEE Mains): ", JLabel.LEFT); 
    JLabel aadhar_l = new JLabel("Aadhar Card No.: ", JLabel.LEFT);
    JLabel email_l = new JLabel("Email: ", JLabel.LEFT); 
    JLabel mcno_l = new JLabel("Mobile No.: ", JLabel.LEFT); 
    JLabel hcno_l = new JLabel("Home No.: ", JLabel.LEFT); 
    
   
    JLabel choice1_l = new JLabel("Branch Preference 1: ", JLabel.LEFT); 
    JLabel choice2_l = new JLabel("Branch Preference 2: ", JLabel.LEFT); 
    JLabel choice3_l = new JLabel("Branch Preference 3: ", JLabel.LEFT); 
    
    JLabel gen_l = new JLabel("Gender: ", JLabel.LEFT);
    JLabel gname_l = new JLabel("Guardian Name: ", JLabel.LEFT);
    JLabel gno_l = new JLabel("Contact No.: ", JLabel.LEFT);
    JLabel grelation_l = new JLabel("Relation: ", JLabel.LEFT);
    JLabel pass_l = new JLabel("Password: ", JLabel.LEFT); 
    JLabel cpass_l = new JLabel("Confirm Password: ", JLabel.LEFT); 
    
    
     ButtonGroup bg = new ButtonGroup();
     bg.add(gender1);
     bg.add(gender2);
   
     
      state=new JComboBox();
      state.addItem("Andhra Pradesh");
      state.addItem("Arunachal Pradesh");
      state.addItem("Assam");
      state.addItem("Bihar");
      state.addItem("Gujarat");
     
      category=new JComboBox();
      category.addItem("General");
      category.addItem("OBC");
      category.addItem("SC");
      category.addItem("ST");
      category.addItem("Others");

      
      board=new JComboBox();
      board.addItem("BOARD OF INTERMEDIATE EDUCATION (ANDHRA PRADESH)");
      board.addItem("ASSAM HIGHER SECONDARY EDUCATION COUNCIL");
      board.addItem("BIHAR SCHOOL EXAMINATION BOARD");
      board.addItem("CENTRAL BOARD OF SECONDARY EDUCATION");
      board.addItem("GUJARAT SECONDARY AND HIGHER SECONDARY EDUCATION BOARD");
      
      grelation=new JComboBox();
      grelation.addItem("Mother");
      grelation.addItem("Father");
      grelation.addItem("Brother");
      grelation.addItem("Others");
      
      choice1=new JComboBox();
      choice1.addItem("Computer Engineering");
      choice1.addItem("Mechanical Engineering");
      choice1.addItem("Electrical Engineering");
      choice1.addItem("Electronics and Communnication Engineering");
      choice1.addItem("Chemical Engineering");

      choice2=new JComboBox();
      choice2.addItem("Computer Engineering");
      choice2.addItem("Mechanical Engineering");
      choice2.addItem("Electrical Engineering");
      choice2.addItem("Electronics and Communnication Engineering");
      choice2.addItem("Chemical Engineering");
      
      choice3=new JComboBox();
      choice3.addItem("Computer Engineering");
      choice3.addItem("Mechanical Engineering");
      choice3.addItem("Electrical Engineering");
      choice3.addItem("Electronics and Communnication Engineering");
      choice3.addItem("Chemical Engineering");
     
      
      
   
    pass = new JPasswordField(10); 
    cpass = new JPasswordField(10);
    aadhar = new JTextField(10); 
    email = new JTextField(10); 
    fname = new JTextField(10);
    lname = new JTextField(10); 
    percent12 = new JTextField(10); 
    appnumber = new JTextField(10);
    jeep = new JTextField(10);
    jeec = new JTextField(10);
    jeem = new JTextField(10);
    jeet = new JTextField(10);
    
    gname = new JTextField(10);
    gno = new JTextField(10);
    
  
 
     JPanel F = new JPanel();
     F.add(gender1);
     F.add(gender2);
     JFrame f=new JFrame("Form");
    
    f.add(fname_l); 
    f.add(fname);
    f.add(lname_l);
    f.add(lname);
    
    f.add(gen_l); 
    f.add(F);
    f.add(F);
    f.add(state_l); 
    f.add(state); 
    
    f.add(perc_l);
    f.add(percent12);
    f.add(board_l); 
    f.add(board); 
     f.add(category_l); 
    f.add(category); 
       
    f.add(appnumber_l);
    f.add(appnumber);
    f.add(jeep_l);
    f.add(jeep);
    f.add(jeec_l);
    f.add(jeec);
    f.add(jeem_l);
    f.add(jeem);
    f.add(jeet_l);
    f.add(jeet);
    f.add(aadhar_l);
    f.add(aadhar);
    f.add(email_l);
    f.add(email);
    
    f.add(choice1_l);
    f.add(choice1);
    f.add(choice2_l);
    f.add(choice2);
    f.add(choice3_l);
    f.add(choice3);
    
    f.add(gname_l);
    f.add(gname);
    f.add(gno_l);
    f.add(gno);
    f.add(grelation_l);
    f.add(grelation);
    
    
    
      
      
    f.add(pass_l); 
    f.add(pass);
    f.add(cpass_l); 
    f.add(cpass);
    f.add(submitButton);
   
    f.setLayout(new GridLayout(35,2));
    f.setSize(1000, 1000);
    f.setVisible(true);
  
    
    submitButton.addActionListener(this);
   
  } 
 
  
  public void actionPerformed(ActionEvent ae) { 
      int i=0,p=0,q=0,r=0;
      
      if (ae.getSource() == submitButton) {
         
          
          
            String fn=fname.getText();
            
            if(fn.length()!=0&&new Check().name(fn))
            {
                fn=lname.getText();
                if(fn.length()!=0&&new Check().name(fn)){
                
                    if(gender1.isSelected()||gender2.isSelected()){
                       try{
                        i = Integer.parseInt(percent12.getText());
                       }catch(Exception e){}
                        System.out.println(i);
                        if(i>=0&&i<=100&&percent12.getText().length()!=0){
                             
                            
                            try{    
                                i = Integer.parseInt(appnumber.getText());
                               
                            }catch(Exception e){}
                           try {
                               if(i>=1&&i<=1000&&appnumber.getText().length()!=0&&new Check1().x(i)){
                                   try{
                                       p = Integer.parseInt(jeep.getText());
                                   }catch(Exception e){}
                                   if((p>=-30&&p<=120)&&jeep.getText().length()!=0){
                                       try{
                                           q = Integer.parseInt(jeec.getText());
                                       }catch(Exception e){}
                                       if(q>=-30&&q<=120&&jeec.getText().length()!=0){
                                           try{
                                               r = Integer.parseInt(jeem.getText());
                                           }catch(Exception e){}
                                           if(r>=-30&&r<=120&&jeem.getText().length()!=0){
                                               try{
                                                   i = Integer.parseInt(jeet.getText());
                                               }catch(Exception e){}
                                               if(i>=-120&&i<=360&&jeet.getText().length()!=0&&i==p+q+r){
                                                   
                                                   fn = aadhar.getText();
                                                   
                                                   if(fn.length()==4&&aadhar.getText().length()!=0){
                                                       
                                                       fn = email.getText();
                                                       
                                                       if(new Email().validate(fn)&&email.getText().length()!=0){
                                                           
                                                           if(!choice2.getSelectedItem().equals(choice1.getSelectedItem())){
                                                               
                                                               if(!choice3.getSelectedItem().equals(choice2.getSelectedItem())){
                                                                   
                                                                   if(!choice3.getSelectedItem().equals(choice1.getSelectedItem())){
                                                                       
                                                                       
                                                                       if(gname.getText().length()!=0){
                                                                           
                                                                           if(new Contact().validatePhoneNumber(gno.getText())){
                                                                               String pwd=String.valueOf(pass.getPassword());
                                                                               String cpwd=String.valueOf(cpass.getPassword());
                                                                               
                                                                               if(pwd.equals(cpwd)){
                                                                                   
                                                                                   
                                                                                   
                                                                                   aadhar1 = Integer.parseInt(aadhar.getText());
                                                                                   hcno1 = 0;//Integer.parseInt(hcno.getText());
                                                                                   mcno1 = 0;//Integer.parseInt(mcno.getText());
                                                                                   appnumber1 = Integer.parseInt(appnumber.getText());
                                                                                   gno1 = Long.parseLong(gno.getText());
                                                                                   percent12i = Integer.parseInt(percent12.getText());
                                                                                   dob1 = 0;//Integer.parseInt(dob.getText());
                                                                                   jeep1 = Integer.parseInt(jeep.getText());
                                                                                   jeec1 = Integer.parseInt(jeec.getText());
                                                                                   jeem1 = Integer.parseInt(jeec.getText());
                                                                                   jeet1 = Integer.parseInt(jeet.getText());
                                                                                   fname1 = fname.getText();
                                                                                   lname1 = lname.getText();
                                                                                   email1 = email.getText();
                                                                                   gname1 = gname.getText();
                                                                                   pass1 = pwd;
                                                                                   
                                                                                   if(gender1.isSelected()){
                                                                                       gender = 1;
                                                                                   }
                                                                                   else{
                                                                                       gender = 2;
                                                                                   }
                                                                                   
                                                                                   String s = state.getSelectedItem().toString();
                                                                                   String c = category.getSelectedItem().toString();
                                                                                   String bo = board.getSelectedItem().toString();
                                                                                   String g = grelation.getSelectedItem().toString();
                                                                                   String cho1 = choice1.getSelectedItem().toString();
                                                                                   String cho2 = choice2.getSelectedItem().toString();
                                                                                   String cho3 = choice3.getSelectedItem().toString();
                                                                                   
                                                                                   switch(s){
                                                                                       
                                                                                       case "Andhra Pradesh":
                                                                                           s1 = 1;
                                                                                           break;
                                                                                       case "Arunachal Pradesh":
                                                                                           s1 = 2;
                                                                                           break;
                                                                                       case "Assam":
                                                                                           s1 =3;
                                                                                           break;
                                                                                       case "Bihar":
                                                                                           s1 = 4;
                                                                                           break;
                                                                                       case "Gujarat":
                                                                                           s1 = 5;
                                                                                           break;
                                                                                           
                                                                                           
                                                                                   }
                                                                                   
                                                                                   switch(bo){
                                                                                       
                                                                                       case "BOARD OF INTERMEDIATE EDUCATION (ANDHRA PRADESH)":
                                                                                           b1 = 1;
                                                                                           break;
                                                                                           
                                                                                       case "ASSAM HIGHER SECONDARY EDUCATION COUNCIL":
                                                                                           b1 =3;
                                                                                           break;
                                                                                           
                                                                                       case "BIHAR SCHOOL EXAMINATION BOARD":
                                                                                           b1 = 4;
                                                                                           break;
                                                                                       case "CENTRAL BOARD OF SECONDARY EDUCATION":
                                                                                           b1 = 2;
                                                                                           break;
                                                                                       case "GUJARAT SECONDARY AND HIGHER SECONDARY EDUCATION BOARD":
                                                                                           b1 = 5;
                                                                                           break;
                                                                                           
                                                                                           
                                                                                   }
                                                                                   
                                                                                   switch(c){
                                                                                       
                                                                                       case "General":
                                                                                           c1 = 1;
                                                                                           break;
                                                                                       case "OBC":
                                                                                           c1 = 2;
                                                                                           break;
                                                                                       case "SC":
                                                                                           c1 =3;
                                                                                           break;
                                                                                       case "ST":
                                                                                           c1 =4;
                                                                                           break;
                                                                                       case "Others":
                                                                                           c1 = 5;
                                                                                           break;
                                                                                           
                                                                                           
                                                                                   }
                                                                                   switch(g){
                                                                                       
                                                                                       case "Mother":
                                                                                           g1 = 1;
                                                                                           break;
                                                                                       case "Father":
                                                                                           g1 = 2;
                                                                                           break;
                                                                                       case "Brother":
                                                                                           g1 =3;
                                                                                           break;
                                                                                       case "Others":
                                                                                           g1 = 4;
                                                                                           break;
                                                                                           
                                                                                           
                                                                                   }
                                                                                   
                                                                                   switch(cho1){
                                                                                       
                                                                                       case "Computer Engineering":
                                                                                           ch1 = 1;
                                                                                           break;
                                                                                       case "Mechanical Engineering":
                                                                                           ch1 = 2;
                                                                                           break;
                                                                                       case "Electrical Engineering":
                                                                                           ch1 =3;
                                                                                           break;
                                                                                       case "Electronics and Communication Engineering":
                                                                                           ch1 = 4;
                                                                                           break;
                                                                                       case "Chemical Engineering":
                                                                                           ch1 = 5;
                                                                                           break;
                                                                                           
                                                                                           
                                                                                   }
                                                                                   
                                                                                   switch(cho2){
                                                                                       
                                                                                       case "Computer Engineering":
                                                                                           ch2 = 1;
                                                                                           break;
                                                                                       case "Mechanical Engineering":
                                                                                           ch2 = 2;
                                                                                           break;
                                                                                       case "Electrical Engineering":
                                                                                           ch2 =3;
                                                                                           break;
                                                                                       case "Electronics and Communication Engineering":
                                                                                           ch2 = 4;
                                                                                           break;
                                                                                       case "Chemical Engineering":
                                                                                           ch2 = 5;
                                                                                           break;
                                                                                           
                                                                                           
                                                                                   }
                                                                                   
                                                                                   switch(cho3){
                                                                                       
                                                                                       case "Computer Engineering":
                                                                                           ch3 = 1;
                                                                                           break;
                                                                                       case "Mechanical Engineering":
                                                                                           ch3 = 2;
                                                                                           break;
                                                                                       case "Electrical Engineering":
                                                                                           ch3 =3;
                                                                                           break;
                                                                                       case "Electronics and Communication Engineering":
                                                                                           ch3 = 4;
                                                                                           break;
                                                                                       case "Chemical Engineering":
                                                                                           ch3 = 5;
                                                                                           break;
                                                                                           
                                                                                           
                                                                                   }
                                                                                   
                                                                                   normmarks = (((40*percent12i)/100)+((60*jeet1)/100));
                                                                                   
                                                                                   String JDBC_DRIVER = "com.mysql.jdbc.Driver";
                                                                                   String DATABASE_URL = "jdbc:mysql://localhost:3306/admission";
                                                                                   String USERNAME = "root";
                                                                                   String PASSWORD = "";
                                                                                   Connection con = null;
                                                                                   
                                                                                   PreparedStatement preparedStatement = null;
                                                                                   PreparedStatement preparedStatement1 = null;
                                                                                   PreparedStatement preparedStatement2= null;
                                                                                   PreparedStatement preparedStatement3 = null;
                                                                                   PreparedStatement preparedStatement4 = null;
                                                                                   PreparedStatement preparedStatement5 = null;
                                                                                   PreparedStatement preparedStatement6 = null;
                                                                                   PreparedStatement preparedStatement7 = null;
                                                                                   Statement stmt = null;
                                                                                   
                                                                                   
                                                                                   
                                                                                   
                                                                                   
                                                                                   
                                                                                   
                                                                                   
                                                                                   
                                                                                   
                                                                                   try {
                                                                                       
                                                                                       
                                                                                       Class.forName(JDBC_DRIVER);
                                                                                       con = DriverManager.getConnection(DATABASE_URL, USERNAME,PASSWORD);
                                                                                       stmt = con.createStatement();
                                                                                       String str1=  "UPDATE candidates SET Rank=Rank+1 WHERE "+normmarks+">norm_marks";
                                                                                       String str2="UPDATE candidates SET Rank=Rank+1  WHERE "+normmarks+"=norm_marks AND "+jeet1+" >jeet";
                                                                                       String str3="UPDATE candidates SET Rank=Rank+1 WHERE "+normmarks+" =norm_marks AND "+jeet1+" =jeet AND "+jeep1+" >jeep";
                                                                                       String str4="UPDATE candidates SET Rank=Rank+1 WHERE "+normmarks+" =norm_marks AND "+jeet1+" =jeet AND "+jeep1+" =jeep  AND "+jeec1+" >jeec";
                                                                                       String str5="UPDATE candidates SET Rank=Rank+1 WHERE "+normmarks+" =norm_marks AND "+jeet1+" =jeet AND "+jeep1+" =jeep AND " +jeec1+" =jeec  AND "+jeem1+" >jeem";
                                                                                       String str6="UPDATE candidates SET Rank=Rank+1 WHERE norm_marks='"+normmarks+"' AND jeet='"+jeet1+"' AND jeep='"+jeep1+"' AND jeec='"+jeec1+"' AND jeem='"+jeem1+"' AND percent12='"+percent12+"'";
                                                                                       String str7="Select max(Rank) as Rank from candidates WHERE jeet<'"+jeet1+"'";
                                                                                       
                                                                                       preparedStatement = con.prepareStatement(str1);
                                                                                       boolean b=preparedStatement.execute();
                                                                                       preparedStatement1 = con.prepareStatement(str2);
                                                                                       b=preparedStatement1.execute();
                                                                                       preparedStatement2 = con.prepareStatement(str3);
                                                                                       b=preparedStatement2.execute();
                                                                                       preparedStatement3 = con.prepareStatement(str4);
                                                                                       b=preparedStatement3.execute();
                                                                                       preparedStatement4 = con.prepareStatement(str5);
                                                                                       b=preparedStatement4.execute();
                                                                                       preparedStatement5 = con.prepareStatement(str6);
                                                                                       b=preparedStatement5.execute();
                                                                                       stmt = con.createStatement();
                                                                                       ResultSet rs = stmt.executeQuery(str7);
                                                                                       
                                                                                       
                                                                                       rs.next();
                                                                                       rank = rs.getInt("Rank");
                                                                                       rank=rank+1;
                                                                                       
                                                                                       
                                                                                       
                                                                                       
                                                                                       
                                                                                       
                                                                                       
                                                                                       preparedStatement7 = con.prepareStatement("INSERT INTO candidates VALUES('"+fname1+"','"+lname1+"','"+appnumber1+"','"+dob1+"','"+email1+"','"+aadhar1+"','"+s1+"','"+hcno1+"','"+mcno1+"','"+c1+"','"+gender+"','"+b1+"','"+rank+"','"+percent12i+"','"+jeep1+"','"+jeec1+"','"+jeem1+"','"+jeet1+"','"+gname1+"','"+gno1+"','"+g1+"','"+pass1+"','"+normmarks+"',1,2,3)");
                                                                                       
                                                                                       b=preparedStatement7.execute();
                                                                                   }
                                                                                   catch (SQLException sqlEx) {
                                                                                       sqlEx.printStackTrace();
                                                                                       
                                                                                   } catch (ClassNotFoundException clsNotFoundEx) {
                                                                                       clsNotFoundEx.printStackTrace();
                                                                                       System.exit(1);
                                                                                   } finally {
                                                                                       try {
                                                                                           preparedStatement.close();
                                                                                           preparedStatement1.close();
                                                                                           preparedStatement2.close();
                                                                                           preparedStatement3.close();
                                                                                           preparedStatement4.close();
                                                                                           preparedStatement5.close();
                                                                                           preparedStatement6.close();
                                                                                           preparedStatement7.close();
                                                                                           stmt.close();
                                                                                           
                                                                                           
                                                                                           
                                                                                           con.close();
                                                                                       } catch (Exception e) {
                                                                                       }
                                                                                   }
                                                                                   
                                                                                   
                                                                                   
                                                                                   
                                                                                   
                                                                                   
                                                                                   
                                                                                   
                                                                                   
                                                                                   
                                                                               }else{
                                                                                   showMessageDialog(null,"Re-Write Password and Confirm Password!");
                                                                               }
                                                                               
                                                                           }else{
                                                                               showMessageDialog(null,"Guardian Contact Number is missing or not available!");
                                                                           }
                                                                           
                                                                       }else{
                                                                           showMessageDialog(null,"Guardian Name is missing!");
                                                                       }
                                                                   }else{
                                                                       showMessageDialog(null,"Branch Preference 3 match with Branch Preference 1!");
                                                                   }
                                                               }else{
                                                                   showMessageDialog(null,"Branch Preference 3 match with Branch Preference 2!");
                                                               }
                                                           }else{
                                                               showMessageDialog(null,"Branch Preference 2 match with Branch Preference 1!");
                                                           }
                                                       }else{
                                                           showMessageDialog(null,"Email is missing or not available!");
                                                       }
                                                       
                                                   }else{
                                                       showMessageDialog(null,"Aadhar Number is missing or not available!");
                                                   }
                                                   
                                               }else{
                                                   showMessageDialog(null,"Total Marks is missing or not in range(-120-360) or incorrect!");
                                               }
                                               
                                           }else{
                                               showMessageDialog(null,"Maths Marks is missing or not in range(-30-120)!");
                                           }
                                           
                                       }else{
                                           showMessageDialog(null,"Chemistry Marks is missing or not in range(-30-120)!");
                                       }
                                       
                                   }else{
                                       showMessageDialog(null,"Physics Marks is missing or not in range(-30-120)!");
                                   }
                                   
                               }else{
                                   showMessageDialog(null,"Application Number is missing or not available or already exist!");
                               }
                           } catch (ClassNotFoundException ex) {
                               Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
                           } catch (SQLException ex) {
                               Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
                           }
                        
                        }else{
                            showMessageDialog(null,"Percentange is missing or not in range(0-100)!");
                        }
                    
                    }else{
                        showMessageDialog(null,"Gender is missing!");
                    }
                
                }else{
                    showMessageDialog(null,"Last Name missing or invalid!");
                }
            
           }else{
               showMessageDialog(null,"First Name missing or invalid!");
           }

            
         
          
          
      }
      
  } 
  
        
  
  
 
    }

    