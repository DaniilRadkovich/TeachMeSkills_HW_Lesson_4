package com.teachmeskills.lesson_4.task_0;

import java.util.Arrays;
import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = sc.nextInt();
        sc.close();
        int[][][] myArray = new int[3][3][3];
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                for (int k = 0; k < myArray[j].length; k++) {
                    myArray[i][j][k] = (int) (0 + (Math.random() * 100));
                }
            }
        }
        System.out.println("Your array: " + Arrays.deepToString(myArray));
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                for (int k = 0; k < myArray[j].length; k++) {
                    myArray[i][j][k] = myArray[i][j][k] + number;
                }
            }
        }
        System.out.println("Your new array: " + Arrays.deepToString(myArray));
    }
}
