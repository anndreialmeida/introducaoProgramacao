
package com.mycompany.exemplos;

import java.util.Scanner;

public class Exemplos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nome;
        int idade; 
        float peso;
        char genero;
        boolean matriculado; 
        
        System.out.println("Digite seu nome: ");
        nome = input.nextLine();
        
        System.out.println("Digite a sua idade: ");
        idade = Integer.valueOf(input.nextLine());
        
        System.out.println("Qual o seu peso: ");
        peso = Float.valueOf(input.nextLine());
        
        System.out.println("Qual seu genero: ");
        //genero = input.nextLine().charAt(0);
        genero = input.nextLine().charAt(0);
        
        System.out.println("Esta matriculado: ");
        matriculado = Boolean.valueOf(input.nextLine());
        
        
        
        
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Genero: " + genero);
        
        System.out.println("Matriculado: " + matriculado);
    }
}
