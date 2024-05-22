
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Letícia Guanaes Moreira
 */
public class Gerente {
    public double salario;
    public double taxa_variavel;
    public double taxa_fixa = 0.1;
    
    void aumento_salarial_variavel () {
        salario = Double.parseDouble(JOptionPane.showInputDialog("Por favor, insira o salario:"));
        taxa_variavel = Double.parseDouble(JOptionPane.showInputDialog("Por favor, insira o valor da taxa:"));
       
        salario = ((salario * taxa_variavel)+(salario));
        JOptionPane.showMessageDialog(null,"O valor de seu salario com a taxa variavel é: "+salario);
    }
     void aumento_salarial_fixo () {
        salario = Double.parseDouble(JOptionPane.showInputDialog("Por favor, insira o salario:"));
        salario = ((salario * taxa_fixa)+(salario));
        JOptionPane.showMessageDialog(null,"O valor de seu salario com a taxa fixa é: "+salario);
    }
}