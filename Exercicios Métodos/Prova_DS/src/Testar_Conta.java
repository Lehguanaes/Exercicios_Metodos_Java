/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.JOptionPane;

/**
 *
 * @author Letícia Guanaes Moreira
 */
public class Testar_Conta {
    public static void main(String[] args) {
        Conta conta = new Conta ();
        int menu;
        int rept;
        
        do{
            menu = Integer.parseInt(JOptionPane.showInputDialog("Bem vindo ao Banco \n Digite 1 para ver seu Saldo. \n Digite 2 para sacar \n Digite 3 para Depositar. \n Digite 4 para ver Extrato. \n Digite 5 para Finalizar."));
            switch (menu){
                
                case 1:
                    conta.consultar_saldo();
                    break;
                    
                case 2:
                      
                      conta.saque();
                    break;
                    
                      
                case 3:
                      conta.deposito();
                       break;   
                
                  case 4:
                      conta.impExtrato();
                    break;
                case 5:
                    break;
                    default:
                       JOptionPane.showMessageDialog(null, "Opção invalida");  
            }
            rept = 0;
        }
        while (menu != 5);
    }
}
