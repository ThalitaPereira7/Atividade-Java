import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        double valor = scanner.nextDouble();

        double quadrado = Math.pow(valor, 2); //é uma função da classe Math do Java para realizar a potenciação
        double cubo = Math.pow(valor, 3);

        System.out.println("O quadrado do valor é: " + quadrado);
        System.out.println("O cubo do valor é: " + cubo);
    }
}
