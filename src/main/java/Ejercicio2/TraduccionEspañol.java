package Ejercicio2;

public class TraduccionEspañol implements Traduccion{
    @Override
    public void introducirDistancia() {
        System.out.println("Introduzca la distancia recorrida: ");
    }

    @Override
    public void introducirTiempo() {
        System.out.println("Introduzca el tiempo de viaje: ");
    }

    @Override
    public void inicioRespuesta() {
        System.out.println("Ha viajado a una velocidad de: ");
    }

    @Override
    public void finalRespuesta(double velocidad) {
        System.out.println(velocidad + "Km/h");
    }
}
