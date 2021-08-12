package com.company;

import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {
        int[] initialArray = new int[1000];
        initialArray = fillRandomNumbers(initialArray);
        System.out.println(Arrays.toString(initialArray));
        System.out.println("Amount of composite numbers: "+compositeNumbersCount(initialArray));
    }
    public static boolean isCompositeNumber(int number){
        for (int i = 2; i <= Math.sqrt(number) ; i++) {
            if(number % i == 0){
                return true;
            }
        }
        return false;
    }
    public static int compositeNumbersCount(int[] initialArray){
        int numberCounter = 0;
        for (int i = 0; i < initialArray.length; i++) {
            numberCounter += isCompositeNumber(initialArray[i]) ? 1 : 0;
        }
        return numberCounter;
    }

    public static int[] fillRandomNumbers(int[] initialArray) {
        int[] resultArray = arrayCopy(initialArray); //решил скопировать в новый массив, можно и без него
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = (int) (Math.random() * 100);
        }
        return resultArray;
    }

    public static int[] arrayCopy(int[] initialArray) {
        int[] identicalArray = Arrays.copyOf(initialArray, initialArray.length);
        return identicalArray;
    }
}
