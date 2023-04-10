package com.java.StandardPrograms;

import java.util.Arrays;

public class ChocolateDistributionProblem {
    public int getMinimumDifference(int [] array,int students){
        int [] sortedArray = new QuickSort().sort(array, 0, array.length-1);
        int minimumDifference = sortedArray[sortedArray.length-1];
        System.out.println(Arrays.toString(sortedArray));
        for(int i =0; i<sortedArray.length-students; i++){
            minimumDifference = Math.min(minimumDifference, sortedArray[i-1+students    ]-sortedArray[i]);
        }
        return minimumDifference;
    }

    public static void main(String[] args) {
        int [] array = {3, 4, 1, 9, 56, 7, 9, 12};
        int m = 5;
        System.out.println(new ChocolateDistributionProblem().getMinimumDifference(array, m));
    }
}
