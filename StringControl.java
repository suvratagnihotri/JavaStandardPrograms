package com.java.StandardPrograms;

import java.util.Arrays;
import java.util.Comparator;

public class StringControl {
    
    public String reverseString(String givenString ){
        String [] array = givenString.split("[.]");
        String temp = "";
        for(int i =0; i<array.length/2; i++){
            temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        String reverseString = "";
        reverseString = String.join(".", array);
        // for (String string : array) {
        //     reverseString = reverseString+string;
        // }
        return reverseString;
    }



//Given two strings a and b. The task is to find 
// if the string 'b' can be obtained by rotating another 
// string 'a' by exactly 2 places.
    public String getLongestPalindromeSubString(String string){
        for(int i = 0; i<string.length(); i++){
            String subString = string.substring(i, string.length());
            String reverseSubString = "";
            for(int j = string.length()-1; j>=i; j--){
                reverseSubString = reverseSubString + string.charAt(j);
            }

            if(reverseSubString.equals(subString)){
                return subString;
            }
        }
        System.out.println(string);
        return String.valueOf(string.charAt(0));
    }

    public String recursivelyRemoveDuplicateCharacters(String givenString){
        System.out.println("Givn string is :"+ givenString);
        String newString = givenString;
        for(int i = 0; i<givenString.length()-1; i++){
            if(givenString.charAt(i)==givenString.charAt(i+1)){
                newString = givenString.replaceFirst(String.valueOf(givenString.charAt(i)), "");
                newString = newString.replaceFirst(String.valueOf(givenString.charAt(i+1)), "");
                System.out.println(newString);
                recursivelyRemoveDuplicateCharacters(newString);
                break;
            }
        }
        return newString;
    }

    public boolean isRotated(String string1, String string2){
        if(string1.length()!=string2.length()){
            return false;
        }
        if(string1.length()<1){
            return string1.equals(string2);
        }

        int length = string2.length();

        String antiClockWiseRotation = "";
        String clockWiseRotation = "";

        antiClockWiseRotation = antiClockWiseRotation + 
                                string2.substring(length-2, length) +
                                string2.substring(0,length-2);

        clockWiseRotation = clockWiseRotation +
                            string2.substring(2) +
                            string2.substring(0,2);

        return (clockWiseRotation.equals(string1) || antiClockWiseRotation.equals(string1));
    }

    public Double romanNumberToIntegers(String romanNumbers){
        for(int i = romanNumbers.length()-1; i<=0; i--){
            Double number = (double) 0;
            switch (romanNumbers.charAt(i)) {
                case 'I':
                    number = number + (double) 1;
                    break;
                case 'V':
                    break;
                case 'X':
                    break;
                case 'L':
                    break;
                case 'C':
                    break;
                case 'D':
                    break;
                case 'M':
                    break;
            }
        }
        return null;
    }

    public String longestCommonPrefix(String [] stringArray){
        Arrays.sort(stringArray,Comparator.comparingInt(String::length));
        String smallestString = stringArray[0];
        String subString = "-1";
        
        for(int i=0; i<smallestString.length(); i++){
            subString = smallestString.substring(0,i);
            for (String string : stringArray) {
                if(!string.contains(subString)){
                    if(i==0){
                        return "-1";
                    }
                    else{
                        return subString;
                    }
                }
            }
        }
        return subString;
    }

    public static void main(String[] args) {
        String[] stringArray = {"geeksforgeeks", "geeks", "geek",
            "geezer"};
        System.out.println(new StringControl().longestCommonPrefix(stringArray));
    }
}
