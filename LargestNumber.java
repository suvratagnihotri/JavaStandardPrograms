package com.java.StandardPrograms;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;

//Largest Number formed from an Array

public class LargestNumber {
    public String getLargestNumber(int [] array){
        String largestNumber = "";
        Vector <String> arrayVector = new Vector<>();
        for (Integer number : array) {
            arrayVector.add(Integer.toString(number));
        }
        Collections.sort(arrayVector,new Comparator<String>(){

            @Override
            public int compare(String X, String Y) {
                String XY = X+Y;

                String YX = Y+X;

                return XY.compareTo(YX) > 0 ? -1 : 1;
            }

        });
        Iterator<String> it = arrayVector.iterator();
 
        while (it.hasNext())
            largestNumber = largestNumber + it.next();
        return largestNumber;
    }


    public static void main(String[] args) {
        int [] array = {54, 546, 548, 60};
        System.out.println(new LargestNumber().getLargestNumber(array));
    }
}
