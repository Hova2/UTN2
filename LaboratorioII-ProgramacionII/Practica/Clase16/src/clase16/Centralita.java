/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase16;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iguglielmone_mecon
 */
public class Centralita {
    
    private List<Llamada> _listaDeLlamadas;
    protected String _razonSocial;

    public Centralita() {
        this._listaDeLlamadas = new ArrayList<>();
    }

    public Centralita(String _razonSocial) {
        this();
        this._razonSocial = _razonSocial;
    }
    
    public float calcularGanancia(TipoLlamada tipo){
        
        float ganacia = 0;
        
        switch(tipo){
            case LOCAL:
                for(Llamada llamada : this._listaDeLlamadas){
                    if(llamada instanceof Local){
                        ganacia+=((Local) llamada).getCostoLlamada();
                    }
                }
                break;
            case PROVINCIAL:
                for(Llamada llamada : this._listaDeLlamadas){
                    if(llamada instanceof Provincial){
                        ganacia+=((Provincial) llamada).getCostoLlamada();
                    }
                }
                break;
            case TODAS:
                for(Llamada llamada : this._listaDeLlamadas){
                    if(llamada instanceof Local){
                        ganacia+=((Local) llamada).getCostoLlamada();
                    }else if(llamada instanceof Provincial){
                        ganacia+=((Provincial) llamada).getCostoLlamada();
                    }
                }
                
                break;
        }
        return ganacia;
    }
    
    public float getGananciaPorLocal(){
        return this.calcularGanancia(TipoLlamada.LOCAL);
    }
    
    public float getGananciaPorProvincial(){
        return this.calcularGanancia(TipoLlamada.PROVINCIAL);
    }
    
    public float getGananciaTotal(){
        return this.calcularGanancia(TipoLlamada.TODAS);
    }
    
    public void mostrar(){
    
        StringBuilder sb = new StringBuilder();
        sb.append("Razon social: ").append(this._razonSocial).append("\n");
        sb.append("Ganancia total: ").append(this.getGananciaTotal()).append("\n");
        sb.append("Ganancia local: ").append(this.getGananciaPorLocal()).append("\n");
        sb.append("Ganancia provincial: ").append(this.getGananciaPorProvincial()).append("\n");
        
        System.out.print(sb);
        
        for(Llamada llamada : this._listaDeLlamadas){
            llamada.mostrar();
        }
                
    }
    
    public void ordenarLlamada(){
    }
    
}
