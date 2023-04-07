package com.java.StandardPrograms;

import java.util.Arrays;

public class ReverseArray {
    public int[] reverse(int [] array,int k){
        int n = array.length -1;
        for(int i = 0; i<array.length; i+=k){
            int left = i;
            int right = Math.min(i + k - 1, n - 1);
            int temp;
            while(left<right){
                temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,2,4,6,7,9,0};
        int k = 3;
        System.out.println(Arrays.toString(new ReverseArray().reverse(array, k)));
    }
}
