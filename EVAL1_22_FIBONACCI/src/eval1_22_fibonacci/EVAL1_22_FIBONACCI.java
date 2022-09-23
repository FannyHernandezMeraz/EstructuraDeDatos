/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eval1_22_fibonacci;

import java.util.Scanner;

/**
 *
 * @author moviles
 */
public class EVAL1_22_FIBONACCI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Una forma de hacer lo de Fibonacci pero no es recurcivo
        /*Scanner teclado = new Scanner(System.in);
        
        int a = 0, b = 1, c, n;
        
        System.out.println("Por favor ingrese cantidad de elementos para la serie");
        n = teclado.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.print(a + " - ");
            c = a + b;
            a = b;
            b = c;
        } */
        
        // Fibonacci en llamada recursiva
        Scanner teclado = new Scanner(System.in);
        int n;
        
        System.out.println("Por favor ingrese cantidad de elementos para la serie");
        n = teclado.nextInt();
        
        for (int i = n; i >= 0; i--) {
            System.out.print(fibonacci(i) + " - ");
        }
        
    }
    
    public static int fibonacci(int pos){
        if (pos <= 1) {
            return 1;
        } else
            return fibonacci(pos - 1) + fibonacci(pos -2);
    }
    
}
