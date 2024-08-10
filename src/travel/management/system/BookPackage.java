
package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.sql.*;

public class BookPackage extends JFrame implements ActionListener {
    Choice cpackage;
    JTextField tfpersons;
    String username;
    JLabel labelusername,labelid, labelnumber, labelphone,labelprice; 
    JButton checkprice, bookpackage, back;
    
    BookPackage(String username) {
        this.username = username;
        
        setBounds(380,30,800,600);
        getContentPane().setBackground(new Color(242,167,75));
        setLayout(null);
        
       JLabel text = new JLabel("BOOK PACKAGE");
       text.setBounds(50, 20,200,30);
       text.setFont(new Font("Times New Roman", Font.BOLD,22));
       text.setForeground(Color.WHITE);
       add(text);
        
                JLabel Iblusername = new JLabel("Username");
                Iblusername.setBounds(60,80,150,30);
                Iblusername.setFont ( new Font("Times New Roman" , Font.PLAIN, 21));
                Iblusername.setForeground(Color.BLACK);
                add(Iblusername);
                
                labelusername = new JLabel();
                labelusername.setBounds(240,80,150,30);
                labelusername.setFont ( new Font("Times New Roman" , Font.PLAIN, 25));
                labelusername.setForeground(Color.WHITE);
                add(labelusername);
                
                
                JLabel Iblpack = new JLabel("Select Package");
                Iblpack.setBounds(60,140,150,30);
                Iblpack.setFont ( new Font("Times New Roman" , Font.PLAIN, 21));
                Iblpack.setForeground(Color.BLACK);
                add(Iblpack);
                
                 cpackage = new Choice();
                 cpackage.add("Gold Package");
                 cpackage.add("Silver Package");
                 cpackage.add("Bronze Package");
                 cpackage.setBounds(240, 145,200,25);
                 add(cpackage);
                 
                 
                JLabel Iblperson = new JLabel("Total Persons");
                Iblperson.setBounds(60,200,150,30);
                Iblperson.setFont ( new Font("Times New Roman" , Font.PLAIN, 21));
                Iblperson.setForeground(Color.BLACK);
                add(Iblperson);
                
                tfpersons = new JTextField("1");
                tfpersons.setBounds(240,200,200,30);
                add(tfpersons);
                
                JLabel Iblid = new JLabel("ID");
                Iblid.setBounds(60,260,200,30);
                Iblid.setFont ( new Font("Times New Roman" , Font.PLAIN, 21));
                Iblid.setForeground(Color.BLACK);
                add(Iblid);
                
                labelid = new JLabel();
                labelid.setBounds(240,260,150,30);
                labelid.setFont ( new Font("Times New Roman" , Font.PLAIN, 25));
                labelid.setForeground(Color.WHITE);
                add(labelid);
                
                
                JLabel Iblnumber = new JLabel("Number");
                Iblnumber.setBounds(60,320,150,30);
                Iblnumber.setFont ( new Font("Times New Roman" , Font.PLAIN, 21));
                Iblnumber.setForeground(Color.BLACK);
                add(Iblnumber);
                
                 labelnumber = new JLabel();
                labelnumber.setBounds(240,320,200,30);
                labelnumber.setFont ( new Font("Times New Roman" , Font.PLAIN, 25));
                labelnumber.setForeground(Color.WHITE);
                add(labelnumber);
                
                JLabel Iblphone = new JLabel("Phone Number");
                Iblphone.setBounds(60,380,150,30);
                Iblphone.setFont ( new Font("Times New Roman" , Font.PLAIN, 21));
                Iblphone.setForeground(Color.BLACK);
                add(Iblphone);
                
                 labelphone = new JLabel();
                labelphone.setBounds(240,380,200,30);
                labelphone.setFont ( new Font("Times New Roman" , Font.PLAIN, 25));
                labelphone.setForeground(Color.WHITE);
                add(labelphone);
                
                JLabel Ibltotal = new JLabel("Total Price");
                Ibltotal.setBounds(60,440,150,30);
                Ibltotal.setFont ( new Font("Times New Roman" , Font.PLAIN, 21));
                Ibltotal.setForeground(Color.BLACK);
                add(Ibltotal);
                
                 labelprice = new JLabel();
                labelprice.setBounds(240,440,200,30);
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
                 checkprice.setBounds(60,500,150,38);
                 checkprice.addActionListener(this);
                 add(checkprice);
                 
                 bookpackage = new JButton("Book Package");
                 bookpackage.setForeground(new Color(242,167,75));
                 bookpackage.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                 bookpackage.setBounds(240,500,150,38);
                 bookpackage.addActionListener(this);
                 add(bookpackage);
                 
                 back = new JButton("Back");
                 back.setForeground(new Color(242,167,75));
                 back.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                 back.setBounds(420,500,150,38);
                 back.addActionListener(this);
                 add(back);
                 
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons2/pic0.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(300,400,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l12 = new JLabel(i3);
        l12.setBounds(450,80,300,400);
        add(l12);
                 
        
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==checkprice){
            String pack = cpackage.getSelectedItem();
            int cost = 0;
            if (pack.equals("Gold Package")) {
                cost += 400;
                
            }else if (pack.equals("Silver Package")){
                cost += 300;
                
            }else{
                cost += 350;
                
            }
            
            int persons = Integer.parseInt(tfpersons.getText());
             cost *= persons;
             labelprice.setText("$"+cost);
            
        } else if (ae.getSource() == bookpackage) {
            try{
                Conn c = new Conn();
                c.s.executeUpdate("insert into bookpackage values('"+labelusername.getText()+"', '"+cpackage.getSelectedItem()+"', '"+tfpersons.getText()+"', '"+labelid.getText()+"', '"+labelnumber.getText()+"', '"+labelphone.getText()+"', '"+labelprice.getText()+"')");
                
                JOptionPane.showMessageDialog(null, "Package Booked Successfully");
                setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        } else  {
            setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new BookPackage("");
        
    }
    
}
