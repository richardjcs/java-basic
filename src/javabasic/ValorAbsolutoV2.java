/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasic;

/**
 * Visualización del valor absoluto de un numero introducido por consola
 * Utilización del esquema condicional.
 * Utilización de los métodos de la clase LT.java para la lectura
 * @author richardcj
 */
public class ValorAbsolutoV2 {
     public static void main(String [] args) throws Exception {
         //Declaración de variables
         int numero, valorAbsoluto;
         
         System.out.println("Introduce un número: ");
         //Lectura de numero introducido:
         numero = LT.readInt();
         
         //Tratamiento
          if(numero<0){
              valorAbsoluto = -numero;
          }else{
              valorAbsoluto = numero;
          }
          //Visualición de resultados:
          System.out.println("El valor absoluto de " + numero + " es:" + valorAbsoluto);
         
         
     }
}
