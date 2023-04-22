package com.java.StandardPrograms;

public class RemoveDuplicates {
    public String removeDiuplicatesFromString(String string){
        StringBuilder sb = new StringBuilder(string);
        String newString = "";
        for(int i = 0; i<sb.length(); i++){
            for(int j= 0; j<sb.length(); j++){
                if(i!=j){
                    if(sb.charAt(i)==sb.charAt(j)){

                        if(i>j){
                            sb.deleteCharAt(i);
                        }
                        else{
                            sb.deleteCharAt(j);
                        }
                    }
                }
            }
        }
        newString = sb.toString();
        return newString;
    }

    public static void main(String[] args) {
        System.out.println(new RemoveDuplicates().removeDiuplicatesFromString("zvvo"));
    }
}
