package com.company;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        int[][] initialArray = new int[7][8];
        initialArray = arrayIndexFill(initialArray);
        for (int i = 0; i < initialArray.length; i++) {
            for (int j = 0; j < initialArray[i].length; j++) {
                System.out.print(initialArray[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] arrayIndexFill(int[][] array) {
        int indexCounter = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 == 0) {
                    array[i][j] = array[i].length * i + j + 1;
                } else array[i][j] = (-1) * (array[i].length * i + j + 1);
            }
        }
        return array;
    }

}
