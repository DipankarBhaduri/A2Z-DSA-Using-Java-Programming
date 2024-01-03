package com.programming.solve_any_pattern_problem;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        /*
        * * * * *
        * * * * *
        * * * * *
        * * * * *
         */
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            printThePattern(n);
        }
    }

    private static void printThePattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
