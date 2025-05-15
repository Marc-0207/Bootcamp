package com.example;
import java.util.Arrays;
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
        ordenarArray(array);
    }

    public static void ordenarArray(int[] array){
        int longitud = array.length;
        int almacen = 0;
        for(int j=0;j<longitud;j++){
            for(int i=1;i<longitud;i++){
                if(array[i-1]>array[i]){
                    almacen = array[i];
                    array[i] = array[i-1];
                    array[i-1] = almacen;
                }
            }
        }

        System.out.println("El array ordenado es: " + Arrays.toString(array));
    }

}