/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eval1_13_paso_valor_reff;

/**
 *
 * @author moviles
 */
public class EVAL1_13_PASO_VALOR_REFF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int valPrueb = 100;
        System.out.println("Valor = " + valPrueb);
        incVal(valPrueb);
        System.out.println("Valor incrementado = " + valPrueb);
        
        //************************************************************
        
        PruebaValor prueba = new PruebaValor();
        prueba.x = 100;
        System.out.println("Valor (objeto) = " + prueba.x);
        incVal(prueba);
        System.out.println("Valor incrementado (objeto) = " + prueba.x);
    }
    
    public static void incVal(int valor){
        valor++;
    }
    
    // Mandando los objetos a metodos se puedesn modificar los valores, no las direcciones
    public static void incVal(PruebaValor pruebaVal){
        pruebaVal.x++;
    }
    
}

class PruebaValor{
    int x;
    
}