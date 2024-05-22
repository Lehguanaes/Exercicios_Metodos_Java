/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios_java;
import javax.swing.JOptionPane;
/**
 *
 * @author Leticia
 */
    
public class calcMedia {
     public static void main(String[] args) {
        // CLASSE PRINCIPAL
        
        // CONDIÇÃO DE EXECUÇÃO DE PROGRAMA
        int dec;
        do{
            // CHAMAR MÉTODOS
            LerNota();
            dec = Integer.parseInt(JOptionPane.showInputDialog("Há mais algum aluno para cadastrar?\n\n0.Não\n 1.Sim"));
            if (dec > 1 || dec < 0)
                JOptionPane.showMessageDialog(null,"Insira uma opção válida.");
        }
        // VERIFICAÇÃO DE VALORES INVÁLIDOS
        while (dec == 1 || dec > 1 || dec < 0);
        JOptionPane.showMessageDialog(null,"Encerrando o programa..");
    }
    
    // MÉTODO PARA LER NOTAS
        static void LerNota(){
        
        // CRIAÇÃO DE VARIÁVEIS 
        String nome;
        double nota1, nota2;
        
        // LEITURA E ATRIBUIÇÃO DAS VARIÁVEIS
        nome = JOptionPane.showInputDialog("Determine o nome do(a) aluno(a):");
        nota1 = Integer.parseInt(JOptionPane.showInputDialog("Declare a 1° nota do(a) aluno(a):"));
        nota2 = Integer.parseInt(JOptionPane.showInputDialog("Declare a 2° nota do(a) aluno(a):"));
        calcularMedia(nome,nota1,nota2);
    }
    
    // MÉTODO PARA CALCULAR MÉDIA
        static void calcularMedia(String nome, double n1, double n2){
        double media = (n1 + n2)/2;
        if(media<7)
            JOptionPane.showMessageDialog(null, "A média do aluno(a) "+nome+" é de: "+media+", portanto, está REPROVADO!");
        else
            JOptionPane.showMessageDialog(null, "A média do aluno(a) "+nome+" é de: "+media+"; portanto, está APROVADO!");
    }
}

