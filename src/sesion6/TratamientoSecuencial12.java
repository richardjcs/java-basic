/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion6;

import javabasic.LT;

/**
 *
 * @author richardcj
 */
public class TratamientoSecuencial12 {

    /**
     * Contar el número de palabras con un número de caracteres introducido porelusuario.
     * Secuencia: La secuencia introducida que termina en punto
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        final char ENDSEQUENCE = '.';
        final char SPACE = ' ';
        char chart; 
        int countWord=0,numChart;
        
        //Acciones:
        //Pedir al usuario el numero de caracteres para contar en la secuenia.
        System.out.print("Número de caracteres a contar: ");
        numChart = LT.readInt();
        
        System.out.println("Introduce la secuencia de caracteres acabada en punto:");
        //Lectura del prime caracter
        chart= LT.readCharacterSequence();
        
         //buscamos la primera palabra
        while ((chart==SPACE)) {
            chart=LT.readCharacterSequence();
        }
        
        //Tratamiento 
        while (chart!=ENDSEQUENCE) {            
            int countChart= 0;
            //Tratamiento de palabra
            while (chart!=ENDSEQUENCE && chart!=SPACE) {                
                countChart++;
                chart= LT.readCharacterSequence();
            }
            if(numChart==countChart){
                countWord++;
            }
            //buscamos la siguiente palabra
            while ((chart==SPACE)) {
                chart=LT.readCharacterSequence();
            }
        }
        
        
        if (countWord==0) {
            System.out.println("No hay palabras con " +numChart+ " caracteres");
        } else {
            System.out.println("En numero de palabras con " +numChart+ "caracteres es:" + countWord);
        }
    }
}
