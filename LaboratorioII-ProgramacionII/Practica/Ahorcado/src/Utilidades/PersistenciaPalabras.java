/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Modelo.Palabra;
import java.util.ArrayList;

/**
 *
 * @author iguglielmone_mecon
 */
public class PersistenciaPalabras extends PersistenciaAbstracta<ArrayList<Palabra>>{
    
    private static final long serialVersionUID = 1L;
    private static final String ARCHIVO = "diccionario.xml";
    
    public PersistenciaPalabras(Class<ArrayList<Palabra>> clazz) {
        super(clazz);
    }
}
