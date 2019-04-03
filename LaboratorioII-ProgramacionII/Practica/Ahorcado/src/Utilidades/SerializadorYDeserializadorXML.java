/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author iguglielmone_mecon
 */
public class SerializadorYDeserializadorXML {
    
    private final String archivo;
    private XMLEncoder encoder;
    private XMLDecoder decoder;
    
    public SerializadorYDeserializadorXML(String archivo) {
        this.archivo = archivo;
    }
            
    public void persistir(ArrayList<Object> entidad){
    
        try {
            this.persistirPrivado(entidad);
        } catch (ArchivoNoEncontradoCE ex) {
            try {
                this.crearArchivo();
            } catch (ArchivoNoCreadoCE ex1) {
                Logger.getLogger(SerializadorYDeserializadorXML.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(SerializadorYDeserializadorXML.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public ArrayList<Object> desPersistir(){
        try {
            return this.desPersistirPrivado();
        } catch (ArchivoNoEncontradoCE ex) {
            try {
                this.crearArchivo();
            } catch (ArchivoNoCreadoCE ex1) {
                Logger.getLogger(SerializadorYDeserializadorXML.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(SerializadorYDeserializadorXML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ArraySinElementosCE ex){
            Logger.getLogger(SerializadorYDeserializadorXML.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    
    
    private void persistirPrivado(ArrayList<Object> entidad) throws ArchivoNoEncontradoCE{
        try {
                FileOutputStream fos = new FileOutputStream(archivo);
                BufferedOutputStream bos = new BufferedOutputStream(fos); 
                this.encoder = new XMLEncoder(bos);
                encoder.writeObject(entidad);
                encoder.close();
        } catch (FileNotFoundException fileNotFound) {
            System.out.println("ERROR: Archivo no encontrado");
        }
    }
    
    private ArrayList<Object> desPersistirPrivado() throws ArchivoNoEncontradoCE,ArraySinElementosCE{
        try {
            FileInputStream fis = new FileInputStream(archivo);
            BufferedInputStream bis = new BufferedInputStream(fis);
            this.decoder = new XMLDecoder(bis);
            ArrayList<Object> entidad = (ArrayList<Object>) decoder.readObject();
            return entidad;
        } catch (FileNotFoundException ex) {
            throw new ArchivoNoEncontradoCE(this.mensajeArchivo(), ex);   
        } catch (ArrayIndexOutOfBoundsException ex){
            throw new ArraySinElementosCE(this.mensajeArreglo(), ex);
        }
        
    }
    
    private String mensajeArchivo(){
        StringBuilder mensaje = new StringBuilder();
        mensaje.append("El archivo de ");
        mensaje.append(archivo);
        mensaje.append(" no fue encontrado.");
        mensaje.append(" Creando!!!!");
        
        return mensaje.toString();
    }
    
    private String mensajeArreglo(){
        StringBuilder mensaje = new StringBuilder();
        mensaje.append("El archivo de ");
        mensaje.append(archivo);
        mensaje.append(" no contiene elementos.");
        
        return mensaje.toString();
    }
    
    private void crearArchivo() throws ArchivoNoCreadoCE{
        File arch = new File(archivo);
        try {
            arch.createNewFile();
        } catch (IOException ex) {
            throw new ArchivoNoCreadoCE("No se pudo creear el archivo!!!!", ex);
        }
    }
}
