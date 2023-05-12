/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aretriangleo;

import entities.Triangle;
import java.util.Scanner;

/**
 *
 * @author andrei.almeida
 */
public class AreTriangleO {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
       Triangle x, y;
       
       x = new Triangle();
       y = new Triangle();
       
       System.out.println("Enter the measures of Triangle X.a");
       x.a = Double.valueOf(input.nextLine());
       
       System.out.println("Enter the measures of Triangle X.b");
       x.b = Double.valueOf(input.nextLine());
       
       System.out.println("Enter the measures of Triangle X.c");
       x.c = Double.valueOf(input.nextLine());
       
       System.out.println("Enter the measures of Triangle y.a");
       y.a = Double.valueOf(input.nextLine());
       
       System.out.println("Enter the measures of Triangle y.b");
       y.b = Double.valueOf(input.nextLine());
       
       System.out.println("Enter the measures of Triangle y.c");
       y.c = Double.valueOf(input.nextLine());
       
       double areX = x.area();
       double areY = y.area();
       
        System.out.println("Area Tringulo X: " + areX);
        
        
        System.out.println("Area Tringulo Y: " + areY);
    }
}
