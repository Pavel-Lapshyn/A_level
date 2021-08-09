package com.company;

public class Task4 {

    public static void main(String[] args) {
        float num1 = -10;
        float num2 = 8;
        float num3 = -7;
        smallestValue(num1,num2,num3);
    }
    public static void smallestValue(float num1, float num2, float num3){
        num1 = num1 < 0 ? (num1*(-1)) : num1;
        num2 = num2 < 0 ? (num2*(-1)) : num2;
        num3 = num3 < 0 ? (num3*(-1)) : num3;
        if(num1<num2 && num1<num3) {
            System.out.println("Smallest value: " + num1);
        }
        else if(num2<num1 && num2<num3) {
            System.out.println("Smallest value: " + num2);
        }
        else {
            System.out.println("Smallest value: " + num3);
        }
    }
}
