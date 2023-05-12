/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.revendacarrossalario;


import java.util.Scanner;

/**
 *
 * @author andrei.almeida
 */
public class RevendaCarrosSalario {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Double salarioMin, valorVendas, salarioTotal;
        int qtdVeic;
        
        System.out.println("Digite o valor do salário minimo: ");
        salarioMin = Double.valueOf(input.nextLine());
        
        System.out.println("Digite a quantidade de veiculos vendidos: ");
        qtdVeic = Integer.valueOf(input.nextLine());
        
        System.out.println("Digite o valor das vendas: ");
        valorVendas = Double.valueOf(input.nextLine());
        
        salarioTotal = (salarioMin *2) + (150 * qtdVeic) + (valorVendas * 0.05);
        
        System.out.println("O salário desse mês é:  " + salarioTotal);
        
    }
}
