package ackermann;

import java.util.Scanner;

public class Ackermann {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de m");
        int m = sc.nextInt();
        System.out.println("Ingrese el valor de n");
        int n = sc.nextInt();
        int resultado = ackerman(m, n);
        System.out.println("El resultado de Ackerman para m= " + m + " y n= " + n + " es:" + resultado);
    }

    public static int ackerman(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return ackerman(m - 1, 1);
        } else {
            return ackerman(m - 1, ackerman(m, n - 1));
        }
    }
}
