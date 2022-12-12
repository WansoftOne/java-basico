package mx.wansoft;

import mx.wansoft.objetos.Objects;
import mx.wansoft.primitivos.Primitivos;

/**
 * Hello world!
 *
 */
public class App extends Object
{
    public static void main( String[] args )
    {
        Primitivos primitivos = new Primitivos();
        primitivos.test();
        
        Objects objetos = new Objects();
        objetos.test();
    }
}
