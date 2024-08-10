
package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class Login extends JFrame implements ActionListener{
    
    JButton apassword,llogin,signup;
    JTextField tfpassword, tfusername;
    
    Login() {
        setSize(1100,600);
        setLocation(90,50);
        setLayout(null);
        
        getContentPane().setBackground(new Color(242,167,75));
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(242,167,75));
        p1.setBounds(500,50,600,600);
        add(p1);
          
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons2/pic8.jpg"));
        Image i2 = i1.getImage().getScaledInstance(650,450,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400,50,400,600);
        p1.add(image);
        
        
        
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(25,0,475,600);
        add(p2);
        
        JLabel heading = new JLabel("WELCOME TO TOURPAL!");
        heading.setBounds(30, 0, 500, 50);
        heading.setFont ( new Font("Inter" , Font.BOLD, 20));
        heading.setForeground(Color.BLACK);

        p2.add(heading);
        
         JLabel introd = new JLabel();
         introd.setBounds(30, 35, 400, 100);
        introd.setFont ( new Font("Inter" , Font.PLAIN, 15));
        introd.setForeground(Color.BLACK);
        
        introd.setText(
        "<html>"+ 
                "Discover, plan, and explore your dream destinations effortlessly with our user-friendly travel and tourism management app." + "<br><br>" +
                 "<html>"
           );
        p2.add(introd);
        
        
        JLabel username = new JLabel("Username");
        username.setBounds(30,110,300,50);
        username.setFont(new Font("Times New Roman", Font.PLAIN, 21));
        p2.add(username);
        
        
        tfusername = new JTextField();
        tfusername.setBounds(30,160,300,30);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfusername);
        
       
        JLabel password = new JLabel("Password");
        password.setBounds(30,200,300,50);
        password.setFont(new Font("Times New Roman", Font.PLAIN, 21));
         p2.add(password);
        
        
        tfpassword = new JTextField();
        tfpassword.setBounds(30,250,300,30);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
         p2.add(tfpassword);
        
         
         llogin = new JButton("Login");
        llogin.setOpaque(true);
        llogin.setBorderPainted(false);
        llogin.setBounds(40, 330, 230, 40);
        llogin.setBackground(new Color(242,167,75)); 
        llogin.setForeground(Color.BLACK);
        llogin.setFont(new Font("Inter", Font.PLAIN, 16));
        llogin.addActionListener(this);
          p2.add(llogin);
        
        
         signup = new JButton("Signup");
        signup.setOpaque(true);
        signup.setBorderPainted(false);
        signup.setBounds(40, 390, 230, 40);
        signup.setBackground(new Color(242,167,75));
        signup.setForeground(Color.BLACK);
        signup.setFont(new Font("Inter", Font.PLAIN, 16));
        signup.addActionListener(this);
        p2.add(signup);
        
        
         apassword = new JButton("Forget Password");
         apassword.setOpaque(true);
         apassword.setBorderPainted(false);
        apassword.setBounds(40,470,230,40);
        apassword.setBackground(new Color(242,167,75));
        apassword.setForeground(Color.BLACK);
        apassword.setFont(new Font("Inter", Font.PLAIN, 16));
        apassword.addActionListener(this); 
        p2.add(apassword);
        
        
         JLabel text = new JLabel("Trouble logging in...");
        text.setBounds(300,470,300,40);
        text.setForeground(Color.red);
         p2.add(text);
        
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == llogin){
            try {
                String username = tfusername.getText();
                String pass = tfpassword.getText();
                
                String query = "select * from account where username = '"+username+"' AND password = '"+pass+"'";
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                if(rs.next()) {
                    setVisible(false);
                    new Loading(username);
                    
                } else {
                    JOptionPane.showMessageDialog(null,"Incorrect username or password");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        
    } 
        else if (ae.getSource()==signup){
        setVisible(false);
        new SignUp();
    } 
    else {
        setVisible(false);
        new ForgetPassword();
    }
    }
    public static void main(String[] args){
        new Login();
    }
}
