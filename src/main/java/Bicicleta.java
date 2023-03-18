import java.time.LocalDate;

public class Bicicleta extends Ciclos {
    private int numVelocidades;

    public Bicicleta(String marca, String modelo, int numVelocidades, LocalDate fechaCompra) {
        super(marca, modelo, fechaCompra);
        this.numVelocidades = numVelocidades;
    }
}
