package com.programming.basic_math_for_dsa;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean isPrime = checkPrime(num);
        System.out.println(num +" is a prime number : " +isPrime);
    }

    private static boolean checkPrime(int num) {
        int divisibleCount = 0;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                divisibleCount++;
            }
        }
        return divisibleCount == 0;
    }
}
