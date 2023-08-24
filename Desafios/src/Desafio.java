import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Matelson Nunes do Nascimento";
        String tipodaConta = "Corrente";
        double saldoEmConta = 1500;

        System.out.printf("""
                *************************************
                Dados iniciais do cliente:
                
                Nome:           %s%n
                Tipo de conta:  %s%n
                Saldo inicial:  %.2f%n
                *************************************
                """, nome, tipodaConta, saldoEmConta);

        String menu = """
                
                Operações:
                
                1 - Consultar saldos
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                                
                Digite a opção desejada:""";

        Scanner escolha = new Scanner(System.in);

        while (true) {
            System.out.println(menu);
            int opcaoDesejada = escolha.nextInt();

            if (opcaoDesejada == 4) {
                System.out.println("Programa encerrado! Tenha um bom dia e volte sempre.");
                break;
            } else {
                switch (opcaoDesejada) {
                    case 1 -> System.out.printf("O saldo atual é R$ %.2f%n", saldoEmConta);
                    case 2 -> {
                        System.out.println("Informe o valor a receber:");
                        double depositoEmDinheiro = escolha.nextDouble();
                        saldoEmConta += depositoEmDinheiro;
                        System.out.printf("Operação realizada! Saldo atual é de R$ %.2f%n", saldoEmConta);
                    }
                    case 3 -> {
                        System.out.println("Informe o valor que deseja transferir:");
                        double transferenciaEmDinheiro = escolha.nextDouble();
                        if (transferenciaEmDinheiro > saldoEmConta) {
                            System.out.println("Não há saldo suficiente para fazer essa transferência");
                        } else {
                            saldoEmConta -= transferenciaEmDinheiro;
                            System.out.printf("Operação realizada! Saldo atual é de R$ %.2f%n", saldoEmConta);
                        }
                    }
                    default -> System.out.println("Opção inválida!");
                }
            }
        }
    }
}