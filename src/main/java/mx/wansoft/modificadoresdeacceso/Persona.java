package mx.wansoft.modificadoresdeacceso;

public class Persona {
    public String nombrePublico = "nombre publico";
    String nombreDefaultOPackage = "nombre default o packaage";
    protected String nombreProtegido = "nombre protected";
    private String nombrePrivado = "nombre private";

    public void metodoPublico() {
        System.out.println("Ejecutando metodo con modificador de acceso 'public'");
    }

    void metodoDefaultOPackage() {
        System.out.println("Ejecutando metodo con modificador de acceso 'Default o Package'");
    }

    protected void metodoProtegido() {
        System.out.println("Ejecutando metodo con modificador de acceso 'protected'");
    }

    private void metodoPrivado() {
        System.out.println("Ejecutando metodo con modificador de acceso 'private'");
    }    
}
