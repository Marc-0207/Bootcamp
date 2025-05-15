package com.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        float num1 = scanner.nextInt();
        System.out.println("Introduce otro numero: ");
        float num2 = scanner.nextInt();
        System.out.println("Que quieres hacer con estos numeros? \n +)Sumar \n -)Restar \n *)Multiplicar \n /)Dividir ");
        String opcion = scanner.next();
        System.out.println("opcion:" +opcion);
        scanner.close();

        switch (opcion) {
            case "+":
            float suma = num1+num2;
            System.out.println("La suma de " +num1+" y de " +num2+ " da como resultado "+suma);
                break;
            case "-":
            float resta = num1-num2;
            System.out.println("La resta de " +num1+" y de " +num2+ " da como resultado "+resta);
                break;
            case "*":
            float multi = num1*num2;
            System.out.println("La multiplicación de " +num1+" y de " +num2+ " da como resultado "+multi);
                break;
            case "/":
            float divi = num1/num2;
            System.out.println("La división de " +num1+" y de " +num2+ " da como resultado "+divi);
                break;
            default:
                System.out.println("Opción invalida");
        }
    }
}