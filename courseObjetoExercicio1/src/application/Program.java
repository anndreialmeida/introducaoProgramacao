/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import entities.Rectangle;
import java.util.Scanner;

/**
 *
 * @author andrei.almeida
 */
public class Program {
    
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        Rectangle rectangle = new Rectangle();
        
        System.out.println("Enter rectangle Width and Height");
        rectangle.height = Double.valueOf(input.nextLine());
        rectangle.width = Double.valueOf(input.nextLine());
        
        System.out.println(rectangle);   
    }    
}
