package lista_familia;

import java.util.ArrayList;
import java.util.List;

public class Lista_Familia {
    
      private List<String> nombres;

    public Lista_Familia() {
        nombres = new ArrayList<String>();
    }

    public void agregarNombre(String nombre) {
        nombres.add(nombre);
    }

    public void imprimirNombres() {
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }
    }
    public static void main(String[] args) {

        List<String> nombre = new ArrayList<String>();

        nombre.add("Herlinda Espinosa Espejel");
        
        nombre.add("Leonor Viana Espinosa");
       
        nombre.add("Daira Sanchez Viana");

        System.out.println(nombre);
    }
}
