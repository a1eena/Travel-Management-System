

package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;



public class ViewBookedHotel extends JFrame implements ActionListener{
    
    JButton back;
    
    
    ViewBookedHotel(String username) {
        setBounds(380,30,850,700);
        getContentPane().setBackground(new Color(242,167,75));
        setLayout(null);
        
         JLabel text = new JLabel("VIEW BOOKED HOTEL DETAILS");
       text.setBounds(40, 10,800,30);
       text.setFont(new Font("Times New Roman", Font.BOLD,23));
       text.setForeground(Color.WHITE);
       add(text);
        
                JLabel Iblusername = new JLabel("Username");
                Iblusername.setBounds(40,70,150,30);
                Iblusername.setFont ( new Font("Times New Roman" , Font.PLAIN, 21));
                Iblusername.setForeground(Color.BLACK);
                add(Iblusername);
                
                JLabel labelusername = new JLabel();
                labelusername.setBounds(200,70,150,30);
                labelusername.setFont ( new Font("Times New Roman" , Font.PLAIN, 25));
                labelusername.setForeground(Color.WHITE);
                add(labelusername);
                
                
                JLabel Iblid = new JLabel("Hotel");
                Iblid.setBounds(40,120,150,30);
                Iblid.setFont ( new Font("Times New Roman" , Font.PLAIN, 21));
                Iblid.setForeground(Color.BLACK);
                add(Iblid);
                
                JLabel labelpackage= new JLabel();
                labelpackage.setBounds(200,120,400,30);
                labelpackage.setFont ( new Font("Times New Roman" , Font.PLAIN, 24));
                labelpackage.setForeground(Color.WHITE);
                add(labelpackage);
                
                
                JLabel Iblnumber = new JLabel("Total Persons");
                Iblnumber.setBounds(40,170,150,30);
                Iblnumber.setFont ( new Font("Times New Roman" , Font.PLAIN, 21));
                Iblnumber.setForeground(Color.BLACK);
                add(Iblnumber);
                
                JLabel labelpersons = new JLabel();
                labelpersons.setBounds(200,170,150,30);
                labelpersons.setFont ( new Font("Times New Roman" , Font.PLAIN, 24));
                labelpersons.setForeground(Color.WHITE);
                add(labelpersons);
                
                JLabel Ibldays = new JLabel("Total Days");
               Ibldays.setBounds(40,220,150,30);
                Ibldays.setFont ( new Font("Times New Roman" , Font.PLAIN, 21));
               Ibldays.setForeground(Color.BLACK);
                add(Ibldays);
                
                JLabel labeldays = new JLabel();
                labeldays.setBounds(200,220,150,30);
                labeldays.setFont ( new Font("Times New Roman" , Font.PLAIN, 24));
                labeldays.setForeground(Color.WHITE);
                add(labeldays);
                
                JLabel Iblac = new JLabel("AC/Non-AC");
                Iblac.setBounds(40,270,400,30);
                Iblac.setFont ( new Font("Times New Roman" , Font.PLAIN, 21));
                Iblac.setForeground(Color.BLACK);
                add(Iblac);
                
                JLabel labelac = new JLabel();
                labelac.setBounds(200,270,400,30);
                labelac.setFont ( new Font("Times New Roman" , Font.PLAIN, 24));
                labelac.setForeground(Color.WHITE);
                add(labelac);
                
                JLabel Iblfood = new JLabel("Food Included?");
                Iblfood.setBounds(40,320,150,30);
                Iblfood.setFont ( new Font("Times New Roman" , Font.PLAIN, 21));
                Iblfood.setForeground(Color.BLACK);
                add(Iblfood);
                
                JLabel labelfood = new JLabel();
                labelfood.setBounds(200,320,150,30);
                labelfood.setFont ( new Font("Times New Roman" , Font.PLAIN, 24));
                labelfood.setForeground(Color.WHITE);
                add(labelfood);
                
                
                 JLabel Iblname = new JLabel("ID");
                Iblname.setBounds(40,370,150,30);
                Iblname.setFont ( new Font("Times New Roman" , Font.PLAIN, 21));
                Iblname.setForeground(Color.BLACK);
                add(Iblname);
                
                JLabel labelid = new JLabel();
                labelid.setBounds(200,370,150,30);
                labelid.setFont ( new Font("Times New Roman" , Font.PLAIN, 24));
                labelid.setForeground(Color.WHITE);
                add(labelid);
                
                
                 JLabel Iblgender = new JLabel("Number");
                Iblgender.setBounds(40,420,150,30);
                Iblgender.setFont ( new Font("Times New Roman" , Font.PLAIN, 21));
                Iblgender.setForeground(Color.BLACK);
                add(Iblgender);
                
                JLabel labelnumber = new JLabel();
                labelnumber.setBounds(200,420,150,30);
                labelnumber.setFont ( new Font("Times New Roman" , Font.PLAIN, 24));
                labelnumber.setForeground(Color.WHITE);
                add(labelnumber);
                
                JLabel Iblcountry = new JLabel("Phone Number");
                Iblcountry.setBounds(40,470,150,30);
                Iblcountry.setFont ( new Font("Times New Roman" , Font.PLAIN, 21));
                Iblcountry.setForeground(Color.BLACK);
                add(Iblcountry);
                
                JLabel labelphone = new JLabel();
                labelphone.setBounds(200,470,150,30);
                labelphone.setFont ( new Font("Times New Roman" , Font.PLAIN, 24));
                labelphone.setForeground(Color.WHITE);
                add(labelphone);
                
                JLabel Iblprice  = new JLabel("Total Cost");
                Iblprice .setBounds(40,520,150,30);
                Iblprice .setFont ( new Font("Times New Roman" , Font.PLAIN, 21));
                Iblprice .setForeground(Color.BLACK);
                add(Iblprice );
                
                JLabel labelprice = new JLabel();
                labelprice.setBounds(200,520,150,30);
                labelprice.setFont ( new Font("Times New Roman" , Font.PLAIN, 24));
                labelprice.setForeground(Color.WHITE);
                add(labelprice);
                
                
                
              
                 back = new JButton("Back");
                 back.setForeground(new Color(242,167,75));
                 back.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                 back.setBounds(200,580,150,38);
                 back.addActionListener(this);
                 add(back);
                
                 ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons2/welcome9.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400,450,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l12 = new JLabel(i3);
        l12.setBounds(420,80,400,450);
        add(l12);
                
                 
                
                 
                 try {
                     Conn conn = new Conn();
                     
                     String query = "select * from bookhotel2 where username = '"+username+"'   ";
                     ResultSet rs = conn.s.executeQuery(query);
                     while(rs.next()) {
                         labelusername.setText(rs.getString("username"));
                         labelid.setText(rs.getString("id"));
                         labelnumber.setText(rs.getString("number"));
                         labelpackage.setText(rs.getString("name"));
                         labelprice.setText(rs.getString("price"));
                         labelpersons.setText(rs.getString("persons"));
                         labelphone.setText(rs.getString("phone"));
                         labelfood.setText(rs.getString("food"));
                         labelac.setText(rs.getString("ac"));
                         labeldays.setText(rs.getString("days"));
                         
                         
                     }
                     
                 } catch (Exception e) {
                     
                }
                 
                 
              setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
    }
    
    
    
    public static void main(String[] args){
        new ViewBookedHotel("");
    }
}

