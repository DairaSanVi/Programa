
package par_impar;

import java.util.Scanner;

public class Par_Impar {

    public static void main(String[] args) {

         int sumaPares = 0;
    int sumaImpares = 0;
    Scanner numeros = new Scanner(System.in);
    for (int i = 0; i < 10; i++) {
        System.out.printf("Ingresa un número ", i + 1);
        int numero = numeros.nextInt();
        if (numero % 2 == 0) {
            sumaPares += numero;
        } else {
            sumaImpares += numero;
        }
    }
    numeros.close();
    System.out.printf("Resultado: T Pares: %d; T Impares: %d", sumaPares, sumaImpares);
}
    }



