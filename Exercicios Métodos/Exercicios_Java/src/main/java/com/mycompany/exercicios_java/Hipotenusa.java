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
public class Hipotenusa {
    public double base;
    public double altura;
    public double hipotenusa;
    
    public void hipotenusa (){
        base = Double.parseDouble(JOptionPane.showInputDialog("Por favor, insira o valor da base do triângulo"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Por favor, insira o valor da altura do triângulo:"));
        
        hipotenusa = ((base*base)+(altura*altura));
        hipotenusa = (Math.sqrt(hipotenusa));
       
        JOptionPane.showMessageDialog(null, "A hipotenusa desse triangulo é " +hipotenusa);  
    }
}
