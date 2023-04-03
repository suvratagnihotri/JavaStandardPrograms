package com.java.StandardPrograms;

import java.util.Arrays;


//Program to sort array which contains only 0,1 and 2.
public class SortArray {
    public int[] sortArrayOfZeroOneAndTwo(int [] array){
        int low = 0;
        int high = array.length - 1;
        int mid = 0;
        int temp = 0;
        while(mid<=high){
            switch(array[mid]){
                case 0:{
                    temp = array[low];
                    array[low] = array[mid];
                    array[mid] = temp;
                    mid++;
                    low++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    temp = array[high];
                    array[high] = array[mid];
                    array[mid] = temp;
                    mid++;
                    high--;
                    break;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int [] array = {0,1,1,1,1,0,0,0,0,1,2,2,2,2,2};
        System.out.println(Arrays.toString(new SortArray().sortArrayOfZeroOneAndTwo(array)));
    }
}
