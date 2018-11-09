/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase12;

/**
 *
 * @author iguglielmone_mecon
 */
public class Camion extends Vehiculo{
    
    protected float _tara;
    
    private Camion(String _patente, int _cantRuedas, EMarca _marca) {
        super(_patente, _cantRuedas, _marca);
    }
    
    public Camion(String _patente, int _cantRuedas, EMarca _marca, float _tara) {
        this(_patente, _cantRuedas, _marca);
        this._tara = _tara;
    }
    
    @Override
    public String mostrar(){
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(super.mostrar()).append("\n");
        sb.append("Tara: ").append(this._tara).append("\n");
        
        return sb.toString();
    }
    
}
