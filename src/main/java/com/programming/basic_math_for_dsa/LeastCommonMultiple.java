package com.programming.basic_math_for_dsa;

import java.util.Scanner;

public class LeastCommonMultiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int lcm = getLcm(num1, num2);
        System.out.println("The LCM of "+num1+" & "+num2+" is : "+lcm);
    }

    /**
     * @Process1 : using this method you can get the lcm;
     * @param num1
     * @param num2
     * @return
     */
    private static int getLcm(int num1, int num2) {
        for (int i = Math.max(num1, num2); i < Integer.MAX_VALUE; i++) {
            boolean flag = false;
            if (i % num1 == 0 && i % num2 == 0) {
                flag = true;
            }

            if (flag) {
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }
}
