
package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener{
    
    About(){
        setBounds(450,30,600,660);
        getContentPane().setBackground(new Color(242,167,75));
        setLayout(null);
        
        JLabel l1 = new JLabel("ABOUT");
        l1.setBounds(255, 20,200,30);
        l1.setFont(new Font("Times New Roman", Font.BOLD,25));
        l1.setForeground(Color.WHITE);
        add(l1);
        
        String s = "                                                 About Project         \n  "
                + "\nThe objective of the Travel and Tourism Management System"
                + "project is to develop a system that automates the processes "
                + "and activities of a travel and the purpose is to design a "
                + "system using which one can perform all operations related to "
                + "traveling.\n\n"
                + "This application will help in accessing the information related "
                + "to the travel to the particular destination with great ease. "
                + "The users can track the information related to their tours with "
                + "great ease through this application. The travel agency information "
                + "can also be obtained through this application.\n\n"
                + "Advantages of Project:"
                + "\nGives accurate information"
                + "\nSimplifies the manual work"
                + "\nIt minimizes the documentation related work"
                + "\nProvides up to date information"
                + "\nFriendly Environment by providing warning messages."
                + "\ntravelers details can be provided"
                + "\nbooking confirmation notification"
                ;
        
       TextArea area = new TextArea(s,10,10, Scrollbar.VERTICAL);
       area.setEditable(false);
      area.setBounds(60,100,490,400);
       add(area);
       
         JButton back = new JButton("Back");
                 back.setOpaque(true);
                 back.setBorderPainted(false);
                 back.setBackground(Color.WHITE); 
                 back.setForeground(new Color(242,167,75));
                 back.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                 back.setBounds(240,530,150,38);
                 back.addActionListener(this);
                 add(back);
      
       
       setVisible(true);
       
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
    }
    
    public static void main(String[] args){
        new About();
    }
    
}
