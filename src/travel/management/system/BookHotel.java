
package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.sql.*;

public class BookHotel extends JFrame implements ActionListener {
    Choice chotel, cac, cfood;
    JTextField tfpersons, tfdays;
    String username;
    JLabel labelusername,labelid, labelnumber, labelphone,labelprice; 
    JButton checkprice, bookpackage, back;
    
    BookHotel(String username) {
        this.username = username;
        
        setBounds(380,0,850,750);
        getContentPane().setBackground(new Color(242,167,75));
        setLayout(null);
        
       JLabel text = new JLabel("BOOK HOTEL");
       text.setBounds(50, 20,200,30);
       text.setFont(new Font("Times New Roman", Font.BOLD,22));
       text.setForeground(Color.WHITE);
       add(text);
        
                JLabel Iblusername = new JLabel("Username");
                Iblusername.setBounds(60,70,150,30);
                Iblusername.setFont ( new Font("Times New Roman" , Font.PLAIN, 21));
                Iblusername.setForeground(Color.BLACK);
                add(Iblusername);
                
                labelusername = new JLabel();
                labelusername.setBounds(240,70,150,30);
                labelusername.setFont ( new Font("Times New Roman" , Font.PLAIN, 25));
                labelusername.setForeground(Color.WHITE);
                add(labelusername);
                
                
                JLabel Iblpack = new JLabel("Select Hotel");
                Iblpack.setBounds(60,120,150,30);
                Iblpack.setFont ( new Font("Times New Roman" , Font.PLAIN, 21));
                Iblpack.setForeground(Color.BLACK);
                add(Iblpack);
                
                 chotel = new Choice();
                 chotel.setBounds(240, 125,200,25);
                 add(chotel);
                 
                 try {
                     Conn c = new Conn();
                     ResultSet rs = c.s.executeQuery("select * from hotel2");
                     while(rs.next()) {
                         chotel.add(rs.getString("name"));
                     }
                     
                 } catch(Exception e) {
                     e.printStackTrace();
                 }
                 
                 
                 
                JLabel Iblperson = new JLabel("Total Persons");
                Iblperson.setBounds(60,170,150,30);
                Iblperson.setFont ( new Font("Times New Roman" , Font.PLAIN, 21));
                Iblperson.setForeground(Color.BLACK);
                add(Iblperson);
                
                tfpersons = new JTextField("1");
                tfpersons.setBounds(240,170,200,30);
                add(tfpersons);
                
                
                 JLabel Ibldays = new JLabel("No. of Days");
                Ibldays.setBounds(60,220,150,30);
                Ibldays.setFont ( new Font("Times New Roman" , Font.PLAIN, 21));
                Ibldays.setForeground(Color.BLACK);
                add(Ibldays);
                
                tfdays = new JTextField("1");
                tfdays.setBounds(240,220,200,30);
                add(tfdays);
                
                
                
                 JLabel Iblac = new JLabel("AC/ Non-AC");
                Iblac.setBounds(60,270,150,30);
                Iblac.setFont ( new Font("Times New Roman" , Font.PLAIN, 21));
               Iblac.setForeground(Color.BLACK);
                add(Iblac);
                
                cac = new Choice();
                cac.add("Air Conditioner");
                cac.add("Non-Air Conditioner");
                 cac.setBounds(240, 275,200,25);
                 add(cac);
                 
                 
                 
                  JLabel Iblfood = new JLabel("Food included");
                Iblfood.setBounds(60,320,150,30);
                Iblfood.setFont ( new Font("Times New Roman" , Font.PLAIN, 21));
                Iblfood.setForeground(Color.BLACK);
                add(Iblfood);
                
                cfood = new Choice();
                cfood.add("Yes");
                cfood.add("No");
                 cfood.setBounds(240, 325,200,25);
                 add(cfood);

                
                
                
                JLabel Iblid = new JLabel("ID");
                Iblid.setBounds(60,370,200,30);
                Iblid.setFont ( new Font("Times New Roman" , Font.PLAIN, 21));
                Iblid.setForeground(Color.BLACK);
                add(Iblid);
                
                labelid = new JLabel();
                labelid.setBounds(240,370,150,30);
                labelid.setFont ( new Font("Times New Roman" , Font.PLAIN, 25));
                labelid.setForeground(Color.WHITE);
                add(labelid);
                
                
                JLabel Iblnumber = new JLabel("Number");
                Iblnumber.setBounds(60,420,150,30);
                Iblnumber.setFont ( new Font("Times New Roman" , Font.PLAIN, 21));
                Iblnumber.setForeground(Color.BLACK);
                add(Iblnumber);
                
                 labelnumber = new JLabel();
                labelnumber.setBounds(240,420,200,30);
                labelnumber.setFont ( new Font("Times New Roman" , Font.PLAIN, 25));
                labelnumber.setForeground(Color.WHITE);
                add(labelnumber);
                
                JLabel Iblphone = new JLabel("Phone Number");
                Iblphone.setBounds(60,470,150,30);
                Iblphone.setFont ( new Font("Times New Roman" , Font.PLAIN, 21));
                Iblphone.setForeground(Color.BLACK);
                add(Iblphone);
                
                 labelphone = new JLabel();
                labelphone.setBounds(240,470,200,30);
                labelphone.setFont ( new Font("Times New Roman" , Font.PLAIN, 25));
                labelphone.setForeground(Color.WHITE);
                add(labelphone);
                
                JLabel Ibltotal = new JLabel("Total Price");
                Ibltotal.setBounds(60,520,150,30);
                Ibltotal.setFont ( new Font("Times New Roman" , Font.PLAIN, 21));
                Ibltotal.setForeground(Color.BLACK);
                add(Ibltotal);
                
                 labelprice = new JLabel();
                labelprice.setBounds(240,520,200,30);
                labelprice.setFont ( new Font("Times New Roman" , Font.PLAIN, 25));
                labelprice.setForeground(Color.WHITE);
                add(labelprice);
                
                
                try {
                     Conn conn = new Conn();
                     
                     String query = "select * from customer where username = '"+username+"'   ";
                     ResultSet rs = conn.s.executeQuery(query);
                     while(rs.next()) {
                         labelusername.setText(rs.getString("username"));
                         labelid.setText(rs.getString("ID"));
                         labelnumber.setText(rs.getString("Number"));
                         labelphone.setText(rs.getString("Phone"));
                         
                         
                     }
                     
                 }catch (Exception e) {
                     e.printStackTrace();
                 }
        
                
                 checkprice = new JButton("Check Price");
                 checkprice.setForeground(new Color(242,167,75));
                 checkprice.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                 checkprice.setBounds(60,580,150,38);
                 checkprice.addActionListener(this);
                 add(checkprice);
                 
                 bookpackage = new JButton("Book Hotel");
                 bookpackage.setForeground(new Color(242,167,75));
                 bookpackage.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                 bookpackage.setBounds(240,580,150,38);
                 bookpackage.addActionListener(this);
                 add(bookpackage);
                 
                 back = new JButton("Back");
                 back.setForeground(new Color(242,167,75));
                 back.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                 back.setBounds(420,580,150,38);
                 back.addActionListener(this);
                 add(back);
                 
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons2/welcome7.jpg"));
        Image i2 = i1.getImage().getScaledInstance(350,500,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l12 = new JLabel(i3);
        l12.setBounds(450,40,350,500);
        add(l12);
                 
        
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==checkprice){
            try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from hotel2 where name='"+chotel.getSelectedItem()+"'");
            while(rs.next()){
                int cost = Integer.parseInt(rs.getString("costperperson"));
               int ac = Integer.parseInt(rs.getString("acroom"));
               int food = Integer.parseInt(rs.getString("foodincluded"));
                
                
                int persons = Integer.parseInt(tfpersons.getText());
                int days = Integer.parseInt(tfdays.getText());
                
                String acselected = cac.getSelectedItem();
                String foodselected = cfood.getSelectedItem();
                
                if(persons * days > 0){
                    int total = 0;
                    total += acselected.equals("Air Conditioner") ? ac: 0;
                    total+= foodselected.equals("Yes")? food :0;    
                total += cost;
                total = total * persons * days;
                labelprice.setText("$"+total);
                
                } else{
                    JOptionPane.showMessageDialog(null, "please eneter a valid number");
                    
                }
            }
            
            } catch (Exception e){
                e.printStackTrace();
                
            
            }
           
        } else if (ae.getSource() == bookpackage) {
            try{
                Conn c = new Conn();
                c.s.executeUpdate("insert into bookhotel2 values('"+labelusername.getText()+"', '"+chotel.getSelectedItem()+"', '"+tfpersons.getText()+"', '"+tfdays.getText()+"','"+cac.getSelectedItem()+"', '"+cfood.getSelectedItem()+"','"+labelid.getText()+"','"+labelnumber.getText()+"', '"+labelphone.getText()+"', '"+labelprice.getText()+"')");
                
                JOptionPane.showMessageDialog(null, "Hotel Booked Successfully");
                setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        } else  {
            setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new BookHotel("");
        
    }
    
}
