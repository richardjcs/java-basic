/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion7;

import javabasic.LT;

/**
 * 
 * 
 * @author richardcj
 */
public class TratamientoSecuencial15 {

    /**
     * Visualizar los numeros pares de 10 numeros introducidos por el usuario.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaraciones:
        final int NUM_IN_USER = 10;
        int num;
        //Tratamiento:
        for (int i = 0; i < NUM_IN_USER; i++) {
            
           //Lectura del prime numero:
            System.out.println("Introduce el numero"+ (i+1)+": ");
            
            num = LT.readInt();
            
            //tratamiento para el numero leido
            if((num%2)==0){
                System.out.println("Es par:"+ num);
            }
            
        }
    }
}
