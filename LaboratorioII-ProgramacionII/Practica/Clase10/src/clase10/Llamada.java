/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase10;

/**
 *
 * @author iguglielmone_mecon
 */
public class Llamada {
    protected float _duracion;
    protected String _nroDestino;
    protected String _nroOrigen;

    public Llamada(float _duracion, String _nroDestino, String _nroOrigen) {
        this._duracion = _duracion;
        this._nroDestino = _nroDestino;
        this._nroOrigen = _nroOrigen;
    }

    public float getDuracion() {
        return _duracion;
    }

    public String getNroDestino() {
        return _nroDestino;
    }

    public String getNroOrigen() {
        return _nroOrigen;
    }
   
    public void mostrar(){
        
        StringBuilder sb = new StringBuilder();
        sb.append("Duracion: ").append(this._duracion).append("\n");
        sb.append("NroOrigen: ").append(this._nroOrigen).append("\n");
        sb.append("NroDestino: ").append(this._nroDestino).append("\n");
        
        System.out.print(sb);
    
    }
    
    static public int ordenarPorDuracion(Llamada uno, Llamada dos){
        return 0;
    }
}


