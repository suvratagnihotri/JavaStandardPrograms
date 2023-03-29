package com.java.StandardPrograms;

import java.util.Arrays;

public class MissingNumber {
    public int missingNumberInArray(int [] array){
        int missingNUmber = 1;  
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        for(int i = 0; i<array.length; i++){
            if(i+1==array[i]){
                System.out.println("Number found");
            }
            else{
                return i+1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int A[] = {6,1,2,8,3,4,7,10,5};
        System.out.println(new MissingNumber().missingNumberInArray(A));
    }
}
