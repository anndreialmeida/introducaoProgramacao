/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.perimetroretangulo;

import java.util.Scanner;

/**
 *
 * @author andrei.almeida
 */
public class perimetroRetangulo {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        Double base, altura, area, perimetro; 
        
        System.out.println("Digite a base do retangulo: ");
        base = Double.valueOf((input.nextLine()));
        
        System.out.println("Digite a algtura do retangulo: ");
        altura = Double.valueOf(input.nextLine());
        
        area = base * altura; 
        perimetro = (2*base) + (2*altura);
        
        System.out.println("A area do meu retangulo é: " + area);
        System.out.println("O perimetro do meu retangulo é: " + perimetro);

        
    }
}
