/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion4;

import javabasic.LT;

/**
 *
 * @author richardcj
 */
public class TratamientoSecuencial7 {

    /**
     * Contar el numero de parejas consonate-vocal de la secuencia.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaraciones:
        final char endSequence='.';
        final char space = ' ';
        int countConsonanteVocal = 0;
        char currentChar, lastChar = space; //inicialización de lastChar para generalizar tratamiento con el primer caracter de la secuencia
        
        System.out.println("Introduce la secuencia de caracteres acabada en punto:");
         //Lectura del prime caracter
        currentChar= LT.readCharacterSequence();
        //Tratamiento de esquema de recorrido
        while (currentChar!=endSequence) {     
            if (((currentChar=='a') || (currentChar=='e') || (currentChar=='i') || (currentChar=='o') || (currentChar=='u')) &&
                   (!((lastChar=='a') || (lastChar=='e') || (lastChar=='i') || (lastChar=='o') || (lastChar=='u')|| (lastChar==' '))) ) {
                countConsonanteVocal++;
            }
            //Preparamos los caracteres para la siguiente iteración
            lastChar= currentChar;
            //continuasmos con la lectura del caracter
            currentChar = LT.readCharacterSequence();
            
        }
        //Mostarmos los resultados:
       
        System.out.println("En numero de consonate-vocal es:" + countConsonanteVocal);
    }
}
