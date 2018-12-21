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
public class ClienteInterior extends Cliente{
 
    private int impuestoProvincial;

    public ClienteInterior(int impuestoProvincial, long numCliente, CuentaCorriente cuentCorriente, String nombre, String apellido, String calle, String altura) {
        super(numCliente, cuentCorriente, nombre, apellido, calle, altura);
        this.impuestoProvincial = impuestoProvincial;
    }

   
    
    
    
}
