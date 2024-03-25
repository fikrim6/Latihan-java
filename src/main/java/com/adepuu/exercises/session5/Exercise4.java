package com.adepuu.exercises.session5;

import java.util.Scanner;

public class Exercise4 {
    /**
     * Java Array Program to Remove Duplicate Elements From an Array
     *
     * Input: [ 1, 2, 2, 3, 3, 3, 4, 5 ]
     * Output: [ 1, 2, 3, 4, 5 ]
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan total angka yang ingin dimasukkan: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Masukkan angka");
        for (int i = 0; i < size; i++) {
            System.out.print("Angka " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int[] arrayb = removeDuplicates(array);
        System.out.println("Output:");
        for (int angka : arrayb) {
            System.out.print(angka + " ");
        }
    }

    public static int[] removeDuplicates(int[] array) {
        int[] arrayb = new int[array.length];
        int uniqueCount = 0;

        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (array[i] == arrayb[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                arrayb[uniqueCount] = array[i];
                uniqueCount++;
            }
        }

        int[] arrayc = new int[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            arrayc[i] = arrayb[i];
        }
        return arrayc;

    }
}
