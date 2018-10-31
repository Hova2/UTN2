/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.fra.utn.clase5;

import java.util.Date;

/**
 *
 * @author iguglielmone_mecon
 */
public class EjemploClase5 {
 
    private int entero=2;
    private String cadena;
    private Date fecha;

    public EjemploClase5(int entero, String cadena, Date fecha) {
        this.entero = entero;
        this.cadena = cadena;
        this.fecha = fecha;
    }

    public EjemploClase5(int entero, String cadena) {
        this.entero = entero;
        this.cadena = cadena;
    }
    
    public EjemploClase5(EjemploClase5 ej) {
        ej.entero=4;
    }
    
    public EjemploClase5() {
    
    }
    
    public void mostrarDatos(){
        
    }
    
    public void asignarDato(int num){
        this.entero=num;
    }
    
    public void asignarDato(String cad){
        this.cadena=cad;
    }
    
    public void asignarDato(Date fech){
        this.fecha=fech;
    }

    public int getEntero() {
        return entero;
    }

    public String getCadena() {
        return cadena;
    }

    public Date getFecha() {
        return fecha;
    }
    
    
}