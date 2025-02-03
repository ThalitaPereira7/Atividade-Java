import java.util.Scanner;
public class lista1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 0 && idade <= 14) {
            System.out.println("Criança");
        } else if (idade >= 15 && idade <= 17) {
            System.out.println("Adolescente");
        } else if (idade >= 18 && idade <= 30) {
            System.out.println("Adulto jovem");
        } else if (idade > 30) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idade inválida");
        }


    }
}
