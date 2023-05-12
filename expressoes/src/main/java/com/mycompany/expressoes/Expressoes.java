/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.expressoes;

/**
 *
 * @author andrei.almeida
 */
public class Expressoes {

    public static void main(String[] args) {
      /*
        Double a, b, c, d, e, f, g, h;
        
        a = 5.0 + 3.0 * 6.0 /2;
        b = 36.0 / 3.0 * 2 - 5 +8;
        c = 30.0 / 4 * 6;
        d = 30.0 % 4 * 6;
        e = 5.0 * 7.0 % 3.0 + 4.0 / 2.0 + 5.0; // 9 
        f = (5 * 7 % 3 + 4) / 2.0 + 5.0;
        g = (5 * 7 % 3) + 4 / (2 + 5.0);
        h = (5 * 7 % 3) + 4 / 2 + 5.0;
        
        System.out.println("Expressão: 5 + 3 * 6 / 2: --- Resultado: " + a); 
        
        System.out.println("Expressão:36 / 3 * 2 – 5 +8: --- Resultado: " + b);
        
        System.out.println("Expressão:30.0 / 4 * 6: --- Resultado: " + c);
        
        System.out.println("Expressão:30.0 % 4 * 6: --- Resultado: " + d);
        
        System.out.println("Expressão: 5.0 * 7.0 % 3.0 + 4.0 / 2.0 + 5.0: --- Resultado: " + e);
        
        System.out.println("Expressão: (5 * 7 % 3 + 4) / 2.0 + 5.0: --- Resultado: " + f);

        System.out.println("Expressão: (5 * 7 % 3) + 4 / (2 + 5.0): --- Resultado: " + g);
        
        System.out.println("Expressão: (5 * 7 % 3) + 4 / 2 + 5.0: --- Resultado: " + h);
        
      
        Double valor_a = 7.0;
        Double p = 10.0;
        Double x = 13.0;
        Double r = 0.0;
        r = (valor_a = p * valor_a + x);
        System.out.println("R:" + r);
        
        */
        boolean res;
        // Apresente os resulta True/False: 
        res = 5+3*6/2>=10;
        System.out.println("res: " + res);
        res = 36/3*2-5+8 == 27;
        System.out.println("res: " + res);
        res = ! (30 / 4 * 6 == 15);
        System.out.println("res: " + res);
        res = (30 % 4 * 6 == 12) || true;
        System.out.println("res: " + res);
        res = (5 * 7 % 3) + 4 / 2 + 5 == 12 && (12 / 4 < 8);
        System.out.println("res: " + res);
        res = (((5 * 7 % 3 + 5) / 2 + 5) <= 14) || (! (12 / 4 < 8 * 2));
        System.out.println("res: " + res);
        
    }
}
