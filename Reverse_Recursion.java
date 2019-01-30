package com.practice;

/**
 * @author Karishma Anand
 * This Java program is used to reverse a string using recursion
 */
public class Reverse_Recursion {

	public static void main(String[] args) {
		
		String original = "Palindrome";
		stringReverse(original);
	}
	
	public static void stringReverse(String str) {
		if (str==null || str.length()==0) {
			System.out.println(str);
		} else {
            System.out.print(str.charAt(str.length()-1)); 
            stringReverse(str.substring(0,str.length()-1));
		}
	}
}