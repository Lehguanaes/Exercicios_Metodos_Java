/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.JOptionPane;
/**
 *
 * @author Letícia Guanaes Moreira
 */
public class Conta {
    public String numero_conta;
    public double saldo = 100;
    public double limite;
    public double saque;
    public double rept;
    public double deposito;
     
            
    void deposito () {
        deposito =  Double.parseDouble(JOptionPane.showInputDialog("Quanto você deseja depositar?"));
        saldo = saldo + deposito;
    }
    void saque () {
         saque = Double.parseDouble(JOptionPane.showInputDialog("Quanto você deseja sacar?"));
                       if (saque<=500)
                       {
                           saldo = saldo - saque;
                           JOptionPane.showMessageDialog(null, "Seu saldo é de R$"+saldo);
                           rept =1;
                       }
                       else{
                           JOptionPane.showMessageDialog(null, "Seu saldo é de R$"+saldo+" por isso, você não pode realizar esse saque");
                           rept= Integer.parseInt(JOptionPane.showInputDialog("Caso não queira sacar digite 1 \n Caso queira informar outro valor para sacar digite 0"));
                       }
    }
    void impExtrato() {
         JOptionPane.showMessageDialog(null, "Seu saldo é R$"+saldo+"\n Voce fez um deposito de: "+deposito+"\n Voce fez um saque de: "+saque);
    }
    void consultar_saldo () {
         JOptionPane.showMessageDialog(null, "Seu saldo é R$"+saldo);
    }
       
}