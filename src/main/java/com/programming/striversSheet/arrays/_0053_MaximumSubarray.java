package com.programming.striversSheet.arrays;

import java.util.Scanner;

public class _0053_MaximumSubarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int [] nums = new int[length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

        int maxSum = findTheMaxSubarraySum(nums);
        System.out.println("The Maximum Subarray Sum is : "+maxSum);
    }

    private static int findTheMaxSubarraySum(int[] nums) {
        if (nums != null && nums.length > 0) {
            int maxSum = Integer.MIN_VALUE;
            int localSum = 0;
            for (int i = 0; i < nums.length; i++) {
                localSum += nums[i];
                maxSum = Math.max(maxSum, localSum);
                if (localSum < 0) localSum = 0;
            }
            return maxSum;
        }
        return 0;
    }
}
