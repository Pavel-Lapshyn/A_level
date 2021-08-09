package com.company;

public class Task3 {

    public static void main(String[] args) {
        float num = 6;
        if(evenIdentifier(num)) {
            System.out.println("Even");
        }
        else
            System.out.println("Odd");
    }
    public static boolean evenIdentifier(float number){
        if(number % 2 == 0){
            return true;
        }
        else return false;
    }
}
