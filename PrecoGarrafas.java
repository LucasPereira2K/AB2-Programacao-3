public class PrecoGarrafas {
    private final int capacidadeMl; 
    private final double precoUnitario;

    public PrecoGarrafas(int capacidadeMl, double precoUnitario) {
        this.capacidadeMl = capacidadeMl;
        this.precoUnitario = precoUnitario;
    }

    public int getCapacidadeMl() {
        return capacidadeMl;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public int calcularQuantidadeGarrafa(double volumeTotalMl) {
        return (int) Math.ceil(volumeTotalMl / capacidadeMl);
    }

    public double calcularCustoTotal(double volumeTotalMl) {
        return calcularQuantidadeGarrafa(volumeTotalMl) * precoUnitario;
    }

    @Override
    public String toString() {
        return "Garrafa de " + capacidadeMl + " ml - R$ " + String.format("%.2f", precoUnitario);
    }
}
