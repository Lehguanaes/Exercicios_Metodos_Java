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
public class Diferenca_Numero {
    public double numero_um;
    public double numero_dois;
    
    public void diferenca (){
        numero_um = Double.parseDouble(JOptionPane.showInputDialog("Por favor, insira o 1° número"));
        numero_dois = Double.parseDouble(JOptionPane.showInputDialog("Por favor, insira o 2° número"));
  
        if (numero_um>numero_dois)
        {
            JOptionPane.showMessageDialog(null, "A diferença entre "+numero_um+" e o "+numero_dois+" é de "+(numero_um-numero_dois));  
        }
        if (numero_um<numero_dois)
        {
           JOptionPane.showMessageDialog(null, "A diferença entre "+numero_dois+" e o "+numero_um+" é de "+(numero_dois-numero_um)); 
        }
        else
            JOptionPane.showMessageDialog(null, "Os números digitados são iguais!");  
    }
}
