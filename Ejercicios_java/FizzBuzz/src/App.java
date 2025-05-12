import java.util.Scanner;

public class App {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int numero1 = 0;
        System.out.println("Escribe un numero: ");
            numero1 = reader.nextInt();
            for (int i = 1; i <=numero1; i++){
                if(i % 3 == 0 || i% 5 == 0){
                    if(i % 3 == 0){
                     System.out.printf("Fizz ");
                    }
                    else{
                         System.out.printf("Buzz ");
                    }
                }
                else{
                    System.out.print(i + " ");
                }
            }
    }
}
