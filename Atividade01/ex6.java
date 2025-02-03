import java.util.Scanner;
public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exemplos de a, b e c
        double a = 1;
        double b = 12;
        double c = -13;

        double delta = (b * b) - (4 * a * c);

        System.out.println("Delta (Δ) é: " + delta);
    }
}
