package com.java.StandardPrograms;

//Inversion Count: For an array, 
// inversion count indicates how far 
// (or close) the array is from being sorted. 
// If array is already sorted then the inversion count is 0.
//  If an array is sorted in the reverse order then the inversion 
//  count is the maximum. Formally, two elements a[i] and a[j] form an inversion 
//  if a[i] > a[j] and i < j.
public class InversionCount {
    public int getInversionCountOfArray(int [] array){
        int inversionCount = 0;
        for(int i = 0; i<array.length; i++){
            for(int j =i; j<array.length; j++){
                if(array[i]>array[j]){
                    inversionCount++;
                }
            }
        }
        return inversionCount;
    }

    public static void main(String[] args) {
        int []array = {10, 10, 10};
        System.out.println(new InversionCount().getInversionCountOfArray(array));
    }
}
