/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import java.util.Scanner;

/**
 *
 * @author andrei.almeida
 */
public class Program {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("What is the dollar price?");
        double price = Double.valueOf(input.nextLine());
        System.out.println("How many dollars will be bought? ");
        double value = Double.valueOf(input.nextLine());
        
        
    }
}
