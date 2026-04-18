public class CaldaSaborizada extends Calda {
    private final int frutasUnidades;
    private final double acucarKg;
    private final double aguaLitros;
    private final double precoFrutaPorUnidade = 1.20;
    private final double precoAcucarPorKg = 4.50;
    private final double precoAguaPorLitro = 0.50;

    public CaldaSaborizada(int frutasUnidades, double acucarKg, double aguaLitros) {
        this.frutasUnidades = frutasUnidades;
        this.acucarKg = acucarKg;
        this.aguaLitros = aguaLitros;
    }

    @Override
    public double calcularCusto() {
        return (frutasUnidades * precoFrutaPorUnidade) +
               (acucarKg * precoAcucarPorKg) +
               (aguaLitros * precoAguaPorLitro);
    }

    @Override
    public String toString() {
        return "Calda Saborizada - Frutas: " + frutasUnidades + " un, Açúcar: " + acucarKg + " kg, Água: " + aguaLitros + " L";
    }
}
