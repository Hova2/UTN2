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
public class Auto extends Vehiculo{
    
    protected int _cantidadAsientos;
    
    private Auto(String _patente, int _cantRuedas, EMarca _marca) {
        super(_patente, _cantRuedas, _marca);
    }
    
    private Auto(String _patente, int _cantRuedas, EMarca _marca, int _cantAsien) {
        this(_patente,_cantRuedas,_marca);
        this._cantidadAsientos = _cantAsien;
    }
    
  
    @Override
    public String mostrar(){
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(super.mostrar()).append("\n");
        sb.append("Cant. asientos: ").append(this._cantidadAsientos).append("\n");
        
        return sb.toString();
    }
    
}
