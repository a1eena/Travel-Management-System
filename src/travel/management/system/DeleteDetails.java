

package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;



public class DeleteDetails extends JFrame implements ActionListener{
    
    JButton back;
    String username;
    
    
    DeleteDetails(String username) {
        this.username = username;
        setBounds(380,30,840,700);
        getContentPane().setBackground(new Color(242,167,75));
        setLayout(null);
        
        JLabel Iblusername = new JLabel("Username");
                Iblusername.setBounds(40,40,150,30);
                Iblusername.setFont ( new Font("Times New Roman" , Font.PLAIN, 21));
                Iblusername.setForeground(Color.BLACK);
                add(Iblusername);
                
                JLabel labelusername = new JLabel();
                labelusername.setBounds(200,40,150,30);
                labelusername.setFont ( new Font("Times New Roman" , Font.PLAIN, 25));
                labelusername.setForeground(Color.WHITE);
                add(labelusername);
                
                
        JLabel Iblid = new JLabel("ID");
                Iblid.setBounds(40,100,150,30);
                Iblid.setFont ( new Font("Times New Roman" , Font.PLAIN, 21));
                Iblid.setForeground(Color.BLACK);
                add(Iblid);
                
                JLabel labelid = new JLabel();
                labelid.setBounds(200,100,150,30);
                labelid.setFont ( new Font("Times New Roman" , Font.PLAIN, 25));
                labelid.setForeground(Color.WHITE);
                add(labelid);
                
                
                JLabel Iblnumber = new JLabel("Number");
                Iblnumber.setBounds(40,160,150,30);
                Iblnumber.setFont ( new Font("Times New Roman" , Font.PLAIN, 21));
                Iblnumber.setForeground(Color.BLACK);
                add(Iblnumber);
                
                JLabel labelnumber = new JLabel();
                labelnumber.setBounds(200,160,150,30);
                labelnumber.setFont ( new Font("Times New Roman" , Font.PLAIN, 25));
                labelnumber.setForeground(Color.WHITE);
                add(labelnumber);
                
                
                 JLabel Iblname = new JLabel("Name");
                Iblname.setBounds(40,220,150,30);
                Iblname.setFont ( new Font("Times New Roman" , Font.PLAIN, 21));
                Iblname.setForeground(Color.BLACK);
                add(Iblname);
                
                JLabel labelname = new JLabel();
                labelname.setBounds(200,220,150,30);
                labelname.setFont ( new Font("Times New Roman" , Font.PLAIN, 25));
                labelname.setForeground(Color.WHITE);
                add(labelname);
                
                
                 JLabel Iblgender = new JLabel("Gender");
                Iblgender.setBounds(40,280,150,30);
                Iblgender.setFont ( new Font("Times New Roman" , Font.PLAIN, 21));
                Iblgender.setForeground(Color.BLACK);
                add(Iblgender);
                
                JLabel labelgender = new JLabel();
                labelgender.setBounds(200,280,150,30);
                labelgender.setFont ( new Font("Times New Roman" , Font.PLAIN, 25));
                labelgender.setForeground(Color.WHITE);
                add(labelgender);
                
                JLabel Iblcountry = new JLabel("Country");
                Iblcountry.setBounds(410,40,150,30);
                Iblcountry.setFont ( new Font("Times New Roman" , Font.PLAIN, 21));
                Iblcountry.setForeground(Color.BLACK);
                add(Iblcountry);
                
                JLabel labelcountry = new JLabel();
                labelcountry.setBounds(550,40,150,30);
                labelcountry.setFont ( new Font("Times New Roman" , Font.PLAIN, 25));
                labelcountry.setForeground(Color.WHITE);
                add(labelcountry);
                
                JLabel Ibladdress = new JLabel("Address");
                Ibladdress.setBounds(410,100,150,30);
                Ibladdress.setFont ( new Font("Times New Roman" , Font.PLAIN, 21));
                Ibladdress.setForeground(Color.BLACK);
                add(Ibladdress);
                
                JLabel labeladdress = new JLabel();
                labeladdress.setBounds(550,100,150,30);
                labeladdress.setFont ( new Font("Times New Roman" , Font.PLAIN, 25));
                labeladdress.setForeground(Color.WHITE);
                add(labeladdress);
                
                
                JLabel Iblphone = new JLabel("Phone number");
                Iblphone.setBounds(410,160,150,30);
                Iblphone.setFont ( new Font("Times New Roman" , Font.PLAIN, 21));
                Iblphone.setForeground(Color.BLACK);
                add(Iblphone);
                
                JLabel labelphone = new JLabel();
                labelphone.setBounds(550,160,150,30);
                labelphone.setFont ( new Font("Times New Roman" , Font.PLAIN, 21));
                labelphone.setForeground(Color.WHITE);
                add(labelphone);
                
                
                JLabel Iblemail = new JLabel("Email");
                Iblemail.setBounds(410,220,150,30);
                Iblemail.setFont ( new Font("Times New Roman" , Font.PLAIN, 21));
                Iblemail.setForeground(Color.BLACK);
                add(Iblemail);
                
                JLabel labelemail = new JLabel();
                labelemail.setBounds(550,220,300,30);
                labelemail.setFont ( new Font("Times New Roman" , Font.PLAIN, 22));
                labelemail.setForeground(Color.WHITE);
                add(labelemail);
                
                
              
                 back = new JButton("Delete");
                 back.setForeground(new Color(242,167,75));
                 back.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                 back.setBounds(550,390,150,38);
                 back.addActionListener(this);
                 add(back);
                
                 
                 ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
                 Image i2 = i1.getImage().getScaledInstance(600,200,Image.SCALE_DEFAULT);
                 ImageIcon i3 = new ImageIcon(i2);
                 JLabel image = new JLabel(i3);
                 image.setBounds(0,490,600,200);
                 add(image);
                 
                 ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
                 Image i5 = i4.getImage().getScaledInstance(600,200,Image.SCALE_DEFAULT);
                 ImageIcon i6 = new ImageIcon(i5);
                 JLabel image2 = new JLabel(i6);
                 image2.setBounds(580,490,600,200);
                 add(image2);
                 
                 
                 try {
                     Conn conn = new Conn();
                     
                     String query = "select * from customer where username = '"+username+"'   ";
                     ResultSet rs = conn.s.executeQuery(query);
                     while(rs.next()) {
                         labelusername.setText(rs.getString("username"));
                         labelid.setText(rs.getString("ID"));
                         labelnumber.setText(rs.getString("Number"));
                         labelname.setText(rs.getString("Name"));
                         labelgender.setText(rs.getString("Gender"));
                         labelcountry.setText(rs.getString("Country"));
                         labeladdress.setText(rs.getString("Address"));
                         labelphone.setText(rs.getString("Phone"));
                         labelemail.setText(rs.getString("Email"));
                         
                     }
                     
                 }catch (Exception e) {
                     
                 }
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                
                
                setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
       try {
           Conn c = new Conn();
           c.s.executeUpdate("delete from account where username = '"+username+"'");
           c.s.executeUpdate("delete from customer where username = '"+username+"'");
           c.s.executeUpdate("delete from bookpackage where username = '"+username+"'");
           c.s.executeUpdate("delete from bookhotel2 where username = '"+username+"'");
           
            JOptionPane.showMessageDialog(null, "Details Deleted Successfully");
                setVisible(false);
           
       } catch(Exception e){
           e.printStackTrace();
       }
    }
    
    
    
    public static void main(String[] args){
        new DeleteDetails("");
    }
}
  