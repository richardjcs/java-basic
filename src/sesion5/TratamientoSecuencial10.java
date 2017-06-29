/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion5;

import javabasic.LT;

/**
 * Contar el número de palabras cuyos caracteres sean solo caracters vocales.
 * secuencia : Secuencia introducida que termina en punto
 * @author richardcj
 */
public class TratamientoSecuencial10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaraciones:
        final char ENDSEQUENCE = '.';
        final char SPACE = ' ';
        char chart; 
        int countPalabrasAllVocal=0;
        
        
        System.out.println("Introduce la secuencia de caracteres acabada en punto:");
        //Lectura del prime caracter
        chart= LT.readCharacterSequence();
        
        //buscamos el palabra
        while ((chart==SPACE)) {
            chart=LT.readCharacterSequence();
        }
        
        while (chart != ENDSEQUENCE) {            
            
            //tratamiento 
            boolean allVocales=true;
            
            while ((chart!=ENDSEQUENCE)&&(chart!=SPACE)) {
                
                // se cumple cuenco es consonante
                if (!((chart=='a') || (chart=='e') || (chart=='i') || (chart=='o') || (chart=='u'))) {
                    //si el siguiente carater es consonante allVocals = false
                    allVocales=false;
                }
                
                chart=LT.readCharacterSequence();
               
            }
            
            //si la palabra contiene todo vocales
            if (allVocales){
                countPalabrasAllVocal++;
            }
            
            //buscamos el palabra
            while ((chart==SPACE)) {
                chart=LT.readCharacterSequence();
            }
            
        }
        
        //Mostarmos los resultados:
        if (countPalabrasAllVocal == 0) {
            System.out.println("No hay palabras formadas por solo vocales");
        } else {
           System.out.println("Las palabras compuestas solo por vocales es:" + countPalabrasAllVocal);
        }
    }
}
