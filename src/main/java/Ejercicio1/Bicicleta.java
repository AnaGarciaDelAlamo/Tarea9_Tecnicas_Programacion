package Ejercicio1;

import java.time.Duration;
import java.time.LocalDate;

public class Bicicleta extends Ciclos {
    private int numVelocidades;

    public Bicicleta(String marca, String modelo, int numVelocidades, LocalDate fechaCompra) {
        super(marca, modelo, fechaCompra);
        this.numVelocidades = numVelocidades;
    }

    public double tarifaAlquiler(){
        return 1.5;
    }

    @Override
    public void alquiler(Duration tiempoAlquiler) {
        int horas = (int) tiempoAlquiler.toHours();
        double precioAlquiler = horas * tarifaAlquiler();
        System.out.println("El precio del alquiler es: " + precioAlquiler);
    }

    @Override
    public String tipoCiclo() {
        return "Ejercicio1.Bicicleta";
    }

    @Override
    public String toString() {
        return "Ejercicio1.Bicicleta: " +
                "\nNumero de Velocidades: " + numVelocidades +
                "\nMarca: " + marca +
                "\nModelo: " + modelo +
                "\nFecha de Compra: " + fechaCompra;
    }
}
