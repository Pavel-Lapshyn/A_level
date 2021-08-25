package com.company;

import java.time.LocalDate;
import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        int[] initialArray = {1, 2, 2, 2, 10, 12, 4, 5, 2, 4, 5, 7, 11, 22, 33};
        System.out.println(Arrays.toString(initialArray));
        System.out.println("Number of unique elements: " + uniqueElements(initialArray));
    }

    public static int uniqueElements(int[] array) {
        int uniqueCounter = 0;

        int[] copiedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(copiedArray);
        uniqueCounter = copiedArray[0] != copiedArray[1] ? uniqueCounter + 1 : uniqueCounter;
        uniqueCounter = copiedArray[copiedArray.length-1] != copiedArray[copiedArray.length-2] ? uniqueCounter + 1 : uniqueCounter;

        for (int i = 1; i < copiedArray.length-1; i++) {
                uniqueCounter = copiedArray[i] != copiedArray[i - 1] && copiedArray[i] != copiedArray[i + 1] ? uniqueCounter + 1 : uniqueCounter;
        }
        return uniqueCounter;
    }
}
