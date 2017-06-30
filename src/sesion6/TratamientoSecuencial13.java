/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion6;

import javabasic.LT;

/**
 *
 * @author richardcj
 */
public class TratamientoSecuencial13 {

    /**
     * Contar las palabra con un numero par de vocales y las palabras 
     * con un numero impar de vocales.
     * Secuencia: Terminada en punto.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final char ENDSEQUENCE = '.';
        final char SPACE = ' ';
        char chart; 
        int countWordVocalPar=0,countWordVocalInpar=0;
        
        
        //Acciones:
        //Pedir al usuario la secuenia.
        System.out.println("Introcuce la secuencian terminada en punto.");
        chart= LT.readCharacterSequence();
        
        //buscamos la primera palabra
        while (chart==SPACE) {            
            chart= LT.readCharacterSequence();
        }
        //Tratamiento:
        while (chart!=ENDSEQUENCE) { 
            int countVocal=0;
            //lectura palabra
            while(chart!=ENDSEQUENCE && chart!=SPACE){
                if (((chart=='a') || (chart=='e') || (chart=='i') || (chart=='o') || (chart=='u'))) {
                    countVocal++;
                }
                chart= LT.readCharacterSequence();
            }
            if (countVocal!=0) {
                if ((countVocal%2) == 0) {
                    countWordVocalPar++;
                } else {
                    countWordVocalInpar++;
                } 
            }
            
            //buscamos la siguiente palabra
            while (chart==SPACE) {            
                chart= LT.readCharacterSequence();
            }
        }
        //Visualizar resultado
        System.out.println("El numero de palabras con un numero par de vocales es:"
                 + countWordVocalPar);
        System.out.println("El numero de palabras con un numero par de vocales es:"
               + countWordVocalInpar);
        
    }
}
