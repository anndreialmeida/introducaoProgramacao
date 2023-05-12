/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.linhanum;

import java.util.Scanner;

/**
 *
 * @author andrei.almeida
 */
public class Linhanum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numero;
        
        System.out.println("Digite o número: ");
        numero = Integer.valueOf(input.nextLine());
        
        for (int i =1; i <=numero; i++){
            System.out.println("-> " +i +" ->-> " + i*i +" -> -> ->"+ (i*i) *i);
        }
    }
}
