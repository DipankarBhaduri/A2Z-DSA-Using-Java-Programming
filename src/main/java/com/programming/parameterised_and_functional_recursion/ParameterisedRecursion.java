package com.programming.parameterised_and_functional_recursion;

public class ParameterisedRecursion {
    public static void main(String[] args) {
        int num = 10;
        int result = 0;
        doSum(num, result);
    }
    public static void doSum (int i, int num) {
        if (i < 1) {
            System.out.println("The sum of all numbers from 1 to "+num+" is : "+num);
            return;
        }

        doSum(i - 1, num + i);
    }
}
