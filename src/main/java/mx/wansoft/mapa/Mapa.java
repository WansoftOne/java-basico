package mx.wansoft.mapa;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;

public class Mapa {
    public static void test() {
        // Map<TipoKey, TipoValue>
        Map<Integer, String> mapa = new HashMap<Integer, String>();
        // Agregar key: value a mapa
        mapa.put(1, "Carmen");
        mapa.put(2, "Magda");

        // Actualuliza el valor de la key 1(no concatena)
        mapa.put(1, "Penchicarmen");

        System.out.println(Objects.toString(mapa));

        String valor = mapa.get(1);
        System.out.println("El valor almacenado en la key 1 es: " + valor);

        // Obtener las keys en el mapa
        Set<Integer> keys = mapa.keySet();
        System.out.println(Objects.toString(keys));

        for (Integer k : keys) {
            // Hacer algo
            System.out.println(k);
        }

        // Obtener unicamente los valores dentro de nuestro mapa
        Collection<String> values = mapa.values();
        System.out.println(Objects.toString(values));
        for (String v : values) {
            // Hacer algo
            System.out.println(v);
        }


        for (Entry<Integer, String> entry : mapa.entrySet()) {
            System.out.println("Elemento en mapa... key: " +  entry.getKey() + " value: " +  entry.getValue());
        }


        boolean contiene4 = mapa.containsKey(4);
        mapa.containsValue("values");
        String valor4 = mapa.get(4);
        System.out.println("contine4: " + contiene4 + " valor4: " + valor4);
    }
}

// public class Persona {
//     static int promedioEdadDeVida = 85; // Propiedad de la Clase Persona
//     String nombre; // Propiedad de la instancia
// }

// Metodo de la instancia
// Mapa m = new Mapa() -> Esta linea crea(intancia) un objeto
// m.test();

// Mapa.test() -> Invoca metodo statico de la clase Mapa
