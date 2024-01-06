package com.programming.solve_any_pattern_problem;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        /*
         1        1
         12      21
         123    321
         1234  4321
         1234554321
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
                System.out.print(j);
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
