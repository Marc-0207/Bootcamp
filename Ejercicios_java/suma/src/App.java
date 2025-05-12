import java.util.Scanner;

public class App {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int numero1 = 0;
        int numero2 = 0;
            System.out.println("Escribe un numero: ");
                numero1 = reader.nextInt();
            System.out.println("Escribe otro numero: ");
                numero2 = reader.nextInt();
        int suma = numero1+numero2;
            System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);

    }
}
