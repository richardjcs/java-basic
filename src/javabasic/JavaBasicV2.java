/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasic;

/**
 *  Utilización de los métodos de la clase LT.java
 * @author richardcj
 */
public class JavaBasicV2 {
    public static void main(String [] args) throws Exception {
        int x,a,b;
        System.out.print("introducir el valor de a: ");
        //Lectura del coeficiente a:
        a = LT.readInt();
        // Lectura del coeficiente b:
        b = LT.readInt();
        
        //tratamiento:
        x = -b/a;
        
        //Mostrar resultado: 
        System.out.println("Resultado de la operación x =" + x );
        
        
    }
}
