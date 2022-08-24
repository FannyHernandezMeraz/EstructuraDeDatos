/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_4_arreglos;

/**
 *
 * @author moviles
 */
public class EVA1_4_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // TIPO DE DATO[] IDENTIFICADOR = new TIPO DE DATO
        
        // Arreglo de enteros para capturar edades:
        int[] arregloEdades, arregloSalon, arregloCali; //Todos son arreglos
        double arregloPromedio[], porcentaje; //Solo arregloPromedio es un arreglo
        
        // Los arreglos son OBJETOS
        
        // [Integer.MAX_VALUE] maximo valor de datos que acepta un arreglo
        arregloEdades = new int[50];
        System.out.println(arregloEdades);
        // Para rellenar todos los valores del arreglo aleatoriamiente se usar for
        for (int i = 0; i < arregloEdades.length; i++) {
            arregloEdades[i] = (int)(Math.random() * 100); // Math.random me da valores decimales y mis valores son enteros por lo que debemos cambiar el valor
        }
        // For para imprimir los valores del arreglo
        for (int i = 0; i < arregloEdades.length; i++) {
            System.out.println("[" + i + "]" + arregloEdades[i]);
        }
    }
    
}
