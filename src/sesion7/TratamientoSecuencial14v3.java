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
public class TratamientoSecuencial14v3 {

    /**
     * Contar el numero de cada una de las vocales a,e,i,o,u.
     * Secuencia: La secuencia termina en punto.
     * Contador: Array de contadores de longitud [numCount]
     * @param chart[]: Array de caracteres con toda
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Declaraciones:
        final char ENDSEQUENCE = '.';
        final char SPACE = ' ';
        char chart;
        int [] counts = new int[5];
        char [] vocales = {'a','e','i','o','u'};
        
        
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
                    default: 
                }
            }
            //leemos el siguiente caracter.
            chart= LT.readCharacterSequence();
            
        }
        
         //mostramos los resultados:
        for (int i = 0; i < counts.length; i++) {
            System.out.println("El numero de vocales " + vocales[i]+ " es: " + counts[i]); 
        }
        
    }
}
