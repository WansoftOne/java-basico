package mx.wansoft.pilaresProgramacion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Persona {
    protected String nombre;

    // La estructura del nombre de los Getters es la siguiente:
    // get + NombrePropieda  (Importante no olvidar que debe ser camelCase)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void trabajar() {
        System.out.println("Estoy Programando");
    }
}

class Empleado extends Persona implements SerVivo{
    private String empresa = "Telcel";

    @Override
    public void respirar() {
        System.out.println("respirando");
    }

    @Override
    public void vivir() {
        System.out.println("vivir");
    }

    @Override
    public void trabajar() {
        System.out.println("Estoy trabajando en " + empresa);
    }
}



interface SerVivo {
    public abstract void respirar();
    public abstract void vivir();

    default public void metodoDefault() {
        System.out.println("hacer algo");
    }
}
