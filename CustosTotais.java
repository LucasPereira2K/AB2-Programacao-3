import java.util.List;

public class CustosTotais {
    private final List<Ingredientes> ingredientes;
    private final Calda calda;
    private final Alcool alcool;
    private final PrecoGarrafas garrafa;

    public CustosTotais(List<Ingredientes> ingredientes, Calda calda, Alcool alcool, PrecoGarrafas garrafa) {
        this.ingredientes = ingredientes;
        this.calda = calda;
        this.alcool = alcool;
        this.garrafa = garrafa;
    }

    public double calcularCustoIngredientes() {
        double total = 0;
        for (Ingredientes ing : ingredientes) {
            total += ing.calcularCusto();
        }
        return total;
    }

    public double calcularCustoCalda() {
        return calda.calcularCusto();
    }

    public double calcularCustoAlcool() {
        return alcool.calcularCusto();
    }

    public double calcularCustoGarrafas(double volumeFinalMl) {
        return garrafa.calcularCustoTotal(volumeFinalMl);
    }

    public double calcularCustoTotal(double volumeFinalMl) {
        return calcularCustoIngredientes() + calcularCustoCalda() + calcularCustoAlcool() + calcularCustoGarrafas(volumeFinalMl);
    }
}
