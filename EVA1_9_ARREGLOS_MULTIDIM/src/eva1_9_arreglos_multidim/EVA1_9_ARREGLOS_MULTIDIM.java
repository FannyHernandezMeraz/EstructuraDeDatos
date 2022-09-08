/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_9_arreglos_multidim;

/**
 *
 * @author moviles
 */
public class EVA1_9_ARREGLOS_MULTIDIM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matrizDatos = new int[3][5]; //Arreglo de dos dimensiones (el primer arreglo guarda las direcciones y el segundo arreglo los valores)
        System.out.println("Filas: " + matrizDatos.length);
        
        // PRIMERA DIMENSION (3 filas)
        for (int i = 0; i < matrizDatos.length; i++) { 
            // For para acceder a la SEGUNDA DIMENSION (5 columnas)
            System.out.println("Columnas: " + matrizDatos[i].length);
            for (int j = 0; j < matrizDatos[i].length; j++) {
                matrizDatos[i][j] = 100;
            }
        }
        // Imprimir los datos en forma de matriz
        for (int i = 0; i < matrizDatos.length; i++) {
            for (int j = 0; j < matrizDatos[i].length; j++) {
                System.out.print("[" + matrizDatos[i][j] + "]");
            }
            System.out.println(""); // Salto de fila
        }
    }
    
}
