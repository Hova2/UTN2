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
public class Perro extends Animal{
 
    protected boolean tieneVacunas;

    public Perro(boolean tieneVacunas, String nombre, int edad) {
        super(nombre, edad);
        this.tieneVacunas = tieneVacunas;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
