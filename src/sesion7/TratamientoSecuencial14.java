/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion7;

import javabasic.LT;

/**
 *
 * @author richardcj
 */
public class TratamientoSecuencial14 {

    /**
     * Contar el numero de cada una de las vocales a,e,i,o,u y las consonantes.
     * Secuencia: La secuencia termina en punto.
     * Contador: contadores individuales.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaraciones.
        final char ENDSEQUENCE = '.';
        final char SPACE = ' ';
        char chart; 
        int countVocal_A=0,countVocal_E=0, countVocal_I=0, countVocal_O=0, countVocal_U=0;
        int countConsonante=0;
        
        
        //Pedir al usuario la secuenia.
        System.out.println("Introcuce la secuencian terminada en punto.");
        chart= LT.readCharacterSequence();
        
        //Buscar la primera palabra
        while (chart==SPACE) {            
            chart = LT.readCharacterSequence();
        }
        
        //Tratamiento de palabra:
        while(chart!=ENDSEQUENCE){
            
            if(chart!=SPACE){
                
                switch(chart){
                    
                    case 'a' :countVocal_A++;break;
                    case 'e' :countVocal_E++;break;
                    case 'i' :countVocal_I++;break;
                    case 'o' :countVocal_O++;break;
                    case 'u' :countVocal_U++;break;
                    default:countConsonante++;
                }
            chart = LT.readCharacterSequence();
                
                
            }
        }
        //Mostramos los resultados:
        System.out.println("El numero de As es: "+ countVocal_A);
        System.out.println("El numero de Es es: "+ countVocal_E);
        System.out.println("El numero de Is es: "+ countVocal_I);
        System.out.println("El numero de Os es: "+ countVocal_O);
        System.out.println("El numero de Us es: "+ countVocal_U);
        System.out.println("El numero de consonantes es: "+ countConsonante);
    }
}
