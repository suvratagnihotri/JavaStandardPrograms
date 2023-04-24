package com.java.StandardPrograms;

public class DistinctSubString {
    public boolean isDistinct(String string,int i ,int j){
        boolean boolArray[] = new boolean[26];

        for(int k = i; k<=j; k++){
            if(boolArray[string.charAt(k)-'a']==true){
                return false;
            }

            boolArray[string.charAt(k)-'a'] = true;
        }
        return true;
    }
    public String getDistinctSubString(String givenString){

        String distinctSubString = "";
        int result = 0;

        for(int i = 0; i<givenString.length(); i++){
            for(int j = i; j<givenString.length(); j++){
                if(isDistinct(givenString, i, j) && (j-i+1)>result){
                    result = Math.max(result,j-i+1);
                    distinctSubString = givenString.substring(i, j+1);
                }
            }
        }
        return distinctSubString;
    }

    public static void main(String[] args) {
        String string = "abcdefgabcdefg";
        System.out.println(new DistinctSubString().getDistinctSubString(string));
    }
}
