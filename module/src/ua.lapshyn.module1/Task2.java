package com.company;

public class Task2 {

    public static void main(String[] args) {
        int[][] chessBoard = new int[8][8];
        System.out.println("Knight's move possibility: " + knightMovesPossibility(8, 10, 3, 1));
    }

    public static boolean knightMovesPossibility(int currentPosX, int currentPosY, int newPosX, int newPosY) {
        return ((Math.abs(currentPosX - newPosX) == 2) && (Math.abs(currentPosY - newPosY) == 1)) ||
                ((Math.abs(currentPosX - newPosX) == 1) && (Math.abs(currentPosY - newPosY) == 2));
    }
}
