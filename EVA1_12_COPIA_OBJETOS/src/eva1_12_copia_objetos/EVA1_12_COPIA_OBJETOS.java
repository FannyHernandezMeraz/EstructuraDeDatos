/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_12_copia_objetos;

/**
 *
 * @author moviles
 */
public class EVA1_12_COPIA_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Copia de enteros
        int valor, copiaValor;
        valor = 100;
        copiaValor = valor;
        System.out.println("Valor = " + valor);
        System.out.println("Copia = " + copiaValor);
        valor++;
        System.out.println("Valor = " + valor);
        System.out.println("Copia = " + copiaValor);
        
        // Ahora con objetos
        
        //Aqui solo se copian direcciones, por eso los valores de valor y valorCopia son iguales
        PruebaValor prueba = new PruebaValor();
        prueba.x = 1000;
        PruebaValor pruebaCopia = new PruebaValor();
        pruebaCopia = prueba;
        System.out.println("AHORA CON OBJETOS");
        System.out.println("Prueba = " + prueba.x);
        System.out.println("Prueba copia = " + pruebaCopia.x);
        prueba.x++; 
        System.out.println("Prueba = " + prueba.x);
        System.out.println("Prueba copia = " + pruebaCopia.x);
    }
    
}
class PruebaValor{
    int x;
    
}
