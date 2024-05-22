/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.exercicios_metodos;

/**
 *
 * @author Letícia Guanaes Moreira
 */
public class Usuario {
    
    //Atributos
    private String nome;
    private String email;
    private String login;
    private String senha;
    
    //Construtores
    //Inicializando atributos
    public Usuario () {
        this("","","","");
    }
    
    //Inicializando atributos com valores passados por parametro
     public Usuario (String email, String login, String nome, String senha) {
       this.email = email;
       this.login = login;
       this.nome = nome;
       this.senha = senha;
    }
     
      /**
     * @return the nome
     */
    
     public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
   
    //Exibindo os atributos privados
    public void Usuario1(){
        Usuario us = new Usuario ();
        us.nome = "Leticia";
        us.email = "Leh@gmail.com";
        us.login = "Leh";
        us.senha = "1234";
        System.out.println(us.nome);
        System.out.println(us.email);
        System.out.println(us.login);
        System.out.println(us.senha+"\n");
    }
    
     //Métodos especificos da classe
     public void Provar_Existencia () {
         System.out.println("Oi, eu existo!");
     }
      public static void main(String[] args) {
        Usuario usuario1 = new Usuario ();
        
       usuario1.Usuario1();
        usuario1.Provar_Existencia();
    }
}