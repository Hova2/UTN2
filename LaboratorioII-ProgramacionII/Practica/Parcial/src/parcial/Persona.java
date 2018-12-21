/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

/**
 *
 * @author iguglielmone_mecon
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private Direccion direccion;

    public Persona(String nombre, String apellido, String calle, String altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = new Direccion(calle, altura);
    }
    
}
