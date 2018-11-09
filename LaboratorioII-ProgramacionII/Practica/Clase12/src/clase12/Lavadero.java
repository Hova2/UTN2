/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase12;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author iguglielmone_mecon
 */
public class Lavadero {
    
    private ArrayList<Vehiculo> _vehiculos;
    private static float _precioAuto;
    private static float _precioCamion;
    private static float _precioMoto;
    private String _razonSocial;

    private Lavadero() {
        this._vehiculos = new ArrayList<>();
    }

    public Lavadero(String _razonSocial) {
        this();
        this._razonSocial = _razonSocial;
    }
    
    static{
        Random r = new Random();
        _precioAuto = (float) r.nextInt((565 - 150) + 1) + 150;
        _precioCamion = (float) r.nextInt((565 - 150) + 1) + 150;
        _precioMoto = (float) r.nextInt((565 - 150) + 1) + 150;
    }
    
    public String lavaderoString(){
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("Razon social: ").append(this._razonSocial).append("\n");
        sb.append("Precio auto: ").append(_precioAuto).append("\n");
        sb.append("Precio camion: ").append(_precioCamion).append("\n");
        sb.append("Precio moto: ").append(_precioMoto).append("\n");
        sb.append(this.listaGenerica());
    
        return sb.toString();
    }

    public String listaGenerica(){
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("Listado de vehiculos").append("\n");
        
        for(Vehiculo ve : this._vehiculos){
            if(ve instanceof Auto){
                sb.append(((Auto)ve).mostrar());
            }else if(ve instanceof Camion){
                sb.append(((Camion)ve).mostrar());
            }else{
                sb.append(((Moto)ve).mostrar());
            }
        }
    
        return sb.toString();
    }
    
    public double mostrarTotalFacturado(){
        
        double total=0;
        
        for(Vehiculo ve : this._vehiculos){
            if(ve instanceof Auto){
                total+=_precioAuto;
            }else if(ve instanceof Camion){
                total+=_precioCamion;
            }else{
                total+=_precioMoto;
            }
        }
        
        return total;
    }
    
    public double mostrarTotalFacturado(EVehiculos eve){
        
        double total=0;
        
        for(Vehiculo ve : this._vehiculos){
            if(ve instanceof Auto && eve.equals(EVehiculos.Auto)){
                total+=_precioAuto;
            }else if(ve instanceof Camion && eve.equals(EVehiculos.Camion)){
                total+=_precioCamion;
            }else{
                total+=_precioMoto;
            }
        }
        
        return total;
    }
    
    public static boolean estaEnLavadero(Lavadero lav,Vehiculo ve){
        return lav._vehiculos.contains(ve);
    
    }
    
    public static int estaEnLavadero(Vehiculo ve,Lavadero lav){
        
        int indice = -1;
        
        if(lav._vehiculos.contains(ve)){
            indice = lav._vehiculos.indexOf(ve);
        }
        
        return indice;
    
    }


}
