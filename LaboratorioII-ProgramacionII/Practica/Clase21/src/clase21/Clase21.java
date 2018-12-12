/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase21;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author iguglielmone_mecon
 */
public class Clase21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        Scanner lector = new Scanner(System.in);
        /* Primer punto
        int n1,n2;
        
        try{
            System.out.print("Igrese un N°:");
            n1=Integer.parseInt(lector.nextLine());
            System.out.println();
            System.out.print("Igrese otro N°:");
            n2=Integer.parseInt(lector.nextLine());
            verificarRango(n1, n2);
            float div = (float)(n2/n1);
            
        }catch(NumberFormatException | FueraDeRangoExcepcion | ArithmeticException e0){
            System.out.println(e0.getMessage());
        }*/
        
        boolean salir=false;
        int opcion;
        int numero;
        Pila pila=new Pila(2);
        
        while(!salir){
            System.out.println("\n\n\n\n\n\n\n\n\n\n");
            System.out.println("0 - Salir");
            System.out.println("1 - Agregar numero");
            System.out.println("2 - Quitar numero");
            System.out.println("3 - Mostrar numeros");
            try{
                opcion=Integer.parseInt(lector.nextLine());
                switch(opcion){
                    case 1:
                            numero=Integer.parseInt(lector.nextLine());
                            pila.insertarDato(numero);
                            break;
                    case 2:
                            pila.extraerDato();
                            break;
                    case 3:
                            for(Integer n : pila.getNumeros()){
                                System.out.println("Numero en la pila:" + n);
                            }
                            break;
                    default:
                            salir=true;
                            break;
                }
            }catch(NumberFormatException e0){
                System.out.println("No se ingreso un numero");
            }catch(DesbordePilaExcepcion | PilaVaciaExcepcion e1){
                System.out.println(e1.getMessage());
            }
        }
    }
    
    public static void verificarRango(int n1, int n2) throws FueraDeRangoExcepcion{
        if(n1>100 || n2<9){
            throw new FueraDeRangoExcepcion("Los numeros ingresados estan fuera de rango");
        }
    }
}
