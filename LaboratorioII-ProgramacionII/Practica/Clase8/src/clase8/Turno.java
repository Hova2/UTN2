/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase8;

/**
 *
 * @author iguglielmone_mecon
 */
public class Turno {
    private int orden;
    private Paciente paciente;
    private eTipo tipo;

    public Turno(int orden, Paciente paciente, eTipo tipo) {
        this.orden = orden;
        this.paciente = paciente;
        this.tipo = tipo;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public eTipo getTipo() {
        return tipo;
    }

    public void setTipo(eTipo tipo) {
        this.tipo = tipo;
    }
    
}
