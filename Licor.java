import java.util.List;

public abstract class Licor {
    protected List<Ingredientes> ingredientes;
    protected Calda calda;
    protected Alcool alcool;

    public Licor(List<Ingredientes> ingredientes, Calda calda, Alcool alcool) {
        this.ingredientes = ingredientes;
        this.calda = calda;
        this.alcool = alcool;
    }

    public abstract double calcularVolumeFinal();

    public abstract double calcularCustoTotal();
}
