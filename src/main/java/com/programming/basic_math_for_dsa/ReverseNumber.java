package com.programming.basic_math_for_dsa;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int result = reverse(num);
        System.out.println("The reversed of "+num+" is : "+result);
    }

    public static int reverse(int x) {
        int result = 0;
        while (x > 0) {
            result = result * 10 + x % 10;
            x = x /10;
        }
        return result;
    }
}
