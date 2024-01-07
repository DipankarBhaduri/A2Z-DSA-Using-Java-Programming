package com.programming.basic_problems_on_recursion;

public class LinearPrint1ToN {
    public static void main(String[] args) {
        int num = 14;
        printLinear1ToN(1, num);
    }

    private static void printLinear1ToN(int i, int num) {
        if (i > num) {
            return;
        }

        System.out.println(i);
        printLinear1ToN(i+1, num);
    }
}
