package com.programming.solve_any_pattern_problem;

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        /*
        A
        AB
        ABC
        ABCD
        ABCDE
        ABCDEF
        ABCDEFG
         */
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            printThePattern(n);
        }
    }

    private static void printThePattern(int n) {
        int value = 65;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                char ch = (char) value;
                System.out.print(ch);
                value++;
            }
            value = 65;
            System.out.println();
        }
    }
}