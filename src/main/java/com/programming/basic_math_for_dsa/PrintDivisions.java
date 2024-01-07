package com.programming.basic_math_for_dsa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintDivisions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        List<Integer> integerList = getAllDivision(num);
        System.out.println(num +"'s all division is : "+integerList);
    }

    private static List<Integer> getAllDivision(int num) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                integerList.add(i);
            }
        }
        integerList.add(num);
        return integerList;
    }
}
