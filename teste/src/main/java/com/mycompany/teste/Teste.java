/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.teste;

import java.util.Scanner;

/**
 *
 * @author andrei.almeida
 */
public class Teste {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in );
        
        int n = 6, valor; 
        boolean divisivel, naoDivisivel;
        
         divisivel = n % 2 == 0;
         naoDivisivel = n % 2 == 1;
         System.out.println(divisivel);
         System.out.println(naoDivisivel);
          	
		
    }
}
