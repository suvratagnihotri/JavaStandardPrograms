package com.java.StandardPrograms;

public class Atoi {
    public int convertToInteger(String givenString){
        try{
            int number = Integer.parseInt(givenString);
            return number;
        }
        catch( Exception e){
            System.out.println();
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Atoi().convertToInteger("12345"));
    }
}
