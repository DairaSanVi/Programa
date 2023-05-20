package numero_aleatorio;

import java.util.Random;

public class Numero_Aleatorio {

    public static void main(String[] args) {

        int[] arreglo = new int[20];
        Random rd = new Random();

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = rd.nextInt(100);
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i] + "");

        }
    }

}
