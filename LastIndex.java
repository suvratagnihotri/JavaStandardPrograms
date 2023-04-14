package com.java.StandardPrograms;


// Given a string S consisting only '0's and '1's,  find the last index of the '1' present in it.
public class LastIndex {
    public int getIndexOf1(String givenString){
        int indexOf1 = -1;
        for(int i = 0; i<givenString.length();i++){
            if(givenString.charAt(i)=='1'){
                indexOf1=i;
            }
        }
        return indexOf1;
    }

    public static void main(String[] args) {
        String givenString = "00001";
        System.out.println(new LastIndex().getIndexOf1(givenString));
    }
}
