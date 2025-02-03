public class exMath {
    public static void main(String[] args){

        double fracao1 = Math.pow(-3.0 / 4.0 , -2);
        double fracao2 = Math.pow((1.0/3.0)/4.0, 1 );
        double fracao3 = Math.pow(-3.0 / 4.0 , -1);

        double mult = fracao1 * 3;
        double mult2 = 6 * fracao2 - 4;
        double mult3 = 7 * fracao3 + 2;

        double div = (mult) + (mult2) / mult3;
        double elevado = Math.pow(div , -1);
        double resul = elevado + 4;

        System.out.println(resul);
    }
}
