package com.programming.basic_math_for_dsa;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int gcd = getGcd(num1, num2);
        System.out.println("The Greatest Common Divisor is : "+gcd);
    }

    private static int getGcd(int num1, int num2) {
        for (int i = Math.min(num1, num2); i >= 1; i--) {
            boolean flag = false;
            if (num1 % i == 0 && num2 % i ==0) {
                flag = true;
            }
            if(flag) {
                return i;
            }
        }
        return 1;
    }
}
