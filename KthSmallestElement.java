package com.java.StandardPrograms;

public class KthSmallestElement {
    public int getElement(int [] array, int k){
        int [] sortedArray = new QuickSort().sort(array, 0, (array.length-1));
        int element = sortedArray[k-1];
        return element;
    }
    public static void main(String[] args) {
        int [] array = {7,10,4,3,20,15};
        int k = 3;
        System.out.println(new KthSmallestElement().getElement(array, k));
    }
}
