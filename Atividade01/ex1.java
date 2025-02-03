import java.util.Scanner; // para usar o scanner (que seria o input) vc precisa exportar antes
public class ex1 {

    public static void main(String[] args) { //este é o método principal (main) do nosso programa. É aqui que a execução do programa Java começa.
        Scanner scanner = new Scanner(System.in);



        System.out.print("Digite a temperatura em Fahrenheit: "); //Pedindo para o usuário digitar a temp
        double fahrenheit = scanner.nextDouble(); // o nextDouble le uma linha com numeros decimais

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("Temperatura em Celsius: " + celsius);
    }

}
