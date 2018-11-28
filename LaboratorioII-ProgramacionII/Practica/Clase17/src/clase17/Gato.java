/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase17;

/**
 *
 * @author iguglielmone_mecon
 */
public class Gato extends Animal{
    
    protected boolean esAmigable;

    public Gato(boolean esAmigable, String nombre, int edad) {
        super(nombre, edad);
        this.esAmigable = esAmigable;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
