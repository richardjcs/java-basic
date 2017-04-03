/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasic;

/**
 * Utilización de los métodos de la clase LT.java
 *  Lectura de numero enteros/ reales.
 * @author richardcj
 */
public class JavaBasicV3 {
    public static void main(String [] args) throws Exception {
        //Declaración de variables.
        double a,b,x;
        System.out.print("introducir el valor de a: ");
        
        //Lectura de coeficiente a y b:
        a = LT.readReal();
        b = LT.readReal();
        
        x= -b/a;
        
        //Mostrar resultado: 
        System.out.println("Resultado de la operación x =" + x );
    }
}
