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
    public String toString() {
        return "Bicicleta: " +
                "\nNumero de Velocidades: " + numVelocidades +
                "\nMarca: " + marca +
                "\nModelo: " + modelo +
                "\nFecha de Compra: " + fechaCompra;
    }
}
