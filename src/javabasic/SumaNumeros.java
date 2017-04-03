/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasic;

/**
 * Suma de los números introducidos por el usuario, hasta que introduce el número 0.
 * Utilización de los métodos de la clase LT.java para la lectura
 * @author richardcj
 */
public class SumaNumeros {
    public static void main(String [] args) throws Exception {
        //Declaración de variables:
        int numero, suma = 0;
        //final variable que no se puede editar. numeroFinal es una constante.
        final int numeroFinal = 0;
        
        System.out.print("Introduce numeros: ");
         //Lectura de los numeros introducidos:
        numero = LT.readInt();
        
        //tratamiento:
        while(numero != numeroFinal){
            suma = suma + numero;
            System.out.print("La suma es: " +suma+ " Introduce otro numero: ");
            numero = LT.readInt();
        }
        //Visualización del resultado del suma
        System.out.println("El resultado final es: " + suma);
        
        
    }
}
