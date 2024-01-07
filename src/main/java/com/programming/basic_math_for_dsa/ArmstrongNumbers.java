package com.programming.basic_math_for_dsa;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean isArmstrongNumber = checkArmstrongNumber(num);
        System.out.println(num +" is an ArmstrongNumber : "+isArmstrongNumber);
    }

    public static boolean checkArmstrongNumber (int num) {
        int result = 0;
        int temp = num;
        while (temp > 0) {
            result += getComputeNumber(temp % 10);
            temp = temp / 10;
        }
        return (result == num);
    }

    public static int getComputeNumber (int digit) {
        return digit * digit * digit;
    }
}