package eval_3_1_ordenamientos;

/**
 * @author fanny
 */
public class EVAL_3_1_Ordenamientos {

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

        System.out.println("S E L E C C T I O N   S O R T : ");
        copia(arregloDatos, arregloSel);
        imprimir(arregloSel);
        double ini = System.nanoTime();
        selectionSort(arregloSel);
        double fin = System.nanoTime();
        imprimir(arregloSel);
        System.out.println("Selection sort = " + (fin - ini));

        System.out.println("I N S E R T I O N   S O R T : ");
        copia(arregloDatos, arregloSel);
        imprimir(arregloSel);
        ini = System.nanoTime();
        selectionSort(arregloSel);
        fin = System.nanoTime();
        imprimir(arregloSel);
        System.out.println("Insertion sort = " + (fin - ini));
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

    //INSERTION SORT O(n^2)
    public static void insertionSort(int[] arreglo) {
        for (int i = 1; i < arreglo.length; i++) {
            int temp = arreglo[i]; //es el valor que vamos a ordenar
            int insP = i;
            //EN QUE PUNTO DEBE DE QUEDAR TEMP
            //ESA POSICION QUEDA ALMACENADA EN insP
            for (int prev = i - 1; prev >= 0; prev--) { //comparar
                if (arreglo[prev] > temp) {
                    //swap (intercambio parcial)
                    arreglo[insP] = arreglo[prev];
                    insP--;
                } else {
                    break;
                }
            }
            arreglo[insP] = temp;
        }
    }

    //Bubble Sort NO LO VAMOS A PROGRAMAR
//QUICKSORT
    public static void quickSort(int[] arreglo) {
        quickSortRec(arreglo, 0, arreglo.length - 1);
    }

    private static void quickSortRec(int[] arreglo, int ini, int fin) {
        int pivote, big, small, temp;
        pivote = ini;
        big = ini;
        small = fin;

        while (big < small) { //los índices se cruzaron
//MOVER LOS ÍNDICES
//buscar los elementos más grandes que el pivote
            while ((arreglo[big] <= arreglo[pivote]) && (big < small)) {
                big++;
            }

//buscar los elementos más pequeños que el pivote
            while (arreglo[big] > arreglo[pivote]) {
                small--;
            }

//verificar que no hayan cruzado los índices 
            if (big < small) {
                temp = arreglo[big];
                arreglo[big] = arreglo[small];
                arreglo[small] = temp;
            }
        }

//swap pivote con small
        temp = arreglo[pivote];
        arreglo[pivote] = arreglo[small];
        arreglo[small] = temp;
        pivote = small;

//LAMADA RECURSIVA
        quickSortRec(arreglo, ini, pivote - 1);
        quickSortRec(arreglo, pivote + 1, fin);

    }
}
