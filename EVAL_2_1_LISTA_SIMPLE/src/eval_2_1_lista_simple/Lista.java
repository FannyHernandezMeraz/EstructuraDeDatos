
package eval_2_1_lista_simple;

/**
 * @author moviles
 */
public class Lista {
    private Nodo inicio;
    private Nodo fin;
    private int cont;
    
    //por default el nodo esta vacio
    public Lista(){
        this.inicio = null; //no hay nodos en la lista
        this.fin = null;
    }
    
    public boolean listaVacia(){
        if (inicio == null) {
            return true;
        } else{
            return false;
        }
    }
    
    public void imprimir(){
        if(inicio == null){
            System.out.println("Lista vacia");
        } else{
        Nodo temp = inicio;
        //como muevo a temp?
        while(temp != null){
            System.out.print(temp.getValor() + " - ");
                temp=temp.getSiguiente();
    }
            System.out.println("");
        }
        
    }
    
    //agregar un nodo al final de la lista 
    //Solucion 1: 0(N°)
    public void add(int valor){
        Nodo nuevoNodo = new Nodo(valor);
        
        //verificar si hay nodos en la lista
        if(inicio == null){ // no hay nodos en la lista
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else{ //si hay nodos en la lista
            //hay que movernos por la lista usando un nuevo temporal
            //hasta el ultimo nodo de la lista.
            /*Nodo temp=inicio;
            //¿como muevo a temp?
            while(temp.getsiguiente() != null){
                temp=temp.getsiguiente();
                
            }
            temp.setsiguiente(nuevoNodo);*/
            fin.setSiguiente(nuevoNodo);
            fin = nuevoNodo;
    
    }
}
     public int tamaLista(){
         int cont = 0;
         Nodo temp=inicio;
        //como muevo al temp?
        while(temp != null){
            cont++;
                temp=temp.getSiguiente();
    }
        return cont;
     }
     
     public void insertarEn (int valor, int pos) throws Exception{
         // ¿que debemos validar?
         //insertar en una posicion no válida
         int cantNodos = tamaLista();
         if(pos < 0){ //posiciones negativas
             throw new Exception("No puede inserterse un nodo en una posicion negativa");
         } else if(pos >= cantNodos){ //posisiones mayores a la cantidad de elementos
             throw new Exception(pos + " no es una posicion valida de la lista");
         } else{
             Nodo nuevoNodo = new Nodo(valor);
             if(pos == 0){ // insertar al inicio de la lista
                 nuevoNodo.setSiguiente(inicio);
                 inicio = nuevoNodo;
             } else{
                   Nodo temp = inicio;
                   int cont = 0;
                   //como muevo al temp?
                   while(cont < (pos- 1)){
                       temp = temp.getSiguiente();
                       cont++;
              
                   }
                   //Y ahora??
                   nuevoNodo.setSiguiente(temp.getSiguiente());
                   temp.setSiguiente(nuevoNodo);
             }
             this.cont++;
         }
     }
     public void vaciarLista(){
         inicio = null;
         fin = null;
         
     }
     public void borrarEn(int pos) throws Exception{
         int cantNodos = tamaLista();
         
         if(pos < 0){ //posiciones negativas
             throw new Exception("No puede inserterse un nodo en una posicion negativa");
         } else if(pos >= cantNodos){ //posisiones mayores a la cantidad de elementos
             throw new Exception(pos + " no es una posicion valida de la lista");
         } else{
             //Piensen como programadores
             //QUE PODRÌA SALIR MAL SI:
             if (cantNodos == 1) {
                 vaciarLista();
             } else{
                 //borrar el primer nodo
                 //borrar nodo intermedio
                 //borrar el ùltimo nodo
                 if (pos == 0) {
                    inicio = inicio.getSiguiente();
                 } else{
                    Nodo temp = inicio;
                    int cont = 0;
                    while(cont < (pos - 1)){
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
     public int obtenValorEn(int pos) throws Exception{
        int cantNodos = tamaLista();
        int valor = 0;
        if(pos < 0){ //posiciones negativas
            throw new Exception("No puede inserterse un nodo en una posicion negativa");
        } else if(pos >= cantNodos){ //posisiones mayores a la cantidad de elementos
            throw new Exception(pos + " no es una posicion valida de la lista");
        } else {
            Nodo temp = inicio;
            int cont = 0;
            while(cont < (pos - 1)){
                temp = temp.getSiguiente();
                cont++;
            }
        valor = temp.getValor();
        }
        return valor;
     }
}
