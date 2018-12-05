/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase19;

import java.util.Scanner;

/**
 *
 * @author iguglielmone_mecon
 */
public class Clase19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int x,y,z;
        Scanner lector = new Scanner(System.in);
        
        try{
            System.out.print("Igrese un N°:");
            x=Integer.parseInt(lector.nextLine());
            System.out.println();
            System.out.print("Igrese un N°:");
            y=Integer.parseInt(lector.nextLine());
            z=x/y;
            
        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("Error de division por cero");
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Error inesperado");
        }
        
        System.out.println("Sigue");
    }
    
}
