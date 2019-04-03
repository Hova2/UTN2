/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Vista.Menu;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Administrador
 */
public class Reproductor {
    private File archivo;
    private Clip clip;
    private long tiempoPausa;

    public Reproductor(String ruta) {
        this.archivo = new File(ruta);
        try {
            this.clip = AudioSystem.getClip();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Reproductor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    public void play(){
        try {
            clip.open(AudioSystem.getAudioInputStream(archivo));
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            Logger.getLogger(Reproductor.class.getName()).log(Level.SEVERE, null, ex);
        }
        clip.start();
    }
    
    public void stop(){
        clip.stop();
    }
    
    
    public void loop(){
        clip.loop(Clip.LOOP_CONTINUOUSLY);
        
    }
    
    public void pausa(){
        this.tiempoPausa = clip.getMicrosecondPosition();
        clip.stop();
    }
    
    public void reanudar(){
        clip.setMicrosecondPosition(tiempoPausa);
        clip.start();
    } 
    
}
