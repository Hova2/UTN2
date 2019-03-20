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
public abstract class  Palabra {
    
    private String termino;
    private String ayuda;
    private int dificulad;

    public Palabra() {
    }

    public Palabra(String termino, String ayuda, int dificultad) {
        this.termino = termino;
        this.ayuda = ayuda;
        this.dificulad = dificultad;
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

    public int getDificulad() {
        return dificulad;
    }
}
