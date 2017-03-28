/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *  Esquema secuancial analisis de diseño descendiente
 * @author richardcj
 */


public class JavaBasic {
    
    public static void main(String [] args) throws Exception {
        //declarar variables
        int a,b,x;
        
        // Visualización mensaje introducción coeficiente
        System.out.print("INTRODUCIR COEFICIENTE a: ");
        // Lectura coeficiente a
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
        String line = in.readLine();
        a=Integer.parseInt(line);
        
        
        // Visualización mensaje introducción término independiente b
        System.out.print("INTRODUCCIÓN TÉRMINO INDEPENDIENTE b: ");
        // Lectura término independiente b
        line=in.readLine();
        b=Integer.parseInt(line);
        
        // tratamiento de datos:
        x=-b/a;
        
        // Print del resultado final:8
        System.out.println("EL RESULTADO ES x=" + x);
           
    }
}