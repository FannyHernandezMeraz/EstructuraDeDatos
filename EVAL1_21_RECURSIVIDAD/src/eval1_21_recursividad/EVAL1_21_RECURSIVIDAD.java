/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eval1_21_recursividad;

/**
 *
 * @author moviles
 */
public class EVAL1_21_RECURSIVIDAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("MAIN " + A());
        
    }
    public static String A(){
        return "A " + B();
    }
    
    public static String B(){
        return "B " + C();
    }
    
    public static String C(){
        return "C";
    }
}
