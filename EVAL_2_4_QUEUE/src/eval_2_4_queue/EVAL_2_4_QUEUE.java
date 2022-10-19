package eval_2_4_queue;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author moviles
 */
public class EVAL_2_4_QUEUE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyQueue myQueue = new MyQueue();
        //FIFO ---> FISRT IN, FIRST OUT
        myQueue.agregar(10); //PRIMERO EN LLEGAR, ULTIMO EN SER ATENDIDO
        myQueue.agregar(20);
        myQueue.agregar(30);
        myQueue.agregar(40);
        myQueue.agregar(50); //ULTIMO EN LLEGAR, PRIMERO EN SER ATENDIDO
        
        System.out.println("Primer valor en llegar es " + myQueue.peek());
        myQueue.imprimir();
        
        try {
            System.out.println("Ultimo valor en llegar es " + myQueue.poll());
        } catch (Exception ex) {
            Logger.getLogger(EVAL_2_4_QUEUE.class.getName()).log(Level.SEVERE, null, ex);
        }
        myQueue.imprimir();
    }

}
