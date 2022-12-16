package mx.wansoft.stringclass;

public class StringClass {
    public void test() {
        String nombre;

        final String nombreConstante = "Camelia Teodora";
        // final char[] arrayConstante = new char[5];
        // arrayConstante[0] = 'C';
        // arrayConstante[0] = 'T';

        String nombre2 = "Carmen Ruiz";
        String nombreX = "Pedro Sanchez";

        System.out.println("El nombre2 tiene " + nombre2.length() + " caracteres");
        System.out.println("El caracter de la posicion 0 es: " + nombre2.charAt(0));
        char ultimoCaracter = nombre2.charAt(nombre2.length() - 1);
        System.out.println("El caracter en la ultima posicion es: " + ultimoCaracter);
        System.out.println(nombreConstante.concat(" Lopez"));

        final String tresPrimerasLetras = nombreConstante.substring(0, 3);
        System.out.println("Imprime las 3 primeras letras de nombreConstante: " + tresPrimerasLetras);

        if (nombreX.equals("Pedro Sanchez")) {
            System.out.println("Los nombres son iguales");
        }

        String[] arrayStrings = new String[]{"Ami", "Carmen", "Jere", "Juan"};
        char[] arrayChars = new char[]{'A', 'C', 'J', 'J'};
        for (int i=0; i < arrayStrings.length; i++) {
            if (arrayStrings[i].equals("Carmen")) {
                System.out.println("Penchisisisima encontrada");
            }
            if (arrayStrings[i].equals("Antonio")) {
                System.out.println("Mamadisimo encontrado");
            }
            if (arrayChars[i] == 'C') {
                System.out.println("Penchisisisima encontrada x2");
            }
        }
        System.out.println("Fin");
    } 
}
