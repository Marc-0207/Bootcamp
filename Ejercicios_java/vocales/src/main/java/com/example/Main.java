package com.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe una palabra y te diré las vocales: ");
        String palabra = scanner.nextLine();
        contarVocales(palabra);
        scanner.close();
        System.out.println("Hay " + contarVocales(palabra) + " vocales");
    }
    public static int contarVocales(String palabra){
        int longitud = palabra.length();
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};
        int totalVocales =0;
        for(int i=0;i<longitud;i++){
            for(int j=0;j<vocales.length;j++){
                  if(palabra.charAt(i)==vocales[j]){
                    totalVocales ++;
                  }
            }
        }
        return totalVocales;
    }
}