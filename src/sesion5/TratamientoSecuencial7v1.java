/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion5;

import javabasic.LT;

/**
 * Contar el número de parejas de caracteres 'ib' contenidos en la secuencia.
 * Secuencia: La secuencia introducida debe terminar en punto.
 * @author richardcj
 */
public class TratamientoSecuencial7v1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaraciones:
        char chart; 
        int count = 0;
        //Valores const JS
        final char ENDSEQUENCE='.';
        final char SPACE = ' ';
        
        System.out.println("Introduce la secuencia de caracteres acabada en punto:");
         //Lectura del prime caracter
        chart= LT.readCharacterSequence();
        //Tratamiento de esquema de recorrido
        
        while (chart!=ENDSEQUENCE) {
            if(chart == 'i'){
                //leemos el siguiente caracter
                chart= LT.readCharacterSequence();
                if(chart == 'b'){
                    count++;
                }
            }else{
                //leemos el siguiente caracter
                chart= LT.readCharacterSequence();
            }
            
        }
        
        //Mostarmos los resultados:
       
        System.out.println("En numero de parejas ib es:" + count);
        
        
    }
}
