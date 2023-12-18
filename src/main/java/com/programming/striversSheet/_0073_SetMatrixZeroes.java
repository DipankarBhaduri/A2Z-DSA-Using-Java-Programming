package com.programming.striversSheet;

import java.util.*;

public class _0073_SetMatrixZeroes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int [][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        setMatrixZeros(matrix);
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        if (matrix != null) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    System.out.print(matrix[i][j]+", ");
                }
                System.out.println();
            }
        }
    }

    private static void setMatrixZeros(int[][] matrix) {
        int [] xAxis = new int[matrix.length];
        int [] yAxis = new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    xAxis[i] = -1;
                    yAxis[j] = -1;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (xAxis[i] == -1 || yAxis[j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
