/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sorveteria;

import java.util.Scanner;

/**
 *
 * @author andrei.almeida
 */
public class Sorveteria {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int qtdP1, qtdp2, qtdp3; 
        
        double preco1 = 1.50, preco2 = 2.00, preco3 = 0.75, totalTipo1, totalTipo2, totalTipo3, totalGeral;  
        
        System.out.println("Digite a quatnidade vendida do picolé tipo 1: ");
        qtdP1 = Integer.valueOf(input.nextLine());
        
        System.out.println("Digite a quatnidade vendida do picolé tipo 2: ");
        qtdp2 = Integer.valueOf(input.nextLine());
        
        System.out.println("Digite a quatnidade vendida do picolé tipo 3: ");
        qtdp3 = Integer.valueOf(input.nextLine());
        
        totalTipo1 = qtdP1 * preco1;
        totalTipo2 = qtdp2 * preco2;
        totalTipo3 = qtdp3 * preco3; 
        
        totalGeral = totalTipo1 + totalTipo2 + totalTipo3;
        
        System.out.println("Valor de vendas Picolé Tipo 1: " + totalTipo1);
        System.out.println("Valor de vendas Picolé Tipo 2: " + totalTipo2);
        System.out.println("Valor de vendas Picolé Tipo 3: " + totalTipo3);
        System.out.println("Valor total geral: " + totalGeral);
    }
}
