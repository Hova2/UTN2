/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diccionario;

import java.util.ArrayList;
import java.util.HashMap;


/**
 *
 * @author iguglielmone_mecon
 */
public class Diccionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String palabra = "programacion";
        int intentos = 9;
        
        /*for (int n=0; n <palabra.length(); n++) { 
            char c = palabra.charAt(n); 
            System.out.println(c); 
        }*/
        
        int tam = palabra.length();
        System.out.println(tam);
        System.out.println(intentos);
        
        char letra='a';
        while(intentos!=0 || tam!=0){   
            Boolean extiste=false;
            for (int n=0; n<palabra.length(); n++) { 
                char c = palabra.charAt(n); 
                if(Character.compare(c, letra)==0){
                    System.out.println("Encontrada");
                    tam--;
                    extiste=true;
                } 
           }
           if(!extiste){
               intentos--;
           }
           letra='l';
        }
        System.out.println(tam);
        System.out.println(intentos);
                
        
        
    }
    
}
