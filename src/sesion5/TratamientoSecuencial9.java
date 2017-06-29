/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion5;

import javabasic.LT;

/**
 * Contar el número de palabras con 5 caracteres contenidas en la secuencia.
 * Secuencia : Secuencia introducida que termina en punto
 * @author richardcj
 */
public class TratamientoSecuencial9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaraciones:
        final char ENDSEQUENCE = '.';
        final char SPACE = ' ';
        char chart; 
        int countPalabras=0;
        
        
        System.out.println("Introduce la secuencia de caracteres acabada en punto:");
        //Lectura del prime caracter
        chart= LT.readCharacterSequence();
        
        //buscamos el palabra
        while ((chart==SPACE)) {
            chart=LT.readCharacterSequence();
        }
        
        while (chart != ENDSEQUENCE) {            
            //Variable local
            int countChart=0;
            //pasar palabra actual
            while ((chart!=ENDSEQUENCE)&&(chart!=SPACE)) {
                countChart++;
                chart=LT.readCharacterSequence();
               
            }
            if (countChart==5){
                countPalabras++;
            }
            
            //buscamos el palabra
            while ((chart==SPACE)) {
                chart=LT.readCharacterSequence();
            }
            
        }
        
        //Mostarmos los resultados:
        if (countPalabras == 0) {
            System.out.println("No hay palabras con 5 caracteres.");
        } else {
           System.out.println("En numero de palabras con 5 charateres es:" + countPalabras);
        }
    }
}
