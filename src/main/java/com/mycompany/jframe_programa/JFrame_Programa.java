/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.jframe_programa;

import javax.swing.JFrame;

/**
 *
 * @author Kristina
 */
public class JFrame_Programa {

    public static void main(String[] args) {
        var ventana01 = new JFrame ();
        ventana01.setTitle("VENTANA 01");
        ventana01.setSize(500, 700);
        ventana01.setLocation(800, 600);
        ventana01.setVisible(true);
        ventana01.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        var ventana02 = new JFrame ();
        ventana02.setTitle("VENTANA 02");
        ventana02.setSize(300, 500);
        ventana02.setLocation(100, 300);
        ventana02.setVisible(true);
        ventana02.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
         var ventana03 = new JFrame ();
        ventana03.setTitle("VENTANA 03");
        ventana03.setSize(500, 100);
        ventana03.setLocation(800, 600);
        ventana03.setVisible(true);
        ventana03.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        var ventana04 = new JFrame ();
        ventana04.setTitle("VENTANA 04");
        ventana04.setSize(800, 1000);
        ventana04.setLocation(1000, 600);
        ventana04.setVisible(true);
        ventana04.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
