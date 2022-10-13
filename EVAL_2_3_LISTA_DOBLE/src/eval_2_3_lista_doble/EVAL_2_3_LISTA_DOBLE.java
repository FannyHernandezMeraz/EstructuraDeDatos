
package eval_2_3_lista_doble;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author moviles
 */
public class EVAL_2_3_LISTA_DOBLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaDoble listaDoble = new ListaDoble();
        
        listaDoble.agregar(10); // 0
        listaDoble.agregar(20); // 1
        listaDoble.agregar(30); // 2
        listaDoble.agregar(40); // 3
        
        listaDoble.imprimir();
        
        try {
            listaDoble.insertarEn(25, 0);
        } catch (Exception ex) {
            Logger.getLogger(EVAL_2_3_LISTA_DOBLE.class.getName()).log(Level.SEVERE, null, ex);
        }
        listaDoble.imprimir();
        
        try {
            listaDoble.borrarEn(2);
        } catch (Exception ex) {
            Logger.getLogger(EVAL_2_3_LISTA_DOBLE.class.getName()).log(Level.SEVERE, null, ex);
        }
        listaDoble.imprimir();
    }
        
}
