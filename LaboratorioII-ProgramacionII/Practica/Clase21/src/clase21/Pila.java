/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase21;

import java.util.Stack;

/**
 *
 * @author iguglielmone_mecon
 */
public class Pila {
    
    private int capacidad;
    private Stack<Integer> numeros;

    public Pila(int capacidad) {
        this.capacidad = capacidad;
        this.numeros = new Stack<>();
    }

    public Stack<Integer> getNumeros() {
        return numeros;
    }
    
    public void insertarDato(int n) throws DesbordePilaExcepcion{
        if(numeros.size() == this.capacidad){
            throw new DesbordePilaExcepcion("La pila esta llena");
        }else{
            numeros.push(n);
        }
    }
    
    public void extraerDato() throws PilaVaciaExcepcion{
        if(numeros.isEmpty()){
            throw new PilaVaciaExcepcion("No hay elementos en la pila");
        }else{
            numeros.pop();
        }
    }
 
}
