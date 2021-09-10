package ua.lapshyn.hw12;

import java.util.Optional;
import java.util.Scanner;

public class TelephoneDirectory {
    protected static String[] telephoneDirectory = new String[5];

    public static void main(String[] args) {
        telephoneDirectory[0] = "0992775567";
        telephoneDirectory[1] = "0336554325";
        telephoneDirectory[2] = "0669876451";
        telephoneDirectory[3] = "0573224557";
        telephoneDirectory[4] = "0663332122";
        System.out.print("Enter phone number: ");
        String phoneNumber = new Scanner(System.in).nextLine();
        if (findIndex(telephoneDirectory, phoneNumber).isPresent()) {
            System.out.println("Phone index: " + findIndex(telephoneDirectory, phoneNumber).get());
        } else {
            System.out.println("No matches");
        }
    }

    static Optional<Integer> findIndex(String[] telephoneDirectory, String phoneNumber) {
        for (int i = 0; i < telephoneDirectory.length; i++) {
            if (phoneNumber.equals(telephoneDirectory[i])) {
                return Optional.of(i);
            }
        }
        return Optional.empty();
    }
}