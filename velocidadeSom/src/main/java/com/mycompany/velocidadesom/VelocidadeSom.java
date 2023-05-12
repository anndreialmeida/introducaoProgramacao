/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.velocidadesom;

import java.util.Scanner;

/**
 *
 * @author andrei.almeida
 */
public class VelocidadeSom {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Double tempo, distancia;
        int velocidadeSom;
        boolean perigo;
        
        
        velocidadeSom = 340;
        
        System.out.println("Digite o tempo que transcorreu entre ter visto o raio e ter ouvido o som do trovão: ");
        tempo = Double.valueOf(input.nextLine());
        
        distancia = tempo * velocidadeSom;
        
        perigo = distancia < 200;
        
        System.out.println("Distancia: " + distancia);
        System.out.println("Representou Perigo? " + perigo);
        
        
    }
}
