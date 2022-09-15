/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eval1_19_gcd;

/**
 *
 * @author moviles
 */
public class EVAL1_19_GCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(gcd(180, 48));
    }
    
    public static int gcd(int divisor, int dividendo){
        int residuo = dividendo % divisor;
        if (residuo == 0) {
            return divisor;
        } else {
            return gcd(divisor, residuo);
        }
    }

}
