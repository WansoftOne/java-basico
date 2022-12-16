package mx.wansoft.objetos;

import mx.wansoft.modificadoresdeacceso.Persona;

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

    public void testModificadoresAcceso() {
        Persona p = new Persona();

        // Accediendo a propiedad default o package
        // No es posible acceder a nombreProtegido debido a que su modificador de acceso es default o package
        // System.out.println(p.nombreProtegido);
    }
}
