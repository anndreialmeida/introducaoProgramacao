/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import entities.Employee;
import java.util.Scanner;

/**
 *
 * @author andrei.almeida
 */
public class Program {
    
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        Employee employee = new Employee();
        
        System.out.println("Name: ");
        employee.name = input.nextLine();
        
        System.out.println("Gross Salary: ");
        employee.grossSalary = Double.valueOf(input.nextLine());
        
        System.out.println("TAX: ");
        employee.tax = Integer.valueOf(input.nextLine());
    
        System.out.println("Employee: " + employee.netSalaray());
        
        System.out.println("Which percentage to increase salary? ");
        int percentage = Integer.valueOf(input.nextLine());
        
        employee.increaseSalary(percentage);
        
        System.out.println("Update Data: " + employee.toString());
    }
}
