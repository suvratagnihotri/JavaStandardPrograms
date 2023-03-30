package com.java.StandardPrograms;

import java.util.ArrayList;

public class CountingTheTriplets {
    public static int getTriplets(int [] array){
        int sum = 0;
        int totalTriplets = 0;
        ArrayList<Integer> triplets = new ArrayList<Integer>();
        for(int i = 0; i<array.length; i++){
            triplets.removeAll(triplets);
            sum = 0;
            for(int j = 0; j<array.length; j++){
                System.out.println("J element is :"+array[j]);
                System.out.println("I element is :"+array[i]);

                if(array[j]<array[i] && sum < array[i] && triplets.size()<2){
                    sum = sum + array[j];
                    triplets.add(j);
                    if(sum == array[i]){
                        totalTriplets ++;
                        for (Integer integer : triplets) {
                            System.out.println(array[integer]);
                        }
                        triplets.removeAll(triplets);
                        sum = 0;
                        j = array.length - 1;
                    }
                }
                else if(sum >array[i] || triplets.size()==2){
                    j = triplets.get(0);
                    triplets.removeAll(triplets);
                    sum = 0;
                }


            }
        }
        return totalTriplets;
    }

    public static void main(String[] args) {
        int arr[] = {1,3,4,11,12,23,101,102,203};
        System.out.println(getTriplets(arr));
    }
}
