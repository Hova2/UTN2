/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7;

import java.util.ArrayList;

/**
 *
 * @author iguglielmone_mecon
 */
public class Veterinaria {
    
    private String nombre;
    private ArrayList<Perro> lPerros;

    public Veterinaria(String nombre) {
        this.nombre = nombre;
        this.lPerros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    
    public Boolean agregarPerro(Perro pichico){
        Boolean existe;
        
        for(Perro pichi:this.lPerros){
            existe=pichi.equals(pichico);
            if(existe){
                return false;
            }
        }
        
        this.lPerros.add(pichico);
        
        return true;
    }
    
    public Boolean eliminarPerro(int indi){
        Perro aux = this.lPerros.remove(indi);
        return aux != null;
    }
    
    public void mostrarVeterinaria(){
        System.out.println("Nombre de la veterinaria: " + this.nombre);
        System.out.println("Lista de perros: ");
        
        for(Perro pichicho:this.lPerros){
            Perro.mostratPerro(pichicho);
        }
    }
}
