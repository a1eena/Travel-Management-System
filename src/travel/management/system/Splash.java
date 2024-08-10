
package travel.management.system;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable{
    Thread thread;
    
    Splash(){
        //setSize(1300,700);
        //setLocation(15,0);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons2/pic1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1300, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        
        add(image);
        
        setVisible(true);
        thread = new Thread(this);
        thread.start();
        
        
        
    }
    public void run(){
        try{
            Thread.sleep(7000);
            setVisible(false);
            new Login();
            
        }catch (Exception e){
            
        }
        
        
    }
    
    public static void main (String[] args){
        
        Splash frame = new Splash();
        
        int x=1;
        for(int i=1; i<=590; x+=7, i+=6){
            frame.setLocation(640-(x+i)/2,350-(i/2));
            frame.setSize(x+i,i);
            try{
               Thread.sleep(9);
                
            }catch (Exception e){
                
                
            }
        }
        
    }
    
    
    }
