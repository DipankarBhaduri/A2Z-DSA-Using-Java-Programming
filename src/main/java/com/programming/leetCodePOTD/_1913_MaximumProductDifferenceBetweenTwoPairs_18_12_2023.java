package com.programming.leetCodePOTD;

import java.util.Scanner;

public class _1913_MaximumProductDifferenceBetweenTwoPairs_18_12_2023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int [] nums = new int[length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

        int productDifference = getProductDifferenceOfMaxAndMin(nums);
        System.out.println("The Product Difference of Max Two Numbers And Min two Numbers is : "+productDifference);
    }

    private static int getProductDifferenceOfMaxAndMin(int[] nums) {
        if (nums.length == 2) {
            return 0;
        }

        int fstMax = Integer.MIN_VALUE;
        int sndMax = Integer.MIN_VALUE;
        int fstMin = Integer.MAX_VALUE;
        int sndMin = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];

            // find the max element
            if (curr >= fstMax) {
                sndMax = fstMax;
                fstMax = curr;
            }
            if (curr > sndMax && curr < fstMax) {
                sndMax = curr;
            }

            // find the min element
            if (curr <= fstMin) {
                sndMin = fstMin;
                fstMin = curr;
            }
            if (curr < sndMin && curr > fstMin) {
                sndMin = curr;
            }
        }
        return ((fstMax * sndMax) - (fstMin * sndMin));
    }
}
