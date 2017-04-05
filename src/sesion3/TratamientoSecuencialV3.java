/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion3;
import javabasic.LT;
/**
 * Dada una secuancia de caracteres y acabada en '.' devolver la primera vocal 
 * encontrada.
 * @author richardcj
 */
public class TratamientoSecuencialV3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        //Declaración de  variables
        char chart;
     
        System.out.println("Introduce la secuencia de caracteres acabada en punto.");
        //Lectura del primer caracter
        chart = LT.readCharacterSequence();
        
        //Tratamiento
        while (chart!='.' && chart!='a' && chart !='e' && chart !='i' && chart!='o' && chart!='u') {            
            //leemos el siguiente caracter;
            chart = LT.readCharacterSequence();
        }
        
        //Mostarmos el resultado obtenido.
        if(chart !='.'){
            System.out.println("La primera vocal de la secuencia es: " + chart);
        }else{
            System.err.println("La secuencia no tiene ningun caracter.");
        }
         
    }
}
