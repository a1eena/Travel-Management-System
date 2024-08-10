
package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignUp extends JFrame implements ActionListener{
    JButton create, back;
    JTextField tfname, tfusername, tfpassword, tfanswer;
    Choice security;
    
    SignUp(){
        setBounds(90,50,1100,600);
        getContentPane().setBackground(new Color(242,167,75));
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(242,167,75));
        p1.setBounds(20,10,600,550);
        p1.setLayout(null);
        add(p1);
        
        JLabel heading = new JLabel("SIGNUP");
        heading.setBounds(20,20, 500, 50);
        heading.setFont ( new Font("Inter" , Font.BOLD, 24));
        heading.setForeground(new Color(22,22,29));
        p1.add(heading);
        
        JLabel lbusername = new JLabel("Username");
        lbusername.setFont(new Font("Times New Roman", Font.PLAIN, 23));
        lbusername.setBounds(30,90,100,50);
        p1.add(lbusername);
        
         tfusername = new JTextField();
        tfusername.setBounds(220,100,250,30);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);
        
        
        JLabel lbname = new JLabel("Name");
        lbname.setFont(new Font("Times New Roman", Font.PLAIN, 23));
        lbname.setBounds(30,150,100,50);
        p1.add(lbname);
        
         tfname = new JTextField();
        tfname.setBounds(220,160,250,30);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);
        
        
         JLabel lbpassword = new JLabel("Password");
        lbpassword.setFont(new Font("Times New Roman", Font.PLAIN, 23));
        lbpassword.setBounds(30,210,100,50);
        p1.add(lbpassword);
        
         tfpassword = new JTextField();
        tfpassword.setBounds(220,220,250,30);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpassword);
        
        JLabel lbsecurity = new JLabel("Security Question");
        lbsecurity.setFont(new Font("Times New Roman", Font.PLAIN, 23));
       lbsecurity.setBounds(30,270,185,50);
         p1.add(lbsecurity);
         
          security = new Choice();
         security.add("Fav Color");
          security.add("Your Lucky number");
           security.add("Fav Place to Travel");
            security.add("Fav Cartoon Charactor");
             security.setBounds(220,276,230,40);
              p1.add(security);
        
              
        JLabel lbanswer = new JLabel("Answer");
        lbanswer.setFont(new Font("Times New Roman", Font.PLAIN, 23));
        lbanswer.setBounds(30,326,100,50);
        p1.add(lbanswer);
        
         tfanswer = new JTextField();
        tfanswer.setBounds(220,336,250,30);
        tfanswer.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfanswer);
        
         create = new JButton("Create");
        create.setForeground(new Color(242,167,75));
        create.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        create.setBounds(80,420,150, 38);
        create.addActionListener(this);
        p1.add(create);
        
         back = new JButton("Back");
        back.setForeground(new Color(242,167,75));
        back.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        back.setBounds(350,420,150, 38);
        back.addActionListener(this);
        p1.add(back);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons2/pic10.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400,600,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(650,0,400,600);
        add(image);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == create){
            String username = tfusername.getText();
            String name = tfname.getText();
            String password = tfpassword.getText();
            String question = security.getSelectedItem();
            String answer = tfanswer.getText();
            
            String query = "insert into account values('"+username+"', '"+name+"', '"+password+"', '"+question+"', '"+answer+"')";
            try{
                Conn c = new Conn();
                c.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null,"Account Created Successfully");
                
                setVisible(false);
                new Login();
                
            }catch (Exception e){
                e.printStackTrace();
            }
            
        } else if (ae.getSource() == back){
            setVisible(false);
            new Login();
        }
        
        
    }
    
    public static void main(String[] args){
        new SignUp();
    }
}
