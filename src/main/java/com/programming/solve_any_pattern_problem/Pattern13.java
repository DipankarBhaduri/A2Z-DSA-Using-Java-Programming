package com.programming.solve_any_pattern_problem;

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        /*
         1
         2 3
         4 5 6
         7 8 9 10
         11 12 13 14 15
         */
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            printThePattern(n);
        }
    }

    private static void printThePattern(int n) {
        int printValue = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(printValue++ + " ");
            }
            System.out.println();
        }
    }
}
