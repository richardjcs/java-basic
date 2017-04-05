/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion3;
import javabasic.LT;
/**
 * Dada una secuancia de caracteres y acabada en '.' contar el numero
 * de 'a' encontrados en dicha secuencia.
 * @author richardcj
 */
public class TratamientoSecuencial {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        //Declaración de  variables
        char chartA;
        int count = 0;
        
        System.out.println("Introduce la secuencia de caracteres acabada en punto.");
        //Lectura del primer caracter
        chartA = LT.readCharacterSequence();
        
        //Tratamiento
        
        while (chartA!='.') {            
            if (chartA=='a') {
                count++;
            }
            //leemos el siguiente caracter;
            chartA = LT.readCharacterSequence();
        }
        //Mostarmos el resultado obtenido.
        
        System.out.println("El numero de A's en la secuencia es: " + count);
        
    }
}
