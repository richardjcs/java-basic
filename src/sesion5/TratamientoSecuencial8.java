/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion5;

import javabasic.LT;

/**
 * Contar el número de palabras contenidas en una secuencia.
 * Secuencia: Finalizada en punto.
 * @author richardcj
 */
public class TratamientoSecuencial8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        //Declaraciones:
        final char ENDSEQUENCE = '.';
        final char SPACE = ' ';
        char chart; 
        int count = 0;
        
        System.out.println("Introduce la secuencia de caracteres acabada en punto:");
        //Lectura del prime caracter
        chart= LT.readCharacterSequence();
        
        //buscamos el palabra
        while ((chart==SPACE)) {
            chart=LT.readCharacterSequence();
        }
        
        while (chart != ENDSEQUENCE) {            
            count ++;
            //pasar palabra actual
            while ((chart!=ENDSEQUENCE)&&(chart!=SPACE)) {
                chart=LT.readCharacterSequence();
            }
            
            //buscamos el palabra
            while ((chart==SPACE)) {
                chart=LT.readCharacterSequence();
            }
            
        }
        
        //VISUALIZAR RESULTADO
        System.out.println("EL NÚMERO DE PALABRAS ES: " + count);
    }
}
