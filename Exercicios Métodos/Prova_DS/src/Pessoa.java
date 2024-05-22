/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.JOptionPane;
/**
 *
 * @author Letícia Guanaes Moreira
 */
public class Pessoa {
    public String nome;
    public String sexo;
    public int idade;
    public String faixa;
 
    void pegar_nome (){
      nome = JOptionPane.showInputDialog("Informe seu nome: ");
      sexo = JOptionPane.showInputDialog("Informe seu sexo: ");
      idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:"));
   
    }
           
    void classificar () {
        if (idade <= 0) {
        faixa = "recem nascido";
        }
        else if (idade <= 2) {
        faixa = "bebe";
        }
        else if (idade <= 11) {
        faixa = "criança";
        }
        else if (idade <= 19) {
        faixa = "adolescente";
        }
        else if (idade <= 30) {
        faixa = "jovem";
        }
         else if (idade <= 60) {
        faixa = "adulto";
        }
         else 
           faixa = "idoso";
}
     void exibir () {
        
         JOptionPane.showMessageDialog(null, "Seu nome é: " +nome+ "\n Sua idade é: "+idade+"\n Seu sexo é: "+sexo+"\n Sua faixa é: "+faixa );
    }
}