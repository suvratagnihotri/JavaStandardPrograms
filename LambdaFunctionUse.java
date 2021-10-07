package com.java.StandardPrograms;

import java.util.ArrayList;
import java.util.List;

//Program to use Lambda Expression
interface Addable{
	int add(int a,int b);  
}

public class LambdaFunctionUse {

	public static void main(String[] args) {
		Addable ad1 = (number,num2) -> (number+num2);
		System.out.println(ad1.add(0, 5));
		
		 Addable ad2=(int a,int b)->{  
             return (a+b);   
             };  
             System.out.println(ad2.add(100,200)); 
             
             List<String> list=new ArrayList<String>();  
             list.add("ankit");  
             list.add("mayank");  
             list.add("irfan");  
             list.add("jai");  
               
             list.forEach(  
                 (n)->System.out.println(n) 
             );  

	}

}
