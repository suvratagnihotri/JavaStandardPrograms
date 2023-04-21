package com.java.StandardPrograms;

public class RomanToInteger {
    public int value(char character){
        switch (character) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default :
                return -1;
        }
    }
    int romanToDecimal(String str)
    {
        int result = 0;
        for(int i =0; i<str.length(); i++){
            int char1 = value(str.charAt(i));

            if(i+1<str.length()){
                int char2 = value(str.charAt(i+1));

                if(char1>=char2){
                    result = result+char1;
                }

                else{
                    result = result + char2-char1;
                    i++;
                }
            }
            else{
                result = result + char1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new RomanToInteger().romanToDecimal("IX"));
    }
}
