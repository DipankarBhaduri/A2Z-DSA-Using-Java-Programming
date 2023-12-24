package com.programming.striversSheet.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _0075_SortColors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int [] nums = new int [length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

        shortColors(nums);
        System.out.println("after shorting the color looks like : "+ Arrays.toString(nums));
    }

    private static void shortColors(int[] nums) {
        int zerosCount = 0;
        int oneCount = 0;
        for (int num : nums) {
            if (num == 0) zerosCount++;
            if (num == 1) oneCount++;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i < zerosCount) {
                nums[i] = 0;
            } else if (i < zerosCount + oneCount) {
                nums[i] = 1;
            } else {
                nums[i] = 2;
            }
        }
    }
}
