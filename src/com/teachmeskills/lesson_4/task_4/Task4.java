package com.teachmeskills.lesson_4.task_4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[][] myArray = new int[3][3];
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = (int) (0 + (Math.random() * 100));
            }
        }
        System.out.println("Your array: " + Arrays.deepToString(myArray));
        int help = myArray.length - 1;
        System.out.println("Main diagonal: ");
        for (int i = help; i >= 0; i--) {
            System.out.print(myArray[i][i] + " ");
        }
        System.out.println();
        System.out.println("Side diagonal: ");
        for (int i = help; i >= 0; i--) {
            System.out.print(myArray[i][help - i] + " ");
        }
    }
}
