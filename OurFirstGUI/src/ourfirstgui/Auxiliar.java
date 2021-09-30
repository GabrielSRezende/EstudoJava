/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ourfirstgui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Auxiliar implements ActionListener{
    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;
    private static JLabel error;
    
      public void Teste(){
          JPanel panel = new JPanel();
         JFrame frame = new JFrame();
         frame.setSize(300, 200);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.add(panel);
         
         panel.setLayout(null);
         
         userLabel = new JLabel("User");
         userLabel.setBounds(10, 20, 80, 25);
         panel.add(userLabel);
         
         userText = new JTextField(20);
         userText.setBounds(100, 20, 165, 25);
         panel.add(userText);

         passwordLabel = new JLabel("Password");
         passwordLabel.setBounds(10, 50, 80, 25);
         panel.add(passwordLabel);
         
         passwordText = new JPasswordField(20);
         passwordText.setBounds(100, 50, 165, 25);
         panel.add(passwordText);
         
        button = new JButton("Enter");
        button.setBounds(50, 100, 165, 25);
        button.addActionListener(new Auxiliar());
        panel.add(button);
        
        success = new JLabel("");
        success.setBounds(10, 130, 300, 25);
        panel.add(success);
        
        error = new JLabel("");
        error.setBounds(10, 130, 300, 25);
        panel.add(error);
        //success.setText
         
         frame.setVisible(true);
         
     }

    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();
        System.out.println(user+" "+password);
        
        if(user.equals("Alex") && password.equals("123")) {
            success.setText("Login seccessful!");
        } 
        else
            error.setText("Login error!");
            
    }
    
    public void Teste2(){
          JPanel panel = new JPanel();
         JFrame frame = new JFrame();
         frame.setSize(300, 200);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.add(panel);
         
         panel.setLayout(null);
         
         userLabel = new JLabel("User");
         userLabel.setBounds(10, 20, 80, 25);
         panel.add(userLabel);
         
         userText = new JTextField(20);
         userText.setBounds(100, 20, 165, 25);
         panel.add(userText);
         
         frame.setVisible(true);
         
     }
  
}

