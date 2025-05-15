package com.example;
import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Escribe un numero y te diré el factorial: ");
        int n = scanner.nextInt();
        factorial(n);
        System.out.println(factorial(n));
    }
    private static int factorial(int n){
        //El resultado es igual al numero que añadimos
        int resultado = n;
        //Hacemos un bucle donde i valdrá lo mismo que el resultado pero restandole 1
        for(int i=n-1; i>0; i--){
            //Constantemente actualizaremos el valor del resultado constantemente actualizando su valor actual multiplicado por i
            resultado = resultado*i;
        }
        return resultado;
    }
}