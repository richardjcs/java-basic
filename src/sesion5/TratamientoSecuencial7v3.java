/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion5;

import javabasic.LT;

/**
 *
 * @author richardcj
 */
public class TratamientoSecuencial7v3 {

    /**
     * Version 3: 
     * Contar el número de parejas de caracteres 'ib' contenidos en la secuencia.
     * Secuencia: La secuencia introducida debe terminar en punto.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Valores const JS
        final char ENDSEQUENCE = '.';
        final char SPACE = ' ';
        //Declaraciones:
        char chart; 
        int count = 0;
        
        System.out.println("Introduce la secuencia de caracteres acabada en punto:");
         //Lectura del prime caracter
        chart= LT.readCharacterSequence();
        
        //buscamos el  caracter 'i'
        while ((chart!=ENDSEQUENCE)&&(chart!='i')) {
            chart=LT.readCharacterSequence();
        }
        //buscamos el  caracter 'b'
        while (chart!=ENDSEQUENCE) {
            //continuo leyendo la secuencia.
            chart=LT.readCharacterSequence();
            if(chart == 'b'){
                count++;
            }
            //buscamos el  siguiente caracter 'i'
            while ((chart!=ENDSEQUENCE)&&(chart!='i')) {
                chart=LT.readCharacterSequence();
            }
             
        }
         
        //Mostarmos los resultados:
        if (count == 0) {
            System.out.println("No hay parejas ib en la secuencia");
        } else {
           System.out.println("En numero de parejas ib es:" + count);
        }
        
         
         
        
    }
    /**
     * Buscar el caracter i en una secuanecia
     * @param chart character de lectura
     * @param ENDSEQUENCE final de secuencia
     */
    private static void BuscarChardI(char currentChart, char ENDSEQUENCE, char searchChart) {
        while ((currentChart!=ENDSEQUENCE)&&(currentChart!=searchChart)) {
            currentChart=LT.readCharacterSequence();
        }
    }
}
