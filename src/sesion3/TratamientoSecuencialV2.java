/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion3;
import javabasic.LT;
/**
 * Dada una secuancia de caracteres y acabada en '.' contar el numero
 * de vocales de la secuancia.
 * @author richardcj
 */
public class TratamientoSecuencialV2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        //Declaración de  variables
        char chart;
        int count = 0;
        
        System.out.println("Introduce la secuencia de caracteres acabada en punto.");
        //Lectura del primer caracter
        chart = LT.readCharacterSequence();
        
        //Tratamiento
        while (chart!='.') {            
            if (chart=='a' || chart =='e' || chart =='i' || chart=='o' || chart=='u') {
                count++;
            }
            //leemos el siguiente caracter;
            chart = LT.readCharacterSequence();
        }
        //Mostarmos el resultado obtenido.
        
        System.out.println("El numero vocales de la secuencia es: " + count);
        
    }
}
