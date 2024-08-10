
package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Dashboard extends JFrame implements ActionListener{
    
   
    
    String username;
    
     JButton addPersonalDetails, viewPersonalDetails, updatePersonalDetails, checkpackages, bookpackages, viewpackage,viewhotels,destinations, bookhotel, viewbookhotels, pay, about, deletePersonalDetails;     
     
    Dashboard(String username){
        this.username = username;
        //setBounds(0,0,1300,710);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        getContentPane().setBackground(new Color(242,167,75));
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(242,167,75));
        p1.setBounds(0,0,1300,50);
        add(p1);
        
        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(100,20,300,30);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma", Font.BOLD, 22));
        p1.add(heading);
                
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(242,167,75));
        p2.setBounds(20,100,300,520);
        add(p2);
        
        
        addPersonalDetails = new JButton("Personal Details");
        
        addPersonalDetails.setBorderPainted(true);
        addPersonalDetails.setBounds(0,0,300,40);
        addPersonalDetails.setBackground(new Color(242,167,75));
        addPersonalDetails.setForeground(new Color(242,167,75));
        addPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 18));
        //addPersonalDetails.setMargin(new Insets(0,0,0,60));
        addPersonalDetails.addActionListener(this);
        p2.add(addPersonalDetails);
        
        updatePersonalDetails = new JButton("Update Personal Details");
       
        updatePersonalDetails.setBorderPainted(true);
        updatePersonalDetails.setBounds(0,40,300,40);
        updatePersonalDetails.setBackground(new Color(242,167,75));
        updatePersonalDetails.setForeground(new Color(242,167,75));
        updatePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 18));
        //updatePersonalDetails.setMargin(new Insets(0,0,0,50));
        
        p2.add(updatePersonalDetails);
        
          
        viewPersonalDetails = new JButton("View Details");
        
        viewPersonalDetails.setBorderPainted(true);
        viewPersonalDetails.setBounds(0,80,300,40);
        viewPersonalDetails.setBackground(new Color(242,167,75));
        viewPersonalDetails.setForeground(new Color(242,167,75));
        viewPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 18));
        //viewPersonalDetails.setMargin(new Insets(0,0,0,60));
        viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);
        
         deletePersonalDetails = new JButton("Delete Details");
        
        deletePersonalDetails.setBorderPainted(true);
        deletePersonalDetails.setBounds(0,120,300,40);
        deletePersonalDetails.setBackground(new Color(242,167,75));
        deletePersonalDetails.setForeground(new Color(242,167,75));
        deletePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 18));
        //viewPersonalDetails.setMargin(new Insets(0,0,0,60));
        deletePersonalDetails.addActionListener(this);
        p2.add(deletePersonalDetails);
        
         checkpackages = new JButton("Check Packages");
         
         checkpackages.setBorderPainted(true);
         checkpackages.setBounds(0,160,300,40);
         checkpackages.setBackground(new Color(242,167,75));
         checkpackages.setForeground(new Color(242,167,75));
         checkpackages.setFont(new Font("Tahoma", Font.PLAIN, 18));
        //viewPersonalDetails.setMargin(new Insets(0,0,0,60));
        checkpackages.addActionListener(this);
        p2.add( checkpackages);
        
         bookpackages = new JButton("Book Packages");
         
         bookpackages.setBorderPainted(true);
         bookpackages.setBounds(0,200,300,40);
         bookpackages.setBackground(new Color(242,167,75));
         bookpackages.setForeground(new Color(242,167,75));
         bookpackages.setFont(new Font("Tahoma", Font.PLAIN, 18));
        //viewPersonalDetails.setMargin(new Insets(0,0,0,60));
        bookpackages.addActionListener(this);
        p2.add( bookpackages);
        
        
        viewpackage = new JButton("View Packages");
         viewpackage.setBorderPainted(true);
         viewpackage.setBounds(0,240,300,40);
         viewpackage.setBackground(new Color(242,167,75));
         viewpackage.setForeground(new Color(242,167,75));
         viewpackage.setFont(new Font("Tahoma", Font.PLAIN, 18));
        //viewPersonalDetails.setMargin(new Insets(0,0,0,60));
        viewpackage.addActionListener(this);
        p2.add( viewpackage);
        
         viewhotels = new JButton("View Hotels");
        viewhotels.setBorderPainted(true);
         viewhotels.setBounds(0,280,300,40);
         viewhotels.setBackground(new Color(242,167,75));
         viewhotels.setForeground(new Color(242,167,75));
         viewhotels.setFont(new Font("Tahoma", Font.PLAIN, 18));
        //viewPersonalDetails.setMargin(new Insets(0,0,0,60));
        viewhotels.addActionListener(this);
        p2.add( viewhotels);
        
        bookhotel = new JButton("Book Hotels");
        bookhotel.setBorderPainted(true);
         bookhotel.setBounds(0,320,300,40);
        bookhotel.setBackground(new Color(242,167,75));
         bookhotel.setForeground(new Color(242,167,75));
         bookhotel.setFont(new Font("Tahoma", Font.PLAIN, 18));
         bookhotel.addActionListener(this);
        //viewPersonalDetails.setMargin(new Insets(0,0,0,60));
        p2.add( bookhotel);
        
         viewbookhotels = new JButton("View-Booked Hotels");
        viewbookhotels.setBorderPainted(true);
         viewbookhotels.setBounds(0,360,300,40);
        viewbookhotels.setBackground(new Color(242,167,75));
         viewbookhotels.setForeground(new Color(242,167,75));
         viewbookhotels.setFont(new Font("Tahoma", Font.PLAIN, 18));
        //viewPersonalDetails.setMargin(new Insets(0,0,0,60));
        viewbookhotels.addActionListener(this);
        p2.add( viewbookhotels);
        
         destinations= new JButton("Destinatons");
        destinations.setBorderPainted(true);
         destinations.setBounds(0,400,300,40);
        destinations.setBackground(new Color(242,167,75));
         destinations.setForeground(new Color(242,167,75));
         destinations.setFont(new Font("Tahoma", Font.PLAIN, 18));
        //viewPersonalDetails.setMargin(new Insets(0,0,0,60));
        destinations.addActionListener(this);
        p2.add( destinations);
        
        
         pay = new JButton("Payments");
        pay.setBorderPainted(true);
        pay.setBounds(0,440,300,40);
        pay.setBackground(new Color(242,167,75));
        pay.setForeground(new Color(242,167,75));
        pay.setFont(new Font("Tahoma", Font.PLAIN, 18));
        pay.addActionListener(this);
        
        //viewPersonalDetails.setMargin(new Insets(0,0,0,60));
        p2.add( pay);
        
         about = new JButton("About");
        about.setBorderPainted(true);
        about.setBounds(0,480,300,40);
        about.setBackground(new Color(242,167,75));
        about.setForeground(new Color(242,167,75));
        about.setFont(new Font("Tahoma", Font.PLAIN, 18));
        //viewPersonalDetails.setMargin(new Insets(0,0,0,60));
        about.addActionListener(this);
        p2.add( about);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons2/pic14.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1300, 800, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0,0,1300,800);
        
        add(image);
        
        
        
        
        
        
        
        
        
        
        
                
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == addPersonalDetails) {
            new AddCustomer(username);
        } else if (ae.getSource() ==viewPersonalDetails) {
            new ViewCustomer(username);
        } else if (ae.getSource() == updatePersonalDetails){
            new UpdateCustomer(username);
        }else if (ae.getSource() == checkpackages){
            new CheckPackage();
        } else if (ae.getSource() == bookpackages){
            new BookPackage(username);
        } else if (ae.getSource() == viewpackage){
            new ViewPackage(username);
        } else if (ae.getSource() == viewhotels){
            new CheckHotels();
        }else if (ae.getSource() == destinations){
            new Destinations();
        }else if (ae.getSource() == bookhotel){
            new BookHotel(username);
        }else if (ae.getSource() == viewbookhotels){
            new ViewBookedHotel(username);
        }else if (ae.getSource() == pay){
            new Payment();
        }else if(ae.getSource() == about){
            new About();
        
       } else if(ae.getSource() == deletePersonalDetails){
           new DeleteDetails(username);
       }
    }  
    
    public static void main(String[] args) {
        new Dashboard("");
    }
    
}
