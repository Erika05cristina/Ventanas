/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jframe_programa;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Kristina
 */
public class Ventana01 extends JFrame {

    private List<JPanel> jPanelList;

    public Ventana01(String title) throws HeadlessException {
        super(title);
        this.setSize(500, 700);
        this.setLocation(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.jPanelList = new ArrayList<>();
        this.setLayout(new FlowLayout());
    }

    public void iniciarComponentes() {
        
        
        var jPanelRojo = new JPanel();
        jPanelRojo.setBackground(Color.red);
        var jPanelAzul = new JPanel();
        jPanelAzul.setBackground(Color.blue);
        var jPanelVerd = new JPanel();
        jPanelVerd.setBackground(Color.green);
        var jPanelRosa = new JPanel();
        jPanelRosa.setBackground(Color.pink);
        var jPanelCyan = new JPanel();
        jPanelCyan.setBackground(Color.cyan);

        this.jPanelList.add(jPanelRojo);
        this.jPanelList.add(jPanelAzul);
        this.jPanelList.add(jPanelVerd);
        this.jPanelList.add(jPanelRosa);
        this.jPanelList.add(jPanelCyan);

        this.getContentPane().add(this.jPanelList.get(0));
        this.getContentPane().add(this.jPanelList.get(1));
        this.getContentPane().add(this.jPanelList.get(2));
        this.getContentPane().add(this.jPanelList.get(3));
        this.getContentPane().add(this.jPanelList.get(4));

        for(var jPanel : this.jPanelList){
            this.getContentPane().add(jPanel);   
        }
    }

}
