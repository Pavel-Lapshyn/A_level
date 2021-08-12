package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        int[] initialArray = new int[400];
        int[] filledArray = fillRandomNumbers(initialArray);
        System.out.println("Array: " + Arrays.toString(filledArray));
        System.out.println("Arithmetic mean: " + arithmeticMean(filledArray));
        System.out.println("Geometric mean: " + geometricMean(filledArray));
    }

    public static int[] arrayCopy(int[] initialArray) {
        int[] identicalArray = Arrays.copyOf(initialArray, initialArray.length);
        return identicalArray;
    }

    public static int[] fillRandomNumbers(int[] initialArray) {
        int[] resultArray = arrayCopy(initialArray);
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = (int) (1 + Math.random() * 10);
        }
        return resultArray;
    }

    public static double arithmeticMean(int[] initialArray) {
        double ariResult = 0;
        for (int i = 0; i < initialArray.length; i++) {
            ariResult += initialArray[i];
        }
        ariResult /= initialArray.length;
        return ariResult;
    }

    public static double geometricMean(int[] initialArray) {
        double geoResult = 1;
        for (int i = 0; i < initialArray.length; i++) {
            geoResult *= initialArray[i];
        }
        geoResult = Math.pow(geoResult, 1.0 / (double) initialArray.length);
        return geoResult;
    }
}
