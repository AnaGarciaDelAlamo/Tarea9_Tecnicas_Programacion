import java.time.LocalDate;

public abstract class Ciclos {
    protected String marca;
    protected String modelo;
    protected LocalDate fechaCompra;
    public Ciclos(String marca, String modelo, LocalDate fechaCompra) {
        this.marca = marca;
        this.modelo = modelo;
        this.fechaCompra = fechaCompra;
    }
}
