package com.company;

import java.util.Arrays;

public class Task4 {

    public static void main(String[] args) {
	    int[] initialArray = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(initialArray));
        System.out.println(Arrays.toString(removeByIndex(initialArray,3)));
    }
    public static int[] removeByIndex(int[] array, int index){
        int[] resultArray = Arrays.copyOf(array,array.length-1);
        System.arraycopy(array,index+1,resultArray,index,array.length-index-1);
        return resultArray;
    }
}
