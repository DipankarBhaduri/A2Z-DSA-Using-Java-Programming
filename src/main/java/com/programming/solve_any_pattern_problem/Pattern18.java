package com.programming.solve_any_pattern_problem;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        /*
        E
        D E
        C D E
        B C D E
        A B C D E
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
            value += n - i + 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(((char) value) + " ");
                value++;
            }
            value = 64;
            System.out.println();
        }
    }
}
