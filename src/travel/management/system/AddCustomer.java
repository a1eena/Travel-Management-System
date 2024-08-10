
package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class AddCustomer extends JFrame implements ActionListener{
    
    JLabel labelusername, labelname;
    JComboBox comboid;
    JTextField tfnumber, tfcountry, tfadd,tfphone ,tfemail ;
    JRadioButton rmale, rfemale;
    JButton add, back;
    
    
    AddCustomer(String username){
        setBounds(380,30,850,700);
                setLayout(null);
                getContentPane().setBackground(new Color(242,167,75));
               
                
                JLabel Iblusername = new JLabel("Username");
                Iblusername.setBounds(20,40,150,30);
                Iblusername.setFont ( new Font("Inter" , Font.PLAIN, 18));
                Iblusername.setForeground(Color.WHITE);
                add(Iblusername);
                
                labelusername = new JLabel("");
                labelusername.setBounds(200,40,180,30);
                labelusername.setForeground(Color.BLACK);
                labelusername.setFont ( new Font("Inter" , Font.PLAIN, 18));
                add(labelusername);
                
                
                
                JLabel iblid = new JLabel("ID");
                iblid .setBounds(20,90,150,25);
                iblid.setFont ( new Font("Inter" , Font.PLAIN, 18));
                iblid.setForeground(Color.WHITE);
                add(iblid );
                
                comboid = new JComboBox(new String[]
                {"Passport", "Aadhar Card", "Pan Card", "Ration Card "});
                comboid.setBounds(195,90,190,40);
                comboid.setBackground(new Color(242,167,75));
                add(comboid);
                
                
                
                JLabel Iblnumber = new JLabel("Number");
                Iblnumber.setBounds(20,140,150,25);
                Iblnumber.setFont ( new Font("Inter" , Font.PLAIN, 18));
                Iblnumber.setForeground(Color.WHITE);
                add(Iblnumber);
                
                tfnumber = new JTextField();
                tfnumber.setBounds(200,140,180,30);
                add(tfnumber);
                
                
                
                JLabel Iblname = new JLabel("Name");
                Iblname.setBounds(20,190,150,25);
                Iblname.setFont ( new Font("Inter" , Font.PLAIN, 18));
                Iblname.setForeground(Color.WHITE);
                add(Iblname);
                
                labelname = new JLabel("");
                labelname.setBounds(200,190,180,30);
                labelname.setForeground(Color.BLACK);
                labelname.setFont ( new Font("Inter" , Font.PLAIN, 18));
                add(labelname);
                
                
                
                JLabel Iblgender = new JLabel("Gender");
                Iblgender.setBounds(20,240,150,25);
                Iblgender.setFont ( new Font("Inter" , Font.PLAIN, 18));
                Iblgender.setForeground(Color.WHITE);
                add(Iblgender);
                
                rmale = new JRadioButton("Male");
                rmale.setBounds(200, 240,70,30);
                add(rmale);
               
                rfemale = new JRadioButton("Female");
                rfemale.setBounds(300, 240,100,30);
                add(rfemale);
                
                
                
                ButtonGroup bg = new ButtonGroup();
                bg.add(rmale);
                bg.add(rfemale);
                
                
                
                 JLabel Iblcountry =new JLabel("Country");
                Iblcountry .setBounds(20,290,150,25);
                Iblcountry.setFont ( new Font("Inter" , Font.PLAIN, 18));
                Iblcountry.setForeground(Color.WHITE);
                add(Iblcountry );
                
                tfcountry = new JTextField();
                tfcountry.setBounds(200,290,180,30);
                add(tfcountry);
                
                
                
                
                 JLabel Ibladdress = new JLabel("Address");
                Ibladdress.setBounds(20,340,150,25);
                Ibladdress.setFont ( new Font("Inter" , Font.PLAIN, 18));
               Ibladdress.setForeground(Color.WHITE);
                add(Ibladdress);
                
                tfadd = new JTextField();
                tfadd.setBounds(200,340,180,30);
                add(tfadd);
                
                
                
              
                 JLabel Iblphone = new JLabel("Phone Number");
                Iblphone.setBounds(20,390,150,25);
                Iblphone.setFont ( new Font("Inter" , Font.PLAIN, 18));
                Iblphone.setForeground(Color.WHITE);
                add(Iblphone);
                
                tfphone = new JTextField();
                tfphone.setBounds(200,390,180,30);
                add(tfphone);
                
                
                  JLabel Iblemail =new JLabel("Email");
                Iblemail.setBounds(20,440,150,25);
                Iblemail.setFont ( new Font("Inter" , Font.PLAIN, 18));
                Iblemail.setForeground(Color.WHITE);
                add(Iblemail );
                
                tfemail = new JTextField();
                tfemail.setBounds(200,440,180,30);
                add(tfemail);
                
                
                
                
                
                
                add = new JButton("Add");
                add.setBackground(Color.BLACK);
                add.setForeground(new Color(242,167,75));
                add.setBounds(50,540,130,36);
                add.setFont(new Font("Inter", Font.PLAIN, 16));
                add.addActionListener(this);
                add(add);
                
                back = new JButton("Back");
                back.setBackground(Color.BLACK);
                back.setForeground(new Color(242,167,75));
                back.setBounds(220,540,130,36);
                back.setFont(new Font("Inter", Font.PLAIN, 16));
                back.addActionListener(this);
                add(back);
                
                
                
                
                ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons2/pic10.jpg"));
                Image i2 = i1.getImage().getScaledInstance(440,650,Image.SCALE_DEFAULT);
                ImageIcon i3 = new ImageIcon(i2);
                JLabel image = new JLabel(i3);
                image.setBounds(400,10,440,650);
                add(image);
                
               
                try {
                    Conn c = new Conn();
                    ResultSet rs=c.s.executeQuery("select * from account where username = '"+username+"'");
                    while(rs.next()) {
                        labelusername.setText(rs.getString("username"));
                        labelname.setText(rs.getString("name"));
                    }
                
                } catch (Exception e) {
                    e.printStackTrace();
                }
                
                
                      setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == add) {
            String username = labelusername.getText ();
            String id = (String) comboid.getSelectedItem();
            String number = tfnumber.getText();
            String name = labelname.getText();
            String gender = null;
            if(rmale.isSelected()) {
                gender = "Male";
                
            } else {
                gender ="Female";
            }
            String country = tfcountry.getText();
            String address = tfadd.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            
            try {
                Conn c = new Conn();
                String query = "insert into customer values('"+username+"', '"+id+"','"+number+"','"+name+"', '"+gender+"', '"+country+"', '"+address+"', '"+phone+"','"+email+"')";
                c.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Customer Details Added Successfully");
                setVisible(false);
               
               
            } catch (Exception e){
                e.printStackTrace();
            }
                    
                    
        } else {
            setVisible(false);
            
        }
    }
     
    
    public static void main(String[] args){
        new AddCustomer("");
    }
    
}
