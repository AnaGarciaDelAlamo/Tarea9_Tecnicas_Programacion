import java.time.LocalDate;

public class Segway extends Ciclos {
    private double autonomia;
    private double alturaMinima;

    public Segway(String marca, String modelo, double autonomia, double alturaMinima, LocalDate fechaCompra) {
        super(marca, modelo, fechaCompra);
        this.autonomia = autonomia;
        this.alturaMinima = alturaMinima;
    }

    public double tarifaAlquiler(){
        return 2.5;
    }

    @Override
    public String toString() {
        return "Segway: " +
                "\nAutonomia: " + autonomia +
                "\nAlturaMinima: " + alturaMinima +
                "\nMarca: " + marca +
                "\nModelo: " + modelo +
                "\nFecha de Compra:" + fechaCompra;
    }
}
