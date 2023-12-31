package com.programming.solve_any_pattern_problem;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        /*
         1
         0 1
         1 0 1
         0 1 0 1
         1 0 1 0 1
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
            int flag = i % 2;
            for (int j = 1; j <= i; j++) {
                System.out.print(flag+" ");
                flag = 1 - flag;
            }
            System.out.println();
        }
    }
}
