/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6;

/**
 *
 * @author iguglielmone_mecon
 */
public class Clase6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno[] alumnos = new Alumno[6];
        
        for(int i=1;i<=6;i++){
            StringBuilder nombre=new StringBuilder();
            StringBuilder mail=new StringBuilder();
            StringBuilder dir=new StringBuilder();
            nombre.append("Nombre").append(i);
            mail.append("mail").append(i).append("@gmail.com");
            dir.append("Direccion").append(i);
            alumnos[i-1]=new Alumno(i, nombre.toString(), mail.toString(), dir.toString());
            int[] notas = new int[3];
            for(int j=0;j<=2;j++){
                notas[j]=(int)(Math.random() * 10);
            }
            alumnos[i-1].setNotasIngreso(notas);
        }
        
        for(Alumno i:alumnos){
            System.out.println("-------------------");
            System.out.println(i.getId());
            System.out.println(i.getApellidoNombre());
            System.out.println(i.geteMail());
            System.out.println(i.getDireccion());
            System.out.println("-------------------");
        }
    }
    
}
