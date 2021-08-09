package com.company;

public class Task2 {

    public static void main(String[] args) {
        int[] triangleCoordinate = {0,0,1,4,4,0};
        System.out.println("Triangle square: " + triangleSquare(triangleCoordinate));
    }
    public static double triangleSquare(int[] i){
        double square = 0.5*Math.abs((i[2]-i[0])*(i[5]-i[1]) - (i[4]-i[0])*(i[3]-i[1]));
        return square;
    }
}
