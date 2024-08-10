
package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ForgetPassword extends JFrame implements ActionListener{
    
    JTextField tfusername ,tfname, tfquestion, tfanswer, tfpassword;
    JButton search, retrieve, back;
    
    ForgetPassword() {
        
        setBounds(130,100,1000,500);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/forgotpassword.jpg"));
        Image i2 = i1.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(50,70,300,300);
        add(image);
        
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(390,10,600,450);
        add(p1);
        
        
        JLabel lbusername = new JLabel("Username");
        lbusername.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lbusername.setBounds(40,30,100,50);
        p1.add(lbusername);
        
        
        tfusername = new JTextField();
        tfusername.setBounds(200,40,250,30);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);
        
        search = new JButton("Search");
        search.setOpaque(true);
        search.setBorderPainted(false);
        search.setBackground(Color.black);
        search.setForeground(Color.WHITE);
        search.setBounds(460,40,120,30);
        search.addActionListener(this);
        p1.add(search);
        
        
         JLabel lbname = new JLabel("Name");
       lbname.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lbname.setBounds(40,90,100,50);
        p1.add(lbname);
        
        
        tfname = new JTextField();
        tfname.setBounds(200,100,250,30);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);
        
        
         JLabel lbquestion = new JLabel("Security Question");
        lbquestion.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lbquestion.setBounds(40,150,150,50);
        p1.add(lbquestion );
        
        
        tfquestion = new JTextField();
        tfquestion.setBounds(200,160,250,30);
        tfquestion.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfquestion);
        
        
        JLabel lbanswer = new JLabel("Answer");
        lbanswer.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lbanswer.setBounds(40,210,150,50);
        p1.add(lbanswer );
        
        
        tfanswer = new JTextField();
        tfanswer.setBounds(200,220,250,30);
        tfanswer.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfanswer);
        
         retrieve = new JButton("Retrieve");
        retrieve.setOpaque(true);
        retrieve.setBorderPainted(false);
        retrieve.setBackground(Color.black);
        retrieve.setForeground(Color.WHITE);
        retrieve.setBounds(460,220,120,30);
        retrieve.addActionListener(this);
        p1.add(retrieve);
        
        JLabel lbpassword = new JLabel("Password");
        lbpassword.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lbpassword.setBounds(40,270,150,50);
        p1.add(lbpassword);
        
        
        tfpassword = new JTextField();
        tfpassword.setBounds(200,280,250,30);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpassword);
        
        back = new JButton("Back");
         back.setOpaque(true);
         back.setBorderPainted(false);
         back.setBackground(Color.black);
         back .setForeground(Color.WHITE);
         back.setBounds(460,380,120,30);
         back.addActionListener(this);
        p1.add( back );
        
        
        
        
        
        
        setVisible(true);
        
        
        
      
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==search) {
            try {
                String query = "select * from account where username = '"+tfusername.getText()+"' ";
                Conn c = new Conn();
                
                ResultSet rs = c.s.executeQuery(query);
                while(rs.next()){
                    tfname.setText(rs.getString("name"));
                    tfquestion.setText(rs.getString("security"));
                }
                
            }catch (Exception e) {
                e.printStackTrace();
            }
            
        } else if (ae.getSource()==retrieve){
            
             try {
                String query = "select * from account where answer = '"+tfanswer.getText()+"' AND username = '"+tfusername.getText()+"' ";
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                while(rs.next()){
                    tfpassword.setText(rs.getString("password"));
                    
                }
                
            }catch (Exception e) {
                e.printStackTrace();
            }
            
            
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args)
    {
        new ForgetPassword();
    }
    
}
