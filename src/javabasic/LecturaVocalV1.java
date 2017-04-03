/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasic;

/**
 * Comprobar si el caracter introducido es una vocal. (switch)
 * Utilización de los métodos de la clase LT.java para la lectura
 * @author richardcj
 */
public class LecturaVocalV1 {
    public static void main(String [] args) throws Exception {
        //Definición de variables:
        char caracter;
        
        System.out.println("Introduce una vocal: ");
        //Lectura de catacter introducido:
        caracter = LT.readCharacter();
        
        //tratamiento:
        switch (caracter){
            case 'a' : System.out.println("Es la vocal A"); break;
            case 'e' : System.out.println("Es la vocal E"); break;
            case 'i' : System.out.println("Es la vocal I"); break;
            case 'o' : System.out.println("Es la vocal O"); break;
            case 'u' : System.out.println("Es la vocal U"); break;
            default: System.out.println("El caracter no es una vocal");
        }
        
        
        
    }
}
