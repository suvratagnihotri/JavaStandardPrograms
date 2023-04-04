package com.java.StandardPrograms;

// Given an array A of n positive numbers. 
// The task is to find the first Equilibrium Point in an array. 
// Equilibrium Point in an array is a position such that the sum 
// of elements before it is equal to the sum of elements after it.

public class EquilibiriumPoint {
    public int getIndex(int[] array){
        int leftHandSideSum = 0;
        int rightHandSideSum = 0;
        for(int i=0;i<array.length; i++){
            leftHandSideSum = 0;
            rightHandSideSum = 0;
            for(int j = 0; j<i; j++){
                leftHandSideSum = leftHandSideSum + array[j];
            }
            for(int k = i+1;k<array.length; k++){
                rightHandSideSum = rightHandSideSum + array[k];
            }
            if(leftHandSideSum == rightHandSideSum){
                return i+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] array = {1};
        System.out.println(new EquilibiriumPoint().getIndex(array));
    }
}
