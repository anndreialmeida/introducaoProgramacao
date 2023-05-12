/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.fatorial;

import java.util.Scanner;

/**
 *
 * @author andrei.almeida
 */
public class Fatorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número: ");
        numero = Integer.valueOf(input.nextLine());

        if (numero == 0) {
            System.out.println("Fatorial de " + numero + " é 1 ");
        } else {
            for (int i = numero - 1; i > 0; i--) {
                numero *= i;
            }
        }
        System.out.println("Fatorial do número é: " + numero);
    }
}
