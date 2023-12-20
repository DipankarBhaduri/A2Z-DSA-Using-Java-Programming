package com.programming.striversSheet;

import java.util.Arrays;
import java.util.Scanner;

public class _0031_NextPermutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int [] nums = new int[length];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

        int [] result = findTheNextPermutations(nums);
        System.out.println("The Next Permutation is : "+ Arrays.toString(result));
    }

    private static int[] findTheNextPermutations(int[] nums) {
        if (nums.length < 3) {
            Arrays.sort(nums);
            return nums;
        }
        // finding the break point
        int length = nums.length - 2;
        while (length >= 0) {
            if (nums[length] < nums[length + 1]) {
                break;
            }
            length --;
        }

        if (length == -1) {
            Arrays.sort(nums);
            return nums;
        }
        return performShorting(nums, length + 1);
    }

    private static int[] performShorting(int[] nums, int length) {
        for (int i = length; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }
}
