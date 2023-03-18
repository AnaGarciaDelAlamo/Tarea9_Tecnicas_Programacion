import java.time.LocalDate;

public class Giroscopio extends Ciclos {
    private double autonomia;

    public Giroscopio(String marca, String modelo, double autonomia, LocalDate fechaCompra) {
        super(marca, modelo, fechaCompra);
        this.autonomia = autonomia;
    }
}
