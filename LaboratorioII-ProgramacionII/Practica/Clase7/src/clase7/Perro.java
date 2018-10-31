/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7;

/**
 *
 * @author iguglielmone_mecon
 */
public class Perro {
    private String nombre;
    private int edad;
    private eRaza raza;

    public Perro(String nombre, int edad, eRaza raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public eRaza getRaza() {
        return raza;
    }

    public void setRaza(eRaza raza) {
        this.raza = raza;
    }
    
    public static void mostratPerro(Perro pichito){
        System.out.println("Nombre: " + pichito.nombre);
        System.out.println("Edad: " + pichito.edad);
        System.out.println("Raza: " + pichito.raza);
    }
}
