/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

/**
 *
 * @author iguglielmone_mecon
 */
public class FiltroLetras extends DocumentFilter{

    @Override
    public void replace(FilterBypass fb, int offset, int length, String string, AttributeSet attrs) throws BadLocationException {
        String texto = fb.getDocument().getText(0,fb.getDocument().getLength());
        texto += string;
        if(texto.matches("^[a-zA-Z][^\n]*$")){
            super.insertString(fb, offset, string, attrs); //To change body of generated methods, choose Tools | Templates.
        }else{
        }
    }

    @Override
    public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
        String texto = fb.getDocument().getText(0,fb.getDocument().getLength());
        texto += string;
        if(texto.matches("^[a-zA-Z]*$")){
            super.insertString(fb, offset, string, attr); //To change body of generated methods, choose Tools | Templates.
        }else{
        }
        
        
    }

    @Override
    public void remove(FilterBypass fb, int offset, int length) throws BadLocationException {
        super.remove(fb, offset, length); //To change body of generated methods, choose Tools | Templates.
    }
    
}
