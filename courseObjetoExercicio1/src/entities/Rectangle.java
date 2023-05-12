/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author andrei.almeida
 */
public class Rectangle {
    
    public double width, height;
    
    public double area(){
        return width * height;
    }
    
    public double perimeter (){
        return ((2*width) + (2*height));
    }
    
    public double diagonal(){
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }
    
    @Override
    public String toString(){
        return "AREA = " + area() + "\nPERIMETER = " + perimeter() + "\nDIAGONAL = "+ diagonal() ;
    }
}
