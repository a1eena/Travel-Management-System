
package travel.management.system;

import javax.swing.*;
import java.awt.*;


public class Loading extends JFrame implements Runnable {
    Thread t;
    JProgressBar bar;
    String username;
    public void run() {
        try {
            for(int i=1; i<=101; i++){
                int max = bar.getMaximum();
                int value = bar.getValue();
                
                if (value < max) {// 101 < 100
                    bar.setValue(bar.getValue() + 1);
                } else {
                    setVisible(false);
                    new Dashboard(username);
                }
                Thread.sleep(50);
            }
            
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
    Loading(String username) {
        this.username = username;
        t = new Thread(this);
        
        setBounds(300,200,650,400);
        getContentPane().setBackground(new Color(242,167,75));
        setLayout(null);
        
        JLabel text = new JLabel("TourPal ");
        text.setBounds(50,20,600,40);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("raleway", Font.BOLD, 35));
        add(text);
        
        bar = new JProgressBar();
        bar.setBounds(180,100,300,100);
        bar.setStringPainted(true);
        add(bar);
        
        
        JLabel loading = new JLabel("Loading, please wait... ");
        loading.setBounds(230,160,500,30);
        loading.setForeground(Color.WHITE);
        loading.setFont(new Font("raleway", Font.PLAIN, 20));
        add(loading);
        
        
        JLabel lblusername = new JLabel("Welcome "+ username);
        lblusername.setBounds(270,300,900,30);
        lblusername.setForeground(Color.WHITE);
        lblusername.setFont(new Font("raleway", Font.PLAIN, 20));
        add(lblusername);
        
        t.start();
      setVisible(true);
        
    }
    
    public static void main(String[] args) {
        new Loading("");
    }
    
}
