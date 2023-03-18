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
    public String toString() {
        return "Giroscopio: " +
                "\nAutonomia: " + autonomia +
                "\nMarca='" + marca +
                "\nModelo: " + modelo +
                "\nFecha de Compra: " + fechaCompra;
    }
}
