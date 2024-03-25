package com.adepuu.exercises.session5;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise7 {
    /**
     * Java String Program to Check Anagram
     * Example 1:
     * Input: s = "anagram", t = "nagaram"
     * Output: true
     * Example 2:
     * Input: s = "rat", t = "car"
     * Output: false
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input 1: ");
        String str1 = scanner.nextLine();
        System.out.print("Input 2: ");
        String str2 = scanner.nextLine();

        if (checkanagram(str1, str2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static boolean checkanagram(String str1, String str2) {
        str1 = string(str1);
        str2 = string(str2);

        char[] chararray1 = str1.toCharArray();
        char[] chararray2 = str2.toCharArray();
        Arrays.sort(chararray1);
        Arrays.sort(chararray2);
        return Arrays.equals(chararray1, chararray2);
    }

    public static String string (String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (!Character.isWhitespace(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }
        return sb.toString();
    }
}
