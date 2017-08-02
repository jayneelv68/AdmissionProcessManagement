package javaapplication13;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.*;
import static javax.swing.JOptionPane.showMessageDialog;

class Dashboard {

    String lname, fname, email, gname;
    int dob, state, board, category, percent12, jeem, jeep, jeec, jeet, norm_marks, grelation, choice1, choice2, choice3, gender, rank;
    long hcno, mcno, appnumber1, gno, aadhar;

    Dashboard(int id,char[] pf) throws ClassNotFoundException {
        try {
            JLabel fname_l = new JLabel("First Name: ", JLabel.LEFT);
            JLabel lname_l = new JLabel("Last Name: ", JLabel.LEFT);
            
            JLabel perc_l = new JLabel("Percentage of 12th: ", JLabel.LEFT);
            JLabel state_l = new JLabel("State: ", JLabel.LEFT);
           
            JLabel appnumber_l = new JLabel("JEE Mains Application No.: ", JLabel.LEFT);
            JLabel jeem_l = new JLabel("Maths(JEE Mains): ", JLabel.LEFT);
            JLabel jeep_l = new JLabel("Physics(JEE Mains): ", JLabel.LEFT);
            JLabel jeec_l = new JLabel("Chemistry(JEE Mains): ", JLabel.LEFT);
            JLabel jeet_l = new JLabel("Total Marks(JEE Mains): ", JLabel.LEFT);
            JLabel aadhar_l = new JLabel("Aadhar Card No.: ", JLabel.LEFT);
            JLabel email_l = new JLabel("Email: ", JLabel.LEFT);

            JLabel gen_l = new JLabel("Gender: ", JLabel.LEFT);
            JLabel gname_l = new JLabel("Guardian Name: ", JLabel.LEFT);
            JLabel gno_l = new JLabel("Contact No.: ", JLabel.LEFT);
            JLabel grelation_l = new JLabel("Relation: ", JLabel.LEFT);

            String JDBC_DRIVER = "com.mysql.jdbc.Driver";
            String DATABASE_URL = "jdbc:mysql://localhost:3306/admission";
            String USERNAME = "root";
            String PASSWORD = "";
            Connection con = null;

            Statement stmt1 = null;

            Class.forName(JDBC_DRIVER);
            con = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);

            appnumber1 = id;

            stmt1 = con.createStatement();
            ResultSet rs = stmt1.executeQuery("Select *from candidates WHERE appnumber='" + id + "' and pass='"+String.valueOf(pf)+"'");

            if (!rs.next()) {
                showMessageDialog(null, "No records Found!");
            } else {
                lname = rs.getString("lname");
                fname = rs.getString("fname");
                appnumber1 = rs.getInt("appnumber");
                dob = rs.getInt("dob");
                gender = rs.getInt("gender");
                email = rs.getString("email");
                aadhar = rs.getInt("aadhar");
                state = rs.getInt("state");
                hcno = rs.getInt("hcno");
                mcno = rs.getInt("mcno");
                category = rs.getInt("category");
                board = rs.getInt("board");
                percent12 = rs.getInt("percent12");
                jeem = rs.getInt("jeem");
                jeec = rs.getInt("jeec");
                jeep = rs.getInt("jeep");
                jeet = rs.getInt("jeet");
                gno = rs.getInt("gno");
                grelation = rs.getInt("grelation");
                norm_marks = rs.getInt("norm_marks");
                choice1 = rs.getInt("choice1");
                choice2 = rs.getInt("choice2");
                choice3 = rs.getInt("choice3");
                gname = rs.getString("gname");
                rank = rs.getInt("rank");

                
                con.close();

                JLabel fname_2 = new JLabel(fname, JLabel.RIGHT);
                JLabel lname_2 = new JLabel(lname, JLabel.RIGHT);
                
                JLabel perc_2 = new JLabel("" + percent12, JLabel.RIGHT);
                String sta =  null;
                if(state==1)
                    sta = "Andra Pradesh";
                if(state==2)
                    sta = "Arunachal Pradesh";
                 if(state==3)
                    sta = "Assam";
              if(state==4)
                    sta = "Bihar";
               if(state==5)
                    sta = "Gujarat";
                JLabel state_2 = new JLabel(sta, JLabel.RIGHT);

                JLabel appnumber_2 = new JLabel("" + appnumber1, JLabel.RIGHT);
                JLabel jeem_2 = new JLabel("" + jeem, JLabel.RIGHT);
                JLabel jeep_2 = new JLabel("" + jeep, JLabel.RIGHT);
                JLabel jeec_2 = new JLabel("" + jeec, JLabel.RIGHT);
                JLabel jeet_2 = new JLabel("" + jeet, JLabel.RIGHT);
                JLabel aadhar_2 = new JLabel("" + aadhar, JLabel.RIGHT);
                JLabel email_2 = new JLabel(email, JLabel.RIGHT);
                String gen_Str =null; 
                if(gender==1)
                    gen_Str="Male";
                if(gender==2)
                    gen_Str="Female";
                JLabel gen_2 = new JLabel("" + gen_Str, JLabel.RIGHT);
                JLabel gname_2 = new JLabel(gname, JLabel.RIGHT);
                JLabel gno_2 = new JLabel("" + gno, JLabel.RIGHT);
                String rel = null;
                if(grelation==1)
                    rel = "Mother";
                if(grelation==2)
                    rel = "Father";
                if(grelation==3)
                    rel = "Brother";
                if(grelation==4)
                    rel = "Other";
                JLabel grelation_2 = new JLabel(rel, JLabel.RIGHT);

                JFrame f = new JFrame("Form");

                f.add(fname_l);
                f.add(fname_2);
                f.add(lname_l);
                f.add(lname_2);
                
                f.add(gen_l);
                f.add(gen_2);
                f.add(perc_l);
                f.add(perc_2);
                f.add(state_l);
                f.add(state_2);
                f.add(appnumber_l);
                f.add(appnumber_2);
                f.add(jeep_l);
                f.add(jeep_2);
                f.add(jeec_l);
                f.add(jeec_2);
                f.add(jeem_l);
                f.add(jeem_2);
                f.add(jeet_l);
                f.add(jeet_2);
                f.add(aadhar_l);
                f.add(aadhar_2);
                f.add(email_l);
                f.add(email_2);
                f.add(gname_l);
                f.add(gname_2);
                f.add(gno_l);
                f.add(gno_2);
                f.add(grelation_l);
                f.add(grelation_2);

                f.setLayout(new GridLayout(25, 2));
                f.setSize(1000, 1000);
                f.setVisible(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
