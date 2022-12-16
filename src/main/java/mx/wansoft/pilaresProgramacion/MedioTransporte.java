package mx.wansoft.pilaresProgramacion;

public interface MedioTransporte {
    public void acelerar();
}

class Coche implements MedioTransporte{
    int x = 10;
    int y = 5;

    @Override
    public void acelerar() {
        int velocidad = x + y;
        System.out.println("Velocidad del coche es: " + velocidad);
    }
}

class Avion implements MedioTransporte {
    int viento = 200;
    int x = 300;
    int y = 5;

    @Override
    public void acelerar() {
        int velocidad = (x + y) - viento;
        System.out.println("Velocidad del avion es: " + velocidad);       
    }
}
