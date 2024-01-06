package com.programming.solve_any_pattern_problem;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        /*
        A
        BB
        CCC
        DDDD
        EEEEE
        FFFFFF
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
            char ch = (char) value;
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
            }
            value++;
            System.out.println();
        }
    }
}
