/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion2;
import javabasic.LT;

/**
 * Suma de una secuencia de números enteros introducido por el usuario
 * se le pedirá al usuario que introduzca el numero de  numeros que quiere sumar
 * a continuación se introducirán dichos números.
 * @author richardcj
 */
public class SumeSecuencialV2 {
    public static void main(String [] args) throws Exception {
        //Como mínimo hay que sumar un número
        int numero, suma=0, count=1, numNumeros;
        
        //Lectura de numero introducido:
        System.out.print("Cuantos números quieres sumar? ");
        numNumeros = LT.readInt();
        
        //tratamiento através de un bucle iterativo.
        while(count<=numNumeros){
            System.out.print("Intoduce el numero " + count + ":");
            numero = LT.readInt();
            suma = suma + numero;
            count += count;
            
        }  
        //El resultado de la suma
        System.out.print("La suma total es: "+ suma);
        
        
    }
    
}
