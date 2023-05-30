package arbol;

import java.util.Scanner;

public class EjemploArbol {

    public static void main(String[] args) {
        ArbolB A = new ArbolB();
        int indice;
        int opc = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("*BIENVENIDO A ÁRBOL BINARIO ORDENADO*");
        do {
            System.out.println("MENÚ\n");
            System.out.println("1.Insertar");


    

    public void PostOrden(Nodo Nodo) {
        if (Nodo == null) {
            return;
        } else {
            PostOrden(Nodo.getRamaIz());
            PostOrden(Nodo.getRamaDer());
            System.out.print(Nodo.getElemento() + " ");
        }
    }

    public void Inorden(Nodo Nodo) {
        if (Nodo == null) {
            return;
        } else {
            Inorden(Nodo.getRamaIz());
            System.out.print(Nodo.getElemento() + " ");
            Inorden(Nodo.getRamaDer());
        }
    }

    void Busqueda(int Elem, Nodo A) {
        if ((A == null) | (A.getElemento() == Elem)) {
            System.out.print(A.getElemento() + " ");
            return;
        } else {
            if (Elem > A.getElemento()) {
                Busqueda(Elem, A.getRamaDer());
            } else {
                Busqueda(Elem, A.getRamaIz());
            }
        }
    }

    public int Altura(Nodo Nodo) {
        int Altder = (Nodo.getRamaDer() == null ? 0 : 1 + Altura(Nodo.getRamaDer()));
        int Altizq = (Nodo.getRamaIz() == null ? 0 : 1 + Altura(Nodo.getRamaDer()));
        return Math.max(Altder, Altizq);
    }
    Ejercicio a realizar Con base en el código del ejemplo, completa el código para que el usuario pueda buscar a un elemento y agrega lo
    necesario para que el usuario pueda recorrer al árbol poramplitud

    System.out.println ("2.Eliminar");
    System.out.println ("3.Recorrido en Pre orden");
    System.out.println ("4.Recorrido en In orden");
    System.out.println ("5.Recorrido en Pos orden");
    System.out.println ("6.Salir");
    System.out.println ("seleccione opción --->\n");
opc  = leer.nextInt();
    switch (opc) {
        case 1:
            System.out.println("Dame el número a insertar\n");
            int p = leer.nextInt();
            A.InsertaNodo(p);
            break;
        case 2:
            break;
        case 3:
            System.out.print("El recorrido en Preorden es: ");
            A.Preorden(A.raiz);
            System.out.println();
            break;
        case 4:
            System.out.print("El recorrido en Inorden es: ");
            A.Inorden(A.raiz);
            System.out.println();
            break;
        case 5:
            System.out.print("El recorrido en Postorden es: ");
            A.PostOrden(A.raiz);
            System.out.println();
            break;
    }

}
while(opc!=6);
} }
}
