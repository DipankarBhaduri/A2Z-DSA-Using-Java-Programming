package com.programming.basic_problems_on_recursion;

public class PrintNames5Times {
    public static void main(String[] args) {
        String name = "Dipankar Bhaduri";
        printFunction(name, 0);
    }

    private static void printFunction(String name, int i) {
        if (i == 5) {
            return;
        }

        System.out.println(name);
        printFunction(name, i+1);
    }
}
