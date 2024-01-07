package com.programming.basic_problems_on_recursion;

public class LinearPrint1ToNUsingBackTracking {
    public static void main(String[] args) {
        int num = 24;
        print1ToN(1, num);
    }

    private static void print1ToN(int i, int num) {
        if (i == num) {
            return;
        }

        print1ToN(i+1, num);

    }
}
