package com.teachmeskills.lesson_4.task_1;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        String[][] myArray = new String[8][8];
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                if (i % 2 != 0) {
                    myArray[i][j] = "W";
                    if (j % 2 == 0) {
                        myArray[i][j] = "B";
                    }
                }
                if (i % 2 == 0) {
                    myArray[i][j] = "B";
                    if (j % 2 == 0) {
                        myArray[i][j] = "W";
                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(myArray));
    }
}
