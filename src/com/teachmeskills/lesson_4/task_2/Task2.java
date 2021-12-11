package com.teachmeskills.lesson_4.task_2;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[][] firstMatrix = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] secondMatrix = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        int m = firstMatrix.length;
        int n = secondMatrix[0].length;
        int o = secondMatrix.length;
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    result[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }
        System.out.println("Result: " + Arrays.deepToString(result));
    }
}
