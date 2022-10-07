
package eval_2_1_lista_simple;

/**
 * @author moviles
 */
public class EVAL_2_1_LISTA_SIMPLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Lista miLista = new Lista();
        System.out.println("Cantidad de Nodos: " + miLista.tamaLista());
        miLista.add(10); //0
        miLista.add(20); //1
        miLista.add(30); //2 // aqui debe que quedar temp
        miLista.add(40); //3 <------Insercion
        miLista.add(50); //4
        miLista.add(60); //5
        System.out.println("Cantidad de Nodos: " + miLista.tamaLista());
        miLista.imprimir();
        
        try{
        miLista.insertarEn(70, 3);
        }catch(Exception ex){
            ex.printStackTrace();
        }
        miLista.imprimir();
        //miLista.vaciarLista();
        
        miLista.borrarEn(3);
        miLista.imprimir();
        
        miLista.obtenValorEn(4);
        miLista.imprimir();
        
       /*
       // miLista.imprimir();        
       //int[]arreglo = new int [1000000];
        for (int i = 0; i < 1000000; i++) {
            //arreglo[i]=1000;
            miLista.add(1000);
        }
        System.out.println("conteo de nodos: "+miLista.tamaLista());
        */
    }
    
}
