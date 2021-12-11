package com.teachmeskills.lesson_4.task_3;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[][] myArray = new int[2][4];
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = (int) (0 + (Math.random() * 100));
            }
        }
        System.out.println("Your array: " + Arrays.deepToString(myArray));
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                sum += myArray[i][j];
            }
        }
        System.out.println("Sum of the array values: " + sum);
    }
}
