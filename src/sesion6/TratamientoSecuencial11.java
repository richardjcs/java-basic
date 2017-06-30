/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion6;

import javabasic.LT;

/**
 * Contar el  número de palabras con tenga solo 5 caracteres que sean vocales.
 * Secuencia: La secuencia introducida que termina en punto
 * @author richardcj
 */
public class TratamientoSecuencial11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables
        final char ENDSEQUENCE = '.';
        final char SPACE = ' ';
        char chart; 
        int countPalabrasAllVocal=0;
        
        System.out.println("Introduce la secuencia de caracteres acabada en punto:");
        //Lectura del prime caracter
        chart= LT.readCharacterSequence();
        
        //buscamos la primera palabra
        while ((chart==SPACE)) {
            chart=LT.readCharacterSequence();
        }
        while (chart != ENDSEQUENCE) { 
            //tratamiento 
            boolean allVocales=true;
            int numChartVocales = 0;
            
            while ((chart!=ENDSEQUENCE)&&(chart!=SPACE)) {
                numChartVocales++;
                if (!((chart=='a') || (chart=='e') || (chart=='i') || (chart=='o') || (chart=='u'))) {
                    //si el siguiente carater es consonante allVocals = false
                    allVocales=false;
                }
                chart=LT.readCharacterSequence();
            }
            //si la palabra contiene todo vocales
            if (allVocales && numChartVocales==5){
                countPalabrasAllVocal++;
            }
            //buscamos el palabra
            while ((chart==SPACE)) {
                chart=LT.readCharacterSequence();
            }
        
        }
        // Visualización resultados
       
        if (countPalabrasAllVocal == 0) {
            System.out.println("No hay palabras formadas por solo vocales");
        } else {
            System.out.println("El numero de palabras formado solo por 5 vocales es"+ countPalabrasAllVocal);
        }
    }
}
