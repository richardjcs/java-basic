/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion4;

import javabasic.LT;

/**
 *
 * @author richardcj
 */
public class TratamientoSecuencial6 {

    /**
     * Visualizar la primera vocal despues de una consonante.
     * Secuancia: La secuencia introducida terminan en punto.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final char endSequence='.';
        final char space = ' ';
        boolean found = false;
        char currentChar, lastChar = space;
        
        System.out.println("Introduce la secuencia de caracteres acabada en punto:");
         //Lectura del prime caracter
        currentChar= LT.readCharacterSequence();
        //Tratamiento de esquema de recorrido
        while (currentChar!=endSequence && !found) {     
            if (((currentChar=='a') || (currentChar=='e') || (currentChar=='i') || (currentChar=='o') || (currentChar=='u')) &&
                   (!((lastChar=='a') || (lastChar=='e') || (lastChar=='i') || (lastChar=='o') || (lastChar=='u')))  &&(lastChar!=space) ) {
                found =true;
            }else{
                //Preparamos los caracteres para la siguiente iteración
                lastChar= currentChar;
                //continuasmos con la lectura del caracter
                currentChar = LT.readCharacterSequence();
            }  
        }
        //Mostarmos los resultados:
        if (found) {
            System.out.println("La secuancia encontrada es:" +lastChar +currentChar);
        }else{
            System.out.println("No se ha encontrado en la secuencia, ninguna vocal que cumpla el requisito :(");
        }
        
        
    }
}
