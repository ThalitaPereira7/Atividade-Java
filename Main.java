public class Main {

    //byte => 8 bits => -128 a 127
    //short => 16 bits => -32.768 a 32.767
    //int => 32 bits => -2...

    //float => 32 bits => precisão simples
    //double => 64 bits > precisão dupla

    //String => textos
    //char => representa um unico caractere e utilizaq ''
    //boolean => True or False

    public static void main(String[] args){

        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 10000L;
        float f = 10.5f;
        double d = 20.5;
        char c = 'A';
        String str = "Thalita";
        boolean bool = true;

        if(bool){
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }

    }

}
