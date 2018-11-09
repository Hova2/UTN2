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
public class Moto extends Vehiculo{
    
    protected float _cilindrada;
    
    private Moto(String _patente, int _cantRuedas, EMarca _marca) {
        super(_patente, _cantRuedas, _marca);
    }
    
    public Moto(String _patente, int _cantRuedas, EMarca _marca, float _cili) {
        this(_patente, _cantRuedas, _marca);
        this._cilindrada = _cili;
    }
    
    @Override
    public String mostrar(){
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(super.mostrar()).append("\n");
        sb.append("Cilindrada: ").append(this._cilindrada).append("\n");
        
        return sb.toString();
    }
}
