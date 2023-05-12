/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.imc;

import java.util.Scanner;

/**
 *
 * @author andrei.almeida
 */
public class Imc {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int peso;
        Double altura, imc;
        boolean acimaPeso;
        
        System.out.println("Digite o seu peso: ");
        peso = Integer.valueOf(input.nextLine());
        
        System.out.println("Digite sua altura: ");
        altura = Double.valueOf(input.nextLine());
        
        imc = peso/(altura*altura);
        
        acimaPeso = imc>25;
        
        System.out.println("IMC: " + imc);
        System.out.println("Acima do Peso: " + acimaPeso);
        
    }
}
