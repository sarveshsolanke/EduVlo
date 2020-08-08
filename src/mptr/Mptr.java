/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mptr;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import NextPage;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class Login extends JFrame  
 {public int flag=0;
  JButton SUBMIT,reg;
  JPanel panel;
  JLabel label1,label2;
  final JTextField  text1,text2;
 String st,st1,name,pass,rem="flistof_";
   Login() throws Exception 
   {
   label1 = new JLabel();
   label1.setText("  Vlo Call:");
   text1 = new JTextField(15);
 
   label2 = new JLabel();
   label2.setText("Password:");
   text2 = new JPasswordField(15);
  //reg=new JButton("Register Edu vlo");
  // SUBMIT=new JButton("Get Started");
    JButton SUBMIT= new JButton( new AbstractAction("Get Started") {
        @Override
        public void actionPerformed( ActionEvent e ) {
          String value1=text1.getText();
   String value2=text2.getText();
      name=value1;
      pass=value2;
       
      try {
          FileReader fr = 
                  new FileReader(value1);
           FileReader fr1 = 
                  new FileReader(value1+"pass");
            FileWriter fr22;
     fr22 = new FileWriter("ACTIVEUSER");
     fr22.write(value1);
     fr22.close();
          check();
      } catch (FileNotFoundException ex) {
            
      } catch (Exception ex) {
          showMessageDialog(null, "ALIEN FOUND!!", "ERROR", ERROR_MESSAGE);
      }
    
        }

       private void showMessageDialog(Object object, String message, String title, int ERROR_MESSAGE) {
           throw new UnsupportedOperationException("Not supported yet.");
       }
    });
   JButton reg = new JButton( new AbstractAction("Register Edu vlo") { 
        @Override
        public void actionPerformed( ActionEvent e ) {getContentPane().removeAll();
        getContentPane().repaint();
        setVisible(false); //you can't see me!
dispose();
        register();
        }

       private void register() {
           registernewuser obj=new registernewuser();
         //  NextPage page=new NextPage();
   obj.setVisible(true);
    flag=1;
      setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
     //  flag=1;
  // obj.getContentPane().add(label);
    
          
       }
    });
   
   panel=new JPanel(new GridLayout(3,3));
   panel.add(label1);
   panel.add(text1);
   panel.add(label2);
   panel.add(text2);
   panel.add(SUBMIT);
   panel.add(reg);
   add(panel,BorderLayout.CENTER);

   setTitle("LOGIN THERAPY");
   setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
   }
  

    private void check() throws Exception  {
            FileReader fr = 
      new FileReader(name); 
           FileReader fr1 = 
      new FileReader(name+"pass"); 
        System.out.println("\n name:"+name);
    int i; 
    while ((i=fr.read()) != -1) {
      System.out.print((char) i);
      st=st+(char)i;
        System.out.println("\n"+st);
    }
    int j; 
    while ((j=fr1.read()) != -1) {
      System.out.print((char) j);
      st1=st1+(char)j;
    }
    name="null"+name;
    pass="null"+pass;
     String value1;
 

        System.out.println("\npass check:"+st+"\n and pass:"+st1+"\n");
    if (name.equals(st) && pass.equals(st1)) {
  // NextPage page=new NextPage();
  // page.setVisible(true);
   //JLabel label = new JLabel("Welcome:");
nextpageee obj=new nextpageee(name);
obj.setVisible(true);
 //  page.getContentPane().add(label);
   }
   
   else{
   System.out.println("nhaiii eronggg jaraaa sambhal");
   JOptionPane.showMessageDialog(this,"Incorrect Attempt",
   "Error",JOptionPane.ERROR_MESSAGE);
   
       }
       
    }

    
}
/**
 *
 * @author Sarvesh Solanke
 */
public class Mptr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
   {
   Login frame=new Login();
   frame.setSize(300,100);
   frame.setVisible(true);
   }
   catch(Exception e)
   {JOptionPane.showMessageDialog(null, e.getMessage());}
   }
    
}     





