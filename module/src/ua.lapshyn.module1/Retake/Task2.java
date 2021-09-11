package ua.lapshyn.hw9;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {
        int[][] matrix = {
                {5, 4, 45, 12},
                {7, 5, 8, 85},
                {9, 12, 44, 84},
                {71, 51, 82, 83},
        };
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println("-----------------");
        for (int i = 0; i < twoDimArraySort(matrix).length; i++) {
            System.out.println(Arrays.toString(twoDimArraySort(matrix)[i]));
        }
    }
    public static int[][] twoDimArraySort(int[][] matrix){
        int[][]matrixCopy= new int[matrix.length][];
        for (int i = 0;i < matrixCopy.length; i++) {
            matrixCopy[i] = new int[matrix[i].length];
            System.arraycopy(matrix[i],0,matrixCopy[i],0,matrix[i].length);
        }


        List<Integer> list = Arrays.asList(twoDimToOneDimModifier(matrixCopy));
        List<Integer> listForSearch = Arrays.asList(twoDimToOneDimModifier(matrixCopy));
        Collections.sort(list);
        for (int i = 0; i < matrixCopy.length; i++) {
            int index = listForSearch.indexOf(list.get(list.size()-1-i));
            int buf=matrixCopy[(int)(index/matrixCopy.length)][index%(matrixCopy.length)];
            matrixCopy[(int)(index/matrixCopy.length)][index%(matrixCopy.length)]=matrixCopy[i][i];
            matrixCopy[i][i]=buf;
        }

        return matrixCopy;
    }
    public static Integer[] twoDimToOneDimModifier(int[][]matrix){
        Integer[] oneDimArray=new Integer[(int)Math.pow(matrix.length,2)];
        int oneDimIndex=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                oneDimArray[oneDimIndex]=matrix[i][j];
                oneDimIndex++;
            }
        }
        return oneDimArray;
    }
}