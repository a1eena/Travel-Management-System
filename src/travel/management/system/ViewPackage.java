

package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;



public class ViewPackage extends JFrame implements ActionListener{
    
    JButton back;
    
    
    ViewPackage(String username) {
        setBounds(380,30,700,600);
        getContentPane().setBackground(new Color(242,167,75));
        setLayout(null);
        
         JLabel text = new JLabel("VIEW PACKAGE DETAILS");
       text.setBounds(50, 20,800,30);
       text.setFont(new Font("Times New Roman", Font.BOLD,22));
       text.setForeground(Color.WHITE);
       add(text);
        
                JLabel Iblusername = new JLabel("Username");
                Iblusername.setBounds(40,80,150,30);
                Iblusername.setFont ( new Font("Times New Roman" , Font.PLAIN, 21));
                Iblusername.setForeground(Color.BLACK);
                add(Iblusername);
                
                JLabel labelusername = new JLabel();
                labelusername.setBounds(200,80,150,30);
                labelusername.setFont ( new Font("Times New Roman" , Font.PLAIN, 25));
                labelusername.setForeground(Color.WHITE);
                add(labelusername);
                
                
                JLabel Iblid = new JLabel("Package");
                Iblid.setBounds(40,130,300,30);
                Iblid.setFont ( new Font("Times New Roman" , Font.PLAIN, 21));
                Iblid.setForeground(Color.BLACK);
                add(Iblid);
                
                JLabel labelpackage= new JLabel();
                labelpackage.setBounds(200,130,150,30);
                labelpackage.setFont ( new Font("Times New Roman" , Font.PLAIN, 21));
                labelpackage.setForeground(Color.WHITE);
                add(labelpackage);
                
                
                JLabel Iblnumber = new JLabel("Total Persons");
                Iblnumber.setBounds(40,180,150,30);
                Iblnumber.setFont ( new Font("Times New Roman" , Font.PLAIN, 21));
                Iblnumber.setForeground(Color.BLACK);
                add(Iblnumber);
                
                JLabel labelpersons = new JLabel();
                labelpersons.setBounds(200,180,150,30);
                labelpersons.setFont ( new Font("Times New Roman" , Font.PLAIN, 25));
                labelpersons.setForeground(Color.WHITE);
                add(labelpersons);
                
                
                 JLabel Iblname = new JLabel("ID");
                Iblname.setBounds(40,230,150,30);
                Iblname.setFont ( new Font("Times New Roman" , Font.PLAIN, 21));
                Iblname.setForeground(Color.BLACK);
                add(Iblname);
                
                JLabel labelid = new JLabel();
                labelid.setBounds(200,230,150,30);
                labelid.setFont ( new Font("Times New Roman" , Font.PLAIN, 25));
                labelid.setForeground(Color.WHITE);
                add(labelid);
                
                
                 JLabel Iblgender = new JLabel("Number");
                Iblgender.setBounds(40,280,150,30);
                Iblgender.setFont ( new Font("Times New Roman" , Font.PLAIN, 21));
                Iblgender.setForeground(Color.BLACK);
                add(Iblgender);
                
                JLabel labelnumber = new JLabel();
                labelnumber.setBounds(200,280,150,30);
                labelnumber.setFont ( new Font("Times New Roman" , Font.PLAIN, 25));
                labelnumber.setForeground(Color.WHITE);
                add(labelnumber);
                
                JLabel Iblcountry = new JLabel("Phone Number");
                Iblcountry.setBounds(40,330,150,30);
                Iblcountry.setFont ( new Font("Times New Roman" , Font.PLAIN, 21));
                Iblcountry.setForeground(Color.BLACK);
                add(Iblcountry);
                
                JLabel labelphone = new JLabel();
                labelphone.setBounds(200,330,150,30);
                labelphone.setFont ( new Font("Times New Roman" , Font.PLAIN, 25));
                labelphone.setForeground(Color.WHITE);
                add(labelphone);
                
                JLabel Iblprice  = new JLabel("Price");
                Iblprice .setBounds(40,380,150,30);
                Iblprice .setFont ( new Font("Times New Roman" , Font.PLAIN, 21));
                Iblprice .setForeground(Color.BLACK);
                add(Iblprice );
                
                JLabel labelprice = new JLabel();
                labelprice.setBounds(200,380,150,30);
                labelprice.setFont ( new Font("Times New Roman" , Font.PLAIN, 25));
                labelprice.setForeground(Color.WHITE);
                add(labelprice);
                
                
                
              
                 back = new JButton("Back");
                 back.setForeground(new Color(242,167,75));
                 back.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                 back.setBounds(200,450,150,38);
                 back.addActionListener(this);
                 add(back);
                
                 ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons2/pic33.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(300,400,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l12 = new JLabel(i3);
        l12.setBounds(380,80,300,400);
        add(l12);
                
                 
                
                 
                 try {
                     Conn conn = new Conn();
                     
                     String query = "select * from bookpackage where username = '"+username+"'";
                     ResultSet rs = conn.s.executeQuery(query);
                     while(rs.next()) {
                         labelusername.setText(rs.getString("username"));
                         labelid.setText(rs.getString("id"));
                         labelnumber.setText(rs.getString("number"));
                         labelpackage.setText(rs.getString("package"));
                         labelprice.setText(rs.getString("price"));
                         labelpersons.setText(rs.getString("persons"));
                         labelphone.setText(rs.getString("phone"));
                         
                         
                     }
                     
                 } catch (Exception e) {
                     
                }
                 
                 
              setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
    }
    
    
    
    public static void main(String[] args){
        new ViewPackage("");
    }
}
