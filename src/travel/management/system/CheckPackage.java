
package travel.management.system;

import javax.swing.*;
import java.awt.*;

public class CheckPackage extends JFrame{
    
    CheckPackage(){
        setBounds(380,30,800,600);
        
        String[] package1 = {"⚜ GOLD PACKAGE ⚜", "❖ 6 Days and 7 Nights", "❖ Airport Assistance", "❖ Half Day City Tour","❖ Daily Buffet",
            "❖ Welcome Drinks on Arrival",
            "❖ Full Day 3 Island Cruise", "❖ English Speaking Guide", "Book Now", "Summer Special", "$400", "pic22.jpeg"};
        
         String[] package2 = {"⚜ SILVER PACKAGE ⚜","❖ 5 Days and 6 Nights", "❖ Airport Assistance", "❖ Welcome Drinks on Arrival", "❖ Night Safari","❖ Full Day 2 Island Cruise", "❖ BBQ Dinner", "❖ Free Soft Drinks", "Book Now", "Summer Special", "$300", "pic16.jpg"};
         
          String[] package3 = {"⚜ BRONZE PACKAGE ⚜", "❖ 4 Days and 5 Nights", "❖ Return AirFare", "❖ Free Clubbing and Horse Riding", "❖ Drinks free","❖ Daily Buffet", "❖ Dinner at Cruise", "❖ English Speaking Guide", "Book Now", "Summer Special", "$350", "pic17.jpg"};
          
        
        JTabbedPane tab = new JTabbedPane();
        
        JPanel p1 = createPackage(package1);
        tab.addTab("Package 1", null, p1);
        tab.setFont(new Font("Times New Roman", Font.BOLD,20));
        tab.setForeground(new Color(0, 75, 73));
        
        JPanel p2 = createPackage(package2);
        tab.addTab("Package 2", null, p2);
        tab.setFont(new Font("Times New Roman", Font.BOLD,20));
        tab.setForeground(new Color(0, 75, 73));
        
        JPanel p3 = createPackage(package3);
        tab.addTab("Package 3", null, p3);
        tab.setFont(new Font("Times New Roman", Font.BOLD,20));
        tab.setForeground(new Color(0, 75, 73));
        add(tab);
        
        setVisible(true);
    }
  
    
    public JPanel createPackage(String[] pack) {
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(242, 186, 73));
        
        JLabel l1 = new JLabel(pack[0]);
        l1.setBounds(50,5,300,30);
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("Times New Roman", Font.BOLD,25));
        p1.add(l1);
        
        JLabel l2 = new JLabel(pack[1]);
        l2.setBounds(30,60,300,30);
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("Times New Roman", Font.BOLD,20));
        p1.add(l2);
        
        JLabel l3 = new JLabel(pack[2]);
        l3.setBounds(30,100,300,30);
        l3.setForeground(Color.WHITE);
        l3.setFont(new Font("Times New Roman", Font.BOLD,20));
        p1.add(l3);
        
        JLabel l4 = new JLabel(pack[3]);
        l4.setBounds(30,140,300,30);
        l4.setForeground(Color.WHITE);
        l4.setFont(new Font("Times New Roman", Font.BOLD,20));
        p1.add(l4);
        
        JLabel l5 = new JLabel(pack[4]);
        l5.setBounds(30,180,300,30);
        l5.setForeground(Color.WHITE);
        l5.setFont(new Font("Times New Roman", Font.BOLD,20));
        p1.add(l5);
        
        JLabel l6 = new JLabel(pack[5]);
        l6.setBounds(30,220,300,30);
        l6.setForeground(Color.WHITE);
        l6.setFont(new Font("Times New Roman", Font.BOLD,20));
        p1.add(l6);
        
        JLabel l7 = new JLabel(pack[6]);
        l7.setBounds(30,260,300,30);
        l7.setForeground(Color.WHITE);
        l7.setFont(new Font("Times New Roman", Font.BOLD,20));
        p1.add(l7);
        
        JLabel l8 = new JLabel(pack[7]);
        l8.setBounds(30,300,300,30);
        l8.setForeground(Color.WHITE);
        l8.setFont(new Font("Times New Roman", Font.BOLD,20));
        p1.add(l8);
        
        
        JLabel l9 = new JLabel(pack[8]);
        l9.setBounds(50,360,300,30);
        l9.setForeground(Color.BLACK);
        l9.setFont(new Font("Times New Roman", Font.BOLD,25));
        p1.add(l9);
        
        JLabel l10 = new JLabel(pack[9]);
        l10.setBounds(50,400,300,30);
        l10.setForeground(Color.BLACK);
        l10.setFont(new Font("Times New Roman", Font.BOLD,25));
        p1.add(l10);
        
        JLabel l11 = new JLabel(pack[10]);
        l11.setBounds(50,440,300,30);
        l11.setForeground(Color.BLACK);
        l11.setFont(new Font("Times New Roman", Font.BOLD,25));
        p1.add(l11);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons2/" +pack[11]));
        Image i2 = i1.getImage().getScaledInstance(440,550,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l12 = new JLabel(i3);
        l12.setBounds(400,0,440,550);
        p1.add(l12);
        
        return p1;
        
        
    }
    
    public static void main(String[] args){
        new CheckPackage();
    }
    
}
