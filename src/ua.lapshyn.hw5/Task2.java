package com.company;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {
        int[] initialArray = {5, 4, 3, 2, 3};
        System.out.println(Arrays.toString(initialArray));
        System.out.println("Ascending: " + nonAscending(initialArray));
    }

    public static boolean nonAscending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
