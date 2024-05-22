/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.exercicios_metodos;

/**
 *
 * @author Letícia Guanaes Moreira
 */
public class Lampada {
    //declarando os atributos
    String potencia;
    String formato;
    String cor;
    
    //declarando os métodos
    void acender(){
        System.out.println("Acender lâmpada");
    }
    
    void apagar(){
         System.out.println("Apagar lâmpada");
    }
      public static void main(String[] args) {
        //instanciando a classe Lampada
        Lampada lamp = new Lampada();
        
        //adicionando valor aos atributos
        lamp.potencia = "5w";
        lamp.cor = "Amarela";
        lamp.formato = "oval";
        
        //adicionando metódos 
        lamp.acender();
        lamp.apagar();
        
        //apresentando saidas dos atributos
        System.out.println(" ");
        System.out.println(lamp.cor);
        System.out.println(lamp.formato);
        System.out.println(lamp.potencia);
    }
}