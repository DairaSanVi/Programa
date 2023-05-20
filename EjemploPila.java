package Pila;

public class EjemploPila {

    public static void main(String[] args) {
        Nodo inicial = new Nodo(1, null);
        System.out.println("inicial: " + inicial.getElemento());

        Pila mipila = new Pila();
        System.out.println(mipila.toString());

        Nodo pvalor = new Nodo(3, null);

        Nodo top = mipila.push(inicial, pvalor);
        System.out.println("valor Top " + top.getElemento());
        top = mipila.push(inicial, new Nodo(78, null));
        System.out.println(" Valor Top " + top.getElemento());

        top = mipila.push(inicial, new Nodo(23, null));
        System.out.println("******");

        top = mipila.pop(inicial);
        System.out.println("***Después de borrado***");
        top = mipila.push(inicial, new Nodo(45, null));
        top = mipila.push(inicial, new Nodo(89, null));
        top = mipila.push(inicial, new Nodo(41, null));
        System.out.println(top.toString());

        System.out.println(" Valor Top " + mipila.top().toString());
    }
}