/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion4;
//Importamos la calse de lectura de nuestro programa.
import javabasic.LT;

/**
 * Contar el numero de consonantes y vocales de una secuencia acabada en punto.
 * Funcionalida: Secuencia de datos acabada en punto.
 * Mensajes: 
 *  - Secuencia con mayor numero de consonantes. cons> vovales
 *  - Secuencia con mayor cumero de vocales. vocales>cons
 *  - Secuencia con igual numero de vocales y consonantes. vocales=cons
 * @author richardcj
 */
public class TratamientoSecuencial4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaraciones
        char character;
        int countVocales = 0 , countConsonantes = 0;
        final char endSequence='.';
        final char space = ' ';
        
        //Aciones 
        //Lectura del prime caracter
        System.out.println("Introduce la secuencia de caracteres. Terminada en punto: ");
       
        character= LT.readCharacterSequence();
        
        
        //Tratamiento de esquema de recorrido
        while (character!=endSequence) {            
            //tratamiento caracter
            if (character!=space) {
                if ((character=='a') || (character=='e') || (character=='i') || (character=='o') || (character=='u')) {
                    countVocales++;
                } else {
                    countConsonantes++;
                }
            }
            //continuasmos con la lectura del caracter
            character = LT.readCharacterSequence();
        }
        
        if (countVocales>countConsonantes) {
            System.out.println("Hay mas vocales que consonantes");
        }else if(countVocales<countConsonantes){
            System.out.println("SECUENCIA CON DOMINANCIA DE CARACTERES CONSONANTES");
        }else{
            System.out.println("SECUENCIA CON PARIDAD DE CONSONANTES Y VOCALES");
        }
         
    }
}
