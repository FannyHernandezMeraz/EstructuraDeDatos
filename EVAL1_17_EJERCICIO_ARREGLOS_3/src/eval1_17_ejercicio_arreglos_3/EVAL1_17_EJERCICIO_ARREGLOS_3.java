/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eval1_17_ejercicio_arreglos_3;

/**
 *
 * @author moviles
 */
public class EVAL1_17_EJERCICIO_ARREGLOS_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [][] matriz = new int [5][5];
       
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz [i][j] = (int) (Math.random()*100);
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
        
        int [][] copiaMatriz = new int [5][5];
        
        
       /* for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                copiaMatriz[i][j]=matriz[i][j];
            }
  
        }*/
        
        System.out.println("");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                copiaMatriz[i][j]=matriz[(matriz.length - 1)-i][(matriz.length - 1)-j];
               System.out.print("["+copiaMatriz[i][j]+"]");
            }
            System.out.println("");
        }
        
        
        
        
    }
    
}
