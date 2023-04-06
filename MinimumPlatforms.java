package com.java.StandardPrograms;

public class MinimumPlatforms {
    public int getNumberOfPlatforms(int []arrival,int []departure){
        int numberOfPlatforms = 1;
        int result = 1;
        for(int i = 0; i<arrival.length; i++){
            numberOfPlatforms = 1;
            for(int j = 0; j<departure.length; j++){
                if(i!=j){
                    if(arrival[i]>=arrival[j] && departure[j]>=arrival[i]){
                        numberOfPlatforms ++;
                    }
                }
            }
            System.out.println("Platforms "+numberOfPlatforms);
            result = Math.max(result, numberOfPlatforms);
            System.out.println("result "+result);
        }
        return result;
    }

    public static void main(String[] args) {
        int []arrival = {900, 940, 950, 1100, 1500, 1800};
        int [] departure = {910, 1200, 1120, 1130, 1900, 2000} ;

        System.out.println(new MinimumPlatforms().getNumberOfPlatforms(arrival, departure));
    }
}
