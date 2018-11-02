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
public class Local extends Llamada{
    protected float _costo;

    public Local(Llamada unaLlamada, float costo) {
        super(unaLlamada._duracion, unaLlamada._nroDestino, unaLlamada._nroOrigen);
        this._costo = _costo;
    }
     
    public Local(float _costo, float _duracion, String _nroDestino, String _nroOrigen) {
        super(_duracion, _nroDestino, _nroOrigen);
        this._costo = _costo;
    }
    
    public float getCostoLlamada() {
        return this.calcularCosto();
    }

    @Override
    public void mostrar() {
        
        StringBuilder sb = new StringBuilder();
        sb.append("Duracion: ").append(this._duracion).append("\n");
        sb.append("NroOrigen: ").append(this._nroOrigen).append("\n");
        sb.append("NroDestino: ").append(this._nroDestino).append("\n");
        sb.append("Costo: ").append(this.calcularCosto()).append("\n");
        
        System.out.print(sb);
        
    }
    
    private float calcularCosto(){
        return this._costo * this._duracion;
    }
    
    
}
