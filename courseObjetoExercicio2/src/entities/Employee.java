/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author andrei.almeida
 */
public class Employee {
    public String name; 
    public double grossSalary;
    public int tax;
    
    public double netSalaray() {
        
        return grossSalary -  tax;
    }
    
    public void increaseSalary(double percentage){
        grossSalary += (grossSalary* percentage)/100;
    }
    
    public String toString(){
        
        return ": " +  name + ", $ " + (grossSalary - tax);
    }
}
