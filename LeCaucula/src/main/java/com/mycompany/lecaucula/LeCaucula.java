package com.mycompany.lecaucula;

import java.util.Scanner;
public class LeCaucula {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num1, num2, num3;
        float soma, media, produto;
               
        System.out.println("Digite o primeiro valor: ");
        num1 = Integer.valueOf(input.nextLine());
        System.out.println("Digite o segundo valor: ");
        num2 = Integer.valueOf(input.nextLine());
        System.out.println("Digite o terceiro valor: ");
        num3 = Integer.valueOf(input.nextLine());
        
        soma =  num1 + num2 + num3;
        media = ( num1 + num2) / 2f;
        produto = num1 * num2 * num3;
        
        System.out.println("A soma dos valores: " + soma);
        System.out.println("A media dos valores: " + media);
        System.out.println("O produto dos valores: " + produto);
        
    }
}
