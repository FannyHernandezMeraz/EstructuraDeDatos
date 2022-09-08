/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eval1_16_ejercicio_arreglos_5;

/**
 *
 * @author moviles
 */
public class EVAL1_16_EJERCICIO_ARREGLOS_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo1 = new int[50];
        int cont = 0;
        
        for (int i = 0; i < arreglo1.length; i++) { // For para llenar el arreglo
            arreglo1[i] = ((int) (Math.random() * 100)) + 1;
            if (arreglo1[i]%2==0) { // If para imprimir los valores pares
                contador++;
            }
        }
        imprimir(arreglo1);
        
        int arregloPar = new int[cont];
        
        
    }
    
    public static void imprimir(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("[" + arreglo[i] + "]");
        }
    }
    
}
