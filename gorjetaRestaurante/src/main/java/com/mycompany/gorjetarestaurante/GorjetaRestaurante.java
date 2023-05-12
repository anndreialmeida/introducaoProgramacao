/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gorjetarestaurante;

import java.util.Scanner;

/**
 *
 * @author andrei.almeida
 */
public class GorjetaRestaurante {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Double valorGasto, gorjeta, total; 
        
        System.out.println("Digite o valor gasto pelo cliente: ");
        valorGasto = Double.valueOf(input.nextLine());
        
        gorjeta  = valorGasto * 0.10;
        total = valorGasto + gorjeta; 
        
        System.out.println("Valor Gasto " + valorGasto +  "\n" +  "Gorjeta: " + gorjeta + "\n" + "Valor total: " + total);
      
        
        
    }
}
