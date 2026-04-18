public class Alcool {
    private final String tipo;
    private final double volumeMl;
    private final double precoPorMl;

    public Alcool(String tipo, double volumeMl, double precoPorMl) {
        this.tipo = tipo;
        this.volumeMl = volumeMl;
        this.precoPorMl = precoPorMl;
    }

    public String getTipo() {
        return tipo;
    }

    public double getVolumeMl() {
        return volumeMl;
    }

    public double getPrecoPorMl() {
        return precoPorMl;
    }

    public double calcularCusto() {
        return volumeMl * precoPorMl;
    }

    @Override
    public String toString() {
        return tipo + " - " + volumeMl + " ml - R$ " + String.format("%.2f", calcularCusto());
    }
}
