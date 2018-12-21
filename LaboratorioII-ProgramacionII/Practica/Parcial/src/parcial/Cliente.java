/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

/**
 *
 * @author iguglielmone_mecon
 */
public class Cliente extends Persona{
    
    private long numCliente;
    private CuentaCorriente cuentCorriente;

    public Cliente(long numCliente, CuentaCorriente cuentCorriente, String nombre, String apellido, String calle, String altura) {
        super(nombre, apellido, calle, altura);
        this.numCliente = numCliente;
        this.cuentCorriente = cuentCorriente;
    }
    
}
