/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion2;
import javabasic.LT;

/**
 * Suma de una secuencia de números enteros introducido 
 * La secuencia finaliza cuando el usuario introduce el número 0.
 *  ACCIÓN ITERATIVO o REPETITIVO
 * @author richardcj
 */
public class SumaSecuencial {
    public static void main(String [] args) throws Exception {
        //Definición de variables:
        int numero, suma=0;
        //Lectura de numero introducido:
        System.out.print("Introduce numeros, para finalizar -> 0. ");
        numero = LT.readInt();
        
        //Tratamiento
        while(numero!=0){
            suma = numero+suma;
            System.out.print("Introduce numeros, para finalizar -> 0. ");
            numero = LT.readInt();  
        }
        //Resultado
        System.out.print("La suma total es: "+ suma);
        
    }
    
}
