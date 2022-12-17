package mx.wansoft.arraysylistas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class ArrayYLista {
    public static void testArrays() {
        // Array
        int[] array;
        array = new int[2];
        System.out.println("El array contiene " + array.length + " elementos");
        array[0] = 1;
        array[1] = 2;
        System.out.println("El array contiene " + array.length + " elementos");

        int[] array2 = array;
        array[0] = 44;

        // Imprimir array en consola
        mutarArray(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));

        // Foreach en Java
        for (int elemento : array) {
            System.out.println(elemento);
        }

    }

    public static void testListas() {
        // Listas
        List<String> lista = new ArrayList<String>();
        lista.add("Carmen");
        lista.add("Ruiz");
        // Reasigna el valor 100 que antes era 1 en el indice 0
        lista.set(0, "Lopez");
        
        // Recuperar el valor almacenado en un indice de la lista
        System.out.println("Primer elementon en la lista: " + lista.get(0));

        System.out.println("La lista tiene " + lista.size() + " elementos");
        
        boolean estaBorrado = lista.remove("Lopez"); // Borrando elemento de la lista
        String elementoEliminado = lista.remove(0); // Borrando elemento por medio del indice


        System.out.println(Objects.toString(lista));

        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }

    public static void mutarArray(int[] arr) {
        int[] clon = arr.clone();
        clon[0] = 100;
    }
}
