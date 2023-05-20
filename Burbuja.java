
package burbuja;

import java.util.Arrays;

public class Burbuja {
  
    private static void burbuja(int[] arreglo) {
        for (int j = 0; j < arreglo.length; j++) {

            for (int i = 0; i < arreglo.length - 1; i++) {
                int elementoActual = arreglo[i],
                        elementoSiguiente = arreglo[i + 1];
                if (elementoActual > elementoSiguiente) {
                    arreglo[i] = elementoSiguiente;
                    arreglo[i + 1] = elementoActual;
                }
            }
        }
    }

    private static void burbuja(String[] arreglo) {
        for (int j = 0; j < arreglo.length; j++) {

            for (int i = 0; i < arreglo.length - 1; i++) {
                String elementoActual = arreglo[i],
                        elementoSiguiente = arreglo[i + 1];
                if (elementoActual.compareTo(elementoSiguiente) > 0) {

                    arreglo[i] = elementoSiguiente;
                    arreglo[i + 1] = elementoActual;
                }
            }
        }
    }

    public static void main(String[] args) {
        int numeros[] = {2, 85, 9, 57, 36, 7, 1, 4, 63, 100, 46, 38, 22, 71};

        System.out.println("Antes : " + Arrays.toString(numeros));
        burbuja(numeros);
        System.out.println("Después : " + Arrays.toString(numeros));
    }
}
