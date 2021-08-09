package com.company;
import java.util.Scanner;
public class Task4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input : ");
        int number = input.nextInt();
        String str = Integer.toString(number);
        StringBuffer reverseString = new StringBuffer(str).reverse();
        System.out.println("Output :"+ reverseString );
        input.close();
    }
}
