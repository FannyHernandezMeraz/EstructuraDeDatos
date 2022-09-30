
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
        miLista.add(10);
        miLista.add(20);
        miLista.add(30);
        miLista.add(40);
        miLista.add(50);
        miLista.add(60);
        miLista.imprimir();
        
        try{
            miLista.insertarEn(70, 3);
        }catch(Exception ex) {
            ex.printStackTrace();
        }
        
    }
    
}
