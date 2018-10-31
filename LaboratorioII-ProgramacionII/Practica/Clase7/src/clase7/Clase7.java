/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author iguglielmone_mecon
 */
public class Clase7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Perro bobi1 = new Perro("Bobi1", 2, eRaza.COCKER);
        Perro bobi2 = new Perro("Bobi2", 6, eRaza.CHIHUAHUA);
        Perro bobi3 = new Perro("Bobi3", 4, eRaza.BOXER);
        Perro bobi4 = new Perro("Bobi4", 8, eRaza.HARRIER);
        Perro bobi5 = bobi3;
        
        Boolean b;
        
        b= bobi5.equals(bobi3);
        
        ArrayList<Perro> perros=new ArrayList<>();
        
        perros.add(bobi1);
        perros.add(bobi2);
        perros.add(bobi3);
        perros.add(bobi4);
        perros.add(bobi5);
        
        for(Perro pichicho:perros){
            Perro.mostratPerro(pichicho);
        }
        
        perros.remove(bobi5);
        perros.remove(0);
        System.out.println("Elimino");
        
        
        for(Perro pichicho:perros){
            Perro.mostratPerro(pichicho);
        }
        
        /*
        lista.add(2);
        lista.add(4);
        lista.add(0);
        
        for(Integer num:lista){
            System.out.println("El numero es: " + num);
        }
        
        System.out.println("Ordenado");
        
        Collections.sort(lista);
        
        for(Integer num:lista){
            System.out.println("El numero es: " + num);
        }*/
        
    }
    
}
