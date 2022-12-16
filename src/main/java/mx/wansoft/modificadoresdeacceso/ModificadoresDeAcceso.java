package mx.wansoft.modificadoresdeacceso;

public class ModificadoresDeAcceso extends Object {

    String nombre = "";
    public void test() {
        Persona p = new Persona();

        // public: Puede ser accedido desde cualquier paquete del proyecto JAVA
        p.metodoPublico();
        System.out.println(p.nombrePublico);

        // default o package: Solo puede ser accedido desde cualquier otra clase que se encuentre en el mismo paquete
        p.metodoDefaultOPackage();
        System.out.println(p.nombreDefaultOPackage);

        // protected: solo puede ser accedido desde la clase que lo contiene 
        // o cualquier clase que extiende de la clase que lo contiene
        p.metodoProtegido();
        System.out.println(p.nombreProtegido);

        // private: todo lo privado solo puede ser accedido dentro de la clase que lo contiene
    }
}
