package com.teachmeskills.lesson_4.task_5;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[][] myArray = new int[4][4];
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = (int) (0 + (Math.random() * 100));
            }
        }
        System.out.println("Your array: " + Arrays.deepToString(myArray));
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                Arrays.sort(myArray[i]);
            }
        }
        System.out.println("Your sorted array: " + Arrays.deepToString(myArray));
    }
}
