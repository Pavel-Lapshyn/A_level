package com.company;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String inputStr = in.nextLine();
        System.out.println("Number of words: " + wordCounter(inputStr));
    }

    public static int wordCounter(String inputStr) {
        String[] strArray = inputStr.split(" +");
        return strArray.length;
    }
}
