/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.exercicios_metodos;
import javax.swing.JOptionPane;

/**
 *
 * @author Letícia Guanaes Moreira
 */
public class Funcionarios {
    // Declarando variaveis
    private String nome;
    private int idade;
    private int dia_nascido;
    private int dia_atual = 20;
    private int mes_nascido;
    private int mes_atual = 03;
    private int ano_nascido;
    private int ano_atual = 2024;
    private double salario;
    
    public Funcionarios (){
       this("", 0, 0, 0, 0);
    }
    
    public Funcionarios (String nome, int dia_nascido, int mes_nascido, int ano_nascido,double salario)
    {
        this.nome = nome;
        this.dia_nascido = dia_nascido;
        this.mes_nascido = mes_nascido;
        this.ano_nascido = ano_nascido;
        this.salario = salario;
    }
    
    public String getnome() {
        return nome;
    }
    public void setnome (String nome) {
        this.nome = nome;
    }
    
    public Integer getidade() {
        return idade;
    }
    public void setidade (Integer idade) {
        this.idade = idade;
    }
    
   public Integer getdia_nascido() {
        return dia_nascido;
    }
    public void setdia_nascido (Integer dia_nascido) {
        this.dia_nascido = dia_nascido;
    }
    
    public Integer getmes_nascido() {
        return mes_nascido;
    }
    public void setmes_nascido (Integer mes_nascido) {
        this.mes_nascido = mes_nascido;
    }
    
    public Integer getano_nascido() {
        return ano_nascido;
    }
    public void setano_nascido (Integer ano_nascido) {
        this.ano_nascido = ano_nascido;
    }
    
    public double getsalario() {
        return salario;
    }
    public void setsalario (double salario) {
        this.salario = salario;
    }
    
    public void entrada_dados (){
        String nome = JOptionPane.showInputDialog("Por favor, insira o nome do funcionário:");
        setnome(nome);
        
        dia_nascido = Integer.parseInt(JOptionPane.showInputDialog("Vamos calcular a idade de "+this.getnome()+"!\n Insira o dia do nascimento de "+nome+":"));
        setdia_nascido (dia_nascido);
        
        mes_nascido = Integer.parseInt(JOptionPane.showInputDialog("Insira o mês de nascimento de "+this.getnome()+":"));
        setmes_nascido (mes_nascido);
        
        ano_nascido = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano de nascimento de "+this.getnome()+":"));
        setano_nascido (ano_nascido);
        
        salario = Double.parseDouble(JOptionPane.showInputDialog("Por favor, insira o valor do salário de "+this.getnome()+":"));
        setsalario (salario);
        
        // Calculo da idade
        if (dia_atual >= dia_nascido && mes_atual >= mes_nascido) 
        { 
            idade = (ano_atual - ano_nascido);
        }
        else 
        {
            idade = (ano_atual - ano_nascido);
            idade --;
        }
    }
    
    public void mostrar_dados (){
       JOptionPane.showMessageDialog(null, "Exibindo dados do Funcionário! \n O nome do (a) funcionário (a) é: " + this.getnome() +
       ";\n Ele (a) tem: " + this.getidade() + " anos;\n O seu salário é de : R$" +this.getsalario()+".");
    }

    public static void main(String[] args) {
       // Instanciando classe
       Funcionarios funcionario_1 = new Funcionarios ();
       Funcionarios funcionario_2 = new Funcionarios ();
       // Inserindo métodos
       funcionario_1.entrada_dados();
       funcionario_2.entrada_dados();
       funcionario_1.mostrar_dados();
       funcionario_2.mostrar_dados();
    }
}