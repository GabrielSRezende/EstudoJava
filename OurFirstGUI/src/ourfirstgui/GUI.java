/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ourfirstgui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author gabri
 */
public class GUI implements ActionListener{
    
    private int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;
    
    
    public GUI(){
        
        frame = new JFrame();
        
        JButton button = new JButton("Click me");
        button.addActionListener(this);
        
        label = new JLabel();
        
        panel = new JPanel(); //representa o container
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        
        int teste = 0;
        if(teste ==1 ){
        panel.add(button);
        }
        
        panel.add(label);
        
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack(); //compacta a tela para o tamanho de componentes 
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        // GUI - GRAPHIC USER INTERFACE 
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks: " + count);
    }
}
