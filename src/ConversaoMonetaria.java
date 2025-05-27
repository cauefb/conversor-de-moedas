import java.util.Scanner;

public class ConversaoMonetaria {
    public void conversao(){

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("*******************************************************");
            System.out.println("Seja bem-vindo/a ao Conversor de Moeda =]");
            System.out.println();
            System.out.println("1) Dólar =>> Peso argentino");
            System.out.println("2) Peso argentino =>> Dólar");
            System.out.println("3) Dólar =>> Real brasileiro");
            System.out.println("4) Real brasileiro =>> Dólar");
            System.out.println("5) Dólar =>> Peso colombiano");
            System.out.println("6) Peso colombiano =>> Dólar");
            System.out.println("7) Sair");
            System.out.println("*******************************************************");
            System.out.print("Escolha uma opção válida: ");
            int  opcao = scanner.nextInt();

            if(opcao==7) break;

            String from = "", to = "";

            switch (opcao) {
                case 1 -> { from = "USD"; to = "BRL"; }
                case 2 -> { from = "EUR"; to = "BRL"; }
                case 3 -> { from = "BRL"; to = "USD"; }
                case 4 -> { from = "BRL"; to = "EUR"; }
                case 5 -> { from = "USD"; to = "EUR"; }
                case 6 -> { from = "EUR"; to = "USD"; }
                default -> {
                    System.out.println("Opção inválida.");
                    continue;
                }
            }

            System.out.print("Digite o valor para conversão: ");
            double valor = scanner.nextDouble();

            ExchangeRateService api = new ExchangeRateService();

            double taxa = api.obterTaxaCambio(from, to);
            if (taxa == -1) {
                System.out.println("Erro ao obter taxa de câmbio.");
                continue;
            }

            double convertido = valor * taxa;
            System.out.printf("Resultado: %.2f %s = %.2f %s\n", valor, from, convertido, to);
        }

        System.out.println("Programa encerrado.");
        }
    }

