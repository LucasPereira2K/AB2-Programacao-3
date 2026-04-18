public class CaldaNormal extends Calda {
    private final double acucarKg;
    private final double aguaLitros;
    private final double precoAcucarPorKg = 4.50;
    private final double precoAguaPorLitro = 0.50;

    public CaldaNormal(double acucarKg, double aguaLitros) {
        this.acucarKg = acucarKg;
        this.aguaLitros = aguaLitros;
    }

    @Override
    public double calcularCusto() {
        return (acucarKg * precoAcucarPorKg) + (aguaLitros * precoAguaPorLitro);
    }

    @Override
    public String toString() {
        return "Calda Normal - Açúcar: " + acucarKg + " kg, Água: " + aguaLitros + " L";
    }
}
