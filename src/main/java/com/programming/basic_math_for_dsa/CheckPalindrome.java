package com.programming.basic_math_for_dsa;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        boolean isPalindrome = checkPalindrome(input);
        System.out.print("Is Palindrome : " +isPalindrome);
    }
    public static boolean checkPalindrome(String s) {
        int start = 0;
        int end = s.length();
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
