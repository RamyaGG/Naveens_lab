package javaInterviewQuestions;

import java.util.Arrays;

//Write a program to sort a string.

public class SortAString {

	public static void main(String[] args) {
		String s ="unconditionalscope";
		char arr[]= s.toCharArray();
		
		String s1="0101010101020210210221000122101021";
		char arr1[]= s1.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr);
		
		String str = new String(arr);
		System.out.println(str);
		
		String str1 = new String(arr1);
		System.out.println(str1); //0000000000000011111111111122222222
		
		String sr = "ramya123";
		sr = sr.replaceAll("ram", "som"); // this will not take character value replacement
		System.out.println(sr);
		sr= sr.replace('s', 'r'); // this will not take regular exp
		System.out.println(sr);
		

	}

}
