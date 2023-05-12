/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.entrevalores;

import java.util.Scanner;

/**
 *
 * @author andrei.almeida
 */
public class EntreValores {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int qtdValores, x = 1, numeroDigitado, countEntre =0, countGeral = 0;

        System.out.println("Digite a quantidade de valores que serão lidos: ");
        qtdValores = Integer.valueOf(input.nextLine());

        while (x <= qtdValores) {
            System.out.println("Digite o número: ");
            numeroDigitado = Integer.valueOf(input.nextLine());
            
            if (numeroDigitado >=10 && numeroDigitado <=20){
                countEntre ++;
                x ++;
            }else{
                countGeral++;
                x++;
            }
        }
        
        System.out.println("Numeros que estão entre [10 ,20 ]: " + countEntre + " IN");
        System.out.println("Numeros Gerais: " + countGeral + " OUT");

    }
}
