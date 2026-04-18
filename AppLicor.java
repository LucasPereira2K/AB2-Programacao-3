import java.util.*;

public class AppLicor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Ingredientes> ingredientes = new ArrayList<>();

        System.out.println("Quantidade de ingredientes:");
        int qtd = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < qtd; i++) {
            System.out.println("Ingrediente " + (i + 1));
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Unidade (ml/g/unidade): ");
            String unidade = scanner.nextLine();

            System.out.print("Quantidade: ");
            int quantidade = Integer.parseInt(scanner.nextLine());

            System.out.print("Preço por " + unidade + ": ");
            double preco = Double.parseDouble(scanner.nextLine().replace(",", "."));

            ingredientes.add(new Ingredientes(nome, quantidade, unidade, preco));
        }

        System.out.print("Tipo de calda (Normal/Saborizada): ");
        String tipoCalda = scanner.nextLine();
        Calda calda;

        if (tipoCalda.equalsIgnoreCase("Saborizada")) {
            System.out.print("Quantidade de frutas (un): ");
            int frutas = Integer.parseInt(scanner.nextLine());

            System.out.print("Açúcar (kg): ");
            double acucar = Double.parseDouble(scanner.nextLine().replace(",", "."));

            System.out.print("Água (litros): ");
            double agua = Double.parseDouble(scanner.nextLine().replace(",", "."));
            
            calda = new CaldaSaborizada(frutas, acucar, agua);
        } else {
            System.out.print("Açúcar (kg): ");
            double acucar = Double.parseDouble(scanner.nextLine().replace(",", "."));

            System.out.print("Água (litros): ");
            double agua = Double.parseDouble(scanner.nextLine().replace(",", "."));
            
            calda = new CaldaNormal(acucar, agua);
        }

        System.out.print("Tipo de álcool: ");
        String tipoAlcool = scanner.nextLine();

        System.out.print("Volume (ml): ");
        double volumeAlcool = Double.parseDouble(scanner.nextLine().replace(",", "."));

        System.out.print("Preço por ml: ");
        double precoAlcool = Double.parseDouble(scanner.nextLine().replace(",", "."));
        
        Alcool alcool = new Alcool(tipoAlcool, volumeAlcool, precoAlcool);

        System.out.print("Capacidade da garrafa (ml): ");
        int capacidade = Integer.parseInt(scanner.nextLine());

        System.out.print("Preço da garrafa: ");
        double precoGarrafa = Double.parseDouble(scanner.nextLine().replace(",", "."));
        scanner.nextLine();

        PrecoGarrafas garrafa = new PrecoGarrafas(capacidade, precoGarrafa);

        System.out.print("Tipo de licor (Tradicional/Gourmet): ");
        String tipoLicor = scanner.nextLine();
        Licor licor;

        if (tipoLicor.equalsIgnoreCase("Gourmet")) {
            licor = new LicorGourmet(ingredientes, calda, alcool);
        } else {
            licor = new LicorTradicional(ingredientes, calda, alcool);
        }

        double volumeFinal = licor.calcularVolumeFinal();
        CustosTotais custos = new CustosTotais(ingredientes, calda, alcool, garrafa);
        double custoTotal = custos.calcularCustoTotal(volumeFinal);
        int qtdGarrafas = garrafa.calcularQuantidadeGarrafa(volumeFinal);

        System.out.print("Margem de lucro (%): ");
        double margem = scanner.nextDouble();
        LucroFinal lucro = new LucroFinal(custoTotal);
        double precoUnitario = lucro.calcularPrecoFinal(margem) / qtdGarrafas;

        PrecoFinal precoFinal = new PrecoFinal(precoUnitario, qtdGarrafas);
        precoFinal.exibirResumo();

        scanner.close();
    }
}
