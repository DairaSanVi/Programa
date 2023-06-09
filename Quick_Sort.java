package quick_sort;

public class Quick_Sort {

    public static void main(String[] args) {

        int numeros[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        Quicksort(numeros, 0, numeros.length - 1);
        ImprimirVector(numeros);
    }

    public static void Quicksort(int numeros[], int izq, int der) {

        int pivote = numeros[izq];
        int i = izq;
        int j = der;
        int aux;

        while (i < j) {
            while (numeros[i] <= pivote && i < j) {
                i++;
            }

            while (numeros[j] > pivote) {
                j--;
            }

            if (i < j) {
                aux = numeros[i];
                numeros[i] = numeros[j];
                numeros[j] = aux;
            }
        }

        numeros[izq] = numeros[j];
        numeros[j] = pivote;

        if (izq < j - 1) {
            Quicksort(numeros, izq, j - 1);
        }

        if (j + 1 < der) {
            Quicksort(numeros, j + 1, der);
        }
    }

    public static void ImprimirVector(int arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }

}
