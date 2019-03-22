/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Juego;
import Modelo.Palabra;
import Modelo.PalabraDificil;
import Modelo.PalabraFacil;
import Modelo.PalabraNormal;
import Utilidades.SerializadorYDeserializadorXML;
import java.util.ArrayList;

/**
 *
 * @author iguglielmone_mecon
 */
public class Controlador {
 
    private static Controlador instancia;
    private Juego juego;
    private SerializadorYDeserializadorXML SYD = SerializadorYDeserializadorXML.getInstancia();
    private ArrayList<Palabra> listPalabra;
    
    private Controlador() {
        this.listPalabra = SerializadorYDeserializadorXML.getInstancia().deserializarPalabras();
    }
    
    public static Controlador getInstancia(){
        if(instancia == null){
            instancia = new Controlador();
        }
        return instancia;
    }
    
    public void inicializarJuego(int dificultad){
        ArrayList<Palabra> list = new ArrayList<>();
        for(int i=0; i<listPalabra.size();i++){
            
            switch(dificultad){
                case 0:
                    if(listPalabra.get(i) instanceof PalabraFacil){
                        list.add(listPalabra.get(i));
                    }
                    break;
                case 1:
                    if(listPalabra.get(i) instanceof PalabraNormal){
                        list.add(listPalabra.get(i));
                    }
                    break;
                case 2:
                    if(listPalabra.get(i) instanceof PalabraDificil){
                        list.add(listPalabra.get(i));
                    }
                    break;    
            }
                    
                
        }
    
        int num = (int) (Math.random() * list.size());
        juego = new Juego(list.get(num));
    };
    
    public String obtenerMascara(){
        return juego.getMascara();
    }
    
    public String obtenerMascaraLestra(char c){
        juego.procesarLetra(c);
        return juego.getMascara();
       }
    
    public String obteneAyuda(){
        return juego.getPalabra().getAyuda();
    }
    
    public int obtenerIntentos(){
        return juego.getIntentos();
    }
    
    public int obtenerAcientos(){
        return juego.getAciertos();
    }
    
    public void agregarPalabra(String termino, String ayuda, int dificultad){
        Palabra palabra = null;
        switch(dificultad){
            case 0:
                palabra = new PalabraFacil(termino, ayuda);
                break;
            case 1:
                palabra = new PalabraNormal(termino, ayuda);
                break;
            case 2:
                palabra = new PalabraDificil(termino, ayuda);
                break;
        }
        this.listPalabra.add(palabra);
        SYD.serializarPalabras(this.listPalabra);
    }
}
