package com.adepuu.exercises.session5;

import java.util.Scanner;
public class Exercise1 {
    public static void main (String[] args){
        int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan 5 nomor:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nomor " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        int largest = array[0];
        for (int i = 1; i < 5; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        System.out.println("Output: " + largest);


     // Rotation
        System.out.println("Rotasi");
        int[] array2 = {1, 2, 3, 4, 5, 6, 7};
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Jumlah rotasi: ");
        int rotasi = scanner2.nextInt();
        for (int i = 0; i < rotasi; i++) {
            int temp = array2[0];
            for (int j = 0; j < array2.length - 1; j++) {
                array2[j] = array2[j + 1];
            }
            array2[array2.length - 1] = temp;
        }
        System.out.print("Output :");
        for (int num : array2) {
            System.out.print(num + " ");
        }
        scanner.close();
        scanner2.close();
    }
}
