/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.fra.utn.clase5;

/**
 *
 * @author iguglielmone_mecon
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        EjemploClase5 ej1=new EjemploClase5();
        System.out.println(ej1.getEntero());
        EjemploClase5 ej2=new EjemploClase5(ej1);
        System.out.println(ej1.getEntero());
    }
    
}
