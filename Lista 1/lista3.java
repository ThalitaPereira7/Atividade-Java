import java.util.Scanner;
public class lista3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de gols feito pelo time A: ");
        int timeA = scanner.nextInt();

        System.out.println("Digite a quantidade de gols feito pelo time B: ");
        int timeB = scanner.nextInt();

        if ( timeA > timeB){
           System.out.println("Quem ganhou foi o time A!");
        } else{
            System.out.println("Quem ganhou foi o time B!");
        }

    }
    
}
