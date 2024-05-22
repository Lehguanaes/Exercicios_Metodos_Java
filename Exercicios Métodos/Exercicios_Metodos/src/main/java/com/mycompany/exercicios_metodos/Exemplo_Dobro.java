/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.exercicios_metodos;
import javax.swing.JOptionPane;

/**
 *
 * @author Letícia Guanaes Moreira
 */

//Exemplo - Dobro de um N°

public class Exemplo_Dobro {
    public static void main(String[] args) {
        digite();
    }
    static void digite()
    {
        int a;
        //JOptionPane.showMessageDialog(null,"Digite um número: ");
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        dobro (a);
    }
    static void dobro(int n)
    {
        int d = n*2;
        JOptionPane.showMessageDialog(null,"O dobro de "+n+" é "+d+".");
    }  
}