/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion7;

import javabasic.LT;
import java.util.Arrays;

/**
 *
 * @author richardcj
 */
public class TratamientoSecuencial15v2 {

    /**
     * Visualizar los numeros pares de 10 numeros introducidos por el usuario.
     * @param dicct diccionario donde se almacenan los numero pares.
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int NUM_IN_USER = 10;
        int [] dicct = new int[NUM_IN_USER];
        int num;
        
        
        for (int i = 0; i < NUM_IN_USER; i++) {
            //Lectura del prime numero:
            System.out.println("Introduce el numero"+ (i+1)+": ");
            num = LT.readInt();
            if(num%2==0){
                dicct[i]=num;
            }
        }
        
        //Mostar solo los numero enteros
            System.out.println("Array de numeros pares" + Arrays.toString(dicct));
     
    }
}
