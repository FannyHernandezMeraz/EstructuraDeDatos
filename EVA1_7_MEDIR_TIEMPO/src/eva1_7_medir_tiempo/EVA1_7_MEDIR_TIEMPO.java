/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_7_medir_tiempo;

/**
 *
 * @author moviles
 */
public class EVA1_7_MEDIR_TIEMPO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long ini = System.nanoTime();
        int[] datos = new int[100000000];
        for (int i = 0; i < datos.length; i++) {
            datos[i] = 100;
        }
        long fin = System.nanoTime();
        long tiempo = fin - ini;
        System.out.println(tiempo);
    }
    
}
