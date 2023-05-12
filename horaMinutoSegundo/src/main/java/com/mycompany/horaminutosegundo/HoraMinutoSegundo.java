/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.horaminutosegundo;

import java.util.Scanner;

/**
 *
 * @author andrei.almeida
 */
public class HoraMinutoSegundo {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int segundos, horas, minutos;
        
        System.out.println("Digite o valor em segundos: ");
        segundos = Integer.valueOf(input.nextLine());
        
        horas =  segundos / 3600; 
        segundos = segundos % 3600;
        minutos = segundos / 60;
        segundos = segundos % 60;

        System.out.println("Horas minutos segundos: " + horas + "h" + minutos +"m" + segundos + "s");
  
    }
}
