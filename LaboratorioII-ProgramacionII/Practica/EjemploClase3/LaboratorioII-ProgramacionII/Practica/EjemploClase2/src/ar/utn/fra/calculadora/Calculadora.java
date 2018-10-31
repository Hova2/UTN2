/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.utn.fra.calculadora;

/**
 *
 * @author iguglielmone_mecon
 */
public class Calculadora {
    
    private static float resultado;
    private static char operador;
    
    private static void sumar(int a,int b){
        resultado = a + b;
    }
    
    private static void restar(int a,int b){
        resultado = a - b;
    }
    
    private static void multiplicar(int a,int b){
        resultado = a * b;
    }
    
    private static void dividir(int a,int b){
        resultado = (float)a / b;
    }
    
    public static void calcularOperacion(int a, int b){
        switch(operador){
            case '+':
                     sumar(a, b);
                     break;
            case '-':
                     restar(a, b);
                     break;
            case '*':
                     multiplicar(a, b);
                     break;
            case '/':
                     dividir(a,b);
                     break;
        }
    }
    
    public static void mostrarResultado(){
        System.out.println("El resultado es: " + resultado);
    }
    
    public static void setOperador(char opera){
        operador=opera;
    }
    
    public static char getOperador(){
        return operador;
    }
}
