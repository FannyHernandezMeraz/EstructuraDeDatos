/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_11_ejemplo_arreglos;

import java.util.Scanner;

/**
 *
 * @author moviles
 */
public class EVA1_11_EJEMPLO_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Primera dimension --> grupos
        //segunda dimension --> estudiantes por grupo
        
        int[][] caliGrupAlum; //Se crea arreglo aun no definido
        
        Scanner a = new Scanner(System.in);
        System.out.println("Introduce el numero de grupos:");
        int aGrupo = a.nextInt();
        
        caliGrupAlum = new int[aGrupo][]; // Se asigna el valor de la primera dimension (numero de grupos)
        
        for (int i = 0; i < caliGrupAlum.length; i++) { // For para pedir el numero de alumnos por grupo
            System.out.println("Introduce el numero de alumnos del " + (i + 1) + " grupo");
            int b = a.nextInt();
            caliGrupAlum[i]= new int[b]; // Se asigna el valor de la segunda dimesion (numero de estudiantes de cada grupo)
                for (int j = 0; j < caliGrupAlum[i].length; j++) { // For para asignar las calificaciones de cada estudiante
                
            }
        }
    }
    
}
