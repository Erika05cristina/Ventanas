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
        var ventana01 = new Ventana01("Ventana 01");

        ventana01.iniciarComponentes();
        ventana01.setVisible(true);

    }
}
