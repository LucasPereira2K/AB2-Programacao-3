public class LucroFinal implements Precificavel {
    private final double custoTotal;

    public LucroFinal(double custoTotal) {
        this.custoTotal = custoTotal;
    }

    @Override
    public double calcularPrecoFinal(double margemLucro) {
        return custoTotal + (custoTotal * margemLucro / 100);
    }
}
