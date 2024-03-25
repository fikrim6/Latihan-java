package com.adepuu.exercises.session5;

import java.util.Scanner;

public class Exercise9 {
    /**
     * Java Program to get the number of days you have to wait after the i-th day to get a warmer temperature
     * Example 1:
     * Input: temperatures = [73,74,75,71,69,72,76,73]
     * Output: [1,1,4,2,1,1,0,0]
     * Example 2:
     * Input: temperatures = [30,40,50,60]
     * Output: [1,1,1,0]
     * Example 3:
     * Input: temperatures = [30,60,90]
     * Output: [1,1,0]
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan total hari:");
        int n = scanner.nextInt();

        System.out.println("Masukkan suhu:");
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Hari " + (i + 1) + ": ");
            temp[i] = scanner.nextInt();
        }
        int[] waitdays = calcdays(temp);

        System.out.print("Output: ");
        for (int days : waitdays) {
            System.out.print(days + " ");
        }
    }
    public static int[] calcdays(int[] temp) {
        int[] waitdays = new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            int days = 0;
            for (int j = i + 1; j < temp.length; j++) {
                if (temp[j] > temp[i]) {
                    days = j - i;
                    break;
                }
            }
            waitdays[i] = days;
        }
        return waitdays;
    }
}