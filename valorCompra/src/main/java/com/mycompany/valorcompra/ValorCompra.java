/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.valorcompra;

import java.util.Scanner;

/**
 *
 * @author andrei.almeida
 */
public class ValorCompra {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
      
        Double valorCompra, valorPago, valorTroco, resto;
        int notas100, notas10, notas1;
        
        System.out.println("Digite o valor da compra: ");
        valorCompra = Double.valueOf(input.nextLine());
        
        System.out.println("Digite o valor pago: ");
        valorPago = Double.valueOf(input.nextLine());
        
        valorTroco = valorPago - valorCompra;
        
        System.out.println("Troco: " + valorTroco);
        
        notas100 = (int)(valorTroco / 100);
        
        resto = (valorTroco % 100);
    
        notas10 = (int)(resto/10);
        
        notas1 = (int)(resto%10);

        System.out.println("Notas R$100: " + notas100);
        System.out.println("Notas R$10: " + notas10);
        System.out.println("Notas R$1: " + notas1);
        
    }
}
