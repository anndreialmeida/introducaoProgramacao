/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mediaponderada;

import java.util.Scanner;

/**
 *
 * @author andrei.almeida
 */
public class MediaPonderada {

    public static void main(String[] args) {
        
        float nota1, nota2, nota3, media;
        int peso1,peso2, peso3;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota: ");
        nota1 = Float.valueOf(input.nextLine());
        System.out.println("Digite o peso da primeira nota: ");
        peso1 = Integer.valueOf(input.nextLine());
        
        System.out.println("Digite a segunda nota: ");
        nota2 = Float.valueOf(input.nextLine());
        System.out.println("Digite o peso da segunda nota: ");
        peso2 = Integer.valueOf(input.nextLine());
        
        System.out.println("Digite a terceira nota: ");
        nota3 = Float.valueOf(input.nextLine());
        System.out.println("Digite o peso da terceira nota: ");
        peso3 = Integer.valueOf(input.nextLine());
        
        
        media = ((nota1*peso1) + (nota2*peso2) + (nota3*peso3))/ (peso1 + peso2+ peso3);
        
        System.out.println("A media das notas é: " + media);
    }
}
