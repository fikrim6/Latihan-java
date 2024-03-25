package com.adepuu.exercises.session5;

import java.util.Scanner;

public class Exercise6 {
    /**
     * Java Array Program to Remove All Occurrences of an Element in an Array
     * Input: array = [ 1, 2, 1, 3, 5, 1 ] , key = 1
     * Output: [2, 3, 5]
     * Explanation: all the occurrences of element 1 is removed from the array So, array becomes from
     * [ 1, 2, 1, 3, 5, 1 ]  to
     * Final result: [2, 3, 5]
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

        System.out.print("Masukkan angka yang ingin dihapus:");
        int elementToRemove = scanner.nextInt();

        int[] arrayb = removeElement(array, elementToRemove);

        System.out.println("Output :");
        print(arrayb);
    }
    public static int[] removeElement(int[] array, int elementToRemove) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToRemove) {
                count++;
            }
        }

        int[] arrayb = new int[array.length - count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != elementToRemove) {
                arrayb[index++] = array[i];
            }
        }
        return arrayb;
    }

    public static void print(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
