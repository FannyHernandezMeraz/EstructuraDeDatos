/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_8_arreglos_objetos;

/**
 *
 * @author moviles
 */
public class EVA1_8_ARREGLOS_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Prueba[] arregloPrueba = new Prueba[20]; // Aqui solo está el arreglo
        
        // System.out.println("Valor de x = " + arregloPrueba[10].x); Marca error porque aun no se llenan los valores del arreglo
        
        // Se crea el objeto
        for (int i = 0; i < arregloPrueba.length; i++) {
            arregloPrueba[i] = new Prueba(); // Aqui creamos el objeto al arreglo (con el new) para asignarle valores
            System.out.println(arregloPrueba[i]); // Imprimimos las direcciones
        }
        // Leer x
        for (Prueba arregloP : arregloPrueba) {
            System.out.println(arregloP.x); // Imprimimos los valores con el .x (representa el valor que tenemos en la clase Prueba)
        }
    }
    
}

class Prueba {
    int x = 100;
}