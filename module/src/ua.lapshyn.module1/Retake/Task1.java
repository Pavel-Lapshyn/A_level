package ua.lapshyn.module;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        int[] numbers = new int[50];
        arrayFillRandomNumbers(numbers);
        System.out.println(Arrays.toString(numbers));
        threeFourDigitNumbersDisplay(numbers);
    }

    public static void threeFourDigitNumbersDisplay(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 99 && numbers[i] < 10000 && isUniqueDigitNumber(numbers[i])) {
                System.out.print(numbers[i] + "\t");
            }
        }
    }

    public static boolean isUniqueDigitNumber(int number) {
        String strNumber = Integer.toString(number);
        for (int i = 0; i < strNumber.length() - 1; i++) {
            for (int j = i + 1; j < strNumber.length(); j++) {
                if (strNumber.charAt(i) == strNumber.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[] arrayFillRandomNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 20000);
        }
        return numbers;
    }
}
