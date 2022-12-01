package eval_3_3_busqueda_binaria;

import java.util.Scanner;

/**
 * @author moviles
 */
public class EVAL_3_3_BUSQUEDA_BINARIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arregloDatos = new int[15];
        int[] arregloSel = new int[arregloDatos.length];
        System.out.println("A R R E G L O   O R I G I N A L : ");
        llenar(arregloDatos);
        imprimir(arregloDatos);

        System.out.println("\nS E L E C C T I O N   S O R T : ");
        copia(arregloDatos, arregloSel);
        selectionSort(arregloSel);
        imprimir(arregloSel);

        Scanner input = new Scanner(System.in);
        System.out.print("Introduce el valor a buscar: ");
        int buscar = input.nextInt();
        System.out.println("");
        System.out.println("El valor esta en: " + busquedaBinaria(arregloSel, buscar));
    }

    //LLENAR ARREGLO
    public static void llenar(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100);
        }
    }

    //IMPRIMIR ARREGLO
    public static void imprimir(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] < 10) {
                System.out.print("[ " + arreglo[i] + " ]");
            } else {
                System.out.print("[ " + arreglo[i] + " ]");
            }
        }
        System.out.println("");

    }

    //COPIA ARREGLO
    public static void copia(int[] arreglo, int[] copia) {
        for (int i = 0; i < arreglo.length; i++) {
            copia[i] = arreglo[i];
        }
    }

    //SELECCTION SORT O(n^)
    public static void selectionSort(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            int min = i;
            //BUSCO EL ELEMENTO (POSICION) MAS PEQUEñO
            for (int j = i + 1; j < arreglo.length; j++) {
                //buscar el mas pequeño
                if (arreglo[min] > arreglo[j]) {
                    min = j;
                }
            }
            //SWAP INTERRCAMBIAR
            if (min != i) {
                int temp = arreglo[i];
                arreglo[i] = arreglo[min];
                arreglo[min] = temp;
            }
        }
    }

    //BUSQUEDA BINARIA        //arreglo con los datos, valor a buscar
    public static int busquedaBinaria(int[] datos, int valor) {
        return busquedaBinariaRec(datos, 0, datos.length - 1, valor);
    }

    //O(log n) base 2
    private static int busquedaBinariaRec(int[] datos, int ini, int fin, int valor) {
        int mit = ini + ((fin - ini) / 2);
        int resu = -1;
        //aqui hacemos la busqueda binaria recursiva
        if (ini < fin) {
            //si el valor que buscamos esta en la mitad
            if (valor == datos[mit]) {
                resu = mit; //posicion donde esta el elemento que buscamos
            } else if (valor < datos[mit]) { //menor que la mitad, esta a la izquierda
                resu = busquedaBinariaRec(datos, ini, mit - 1, valor);
            } else { //mayor que la mitad, esta a la derecha
                resu = busquedaBinariaRec(datos, mit + 1, fin, valor);
            }
        }
        return resu;
    }

}
