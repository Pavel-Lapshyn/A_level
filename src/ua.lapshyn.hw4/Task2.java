package com.company;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {
        int[] initialArray = new int[1000];
        initialArray = fillRandomNumbers(initialArray);
        System.out.println(Arrays.toString(initialArray));
        System.out.println("Amount of prime numbers: "+primeNumbersCount(initialArray));
    }
    public static boolean isPrimeNumber(int number){
        for (int i = 2; i <= Math.sqrt(number) ; i++) {
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
    public static int primeNumbersCount(int[] initialArray){
        int numberCounter = 0;
        for (int i = 0; i < initialArray.length; i++) {
            numberCounter += isPrimeNumber(initialArray[i]) ? 1 : 0;
        }
        return numberCounter;
    }

    public static int[] fillRandomNumbers(int[] initialArray) {
        int[] resultArray = arrayCopy(initialArray);
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
