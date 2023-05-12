/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fstring;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author andrei.almeida
 */
public class FString {

    public static void main(String[] args) {
        
        String original = "abadcd     Testando a CONVERSÃO               PaRA sTRING -             AtUALIação        -                  ";
        String pedidosImportados = "123456;456789;9878;02232";
        
        /* Funções Gerais
        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(11);
        String s05 = original.substring(11,35).trim();
        String s06 = original.replace('a', 'X');
        String s07 = original.replace("Testando", "WOWOWOWOWOWOWWO");
        int i = original.indexOf("t");
        int j = original.lastIndexOf("t");
        
        System.out.println(s01 + " Print");
        System.out.println(s02 + " Print");
        System.out.println(s03 + " print ");
        System.out.println(s04 + " print ");
        System.out.println(s05 + "print ");
        System.out.println(s06 + "print ");
        System.out.println(s07 + "print ");
        System.out.println(i );
        System.out.println(j);
        */
        String [] numPed = pedidosImportados.split(";");
       
        
        ArrayList<String> pedidos = new ArrayList<String>();
        
        for (int i=0; i<numPed.length; i++){
             //System.out.println(numPed[i]);
             pedidos.add(numPed[i]);
        }
       
        Collections.sort(pedidos);
        
        for (int i=0; i<pedidos.size(); i ++){
            System.out.println("Peddidos no Array: " + pedidos.get(i));
        }
        
    }
}
