/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21.pkg12.pkg2018;

import java.util.Objects;

/**
 *
 * @author iguglielmone_mecon
 */
public class Pasajero {
    
    /*Atributos privados y de instancia: _apellido (String), 
    _nombre (String), _dni (String), _esPlus (Boolean)*/
    
    private String _apellido;
    private String _nombre;
    private String _dni;
    private Boolean _esPlus;

    public Boolean getEsPlus() {
        return _esPlus;
    }
    
    /*Realizar un constructor parametrizado que permita inicializar todos los 
    atributos de la clase llamando a otras dos sobrecargas. No se deberá repetir código.*/
    
    public Pasajero(Boolean esPl){
        this._esPlus = esPl;
    }
    
    public Pasajero(String dni, Boolean esPl){
        this(esPl);
        this._dni = dni;
    }
    
    public Pasajero(String ape, String nom, String dni, Boolean esPl){
        this(dni,esPl);
        this._apellido = ape;
        this._nombre = nom;
    }
    
    /*Crear el método CompararPasajeros que recibirá como parámetro 
    una instancia de la clase. Retornará verdadero cuando el dni de ambas instancias sean iguales.*/

    public Boolean compararPasajeros(Pasajero pasa){
        return this.equals(pasa);
    }
    
    @Override
    public boolean equals(Object obj) {
        return ((Pasajero)obj)._dni.equals(this._dni);
    }

    /*Un getter llamado getInfo permitirá construir un String con toda la información 
    del pasajero y la retornará. Utilizar StringBuilder.*/
    
    public String getInfo(){
        
        StringBuilder sb=new StringBuilder();
        sb.append("- Pasajero -").append("\n");
        sb.append("------------").append("\n");
        sb.append("Nombre: ").append(this._nombre).append("\n");
        sb.append("Apellido: ").append(this._apellido).append("\n");
        sb.append("DNI: ").append(this._dni).append("\n");
        if(this._esPlus){
            sb.append("Es plus: ").append("Si").append("\n");
        }else{
            sb.append("Es plus: ").append("No").append("\n");
        }
        sb.append("------------").append("\n").append("\n");
    
        return sb.toString();
    }
    
    
    /*El método MostrarPasajero recibirá un pasajero y mostrará por consola toda su información.*/
    
    public static void mostrarPasajero(Pasajero pas){
        System.out.print(pas.getInfo());
    }
}
