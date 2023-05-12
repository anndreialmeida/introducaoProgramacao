/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.avaliacaosistema;

import java.util.Scanner;

/**
 *
 * @author andrei.almeida
 */
public class AvaliacaoSistema {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int prova1, prova2, trabalho, frequencia;
        boolean aprovado;
        
        System.out.println("Digite a nota da prova 1: ");
        prova1 = Integer.valueOf(input.nextLine());
        
        System.out.println("Digite a nota da prova 2: ");
        prova2 = Integer.valueOf(input.nextLine());
        
        System.out.println("Digite a nota do trabalho: ");
        trabalho = Integer.valueOf(input.nextLine());
        
        System.out.println("Digite a frequencia do aluno: ");
        frequencia = Integer.valueOf(input.nextLine());
         
        aprovado = (((trabalho >= 6)&& (prova1 >= 6 || prova2 >= 6)) && ((frequencia >= 75) || (trabalho>= 6 && frequencia >=90))); 
           
        System.out.println("Aprovado: " + aprovado);

        
    }
}
