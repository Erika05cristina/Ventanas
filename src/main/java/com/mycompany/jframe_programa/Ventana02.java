/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jframe_programa;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Kristina
 */
public class Ventana02 extends JFrame {
    
    private List<JPanel> jPanelList;
    public Ventana02() throws HeadlessException {
        super("Grid Layout");
        this.setSize(800, 600);
        this.setLocation(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.jPanelList.get(0).setLayout(new GridLayout (2,3));
        this.setContentPane(this.jPanelList.get(0));
        this.setVisible(true);
        this.setLayout(new FlowLayout());

    }
    
    public void iniciarPanel(){
        this.jPanelList=new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        
        this.jPanelList.get(1).setBackground(Color.yellow);
        this.jPanelList.get(2).setBackground(Color.blue);
        this.jPanelList.get(3).setBackground(Color.red);
        this.jPanelList.get(4).setBackground(Color.cyan);
        this.jPanelList.get(5).setBackground(Color.green);
        this.jPanelList.get(6).setBackground(Color.magenta);
        
        this.jPanelList.get(0).add(this.jPanelList.get(1));
        this.jPanelList.get(0).add(this.jPanelList.get(2));
        this.jPanelList.get(0).add(this.jPanelList.get(3));
        this.jPanelList.get(0).add(this.jPanelList.get(4));
        this.jPanelList.get(0).add(this.jPanelList.get(5));
        this.jPanelList.get(0).add(this.jPanelList.get(6));
        
        
        
        
        
                
              
             
    }
    
}
