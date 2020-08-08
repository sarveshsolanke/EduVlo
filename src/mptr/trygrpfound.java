/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mptr;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Expsar LLC
 */
public class trygrpfound extends JFrame{
    JPanel panel;
   String value1;
    trygrpfound() throws FileNotFoundException, IOException
    {JPanel panel;
   
    JButton SUB;
       setSize(400,400);
          panel=new JPanel(new GridLayout(3,3));
        JLabel label = new JLabel("Welcome:");
           add(label);
           SUB = new JButton( new AbstractAction("Get Started"){
         public void actionPerformed( ActionEvent e ) {  }
     });
              
            
              
    FileReader fr22 =   new FileReader("ACTIVEUSER");
    BufferedReader br=new BufferedReader(fr22);
            String line1,st;
            StringBuffer sb=new StringBuffer();
         
            while((line1=br.readLine())!=null)
            {
                sb.append(line1);
              // sb.append("\n");
               System.out.println("userssss="+line1);
               try { 
               FileReader  fr = new FileReader("flistof_"+line1);
                  BufferedReader br1=new BufferedReader(fr);
            String line12,st1;
            StringBuffer sb1=new StringBuffer();
         
            while((line12=br1.readLine())!=null)
            {
                sb1.append(line12);}
                 
                 add(SUB);
        
             } catch (FileNotFoundException ex) {
                 Logger.getLogger(trygrpfound.class.getName()).log(Level.SEVERE, null, ex);
             }
            }
     //----------------------------------
             
            System.out.println("user in found="+line1);
            System.out.println("DONE FOUND GRPO");  
             
            
       
        add(panel,BorderLayout.CENTER);
       setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
      setLayout(new FlowLayout());
       
    }
    
    
}
