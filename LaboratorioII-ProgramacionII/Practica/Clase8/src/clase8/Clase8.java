/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase8;

import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author iguglielmone_mecon
 */
public class Clase8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        /*Stack<Integer> pila;
        pila=new Stack();
        pila.push(0);
        //System.out.println(pila.size());
        //System.out.println(pila.peek());
  
        for(int i=0;i<9;i++){
            pila.add(i*2);
        }
        
        int len=pila.size();
        
        //System.out.println(len);
        
        for(int i=0;i<len;i++){
            System.out.println(pila.pop());
        }*/
        
        /*LinkedList<Integer> cola;
        cola = new LinkedList<>();
        
        cola.offer(2);
        cola.offer(4);
        cola.offer(6);
        cola.offer(8);
        
        for(int i: cola){
            System.out.println(i);
        }
        
        for(int i=cola.size();i>0;i--){
            System.out.println(cola.poll());
        }*/
        
        Paciente p1 = new Paciente("1", "P1");
        Paciente p2 = new Paciente("2", "P2");
        
        Turno t3 = new Turno(8, p2, eTipo.URGENTE);
        Turno t1 = new Turno(2, p1, eTipo.NORMAL);
        Turno t2 = new Turno(4, p2, eTipo.NORMAL);
        Turno t4 = new Turno(6, p1, eTipo.URGENTE);
        
    }
    
}
