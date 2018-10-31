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
public class Auto {
    private eFabricante fabricante;
    private int kmRecorridos=0;
    public Rueda ruedadd;
    public Rueda ruedadi;
    public Rueda ruedatd;
    public Rueda ruedati;
    
    public Auto(){
        this.fabricante=eFabricante.values()[(int) (Math.random() * eFabricante.values().length)];
        this.ruedadd=new Rueda();
        this.ruedadi=new Rueda();
        this.ruedatd=new Rueda();
        this.ruedati=new Rueda();
    }

    public eFabricante getFabricante() {
        return this.fabricante;
    }

    public int getKmRecorridos() {
        return this.kmRecorridos;
    }
    
    public void agregarKm(int kmNuevos){
        this.kmRecorridos+=kmNuevos;
    }
    
    public void resetKm(){
        this.kmRecorridos=0;
    }
}               

