package mptr;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Sarvesh Solanke
 */
 class registernewuser extends JFrame{
 JPanel panel;
   String value1;
   registernewuser(){
         //JButton SUB;
  JPanel panel;
 
   JTextField  text1,text2;

      
        setTitle("wELCOME");
       setSize(200,200);
          panel=new JPanel(new GridLayout(3,3));
        JLabel label = new JLabel("Welcome:");
           add(label);
          JLabel name = new JLabel("\n\nusername:");
          add(name);
          text1= new JTextField(15);
          add(text1);
          text2= new JTextField(15);
          JLabel pass = new JLabel("password:");
          add(pass);
          add(text2);
          JButton SUB;
     SUB = new JButton( new AbstractAction("Get Started"){
         public void actionPerformed( ActionEvent e ) {
             value1=text1.getText();
             String value2=text2.getText();
            // val=value1;
             System.out.println(value1+"pass");
             FileWriter fr,fr1,flist;
             try {
                 fr = new FileWriter(value1);
                 fr1=new FileWriter(value1+"pass");
                 flist=new FileWriter("flist",true);
                 flist.write(value1);
                 flist.write("\r\n");
                 
                 fr.write(value1);
                 fr1.write(value2);
                 flist.close();
                 fr1.close();
                 fr.close();
             } catch (FileNotFoundException ex) {
                 System.out.println("bhaaiii marega na out of scope ghusra!!!!");
             } catch (IOException ex) {
                System.out.println("bhaaiii marega na out of scope ghusra!!!!");// Logger.getLogger(registernewuser.class.getName()).log(Level.SEVERE, null, ex);
             }
             
             
            
         }
     });
          add(panel,BorderLayout.CENTER);
       setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
      setLayout(new FlowLayout());
       add(SUB);
      
   }}
 