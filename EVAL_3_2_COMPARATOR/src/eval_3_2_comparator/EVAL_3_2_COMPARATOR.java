package eval_3_2_comparator;

import java.util.Comparator;
import java.util.LinkedList;

/**
 * @author moviles
 */
public class EVAL_3_2_COMPARATOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //lista
        LinkedList<Integer> miLista = new <Integer>LinkedList();
        miLista.add((int) (Math.random() * 100));
        miLista.add((int) (Math.random() * 100));
        miLista.add((int) (Math.random() * 100));
        miLista.add((int) (Math.random() * 100));
        miLista.add((int) (Math.random() * 100));
        miLista.add((int) (Math.random() * 100));
        miLista.add((int) (Math.random() * 100));
        System.out.println(miLista);

        //ordenar --> comparator
        //Comparator es una interfas
        Comparator ordenar = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Integer val1 = (Integer) o1;
                Integer val2 = (Integer) o1;
                return val1 - val2;
            }
        };
        miLista.sort(ordenar);
        System.out.println(miLista);
                
                LinkedList<Persona> listaPersonas = new <Persona>LinkedList();
                listaPersonas.add(new Persona("Juan", "Perez", "Jolote", 50, 100.0));
                listaPersonas.add(new Persona("Pedro", "Chavez", "Jolote", 50, 100.0));
                listaPersonas.add(new Persona("Alberto", "Perez," "Jolote", 50, 100.0));
                listaPersonas.add(new Persona("Dora", "Dominguez", "Jolote", 50, 100.0));
                listaPersonas.add(new Persona("Estela", "Sanchez", "Jolote", 50, 100.0));
                listaPersonas.add(new Persona("Monica", "Molina", "Jolote", 50, 100.0));
                listaPersonas.add(new Persona("Esteban", "Antunez", "Jolote", 50, 100.0));
                //COMPARATOR: APELLIDO PATERNO
                //COMPARATOR: SALARIO
    }

    class Persona {

        private String nombre;
        private String paterno;
        private String materno;
        private int edad;
        private double salario;

        public Persona(String nombre, String paterno, String materno, int edad, double salario) {
            this.nombre = nombre;
            this.paterno = paterno;
            this.materno = materno;
            this.edad = edad;
            this.salario = salario;
        }
    }
}
