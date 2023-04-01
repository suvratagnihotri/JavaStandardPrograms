package com.java.StandardPrograms;

public class QuickSort {
    void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int[] sort(int [] array,int low,int high){

        if(low<high){
            int pivot = this.partition(array,low,high);

            sort(array,low,pivot-1);
            sort(array, pivot+1, high);
            
        }
        return array;
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low-1;
        for(int j = low; j<=high-1; j++){
            if (array[j] < pivot) {
 
                // Increment index of
                // smaller element
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return (i + 1);
    }
}
