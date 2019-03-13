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
public class Juego {
    
    private int intentos = 7;
    private int aciertos;
    private String palabra;
    private String mascara;

    public Juego(String palabra) {
        this.palabra = palabra;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<this.palabra.length();i++){
            sb.append("-");
        }
        this.mascara=sb.toString();
        this.aciertos=palabra.length();
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public int getAciertos() {
        return aciertos;
    }

    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
    }

    public String getMascara() {
        return mascara;
    }
    
    public void procesarLetra(char letra){
        
        if(this.palabra.indexOf(letra)!=-1){
            StringBuilder sb = new StringBuilder(this.mascara);
            for (int i=0; i<this.palabra.length(); i++) {
                if (this.palabra.charAt(i)==letra) {
                    sb.setCharAt(i, letra);
                    this.aciertos--;
                }
            }
            this.mascara=sb.toString();
        }else{
            this.intentos--;
        }
    }
}
