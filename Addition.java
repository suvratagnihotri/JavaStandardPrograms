package com.java.StandardPrograms;

import java.util.Scanner;

public class Addition {
    public Integer addNumbers(String commaSeparatedNumbers){
        Integer sumOfNumbers = 0;
        for (String split : commaSeparatedNumbers.split(",")) {
            sumOfNumbers = sumOfNumbers + Integer.parseInt(split.trim());
        };
        return sumOfNumbers;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to add, by separating them by comma (,)");
        String commaSeapratedNumbers = sc.next();
        sc.close();
        System.out.println("The sum is : "+ new Addition().addNumbers(commaSeapratedNumbers));
    }
}
