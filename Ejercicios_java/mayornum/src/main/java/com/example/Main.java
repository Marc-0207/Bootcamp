package com.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Que longitud tiene el array?: ");
        int tamañoArray = scanner.nextInt();
        int[] array = new int[tamañoArray];

        System.out.println("Añade los numeros");
        for (int i = 0; i < tamañoArray; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("El numero mas grande del array es " + numeroGrande(array));
        scanner.close();
    }
    public static int numeroGrande(int[] array){
        int numeroGrande=array[0];
        for(int i=0;i<array.length;i++){
            if(numeroGrande<array[i]){
                numeroGrande = array[i];
            }
        }
        return numeroGrande;
    }
}