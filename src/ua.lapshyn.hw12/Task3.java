package ua.lapshyn.hw12;

import java.util.Scanner;


public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int num = in.nextInt();
        try {
            throwException(num);
        } catch (FirstException | SecondException | ThirdException exception) {
            exception.printStackTrace();
        }
    }

    static void throwException(int num) throws FirstException, SecondException, ThirdException {
        if (num%3==0 ) {
            throw new FirstException("Remainder of the division might not be equal to 0");
        }
        if (num%3==1 ) {
            throw new SecondException("Remainder of the division might not be equal to 1");
        } else {
            throw new ThirdException("Remainder of the division might not be equal to 2");
        }
    }
}

class FirstException extends Exception {
    public FirstException(String message) {
        super(message);
    }
}

class SecondException extends Exception {
    public SecondException(String message) {
        super(message);
    }
}

class ThirdException extends Exception {
    public ThirdException(String message) {
        super(message);
    }
}