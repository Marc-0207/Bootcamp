package com.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe una palabra y te diré si es un palíndromo: ");
        String palabra = scanner.nextLine();
        esPalindromo(palabra);
        System.out.println(esPalindromo(palabra));
        scanner.close();
    }
    public static boolean esPalindromo (String palabra){
        //Nos guardamos el numero de letras que tiene 
        int longitud = palabra.length();
        //Realizamos un bucle donde compararemos la primera letra de la palabra con la ultima, cuando algúna de las letras no coincida, nos saltará el false, si todas coinciden nos saltará al true
        for(int i=0; i<longitud; i++, longitud--){
            if(palabra.charAt(i) != palabra.charAt(longitud-1)){
                return false;
            }
        }
         return true;
    }
}