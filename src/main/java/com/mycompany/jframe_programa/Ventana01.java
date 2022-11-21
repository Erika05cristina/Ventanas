/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jframe_programa;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Kristina
 */
public class Ventana01 extends JFrame {

    private List<JPanel> jPanelList;
    private List<JLabel> jLabelList;
    private List<JLabel> jLabelImg;

    public Ventana01(String title) throws HeadlessException {
        super(title);
        this.setSize(500, 700);
        this.setLocation(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.iniciarLabel();
        this.setVisible(true);
        this.setLayout(new FlowLayout());

    }

    public void iniciarComponentes() {
        this.jPanelList = new ArrayList<>();

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

        for (var jPanel : this.jPanelList) {
            this.getContentPane().add(jPanel);
        }
    }

    public void iniciarLabel() {
        this.jLabelList = new ArrayList<>();
        this.jLabelImg = new ArrayList<>();
        
         JLabel etiqueta = new JLabel(new ImageIcon("icoEcuador.png"));
          etiqueta.setBounds(10, 80, 400, 300);
          this.jPanelList.get(1).add(etiqueta);

        var labelImagen = new JLabel();
       
        labelImagen.setBounds(50, 70, 400, 350);
        labelImagen.add(new JLabel(new ImageIcon("icoEcuador.png")));
        labelImagen.setBounds(10, 80, 400, 300);
        //labelImagen.setIcon(new ImageIcon("icoEcuador.png"));

        this.jLabelImg.add(labelImagen);
        this.getContentPane().add(this.jLabelImg.get(0));

        this.jLabelList.add(new JLabel("Qatar"));
        this.jLabelList.add(new JLabel("Ecuador"));
        this.jLabelList.add(new JLabel("Clombia"));
        
        this.jPanelList.get(3).add(this.jLabelImg.get(0));
        this.jPanelList.get(0).add(this.jLabelList.get(0));

        this.jPanelList.get(0).add(this.jLabelList.get(1));
        this.jPanelList.get(0).add(this.jLabelList.get(2));

    }
}
