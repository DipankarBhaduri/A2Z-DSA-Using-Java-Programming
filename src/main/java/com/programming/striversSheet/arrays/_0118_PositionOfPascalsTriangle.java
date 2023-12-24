package com.programming.striversSheet.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _0118_PositionOfPascalsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();

        int value = getPascalsTriangleValues(row, column);
        System.out.println("The Pascal Triangle value in "+ row+"th row and "+column+"th column is : "+value);
    }

    private static int getPascalsTriangleValues(int row, int column) {
        if (row == 1 || row == 2 || column == 1) return 1;
        List<Integer> previousList = new ArrayList<>();
        List<Integer> currentList = new ArrayList<>();

        previousList.add(1);
        previousList.add(1);

        int currentLayer = 3;
        while(currentLayer <= row) {
            currentList = new ArrayList<>();
            currentList.add(1);
            for(int i = 0; i < previousList.size() - 1; i++) {
                currentList.add(previousList.get(i) + previousList.get(i + 1));
            }
            currentList.add(1);
            if (currentLayer == row) {
                return currentList.get(column - 1);
            }
            previousList = currentList;
            currentLayer ++;
        }
        return 1;
    }
}
