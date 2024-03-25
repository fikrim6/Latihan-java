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
        scanner.close();
    }
}
