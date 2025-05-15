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
        scanner.close();
        for(int i=0;i<tamañoArray;i++){
            System.out.println("El array invertido es ");
        }
        //Pendiente de arreglar
       // System.out.println("El array invertido es " + invertirarray(array));
    }
    public static void invertirarray(int[] array){
        int[] viejoarray = array;
        int[] nuevoarray = new int[array.length];
        for(int i=viejoarray.length-1;i>=0;i--){
            for(int j=0;j<viejoarray.length;j++){
                nuevoarray[j] = viejoarray[i];
            }
        }
    }
}