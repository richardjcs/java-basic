/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion7;

import javabasic.LT;

/**
 *
 * @author richardcj
 */
public class TratamientoSecuencial14v2 {

    /**
     * Contar el numero de cada una de las vocales a,e,i,o,u y las consonantes.
     * Secuencia: La secuencia termina en punto.
     * Contador: Array de contadores de longitud [numCount]
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaraciones:
        final char ENDSEQUENCE = '.';
        final char SPACE = ' ';
        char chart;
        int [] counts = new int[6];
        
        //Inicializamos el contador.
        for (int i = 0; i < counts.length; i++) {
            counts[i]=0;  
        }
        
         //Pedir al usuario la secuencia.
        System.out.println("Introcuce la secuencian terminada en punto.");
        chart= LT.readCharacterSequence();
        
        //Tratamiento 
        while (chart!=ENDSEQUENCE) {
            if(chart!=SPACE){
                switch(chart){
                    case 'a': counts[0]++;break;
                    case 'e': counts[1]++;break;
                    case 'i': counts[2]++;break;
                    case 'o': counts[3]++;break;
                    case 'u': counts[4]++;break;
                    default: counts[5]++;
                }
            }
            //leemos el siguiente caracter.
            chart= LT.readCharacterSequence();
            
        }
        //mostramos los resultados:
        System.out.println("El numero de As es: "+ counts[0]);
        System.out.println("El numero de Es es: "+ counts[1]);
        System.out.println("El numero de Is es: "+ counts[2]);
        System.out.println("El numero de Os es: "+ counts[3]);
        System.out.println("El numero de Us es: "+ counts[4]);
        System.out.println("El numero de consonantes es: "+ counts[5]);
    }
}
