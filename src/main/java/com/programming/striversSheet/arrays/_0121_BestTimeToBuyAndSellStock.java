package com.programming.striversSheet.arrays;

import java.util.Scanner;

public class _0121_BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int [] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

        int maxProfit = calculateTheMaxProfit(nums);
        System.out.println("The max profit can get from this stock is : "+maxProfit+"Rs/-");
    }

    private static int calculateTheMaxProfit(int[] nums) {
        int maxProfit = 0;
        int lowBuyingPrice = nums[0];
        for (int num : nums) {
            if (num < lowBuyingPrice) {
                lowBuyingPrice = num;
            }
            if (maxProfit < num - lowBuyingPrice){
                maxProfit = num - lowBuyingPrice;
            }
        }
        return maxProfit;
    }
}
