package com.java.StandardPrograms;


//Given an unsorted array A of size N that contains only
// positive integers, find a continuous sub-array that adds 
//to a given number S and return the left and 
//right index(1-based indexing) of that subarray.
public class SumOfSubArray {
    public static int[] getIndexForSubArray(int[] array,int givenSum){
        int indexArray[]={0,0};
        int sum = 0;
        for(int i = 0; i<array.length; i++){
            sum = 0;
            for(int j = i; j<array.length; j++){
                sum = sum + array[j];
                if(sum == givenSum){
                    indexArray[0] = j;
                    indexArray[1] = i;
                    System.out.println("Index are :"+i +" and "+ j);
                    return indexArray;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int A[] = {1,2,3,4,5,6,7,8,9,10};
        int S = 15;
        getIndexForSubArray(A, S);
    }
}
