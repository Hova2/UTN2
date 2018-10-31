/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.utn.fra.calculadora;

import java.util.Scanner;

/**
 *
 * @author iguglielmone_mecon
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1=getNumero();
        int num2=getNumero();
    
        Calculadora.setOperador('+');
        Calculadora.calcularOperacion(num1, num2);
        Calculadora.mostrarResultado();
        
        Calculadora.setOperador('-');
        Calculadora.calcularOperacion(num1, num2);
        Calculadora.mostrarResultado();
        
        Calculadora.setOperador('*');
        Calculadora.calcularOperacion(num1, num2);
        Calculadora.mostrarResultado();
        
        Calculadora.setOperador('/');
        Calculadora.calcularOperacion(num1, num2);
        Calculadora.mostrarResultado();
    }
    
    public static int getNumero(){
        int numero;               
        Scanner lector = new Scanner(System.in);        
        System.out.println("Ingrese un Nro: "); 
        numero=lector.nextInt();
        return numero;
    }
}
