import java.util.List;

public class LicorGourmet extends Licor {

    public LicorGourmet(List<Ingredientes> ingredientes, Calda calda, Alcool alcool) {
        super(ingredientes, calda, alcool);
    }

    @Override
    public double calcularVolumeFinal() {
        double volumeIngredientes = 0;
        for (Ingredientes ing : ingredientes) {
            if (ing.getUnidade().equalsIgnoreCase("ml") || ing.getUnidade().equalsIgnoreCase("g")) {
                volumeIngredientes += ing.getQuantidade();
            }
        }
        return volumeIngredientes + alcool.getVolumeMl();
    }

    @Override
    public double calcularCustoTotal() {
        double custoIngredientes = 0;
        for (Ingredientes ing : ingredientes) {
            custoIngredientes += ing.calcularCusto();
        }
        return custoIngredientes + calda.calcularCusto() + alcool.calcularCusto();
    }
}
