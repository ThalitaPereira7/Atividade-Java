import java.util.Scanner;;
public class lista4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double valorBase = 3000.00; 

        System.out.println("Onde você deseja passar suas férias? Digite: [1] MACEIÓ  ou  [2]PORTO DE GALINHAS");
        int destino = scanner.nextInt();

        System.out.println("Deseja almoço e janta incluido? Digite: [1]SIM  ou [2]NÃO");
        int incluso = scanner.nextInt();

        double valorFinal = 0.0;

        if (destino == 1 && incluso == 1) { // Maceió com refeição
            valorFinal = valorBase + (valorBase * 1.0);
            System.out.printf("Destino: Maceió com refeição. Valor total: R$%.2f%n", valorFinal);
        } else if (destino == 1 && incluso == 2) { // Maceió sem refeição
            valorFinal = valorBase + (valorBase * 0.85); 
            System.out.printf("Destino: Maceió sem refeição. Valor total: R$%.2f%n", valorFinal);
        }
       
        else if (destino == 2 && incluso == 1) { // Porto de Galinhas com refeição
            valorFinal = valorBase + (valorBase * 0.6); 
            System.out.printf("Destino: Porto de Galinhas com refeição. Valor total: R$%.2f%n", valorFinal);
        } else if (destino == 2 && incluso == 2) { // Porto de Galinhas sem refeição
            valorFinal = valorBase + (valorBase * 0.45); 
            System.out.printf("Destino: Porto de Galinhas sem refeição. Valor total: R$%.2f%n", valorFinal);
        } else {
            
            System.out.println("Opção inválida!");
        }
    }
    
}
