/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversordistancia;

import java.util.Scanner;

/**
 *
 * @author andrei.almeida
 */
public class ConversorDistancia {

    public static void main(String[] args) {
        
        // 1 pé = 12 polegadas
        // 1 jarda = 3 pés
        // 1 milha = 1760 jardas
        
        Double qtdPes, valorPolegadas, valorJardas, valorMilhas;
        Double milha = 0.000189394;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a o valor em Pés que deseja converter: ");
        qtdPes = Double.valueOf(input.nextLine());
        
        valorPolegadas = qtdPes*12;
        valorJardas = qtdPes/3;
        valorMilhas = qtdPes * milha;
        
        System.out.println("Valor em Polegadas: " + valorPolegadas);
        System.out.println("Valor em Jardas: " + valorJardas);
        System.out.println("Valor em milhas: " + valorMilhas);
        
        
        
    }
}
