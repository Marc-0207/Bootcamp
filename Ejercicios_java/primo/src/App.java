import java.util.Scanner;

public class App {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int numero = 0;
            System.out.println("Escribe un numero te diré si es primo: ");
                numero = reader.nextInt();
            if(calculo(numero)){
                System.out.println("Este numero es primo");
            }
            else{
                System.out.println("Este numero no es primo");
            }
    }
    public static boolean calculo(int numero) {
            for (int i = 2; i <=Math.sqrt(numero); i++){
                if (numero % i == 0){
                    return false;
                }
            }
            return true;
    }
}
