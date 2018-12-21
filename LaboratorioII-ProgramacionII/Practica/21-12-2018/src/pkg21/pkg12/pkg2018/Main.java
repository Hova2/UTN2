/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21.pkg12.pkg2018;

import java.util.ArrayList;

/**
 *
 * @author iguglielmone_mecon
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        /*a)Crear 5 pasajeros, de los cuales 3 deberán ser plus.*/
        
        Pasajero pas1 = new Pasajero("Uno", "Pasajero", "111111", false);
        Pasajero pas2 = new Pasajero("Dos", "Pasajero", "222222", false);
        Pasajero pas3 = new Pasajero("Tres", "Pasajero", "333333", true);
        Pasajero pas4 = new Pasajero("Cuatro", "Pasajero", "444444", true);
        Pasajero pas5 = new Pasajero("Cinco", "Pasajero", "555555", true);
        
        /*b)Crear una array de tipo vuelo*/
        
        ArrayList<Vuelo> listaVuelos=new ArrayList<>();
        
        /*c)Crear un vuelo y agregar los 5 pasajeros. Agregar este vuelo al array.*/
        
        Vuelo vue1 = new Vuelo("21-12-2018", "Empresa 1", 1000);
        vue1.agregarPasajero(pas1);
        vue1.agregarPasajero(pas2);
        vue1.agregarPasajero(pas3);
        vue1.agregarPasajero(pas4);
        vue1.agregarPasajero(pas5);
        listaVuelos.add(vue1);
        
        /*d)Crear otro vuelo y solo agregar los pasajeros plus. Agregar este vuelo al array.*/
        
        Vuelo vue2 = new Vuelo("22-12-2018", "Empresa 2", 1000);
        vue2.agregarPasajero(pas3);
        vue2.agregarPasajero(pas4);
        vue2.agregarPasajero(pas5);
        listaVuelos.add(vue2);
        
        /*e)Mostrar Ambos vuelos y valorarlos.*/
        
        vue1.mostrarVuelo();
        System.out.println("El vuelo tiene un valor de: " + "$" + Float.toString(Vuelo.valorarVuelo(vue1)));
        System.out.println("");
        System.out.println("*********************************************************************************");
        System.out.println("*********************************************************************************");
        System.out.println("");
        vue2.mostrarVuelo();
        System.out.println("El vuelo tiene un valor de: " + "$" + Float.toString(Vuelo.valorarVuelo(vue2)));
        System.out.println("");
        
        /*f)Calcular el gasto para un pasajero plus*/
        
        System.out.println("*********************************************************************************");
        System.out.println("*********************************************************************************");
        
        System.out.println("");
        Pasajero.mostrarPasajero(pas5);
        
        System.out.println("El pasajero tiene un gasto de: " + "$" + Float.toString(Vuelo.calcularGastoPasajero(listaVuelos, pas5)));
        
    }
    
}
