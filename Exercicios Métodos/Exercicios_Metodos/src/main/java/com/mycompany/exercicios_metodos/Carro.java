/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.exercicios_metodos;

/**
 *
 * @author Letí­cia Guanaes Moreira
 */
public class Carro {
    // Declarando os atributos
    String ano;
    String cor;
    String marca;
    String modelo;
    String chassi;
    
    // Declarando os Métodos
    void ligar(){
        System.out.println("Ligar carro");
    }
    
    void acelerar(){
        System.out.println("acelerar carro");
    }
    
    void frear(){
        System.out.println("Frear carro");
    }
    
    void trocar_marcha(){
        System.out.println("Trocar marcha do carro");
    }
   
    void desligar(){
        System.out.println("desligar carro");
    }

    public static void main(String[] args) {
       //instanciando a classe Carro
       Carro car = new Carro();

       //adicionando valor aos atributos
       car.ano = "2024";
       car.cor = "vermelho";
       car.marca = "Bmw";
       car.modelo = "BMW 330e";
       car.chassi = "00000000000000000";

       //apresentando saidas dos atributos
       System.out.println(car.ano);
       System.out.println(car.cor);
       System.out.println(car.marca);
       System.out.println(car.modelo);
       System.out.println(car.chassi+"\n");

       //adicionando metódos 
       car.ligar();
       car.acelerar();
       car.frear();
       car.trocar_marcha();
       car.desligar();
       }
   }