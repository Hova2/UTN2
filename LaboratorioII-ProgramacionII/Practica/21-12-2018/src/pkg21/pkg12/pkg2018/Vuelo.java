/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21.pkg12.pkg2018;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author iguglielmone_mecon
 */
public class Vuelo {
    
    /*Atributos privados y de instancia: _fecha (String), _empresa (String) 
    _precio (float), _listaDePasajeros (lista de elementos tipo Pasajero), 
    _cantMaxima (int, deberá tener un getter que devuelva su valor). 
    Tanto _listaDePasajero como _cantMaxima sólo se inicializarán en un constructor.*/
    
    private String _fecha;
    private String _empresa;
    private float _precio;
    private ArrayList<Pasajero> _listaDePasajeros;
    private int _cantMaxima;

    public int getCantMaxima() {
        return _cantMaxima;
    }
    
    /*Crear 2 sobrecargas del constructor (No repetir código)*/

    public Vuelo() {
        Random rand = new Random();
        this._listaDePasajeros = new ArrayList<>();
        this._cantMaxima = rand.nextInt((50 - 20) + 1) + 20;
    }

     public Vuelo(String _fecha, float _precio) {
        this();
        this._fecha = _fecha;
        this._precio = _precio;
    }
    
    public Vuelo(String _fecha, String _empresa, float _precio) {
        this(_fecha,_precio);
        this._empresa = _empresa;
    }

   /*Agregar un getter, que devuelva en una cadena de caracteres toda la información 
    de un vuelo: fecha, empresa, precio, cantidad máxima de pasajeros, 
    y toda la información de todos los pasajeros (Utilizar StringBuilder).*/
    
    public String getVuelo(){
        
        StringBuilder sb=new StringBuilder();
        sb.append("------- Vuelo --------").append("\n");
        sb.append("---------").append("\n");
        sb.append("Empresa: ").append(this._empresa).append("\n");
        sb.append("Fecha: ").append(this._fecha).append("\n");
        sb.append("Precio: ").append(Float.toString(this._precio)).append("\n");
        sb.append("---------------------").append("\n");
        sb.append("- Lista de pasajeros -").append("\n");
        for(Pasajero pas : this._listaDePasajeros){
            sb.append(pas.getInfo());
        }
        sb.append("---------------------").append("\n");
    
        return sb.toString();
    
    }
    
    /* Crear un método de instancia llamado AgregarPasajero, en el caso que no 
    exista en la lista, se agregará. Además tener en cuenta la capacidad del vuelo. 
    El valor de retorno de este método indicará si se agregó o no. */
    
    public Boolean agregarPasajero(Pasajero pas){
    
        Boolean agregado = false;
        if(this._listaDePasajeros.size()<this._cantMaxima){
            Boolean existe = false;
             for(Pasajero pasList : this._listaDePasajeros){
                if(pas.compararPasajeros(pasList)){
                    existe = true;
                    break;
                }
            }
             if(!existe){
                 this._listaDePasajeros.add(pas);
                 agregado = true;
             }
        }
        
        return agregado;
    }
    
    /*Agregar un método de instancia llamado MostrarVuelo, que mostrará la 
    información de un vuelo.*/
    
    public void mostrarVuelo(){
        System.out.print(this.getVuelo());
    }
    
    /*Crear un metodo ValorarVuelo qué reciba un vuelo. El valor devuelto deberá 
    ser de tipo float, y representará el valor recaudado por el vuelo. Tener en 
    cuenta que si un pasajero es Plus, se le hará un descuento del 20% en el precio del vuelo.*/

    public static float valorarVuelo(Vuelo vue){
        float recau=0;
        
        for(Pasajero pasList : vue._listaDePasajeros){
            if(pasList.getEsPlus()){
                recau+=(vue._precio * (0.8));
            }else{
                recau+=vue._precio;
            }
        }
        
        return recau;
    }
    
    /*Crear el método de clase CalcularGastoPasajero que recibe un array de vuelos 
    y una instancia de un pasajero. El método deberá devolver cuánto abonará un 
    pasajero por los vuelos que ha comprado. */
    
    public static float calcularGastoPasajero(ArrayList<Vuelo> _listaDeVuelos,Pasajero pas){
    
        float gasto=0;
        float desc=1;
        if(pas.getEsPlus()){
            desc=(float) 0.8;
        }
        
        for(Vuelo vueList : _listaDeVuelos){
            if(vueList._listaDePasajeros.contains(pas)){
                gasto+=vueList._precio*desc;
            }
        }

        return gasto;
    }
    
}
