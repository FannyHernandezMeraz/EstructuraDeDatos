package eval_2_6_arbol_binario;

/**
 * @author moviles
 */
public class EVAL_2_6_ARBOL_BINARIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArbolBinario arbol = new ArbolBinario();
        arbol.agregar(13);
        arbol.agregar(10);
        arbol.agregar(18);
        arbol.agregar(2);
        arbol.agregar(11);
        arbol.agregar(17);
        arbol.agregar(20);
        arbol.agregar(16);
        arbol.agregar(16);
        arbol.inOrder();
        arbol.preOrder();
        arbol.postOrder();
        
    }

}
