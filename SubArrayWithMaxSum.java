package com.java.StandardPrograms;

import java.util.ArrayList;
import java.util.Collections;

//Given an array Arr[] of N integers. 
//Find the contiguous sub-array(containing at least one number)
// which has the maximum sum and return its sum

public class SubArrayWithMaxSum {
    public int getMaxSum(int [] array){
        int sum = 0;
        ArrayList<Integer> sumList = new ArrayList<Integer>();
        for(int i = 0; i<array.length; i++){
            sumList.add(sum+sum+array[i]);
        }
        return Collections.max(sumList);
    }

    public static void main(String[] args) {
        int array[] = {-1,-2,-3,-4};
        System.out.println(new SubArrayWithMaxSum().getMaxSum(array));
    }
}
