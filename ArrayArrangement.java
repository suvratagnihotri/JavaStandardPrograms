package com.java.StandardPrograms;


// Given an unsorted array of size N. Find the 
// first element in array such that all of its 
// left elements are smaller and all right elements to 
// it are greater than it.
public class ArrayArrangement {

    public int getElement(int []array, int length){
        int []leftMax = new int[length];
        leftMax[0] = Integer.MIN_VALUE;
        for(int i = 1; i<length; i++){
            leftMax[i] = Math.max(leftMax[i-1], array[i-1]);
        }

        int rightMin = Integer.MAX_VALUE;
        for(int i =length-1; i>=0; i--){
            if(leftMax[i]<array[i] && rightMin>array[i]){
                return i;
            }

            rightMin = Math.min(rightMin, array[i]);
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] array = {5, 1, 4, 3, 6, 8, 10, 7, 9};
        System.out.println(new ArrayArrangement().getElement(array, array.length));
    }
}
