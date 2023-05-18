package com.java.StandardPrograms;

public class ParentisisChecker {
    public boolean isBalanced(String givenString){
        int countSmallBracket = 0; int countBigBracket = 0;int countCurleyBracket = 0;
        for(int i =0; i<givenString.length(); i++){
            switch (givenString.charAt(i)){
                case '(':
                    countSmallBracket ++;
                    break;
                case ')':
                    countSmallBracket --;
                    break;
                case '{':
                    countCurleyBracket ++;
                    break;
                case '}':
                    countCurleyBracket --;
                    break;
                case '[':
                    countBigBracket ++;
                    break;
                case ']':
                    countBigBracket --;
                    break;
            }

        }
        if(countSmallBracket==countCurleyBracket && countCurleyBracket==countBigBracket && countBigBracket==0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(new ParentisisChecker().isBalanced("{{{{{)))))}}}}}"));
    }
}
