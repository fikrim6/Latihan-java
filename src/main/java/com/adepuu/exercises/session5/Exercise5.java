package com.adepuu.exercises.session5;

import java.util.Scanner;

public class Exercise5 {
    /**
     * Java Array Program to sort array in increasing & decreasing order
     * Example 1:
     * Input: [ 8, 7, 5, 2], direction = asc
     * Output: [ 2, 5, 7, 8 ]
     * Example 2:
     * Input: [ 8, 7, 5, 2], direction = desc
     * Output: [ 8,7, 5, 2 ]
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan total angka yang ingin dimasukkan:");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Masukkan angka");
        for (int i = 0; i < size; i++) {
            System.out.print("Angka " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Masukkan 'asc' or 'desc' untuk mengurutkan angka: ");
        String sortOrder = scanner.next();

        if ("asc".equals(sortOrder)) {
            int[] arrayb = asc(array);
            System.out.println("Output:");
            print(arrayb);
        } else if ("desc".equals(sortOrder)) {
            int[] sortedArray = desc(array);
            System.out.println("Output:");
            print(sortedArray);

        }
    }

    public static int[] asc(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements if they are in the wrong order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static int[] desc(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    // Swap elements if they are in the wrong order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
    public static void print(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
