package com.company;

import java.util.Arrays;

public class Task4 {

    public static void main(String[] args) {
        int[] initialArray = new int[20];
        initialArray = fillRandomNumbers(initialArray);
        System.out.println("Start array: " + Arrays.toString(initialArray));
        System.out.println("Modified array: " + Arrays.toString(evenToNull(initialArray)));
    }

    public static int[] evenToNull(int[] initialArray) {
        int[] modifiedArray = arrayCopy(initialArray);
        for (int i = 0; i < modifiedArray.length; i++) {
            modifiedArray[i] = modifiedArray[i] % 2 == 0 ? 0 : modifiedArray[i];
        }
        return modifiedArray;
    }

    public static int[] arrayCopy(int[] initialArray) {
        int[] identicalArray = Arrays.copyOf(initialArray, initialArray.length);
        return identicalArray;
    }

    public static int[] fillRandomNumbers(int[] initialArray) {
        int[] resultArray = arrayCopy(initialArray);
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = (int) (Math.random() * 100);
        }
        return resultArray;
    }
}
