import java.util.Random;
import java.util.Scanner;
public class lista6 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero, para testar sua sorte: ");
        int sorte = scanner.nextInt();

        int min = 1;
        int max = 100;

        int numeroAleatorio = random.nextInt((max - min) + 1) + min;

        if (sorte == numeroAleatorio) {
            System.out.printf("Você acertou o numero sorteado é: %d%n" , numeroAleatorio);
            
        } else if (sorte != numeroAleatorio){
            System.out.printf("Você errou, o numero sorteado foi: %d%n" , numeroAleatorio);

        } else{
            System.out.println("Opção invalida!");
        }

        scanner.close();

    }
    
}

// %d é um placeholder que indica que um número inteiro deve ser impresso.
// Ele é necessário para exibir o valor de variáveis inteiras como int.
// Sem ele, o printf não sabe como formatar o número corretamente, o que pode causar erro ou comportamento inesperado.
// %n garante que a mensagem seja impressa em uma nova linha após o valor.
