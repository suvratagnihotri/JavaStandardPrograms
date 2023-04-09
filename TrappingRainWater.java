package com.java.StandardPrograms;


public class TrappingRainWater {
    public int getWater(int [] array){
        int waterReserve = 0;
        for(int i = 1; i<array.length-1; i++)
        {
            int left = array[i];

            for(int j = 0; j<i; j++){
                left = Math.max(left, array[j]);
            }
            int right = array[i];
            for(int j = i+1; j<array.length; j++){
                right = Math.max(right, array[j]);
            }
    
            waterReserve += Math.min(left, right) - array[i];
        }
      
        return waterReserve;
    }

    public static void main(String[] args) {
        int [] array =  {6,9,9};
        System.out.println(new TrappingRainWater().getWater(array));
    }
}
