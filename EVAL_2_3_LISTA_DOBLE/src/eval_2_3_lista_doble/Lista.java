package eval_2_3_lista_doble;

/**
 * @author moviles
 */
public class Lista {

    private Nodo inicio;
    private Nodo fin;
    private int cont;

    public Lista(Nodo inicio, Nodo fin, int cont) {
        this.inicio = inicio;
        this.fin = fin;
        this.cont = cont;
    }

    public boolean listaVacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void imprimir() {
        if (inicio == null) {
            System.out.println("Lista vacia");
        } else {
            Nodo temp = inicio;
            //como muevo a temp?
            while (temp != null) {
                System.out.print(temp.getValor() + " - ");
                temp = temp.getSiguiente();
            }
            System.out.println("");
        }
    }

    public int tamaLista() {
        int cont = 0;
        Nodo temp = inicio;
        //como muevo al temp?
        while (temp != null) {
            cont++;
            temp = temp.getSiguiente();
        }
        return cont;
    }

    public void vaciarLista() {
        inicio = null;
        fin = null;
        cont = 0;
    }

    public void añadir(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        //verificar si hay nodos en la lista
        if (inicio == null) { // no hay nodos en la lista
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else { //si hay nodos en la lista
            //hay que movernos por la lista usando un nuevo temporal
            //hasta el ultimo nodo de la lista.
            //Nodo temp=inicio;
            //¿como muevo a temp?
            fin.setSiguiente(nuevoNodo);
            //nuevoNodo.set
            fin = nuevoNodo;

        }
    }
}
