/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quilowatt;
import java.util.Scanner;
/**
 *
 * @author andrei.almeida
 */
public class Quilowatt {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Double preco, valorConta;
        int qtdWatt;
        boolean altoConsumo;
        
         System.out.println("Digite o preço do Quilowatt: ");
         preco = Double.valueOf(input.nextLine());
         
         System.out.println("Digite a quantidde de Quilowatt consumida: ");
         qtdWatt = Integer.valueOf(input.nextLine());
         
         valorConta = preco  * qtdWatt;
         
         altoConsumo = qtdWatt > 70;
         
         System.out.println("Valor da conta em dia: " + valorConta);
         System.out.println("Valor da conta em atraso " + (valorConta += valorConta *0.10));
        
         System.out.println("Residencia com alto consumo? " + altoConsumo);
        
        
        
        
    }
}
