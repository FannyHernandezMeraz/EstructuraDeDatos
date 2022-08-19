/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_3_heap;

/**
 *
 * @author moviles
 */
public class EVA1_3_HEAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 10;
            //En Java las direcciones de memoria se les llama REFENECIAS, en otros lenguajes los llamamos APUNTADORES.
        Prueba obj = new Prueba();
        Prueba obj2 = new Prueba();
        System.out.println(x);
            //obj y obj2 guardan REFERENCIAS
        System.out.println(obj);
        System.out.println(obj2);
            //Para saber que es lo que guarda el objeto se utiliza el operador "." (punto) seguido del dato que queremos mostrar
        System.out.println(obj.valor);
    }
    
}

class Prueba{
    public int valor = 100;
}
