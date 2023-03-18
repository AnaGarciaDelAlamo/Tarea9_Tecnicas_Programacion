package Ejercicio1;

import java.time.Duration;
import java.time.LocalDate;

public class Segway extends Ciclos {
    private double autonomia;
    private double alturaMinima;

    public Segway(String marca, String modelo, double autonomia, LocalDate fechaCompra) {
        super(marca, modelo, fechaCompra);
        this.autonomia = autonomia;
        this.alturaMinima = alturaMinima;
    }

    @Override
    public double alquiler(Duration tiempoAlquiler) {
        double precioAlquiler;
        return precioAlquiler = 18.9 * tiempoAlquiler.toHours();
    }

    public double tarifaAlquiler(){
        return 2.5;
    }

    @Override
    public String tipoCiclo() {
        return "Ejercicio1.Segway";
    }

    @Override
    public String toString() {
        return "Ejercicio1.Segway: " +
                "\nAutonomia: " + autonomia +
                "\nAlturaMinima: " + alturaMinima +
                "\nMarca: " + marca +
                "\nModelo: " + modelo +
                "\nFecha de Compra:" + fechaCompra;
    }
}
