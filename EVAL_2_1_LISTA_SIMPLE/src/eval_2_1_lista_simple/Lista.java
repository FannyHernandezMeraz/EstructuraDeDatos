
package eval_2_1_lista_simple;

/**
 * @author moviles
 */
public class Lista {
    private Nodo inicio;
    private Nodo fin;
    
    public Lista(){
        this.inicio = null; // Por default Lista esta vacia
        this.fin = null;
    }
    public void imprimir(){
        Nodo temp = inicio;
            while(temp != null){
                System.out.print(temp.getValor() + " - ");
                temp = temp.getSiguiente();
            }
        
    }
    /*
    // Metodo para llegar al final de la lista y añadir un nodo
    //Solucion 1: O(N)
    public void add(int valor){
        Nodo newNodo = new Nodo(valor);
        
        // Verificar si hay NODOS en la lista
        if (inicio == null) { // Si no hay nodos en la lista
            inicio = new Nodo();
        }else { // Si hay nodos en la lista: 1. Nos movemos al final de la lista usando un NODO TEMPORAL hasta la ultima posicion
            Nodo temp = inicio;
            while(temp.getSiguiente() != null){ // MIENTRAS temp sea direfente a null se seguira moviendo
                temp = temp.getSiguiente(); // getSiguiente = ??
            }
            temp.setSiguiente(newNodo); // setSiguiente = next
        }
    }*/
    
    // Metodo para llegar al final de la lista y añadir un nodo
    //Solucion 2: O(1)
    public void add(int valor){
        Nodo newNodo = new Nodo(valor);
        
        if (inicio == null) {
            inicio = new Nodo();
            fin = newNodo;
        }else {
            fin.setSiguiente(newNodo);
            fin = newNodo;
        }
    }
    
    public int tamaLista(){
        int cont = 0;
        
        Nodo temp = inicio;
            while(temp != null){
            cont++;
                temp = temp.getSiguiente();
            }
        return cont;
    }
    
    // Metodo para agregar nodos en una posicion específica
    public void insertarEn(int valor, int pos) throws Exception{
        int cantNodos = tamaLista();
        //Primero validamos las excepciones que debemos tomar en cuenta
            // 1. Insertar en posiciones no validas
            // 2. Posiciones negativas o mayores a la cantidad de elementos
        if (pos < 0 ) {
            throw new Exception("No puede insertarse un nodo en una posicion negativa");
        } else if (pos >= cantNodos) {
            throw new Exception(pos + " no es una posicion vlida en la Lista");
        } else {
            Nodo newNodo= new Nodo(valor);
            if (pos == 0) {
                newNodo.setSiguiente(inicio);
                inicio = newNodo;
            } else {
                Nodo temp = inicio;
                int cont = 0;
                while(cont < (pos - 1)){
                temp = temp.getSiguiente();
                cont++;
                }
                System.out.println(temp.getSiguiente() + " - ");
            }
        }
    }
    
}
