/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quocienteresto;

import java.util.Scanner;

/**
 *
 * @author andrei.almeida
 */
public class QuocienteResto {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int valor, quociente, resto;
        
        System.out.println("Digite um valor: ");
        valor = Integer.valueOf(input.nextLine());
        
         quociente = valor/2;
         resto = valor%2;
         
         System.out.println("Quociente: " + quociente);
         System.out.println("Resto: " + resto);

        
    }
}
