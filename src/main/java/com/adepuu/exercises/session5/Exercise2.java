package com.adepuu.exercises.session5;

import java.util.Scanner;

public class Exercise2 {
    /**
     * Java Array Program For Array Rotation
     * Input: arr[] = {1, 2, 3, 4, 5, 6, 7},  d = 2
     * Output:  3 4 5 6 7 1 2
     * Explanation: d=2 so 2 elements are rotated to the end of the array. So, 1 2 is rotated back
     * So, Final result: 3, 4, 5, 6, 7, 1, 2
     */
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Jumlah rotasi: ");
        int rotasi = scanner.nextInt();
        for (int i = 0; i < rotasi; i++) {
            int temp = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = temp;
        }
        System.out.print("Output :");
        for (int num : array) {
            System.out.print(num + " ");
        }

    }
}
