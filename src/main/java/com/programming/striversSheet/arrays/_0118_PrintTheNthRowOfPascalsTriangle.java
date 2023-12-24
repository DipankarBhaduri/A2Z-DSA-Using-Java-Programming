package com.programming.striversSheet.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _0118_PrintTheNthRowOfPascalsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nth = scanner.nextInt();

        List<Integer> nthRowsValues = getNthRowsValues(nth);
        System.out.println("The values of "+nth+"th row is : "+nthRowsValues.toString());
    }

    private static List<Integer> getNthRowsValues(int nth) {
        List<Integer> previousRow = new ArrayList<>();
        previousRow.add(1);
        if (nth == 1) return previousRow;

        previousRow.add(1);
        if (nth == 2) return previousRow;

        List<Integer> currentRow = new ArrayList<>();
        int rowNumber = 3;

        while (rowNumber <= nth) {
            currentRow = new ArrayList<>();
            currentRow.add(1);
            for (int i = 0; i < previousRow.size() - 1; i++) {
                currentRow.add(previousRow.get(i) + previousRow.get(i + 1));
            }
            currentRow.add(1);

            previousRow = currentRow;
            rowNumber ++;
        }
        return previousRow;
    }
}
