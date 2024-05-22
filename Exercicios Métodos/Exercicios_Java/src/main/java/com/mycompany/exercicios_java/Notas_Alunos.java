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
public class Notas_Alunos {
    // Declarando variaveis
    public String nome;
    public double nota_um;
    public double nota_dois;
    public double media;
    
    public void ler_nota (){ // Atribuindo valores as variaveis (recebendo valores)
        String nome = JOptionPane.showInputDialog("Por favor, insira o nome do aluno:");
        nota_um = Double.parseDouble(JOptionPane.showInputDialog("Por favor, insira a 1° nota de "+nome+":"));
        nota_dois = Double.parseDouble(JOptionPane.showInputDialog("Por favor, insira a 2° nota de "+nome+":"));
    }
   
    void calcular_média (){ //calculando a média do aluno
        media = ((nota_um+nota_dois)/2);
        if (media>=7)
        {
           JOptionPane.showMessageDialog(null, "O aluno (a) "+nome+" está aprovado com média "+media);  
        }
        else
        {
           JOptionPane.showMessageDialog(null, "O aluno(a) "+nome+" reprovado com média "+media);  
        }
    }
}