package com.programming.parameterised_and_functional_recursion;

public class FunctionalRecursion {
    public static void main(String[] args) {
        int num = 10;
        int sum = getSumUsingRecursion(num);
        System.out.println("The sum of 1 to "+num+" is : "+sum);
    }

    private static int getSumUsingRecursion(int num) {
        if (num < 1) {
            return 0;
        }

        return num + getSumUsingRecursion(num - 1);
    }
}
