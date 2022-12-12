package mx.wansoft.objetos;

public class Objects {
    public void test() {
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
