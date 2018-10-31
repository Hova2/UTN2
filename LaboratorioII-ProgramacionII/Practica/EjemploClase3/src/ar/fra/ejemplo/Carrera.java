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
public class Carrera {
    public Auto auto1;
    public Auto auto2;
    public Auto auto3;
    public Auto auto4;
    public Auto auto5;
    public Auto auto6;

    public Carrera() {
        this.auto1 = new Auto();
        this.auto2 = new Auto();
        this.auto3 = new Auto();
        this.auto4 = new Auto();
        this.auto5 = new Auto();
        this.auto6 = new Auto();
    }

    public void mostrarCarrera(){
        System.out.println(auto1.getFabricante());
        System.out.println(auto2.getFabricante());
        System.out.println(auto3.getFabricante());
        System.out.println(auto4.getFabricante());
        System.out.println(auto5.getFabricante());
        System.out.println(auto6.getFabricante());
    }
    
    public void porTiempo(int min){
        for(int i=1;i<=min;i++){
            auto1.agregarKm((int)(Math.random() * 10));
            auto2.agregarKm((int)(Math.random() * 10));
            auto3.agregarKm((int)(Math.random() * 10));
            auto4.agregarKm((int)(Math.random() * 10));
            auto5.agregarKm((int)(Math.random() * 10));
            auto6.agregarKm((int)(Math.random() * 10));
        }

        System.out.println(auto1.getKmRecorridos());
        System.out.println(auto2.getKmRecorridos());
        System.out.println(auto3.getKmRecorridos());
        System.out.println(auto4.getKmRecorridos());
        System.out.println(auto5.getKmRecorridos());
        System.out.println(auto6.getKmRecorridos());
    }  
}

