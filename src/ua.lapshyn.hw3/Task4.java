package com.company;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        int random = (int) (Math.random() * 10);
        guessTheNumber(random);
    }

    public static void guessTheNumber(int random) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your guess: ");
        int guess = in.nextInt();
        int lowerEdge = random / 2;
        int upperEdge = random * 2;
        while (guess != random) {
            if (guess > random) {
                upperEdge = guess;
            } else lowerEdge = guess;
            System.out.println("Enter your guess which is more then " + lowerEdge + " and less then " + upperEdge + ": ");
            guess = in.nextInt();
        }
        System.out.println("Congratulations, guess matched with hidden number");
    }

}
