package clase6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iguglielmone_mecon
 */
public class Alumno {
    private int _id;
    private String _apellidoNombre;
    private String _eMail;
    private float _promedio;
    private int[] _notasIngreso;
    private String _direccion;

    public Alumno() {
        this._notasIngreso = new int[3];
    }
    
    public Alumno(String mail, String dir){
        this();
        this._eMail=mail;
        this._direccion=dir;
    }
    
    public Alumno(int id,String ayn, String mail, String dir){
        this(mail,dir);
        this._id=id;
        this._apellidoNombre=ayn;
    }
    
    public String getApellidoNombre() {
        return _apellidoNombre;
    }

    public String geteMail() {
        return _eMail;
    }

    public int[] getNotasIngreso() {
        return _notasIngreso;
    }

    public void setApellidoNombre(String _apellidoNombre) {
        this._apellidoNombre = _apellidoNombre;
    }

    public void seteMail(String _eMail) {
        this._eMail = _eMail;
    }

    public void setNotasIngreso(int[] _notasIngreso) {
        this._notasIngreso = _notasIngreso;
    }

    public void setDireccion(String _direccion) {
        this._direccion = _direccion;
    }
    
    public void calcularPromedio(){
    
    }
    
    public String alumnoAString(){
    
        return null;
    } 

    public int getId() {
        return _id;
    }

    public String getDireccion() {
        return _direccion;
    }
    
    
}
