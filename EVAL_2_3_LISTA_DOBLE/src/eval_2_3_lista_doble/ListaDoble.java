package eval_2_3_lista_doble;

/**
 * @author moviles
 */
public class ListaDoble {

    private Nodo inicio;
    private Nodo fin;
    private Nodo previo;
    private int cont;

    //Por default, la lista está vacía
    public ListaDoble() {
        this.inicio = null; //No hay nodos en la lista
        this.fin = null;
        this.previo = null;
        cont = 0;
    }

    public boolean listaVacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void imprimir() {
        if (listaVacia()) {
            System.out.println("LISTA VACÍA");
        } else {
            Nodo temp = inicio;
            //¿Cómo muevo a temp?
            while (temp != null) {
                System.out.print(temp.getValor() + " - ");
                temp = temp.getSiguiente();
            }
            System.out.println("");
        }
    }

    public int tamaLista() {
        return this.cont;
    }

    public void agregar(int valor) {
        Nodo nuevoNodo = new Nodo(valor);

        //Verificar si hay nodo sen la lista
        if (inicio == null) { //No hay nodos en la lista
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else { //Hay nods en la lista
            //Hay que movernos por la lista Usando un nodo temporal hasta el último nodo de la lista

            fin.setSiguiente(nuevoNodo);
            nuevoNodo.setPrevio(fin);
            fin = nuevoNodo;
        }
        cont++;
    }

    public void insertarEn(int valor, int pos) throws Exception {
        // ¿que debemos validar?
        //insertar en una posicion no válida
        int cantNodos = tamaLista();
        if (pos < 0) { //posiciones negativas
            throw new Exception("No puede inserterse un nodo en una posicion negativa");
        } else if (pos >= cantNodos) { //posisiones mayores a la cantidad de elementos
            throw new Exception(pos + " no es una posicion valida de la lista");
        } else {
            Nodo nuevoNodo = new Nodo(valor);
            if (pos == 0) { // insertar al inicio de la lista
                nuevoNodo.setSiguiente(inicio);
                inicio = nuevoNodo;
            } else {
                Nodo temp = inicio;
                int cont = 0;
                //como muevo al temp?
                while (cont < pos) {
                    temp = temp.getSiguiente();
                    cont++;

                }
                //Y ahora??
                nuevoNodo.setSiguiente(temp);
                nuevoNodo.setPrevio(temp.getPrevio());
                temp.getPrevio().setSiguiente(nuevoNodo);
                temp.setPrevio(nuevoNodo);
            }
            this.cont++;
        }
    }

    public void vaciarLista() {
        inicio = null;
        fin = null;
        this.cont = 0;
    }

    public int obtenValorEn(int pos) throws Exception {
        int cantNodos = tamaLista();
        int valor = 0;
        //¿Qué debemos validar?
        //Insertar en una posición no válida
        if (pos < 0) { //Posiciónes negativas
            throw new Exception("No puede inserarse un nodo en una posición negativa");
        } else if (pos >= cantNodos) { //Posiciones mayores a la cantidad de elementos
            throw new Exception(pos + " No es una posición válida en la lista");
        } else {
            Nodo temp = inicio;
            int cont = 0;

            while (cont < pos) {
                temp = temp.getSiguiente();
                cont++;
            }
            valor = temp.getValor();
        }
        return valor;
    }

    public void borrarEn(int pos) throws Exception {
        int cantNodos = tamaLista();

        if (pos < 0) { //posiciones negativas
            throw new Exception("No puede inserterse un nodo en una posicion negativa");
        } else if (pos >= cantNodos) { //posisiones mayores a la cantidad de elementos
            throw new Exception(pos + " no es una posicion valida de la lista");
        } else {
             //Piensen como programadores
            //QUE PODRÌA SALIR MAL SI:
            if (cantNodos == 1) {
                vaciarLista();
            } else {
                //borrar el primer nodo
                if (pos == 0) {
                    inicio = inicio.getSiguiente();
                } else { //borrar nodo intermedio
                    Nodo temp = inicio;
                    int cont = 0;
                    while (cont < pos) {
                        temp = temp.getSiguiente();
                        cont++;

                    }
                    //Ya estando en el nodo previo
                    Nodo objSig = temp.getSiguiente();
                    temp.setSiguiente(objSig.getSiguiente());
                    if (pos == (cantNodos - 1)) {
                        fin = temp;
                    }
                }
                this.cont--;
            }
        }
    }
}
