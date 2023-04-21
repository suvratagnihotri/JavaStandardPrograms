package com.java.StandardPrograms;

public class AnagramStrings {
    public boolean isStringsAnagram(String string1, String string2){
        if(string1.length()!=string2.length()){
            return false;
        }
        boolean isCharacter = false;
        for(int i =0; i<string1.length(); i++){
            for(int j = 0; j<string2.length(); j++){
                if(string1.charAt(i) == string2.charAt(j)){
                    isCharacter = true;
                }
            }
            if(isCharacter == false){
                return false;
            }
            isCharacter = false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new AnagramStrings().isStringsAnagram("geeksforgeeks", "forgeessgeess"));
    }
}
