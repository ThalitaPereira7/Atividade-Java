import java.util.Scanner;
public class lista2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor unitário do produto: ");
        double valor = scanner.nextDouble();

        System.out.println("Digite a quantidade que deseja comprar deste produto: ");
        int quant = scanner.nextInt();

        if (quant <= 12){
            double doze = valor * quant ;
            System.out.printf("Resultado a pagar: %.2f%n", doze);
        } else if (quant > 12 ){
            double desconto = valor - 10;
            double compra = desconto * quant;
            System.out.printf("Resultado a pagar: %.2f%n", compra);
        }

        scanner.close();

    }
}
