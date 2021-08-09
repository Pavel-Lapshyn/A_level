package com.company;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        System.out.print("Enter string: ");
        Scanner in = new Scanner(System.in);
        String inputStr = in.nextLine();
        String modifiedStr = deleteAllSpaces(inputStr);
        System.out.println("String without spaces: " + modifiedStr);
        System.out.println("String equal backwards: " + equalBackwards(modifiedStr));
    }

    public static String deleteAllSpaces(String str) {
        str = str.replaceAll("\\s+", "");
        return str;
    }

    public static boolean equalBackwards(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) == str.charAt(str.length() - i - 1)) {
                continue;
            } else return false;
        }
        return true;
    }
}
