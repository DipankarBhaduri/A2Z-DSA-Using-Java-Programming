package com.programming.striversSheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _0118_PascalsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nth = scanner.nextInt();
        List<List<Integer>> pascalsTriangles = getPascalTrianglesList(nth);

        for (List list : pascalsTriangles) {
            System.out.println(list.toString());
        }
    }

    private static List<List<Integer>> getPascalTrianglesList(int nth) {
        List<List<Integer>> list = new ArrayList<>();
        if (nth == 1) {
            list.add(new ArrayList<>(Arrays.asList(1)));
            return list;
        }
        if (nth == 2) {
            list.add(new ArrayList<>(Arrays.asList(1)));
            list.add(new ArrayList<>(Arrays.asList(1,1)));
            return list;
        }
        list.add(new ArrayList<>(Arrays.asList(1)));
        list.add(new ArrayList<>(Arrays.asList(1,1)));

        for (int i = 2; i < nth; i++) {
            List<Integer> integerList = new ArrayList<>();
            List<Integer> integers = list.get(i-1);

            integerList.add(1);
            for (int j = 0; j < integers.size() - 1; j++) {
                integerList.add(integers.get(j) + integers.get(j + 1));
            }
            integerList.add(1);
            list.add(integerList);
        }
        return list;
    }
}
