public final class Ingredientes {
    private final String nome;
    private final double quantidade;
    private final String unidade;
    private final double precoPorUnidade;

    public Ingredientes(String nome, double quantidade, String unidade, double precoPorUnidade) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.unidade = unidade;
        this.precoPorUnidade = precoPorUnidade;
    }

    public String getNome() {
        return nome;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public String getUnidade() {
        return unidade;
    }

    public double getPrecoPorUnidade() {
        return precoPorUnidade;
    }

    public double calcularCusto() {
        return quantidade * precoPorUnidade;
    }

    @Override
    public String toString() {
        return nome + " (" + quantidade + " " + unidade + ") - R$ " + String.format("%.2f", calcularCusto());
    }
}
