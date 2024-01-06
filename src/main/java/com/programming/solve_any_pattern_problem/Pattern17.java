package com.programming.solve_any_pattern_problem;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        /*
            A
           ABA
          ABCBA
         ABCDCBA
        ABCDEDCBA
         */
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            printThePattern(n);
        }
    }

    private static void printThePattern(int n) {
        int value = 64;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                value++;
                char ch = (char) value;
                System.out.print(ch);
            }
            value--;
            for (int j = value; j > 64; j--) {
                char ch = (char) value;
                System.out.print(ch);
                value--;
            }
            value = 64;
            System.out.println();
        }
    }
}
