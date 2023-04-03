package com.java.StandardPrograms;

import java.util.Arrays;

// Given a sorted array of positive integers. 
// Your task is to rearrange the array elements
//  alternatively i.e first element should be max value,
//   second should be min value, third should be second max, 
//   fourth should be second min and so on.

public class ArrangeArrayAlternatively {
    public int [] alternate(int array[]){
        int temp = 0;
        for(int i = 0; i<array.length; i++){
            if(i%2==0){
                temp = array[array.length-1];
                for (int j = (array.length - 2); j >= i; j--) {   
                    array[j+1] = array[j];
                }
                array[i] = temp;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int [] array = {10,20,30,40,50,60,70,80,90,100,110};
        System.out.println(Arrays.toString(new ArrangeArrayAlternatively().alternate(array)));
    }
}
