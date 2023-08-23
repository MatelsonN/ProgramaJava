import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Scanner jogoDeAdivinhacao = new Scanner(System.in);
        int valorGerado = new Random().nextInt(100);
        int tentativas = 0;

        while (tentativas < 5) {
            System.out.println("Digite um número entre 0 e 100:  ");
            int numeroEscolhido = jogoDeAdivinhacao.nextInt();
            tentativas++;

            if (numeroEscolhido == valorGerado) {
                System.out.println("Parabéns, você acertou o número em %d tentativas.".formatted(tentativas));
                break;
            } else if (numeroEscolhido < valorGerado) {
                System.out.println("O número digitado é menor que o número gerado");
            } else {
                System.out.println("O número digitado é maior que o número gerado.");
            }
    }
        if (tentativas == 5) {
            System.out.println("Você não conseguiu adivinhar o número em 5 tentativas. O número era %d"
                              .formatted(valorGerado));
        }
    }
}