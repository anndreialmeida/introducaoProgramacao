/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.divisores;

import java.util.Scanner;

/**
 *
 * @author andrei.almeida
 */
public class Divisores {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero;
        System.out.println("Digite o número: !");
        numero = Integer.valueOf(input.nextLine());

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.println("É divisivel: " + i);
            }else {
                System.out.println("NÃO É DIVISIVEL : " + i);
            }
        }
    }
}
