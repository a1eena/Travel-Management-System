
package travel.management.system;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Paytm extends JFrame implements ActionListener{
    JButton back ;
    
    Paytm() {
        setBounds(380,30,800,600);
        
        JEditorPane pane = new JEditorPane();
        pane.setEditable(false);
        
        try {
            pane.setPage("https://paytm.com/rent-payment");
        } catch (Exception e) {
            pane.setContentType("text/html");
            pane.setText("<html>Could not load, Error 404</html>");
            
            
        }
        
        JScrollPane sp = new JScrollPane(pane);
        getContentPane().add(sp);
        
                 back = new JButton("Back");
                 back.setOpaque(true);
                 back.setBorderPainted(false);
                 back.setBackground(new Color(3, 6, 48)); 
                 back.setForeground(Color.WHITE);
                 back.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                 back.setBounds(460,10,150,38);
                 back.addActionListener(this);
                 pane.add(back);
      
                 
                 
        setVisible(true);
    }
    
    
    
    public static void main(String[] args){
        new Paytm();
    }

    
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
