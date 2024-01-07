package com.programming.basic_math_for_dsa;

import java.util.Scanner;

public class FindGcdUsingEuclideanAlgorithms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int gcd = getGcdUsingEuclideanAlgo(num1, num2);
        System.out.println("The gcd of "+num1+" & "+num2+" is : "+gcd);
    }

    private static int getGcdUsingEuclideanAlgo(int num1, int num2) {
        int low = Math.min(num1, num2);
        int max = Math.max(num1, num2);
        while (low != 0) {
            int rem = max % low;
            max = low;
            low = rem;
        }
        return max;
    }
}
