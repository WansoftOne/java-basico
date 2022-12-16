package mx.wansoft.modificadoresdeacceso;

public class Circulo {
    private double pi = 3.1416;
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return pi * (radio * radio);
    }
}
