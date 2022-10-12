
package eval_2_3_lista_doble;

/**
 * @author moviles
 */
public class Nodo {
    private int valor;
    private Nodo siguiente;
    
    public Nodo(){
        this.siguiente = null; // Por default el nuevo nodo va al final de la lista, por eso "siguiente = null"
    }
    
    public Nodo(int valor){
        this.valor = valor; // Asignar el valor que da el usuario y asignarlo directamente
        this.siguiente = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
}
