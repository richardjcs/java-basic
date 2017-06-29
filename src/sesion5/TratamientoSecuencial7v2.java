/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion5;

import javabasic.LT;

/**
 *  Version 2: 
 *  Contar el número de parejas de caracteres 'ib' contenidos en la secuencia.
 *  Secuencia: La secuencia introducida debe terminar en punto.
 * @author richardcj
 */
public class TratamientoSecuencial7v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Valores const JS
        final char ENDSEQUENCE='.';
        final char SPACE = ' ';
        //Declaraciones:
        char currentChart, lastChart=SPACE; 
        int count = 0;
        
        System.out.println("Introduce la secuencia de caracteres acabada en punto:");
         //Lectura del prime caracter
        currentChart= LT.readCharacterSequence();
        //Tratamiento de esquema de recorrido
        while (currentChart!=ENDSEQUENCE) {            
            if (currentChart=='b' && lastChart=='i'){
                count++;
            }
                //Preparar pareja de caracteres para la siguiente iteración
                lastChart = currentChart;
                //leemos el siguiente caracter
                currentChart= LT.readCharacterSequence();
        }
        
       //Mostarmos los resultados:
       
        System.out.println("En numero de parejas ib es:" + count);
        
    }
}
