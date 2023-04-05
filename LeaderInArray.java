package com.java.StandardPrograms;


// Given an array A of positive integers. 
// Your task is to find the leaders in the array. 
// An element of array is leader if it is greater 
// than or equal to all the elements to its right side. 
// The rightmost element is always a leader. 

public class LeaderInArray {
    public void getLeaders(int array[]){
        int maximum = 0;
        for(int i = array.length-1; i>=0; i--){
            if(array[i]>maximum){
                System.out.println(array[i]);
                maximum = array[i];
            }
        }
    }

    public static void main(String[] args) {
        int [] array = {16,17,4,3,5,2};
        new LeaderInArray().getLeaders(array);
    }
}
