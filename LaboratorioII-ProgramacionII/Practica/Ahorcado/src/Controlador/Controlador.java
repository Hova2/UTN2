/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Juego;
import Modelo.Palabra;
import Utilidades.SerializadorYDeserializadorXML;
import java.util.ArrayList;

/**
 *
 * @author iguglielmone_mecon
 */
public class Controlador {
 
    private static Controlador instancia;
    private Juego juego = new Juego("batman");
    private ArrayList<Palabra> listPalabra;
    
    private Controlador() {
        //this.listPalabra = SerializadorYDeserializadorXML.getInstancia().deserializarPalabras();
    }
    
    public static Controlador getInstancia(){
        if(instancia == null){
            instancia = new Controlador();
        }
        return instancia;
    }
    
    public String obtenerMascara(){
        return juego.getMascara();
    }
    
    public String obtenerMascaraLestra(char c){
        juego.procesarLetra(c);
        return juego.getMascara();
       }
    
    public int obtenerIntentos(){
        return juego.getIntentos();
    }
    
    public int obtenerAcientos(){
        return juego.getAciertos();
    }
}
