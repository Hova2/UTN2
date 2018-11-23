/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase16;

/**
 *
 * @author iguglielmone_mecon
 */
public abstract class Llamada {
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
   
    public abstract float getCostoLlamada();
    
    protected abstract String mostrar();
    
    static public int ordenarPorDuracion(Llamada uno, Llamada dos){
        return 0;
    }
    
    static public boolean copararLlamada(Llamada l1, Llamada l2){
        return (l1._nroOrigen.equals(l2._nroOrigen) && l1._nroDestino.equals(l2._nroDestino)) && ((l1 instanceof Local && l2 instanceof Local) || (l1 instanceof Provincial && l2 instanceof Provincial));
    }
    
    @Override
    public String toString(){
        return this.mostrar();
    }
  
}


