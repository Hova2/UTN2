/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21.pkg12.pkg2018;

/**
 *
 * @author iguglielmone_mecon
 */
public class Pasajero {
    
    private String _apellido;
    private String _nombre;
    private String _dni;
    private Boolean _esPlus;
    
    public Pasajero(){
    }
    
    public Pasajero(String ape, String nom){
        this();
        this._apellido = ape;
        this._nombre = nom;
    }
    
    public Pasajero(String ape, String nom, String dni, Boolean esPl){
        this(ape,nom);
        this._dni = dni;
        this._esPlus = esPl;
    }
    
}
