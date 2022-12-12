package mx.wansoft;

/**
 * Hello world!
 *
 */
public class App extends Object
{
    public static void main( String[] args )
    {
        // Primitivos
        byte numeroChiquitito = 127;
        short numeroChico = 32767;
        int numero = 2147483647;
        long numeroGrande = 9223372036854775807L;

        double numeroDecimal = 4.4;
        float numeroDecimal2 = 4.4f;
        boolean boleano = true;
        char caracter = 'C';
        
        
        // Objects: Objetos
        String cadena = "Carmen";
        String[] animalitos = new String[5];
        Object objeto = new Object();
        Object objetoNull = null;

        Animalito animalito = new Animalito("Matias");

        System.out.println( "Hola mi animalito se llama " + animalito.getNombre());
        System.out.println(animalitos);
    
    }
}
