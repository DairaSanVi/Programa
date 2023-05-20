package busqueda_secuencial;

import java.util.Scanner;

public class Busqueda_Secuencial {

    public static void main(String[] args) {
        
        try ( Scanner ler = new Scanner(System.in)) {
            System.out.print("Ingrese la cantidad de calificaciones: ");
            int cantidadCalificaciones = ler.nextInt();

            double[] calificaciones = new double[cantidadCalificaciones];

            for (int i = 0; i < cantidadCalificaciones; i++) {
                System.out.print("Ingrese la calificacion " + (i + 1) + ": ");
                calificaciones[i] = ler.nextDouble();
            }

            System.out.print("Ingrese la calificacion a buscar: ");
            double calificacionBuscada = ler.nextDouble();

            int posicion = buscar(calificaciones, calificacionBuscada);
            if (posicion == -1) {
                System.out.println("Calificacion no encontrada");
            } else {
                System.out.println("Calificacion encontrada en la posicion " + posicion);
            }
        }
    }

    public static int buscar(double[] arreglo, double elemento) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == elemento) {
                return i;
            }
        }
        return -1;
    }
}

     

