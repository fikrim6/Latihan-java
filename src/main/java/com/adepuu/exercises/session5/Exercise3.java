package com.adepuu.exercises.session5;

import java.util.Scanner;

public class Exercise3 {
    /**
     * Write a Java Program to Check if Array Contain Duplicates
     *
     * Example 1:
     * Input: nums = [1,2,3,1]
     * Output: true
     *
     * Example 2:
     * Input: nums = [1,2,3,4]
     * Output: false
     *
     * Example 3:
     * Input: nums = [1,1,1,3,3,4,3,2,4,2]
     * Output: true
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Angka yang ingin dimasukkan : ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Masukkan angka:");
        for (int i = 0; i < size; i++) {
            System.out.print("Angka " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        boolean dupe = checkDuplicates(array);
        if (dupe) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        scanner.close();
    }
    public static boolean checkDuplicates(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
