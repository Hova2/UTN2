/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.fra.ejemplo;

/**
 *
 * @author iguglielmone_mecon
 */
public class EjemploClase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Auto auto1=new Auto();
        Auto auto2=new Auto();
        Auto auto3=new Auto();
        Auto auto4=new Auto();
        Auto auto5=new Auto();*/
        
        /*eFabricante fabricantes;
        fabricantes=eFabricante.FIAT;
        System.out.println(fabricantes);*/
        
        /*System.out.println(auto1.getFabricante());
        System.out.println(auto2.getFabricante());
        System.out.println(auto3.getFabricante());
        System.out.println(auto4.getFabricante());
        System.out.println(auto5.getFabricante());*/
        
        Carrera carrera = new Carrera();
        carrera.mostrarCarrera();
        System.out.println("");
        carrera.porTiempo(10);
    }
}
