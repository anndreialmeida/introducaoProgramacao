/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.restaurantequilo;

import java.util.Scanner;

/**
 *
 * @author andrei.almeida
 */
public class RestauranteQuilo {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Double pesoReal, valorPagar, peso;
        
        
        System.out.println("Digite o peso: ");
        peso = Double.valueOf(input.nextLine());
        
        pesoReal = (peso - 450.0) / 1000;
        valorPagar = pesoReal * 39.0;
        
        
        System.out.println("O valor do prato é: " +  valorPagar);
    }
}
