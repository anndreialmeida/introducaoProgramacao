/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.celsiusfahre;

import java.util.Scanner;

/**
 *
 * @author andrei.almeida
 */
public class CelsiusFahre {

    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        
        Double celsius, temperatura;
        
        System.out.println("Digite a temperatura em Celsius que deseja converter para Fahrenheit: ");
        celsius = Double.valueOf(input.nextLine());
        
        temperatura = 9.0 *celsius /5 + 32; 
        
        System.out.println("A temperatura em Fahrenheit é: " + temperatura);
              
    }
}
