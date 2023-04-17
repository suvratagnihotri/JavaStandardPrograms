package com.java.StandardPrograms;

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

    public static void main(String[] args) {
        String givenString = "abc";
        System.out.println(new StringControl().getLongestPalindromeSubString(givenString));
    }
}
