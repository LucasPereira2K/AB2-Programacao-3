public class PrecoFinal {
    private final double precoUnitario;
    private final int quantidadeGarrafas;

    public PrecoFinal(double precoUnitario, int quantidadeGarrafas) {
        this.precoUnitario = precoUnitario;
        this.quantidadeGarrafas = quantidadeGarrafas;
    }

    public double calcularTotal() {
        return precoUnitario * quantidadeGarrafas;
    }

    public void exibirResumo() {
        System.out.println("------RESUMO FINAL------");
        System.out.printf("Preço por garrafa: R$ %.2f\n", precoUnitario);
        System.out.println("Quantidade de garrafas: " + quantidadeGarrafas);
        System.out.printf("Total arrecadado: R$ %.2f\n", calcularTotal());
    }
}
