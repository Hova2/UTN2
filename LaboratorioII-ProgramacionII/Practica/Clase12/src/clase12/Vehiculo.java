/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase12;

import java.util.Objects;

/**
 *
 * @author iguglielmone_mecon
 */
public class Vehiculo {
    
    private String _patente;
    private int _cantRuedas;
    private EMarca _marca;

    public Vehiculo(String _patente, int _cantRuedas, EMarca _marca) {
        this._patente = _patente;
        this._cantRuedas = _cantRuedas;
        this._marca = _marca;
    }
    
    protected String mostrar(){
        
        StringBuilder sb = new StringBuilder();
        sb.append("Patente: ").append(this._patente).append("\n");
        sb.append("Cantidad de ruedas: ").append(this._cantRuedas).append("\n");
        sb.append("Marca: ").append(this._marca).append("\n");
        
        return sb.toString();
    }

    public static boolean comparaVehiculos(Vehiculo v1, Vehiculo v2){
        return v1.equals(v2);
    }
    
    @Override
    public boolean equals(Object o) {
        return this._patente.equals(((Vehiculo)o)._patente) && this._marca.equals(((Vehiculo)o)._marca);
    }
    
}
