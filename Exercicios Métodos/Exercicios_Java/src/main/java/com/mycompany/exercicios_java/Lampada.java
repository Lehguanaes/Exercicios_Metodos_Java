/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios_java;

import javax.swing.JOptionPane;

/**
 *
 * @author Leticia Guanaes Moreira
 */
public class Lampada {
    String estado_lampada;
    String acender = "acender";
    String apagar = "apagar";
    
    public void mostrar_estado (){
        estado_lampada = JOptionPane.showInputDialog("Caso queira acender a luz, digite 'acender'.\n Mas, caso queira desligar a luz, digite 'apagar'.");
    
        if (estado_lampada.equals(acender))
        {
            JOptionPane.showMessageDialog(null,"Esta lampada está acessa!");
        }
        else if (estado_lampada.equals(apagar))
        {
            JOptionPane.showMessageDialog(null,"Esta lampada está apagada!");
        }
        else 
            JOptionPane.showMessageDialog(null,"Você digitou incorretamente!");
    }
}
