/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.supermercadocompra;

import java.util.Scanner;

/**
 *
 * @author andrei.almeida
 */
public class SupermercadoCompra {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int qtdCafe, qtdLeite, qtdBolacha;
        Double custoCafe, custoLeite, custoBolacha, totalCafe, totalLeite, totalBolacha, totalCompra;
        
        System.out.println("Digite a quantidade de Café: ");
        qtdCafe = Integer.valueOf(input.nextLine());
        
        System.out.println("Digite o preço do Café: ");
        custoCafe = Double.valueOf(input.nextLine());
        
        System.out.println("Digite a quantidade de Leite: ");
        qtdLeite = Integer.valueOf(input.nextLine());
        
        System.out.println("Digite o preço do Leite: ");
        custoLeite = Double.valueOf(input.nextLine());
        
        System.out.println("Digite a quatnidade de Bolacha: ");
        qtdBolacha = Integer.valueOf(input.nextLine());
        
        System.out.println("Digite o preço da Bolacha: ");
        custoBolacha = Double.valueOf(input.nextLine());
        
        totalCafe = qtdCafe * custoCafe;
        totalLeite = qtdLeite * custoLeite;
        totalBolacha = qtdBolacha * custoBolacha;
        
        totalCompra = totalCafe + totalLeite + totalBolacha;
        
        System.out.println("Total gasto com Café: " + totalCafe); 
        System.out.println("Total gasto com Leite: " + totalLeite); 
        System.out.println("Total gasto com Leite: " + totalBolacha);
        
        System.out.println("Total geral da compra: " + totalCompra);

    }
}
