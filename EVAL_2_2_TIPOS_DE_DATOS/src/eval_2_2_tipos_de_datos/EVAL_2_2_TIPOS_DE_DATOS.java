/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eval_2_2_tipos_de_datos;

import java.util.LinkedList;

/**
 *
 * @author moviles
 */
public class EVAL_2_2_TIPOS_DE_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<String> miLista = new LinkedList<String>();
        //miLista.
        TiposDatosGenericos<Integer> miObj = new TiposDatosGenericos<Integer>(); // <Integer> ------> calse
        miObj.setValor(100);
        System.out.println(miObj.getValor());
    }
    
}

class TiposDatosGenericos<T>{
    private T valor; // ------> T es una platilla que puede tener cualuqier tipo de dato

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }
    
}
