/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Juego;

/**
 *
 * @author iguglielmone_mecon
 */
public class Controlador {
 
    
    private Juego juego = new Juego("batman");
    
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
