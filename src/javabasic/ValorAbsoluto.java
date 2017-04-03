/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasic;

/**
 *  Visualización del valor absoluto de un numero introducido por consola
 *  Utilización de los métodos de la clase LT.java
 * @author richardcj
 */
public class ValorAbsoluto {
    public static void main(String [] args) throws Exception {
        //Declaración de variables:
        int numero;
        System.out.println("Introduce un número: ");
        //lectuera del numero:
        numero = LT.readInt();
        
        //Tratamiento del valor absoluto:
        if (numero<0){
            numero = -numero;
        }
        // Resultado en valor absoluto
        System.out.println("El valor absoluto es: " + numero);
        
        
    }
}
