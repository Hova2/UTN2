/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author iguglielmone_mecon
 */
public class Palabra {
    
    private String termino;
    private String ayuda;

    public Palabra() {
    }

    public Palabra(String termino, String ayuda) {
        this.termino = termino;
        this.ayuda = ayuda;
    }

    public String getTermino() {
        return termino;
    }

    public void setTermino(String termino) {
        this.termino = termino;
    }

    public String getAyuda() {
        return ayuda;
    }

    public void setAyuda(String ayuda) {
        this.ayuda = ayuda;
    }
}
