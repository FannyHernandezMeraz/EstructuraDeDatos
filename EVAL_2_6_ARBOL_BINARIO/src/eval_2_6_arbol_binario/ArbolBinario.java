package eval_2_6_arbol_binario;

/**
 * @author moviles
 */
public class ArbolBinario {

    private Nodo root;

    public ArbolBinario() {
        this.root = null;
    }

    //Metodo publico para el usuario
    public void agregar(int valor) {
        if (root == null) {
            root = new Nodo(valor);
        } else {
            agergarRecur(valor, root);
        }
    }

    //metodo recursivo agregra
    //necesita el valor y el nodo actual
    private void agergarRecur(int valor, Nodo nodoActual) {
        //que el nodo recibidoes null
        // arbol vacio
        // 2 decidir si va a la izquierda o derecha
        /*
         verificar si el lado (nodo) es null
         si es null, ahi va el valor
         si no
         repetir recursion
         */
        Nodo nuevo = new Nodo(valor);
        if (valor < nodoActual.getValor()) { //va a la izquierda
            if (nodoActual.getIzquierda() == null) {
                nodoActual.setIzquierda(nuevo);
            } else {
                agergarRecur(valor, nodoActual.getIzquierda());
            }
        } else if (valor > nodoActual.getValor()) {//va a la derecha
            if (nodoActual.getDerecha() == null) {
                nodoActual.setDerecha(nuevo);
            } else {
                agergarRecur(valor, nodoActual.getDerecha());
            }
        } else { //igual
            System.out.println("E L E M E N T O   R E P E T I D O!!");
        }
    }

    //impresion de valores
    //in order
    //izquierdo valor derecho
    //metodo publico
    public void inOrder() {
        inOrderRecur(root);
        System.out.println("");
    }

    //metodo privado recursivo
    private void inOrderRecur(Nodo nodo) {
        if (nodo != null) {
            inOrderRecur(nodo.getIzquierda());
            System.out.print(nodo.getValor() + " - ");
            inOrderRecur(nodo.getDerecha());
        }
    }

    /*
    Primero lee
    luego izquierda
    luego derecha
    */
    public void preOrder() {
        preOrderRecur(root);
        System.out.println("");
    }

    //metodo privado recursivo
    private void preOrderRecur(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.getValor() + " - ");
            preOrderRecur(nodo.getIzquierda());
            preOrderRecur(nodo.getDerecha());
        }
    }

    /*
    primero izquierda
    luego derecha
    luego lee
    */
    public void postOrder() {
        postOrderRecur(root);
        System.out.println("");
    }

    //metodo privado recursivo
    private void postOrderRecur(Nodo nodo) {
        if (nodo != null) {
            postOrderRecur(nodo.getIzquierda());
            postOrderRecur(nodo.getDerecha());
            System.out.print(nodo.getValor() + " - ");
        }
    }

    //Como borrar nodos
}
