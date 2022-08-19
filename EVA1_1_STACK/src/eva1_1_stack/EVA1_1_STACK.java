/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_1_stack;

/**
 *
 * @author moviles
 */
public class EVA1_1_STACK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Inicia MAIN");
        A();
        System.out.println("Retoma ejecución MAIN");
        System.out.println("Termina MAIN");
        
    }
    public static void A(){
        System.out.println("Inicia A");
        B();
        System.out.println("Retoma ejecución A");
        System.out.println("Termina A");
    }
    public static void B(){
        System.out.println("Inicia B");
        int i = 1;
        double d = 10.0;
        System.out.println("Termina B");
    }
    
}
