package com.java.StandardPrograms;

import java.util.Arrays;

// Given an array arr of distinct elements of size N, 
// the task is to rearrange the elements of the array 
// in a zig-zag fashion so that the converted array 
// should be in the below form: 
// arr[0] < arr[1]  > arr[2] < arr[3] > arr[4] < . . . . arr[n-2] < arr[n-1] > arr[n]. 

public class ZigZagArray {
    public int [] getArray(int [] array){
        Arrays.sort(array);
        int temp = 0;
        for(int i = 1; i<=array.length-2; i+=2){
            temp = array[i];
            array[i] = array[i+1];
            array[i+1] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int [] array = {4, 3, 7, 8, 6, 2, 1};
        System.out.println(Arrays.toString(new ZigZagArray().getArray(array)));
    }
}
