package com.programming.basic_problems_on_recursion;

public class LinearPrintNTo1 {
    public static void main(String[] args) {
        int num = 24;
        printNto1(num);
    }

    private static void printNto1(int num) {
        if (num == 0) {
            return;
        }

        System.out.println(num);
        printNto1(num - 1);
    }
}
