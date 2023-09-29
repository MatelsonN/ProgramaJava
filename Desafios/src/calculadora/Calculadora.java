package calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        int tipoDeOperacao = 0;

        while (tipoDeOperacao != 5) {
            Scanner leitura = new Scanner(System.in);
            System.out.println("Digite o primeiro número: ");
            double numeroUm = leitura.nextDouble();
            System.out.println("Digite o segundo número: ");
            double numeroDois = leitura.nextDouble();

            String operacao = """
					Escolha o número 1 para somar;
					Escolha o número 2 para subtrair;
					Escolha o número 3 para multiplicar;
					Escolha o número 4 para dividir;
					Escolha o número 5 para sair do programa.""";
            System.out.println(operacao);
            tipoDeOperacao = leitura.nextInt();

            if (tipoDeOperacao == 5) {
                System.out.println("Fim do programa. Até a próxima!");
                break;
            }else if (tipoDeOperacao == 1) {
                System.out.println("A soma do número " + numeroUm + " + " + numeroDois + " = "
                        + (numeroUm + numeroDois));
            }else if (tipoDeOperacao == 2) {
                System.out.println("A subtração do número " + numeroUm + " - " + numeroDois + " = "
                        + (numeroUm - numeroDois));
            }else if (tipoDeOperacao == 3) {
                System.out.println("A multiplicação do número " + numeroUm + " * " + numeroDois + " = "
                        + (numeroUm * numeroDois));
            }else if (tipoDeOperacao == 4) {
                System.out.println("A divisão do número " + numeroUm + " / " + numeroDois + " = "
                + (numeroUm / numeroDois));
            }else {
                System.out.println("Opção escolhida inválida. Tente novamente!");
            }
        }
    }
}