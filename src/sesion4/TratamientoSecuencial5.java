/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion4;

import javabasic.LT;

/**
 * Contar el numero de vocales, consonante y espacios de una secuencia.
 * Secuencia: La secuancia introducida por teclado termina en punto.
 * @author richardcj
 */
public class TratamientoSecuencial5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaraciones:
        char character;
        int countVocal=0, countConsonate=0, countEspacio=0;
        final char endSequence='.';
        final char space = ' ';
        
        System.out.println("Introduce la secuencia de caracteres acabada en punto: \n ");
         //Lectura del prime caracter
        character= LT.readCharacterSequence();
        //Tratamiento de esquema de recorrido
        while (character!=endSequence) {            
            //tratamiento caracter
            if (character!=space) {
                if ((character=='a') || (character=='e') || (character=='i') || (character=='o') || (character=='u')) {
                    countVocal++;
                } else {
                    countConsonate++;
                }
            }else{
                countEspacio++;
            }
            //continuasmos con la lectura del caracter
            character = LT.readCharacterSequence();
        }
        
        //Visualizamos los resultados por consola:
        System.out.println("En numero de vocales es:" + countVocal);
        System.out.println("El numero de consonantes es:" + countConsonate);
        System.out.println("El numero de espacios es:" + countEspacio);
        
        
        
        
        
        // TODO code application logic here
    }
}
