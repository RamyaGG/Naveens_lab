package javaInterviewQuestions;

import java.util.Arrays;

//Write a program to sort a string.

public class SortAString {

	public static void main(String[] args) {
		String s ="unconditionalscope";
		char arr[]= s.toCharArray();
		
		Arrays.sort(arr);
		
		String str = new String(arr);
		System.out.println(str);
		
		String sr = "ramya123";
		sr = sr.replaceAll("ram", "som"); // this will not take character value replacement
		System.out.println(sr);
		sr= sr.replace('s', 'r'); // this will not take regular exp
		System.out.println(sr);
		

	}

}
