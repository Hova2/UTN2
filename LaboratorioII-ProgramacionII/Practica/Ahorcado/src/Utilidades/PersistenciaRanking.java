/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Modelo.Ranking;
import java.util.ArrayList;

/**
 *
 * @author iguglielmone_mecon
 */
public class PersistenciaRanking extends PersistenciaAbstracta<ArrayList<Ranking>> {
    
    private static final long serialVersionUID = 1L;
    private static final String ARCHIVO = "diccionario.xml";
    
    public PersistenciaRanking(Class<ArrayList<Ranking>> clazz) {
        super(clazz);
    }
    
}
