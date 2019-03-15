/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Modelo.Palabra;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

/**
 *
 * @author iguglielmone_mecon
 */
public class SerializadorYDeserializadorXML {
    
    private static final String ARCHIVO = "diccionario.xml";
    private static SerializadorYDeserializadorXML instancia;
    private XMLEncoder encoder;
    private XMLDecoder decoder;
    
    private SerializadorYDeserializadorXML() {
    }
    
    public static SerializadorYDeserializadorXML getInstancia(){
        if(instancia == null){
            instancia = new SerializadorYDeserializadorXML();
        }
        
        return instancia;
    }
    
    public void serializarPalabras(ArrayList<Palabra> palabras) {
        try {
               FileOutputStream fos = new FileOutputStream(ARCHIVO);
               BufferedOutputStream bos = new BufferedOutputStream(fos); 
               this.encoder = new XMLEncoder(bos);
        } catch (FileNotFoundException fileNotFound) {
            System.out.println("ERROR: Archivo no encontrado");
        }
        encoder.writeObject(palabras);
        encoder.close();
    }
    
    public ArrayList<Palabra> deserializarPalabras() {
        try {
            decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(ARCHIVO)));
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: Archivo no encontrado");
        }
        
        ArrayList<Palabra> palabras = (ArrayList<Palabra>) decoder.readObject();

        return palabras;
    }
    
}
