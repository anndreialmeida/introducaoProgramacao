/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.imparesint;

import java.util.Scanner;

/**
 *
 * @author andrei.almeida
 */
public class ImparesInt {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x; 
        
        System.out.println("Digite o número: ");
        x = Integer.valueOf(input.nextLine());
        
        for (int i = 1 ; i <= x; i++){
            
            if (i%2 != 0){
                System.out.println("Impar: " + i);
            }else{
                System.out.println("Par: " + i);
            }
            
        }
    }
}
