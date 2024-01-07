package com.programming.basic_problems_on_recursion;

public class LinearPrintNto1UsingBackTracking {
    public static void main(String[] args) {
        int num = 15;
        printNTo1UsingBackTracking(1, num);
    }

    private static void printNTo1UsingBackTracking(int i, int num) {
        if (i > num) {
            return;
        }

        printNTo1UsingBackTracking(i+1, num);
        System.out.println(i);
    }
}
