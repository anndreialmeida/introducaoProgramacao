/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import entities.Product;
import java.util.Scanner;

/**
 *
 * @author andrei.almeida
 */
public class Program {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Entrer product data: ");

        System.out.println("Name: ");
        product.name = String.valueOf(input.nextLine());

        System.out.println("Price: ");
        product.price = Double.valueOf(input.nextLine());

        System.out.println("Quantity in stock: ");
        product.quantity = Integer.valueOf(input.nextLine());

        System.out.println("Product data: " + product);

        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = Integer.valueOf(input.nextLine());
        product.addProucts(quantity);

        System.out.println("Updated data: " + product);
        
        System.out.println("\n Enter the number of products to be removed from stock: ");
        int quantity2 = Integer.valueOf(input.nextLine());
        product.removeProducts(quantity2);
        
        System.out.println("Updated data: " + product);
    }

}
