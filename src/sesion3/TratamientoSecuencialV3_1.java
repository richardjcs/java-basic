/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion3;

import javabasic.LT;

/**
 *
 * @author richardcj
 */
public class TratamientoSecuencialV3_1 {

    /**
     * Devolver la primera vocal encontrada.
     * utilizar una variable booleana.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaración de variables.
        final char endSequence='.';
        char chart;
        boolean found= false;
        System.out.println("Introduce la secuencia de caracteres acabada en punto.");
        //Lectura del primer caracter
        chart = LT.readCharacterSequence();
        
        while (chart!=endSequence && !found) {
     
            if ((chart=='a') || (chart=='e') || (chart=='i') || (chart=='o') || (chart=='u')){
                found= true;
            }else{
                //continuasmos con la lectura del caracter
                chart = LT.readCharacterSequence();
            }
        }
        
        //Mostarmos los resultados:
        if (found) {
            System.out.println("La vocal encontrada es: )" +chart);
        }else{
            System.out.println("No se ha encontrado en la secuencia ninguna vocal :(");
        }
        
    }
}
