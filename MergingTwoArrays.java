package com.java.StandardPrograms;

import java.util.Arrays;

//Given two sorted arrays arr1[] and arr2[] of 
// sizes n and m in non-decreasing order. Merge 
// them in sorted order without using any extra 
// space. Modify arr1 so that it contains the first 
// N elements and modify arr2 so that it contains 
// the last M elements

public class MergingTwoArrays {
    public void mergeTwoSortedArrays(int []firstArray,int[] secondArray){
        for(int i = 0; i<firstArray.length; i++){
            int temp = 0;
            for(int j = 0;j<secondArray.length; j++){
                if(firstArray[i]>secondArray[j]){
                    temp = firstArray[i];
                    firstArray[i] = secondArray[j];
                    secondArray[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(firstArray));
        secondArray = new QuickSort().sort(secondArray, 0, secondArray.length-1);
        System.out.println(Arrays.toString(secondArray));
    }

    public static void main(String[] args) {
        int arr1[] = {1 ,3, 5, 7,24,56,89};
        int arr2[] = {0 ,2, 6, 8, 9,13,15,17,18};
        new MergingTwoArrays().mergeTwoSortedArrays(arr1, arr2);
    }
}
