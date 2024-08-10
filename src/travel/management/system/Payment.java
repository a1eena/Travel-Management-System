
package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Payment extends JFrame implements ActionListener{
    
    JButton pay, back;
    
    Payment(){
        setBounds(380,30,800,650);
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/paytm.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(800,600,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,800,600);
        add(image);
        
                 pay = new JButton("Pay");
                 pay.setOpaque(true);
                 pay.setBorderPainted(false);
                 pay.setBackground(new Color(3, 6, 48)); 
                 pay.setForeground(Color.WHITE);
                 pay.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                 pay.setBounds(180,10,150,38);
                 pay.addActionListener(this);
                 image.add(pay);
                
                 back = new JButton("Back");
                 back.setOpaque(true);
                 back.setBorderPainted(false);
                 back.setBackground(new Color(3, 6, 48)); 
                 back.setForeground(Color.WHITE);
                 back.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                 back.setBounds(460,10,150,38);
                 back.addActionListener(this);
                 image.add(back);
                
                 
        
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()== pay){
            setVisible(false);
            new Paytm();
            
            
        } else {
            setVisible(false);
        }

    }
public static void main(String[] args){
      new Payment();
    
    }

}

