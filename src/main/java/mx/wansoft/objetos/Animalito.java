package mx.wansoft.objetos;

public class Animalito {
    private String nombre;
    byte edad;

    /**
     * Metodo Constructor
     * @param nombre
     */
    public Animalito(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Retorna el nombre el animalito
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece un nuevo nombre al Animalito
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
