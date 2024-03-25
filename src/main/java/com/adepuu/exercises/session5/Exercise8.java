package com.adepuu.exercises.session5;

import java.util.Scanner;

public class Exercise8 {
    /**
     * Java String Program to Find all Duplicates on Array
     * Example 1:
     * Input: nums = [4,3,2,7,8,2,3,1]
     * Output: [2,3]
     * Example 2:
     * Input: nums = [1,1,2]
     * Output: [1]
     * Example 3:
     * Input: nums = [1]
     * Output: []
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

        boolean ifdupe = print (array);
        if (!ifdupe) {
            System.out.println("No dupe");
        }
    }
    public static boolean print (int[] array) {
        boolean ifdupe = false;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    if (!ifdupe) {
                        System.out.println("Output:");
                    }
                    ifdupe = true;
                    System.out.print(array[i] + " ");
                    break;
                }
            }
        }
        return ifdupe;
    }
}
