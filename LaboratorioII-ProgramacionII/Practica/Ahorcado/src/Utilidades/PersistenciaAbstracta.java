/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author iguglielmone_mecon
 */
public abstract class PersistenciaAbstracta<T extends Serializable> implements Serializable {
     
    private static final long serialVersionUID = 1L;
    private final Class<T> clazz;
 
    public PersistenciaAbstracta(Class<T> clazz) {
        this.clazz = clazz;
    }
     
    public void persistir(final T entidad) {
    }
    
    public List<T> desPersistir(){
        return null;
    }
}
