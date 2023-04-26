package com.java.StandardPrograms;

public class StringOccurence {
    public int getSubStringOccurence(String mainString, String subString){
        if(mainString.contains(subString)){
            for(int i = 0;i<mainString.length()-subString.length();i++){
                if(mainString.charAt(i)==subString.charAt(0)){
                    String newString = mainString.substring(i, i+subString.length());
                    if(newString.equals(subString)){
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new StringOccurence().getSubStringOccurence("geeksforgeeks", "for"));
    }
}
