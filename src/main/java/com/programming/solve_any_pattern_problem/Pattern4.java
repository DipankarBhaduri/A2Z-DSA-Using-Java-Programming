package com.programming.solve_any_pattern_problem;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        /*
         1
         2 2
         3 3 3
         4 4 4 4
         5 5 5 5 5
         */
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            printThePattern(n);
        }
    }

    private static void printThePattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
