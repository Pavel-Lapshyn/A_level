package com.company;

import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {
	    int[][] initialArray = {{2,3,4,5},{6,7,8,9},{10,11,12,13},{14,15,16,17}};
	    arrayPrint(initialArray);
	    arrayPrint(swapRowColumn(initialArray));
    }
    public static void arrayPrint(int[][]array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
    public static int[][] swapRowColumn(int[][]array){
        int[][] copiedArray = Arrays.copyOf(array,array.length);

        for (int i = 0; i < copiedArray.length; i++) {
            for (int j = i; j < copiedArray[i].length; j++) {
                int y = copiedArray[i][j];
                copiedArray[i][j] = copiedArray[j][i];
                copiedArray[j][i] = y;
            }
        }

        return copiedArray;
    }
}
