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
public class Provincial extends Llamada{
    
    protected float _costo;
    protected Franja _franjaHoraria;

    public Provincial(Franja miFranja, Llamada unaLlamada) {
        super(unaLlamada._duracion, unaLlamada._nroDestino, unaLlamada._nroOrigen);
        this._franjaHoraria=miFranja;
        this.elegirCosto(miFranja);
    }

    public Provincial(Franja _franjaHoraria, float _duracion, String _nroDestino, String _nroOrigen) {
        super(_duracion, _nroDestino, _nroOrigen);
        this._franjaHoraria=_franjaHoraria;
        this.elegirCosto(_franjaHoraria);
    }
    
    public float getCostoLlamada(){
        return 0;
    }

    @Override
    public void mostrar() {
       
        StringBuilder sb = new StringBuilder();
        sb.append("Duracion: ").append(this._duracion).append("\n");
        sb.append("NroOrigen: ").append(this._nroOrigen).append("\n");
        sb.append("NroDestino: ").append(this._nroDestino).append("\n");
        sb.append("FranjaHoraria: ").append(this._franjaHoraria).append("\n");
        sb.append("Costo: ").append(this.calcularCosto()).append("\n");
        
        System.out.print(sb);
    }
    
    private float calcularCosto(){
        return this._costo * this._duracion;
    }
    
    private void elegirCosto(Franja franja){
        
        switch (franja){
            case FRANJA_1:
                          this._costo=(float)0.99;
                          break;
            case FRANJA_2:
                          this._costo=(float)1.25;
                          break;
            case FRANJA_3:
                          this._costo=(float)0.66;
                          break;
        }
    }
}
