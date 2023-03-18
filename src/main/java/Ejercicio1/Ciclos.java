package Ejercicio1;

import java.time.LocalDate;

public abstract class Ciclos {
    protected String marca;
    protected String modelo;
    protected LocalDate fechaCompra;

    protected double alquiler;
    public Ciclos(String marca, String modelo, LocalDate fechaCompra) {
        this.marca = marca;
        this.modelo = modelo;
        this.fechaCompra = fechaCompra;
    }

    public abstract double tarifaAlquiler();
    public abstract String tipoCiclo();

    public int edadCiclo(){
        return LocalDate.now().getYear() - fechaCompra.getYear();
    }

    @Override
    public String toString() {
        return "Ejercicio1.Ciclos: " +
                "\nMarca: " + marca +
                "\nModelo: " + modelo +
                "\nFecha de Compra: " + fechaCompra;
    }
}
