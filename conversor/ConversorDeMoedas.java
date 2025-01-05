import java.util.Scanner;

public class ConversorDeMoedas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        double valor;

        do {
            System.out.println("=== Conversor de Moedas ===");
            System.out.println("1. Dólar para Peso Argentino");
            System.out.println("2. Peso Argentino para Dólar");
            System.out.println("3. Dólar para Real Brasileiro");
            System.out.println("4. Real Brasileiro para Dólar");
            System.out.println("5. Dólar para Peso Colombiano");
            System.out.println("6. Peso Colombiano para Dólar");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor em Dólares: ");
                    valor = scanner.nextDouble();
                    System.out.printf("%.2f Dólares equivalem a %.2f Pesos Argentinos.\n", valor, valor * 350.0);
                    break;
                case 2:
                    System.out.print("Digite o valor em Pesos Argentinos: ");
                    valor = scanner.nextDouble();
                    System.out.printf("%.2f Pesos Argentinos equivalem a %.2f Dólares.\n", valor, valor / 350.0);
                    break;
                case 3:
                    System.out.print("Digite o valor em Dólares: ");
                    valor = scanner.nextDouble();
                    System.out.printf("%.2f Dólares equivalem a %.2f Reais.\n", valor, valor * 5.0);
                    break;
                case 4:
                    System.out.print("Digite o valor em Reais: ");
                    valor = scanner.nextDouble();
                    System.out.printf("%.2f Reais equivalem a %.2f Dólares.\n", valor, valor / 5.0);
                    break;
                case 5:
                    System.out.print("Digite o valor em Dólares: ");
                    valor = scanner.nextDouble();
                    System.out.printf("%.2f Dólares equivalem a %.2f Pesos Colombianos.\n", valor, valor * 4200.0);
                    break;
                case 6:
                    System.out.print("Digite o valor em Pesos Colombianos: ");
                    valor = scanner.nextDouble();
                    System.out.printf("%.2f Pesos Colombianos equivalem a %.2f Dólares.\n", valor, valor / 4200.0);
                    break;
                case 7:
                    System.out.println("Obrigado por usar o conversor de moedas!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

            System.out.println();
        } while (opcao != 7);

        scanner.close();
    }
}
