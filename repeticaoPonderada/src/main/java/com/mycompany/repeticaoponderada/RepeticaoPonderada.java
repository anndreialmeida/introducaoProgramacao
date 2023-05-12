/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.repeticaoponderada;

import java.util.Scanner;

/**
 *
 * @author andrei.almeida
 */
public class RepeticaoPonderada {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int casosTeste;
        Double valor1, valor2, valor3, media;

        System.out.println("Digite o quantidade de casos : ");
        casosTeste = Integer.valueOf(input.nextLine());

        for (int i = 0; i < casosTeste; i++) {
            System.out.println("Digite o valor 1: ");
            valor1 = Double.valueOf(input.nextLine());

            System.out.println("Digite o valor 2: ");
            valor2 = Double.valueOf(input.nextLine());

            System.out.println("Digite o valor 3: ");
            valor3 = Double.valueOf(input.nextLine());

            media = (valor1 * 2.0 + valor2 * 3.0 + valor3 * 5.0) / 10.0;

            System.out.printf("A sua média é: %.1f%n", media);
        }

    }
}
