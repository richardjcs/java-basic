/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion2;
import javabasic.LT;

/**
 *  Suma de una secuencia de números enteros introducido 
 *  La secuencia finaliza cuando el usuario introduce el número 0.
 *  Utilización de la sentencia DO while
 * @author richardcj
 */
public class SumaSecuencialV3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        //Definición de variables:
        int numero, suma = 0;
        
        //tratamiento.
        do {
            //Lectura de valor introducido
            System.out.println("Introduce un numero: ");
            numero = LT.readInt();
            suma = suma+numero;
        }while(numero!=0);
        
        //El resultado de la suma
        System.out.print("La suma total es: "+ suma);
           
    }
}
