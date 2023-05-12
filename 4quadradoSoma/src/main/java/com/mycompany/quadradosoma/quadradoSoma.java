/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quadradosoma;

import java.util.Scanner;

/**
 *
 * @author andrei.almeida
 */
public class quadradoSoma {

    public static void main(String[] args) {
         Double a, b, resultado;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Digite o primeiro número: ");
        a = Double.valueOf(input.nextLine());
        
        System.out.println("Digite o segundo número: ");
        b = Double.valueOf(input.nextLine());
        
        resultado = (a + b) *  (a + b);
        
        System.out.println("A soma dos quadrados dos números é: " + resultado);
    }
}
