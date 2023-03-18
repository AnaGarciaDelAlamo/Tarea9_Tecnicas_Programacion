import java.time.LocalDate;

public class Segway extends Ciclos {
    private double autonomia;
    private double alturaMinima;

    public Segway(String marca, String modelo, double autonomia, double alturaMinima, LocalDate fechaCompra) {
        super(marca, modelo, fechaCompra);
        this.autonomia = autonomia;
        this.alturaMinima = alturaMinima;
    }
}
