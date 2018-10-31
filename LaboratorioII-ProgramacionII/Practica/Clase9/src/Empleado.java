/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iguglielmone_mecon
 */
public class Empleado extends SerHumano{
    
    private float _sueldo;

    public Empleado(float _sueldo, String _nombre, byte _peso, byte _altura, String _sexo) {
        super(_nombre, _peso, _altura, _sexo);
        this._sueldo = _sueldo;
    }

    public float getSueldo() {
        return _sueldo;
    }

    public void setSueldo(float _sueldo) {
        this._sueldo = _sueldo;
    }
    
    
}
