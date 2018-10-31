/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iguglielmone_mecon
 */
public class Gerente extends SerHumano{
    
    private String _area;

    public Gerente(String _area, String _nombre, byte _peso, byte _altura, String _sexo) {
        super(_nombre, _peso, _altura, _sexo);
        this._area = _area;
    }

    public String getArea() {
        return _area;
    }

    public void setArea(String _area) {
        this._area = _area;
    }
    
}
