/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jframe_programa;

import java.awt.BorderLayout;
import java.awt.Color;
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
public class Ventana04 extends JFrame {

    private List<JPanel> jPanelListPrincipal;
    private List<JPanel> jPanelList;

    public Ventana04() throws HeadlessException {

        this.setTitle("Grid Layout");
        this.setSize(800, 600);
        this.setLocation(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarPaneles();

        this.setContentPane(this.jPanelList.get(0));
        this.setVisible(true);

    }

    public void iniciarPaneles() {

        this.jPanelListPrincipal = new ArrayList<>();        
        this.jPanelList = new ArrayList<>();
        
        for(int i =0; i <5;i++){
             this.jPanelListPrincipal.add(new JPanel());
        }

        for (int x = 0; x < 22; x++) {
            this.jPanelList.add(new JPanel());
        }
        
        this.jPanelListPrincipal.get(0).setLayout(new GridLayout(3,3));
        this.jPanelListPrincipal.get(1).setLayout(new GridLayout(3,3));
        this.jPanelListPrincipal.get(2).setLayout(new GridLayout(3,3));
        

        this.jPanelList.get(0).setLayout(new GridLayout(2, 2));
        this.jPanelList.get(1).setLayout(new GridLayout(1, 1));
        this.jPanelList.get(2).setLayout(new GridLayout(4, 1));
        this.jPanelList.get(3).setLayout(new GridLayout(1, 3));
        this.jPanelList.get(4).setLayout(new GridLayout(3, 1));
        this.jPanelList.get(1).setLayout(new BorderLayout());

        this.jPanelList.get(1).setBackground(Color.yellow);
        this.jPanelList.get(2).setBackground(Color.blue);
        this.jPanelList.get(3).setBackground(Color.red);
        this.jPanelList.get(4).setBackground(Color.cyan);

        //Qatar
        this.jPanelList.get(5).setBackground(Color.WHITE);
        this.jPanelList.get(6).setBackground(Color.red);
        //Ecuador
        this.jPanelList.get(7).setBackground(Color.yellow);
        this.jPanelList.get(8).setBackground(Color.yellow);
        this.jPanelList.get(9).setBackground(Color.blue);
        this.jPanelList.get(10).setBackground(Color.red);

        //Senegal
        this.jPanelList.get(11).setBackground(Color.yellow);
        this.jPanelList.get(12).setBackground(Color.green);
        this.jPanelList.get(13).setBackground(Color.red);

        //Holanda
        this.jPanelList.get(14).setBackground(Color.red);
        this.jPanelList.get(15).setBackground(Color.WHITE);
        this.jPanelList.get(16).setBackground(Color.blue);

        //Bordes
        this.jPanelList.get(17).setBackground(Color.gray);
        
        //Paneles
        this.jPanelList.get(0).add(this.jPanelList.get(1));
        this.jPanelList.get(0).add(this.jPanelList.get(2));
        this.jPanelList.get(0).add(this.jPanelList.get(3));
        this.jPanelList.get(0).add(this.jPanelList.get(4));

        //Qatar
        this.jPanelList.get(1).add(this.jPanelList.get(5));
        this.jPanelList.get(1).add(this.jPanelList.get(6));

        //Ecuador
        this.jPanelList.get(2).add(this.jPanelList.get(7));
        this.jPanelList.get(2).add(this.jPanelList.get(8));
        this.jPanelList.get(2).add(this.jPanelList.get(9));
        this.jPanelList.get(2).add(this.jPanelList.get(10));

        //Senegal
        this.jPanelList.get(3).add(this.jPanelList.get(11));
        this.jPanelList.get(3).add(this.jPanelList.get(12));
        this.jPanelList.get(3).add(this.jPanelList.get(13));

        //Holanda
        this.jPanelList.get(4).add(this.jPanelList.get(14));
        this.jPanelList.get(4).add(this.jPanelList.get(15));
        this.jPanelList.get(4).add(this.jPanelList.get(16));
       //Borde
        this.jPanelList.get(1).add(this.jPanelList.get(17), BorderLayout.WEST);

    }
}