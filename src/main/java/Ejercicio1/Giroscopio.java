package Ejercicio1;

import java.time.Duration;
import java.time.LocalDate;

public class Giroscopio extends Ciclos {
    private double autonomia;

    public Giroscopio(String marca, String modelo, double autonomia, LocalDate fechaCompra) {
        super(marca, modelo, fechaCompra);
        this.autonomia = autonomia;
    }

    public double tarifaAlquiler(){
        return 3.5;
    }

    @Override
    public void alquiler(Duration tiempoAlquiler) {
        int horas = (int) tiempoAlquiler.toHours();
        double precioAlquiler = horas * tarifaAlquiler();
        System.out.println("El precio del alquiler es: " + precioAlquiler);
    }

    @Override
    public String tipoCiclo() {
        return "Ejercicio1.Giroscopio";
    }

    @Override
    public String toString() {
        return "Ejercicio1.Giroscopio: " +
                "\nAutonomia: " + autonomia +
                "\nMarca='" + marca +
                "\nModelo: " + modelo +
                "\nFecha de Compra: " + fechaCompra;
    }
}
